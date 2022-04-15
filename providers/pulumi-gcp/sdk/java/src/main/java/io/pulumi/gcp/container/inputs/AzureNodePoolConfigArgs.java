// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.container.inputs.AzureNodePoolConfigRootVolumeArgs;
import io.pulumi.gcp.container.inputs.AzureNodePoolConfigSshConfigArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AzureNodePoolConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureNodePoolConfigArgs Empty = new AzureNodePoolConfigArgs();

    /**
     * Optional. Configuration related to the root volume provisioned for each node pool machine. When unspecified, it defaults to a 32-GiB Azure Disk.
     * 
     */
    @Import(name="rootVolume")
      private final @Nullable Output<AzureNodePoolConfigRootVolumeArgs> rootVolume;

    public Output<AzureNodePoolConfigRootVolumeArgs> rootVolume() {
        return this.rootVolume == null ? Codegen.empty() : this.rootVolume;
    }

    /**
     * Required. SSH configuration for how to access the node pool machines.
     * 
     */
    @Import(name="sshConfig", required=true)
      private final Output<AzureNodePoolConfigSshConfigArgs> sshConfig;

    public Output<AzureNodePoolConfigSshConfigArgs> sshConfig() {
        return this.sshConfig;
    }

    /**
     * Optional. A set of tags to apply to all underlying Azure resources for this node pool. This currently only includes Virtual Machine Scale Sets. Specify at most 50 pairs containing alphanumerics, spaces, and symbols (.+-=_:@/). Keys can be up to 127 Unicode characters. Values can be up to 255 Unicode characters.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * Optional. The Azure VM size name. Example: `Standard_DS2_v2`. See (/anthos/clusters/docs/azure/reference/supported-vms) for options. When unspecified, it defaults to `Standard_DS2_v2`.
     * 
     */
    @Import(name="vmSize")
      private final @Nullable Output<String> vmSize;

    public Output<String> vmSize() {
        return this.vmSize == null ? Codegen.empty() : this.vmSize;
    }

    public AzureNodePoolConfigArgs(
        @Nullable Output<AzureNodePoolConfigRootVolumeArgs> rootVolume,
        Output<AzureNodePoolConfigSshConfigArgs> sshConfig,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> vmSize) {
        this.rootVolume = rootVolume;
        this.sshConfig = Objects.requireNonNull(sshConfig, "expected parameter 'sshConfig' to be non-null");
        this.tags = tags;
        this.vmSize = vmSize;
    }

    private AzureNodePoolConfigArgs() {
        this.rootVolume = Codegen.empty();
        this.sshConfig = Codegen.empty();
        this.tags = Codegen.empty();
        this.vmSize = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureNodePoolConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AzureNodePoolConfigRootVolumeArgs> rootVolume;
        private Output<AzureNodePoolConfigSshConfigArgs> sshConfig;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> vmSize;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureNodePoolConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rootVolume = defaults.rootVolume;
    	      this.sshConfig = defaults.sshConfig;
    	      this.tags = defaults.tags;
    	      this.vmSize = defaults.vmSize;
        }

        public Builder rootVolume(@Nullable Output<AzureNodePoolConfigRootVolumeArgs> rootVolume) {
            this.rootVolume = rootVolume;
            return this;
        }
        public Builder rootVolume(@Nullable AzureNodePoolConfigRootVolumeArgs rootVolume) {
            this.rootVolume = Codegen.ofNullable(rootVolume);
            return this;
        }
        public Builder sshConfig(Output<AzureNodePoolConfigSshConfigArgs> sshConfig) {
            this.sshConfig = Objects.requireNonNull(sshConfig);
            return this;
        }
        public Builder sshConfig(AzureNodePoolConfigSshConfigArgs sshConfig) {
            this.sshConfig = Output.of(Objects.requireNonNull(sshConfig));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder vmSize(@Nullable Output<String> vmSize) {
            this.vmSize = vmSize;
            return this;
        }
        public Builder vmSize(@Nullable String vmSize) {
            this.vmSize = Codegen.ofNullable(vmSize);
            return this;
        }        public AzureNodePoolConfigArgs build() {
            return new AzureNodePoolConfigArgs(rootVolume, sshConfig, tags, vmSize);
        }
    }
}
