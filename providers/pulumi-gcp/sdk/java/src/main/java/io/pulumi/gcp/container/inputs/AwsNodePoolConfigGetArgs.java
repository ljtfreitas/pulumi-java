// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.container.inputs.AwsNodePoolConfigConfigEncryptionGetArgs;
import io.pulumi.gcp.container.inputs.AwsNodePoolConfigRootVolumeGetArgs;
import io.pulumi.gcp.container.inputs.AwsNodePoolConfigSshConfigGetArgs;
import io.pulumi.gcp.container.inputs.AwsNodePoolConfigTaintGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AwsNodePoolConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AwsNodePoolConfigGetArgs Empty = new AwsNodePoolConfigGetArgs();

    /**
     * Required. The ARN of the AWS KMS key used to encrypt node pool configuration.
     * 
     */
    @Import(name="configEncryption", required=true)
      private final Output<AwsNodePoolConfigConfigEncryptionGetArgs> configEncryption;

    public Output<AwsNodePoolConfigConfigEncryptionGetArgs> getConfigEncryption() {
        return this.configEncryption;
    }

    /**
     * Required. The name of the AWS IAM role assigned to nodes in the pool.
     * 
     */
    @Import(name="iamInstanceProfile", required=true)
      private final Output<String> iamInstanceProfile;

    public Output<String> getIamInstanceProfile() {
        return this.iamInstanceProfile;
    }

    /**
     * Optional. The AWS instance type. When unspecified, it defaults to `t3.medium`.
     * 
     */
    @Import(name="instanceType")
      private final @Nullable Output<String> instanceType;

    public Output<String> getInstanceType() {
        return this.instanceType == null ? Output.empty() : this.instanceType;
    }

    /**
     * Optional. The initial labels assigned to nodes of this node pool. An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    /**
     * Optional. Template for the root volume provisioned for node pool nodes. Volumes will be provisioned in the availability zone assigned to the node pool subnet. When unspecified, it defaults to 32 GiB with the GP2 volume type.
     * 
     */
    @Import(name="rootVolume")
      private final @Nullable Output<AwsNodePoolConfigRootVolumeGetArgs> rootVolume;

    public Output<AwsNodePoolConfigRootVolumeGetArgs> getRootVolume() {
        return this.rootVolume == null ? Output.empty() : this.rootVolume;
    }

    /**
     * Optional. The IDs of additional security groups to add to nodes in this pool. The manager will automatically create security groups with minimum rules needed for a functioning cluster.
     * 
     */
    @Import(name="securityGroupIds")
      private final @Nullable Output<List<String>> securityGroupIds;

    public Output<List<String>> getSecurityGroupIds() {
        return this.securityGroupIds == null ? Output.empty() : this.securityGroupIds;
    }

    /**
     * Optional. The SSH configuration.
     * 
     */
    @Import(name="sshConfig")
      private final @Nullable Output<AwsNodePoolConfigSshConfigGetArgs> sshConfig;

    public Output<AwsNodePoolConfigSshConfigGetArgs> getSshConfig() {
        return this.sshConfig == null ? Output.empty() : this.sshConfig;
    }

    /**
     * Optional. Key/value metadata to assign to each underlying AWS resource. Specify at most 50 pairs containing alphanumerics, spaces, and symbols (.+-=_:@/). Keys can be up to 127 Unicode characters. Values can be up to 255 Unicode characters.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * Optional. The initial taints assigned to nodes of this node pool.
     * 
     */
    @Import(name="taints")
      private final @Nullable Output<List<AwsNodePoolConfigTaintGetArgs>> taints;

    public Output<List<AwsNodePoolConfigTaintGetArgs>> getTaints() {
        return this.taints == null ? Output.empty() : this.taints;
    }

    public AwsNodePoolConfigGetArgs(
        Output<AwsNodePoolConfigConfigEncryptionGetArgs> configEncryption,
        Output<String> iamInstanceProfile,
        @Nullable Output<String> instanceType,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<AwsNodePoolConfigRootVolumeGetArgs> rootVolume,
        @Nullable Output<List<String>> securityGroupIds,
        @Nullable Output<AwsNodePoolConfigSshConfigGetArgs> sshConfig,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<List<AwsNodePoolConfigTaintGetArgs>> taints) {
        this.configEncryption = Objects.requireNonNull(configEncryption, "expected parameter 'configEncryption' to be non-null");
        this.iamInstanceProfile = Objects.requireNonNull(iamInstanceProfile, "expected parameter 'iamInstanceProfile' to be non-null");
        this.instanceType = instanceType;
        this.labels = labels;
        this.rootVolume = rootVolume;
        this.securityGroupIds = securityGroupIds;
        this.sshConfig = sshConfig;
        this.tags = tags;
        this.taints = taints;
    }

    private AwsNodePoolConfigGetArgs() {
        this.configEncryption = Output.empty();
        this.iamInstanceProfile = Output.empty();
        this.instanceType = Output.empty();
        this.labels = Output.empty();
        this.rootVolume = Output.empty();
        this.securityGroupIds = Output.empty();
        this.sshConfig = Output.empty();
        this.tags = Output.empty();
        this.taints = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsNodePoolConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<AwsNodePoolConfigConfigEncryptionGetArgs> configEncryption;
        private Output<String> iamInstanceProfile;
        private @Nullable Output<String> instanceType;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<AwsNodePoolConfigRootVolumeGetArgs> rootVolume;
        private @Nullable Output<List<String>> securityGroupIds;
        private @Nullable Output<AwsNodePoolConfigSshConfigGetArgs> sshConfig;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<List<AwsNodePoolConfigTaintGetArgs>> taints;

        public Builder() {
    	      // Empty
        }

        public Builder(AwsNodePoolConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configEncryption = defaults.configEncryption;
    	      this.iamInstanceProfile = defaults.iamInstanceProfile;
    	      this.instanceType = defaults.instanceType;
    	      this.labels = defaults.labels;
    	      this.rootVolume = defaults.rootVolume;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.sshConfig = defaults.sshConfig;
    	      this.tags = defaults.tags;
    	      this.taints = defaults.taints;
        }

        public Builder configEncryption(Output<AwsNodePoolConfigConfigEncryptionGetArgs> configEncryption) {
            this.configEncryption = Objects.requireNonNull(configEncryption);
            return this;
        }

        public Builder configEncryption(AwsNodePoolConfigConfigEncryptionGetArgs configEncryption) {
            this.configEncryption = Output.of(Objects.requireNonNull(configEncryption));
            return this;
        }

        public Builder iamInstanceProfile(Output<String> iamInstanceProfile) {
            this.iamInstanceProfile = Objects.requireNonNull(iamInstanceProfile);
            return this;
        }

        public Builder iamInstanceProfile(String iamInstanceProfile) {
            this.iamInstanceProfile = Output.of(Objects.requireNonNull(iamInstanceProfile));
            return this;
        }

        public Builder instanceType(@Nullable Output<String> instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        public Builder instanceType(@Nullable String instanceType) {
            this.instanceType = Output.ofNullable(instanceType);
            return this;
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }

        public Builder rootVolume(@Nullable Output<AwsNodePoolConfigRootVolumeGetArgs> rootVolume) {
            this.rootVolume = rootVolume;
            return this;
        }

        public Builder rootVolume(@Nullable AwsNodePoolConfigRootVolumeGetArgs rootVolume) {
            this.rootVolume = Output.ofNullable(rootVolume);
            return this;
        }

        public Builder securityGroupIds(@Nullable Output<List<String>> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        public Builder securityGroupIds(@Nullable List<String> securityGroupIds) {
            this.securityGroupIds = Output.ofNullable(securityGroupIds);
            return this;
        }

        public Builder sshConfig(@Nullable Output<AwsNodePoolConfigSshConfigGetArgs> sshConfig) {
            this.sshConfig = sshConfig;
            return this;
        }

        public Builder sshConfig(@Nullable AwsNodePoolConfigSshConfigGetArgs sshConfig) {
            this.sshConfig = Output.ofNullable(sshConfig);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder taints(@Nullable Output<List<AwsNodePoolConfigTaintGetArgs>> taints) {
            this.taints = taints;
            return this;
        }

        public Builder taints(@Nullable List<AwsNodePoolConfigTaintGetArgs> taints) {
            this.taints = Output.ofNullable(taints);
            return this;
        }
        public AwsNodePoolConfigGetArgs build() {
            return new AwsNodePoolConfigGetArgs(configEncryption, iamInstanceProfile, instanceType, labels, rootVolume, securityGroupIds, sshConfig, tags, taints);
        }
    }
}
