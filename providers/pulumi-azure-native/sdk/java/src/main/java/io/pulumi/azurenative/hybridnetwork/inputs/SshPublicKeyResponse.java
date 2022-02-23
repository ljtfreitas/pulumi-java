// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridnetwork.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Contains information about SSH certificate public key and the path on the Linux VM where the public key is placed.
 * 
 */
public final class SshPublicKeyResponse extends io.pulumi.resources.InvokeArgs {

    public static final SshPublicKeyResponse Empty = new SshPublicKeyResponse();

    /**
     * SSH public key certificate used to authenticate with the VM through ssh. The key needs to be at least 2048-bit and in ssh-rsa format. <br><br> For creating ssh keys, see [Create SSH keys on Linux and Mac for Linux VMs in Azure](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-mac-create-ssh-keys?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json).
     * 
     */
    @InputImport(name="keyData")
        private final @Nullable String keyData;

    public Optional<String> getKeyData() {
        return this.keyData == null ? Optional.empty() : Optional.ofNullable(this.keyData);
    }

    /**
     * Specifies the full path on the created VM where ssh public key is stored. If the file already exists, the specified key is appended to the file. Example: /home/user/.ssh/authorized_keys
     * 
     */
    @InputImport(name="path")
        private final @Nullable String path;

    public Optional<String> getPath() {
        return this.path == null ? Optional.empty() : Optional.ofNullable(this.path);
    }

    public SshPublicKeyResponse(
        @Nullable String keyData,
        @Nullable String path) {
        this.keyData = keyData;
        this.path = path;
    }

    private SshPublicKeyResponse() {
        this.keyData = null;
        this.path = null;
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
