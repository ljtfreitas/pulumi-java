// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SshPublicKeyResponse {
    /**
     * SSH public key certificate used to authenticate with the VM through ssh. The key needs to be at least 2048-bit and in ssh-rsa format. <br><br> For creating ssh keys, see [Create SSH keys on Linux and Mac for Linux VMs in Azure]https://docs.microsoft.com/azure/virtual-machines/linux/create-ssh-keys-detailed).
     * 
     */
    private final @Nullable String keyData;
    /**
     * Specifies the full path on the created VM where ssh public key is stored. If the file already exists, the specified key is appended to the file. Example: /home/user/.ssh/authorized_keys
     * 
     */
    private final @Nullable String path;

    @OutputCustomType.Constructor({"keyData","path"})
    private SshPublicKeyResponse(
        @Nullable String keyData,
        @Nullable String path) {
        this.keyData = keyData;
        this.path = path;
    }

    /**
     * SSH public key certificate used to authenticate with the VM through ssh. The key needs to be at least 2048-bit and in ssh-rsa format. <br><br> For creating ssh keys, see [Create SSH keys on Linux and Mac for Linux VMs in Azure]https://docs.microsoft.com/azure/virtual-machines/linux/create-ssh-keys-detailed).
     * 
     */
    public Optional<String> getKeyData() {
        return Optional.ofNullable(this.keyData);
    }
    /**
     * Specifies the full path on the created VM where ssh public key is stored. If the file already exists, the specified key is appended to the file. Example: /home/user/.ssh/authorized_keys
     * 
     */
    public Optional<String> getPath() {
        return Optional.ofNullable(this.path);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SshPublicKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keyData;
        private @Nullable String path;

        public Builder() {
    	      // Empty
        }

        public Builder(SshPublicKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyData = defaults.keyData;
    	      this.path = defaults.path;
        }

        public Builder setKeyData(@Nullable String keyData) {
            this.keyData = keyData;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = path;
            return this;
        }
        public SshPublicKeyResponse build() {
            return new SshPublicKeyResponse(keyData, path);
        }
    }
}
