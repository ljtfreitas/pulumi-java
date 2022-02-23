// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks.inputs;

import io.pulumi.aws.eks.inputs.ClusterCertificateAuthorityGetArgs;
import io.pulumi.aws.eks.inputs.ClusterEncryptionConfigGetArgs;
import io.pulumi.aws.eks.inputs.ClusterIdentityGetArgs;
import io.pulumi.aws.eks.inputs.ClusterKubernetesNetworkConfigGetArgs;
import io.pulumi.aws.eks.inputs.ClusterVpcConfigGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterState extends io.pulumi.resources.ResourceArgs {

    public static final ClusterState Empty = new ClusterState();

    /**
     * ARN of the cluster.
     * 
     */
    @InputImport(name="arn")
    private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * Attribute block containing `certificate-authority-data` for your cluster. Detailed below.
     * 
     */
    @InputImport(name="certificateAuthority")
    private final @Nullable Input<ClusterCertificateAuthorityGetArgs> certificateAuthority;

    public Input<ClusterCertificateAuthorityGetArgs> getCertificateAuthority() {
        return this.certificateAuthority == null ? Input.empty() : this.certificateAuthority;
    }

    /**
     * Unix epoch timestamp in seconds for when the cluster was created.
     * 
     */
    @InputImport(name="createdAt")
    private final @Nullable Input<String> createdAt;

    public Input<String> getCreatedAt() {
        return this.createdAt == null ? Input.empty() : this.createdAt;
    }

    /**
     * List of the desired control plane logging to enable. For more information, see [Amazon EKS Control Plane Logging](https://docs.aws.amazon.com/eks/latest/userguide/control-plane-logs.html).
     * 
     */
    @InputImport(name="enabledClusterLogTypes")
    private final @Nullable Input<List<String>> enabledClusterLogTypes;

    public Input<List<String>> getEnabledClusterLogTypes() {
        return this.enabledClusterLogTypes == null ? Input.empty() : this.enabledClusterLogTypes;
    }

    /**
     * Configuration block with encryption configuration for the cluster. Only available on Kubernetes 1.13 and above clusters created after March 6, 2020. Detailed below.
     * 
     */
    @InputImport(name="encryptionConfig")
    private final @Nullable Input<ClusterEncryptionConfigGetArgs> encryptionConfig;

    public Input<ClusterEncryptionConfigGetArgs> getEncryptionConfig() {
        return this.encryptionConfig == null ? Input.empty() : this.encryptionConfig;
    }

    /**
     * Endpoint for your Kubernetes API server.
     * 
     */
    @InputImport(name="endpoint")
    private final @Nullable Input<String> endpoint;

    public Input<String> getEndpoint() {
        return this.endpoint == null ? Input.empty() : this.endpoint;
    }

    /**
     * Attribute block containing identity provider information for your cluster. Only available on Kubernetes version 1.13 and 1.14 clusters created or upgraded on or after September 3, 2019. Detailed below.
     * 
     */
    @InputImport(name="identities")
    private final @Nullable Input<List<ClusterIdentityGetArgs>> identities;

    public Input<List<ClusterIdentityGetArgs>> getIdentities() {
        return this.identities == null ? Input.empty() : this.identities;
    }

    /**
     * Configuration block with kubernetes network configuration for the cluster. Detailed below. If removed, this provider will only perform drift detection if a configuration value is provided.
     * 
     */
    @InputImport(name="kubernetesNetworkConfig")
    private final @Nullable Input<ClusterKubernetesNetworkConfigGetArgs> kubernetesNetworkConfig;

    public Input<ClusterKubernetesNetworkConfigGetArgs> getKubernetesNetworkConfig() {
        return this.kubernetesNetworkConfig == null ? Input.empty() : this.kubernetesNetworkConfig;
    }

    /**
     * Name of the cluster. Must be between 1-100 characters in length. Must begin with an alphanumeric character, and must only contain alphanumeric characters, dashes and underscores (`^[0-9A-Za-z][A-Za-z0-9\-_]+$`).
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Platform version for the cluster.
     * 
     */
    @InputImport(name="platformVersion")
    private final @Nullable Input<String> platformVersion;

    public Input<String> getPlatformVersion() {
        return this.platformVersion == null ? Input.empty() : this.platformVersion;
    }

    /**
     * ARN of the IAM role that provides permissions for the Kubernetes control plane to make calls to AWS API operations on your behalf.
     * 
     */
    @InputImport(name="roleArn")
    private final @Nullable Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn == null ? Input.empty() : this.roleArn;
    }

    /**
     * Status of the EKS cluster. One of `CREATING`, `ACTIVE`, `DELETING`, `FAILED`.
     * 
     */
    @InputImport(name="status")
    private final @Nullable Input<String> status;

    public Input<String> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    /**
     * Key-value map of resource tags.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Map of tags assigned to the resource, including those inherited from the provider.
     * 
     */
    @InputImport(name="tagsAll")
    private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * Desired Kubernetes master version. If you do not specify a value, the latest available version at resource creation is used and no upgrades will occur except those automatically triggered by EKS. The value must be configured and increased to upgrade the version when desired. Downgrades are not supported by EKS.
     * 
     */
    @InputImport(name="version")
    private final @Nullable Input<String> version;

    public Input<String> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    /**
     * Configuration block for the VPC associated with your cluster. Amazon EKS VPC resources have specific requirements to work properly with Kubernetes. For more information, see [Cluster VPC Considerations](https://docs.aws.amazon.com/eks/latest/userguide/network_reqs.html) and [Cluster Security Group Considerations](https://docs.aws.amazon.com/eks/latest/userguide/sec-group-reqs.html) in the Amazon EKS User Guide. Detailed below. Also contains attributes detailed in the Attributes section.
     * 
     */
    @InputImport(name="vpcConfig")
    private final @Nullable Input<ClusterVpcConfigGetArgs> vpcConfig;

    public Input<ClusterVpcConfigGetArgs> getVpcConfig() {
        return this.vpcConfig == null ? Input.empty() : this.vpcConfig;
    }

    public ClusterState(
        @Nullable Input<String> arn,
        @Nullable Input<ClusterCertificateAuthorityGetArgs> certificateAuthority,
        @Nullable Input<String> createdAt,
        @Nullable Input<List<String>> enabledClusterLogTypes,
        @Nullable Input<ClusterEncryptionConfigGetArgs> encryptionConfig,
        @Nullable Input<String> endpoint,
        @Nullable Input<List<ClusterIdentityGetArgs>> identities,
        @Nullable Input<ClusterKubernetesNetworkConfigGetArgs> kubernetesNetworkConfig,
        @Nullable Input<String> name,
        @Nullable Input<String> platformVersion,
        @Nullable Input<String> roleArn,
        @Nullable Input<String> status,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<String> version,
        @Nullable Input<ClusterVpcConfigGetArgs> vpcConfig) {
        this.arn = arn;
        this.certificateAuthority = certificateAuthority;
        this.createdAt = createdAt;
        this.enabledClusterLogTypes = enabledClusterLogTypes;
        this.encryptionConfig = encryptionConfig;
        this.endpoint = endpoint;
        this.identities = identities;
        this.kubernetesNetworkConfig = kubernetesNetworkConfig;
        this.name = name;
        this.platformVersion = platformVersion;
        this.roleArn = roleArn;
        this.status = status;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.version = version;
        this.vpcConfig = vpcConfig;
    }

    private ClusterState() {
        this.arn = Input.empty();
        this.certificateAuthority = Input.empty();
        this.createdAt = Input.empty();
        this.enabledClusterLogTypes = Input.empty();
        this.encryptionConfig = Input.empty();
        this.endpoint = Input.empty();
        this.identities = Input.empty();
        this.kubernetesNetworkConfig = Input.empty();
        this.name = Input.empty();
        this.platformVersion = Input.empty();
        this.roleArn = Input.empty();
        this.status = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.version = Input.empty();
        this.vpcConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<ClusterCertificateAuthorityGetArgs> certificateAuthority;
        private @Nullable Input<String> createdAt;
        private @Nullable Input<List<String>> enabledClusterLogTypes;
        private @Nullable Input<ClusterEncryptionConfigGetArgs> encryptionConfig;
        private @Nullable Input<String> endpoint;
        private @Nullable Input<List<ClusterIdentityGetArgs>> identities;
        private @Nullable Input<ClusterKubernetesNetworkConfigGetArgs> kubernetesNetworkConfig;
        private @Nullable Input<String> name;
        private @Nullable Input<String> platformVersion;
        private @Nullable Input<String> roleArn;
        private @Nullable Input<String> status;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<String> version;
        private @Nullable Input<ClusterVpcConfigGetArgs> vpcConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.certificateAuthority = defaults.certificateAuthority;
    	      this.createdAt = defaults.createdAt;
    	      this.enabledClusterLogTypes = defaults.enabledClusterLogTypes;
    	      this.encryptionConfig = defaults.encryptionConfig;
    	      this.endpoint = defaults.endpoint;
    	      this.identities = defaults.identities;
    	      this.kubernetesNetworkConfig = defaults.kubernetesNetworkConfig;
    	      this.name = defaults.name;
    	      this.platformVersion = defaults.platformVersion;
    	      this.roleArn = defaults.roleArn;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.version = defaults.version;
    	      this.vpcConfig = defaults.vpcConfig;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setCertificateAuthority(@Nullable Input<ClusterCertificateAuthorityGetArgs> certificateAuthority) {
            this.certificateAuthority = certificateAuthority;
            return this;
        }

        public Builder setCertificateAuthority(@Nullable ClusterCertificateAuthorityGetArgs certificateAuthority) {
            this.certificateAuthority = Input.ofNullable(certificateAuthority);
            return this;
        }

        public Builder setCreatedAt(@Nullable Input<String> createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setCreatedAt(@Nullable String createdAt) {
            this.createdAt = Input.ofNullable(createdAt);
            return this;
        }

        public Builder setEnabledClusterLogTypes(@Nullable Input<List<String>> enabledClusterLogTypes) {
            this.enabledClusterLogTypes = enabledClusterLogTypes;
            return this;
        }

        public Builder setEnabledClusterLogTypes(@Nullable List<String> enabledClusterLogTypes) {
            this.enabledClusterLogTypes = Input.ofNullable(enabledClusterLogTypes);
            return this;
        }

        public Builder setEncryptionConfig(@Nullable Input<ClusterEncryptionConfigGetArgs> encryptionConfig) {
            this.encryptionConfig = encryptionConfig;
            return this;
        }

        public Builder setEncryptionConfig(@Nullable ClusterEncryptionConfigGetArgs encryptionConfig) {
            this.encryptionConfig = Input.ofNullable(encryptionConfig);
            return this;
        }

        public Builder setEndpoint(@Nullable Input<String> endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        public Builder setEndpoint(@Nullable String endpoint) {
            this.endpoint = Input.ofNullable(endpoint);
            return this;
        }

        public Builder setIdentities(@Nullable Input<List<ClusterIdentityGetArgs>> identities) {
            this.identities = identities;
            return this;
        }

        public Builder setIdentities(@Nullable List<ClusterIdentityGetArgs> identities) {
            this.identities = Input.ofNullable(identities);
            return this;
        }

        public Builder setKubernetesNetworkConfig(@Nullable Input<ClusterKubernetesNetworkConfigGetArgs> kubernetesNetworkConfig) {
            this.kubernetesNetworkConfig = kubernetesNetworkConfig;
            return this;
        }

        public Builder setKubernetesNetworkConfig(@Nullable ClusterKubernetesNetworkConfigGetArgs kubernetesNetworkConfig) {
            this.kubernetesNetworkConfig = Input.ofNullable(kubernetesNetworkConfig);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPlatformVersion(@Nullable Input<String> platformVersion) {
            this.platformVersion = platformVersion;
            return this;
        }

        public Builder setPlatformVersion(@Nullable String platformVersion) {
            this.platformVersion = Input.ofNullable(platformVersion);
            return this;
        }

        public Builder setRoleArn(@Nullable Input<String> roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        public Builder setRoleArn(@Nullable String roleArn) {
            this.roleArn = Input.ofNullable(roleArn);
            return this;
        }

        public Builder setStatus(@Nullable Input<String> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder setTagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }

        public Builder setVersion(@Nullable Input<String> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = Input.ofNullable(version);
            return this;
        }

        public Builder setVpcConfig(@Nullable Input<ClusterVpcConfigGetArgs> vpcConfig) {
            this.vpcConfig = vpcConfig;
            return this;
        }

        public Builder setVpcConfig(@Nullable ClusterVpcConfigGetArgs vpcConfig) {
            this.vpcConfig = Input.ofNullable(vpcConfig);
            return this;
        }
        public ClusterState build() {
            return new ClusterState(arn, certificateAuthority, createdAt, enabledClusterLogTypes, encryptionConfig, endpoint, identities, kubernetesNetworkConfig, name, platformVersion, roleArn, status, tags, tagsAll, version, vpcConfig);
        }
    }
}
