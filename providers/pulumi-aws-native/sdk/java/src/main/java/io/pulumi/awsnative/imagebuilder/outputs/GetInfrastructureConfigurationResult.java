// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.outputs;

import io.pulumi.awsnative.imagebuilder.outputs.InfrastructureConfigurationInstanceMetadataOptions;
import io.pulumi.awsnative.imagebuilder.outputs.InfrastructureConfigurationLogging;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetInfrastructureConfigurationResult {
    /**
     * The Amazon Resource Name (ARN) of the infrastructure configuration.
     * 
     */
    private final @Nullable String arn;
    /**
     * The description of the infrastructure configuration.
     * 
     */
    private final @Nullable String description;
    /**
     * The instance metadata option settings for the infrastructure configuration.
     * 
     */
    private final @Nullable InfrastructureConfigurationInstanceMetadataOptions instanceMetadataOptions;
    /**
     * The instance profile of the infrastructure configuration.
     * 
     */
    private final @Nullable String instanceProfileName;
    /**
     * The instance types of the infrastructure configuration.
     * 
     */
    private final @Nullable List<String> instanceTypes;
    /**
     * The EC2 key pair of the infrastructure configuration..
     * 
     */
    private final @Nullable String keyPair;
    /**
     * The logging configuration of the infrastructure configuration.
     * 
     */
    private final @Nullable InfrastructureConfigurationLogging logging;
    /**
     * The tags attached to the resource created by Image Builder.
     * 
     */
    private final @Nullable Object resourceTags;
    /**
     * The security group IDs of the infrastructure configuration.
     * 
     */
    private final @Nullable List<String> securityGroupIds;
    /**
     * The SNS Topic Amazon Resource Name (ARN) of the infrastructure configuration.
     * 
     */
    private final @Nullable String snsTopicArn;
    /**
     * The subnet ID of the infrastructure configuration.
     * 
     */
    private final @Nullable String subnetId;
    /**
     * The tags associated with the component.
     * 
     */
    private final @Nullable Object tags;
    /**
     * The terminate instance on failure configuration of the infrastructure configuration.
     * 
     */
    private final @Nullable Boolean terminateInstanceOnFailure;

    @OutputCustomType.Constructor({"arn","description","instanceMetadataOptions","instanceProfileName","instanceTypes","keyPair","logging","resourceTags","securityGroupIds","snsTopicArn","subnetId","tags","terminateInstanceOnFailure"})
    private GetInfrastructureConfigurationResult(
        @Nullable String arn,
        @Nullable String description,
        @Nullable InfrastructureConfigurationInstanceMetadataOptions instanceMetadataOptions,
        @Nullable String instanceProfileName,
        @Nullable List<String> instanceTypes,
        @Nullable String keyPair,
        @Nullable InfrastructureConfigurationLogging logging,
        @Nullable Object resourceTags,
        @Nullable List<String> securityGroupIds,
        @Nullable String snsTopicArn,
        @Nullable String subnetId,
        @Nullable Object tags,
        @Nullable Boolean terminateInstanceOnFailure) {
        this.arn = arn;
        this.description = description;
        this.instanceMetadataOptions = instanceMetadataOptions;
        this.instanceProfileName = instanceProfileName;
        this.instanceTypes = instanceTypes;
        this.keyPair = keyPair;
        this.logging = logging;
        this.resourceTags = resourceTags;
        this.securityGroupIds = securityGroupIds;
        this.snsTopicArn = snsTopicArn;
        this.subnetId = subnetId;
        this.tags = tags;
        this.terminateInstanceOnFailure = terminateInstanceOnFailure;
    }

    /**
     * The Amazon Resource Name (ARN) of the infrastructure configuration.
     * 
     */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * The description of the infrastructure configuration.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The instance metadata option settings for the infrastructure configuration.
     * 
     */
    public Optional<InfrastructureConfigurationInstanceMetadataOptions> getInstanceMetadataOptions() {
        return Optional.ofNullable(this.instanceMetadataOptions);
    }
    /**
     * The instance profile of the infrastructure configuration.
     * 
     */
    public Optional<String> getInstanceProfileName() {
        return Optional.ofNullable(this.instanceProfileName);
    }
    /**
     * The instance types of the infrastructure configuration.
     * 
     */
    public List<String> getInstanceTypes() {
        return this.instanceTypes == null ? List.of() : this.instanceTypes;
    }
    /**
     * The EC2 key pair of the infrastructure configuration..
     * 
     */
    public Optional<String> getKeyPair() {
        return Optional.ofNullable(this.keyPair);
    }
    /**
     * The logging configuration of the infrastructure configuration.
     * 
     */
    public Optional<InfrastructureConfigurationLogging> getLogging() {
        return Optional.ofNullable(this.logging);
    }
    /**
     * The tags attached to the resource created by Image Builder.
     * 
     */
    public Optional<Object> getResourceTags() {
        return Optional.ofNullable(this.resourceTags);
    }
    /**
     * The security group IDs of the infrastructure configuration.
     * 
     */
    public List<String> getSecurityGroupIds() {
        return this.securityGroupIds == null ? List.of() : this.securityGroupIds;
    }
    /**
     * The SNS Topic Amazon Resource Name (ARN) of the infrastructure configuration.
     * 
     */
    public Optional<String> getSnsTopicArn() {
        return Optional.ofNullable(this.snsTopicArn);
    }
    /**
     * The subnet ID of the infrastructure configuration.
     * 
     */
    public Optional<String> getSubnetId() {
        return Optional.ofNullable(this.subnetId);
    }
    /**
     * The tags associated with the component.
     * 
     */
    public Optional<Object> getTags() {
        return Optional.ofNullable(this.tags);
    }
    /**
     * The terminate instance on failure configuration of the infrastructure configuration.
     * 
     */
    public Optional<Boolean> getTerminateInstanceOnFailure() {
        return Optional.ofNullable(this.terminateInstanceOnFailure);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInfrastructureConfigurationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String description;
        private @Nullable InfrastructureConfigurationInstanceMetadataOptions instanceMetadataOptions;
        private @Nullable String instanceProfileName;
        private @Nullable List<String> instanceTypes;
        private @Nullable String keyPair;
        private @Nullable InfrastructureConfigurationLogging logging;
        private @Nullable Object resourceTags;
        private @Nullable List<String> securityGroupIds;
        private @Nullable String snsTopicArn;
        private @Nullable String subnetId;
        private @Nullable Object tags;
        private @Nullable Boolean terminateInstanceOnFailure;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInfrastructureConfigurationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.instanceMetadataOptions = defaults.instanceMetadataOptions;
    	      this.instanceProfileName = defaults.instanceProfileName;
    	      this.instanceTypes = defaults.instanceTypes;
    	      this.keyPair = defaults.keyPair;
    	      this.logging = defaults.logging;
    	      this.resourceTags = defaults.resourceTags;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.snsTopicArn = defaults.snsTopicArn;
    	      this.subnetId = defaults.subnetId;
    	      this.tags = defaults.tags;
    	      this.terminateInstanceOnFailure = defaults.terminateInstanceOnFailure;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setInstanceMetadataOptions(@Nullable InfrastructureConfigurationInstanceMetadataOptions instanceMetadataOptions) {
            this.instanceMetadataOptions = instanceMetadataOptions;
            return this;
        }

        public Builder setInstanceProfileName(@Nullable String instanceProfileName) {
            this.instanceProfileName = instanceProfileName;
            return this;
        }

        public Builder setInstanceTypes(@Nullable List<String> instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }

        public Builder setKeyPair(@Nullable String keyPair) {
            this.keyPair = keyPair;
            return this;
        }

        public Builder setLogging(@Nullable InfrastructureConfigurationLogging logging) {
            this.logging = logging;
            return this;
        }

        public Builder setResourceTags(@Nullable Object resourceTags) {
            this.resourceTags = resourceTags;
            return this;
        }

        public Builder setSecurityGroupIds(@Nullable List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        public Builder setSnsTopicArn(@Nullable String snsTopicArn) {
            this.snsTopicArn = snsTopicArn;
            return this;
        }

        public Builder setSubnetId(@Nullable String subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        public Builder setTags(@Nullable Object tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTerminateInstanceOnFailure(@Nullable Boolean terminateInstanceOnFailure) {
            this.terminateInstanceOnFailure = terminateInstanceOnFailure;
            return this;
        }
        public GetInfrastructureConfigurationResult build() {
            return new GetInfrastructureConfigurationResult(arn, description, instanceMetadataOptions, instanceProfileName, instanceTypes, keyPair, logging, resourceTags, securityGroupIds, snsTopicArn, subnetId, tags, terminateInstanceOnFailure);
        }
    }
}
