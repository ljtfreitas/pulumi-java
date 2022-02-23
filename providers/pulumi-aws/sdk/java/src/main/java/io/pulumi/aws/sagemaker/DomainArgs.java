// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker;

import io.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsArgs;
import io.pulumi.aws.sagemaker.inputs.DomainRetentionPolicyArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainArgs Empty = new DomainArgs();

    /**
     * Specifies the VPC used for non-EFS traffic. The default value is `PublicInternetOnly`. Valid values are `PublicInternetOnly` and `VpcOnly`.
     * 
     */
    @InputImport(name="appNetworkAccessType")
    private final @Nullable Input<String> appNetworkAccessType;

    public Input<String> getAppNetworkAccessType() {
        return this.appNetworkAccessType == null ? Input.empty() : this.appNetworkAccessType;
    }

    /**
     * The mode of authentication that members use to access the domain. Valid values are `IAM` and `SSO`.
     * 
     */
    @InputImport(name="authMode", required=true)
    private final Input<String> authMode;

    public Input<String> getAuthMode() {
        return this.authMode;
    }

    /**
     * The default user settings. See Default User Settings below.
     * 
     */
    @InputImport(name="defaultUserSettings", required=true)
    private final Input<DomainDefaultUserSettingsArgs> defaultUserSettings;

    public Input<DomainDefaultUserSettingsArgs> getDefaultUserSettings() {
        return this.defaultUserSettings;
    }

    /**
     * The domain name.
     * 
     */
    @InputImport(name="domainName", required=true)
    private final Input<String> domainName;

    public Input<String> getDomainName() {
        return this.domainName;
    }

    /**
     * The AWS KMS customer managed CMK used to encrypt the EFS volume attached to the domain.
     * 
     */
    @InputImport(name="kmsKeyId")
    private final @Nullable Input<String> kmsKeyId;

    public Input<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Input.empty() : this.kmsKeyId;
    }

    /**
     * The retention policy for this domain, which specifies whether resources will be retained after the Domain is deleted. By default, all resources are retained. See Retention Policy below.
     * 
     */
    @InputImport(name="retentionPolicy")
    private final @Nullable Input<DomainRetentionPolicyArgs> retentionPolicy;

    public Input<DomainRetentionPolicyArgs> getRetentionPolicy() {
        return this.retentionPolicy == null ? Input.empty() : this.retentionPolicy;
    }

    /**
     * The VPC subnets that Studio uses for communication.
     * 
     */
    @InputImport(name="subnetIds", required=true)
    private final Input<List<String>> subnetIds;

    public Input<List<String>> getSubnetIds() {
        return this.subnetIds;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The ID of the Amazon Virtual Private Cloud (VPC) that Studio uses for communication.
     * 
     */
    @InputImport(name="vpcId", required=true)
    private final Input<String> vpcId;

    public Input<String> getVpcId() {
        return this.vpcId;
    }

    public DomainArgs(
        @Nullable Input<String> appNetworkAccessType,
        Input<String> authMode,
        Input<DomainDefaultUserSettingsArgs> defaultUserSettings,
        Input<String> domainName,
        @Nullable Input<String> kmsKeyId,
        @Nullable Input<DomainRetentionPolicyArgs> retentionPolicy,
        Input<List<String>> subnetIds,
        @Nullable Input<Map<String,String>> tags,
        Input<String> vpcId) {
        this.appNetworkAccessType = appNetworkAccessType;
        this.authMode = Objects.requireNonNull(authMode, "expected parameter 'authMode' to be non-null");
        this.defaultUserSettings = Objects.requireNonNull(defaultUserSettings, "expected parameter 'defaultUserSettings' to be non-null");
        this.domainName = Objects.requireNonNull(domainName, "expected parameter 'domainName' to be non-null");
        this.kmsKeyId = kmsKeyId;
        this.retentionPolicy = retentionPolicy;
        this.subnetIds = Objects.requireNonNull(subnetIds, "expected parameter 'subnetIds' to be non-null");
        this.tags = tags;
        this.vpcId = Objects.requireNonNull(vpcId, "expected parameter 'vpcId' to be non-null");
    }

    private DomainArgs() {
        this.appNetworkAccessType = Input.empty();
        this.authMode = Input.empty();
        this.defaultUserSettings = Input.empty();
        this.domainName = Input.empty();
        this.kmsKeyId = Input.empty();
        this.retentionPolicy = Input.empty();
        this.subnetIds = Input.empty();
        this.tags = Input.empty();
        this.vpcId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> appNetworkAccessType;
        private Input<String> authMode;
        private Input<DomainDefaultUserSettingsArgs> defaultUserSettings;
        private Input<String> domainName;
        private @Nullable Input<String> kmsKeyId;
        private @Nullable Input<DomainRetentionPolicyArgs> retentionPolicy;
        private Input<List<String>> subnetIds;
        private @Nullable Input<Map<String,String>> tags;
        private Input<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appNetworkAccessType = defaults.appNetworkAccessType;
    	      this.authMode = defaults.authMode;
    	      this.defaultUserSettings = defaults.defaultUserSettings;
    	      this.domainName = defaults.domainName;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.retentionPolicy = defaults.retentionPolicy;
    	      this.subnetIds = defaults.subnetIds;
    	      this.tags = defaults.tags;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder setAppNetworkAccessType(@Nullable Input<String> appNetworkAccessType) {
            this.appNetworkAccessType = appNetworkAccessType;
            return this;
        }

        public Builder setAppNetworkAccessType(@Nullable String appNetworkAccessType) {
            this.appNetworkAccessType = Input.ofNullable(appNetworkAccessType);
            return this;
        }

        public Builder setAuthMode(Input<String> authMode) {
            this.authMode = Objects.requireNonNull(authMode);
            return this;
        }

        public Builder setAuthMode(String authMode) {
            this.authMode = Input.of(Objects.requireNonNull(authMode));
            return this;
        }

        public Builder setDefaultUserSettings(Input<DomainDefaultUserSettingsArgs> defaultUserSettings) {
            this.defaultUserSettings = Objects.requireNonNull(defaultUserSettings);
            return this;
        }

        public Builder setDefaultUserSettings(DomainDefaultUserSettingsArgs defaultUserSettings) {
            this.defaultUserSettings = Input.of(Objects.requireNonNull(defaultUserSettings));
            return this;
        }

        public Builder setDomainName(Input<String> domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }

        public Builder setDomainName(String domainName) {
            this.domainName = Input.of(Objects.requireNonNull(domainName));
            return this;
        }

        public Builder setKmsKeyId(@Nullable Input<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder setKmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Input.ofNullable(kmsKeyId);
            return this;
        }

        public Builder setRetentionPolicy(@Nullable Input<DomainRetentionPolicyArgs> retentionPolicy) {
            this.retentionPolicy = retentionPolicy;
            return this;
        }

        public Builder setRetentionPolicy(@Nullable DomainRetentionPolicyArgs retentionPolicy) {
            this.retentionPolicy = Input.ofNullable(retentionPolicy);
            return this;
        }

        public Builder setSubnetIds(Input<List<String>> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }

        public Builder setSubnetIds(List<String> subnetIds) {
            this.subnetIds = Input.of(Objects.requireNonNull(subnetIds));
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

        public Builder setVpcId(Input<String> vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }

        public Builder setVpcId(String vpcId) {
            this.vpcId = Input.of(Objects.requireNonNull(vpcId));
            return this;
        }
        public DomainArgs build() {
            return new DomainArgs(appNetworkAccessType, authMode, defaultUserSettings, domainName, kmsKeyId, retentionPolicy, subnetIds, tags, vpcId);
        }
    }
}
