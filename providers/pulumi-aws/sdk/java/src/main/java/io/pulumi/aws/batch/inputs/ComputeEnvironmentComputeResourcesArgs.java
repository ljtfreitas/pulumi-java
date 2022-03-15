// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.batch.inputs;

import io.pulumi.aws.batch.inputs.ComputeEnvironmentComputeResourcesEc2ConfigurationArgs;
import io.pulumi.aws.batch.inputs.ComputeEnvironmentComputeResourcesLaunchTemplateArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ComputeEnvironmentComputeResourcesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ComputeEnvironmentComputeResourcesArgs Empty = new ComputeEnvironmentComputeResourcesArgs();

    /**
     * The allocation strategy to use for the compute resource in case not enough instances of the best fitting instance type can be allocated. Valid items are `BEST_FIT_PROGRESSIVE`, `SPOT_CAPACITY_OPTIMIZED` or `BEST_FIT`. Defaults to `BEST_FIT`. See [AWS docs](https://docs.aws.amazon.com/batch/latest/userguide/allocation-strategies.html) for details. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     * 
     */
    @Import(name="allocationStrategy")
      private final @Nullable Output<String> allocationStrategy;

    public Output<String> getAllocationStrategy() {
        return this.allocationStrategy == null ? Output.empty() : this.allocationStrategy;
    }

    /**
     * Integer of maximum percentage that a Spot Instance price can be when compared with the On-Demand price for that instance type before instances are launched. For example, if your bid percentage is 20% (`20`), then the Spot price must be below 20% of the current On-Demand price for that EC2 instance. If you leave this field empty, the default value is 100% of the On-Demand price. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     * 
     */
    @Import(name="bidPercentage")
      private final @Nullable Output<Integer> bidPercentage;

    public Output<Integer> getBidPercentage() {
        return this.bidPercentage == null ? Output.empty() : this.bidPercentage;
    }

    /**
     * The desired number of EC2 vCPUS in the compute environment. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     * 
     */
    @Import(name="desiredVcpus")
      private final @Nullable Output<Integer> desiredVcpus;

    public Output<Integer> getDesiredVcpus() {
        return this.desiredVcpus == null ? Output.empty() : this.desiredVcpus;
    }

    /**
     * Provides information used to select Amazon Machine Images (AMIs) for EC2 instances in the compute environment. If Ec2Configuration isn't specified, the default is ECS_AL2. This parameter isn't applicable to jobs that are running on Fargate resources, and shouldn't be specified.
     * 
     */
    @Import(name="ec2Configuration")
      private final @Nullable Output<ComputeEnvironmentComputeResourcesEc2ConfigurationArgs> ec2Configuration;

    public Output<ComputeEnvironmentComputeResourcesEc2ConfigurationArgs> getEc2Configuration() {
        return this.ec2Configuration == null ? Output.empty() : this.ec2Configuration;
    }

    /**
     * The EC2 key pair that is used for instances launched in the compute environment. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     * 
     */
    @Import(name="ec2KeyPair")
      private final @Nullable Output<String> ec2KeyPair;

    public Output<String> getEc2KeyPair() {
        return this.ec2KeyPair == null ? Output.empty() : this.ec2KeyPair;
    }

    /**
     * The Amazon Machine Image (AMI) ID used for instances launched in the compute environment. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified. (Deprecated, use `image_id_override` instead)
     * 
     */
    @Import(name="imageId")
      private final @Nullable Output<String> imageId;

    public Output<String> getImageId() {
        return this.imageId == null ? Output.empty() : this.imageId;
    }

    /**
     * The Amazon ECS instance role applied to Amazon EC2 instances in a compute environment. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     * 
     */
    @Import(name="instanceRole")
      private final @Nullable Output<String> instanceRole;

    public Output<String> getInstanceRole() {
        return this.instanceRole == null ? Output.empty() : this.instanceRole;
    }

    /**
     * A list of instance types that may be launched. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     * 
     */
    @Import(name="instanceTypes")
      private final @Nullable Output<List<String>> instanceTypes;

    public Output<List<String>> getInstanceTypes() {
        return this.instanceTypes == null ? Output.empty() : this.instanceTypes;
    }

    /**
     * The launch template to use for your compute resources. See details below. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     * 
     */
    @Import(name="launchTemplate")
      private final @Nullable Output<ComputeEnvironmentComputeResourcesLaunchTemplateArgs> launchTemplate;

    public Output<ComputeEnvironmentComputeResourcesLaunchTemplateArgs> getLaunchTemplate() {
        return this.launchTemplate == null ? Output.empty() : this.launchTemplate;
    }

    /**
     * The maximum number of EC2 vCPUs that an environment can reach.
     * 
     */
    @Import(name="maxVcpus", required=true)
      private final Output<Integer> maxVcpus;

    public Output<Integer> getMaxVcpus() {
        return this.maxVcpus;
    }

    /**
     * The minimum number of EC2 vCPUs that an environment should maintain. For `EC2` or `SPOT` compute environments, if the parameter is not explicitly defined, a `0` default value will be set. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     * 
     */
    @Import(name="minVcpus")
      private final @Nullable Output<Integer> minVcpus;

    public Output<Integer> getMinVcpus() {
        return this.minVcpus == null ? Output.empty() : this.minVcpus;
    }

    /**
     * A list of EC2 security group that are associated with instances launched in the compute environment.
     * 
     */
    @Import(name="securityGroupIds", required=true)
      private final Output<List<String>> securityGroupIds;

    public Output<List<String>> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    /**
     * The Amazon Resource Name (ARN) of the Amazon EC2 Spot Fleet IAM role applied to a SPOT compute environment. This parameter is required for SPOT compute environments. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     * 
     */
    @Import(name="spotIamFleetRole")
      private final @Nullable Output<String> spotIamFleetRole;

    public Output<String> getSpotIamFleetRole() {
        return this.spotIamFleetRole == null ? Output.empty() : this.spotIamFleetRole;
    }

    /**
     * A list of VPC subnets into which the compute resources are launched.
     * 
     */
    @Import(name="subnets", required=true)
      private final Output<List<String>> subnets;

    public Output<List<String>> getSubnets() {
        return this.subnets;
    }

    /**
     * Key-value pair tags to be applied to resources that are launched in the compute environment. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * The type of compute environment. Valid items are `EC2`, `SPOT`, `FARGATE` or `FARGATE_SPOT`.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public ComputeEnvironmentComputeResourcesArgs(
        @Nullable Output<String> allocationStrategy,
        @Nullable Output<Integer> bidPercentage,
        @Nullable Output<Integer> desiredVcpus,
        @Nullable Output<ComputeEnvironmentComputeResourcesEc2ConfigurationArgs> ec2Configuration,
        @Nullable Output<String> ec2KeyPair,
        @Nullable Output<String> imageId,
        @Nullable Output<String> instanceRole,
        @Nullable Output<List<String>> instanceTypes,
        @Nullable Output<ComputeEnvironmentComputeResourcesLaunchTemplateArgs> launchTemplate,
        Output<Integer> maxVcpus,
        @Nullable Output<Integer> minVcpus,
        Output<List<String>> securityGroupIds,
        @Nullable Output<String> spotIamFleetRole,
        Output<List<String>> subnets,
        @Nullable Output<Map<String,String>> tags,
        Output<String> type) {
        this.allocationStrategy = allocationStrategy;
        this.bidPercentage = bidPercentage;
        this.desiredVcpus = desiredVcpus;
        this.ec2Configuration = ec2Configuration;
        this.ec2KeyPair = ec2KeyPair;
        this.imageId = imageId;
        this.instanceRole = instanceRole;
        this.instanceTypes = instanceTypes;
        this.launchTemplate = launchTemplate;
        this.maxVcpus = Objects.requireNonNull(maxVcpus, "expected parameter 'maxVcpus' to be non-null");
        this.minVcpus = minVcpus;
        this.securityGroupIds = Objects.requireNonNull(securityGroupIds, "expected parameter 'securityGroupIds' to be non-null");
        this.spotIamFleetRole = spotIamFleetRole;
        this.subnets = Objects.requireNonNull(subnets, "expected parameter 'subnets' to be non-null");
        this.tags = tags;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ComputeEnvironmentComputeResourcesArgs() {
        this.allocationStrategy = Output.empty();
        this.bidPercentage = Output.empty();
        this.desiredVcpus = Output.empty();
        this.ec2Configuration = Output.empty();
        this.ec2KeyPair = Output.empty();
        this.imageId = Output.empty();
        this.instanceRole = Output.empty();
        this.instanceTypes = Output.empty();
        this.launchTemplate = Output.empty();
        this.maxVcpus = Output.empty();
        this.minVcpus = Output.empty();
        this.securityGroupIds = Output.empty();
        this.spotIamFleetRole = Output.empty();
        this.subnets = Output.empty();
        this.tags = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeEnvironmentComputeResourcesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> allocationStrategy;
        private @Nullable Output<Integer> bidPercentage;
        private @Nullable Output<Integer> desiredVcpus;
        private @Nullable Output<ComputeEnvironmentComputeResourcesEc2ConfigurationArgs> ec2Configuration;
        private @Nullable Output<String> ec2KeyPair;
        private @Nullable Output<String> imageId;
        private @Nullable Output<String> instanceRole;
        private @Nullable Output<List<String>> instanceTypes;
        private @Nullable Output<ComputeEnvironmentComputeResourcesLaunchTemplateArgs> launchTemplate;
        private Output<Integer> maxVcpus;
        private @Nullable Output<Integer> minVcpus;
        private Output<List<String>> securityGroupIds;
        private @Nullable Output<String> spotIamFleetRole;
        private Output<List<String>> subnets;
        private @Nullable Output<Map<String,String>> tags;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeEnvironmentComputeResourcesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationStrategy = defaults.allocationStrategy;
    	      this.bidPercentage = defaults.bidPercentage;
    	      this.desiredVcpus = defaults.desiredVcpus;
    	      this.ec2Configuration = defaults.ec2Configuration;
    	      this.ec2KeyPair = defaults.ec2KeyPair;
    	      this.imageId = defaults.imageId;
    	      this.instanceRole = defaults.instanceRole;
    	      this.instanceTypes = defaults.instanceTypes;
    	      this.launchTemplate = defaults.launchTemplate;
    	      this.maxVcpus = defaults.maxVcpus;
    	      this.minVcpus = defaults.minVcpus;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.spotIamFleetRole = defaults.spotIamFleetRole;
    	      this.subnets = defaults.subnets;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder allocationStrategy(@Nullable Output<String> allocationStrategy) {
            this.allocationStrategy = allocationStrategy;
            return this;
        }

        public Builder allocationStrategy(@Nullable String allocationStrategy) {
            this.allocationStrategy = Output.ofNullable(allocationStrategy);
            return this;
        }

        public Builder bidPercentage(@Nullable Output<Integer> bidPercentage) {
            this.bidPercentage = bidPercentage;
            return this;
        }

        public Builder bidPercentage(@Nullable Integer bidPercentage) {
            this.bidPercentage = Output.ofNullable(bidPercentage);
            return this;
        }

        public Builder desiredVcpus(@Nullable Output<Integer> desiredVcpus) {
            this.desiredVcpus = desiredVcpus;
            return this;
        }

        public Builder desiredVcpus(@Nullable Integer desiredVcpus) {
            this.desiredVcpus = Output.ofNullable(desiredVcpus);
            return this;
        }

        public Builder ec2Configuration(@Nullable Output<ComputeEnvironmentComputeResourcesEc2ConfigurationArgs> ec2Configuration) {
            this.ec2Configuration = ec2Configuration;
            return this;
        }

        public Builder ec2Configuration(@Nullable ComputeEnvironmentComputeResourcesEc2ConfigurationArgs ec2Configuration) {
            this.ec2Configuration = Output.ofNullable(ec2Configuration);
            return this;
        }

        public Builder ec2KeyPair(@Nullable Output<String> ec2KeyPair) {
            this.ec2KeyPair = ec2KeyPair;
            return this;
        }

        public Builder ec2KeyPair(@Nullable String ec2KeyPair) {
            this.ec2KeyPair = Output.ofNullable(ec2KeyPair);
            return this;
        }

        public Builder imageId(@Nullable Output<String> imageId) {
            this.imageId = imageId;
            return this;
        }

        public Builder imageId(@Nullable String imageId) {
            this.imageId = Output.ofNullable(imageId);
            return this;
        }

        public Builder instanceRole(@Nullable Output<String> instanceRole) {
            this.instanceRole = instanceRole;
            return this;
        }

        public Builder instanceRole(@Nullable String instanceRole) {
            this.instanceRole = Output.ofNullable(instanceRole);
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

        public Builder launchTemplate(@Nullable Output<ComputeEnvironmentComputeResourcesLaunchTemplateArgs> launchTemplate) {
            this.launchTemplate = launchTemplate;
            return this;
        }

        public Builder launchTemplate(@Nullable ComputeEnvironmentComputeResourcesLaunchTemplateArgs launchTemplate) {
            this.launchTemplate = Output.ofNullable(launchTemplate);
            return this;
        }

        public Builder maxVcpus(Output<Integer> maxVcpus) {
            this.maxVcpus = Objects.requireNonNull(maxVcpus);
            return this;
        }

        public Builder maxVcpus(Integer maxVcpus) {
            this.maxVcpus = Output.of(Objects.requireNonNull(maxVcpus));
            return this;
        }

        public Builder minVcpus(@Nullable Output<Integer> minVcpus) {
            this.minVcpus = minVcpus;
            return this;
        }

        public Builder minVcpus(@Nullable Integer minVcpus) {
            this.minVcpus = Output.ofNullable(minVcpus);
            return this;
        }

        public Builder securityGroupIds(Output<List<String>> securityGroupIds) {
            this.securityGroupIds = Objects.requireNonNull(securityGroupIds);
            return this;
        }

        public Builder securityGroupIds(List<String> securityGroupIds) {
            this.securityGroupIds = Output.of(Objects.requireNonNull(securityGroupIds));
            return this;
        }

        public Builder spotIamFleetRole(@Nullable Output<String> spotIamFleetRole) {
            this.spotIamFleetRole = spotIamFleetRole;
            return this;
        }

        public Builder spotIamFleetRole(@Nullable String spotIamFleetRole) {
            this.spotIamFleetRole = Output.ofNullable(spotIamFleetRole);
            return this;
        }

        public Builder subnets(Output<List<String>> subnets) {
            this.subnets = Objects.requireNonNull(subnets);
            return this;
        }

        public Builder subnets(List<String> subnets) {
            this.subnets = Output.of(Objects.requireNonNull(subnets));
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

        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public ComputeEnvironmentComputeResourcesArgs build() {
            return new ComputeEnvironmentComputeResourcesArgs(allocationStrategy, bidPercentage, desiredVcpus, ec2Configuration, ec2KeyPair, imageId, instanceRole, instanceTypes, launchTemplate, maxVcpus, minVcpus, securityGroupIds, spotIamFleetRole, subnets, tags, type);
        }
    }
}
