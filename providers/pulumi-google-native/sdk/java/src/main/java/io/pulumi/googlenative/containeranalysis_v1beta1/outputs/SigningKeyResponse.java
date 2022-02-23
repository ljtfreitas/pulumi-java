// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SigningKeyResponse {
    /**
     * key_id is an identifier for the signing key.
     * 
     */
    private final String keyId;
    /**
     * This field contains the corresponding signature scheme. Eg: "rsassa-pss-sha256".
     * 
     */
    private final String keyScheme;
    /**
     * This field identifies the specific signing method. Eg: "rsa", "ed25519", and "ecdsa".
     * 
     */
    private final String keyType;
    /**
     * This field contains the actual public key.
     * 
     */
    private final String publicKeyValue;

    @OutputCustomType.Constructor({"keyId","keyScheme","keyType","publicKeyValue"})
    private SigningKeyResponse(
        String keyId,
        String keyScheme,
        String keyType,
        String publicKeyValue) {
        this.keyId = Objects.requireNonNull(keyId);
        this.keyScheme = Objects.requireNonNull(keyScheme);
        this.keyType = Objects.requireNonNull(keyType);
        this.publicKeyValue = Objects.requireNonNull(publicKeyValue);
    }

    /**
     * key_id is an identifier for the signing key.
     * 
     */
    public String getKeyId() {
        return this.keyId;
    }
    /**
     * This field contains the corresponding signature scheme. Eg: "rsassa-pss-sha256".
     * 
     */
    public String getKeyScheme() {
        return this.keyScheme;
    }
    /**
     * This field identifies the specific signing method. Eg: "rsa", "ed25519", and "ecdsa".
     * 
     */
    public String getKeyType() {
        return this.keyType;
    }
    /**
     * This field contains the actual public key.
     * 
     */
    public String getPublicKeyValue() {
        return this.publicKeyValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SigningKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String keyId;
        private String keyScheme;
        private String keyType;
        private String publicKeyValue;

        public Builder() {
    	      // Empty
        }

        public Builder(SigningKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyId = defaults.keyId;
    	      this.keyScheme = defaults.keyScheme;
    	      this.keyType = defaults.keyType;
    	      this.publicKeyValue = defaults.publicKeyValue;
        }

        public Builder setKeyId(String keyId) {
            this.keyId = Objects.requireNonNull(keyId);
            return this;
        }

        public Builder setKeyScheme(String keyScheme) {
            this.keyScheme = Objects.requireNonNull(keyScheme);
            return this;
        }

        public Builder setKeyType(String keyType) {
            this.keyType = Objects.requireNonNull(keyType);
            return this;
        }

        public Builder setPublicKeyValue(String publicKeyValue) {
            this.publicKeyValue = Objects.requireNonNull(publicKeyValue);
            return this;
        }
        public SigningKeyResponse build() {
            return new SigningKeyResponse(keyId, keyScheme, keyType, publicKeyValue);
        }
    }
}
