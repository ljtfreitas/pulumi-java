// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies a RSA key for token validation
 * 
 */
public final class ContentKeyPolicyRsaTokenKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContentKeyPolicyRsaTokenKeyArgs Empty = new ContentKeyPolicyRsaTokenKeyArgs();

    /**
     * The RSA Parameter exponent
     * 
     */
    @InputImport(name="exponent", required=true)
    private final Input<String> exponent;

    public Input<String> getExponent() {
        return this.exponent;
    }

    /**
     * The RSA Parameter modulus
     * 
     */
    @InputImport(name="modulus", required=true)
    private final Input<String> modulus;

    public Input<String> getModulus() {
        return this.modulus;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.ContentKeyPolicyRsaTokenKey'.
     * 
     */
    @InputImport(name="odataType", required=true)
    private final Input<String> odataType;

    public Input<String> getOdataType() {
        return this.odataType;
    }

    public ContentKeyPolicyRsaTokenKeyArgs(
        Input<String> exponent,
        Input<String> modulus,
        Input<String> odataType) {
        this.exponent = Objects.requireNonNull(exponent, "expected parameter 'exponent' to be non-null");
        this.modulus = Objects.requireNonNull(modulus, "expected parameter 'modulus' to be non-null");
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
    }

    private ContentKeyPolicyRsaTokenKeyArgs() {
        this.exponent = Input.empty();
        this.modulus = Input.empty();
        this.odataType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentKeyPolicyRsaTokenKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> exponent;
        private Input<String> modulus;
        private Input<String> odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentKeyPolicyRsaTokenKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exponent = defaults.exponent;
    	      this.modulus = defaults.modulus;
    	      this.odataType = defaults.odataType;
        }

        public Builder setExponent(Input<String> exponent) {
            this.exponent = Objects.requireNonNull(exponent);
            return this;
        }

        public Builder setExponent(String exponent) {
            this.exponent = Input.of(Objects.requireNonNull(exponent));
            return this;
        }

        public Builder setModulus(Input<String> modulus) {
            this.modulus = Objects.requireNonNull(modulus);
            return this;
        }

        public Builder setModulus(String modulus) {
            this.modulus = Input.of(Objects.requireNonNull(modulus));
            return this;
        }

        public Builder setOdataType(Input<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Input.of(Objects.requireNonNull(odataType));
            return this;
        }

        public ContentKeyPolicyRsaTokenKeyArgs build() {
            return new ContentKeyPolicyRsaTokenKeyArgs(exponent, modulus, odataType);
        }
    }
}
