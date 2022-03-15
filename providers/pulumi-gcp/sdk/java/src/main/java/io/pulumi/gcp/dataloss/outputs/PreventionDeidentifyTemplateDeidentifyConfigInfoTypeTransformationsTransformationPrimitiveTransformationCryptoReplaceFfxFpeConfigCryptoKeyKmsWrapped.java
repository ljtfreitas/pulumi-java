// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyKmsWrapped {
    /**
     * The resource name of the KMS CryptoKey to use for unwrapping.
     * 
     */
    private final String cryptoKeyName;
    /**
     * The wrapped data crypto key.
     * A base64-encoded string.
     * 
     */
    private final String wrappedKey;

    @CustomType.Constructor
    private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyKmsWrapped(
        @CustomType.Parameter("cryptoKeyName") String cryptoKeyName,
        @CustomType.Parameter("wrappedKey") String wrappedKey) {
        this.cryptoKeyName = cryptoKeyName;
        this.wrappedKey = wrappedKey;
    }

    /**
     * The resource name of the KMS CryptoKey to use for unwrapping.
     * 
    */
    public String getCryptoKeyName() {
        return this.cryptoKeyName;
    }
    /**
     * The wrapped data crypto key.
     * A base64-encoded string.
     * 
    */
    public String getWrappedKey() {
        return this.wrappedKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyKmsWrapped defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cryptoKeyName;
        private String wrappedKey;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyKmsWrapped defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cryptoKeyName = defaults.cryptoKeyName;
    	      this.wrappedKey = defaults.wrappedKey;
        }

        public Builder cryptoKeyName(String cryptoKeyName) {
            this.cryptoKeyName = Objects.requireNonNull(cryptoKeyName);
            return this;
        }

        public Builder wrappedKey(String wrappedKey) {
            this.wrappedKey = Objects.requireNonNull(wrappedKey);
            return this;
        }
        public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyKmsWrapped build() {
            return new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyKmsWrapped(cryptoKeyName, wrappedKey);
        }
    }
}
