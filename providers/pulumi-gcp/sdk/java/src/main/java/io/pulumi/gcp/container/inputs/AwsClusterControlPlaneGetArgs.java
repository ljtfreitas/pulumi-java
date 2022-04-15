// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.container.inputs.AwsClusterControlPlaneAwsServicesAuthenticationGetArgs;
import io.pulumi.gcp.container.inputs.AwsClusterControlPlaneConfigEncryptionGetArgs;
import io.pulumi.gcp.container.inputs.AwsClusterControlPlaneDatabaseEncryptionGetArgs;
import io.pulumi.gcp.container.inputs.AwsClusterControlPlaneMainVolumeGetArgs;
import io.pulumi.gcp.container.inputs.AwsClusterControlPlaneProxyConfigGetArgs;
import io.pulumi.gcp.container.inputs.AwsClusterControlPlaneRootVolumeGetArgs;
import io.pulumi.gcp.container.inputs.AwsClusterControlPlaneSshConfigGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AwsClusterControlPlaneGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AwsClusterControlPlaneGetArgs Empty = new AwsClusterControlPlaneGetArgs();

    /**
     * Required. Authentication configuration for management of AWS resources.
     * 
     */
    @Import(name="awsServicesAuthentication", required=true)
      private final Output<AwsClusterControlPlaneAwsServicesAuthenticationGetArgs> awsServicesAuthentication;

    public Output<AwsClusterControlPlaneAwsServicesAuthenticationGetArgs> awsServicesAuthentication() {
        return this.awsServicesAuthentication;
    }

    /**
     * Required. The ARN of the AWS KMS key used to encrypt cluster configuration.
     * 
     */
    @Import(name="configEncryption", required=true)
      private final Output<AwsClusterControlPlaneConfigEncryptionGetArgs> configEncryption;

    public Output<AwsClusterControlPlaneConfigEncryptionGetArgs> configEncryption() {
        return this.configEncryption;
    }

    /**
     * Required. The ARN of the AWS KMS key used to encrypt cluster secrets.
     * 
     */
    @Import(name="databaseEncryption", required=true)
      private final Output<AwsClusterControlPlaneDatabaseEncryptionGetArgs> databaseEncryption;

    public Output<AwsClusterControlPlaneDatabaseEncryptionGetArgs> databaseEncryption() {
        return this.databaseEncryption;
    }

    /**
     * Required. The name of the AWS IAM instance pofile to assign to each control plane replica.
     * 
     */
    @Import(name="iamInstanceProfile", required=true)
      private final Output<String> iamInstanceProfile;

    public Output<String> iamInstanceProfile() {
        return this.iamInstanceProfile;
    }

    /**
     * Optional. The AWS instance type. When unspecified, it defaults to `t3.medium`.
     * 
     */
    @Import(name="instanceType")
      private final @Nullable Output<String> instanceType;

    public Output<String> instanceType() {
        return this.instanceType == null ? Codegen.empty() : this.instanceType;
    }

    /**
     * Optional. Configuration related to the main volume provisioned for each control plane replica. The main volume is in charge of storing all of the cluster's etcd state. Volumes will be provisioned in the availability zone associated with the corresponding subnet. When unspecified, it defaults to 8 GiB with the GP2 volume type.
     * 
     */
    @Import(name="mainVolume")
      private final @Nullable Output<AwsClusterControlPlaneMainVolumeGetArgs> mainVolume;

    public Output<AwsClusterControlPlaneMainVolumeGetArgs> mainVolume() {
        return this.mainVolume == null ? Codegen.empty() : this.mainVolume;
    }

    /**
     * Proxy configuration for outbound HTTP(S) traffic.
     * 
     */
    @Import(name="proxyConfig")
      private final @Nullable Output<AwsClusterControlPlaneProxyConfigGetArgs> proxyConfig;

    public Output<AwsClusterControlPlaneProxyConfigGetArgs> proxyConfig() {
        return this.proxyConfig == null ? Codegen.empty() : this.proxyConfig;
    }

    /**
     * Optional. Configuration related to the root volume provisioned for each control plane replica. Volumes will be provisioned in the availability zone associated with the corresponding subnet. When unspecified, it defaults to 32 GiB with the GP2 volume type.
     * 
     */
    @Import(name="rootVolume")
      private final @Nullable Output<AwsClusterControlPlaneRootVolumeGetArgs> rootVolume;

    public Output<AwsClusterControlPlaneRootVolumeGetArgs> rootVolume() {
        return this.rootVolume == null ? Codegen.empty() : this.rootVolume;
    }

    /**
     * Optional. The IDs of additional security groups to add to control plane replicas. The Anthos Multi-Cloud API will automatically create and manage security groups with the minimum rules needed for a functioning cluster.
     * 
     */
    @Import(name="securityGroupIds")
      private final @Nullable Output<List<String>> securityGroupIds;

    public Output<List<String>> securityGroupIds() {
        return this.securityGroupIds == null ? Codegen.empty() : this.securityGroupIds;
    }

    /**
     * Optional. SSH configuration for how to access the underlying control plane machines.
     * 
     */
    @Import(name="sshConfig")
      private final @Nullable Output<AwsClusterControlPlaneSshConfigGetArgs> sshConfig;

    public Output<AwsClusterControlPlaneSshConfigGetArgs> sshConfig() {
        return this.sshConfig == null ? Codegen.empty() : this.sshConfig;
    }

    /**
     * Required. The list of subnets where control plane replicas will run. A replica will be provisioned on each subnet and up to three values can be provided. Each subnet must be in a different AWS Availability Zone (AZ).
     * 
     */
    @Import(name="subnetIds", required=true)
      private final Output<List<String>> subnetIds;

    public Output<List<String>> subnetIds() {
        return this.subnetIds;
    }

    /**
     * Optional. A set of AWS resource tags to propagate to all underlying managed AWS resources. Specify at most 50 pairs containing alphanumerics, spaces, and symbols (.+-=_:@/). Keys can be up to 127 Unicode characters. Values can be up to 255 Unicode characters.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * Required. The Kubernetes version to run on control plane replicas (e.g. `1.19.10-gke.1000`). You can list all supported versions on a given Google Cloud region by calling .
     * 
     */
    @Import(name="version", required=true)
      private final Output<String> version;

    public Output<String> version() {
        return this.version;
    }

    public AwsClusterControlPlaneGetArgs(
        Output<AwsClusterControlPlaneAwsServicesAuthenticationGetArgs> awsServicesAuthentication,
        Output<AwsClusterControlPlaneConfigEncryptionGetArgs> configEncryption,
        Output<AwsClusterControlPlaneDatabaseEncryptionGetArgs> databaseEncryption,
        Output<String> iamInstanceProfile,
        @Nullable Output<String> instanceType,
        @Nullable Output<AwsClusterControlPlaneMainVolumeGetArgs> mainVolume,
        @Nullable Output<AwsClusterControlPlaneProxyConfigGetArgs> proxyConfig,
        @Nullable Output<AwsClusterControlPlaneRootVolumeGetArgs> rootVolume,
        @Nullable Output<List<String>> securityGroupIds,
        @Nullable Output<AwsClusterControlPlaneSshConfigGetArgs> sshConfig,
        Output<List<String>> subnetIds,
        @Nullable Output<Map<String,String>> tags,
        Output<String> version) {
        this.awsServicesAuthentication = Objects.requireNonNull(awsServicesAuthentication, "expected parameter 'awsServicesAuthentication' to be non-null");
        this.configEncryption = Objects.requireNonNull(configEncryption, "expected parameter 'configEncryption' to be non-null");
        this.databaseEncryption = Objects.requireNonNull(databaseEncryption, "expected parameter 'databaseEncryption' to be non-null");
        this.iamInstanceProfile = Objects.requireNonNull(iamInstanceProfile, "expected parameter 'iamInstanceProfile' to be non-null");
        this.instanceType = instanceType;
        this.mainVolume = mainVolume;
        this.proxyConfig = proxyConfig;
        this.rootVolume = rootVolume;
        this.securityGroupIds = securityGroupIds;
        this.sshConfig = sshConfig;
        this.subnetIds = Objects.requireNonNull(subnetIds, "expected parameter 'subnetIds' to be non-null");
        this.tags = tags;
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private AwsClusterControlPlaneGetArgs() {
        this.awsServicesAuthentication = Codegen.empty();
        this.configEncryption = Codegen.empty();
        this.databaseEncryption = Codegen.empty();
        this.iamInstanceProfile = Codegen.empty();
        this.instanceType = Codegen.empty();
        this.mainVolume = Codegen.empty();
        this.proxyConfig = Codegen.empty();
        this.rootVolume = Codegen.empty();
        this.securityGroupIds = Codegen.empty();
        this.sshConfig = Codegen.empty();
        this.subnetIds = Codegen.empty();
        this.tags = Codegen.empty();
        this.version = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsClusterControlPlaneGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<AwsClusterControlPlaneAwsServicesAuthenticationGetArgs> awsServicesAuthentication;
        private Output<AwsClusterControlPlaneConfigEncryptionGetArgs> configEncryption;
        private Output<AwsClusterControlPlaneDatabaseEncryptionGetArgs> databaseEncryption;
        private Output<String> iamInstanceProfile;
        private @Nullable Output<String> instanceType;
        private @Nullable Output<AwsClusterControlPlaneMainVolumeGetArgs> mainVolume;
        private @Nullable Output<AwsClusterControlPlaneProxyConfigGetArgs> proxyConfig;
        private @Nullable Output<AwsClusterControlPlaneRootVolumeGetArgs> rootVolume;
        private @Nullable Output<List<String>> securityGroupIds;
        private @Nullable Output<AwsClusterControlPlaneSshConfigGetArgs> sshConfig;
        private Output<List<String>> subnetIds;
        private @Nullable Output<Map<String,String>> tags;
        private Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(AwsClusterControlPlaneGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsServicesAuthentication = defaults.awsServicesAuthentication;
    	      this.configEncryption = defaults.configEncryption;
    	      this.databaseEncryption = defaults.databaseEncryption;
    	      this.iamInstanceProfile = defaults.iamInstanceProfile;
    	      this.instanceType = defaults.instanceType;
    	      this.mainVolume = defaults.mainVolume;
    	      this.proxyConfig = defaults.proxyConfig;
    	      this.rootVolume = defaults.rootVolume;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.sshConfig = defaults.sshConfig;
    	      this.subnetIds = defaults.subnetIds;
    	      this.tags = defaults.tags;
    	      this.version = defaults.version;
        }

        public Builder awsServicesAuthentication(Output<AwsClusterControlPlaneAwsServicesAuthenticationGetArgs> awsServicesAuthentication) {
            this.awsServicesAuthentication = Objects.requireNonNull(awsServicesAuthentication);
            return this;
        }
        public Builder awsServicesAuthentication(AwsClusterControlPlaneAwsServicesAuthenticationGetArgs awsServicesAuthentication) {
            this.awsServicesAuthentication = Output.of(Objects.requireNonNull(awsServicesAuthentication));
            return this;
        }
        public Builder configEncryption(Output<AwsClusterControlPlaneConfigEncryptionGetArgs> configEncryption) {
            this.configEncryption = Objects.requireNonNull(configEncryption);
            return this;
        }
        public Builder configEncryption(AwsClusterControlPlaneConfigEncryptionGetArgs configEncryption) {
            this.configEncryption = Output.of(Objects.requireNonNull(configEncryption));
            return this;
        }
        public Builder databaseEncryption(Output<AwsClusterControlPlaneDatabaseEncryptionGetArgs> databaseEncryption) {
            this.databaseEncryption = Objects.requireNonNull(databaseEncryption);
            return this;
        }
        public Builder databaseEncryption(AwsClusterControlPlaneDatabaseEncryptionGetArgs databaseEncryption) {
            this.databaseEncryption = Output.of(Objects.requireNonNull(databaseEncryption));
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
            this.instanceType = Codegen.ofNullable(instanceType);
            return this;
        }
        public Builder mainVolume(@Nullable Output<AwsClusterControlPlaneMainVolumeGetArgs> mainVolume) {
            this.mainVolume = mainVolume;
            return this;
        }
        public Builder mainVolume(@Nullable AwsClusterControlPlaneMainVolumeGetArgs mainVolume) {
            this.mainVolume = Codegen.ofNullable(mainVolume);
            return this;
        }
        public Builder proxyConfig(@Nullable Output<AwsClusterControlPlaneProxyConfigGetArgs> proxyConfig) {
            this.proxyConfig = proxyConfig;
            return this;
        }
        public Builder proxyConfig(@Nullable AwsClusterControlPlaneProxyConfigGetArgs proxyConfig) {
            this.proxyConfig = Codegen.ofNullable(proxyConfig);
            return this;
        }
        public Builder rootVolume(@Nullable Output<AwsClusterControlPlaneRootVolumeGetArgs> rootVolume) {
            this.rootVolume = rootVolume;
            return this;
        }
        public Builder rootVolume(@Nullable AwsClusterControlPlaneRootVolumeGetArgs rootVolume) {
            this.rootVolume = Codegen.ofNullable(rootVolume);
            return this;
        }
        public Builder securityGroupIds(@Nullable Output<List<String>> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public Builder securityGroupIds(@Nullable List<String> securityGroupIds) {
            this.securityGroupIds = Codegen.ofNullable(securityGroupIds);
            return this;
        }
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }
        public Builder sshConfig(@Nullable Output<AwsClusterControlPlaneSshConfigGetArgs> sshConfig) {
            this.sshConfig = sshConfig;
            return this;
        }
        public Builder sshConfig(@Nullable AwsClusterControlPlaneSshConfigGetArgs sshConfig) {
            this.sshConfig = Codegen.ofNullable(sshConfig);
            return this;
        }
        public Builder subnetIds(Output<List<String>> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }
        public Builder subnetIds(List<String> subnetIds) {
            this.subnetIds = Output.of(Objects.requireNonNull(subnetIds));
            return this;
        }
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder version(Output<String> version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public Builder version(String version) {
            this.version = Output.of(Objects.requireNonNull(version));
            return this;
        }        public AwsClusterControlPlaneGetArgs build() {
            return new AwsClusterControlPlaneGetArgs(awsServicesAuthentication, configEncryption, databaseEncryption, iamInstanceProfile, instanceType, mainVolume, proxyConfig, rootVolume, securityGroupIds, sshConfig, subnetIds, tags, version);
        }
    }
}
