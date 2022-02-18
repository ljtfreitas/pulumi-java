// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagecache.inputs;

import io.pulumi.azurenative.storagecache.inputs.KeyVaultKeyReferenceSourceVaultArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Describes a reference to Key Vault Key.
 * 
 */
public final class KeyVaultKeyReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeyVaultKeyReferenceArgs Empty = new KeyVaultKeyReferenceArgs();

    /**
     * The URL referencing a key encryption key in Key Vault.
     * 
     */
    @InputImport(name="keyUrl", required=true)
    private final Input<String> keyUrl;

    public Input<String> getKeyUrl() {
        return this.keyUrl;
    }

    /**
     * Describes a resource Id to source Key Vault.
     * 
     */
    @InputImport(name="sourceVault", required=true)
    private final Input<KeyVaultKeyReferenceSourceVaultArgs> sourceVault;

    public Input<KeyVaultKeyReferenceSourceVaultArgs> getSourceVault() {
        return this.sourceVault;
    }

    public KeyVaultKeyReferenceArgs(
        Input<String> keyUrl,
        Input<KeyVaultKeyReferenceSourceVaultArgs> sourceVault) {
        this.keyUrl = Objects.requireNonNull(keyUrl, "expected parameter 'keyUrl' to be non-null");
        this.sourceVault = Objects.requireNonNull(sourceVault, "expected parameter 'sourceVault' to be non-null");
    }

    private KeyVaultKeyReferenceArgs() {
        this.keyUrl = Input.empty();
        this.sourceVault = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultKeyReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> keyUrl;
        private Input<KeyVaultKeyReferenceSourceVaultArgs> sourceVault;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultKeyReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyUrl = defaults.keyUrl;
    	      this.sourceVault = defaults.sourceVault;
        }

        public Builder setKeyUrl(Input<String> keyUrl) {
            this.keyUrl = Objects.requireNonNull(keyUrl);
            return this;
        }

        public Builder setKeyUrl(String keyUrl) {
            this.keyUrl = Input.of(Objects.requireNonNull(keyUrl));
            return this;
        }

        public Builder setSourceVault(Input<KeyVaultKeyReferenceSourceVaultArgs> sourceVault) {
            this.sourceVault = Objects.requireNonNull(sourceVault);
            return this;
        }

        public Builder setSourceVault(KeyVaultKeyReferenceSourceVaultArgs sourceVault) {
            this.sourceVault = Input.of(Objects.requireNonNull(sourceVault));
            return this;
        }

        public KeyVaultKeyReferenceArgs build() {
            return new KeyVaultKeyReferenceArgs(keyUrl, sourceVault);
        }
    }
}
