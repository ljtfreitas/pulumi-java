// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.SourceVaultResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Key Vault Key Url and vault id of KeK, KeK is optional and when provided is used to unwrap the encryptionKey
 * 
 */
public final class KeyVaultAndKeyReferenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final KeyVaultAndKeyReferenceResponse Empty = new KeyVaultAndKeyReferenceResponse();

    /**
     * Url pointing to a key or secret in KeyVault
     * 
     */
    @InputImport(name="keyUrl", required=true)
    private final String keyUrl;

    public String getKeyUrl() {
        return this.keyUrl;
    }

    /**
     * Resource id of the KeyVault containing the key or secret
     * 
     */
    @InputImport(name="sourceVault", required=true)
    private final SourceVaultResponse sourceVault;

    public SourceVaultResponse getSourceVault() {
        return this.sourceVault;
    }

    public KeyVaultAndKeyReferenceResponse(
        String keyUrl,
        SourceVaultResponse sourceVault) {
        this.keyUrl = Objects.requireNonNull(keyUrl, "expected parameter 'keyUrl' to be non-null");
        this.sourceVault = Objects.requireNonNull(sourceVault, "expected parameter 'sourceVault' to be non-null");
    }

    private KeyVaultAndKeyReferenceResponse() {
        this.keyUrl = null;
        this.sourceVault = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultAndKeyReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String keyUrl;
        private SourceVaultResponse sourceVault;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultAndKeyReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyUrl = defaults.keyUrl;
    	      this.sourceVault = defaults.sourceVault;
        }

        public Builder setKeyUrl(String keyUrl) {
            this.keyUrl = Objects.requireNonNull(keyUrl);
            return this;
        }

        public Builder setSourceVault(SourceVaultResponse sourceVault) {
            this.sourceVault = Objects.requireNonNull(sourceVault);
            return this;
        }

        public KeyVaultAndKeyReferenceResponse build() {
            return new KeyVaultAndKeyReferenceResponse(keyUrl, sourceVault);
        }
    }
}
