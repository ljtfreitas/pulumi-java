// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridnetwork.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Contains information about SSH certificate public key and the path on the Linux VM where the public key is placed.
 * 
 */
public final class SshPublicKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final SshPublicKeyArgs Empty = new SshPublicKeyArgs();

    /**
     * SSH public key certificate used to authenticate with the VM through ssh. The key needs to be at least 2048-bit and in ssh-rsa format. <br><br> For creating ssh keys, see [Create SSH keys on Linux and Mac for Linux VMs in Azure](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-linux-mac-create-ssh-keys?toc=%2fazure%2fvirtual-machines%2flinux%2ftoc.json).
     * 
     */
    @Import(name="keyData")
      private final @Nullable Output<String> keyData;

    public Output<String> getKeyData() {
        return this.keyData == null ? Output.empty() : this.keyData;
    }

    /**
     * Specifies the full path on the created VM where ssh public key is stored. If the file already exists, the specified key is appended to the file. Example: /home/user/.ssh/authorized_keys
     * 
     */
    @Import(name="path")
      private final @Nullable Output<String> path;

    public Output<String> getPath() {
        return this.path == null ? Output.empty() : this.path;
    }

    public SshPublicKeyArgs(
        @Nullable Output<String> keyData,
        @Nullable Output<String> path) {
        this.keyData = keyData;
        this.path = path;
    }

    private SshPublicKeyArgs() {
        this.keyData = Output.empty();
        this.path = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SshPublicKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> keyData;
        private @Nullable Output<String> path;

        public Builder() {
    	      // Empty
        }

        public Builder(SshPublicKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyData = defaults.keyData;
    	      this.path = defaults.path;
        }

        public Builder keyData(@Nullable Output<String> keyData) {
            this.keyData = keyData;
            return this;
        }

        public Builder keyData(@Nullable String keyData) {
            this.keyData = Output.ofNullable(keyData);
            return this;
        }

        public Builder path(@Nullable Output<String> path) {
            this.path = path;
            return this;
        }

        public Builder path(@Nullable String path) {
            this.path = Output.ofNullable(path);
            return this;
        }
        public SshPublicKeyArgs build() {
            return new SshPublicKeyArgs(keyData, path);
        }
    }
}
