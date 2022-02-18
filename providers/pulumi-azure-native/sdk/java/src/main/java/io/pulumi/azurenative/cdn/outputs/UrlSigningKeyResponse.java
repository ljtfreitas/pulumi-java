// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.azurenative.cdn.outputs.KeyVaultSigningKeyParametersResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class UrlSigningKeyResponse {
    /**
     * Defines the customer defined key Id. This id will exist in the incoming request to indicate the key used to form the hash.
     * 
     */
    private final String keyId;
    /**
     * Defines the parameters for using customer key vault for Url Signing Key.
     * 
     */
    private final KeyVaultSigningKeyParametersResponse keySourceParameters;

    @OutputCustomType.Constructor({"keyId","keySourceParameters"})
    private UrlSigningKeyResponse(
        String keyId,
        KeyVaultSigningKeyParametersResponse keySourceParameters) {
        this.keyId = Objects.requireNonNull(keyId);
        this.keySourceParameters = Objects.requireNonNull(keySourceParameters);
    }

    /**
     * Defines the customer defined key Id. This id will exist in the incoming request to indicate the key used to form the hash.
     * 
     */
    public String getKeyId() {
        return this.keyId;
    }
    /**
     * Defines the parameters for using customer key vault for Url Signing Key.
     * 
     */
    public KeyVaultSigningKeyParametersResponse getKeySourceParameters() {
        return this.keySourceParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UrlSigningKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String keyId;
        private KeyVaultSigningKeyParametersResponse keySourceParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(UrlSigningKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyId = defaults.keyId;
    	      this.keySourceParameters = defaults.keySourceParameters;
        }

        public Builder setKeyId(String keyId) {
            this.keyId = Objects.requireNonNull(keyId);
            return this;
        }

        public Builder setKeySourceParameters(KeyVaultSigningKeyParametersResponse keySourceParameters) {
            this.keySourceParameters = Objects.requireNonNull(keySourceParameters);
            return this;
        }

        public UrlSigningKeyResponse build() {
            return new UrlSigningKeyResponse(keyId, keySourceParameters);
        }
    }
}
