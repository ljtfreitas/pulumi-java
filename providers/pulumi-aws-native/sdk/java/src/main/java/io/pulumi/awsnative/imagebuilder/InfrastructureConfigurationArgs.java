// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder;

import io.pulumi.awsnative.imagebuilder.inputs.InfrastructureConfigurationInstanceMetadataOptionsArgs;
import io.pulumi.awsnative.imagebuilder.inputs.InfrastructureConfigurationLoggingArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InfrastructureConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final InfrastructureConfigurationArgs Empty = new InfrastructureConfigurationArgs();

    /**
     * The description of the infrastructure configuration.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The instance metadata option settings for the infrastructure configuration.
     * 
     */
    @Import(name="instanceMetadataOptions")
      private final @Nullable Output<InfrastructureConfigurationInstanceMetadataOptionsArgs> instanceMetadataOptions;

    public Output<InfrastructureConfigurationInstanceMetadataOptionsArgs> getInstanceMetadataOptions() {
        return this.instanceMetadataOptions == null ? Output.empty() : this.instanceMetadataOptions;
    }

    /**
     * The instance profile of the infrastructure configuration.
     * 
     */
    @Import(name="instanceProfileName", required=true)
      private final Output<String> instanceProfileName;

    public Output<String> getInstanceProfileName() {
        return this.instanceProfileName;
    }

    /**
     * The instance types of the infrastructure configuration.
     * 
     */
    @Import(name="instanceTypes")
      private final @Nullable Output<List<String>> instanceTypes;

    public Output<List<String>> getInstanceTypes() {
        return this.instanceTypes == null ? Output.empty() : this.instanceTypes;
    }

    /**
     * The EC2 key pair of the infrastructure configuration..
     * 
     */
    @Import(name="keyPair")
      private final @Nullable Output<String> keyPair;

    public Output<String> getKeyPair() {
        return this.keyPair == null ? Output.empty() : this.keyPair;
    }

    /**
     * The logging configuration of the infrastructure configuration.
     * 
     */
    @Import(name="logging")
      private final @Nullable Output<InfrastructureConfigurationLoggingArgs> logging;

    public Output<InfrastructureConfigurationLoggingArgs> getLogging() {
        return this.logging == null ? Output.empty() : this.logging;
    }

    /**
     * The name of the infrastructure configuration.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The tags attached to the resource created by Image Builder.
     * 
     */
    @Import(name="resourceTags")
      private final @Nullable Output<Object> resourceTags;

    public Output<Object> getResourceTags() {
        return this.resourceTags == null ? Output.empty() : this.resourceTags;
    }

    /**
     * The security group IDs of the infrastructure configuration.
     * 
     */
    @Import(name="securityGroupIds")
      private final @Nullable Output<List<String>> securityGroupIds;

    public Output<List<String>> getSecurityGroupIds() {
        return this.securityGroupIds == null ? Output.empty() : this.securityGroupIds;
    }

    /**
     * The SNS Topic Amazon Resource Name (ARN) of the infrastructure configuration.
     * 
     */
    @Import(name="snsTopicArn")
      private final @Nullable Output<String> snsTopicArn;

    public Output<String> getSnsTopicArn() {
        return this.snsTopicArn == null ? Output.empty() : this.snsTopicArn;
    }

    /**
     * The subnet ID of the infrastructure configuration.
     * 
     */
    @Import(name="subnetId")
      private final @Nullable Output<String> subnetId;

    public Output<String> getSubnetId() {
        return this.subnetId == null ? Output.empty() : this.subnetId;
    }

    /**
     * The tags associated with the component.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Object> tags;

    public Output<Object> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * The terminate instance on failure configuration of the infrastructure configuration.
     * 
     */
    @Import(name="terminateInstanceOnFailure")
      private final @Nullable Output<Boolean> terminateInstanceOnFailure;

    public Output<Boolean> getTerminateInstanceOnFailure() {
        return this.terminateInstanceOnFailure == null ? Output.empty() : this.terminateInstanceOnFailure;
    }

    public InfrastructureConfigurationArgs(
        @Nullable Output<String> description,
        @Nullable Output<InfrastructureConfigurationInstanceMetadataOptionsArgs> instanceMetadataOptions,
        Output<String> instanceProfileName,
        @Nullable Output<List<String>> instanceTypes,
        @Nullable Output<String> keyPair,
        @Nullable Output<InfrastructureConfigurationLoggingArgs> logging,
        @Nullable Output<String> name,
        @Nullable Output<Object> resourceTags,
        @Nullable Output<List<String>> securityGroupIds,
        @Nullable Output<String> snsTopicArn,
        @Nullable Output<String> subnetId,
        @Nullable Output<Object> tags,
        @Nullable Output<Boolean> terminateInstanceOnFailure) {
        this.description = description;
        this.instanceMetadataOptions = instanceMetadataOptions;
        this.instanceProfileName = Objects.requireNonNull(instanceProfileName, "expected parameter 'instanceProfileName' to be non-null");
        this.instanceTypes = instanceTypes;
        this.keyPair = keyPair;
        this.logging = logging;
        this.name = name;
        this.resourceTags = resourceTags;
        this.securityGroupIds = securityGroupIds;
        this.snsTopicArn = snsTopicArn;
        this.subnetId = subnetId;
        this.tags = tags;
        this.terminateInstanceOnFailure = terminateInstanceOnFailure;
    }

    private InfrastructureConfigurationArgs() {
        this.description = Output.empty();
        this.instanceMetadataOptions = Output.empty();
        this.instanceProfileName = Output.empty();
        this.instanceTypes = Output.empty();
        this.keyPair = Output.empty();
        this.logging = Output.empty();
        this.name = Output.empty();
        this.resourceTags = Output.empty();
        this.securityGroupIds = Output.empty();
        this.snsTopicArn = Output.empty();
        this.subnetId = Output.empty();
        this.tags = Output.empty();
        this.terminateInstanceOnFailure = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InfrastructureConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<InfrastructureConfigurationInstanceMetadataOptionsArgs> instanceMetadataOptions;
        private Output<String> instanceProfileName;
        private @Nullable Output<List<String>> instanceTypes;
        private @Nullable Output<String> keyPair;
        private @Nullable Output<InfrastructureConfigurationLoggingArgs> logging;
        private @Nullable Output<String> name;
        private @Nullable Output<Object> resourceTags;
        private @Nullable Output<List<String>> securityGroupIds;
        private @Nullable Output<String> snsTopicArn;
        private @Nullable Output<String> subnetId;
        private @Nullable Output<Object> tags;
        private @Nullable Output<Boolean> terminateInstanceOnFailure;

        public Builder() {
    	      // Empty
        }

        public Builder(InfrastructureConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.instanceMetadataOptions = defaults.instanceMetadataOptions;
    	      this.instanceProfileName = defaults.instanceProfileName;
    	      this.instanceTypes = defaults.instanceTypes;
    	      this.keyPair = defaults.keyPair;
    	      this.logging = defaults.logging;
    	      this.name = defaults.name;
    	      this.resourceTags = defaults.resourceTags;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.snsTopicArn = defaults.snsTopicArn;
    	      this.subnetId = defaults.subnetId;
    	      this.tags = defaults.tags;
    	      this.terminateInstanceOnFailure = defaults.terminateInstanceOnFailure;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder instanceMetadataOptions(@Nullable Output<InfrastructureConfigurationInstanceMetadataOptionsArgs> instanceMetadataOptions) {
            this.instanceMetadataOptions = instanceMetadataOptions;
            return this;
        }

        public Builder instanceMetadataOptions(@Nullable InfrastructureConfigurationInstanceMetadataOptionsArgs instanceMetadataOptions) {
            this.instanceMetadataOptions = Output.ofNullable(instanceMetadataOptions);
            return this;
        }

        public Builder instanceProfileName(Output<String> instanceProfileName) {
            this.instanceProfileName = Objects.requireNonNull(instanceProfileName);
            return this;
        }

        public Builder instanceProfileName(String instanceProfileName) {
            this.instanceProfileName = Output.of(Objects.requireNonNull(instanceProfileName));
            return this;
        }

        public Builder instanceTypes(@Nullable Output<List<String>> instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }

        public Builder instanceTypes(@Nullable List<String> instanceTypes) {
            this.instanceTypes = Output.ofNullable(instanceTypes);
            return this;
        }

        public Builder keyPair(@Nullable Output<String> keyPair) {
            this.keyPair = keyPair;
            return this;
        }

        public Builder keyPair(@Nullable String keyPair) {
            this.keyPair = Output.ofNullable(keyPair);
            return this;
        }

        public Builder logging(@Nullable Output<InfrastructureConfigurationLoggingArgs> logging) {
            this.logging = logging;
            return this;
        }

        public Builder logging(@Nullable InfrastructureConfigurationLoggingArgs logging) {
            this.logging = Output.ofNullable(logging);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder resourceTags(@Nullable Output<Object> resourceTags) {
            this.resourceTags = resourceTags;
            return this;
        }

        public Builder resourceTags(@Nullable Object resourceTags) {
            this.resourceTags = Output.ofNullable(resourceTags);
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

        public Builder snsTopicArn(@Nullable Output<String> snsTopicArn) {
            this.snsTopicArn = snsTopicArn;
            return this;
        }

        public Builder snsTopicArn(@Nullable String snsTopicArn) {
            this.snsTopicArn = Output.ofNullable(snsTopicArn);
            return this;
        }

        public Builder subnetId(@Nullable Output<String> subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        public Builder subnetId(@Nullable String subnetId) {
            this.subnetId = Output.ofNullable(subnetId);
            return this;
        }

        public Builder tags(@Nullable Output<Object> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Object tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder terminateInstanceOnFailure(@Nullable Output<Boolean> terminateInstanceOnFailure) {
            this.terminateInstanceOnFailure = terminateInstanceOnFailure;
            return this;
        }

        public Builder terminateInstanceOnFailure(@Nullable Boolean terminateInstanceOnFailure) {
            this.terminateInstanceOnFailure = Output.ofNullable(terminateInstanceOnFailure);
            return this;
        }
        public InfrastructureConfigurationArgs build() {
            return new InfrastructureConfigurationArgs(description, instanceMetadataOptions, instanceProfileName, instanceTypes, keyPair, logging, name, resourceTags, securityGroupIds, snsTopicArn, subnetId, tags, terminateInstanceOnFailure);
        }
    }
}
