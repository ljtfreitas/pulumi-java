// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.SourceVaultResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class KeyVaultAndSecretReferenceResponse {
    /**
     * Url pointing to a key or secret in KeyVault
     * 
     */
    private final String secretUrl;
    /**
     * Resource id of the KeyVault containing the key or secret
     * 
     */
    private final SourceVaultResponse sourceVault;

    @OutputCustomType.Constructor({"secretUrl","sourceVault"})
    private KeyVaultAndSecretReferenceResponse(
        String secretUrl,
        SourceVaultResponse sourceVault) {
        this.secretUrl = Objects.requireNonNull(secretUrl);
        this.sourceVault = Objects.requireNonNull(sourceVault);
    }

    /**
     * Url pointing to a key or secret in KeyVault
     * 
     */
    public String getSecretUrl() {
        return this.secretUrl;
    }
    /**
     * Resource id of the KeyVault containing the key or secret
     * 
     */
    public SourceVaultResponse getSourceVault() {
        return this.sourceVault;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultAndSecretReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String secretUrl;
        private SourceVaultResponse sourceVault;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultAndSecretReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secretUrl = defaults.secretUrl;
    	      this.sourceVault = defaults.sourceVault;
        }

        public Builder setSecretUrl(String secretUrl) {
            this.secretUrl = Objects.requireNonNull(secretUrl);
            return this;
        }

        public Builder setSourceVault(SourceVaultResponse sourceVault) {
            this.sourceVault = Objects.requireNonNull(sourceVault);
            return this;
        }
        public KeyVaultAndSecretReferenceResponse build() {
            return new KeyVaultAndSecretReferenceResponse(secretUrl, sourceVault);
        }
    }
}
