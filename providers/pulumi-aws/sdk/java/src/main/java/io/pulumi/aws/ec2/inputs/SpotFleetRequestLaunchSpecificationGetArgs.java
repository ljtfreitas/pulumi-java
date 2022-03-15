// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchSpecificationEbsBlockDeviceGetArgs;
import io.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchSpecificationEphemeralBlockDeviceGetArgs;
import io.pulumi.aws.ec2.inputs.SpotFleetRequestLaunchSpecificationRootBlockDeviceGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SpotFleetRequestLaunchSpecificationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SpotFleetRequestLaunchSpecificationGetArgs Empty = new SpotFleetRequestLaunchSpecificationGetArgs();

    @Import(name="ami", required=true)
      private final Output<String> ami;

    public Output<String> getAmi() {
        return this.ami;
    }

    @Import(name="associatePublicIpAddress")
      private final @Nullable Output<Boolean> associatePublicIpAddress;

    public Output<Boolean> getAssociatePublicIpAddress() {
        return this.associatePublicIpAddress == null ? Output.empty() : this.associatePublicIpAddress;
    }

    /**
     * The availability zone in which to place the request.
     * 
     */
    @Import(name="availabilityZone")
      private final @Nullable Output<String> availabilityZone;

    public Output<String> getAvailabilityZone() {
        return this.availabilityZone == null ? Output.empty() : this.availabilityZone;
    }

    @Import(name="ebsBlockDevices")
      private final @Nullable Output<List<SpotFleetRequestLaunchSpecificationEbsBlockDeviceGetArgs>> ebsBlockDevices;

    public Output<List<SpotFleetRequestLaunchSpecificationEbsBlockDeviceGetArgs>> getEbsBlockDevices() {
        return this.ebsBlockDevices == null ? Output.empty() : this.ebsBlockDevices;
    }

    @Import(name="ebsOptimized")
      private final @Nullable Output<Boolean> ebsOptimized;

    public Output<Boolean> getEbsOptimized() {
        return this.ebsOptimized == null ? Output.empty() : this.ebsOptimized;
    }

    @Import(name="ephemeralBlockDevices")
      private final @Nullable Output<List<SpotFleetRequestLaunchSpecificationEphemeralBlockDeviceGetArgs>> ephemeralBlockDevices;

    public Output<List<SpotFleetRequestLaunchSpecificationEphemeralBlockDeviceGetArgs>> getEphemeralBlockDevices() {
        return this.ephemeralBlockDevices == null ? Output.empty() : this.ephemeralBlockDevices;
    }

    @Import(name="iamInstanceProfile")
      private final @Nullable Output<String> iamInstanceProfile;

    public Output<String> getIamInstanceProfile() {
        return this.iamInstanceProfile == null ? Output.empty() : this.iamInstanceProfile;
    }

    @Import(name="iamInstanceProfileArn")
      private final @Nullable Output<String> iamInstanceProfileArn;

    public Output<String> getIamInstanceProfileArn() {
        return this.iamInstanceProfileArn == null ? Output.empty() : this.iamInstanceProfileArn;
    }

    /**
     * The type of instance to request.
     * 
     */
    @Import(name="instanceType", required=true)
      private final Output<String> instanceType;

    public Output<String> getInstanceType() {
        return this.instanceType;
    }

    @Import(name="keyName")
      private final @Nullable Output<String> keyName;

    public Output<String> getKeyName() {
        return this.keyName == null ? Output.empty() : this.keyName;
    }

    @Import(name="monitoring")
      private final @Nullable Output<Boolean> monitoring;

    public Output<Boolean> getMonitoring() {
        return this.monitoring == null ? Output.empty() : this.monitoring;
    }

    @Import(name="placementGroup")
      private final @Nullable Output<String> placementGroup;

    public Output<String> getPlacementGroup() {
        return this.placementGroup == null ? Output.empty() : this.placementGroup;
    }

    @Import(name="placementTenancy")
      private final @Nullable Output<String> placementTenancy;

    public Output<String> getPlacementTenancy() {
        return this.placementTenancy == null ? Output.empty() : this.placementTenancy;
    }

    @Import(name="rootBlockDevices")
      private final @Nullable Output<List<SpotFleetRequestLaunchSpecificationRootBlockDeviceGetArgs>> rootBlockDevices;

    public Output<List<SpotFleetRequestLaunchSpecificationRootBlockDeviceGetArgs>> getRootBlockDevices() {
        return this.rootBlockDevices == null ? Output.empty() : this.rootBlockDevices;
    }

    /**
     * The maximum spot bid for this override request.
     * 
     */
    @Import(name="spotPrice")
      private final @Nullable Output<String> spotPrice;

    public Output<String> getSpotPrice() {
        return this.spotPrice == null ? Output.empty() : this.spotPrice;
    }

    /**
     * The subnet in which to launch the requested instance.
     * 
     */
    @Import(name="subnetId")
      private final @Nullable Output<String> subnetId;

    public Output<String> getSubnetId() {
        return this.subnetId == null ? Output.empty() : this.subnetId;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    @Import(name="userData")
      private final @Nullable Output<String> userData;

    public Output<String> getUserData() {
        return this.userData == null ? Output.empty() : this.userData;
    }

    @Import(name="vpcSecurityGroupIds")
      private final @Nullable Output<List<String>> vpcSecurityGroupIds;

    public Output<List<String>> getVpcSecurityGroupIds() {
        return this.vpcSecurityGroupIds == null ? Output.empty() : this.vpcSecurityGroupIds;
    }

    /**
     * The capacity added to the fleet by a fulfilled request.
     * 
     */
    @Import(name="weightedCapacity")
      private final @Nullable Output<String> weightedCapacity;

    public Output<String> getWeightedCapacity() {
        return this.weightedCapacity == null ? Output.empty() : this.weightedCapacity;
    }

    public SpotFleetRequestLaunchSpecificationGetArgs(
        Output<String> ami,
        @Nullable Output<Boolean> associatePublicIpAddress,
        @Nullable Output<String> availabilityZone,
        @Nullable Output<List<SpotFleetRequestLaunchSpecificationEbsBlockDeviceGetArgs>> ebsBlockDevices,
        @Nullable Output<Boolean> ebsOptimized,
        @Nullable Output<List<SpotFleetRequestLaunchSpecificationEphemeralBlockDeviceGetArgs>> ephemeralBlockDevices,
        @Nullable Output<String> iamInstanceProfile,
        @Nullable Output<String> iamInstanceProfileArn,
        Output<String> instanceType,
        @Nullable Output<String> keyName,
        @Nullable Output<Boolean> monitoring,
        @Nullable Output<String> placementGroup,
        @Nullable Output<String> placementTenancy,
        @Nullable Output<List<SpotFleetRequestLaunchSpecificationRootBlockDeviceGetArgs>> rootBlockDevices,
        @Nullable Output<String> spotPrice,
        @Nullable Output<String> subnetId,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> userData,
        @Nullable Output<List<String>> vpcSecurityGroupIds,
        @Nullable Output<String> weightedCapacity) {
        this.ami = Objects.requireNonNull(ami, "expected parameter 'ami' to be non-null");
        this.associatePublicIpAddress = associatePublicIpAddress;
        this.availabilityZone = availabilityZone;
        this.ebsBlockDevices = ebsBlockDevices;
        this.ebsOptimized = ebsOptimized;
        this.ephemeralBlockDevices = ephemeralBlockDevices;
        this.iamInstanceProfile = iamInstanceProfile;
        this.iamInstanceProfileArn = iamInstanceProfileArn;
        this.instanceType = Objects.requireNonNull(instanceType, "expected parameter 'instanceType' to be non-null");
        this.keyName = keyName;
        this.monitoring = monitoring;
        this.placementGroup = placementGroup;
        this.placementTenancy = placementTenancy;
        this.rootBlockDevices = rootBlockDevices;
        this.spotPrice = spotPrice;
        this.subnetId = subnetId;
        this.tags = tags;
        this.userData = userData;
        this.vpcSecurityGroupIds = vpcSecurityGroupIds;
        this.weightedCapacity = weightedCapacity;
    }

    private SpotFleetRequestLaunchSpecificationGetArgs() {
        this.ami = Output.empty();
        this.associatePublicIpAddress = Output.empty();
        this.availabilityZone = Output.empty();
        this.ebsBlockDevices = Output.empty();
        this.ebsOptimized = Output.empty();
        this.ephemeralBlockDevices = Output.empty();
        this.iamInstanceProfile = Output.empty();
        this.iamInstanceProfileArn = Output.empty();
        this.instanceType = Output.empty();
        this.keyName = Output.empty();
        this.monitoring = Output.empty();
        this.placementGroup = Output.empty();
        this.placementTenancy = Output.empty();
        this.rootBlockDevices = Output.empty();
        this.spotPrice = Output.empty();
        this.subnetId = Output.empty();
        this.tags = Output.empty();
        this.userData = Output.empty();
        this.vpcSecurityGroupIds = Output.empty();
        this.weightedCapacity = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetRequestLaunchSpecificationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> ami;
        private @Nullable Output<Boolean> associatePublicIpAddress;
        private @Nullable Output<String> availabilityZone;
        private @Nullable Output<List<SpotFleetRequestLaunchSpecificationEbsBlockDeviceGetArgs>> ebsBlockDevices;
        private @Nullable Output<Boolean> ebsOptimized;
        private @Nullable Output<List<SpotFleetRequestLaunchSpecificationEphemeralBlockDeviceGetArgs>> ephemeralBlockDevices;
        private @Nullable Output<String> iamInstanceProfile;
        private @Nullable Output<String> iamInstanceProfileArn;
        private Output<String> instanceType;
        private @Nullable Output<String> keyName;
        private @Nullable Output<Boolean> monitoring;
        private @Nullable Output<String> placementGroup;
        private @Nullable Output<String> placementTenancy;
        private @Nullable Output<List<SpotFleetRequestLaunchSpecificationRootBlockDeviceGetArgs>> rootBlockDevices;
        private @Nullable Output<String> spotPrice;
        private @Nullable Output<String> subnetId;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> userData;
        private @Nullable Output<List<String>> vpcSecurityGroupIds;
        private @Nullable Output<String> weightedCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetRequestLaunchSpecificationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ami = defaults.ami;
    	      this.associatePublicIpAddress = defaults.associatePublicIpAddress;
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.ebsBlockDevices = defaults.ebsBlockDevices;
    	      this.ebsOptimized = defaults.ebsOptimized;
    	      this.ephemeralBlockDevices = defaults.ephemeralBlockDevices;
    	      this.iamInstanceProfile = defaults.iamInstanceProfile;
    	      this.iamInstanceProfileArn = defaults.iamInstanceProfileArn;
    	      this.instanceType = defaults.instanceType;
    	      this.keyName = defaults.keyName;
    	      this.monitoring = defaults.monitoring;
    	      this.placementGroup = defaults.placementGroup;
    	      this.placementTenancy = defaults.placementTenancy;
    	      this.rootBlockDevices = defaults.rootBlockDevices;
    	      this.spotPrice = defaults.spotPrice;
    	      this.subnetId = defaults.subnetId;
    	      this.tags = defaults.tags;
    	      this.userData = defaults.userData;
    	      this.vpcSecurityGroupIds = defaults.vpcSecurityGroupIds;
    	      this.weightedCapacity = defaults.weightedCapacity;
        }

        public Builder ami(Output<String> ami) {
            this.ami = Objects.requireNonNull(ami);
            return this;
        }

        public Builder ami(String ami) {
            this.ami = Output.of(Objects.requireNonNull(ami));
            return this;
        }

        public Builder associatePublicIpAddress(@Nullable Output<Boolean> associatePublicIpAddress) {
            this.associatePublicIpAddress = associatePublicIpAddress;
            return this;
        }

        public Builder associatePublicIpAddress(@Nullable Boolean associatePublicIpAddress) {
            this.associatePublicIpAddress = Output.ofNullable(associatePublicIpAddress);
            return this;
        }

        public Builder availabilityZone(@Nullable Output<String> availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }

        public Builder availabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = Output.ofNullable(availabilityZone);
            return this;
        }

        public Builder ebsBlockDevices(@Nullable Output<List<SpotFleetRequestLaunchSpecificationEbsBlockDeviceGetArgs>> ebsBlockDevices) {
            this.ebsBlockDevices = ebsBlockDevices;
            return this;
        }

        public Builder ebsBlockDevices(@Nullable List<SpotFleetRequestLaunchSpecificationEbsBlockDeviceGetArgs> ebsBlockDevices) {
            this.ebsBlockDevices = Output.ofNullable(ebsBlockDevices);
            return this;
        }

        public Builder ebsOptimized(@Nullable Output<Boolean> ebsOptimized) {
            this.ebsOptimized = ebsOptimized;
            return this;
        }

        public Builder ebsOptimized(@Nullable Boolean ebsOptimized) {
            this.ebsOptimized = Output.ofNullable(ebsOptimized);
            return this;
        }

        public Builder ephemeralBlockDevices(@Nullable Output<List<SpotFleetRequestLaunchSpecificationEphemeralBlockDeviceGetArgs>> ephemeralBlockDevices) {
            this.ephemeralBlockDevices = ephemeralBlockDevices;
            return this;
        }

        public Builder ephemeralBlockDevices(@Nullable List<SpotFleetRequestLaunchSpecificationEphemeralBlockDeviceGetArgs> ephemeralBlockDevices) {
            this.ephemeralBlockDevices = Output.ofNullable(ephemeralBlockDevices);
            return this;
        }

        public Builder iamInstanceProfile(@Nullable Output<String> iamInstanceProfile) {
            this.iamInstanceProfile = iamInstanceProfile;
            return this;
        }

        public Builder iamInstanceProfile(@Nullable String iamInstanceProfile) {
            this.iamInstanceProfile = Output.ofNullable(iamInstanceProfile);
            return this;
        }

        public Builder iamInstanceProfileArn(@Nullable Output<String> iamInstanceProfileArn) {
            this.iamInstanceProfileArn = iamInstanceProfileArn;
            return this;
        }

        public Builder iamInstanceProfileArn(@Nullable String iamInstanceProfileArn) {
            this.iamInstanceProfileArn = Output.ofNullable(iamInstanceProfileArn);
            return this;
        }

        public Builder instanceType(Output<String> instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder instanceType(String instanceType) {
            this.instanceType = Output.of(Objects.requireNonNull(instanceType));
            return this;
        }

        public Builder keyName(@Nullable Output<String> keyName) {
            this.keyName = keyName;
            return this;
        }

        public Builder keyName(@Nullable String keyName) {
            this.keyName = Output.ofNullable(keyName);
            return this;
        }

        public Builder monitoring(@Nullable Output<Boolean> monitoring) {
            this.monitoring = monitoring;
            return this;
        }

        public Builder monitoring(@Nullable Boolean monitoring) {
            this.monitoring = Output.ofNullable(monitoring);
            return this;
        }

        public Builder placementGroup(@Nullable Output<String> placementGroup) {
            this.placementGroup = placementGroup;
            return this;
        }

        public Builder placementGroup(@Nullable String placementGroup) {
            this.placementGroup = Output.ofNullable(placementGroup);
            return this;
        }

        public Builder placementTenancy(@Nullable Output<String> placementTenancy) {
            this.placementTenancy = placementTenancy;
            return this;
        }

        public Builder placementTenancy(@Nullable String placementTenancy) {
            this.placementTenancy = Output.ofNullable(placementTenancy);
            return this;
        }

        public Builder rootBlockDevices(@Nullable Output<List<SpotFleetRequestLaunchSpecificationRootBlockDeviceGetArgs>> rootBlockDevices) {
            this.rootBlockDevices = rootBlockDevices;
            return this;
        }

        public Builder rootBlockDevices(@Nullable List<SpotFleetRequestLaunchSpecificationRootBlockDeviceGetArgs> rootBlockDevices) {
            this.rootBlockDevices = Output.ofNullable(rootBlockDevices);
            return this;
        }

        public Builder spotPrice(@Nullable Output<String> spotPrice) {
            this.spotPrice = spotPrice;
            return this;
        }

        public Builder spotPrice(@Nullable String spotPrice) {
            this.spotPrice = Output.ofNullable(spotPrice);
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

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder userData(@Nullable Output<String> userData) {
            this.userData = userData;
            return this;
        }

        public Builder userData(@Nullable String userData) {
            this.userData = Output.ofNullable(userData);
            return this;
        }

        public Builder vpcSecurityGroupIds(@Nullable Output<List<String>> vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds = vpcSecurityGroupIds;
            return this;
        }

        public Builder vpcSecurityGroupIds(@Nullable List<String> vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds = Output.ofNullable(vpcSecurityGroupIds);
            return this;
        }

        public Builder weightedCapacity(@Nullable Output<String> weightedCapacity) {
            this.weightedCapacity = weightedCapacity;
            return this;
        }

        public Builder weightedCapacity(@Nullable String weightedCapacity) {
            this.weightedCapacity = Output.ofNullable(weightedCapacity);
            return this;
        }
        public SpotFleetRequestLaunchSpecificationGetArgs build() {
            return new SpotFleetRequestLaunchSpecificationGetArgs(ami, associatePublicIpAddress, availabilityZone, ebsBlockDevices, ebsOptimized, ephemeralBlockDevices, iamInstanceProfile, iamInstanceProfileArn, instanceType, keyName, monitoring, placementGroup, placementTenancy, rootBlockDevices, spotPrice, subnetId, tags, userData, vpcSecurityGroupIds, weightedCapacity);
        }
    }
}
