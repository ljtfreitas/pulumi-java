// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.batch.outputs;

import io.pulumi.aws.batch.outputs.ComputeEnvironmentComputeResourcesEc2Configuration;
import io.pulumi.aws.batch.outputs.ComputeEnvironmentComputeResourcesLaunchTemplate;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ComputeEnvironmentComputeResources {
    /**
     * The allocation strategy to use for the compute resource in case not enough instances of the best fitting instance type can be allocated. Valid items are `BEST_FIT_PROGRESSIVE`, `SPOT_CAPACITY_OPTIMIZED` or `BEST_FIT`. Defaults to `BEST_FIT`. See [AWS docs](https://docs.aws.amazon.com/batch/latest/userguide/allocation-strategies.html) for details. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     * 
     */
    private final @Nullable String allocationStrategy;
    /**
     * Integer of maximum percentage that a Spot Instance price can be when compared with the On-Demand price for that instance type before instances are launched. For example, if your bid percentage is 20% (`20`), then the Spot price must be below 20% of the current On-Demand price for that EC2 instance. If you leave this field empty, the default value is 100% of the On-Demand price. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     * 
     */
    private final @Nullable Integer bidPercentage;
    /**
     * The desired number of EC2 vCPUS in the compute environment. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     * 
     */
    private final @Nullable Integer desiredVcpus;
    /**
     * Provides information used to select Amazon Machine Images (AMIs) for EC2 instances in the compute environment. If Ec2Configuration isn't specified, the default is ECS_AL2. This parameter isn't applicable to jobs that are running on Fargate resources, and shouldn't be specified.
     * 
     */
    private final @Nullable ComputeEnvironmentComputeResourcesEc2Configuration ec2Configuration;
    /**
     * The EC2 key pair that is used for instances launched in the compute environment. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     * 
     */
    private final @Nullable String ec2KeyPair;
    /**
     * The Amazon Machine Image (AMI) ID used for instances launched in the compute environment. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified. (Deprecated, use `image_id_override` instead)
     * 
     */
    private final @Nullable String imageId;
    /**
     * The Amazon ECS instance role applied to Amazon EC2 instances in a compute environment. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     * 
     */
    private final @Nullable String instanceRole;
    /**
     * A list of instance types that may be launched. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     * 
     */
    private final @Nullable List<String> instanceTypes;
    /**
     * The launch template to use for your compute resources. See details below. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     * 
     */
    private final @Nullable ComputeEnvironmentComputeResourcesLaunchTemplate launchTemplate;
    /**
     * The maximum number of EC2 vCPUs that an environment can reach.
     * 
     */
    private final Integer maxVcpus;
    /**
     * The minimum number of EC2 vCPUs that an environment should maintain. For `EC2` or `SPOT` compute environments, if the parameter is not explicitly defined, a `0` default value will be set. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     * 
     */
    private final @Nullable Integer minVcpus;
    /**
     * A list of EC2 security group that are associated with instances launched in the compute environment.
     * 
     */
    private final List<String> securityGroupIds;
    /**
     * The Amazon Resource Name (ARN) of the Amazon EC2 Spot Fleet IAM role applied to a SPOT compute environment. This parameter is required for SPOT compute environments. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     * 
     */
    private final @Nullable String spotIamFleetRole;
    /**
     * A list of VPC subnets into which the compute resources are launched.
     * 
     */
    private final List<String> subnets;
    /**
     * Key-value pair tags to be applied to resources that are launched in the compute environment. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of compute environment. Valid items are `EC2`, `SPOT`, `FARGATE` or `FARGATE_SPOT`.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private ComputeEnvironmentComputeResources(
        @CustomType.Parameter("allocationStrategy") @Nullable String allocationStrategy,
        @CustomType.Parameter("bidPercentage") @Nullable Integer bidPercentage,
        @CustomType.Parameter("desiredVcpus") @Nullable Integer desiredVcpus,
        @CustomType.Parameter("ec2Configuration") @Nullable ComputeEnvironmentComputeResourcesEc2Configuration ec2Configuration,
        @CustomType.Parameter("ec2KeyPair") @Nullable String ec2KeyPair,
        @CustomType.Parameter("imageId") @Nullable String imageId,
        @CustomType.Parameter("instanceRole") @Nullable String instanceRole,
        @CustomType.Parameter("instanceTypes") @Nullable List<String> instanceTypes,
        @CustomType.Parameter("launchTemplate") @Nullable ComputeEnvironmentComputeResourcesLaunchTemplate launchTemplate,
        @CustomType.Parameter("maxVcpus") Integer maxVcpus,
        @CustomType.Parameter("minVcpus") @Nullable Integer minVcpus,
        @CustomType.Parameter("securityGroupIds") List<String> securityGroupIds,
        @CustomType.Parameter("spotIamFleetRole") @Nullable String spotIamFleetRole,
        @CustomType.Parameter("subnets") List<String> subnets,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.allocationStrategy = allocationStrategy;
        this.bidPercentage = bidPercentage;
        this.desiredVcpus = desiredVcpus;
        this.ec2Configuration = ec2Configuration;
        this.ec2KeyPair = ec2KeyPair;
        this.imageId = imageId;
        this.instanceRole = instanceRole;
        this.instanceTypes = instanceTypes;
        this.launchTemplate = launchTemplate;
        this.maxVcpus = maxVcpus;
        this.minVcpus = minVcpus;
        this.securityGroupIds = securityGroupIds;
        this.spotIamFleetRole = spotIamFleetRole;
        this.subnets = subnets;
        this.tags = tags;
        this.type = type;
    }

    /**
     * The allocation strategy to use for the compute resource in case not enough instances of the best fitting instance type can be allocated. Valid items are `BEST_FIT_PROGRESSIVE`, `SPOT_CAPACITY_OPTIMIZED` or `BEST_FIT`. Defaults to `BEST_FIT`. See [AWS docs](https://docs.aws.amazon.com/batch/latest/userguide/allocation-strategies.html) for details. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     * 
    */
    public Optional<String> getAllocationStrategy() {
        return Optional.ofNullable(this.allocationStrategy);
    }
    /**
     * Integer of maximum percentage that a Spot Instance price can be when compared with the On-Demand price for that instance type before instances are launched. For example, if your bid percentage is 20% (`20`), then the Spot price must be below 20% of the current On-Demand price for that EC2 instance. If you leave this field empty, the default value is 100% of the On-Demand price. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     * 
    */
    public Optional<Integer> getBidPercentage() {
        return Optional.ofNullable(this.bidPercentage);
    }
    /**
     * The desired number of EC2 vCPUS in the compute environment. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     * 
    */
    public Optional<Integer> getDesiredVcpus() {
        return Optional.ofNullable(this.desiredVcpus);
    }
    /**
     * Provides information used to select Amazon Machine Images (AMIs) for EC2 instances in the compute environment. If Ec2Configuration isn't specified, the default is ECS_AL2. This parameter isn't applicable to jobs that are running on Fargate resources, and shouldn't be specified.
     * 
    */
    public Optional<ComputeEnvironmentComputeResourcesEc2Configuration> getEc2Configuration() {
        return Optional.ofNullable(this.ec2Configuration);
    }
    /**
     * The EC2 key pair that is used for instances launched in the compute environment. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     * 
    */
    public Optional<String> getEc2KeyPair() {
        return Optional.ofNullable(this.ec2KeyPair);
    }
    /**
     * The Amazon Machine Image (AMI) ID used for instances launched in the compute environment. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified. (Deprecated, use `image_id_override` instead)
     * 
    */
    public Optional<String> getImageId() {
        return Optional.ofNullable(this.imageId);
    }
    /**
     * The Amazon ECS instance role applied to Amazon EC2 instances in a compute environment. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     * 
    */
    public Optional<String> getInstanceRole() {
        return Optional.ofNullable(this.instanceRole);
    }
    /**
     * A list of instance types that may be launched. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     * 
    */
    public List<String> getInstanceTypes() {
        return this.instanceTypes == null ? List.of() : this.instanceTypes;
    }
    /**
     * The launch template to use for your compute resources. See details below. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     * 
    */
    public Optional<ComputeEnvironmentComputeResourcesLaunchTemplate> getLaunchTemplate() {
        return Optional.ofNullable(this.launchTemplate);
    }
    /**
     * The maximum number of EC2 vCPUs that an environment can reach.
     * 
    */
    public Integer getMaxVcpus() {
        return this.maxVcpus;
    }
    /**
     * The minimum number of EC2 vCPUs that an environment should maintain. For `EC2` or `SPOT` compute environments, if the parameter is not explicitly defined, a `0` default value will be set. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     * 
    */
    public Optional<Integer> getMinVcpus() {
        return Optional.ofNullable(this.minVcpus);
    }
    /**
     * A list of EC2 security group that are associated with instances launched in the compute environment.
     * 
    */
    public List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }
    /**
     * The Amazon Resource Name (ARN) of the Amazon EC2 Spot Fleet IAM role applied to a SPOT compute environment. This parameter is required for SPOT compute environments. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     * 
    */
    public Optional<String> getSpotIamFleetRole() {
        return Optional.ofNullable(this.spotIamFleetRole);
    }
    /**
     * A list of VPC subnets into which the compute resources are launched.
     * 
    */
    public List<String> getSubnets() {
        return this.subnets;
    }
    /**
     * Key-value pair tags to be applied to resources that are launched in the compute environment. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of compute environment. Valid items are `EC2`, `SPOT`, `FARGATE` or `FARGATE_SPOT`.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeEnvironmentComputeResources defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String allocationStrategy;
        private @Nullable Integer bidPercentage;
        private @Nullable Integer desiredVcpus;
        private @Nullable ComputeEnvironmentComputeResourcesEc2Configuration ec2Configuration;
        private @Nullable String ec2KeyPair;
        private @Nullable String imageId;
        private @Nullable String instanceRole;
        private @Nullable List<String> instanceTypes;
        private @Nullable ComputeEnvironmentComputeResourcesLaunchTemplate launchTemplate;
        private Integer maxVcpus;
        private @Nullable Integer minVcpus;
        private List<String> securityGroupIds;
        private @Nullable String spotIamFleetRole;
        private List<String> subnets;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeEnvironmentComputeResources defaults) {
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

        public Builder allocationStrategy(@Nullable String allocationStrategy) {
            this.allocationStrategy = allocationStrategy;
            return this;
        }

        public Builder bidPercentage(@Nullable Integer bidPercentage) {
            this.bidPercentage = bidPercentage;
            return this;
        }

        public Builder desiredVcpus(@Nullable Integer desiredVcpus) {
            this.desiredVcpus = desiredVcpus;
            return this;
        }

        public Builder ec2Configuration(@Nullable ComputeEnvironmentComputeResourcesEc2Configuration ec2Configuration) {
            this.ec2Configuration = ec2Configuration;
            return this;
        }

        public Builder ec2KeyPair(@Nullable String ec2KeyPair) {
            this.ec2KeyPair = ec2KeyPair;
            return this;
        }

        public Builder imageId(@Nullable String imageId) {
            this.imageId = imageId;
            return this;
        }

        public Builder instanceRole(@Nullable String instanceRole) {
            this.instanceRole = instanceRole;
            return this;
        }

        public Builder instanceTypes(@Nullable List<String> instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }

        public Builder launchTemplate(@Nullable ComputeEnvironmentComputeResourcesLaunchTemplate launchTemplate) {
            this.launchTemplate = launchTemplate;
            return this;
        }

        public Builder maxVcpus(Integer maxVcpus) {
            this.maxVcpus = Objects.requireNonNull(maxVcpus);
            return this;
        }

        public Builder minVcpus(@Nullable Integer minVcpus) {
            this.minVcpus = minVcpus;
            return this;
        }

        public Builder securityGroupIds(List<String> securityGroupIds) {
            this.securityGroupIds = Objects.requireNonNull(securityGroupIds);
            return this;
        }

        public Builder spotIamFleetRole(@Nullable String spotIamFleetRole) {
            this.spotIamFleetRole = spotIamFleetRole;
            return this;
        }

        public Builder subnets(List<String> subnets) {
            this.subnets = Objects.requireNonNull(subnets);
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ComputeEnvironmentComputeResources build() {
            return new ComputeEnvironmentComputeResources(allocationStrategy, bidPercentage, desiredVcpus, ec2Configuration, ec2KeyPair, imageId, instanceRole, instanceTypes, launchTemplate, maxVcpus, minVcpus, securityGroupIds, spotIamFleetRole, subnets, tags, type);
        }
    }
}
