// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.ec2.inputs.LaunchConfigurationEbsBlockDeviceArgs;
import io.pulumi.aws.ec2.inputs.LaunchConfigurationEphemeralBlockDeviceArgs;
import io.pulumi.aws.ec2.inputs.LaunchConfigurationMetadataOptionsArgs;
import io.pulumi.aws.ec2.inputs.LaunchConfigurationRootBlockDeviceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LaunchConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final LaunchConfigurationArgs Empty = new LaunchConfigurationArgs();

    /**
     * Associate a public ip address with an instance in a VPC.
     * 
     */
    @Import(name="associatePublicIpAddress")
      private final @Nullable Output<Boolean> associatePublicIpAddress;

    public Output<Boolean> getAssociatePublicIpAddress() {
        return this.associatePublicIpAddress == null ? Output.empty() : this.associatePublicIpAddress;
    }

    /**
     * Additional EBS block devices to attach to the
     * instance.  See Block Devices below for details.
     * 
     */
    @Import(name="ebsBlockDevices")
      private final @Nullable Output<List<LaunchConfigurationEbsBlockDeviceArgs>> ebsBlockDevices;

    public Output<List<LaunchConfigurationEbsBlockDeviceArgs>> getEbsBlockDevices() {
        return this.ebsBlockDevices == null ? Output.empty() : this.ebsBlockDevices;
    }

    /**
     * If true, the launched EC2 instance will be EBS-optimized.
     * 
     */
    @Import(name="ebsOptimized")
      private final @Nullable Output<Boolean> ebsOptimized;

    public Output<Boolean> getEbsOptimized() {
        return this.ebsOptimized == null ? Output.empty() : this.ebsOptimized;
    }

    /**
     * Enables/disables detailed monitoring. This is enabled by default.
     * 
     */
    @Import(name="enableMonitoring")
      private final @Nullable Output<Boolean> enableMonitoring;

    public Output<Boolean> getEnableMonitoring() {
        return this.enableMonitoring == null ? Output.empty() : this.enableMonitoring;
    }

    /**
     * Customize Ephemeral (also known as
     * "Instance Store") volumes on the instance. See Block Devices below for details.
     * 
     */
    @Import(name="ephemeralBlockDevices")
      private final @Nullable Output<List<LaunchConfigurationEphemeralBlockDeviceArgs>> ephemeralBlockDevices;

    public Output<List<LaunchConfigurationEphemeralBlockDeviceArgs>> getEphemeralBlockDevices() {
        return this.ephemeralBlockDevices == null ? Output.empty() : this.ephemeralBlockDevices;
    }

    /**
     * The name attribute of the IAM instance profile to associate
     * with launched instances.
     * 
     */
    @Import(name="iamInstanceProfile")
      private final @Nullable Output<String> iamInstanceProfile;

    public Output<String> getIamInstanceProfile() {
        return this.iamInstanceProfile == null ? Output.empty() : this.iamInstanceProfile;
    }

    /**
     * The EC2 image ID to launch.
     * 
     */
    @Import(name="imageId", required=true)
      private final Output<String> imageId;

    public Output<String> getImageId() {
        return this.imageId;
    }

    /**
     * The size of instance to launch.
     * 
     */
    @Import(name="instanceType", required=true)
      private final Output<String> instanceType;

    public Output<String> getInstanceType() {
        return this.instanceType;
    }

    /**
     * The key name that should be used for the instance.
     * 
     */
    @Import(name="keyName")
      private final @Nullable Output<String> keyName;

    public Output<String> getKeyName() {
        return this.keyName == null ? Output.empty() : this.keyName;
    }

    /**
     * The metadata options for the instance.
     * 
     */
    @Import(name="metadataOptions")
      private final @Nullable Output<LaunchConfigurationMetadataOptionsArgs> metadataOptions;

    public Output<LaunchConfigurationMetadataOptionsArgs> getMetadataOptions() {
        return this.metadataOptions == null ? Output.empty() : this.metadataOptions;
    }

    /**
     * The name of the launch configuration. If you leave
     * this blank, this provider will auto-generate a unique name. Conflicts with `name_prefix`.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Creates a unique name beginning with the specified
     * prefix. Conflicts with `name`.
     * 
     */
    @Import(name="namePrefix")
      private final @Nullable Output<String> namePrefix;

    public Output<String> getNamePrefix() {
        return this.namePrefix == null ? Output.empty() : this.namePrefix;
    }

    /**
     * The tenancy of the instance. Valid values are
     * `"default"` or `"dedicated"`, see [AWS's Create Launch Configuration](http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_CreateLaunchConfiguration.html)
     * for more details
     * 
     */
    @Import(name="placementTenancy")
      private final @Nullable Output<String> placementTenancy;

    public Output<String> getPlacementTenancy() {
        return this.placementTenancy == null ? Output.empty() : this.placementTenancy;
    }

    /**
     * Customize details about the root block
     * device of the instance. See Block Devices below for details.
     * 
     */
    @Import(name="rootBlockDevice")
      private final @Nullable Output<LaunchConfigurationRootBlockDeviceArgs> rootBlockDevice;

    public Output<LaunchConfigurationRootBlockDeviceArgs> getRootBlockDevice() {
        return this.rootBlockDevice == null ? Output.empty() : this.rootBlockDevice;
    }

    /**
     * A list of associated security group IDS.
     * 
     */
    @Import(name="securityGroups")
      private final @Nullable Output<List<String>> securityGroups;

    public Output<List<String>> getSecurityGroups() {
        return this.securityGroups == null ? Output.empty() : this.securityGroups;
    }

    /**
     * The maximum price to use for reserving spot instances.
     * 
     */
    @Import(name="spotPrice")
      private final @Nullable Output<String> spotPrice;

    public Output<String> getSpotPrice() {
        return this.spotPrice == null ? Output.empty() : this.spotPrice;
    }

    /**
     * The user data to provide when launching the instance. Do not pass gzip-compressed data via this argument; see `user_data_base64` instead.
     * 
     */
    @Import(name="userData")
      private final @Nullable Output<String> userData;

    public Output<String> getUserData() {
        return this.userData == null ? Output.empty() : this.userData;
    }

    /**
     * Can be used instead of `user_data` to pass base64-encoded binary data directly. Use this instead of `user_data` whenever the value is not a valid UTF-8 string. For example, gzip-encoded user data must be base64-encoded and passed via this argument to avoid corruption.
     * 
     */
    @Import(name="userDataBase64")
      private final @Nullable Output<String> userDataBase64;

    public Output<String> getUserDataBase64() {
        return this.userDataBase64 == null ? Output.empty() : this.userDataBase64;
    }

    /**
     * The ID of a ClassicLink-enabled VPC. Only applies to EC2-Classic instances. (eg. `vpc-2730681a`)
     * 
     */
    @Import(name="vpcClassicLinkId")
      private final @Nullable Output<String> vpcClassicLinkId;

    public Output<String> getVpcClassicLinkId() {
        return this.vpcClassicLinkId == null ? Output.empty() : this.vpcClassicLinkId;
    }

    /**
     * The IDs of one or more security groups for the specified ClassicLink-enabled VPC (eg. `sg-46ae3d11`).
     * 
     */
    @Import(name="vpcClassicLinkSecurityGroups")
      private final @Nullable Output<List<String>> vpcClassicLinkSecurityGroups;

    public Output<List<String>> getVpcClassicLinkSecurityGroups() {
        return this.vpcClassicLinkSecurityGroups == null ? Output.empty() : this.vpcClassicLinkSecurityGroups;
    }

    public LaunchConfigurationArgs(
        @Nullable Output<Boolean> associatePublicIpAddress,
        @Nullable Output<List<LaunchConfigurationEbsBlockDeviceArgs>> ebsBlockDevices,
        @Nullable Output<Boolean> ebsOptimized,
        @Nullable Output<Boolean> enableMonitoring,
        @Nullable Output<List<LaunchConfigurationEphemeralBlockDeviceArgs>> ephemeralBlockDevices,
        @Nullable Output<String> iamInstanceProfile,
        Output<String> imageId,
        Output<String> instanceType,
        @Nullable Output<String> keyName,
        @Nullable Output<LaunchConfigurationMetadataOptionsArgs> metadataOptions,
        @Nullable Output<String> name,
        @Nullable Output<String> namePrefix,
        @Nullable Output<String> placementTenancy,
        @Nullable Output<LaunchConfigurationRootBlockDeviceArgs> rootBlockDevice,
        @Nullable Output<List<String>> securityGroups,
        @Nullable Output<String> spotPrice,
        @Nullable Output<String> userData,
        @Nullable Output<String> userDataBase64,
        @Nullable Output<String> vpcClassicLinkId,
        @Nullable Output<List<String>> vpcClassicLinkSecurityGroups) {
        this.associatePublicIpAddress = associatePublicIpAddress;
        this.ebsBlockDevices = ebsBlockDevices;
        this.ebsOptimized = ebsOptimized;
        this.enableMonitoring = enableMonitoring;
        this.ephemeralBlockDevices = ephemeralBlockDevices;
        this.iamInstanceProfile = iamInstanceProfile;
        this.imageId = Objects.requireNonNull(imageId, "expected parameter 'imageId' to be non-null");
        this.instanceType = Objects.requireNonNull(instanceType, "expected parameter 'instanceType' to be non-null");
        this.keyName = keyName;
        this.metadataOptions = metadataOptions;
        this.name = name;
        this.namePrefix = namePrefix;
        this.placementTenancy = placementTenancy;
        this.rootBlockDevice = rootBlockDevice;
        this.securityGroups = securityGroups;
        this.spotPrice = spotPrice;
        this.userData = userData;
        this.userDataBase64 = userDataBase64;
        this.vpcClassicLinkId = vpcClassicLinkId;
        this.vpcClassicLinkSecurityGroups = vpcClassicLinkSecurityGroups;
    }

    private LaunchConfigurationArgs() {
        this.associatePublicIpAddress = Output.empty();
        this.ebsBlockDevices = Output.empty();
        this.ebsOptimized = Output.empty();
        this.enableMonitoring = Output.empty();
        this.ephemeralBlockDevices = Output.empty();
        this.iamInstanceProfile = Output.empty();
        this.imageId = Output.empty();
        this.instanceType = Output.empty();
        this.keyName = Output.empty();
        this.metadataOptions = Output.empty();
        this.name = Output.empty();
        this.namePrefix = Output.empty();
        this.placementTenancy = Output.empty();
        this.rootBlockDevice = Output.empty();
        this.securityGroups = Output.empty();
        this.spotPrice = Output.empty();
        this.userData = Output.empty();
        this.userDataBase64 = Output.empty();
        this.vpcClassicLinkId = Output.empty();
        this.vpcClassicLinkSecurityGroups = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> associatePublicIpAddress;
        private @Nullable Output<List<LaunchConfigurationEbsBlockDeviceArgs>> ebsBlockDevices;
        private @Nullable Output<Boolean> ebsOptimized;
        private @Nullable Output<Boolean> enableMonitoring;
        private @Nullable Output<List<LaunchConfigurationEphemeralBlockDeviceArgs>> ephemeralBlockDevices;
        private @Nullable Output<String> iamInstanceProfile;
        private Output<String> imageId;
        private Output<String> instanceType;
        private @Nullable Output<String> keyName;
        private @Nullable Output<LaunchConfigurationMetadataOptionsArgs> metadataOptions;
        private @Nullable Output<String> name;
        private @Nullable Output<String> namePrefix;
        private @Nullable Output<String> placementTenancy;
        private @Nullable Output<LaunchConfigurationRootBlockDeviceArgs> rootBlockDevice;
        private @Nullable Output<List<String>> securityGroups;
        private @Nullable Output<String> spotPrice;
        private @Nullable Output<String> userData;
        private @Nullable Output<String> userDataBase64;
        private @Nullable Output<String> vpcClassicLinkId;
        private @Nullable Output<List<String>> vpcClassicLinkSecurityGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.associatePublicIpAddress = defaults.associatePublicIpAddress;
    	      this.ebsBlockDevices = defaults.ebsBlockDevices;
    	      this.ebsOptimized = defaults.ebsOptimized;
    	      this.enableMonitoring = defaults.enableMonitoring;
    	      this.ephemeralBlockDevices = defaults.ephemeralBlockDevices;
    	      this.iamInstanceProfile = defaults.iamInstanceProfile;
    	      this.imageId = defaults.imageId;
    	      this.instanceType = defaults.instanceType;
    	      this.keyName = defaults.keyName;
    	      this.metadataOptions = defaults.metadataOptions;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.placementTenancy = defaults.placementTenancy;
    	      this.rootBlockDevice = defaults.rootBlockDevice;
    	      this.securityGroups = defaults.securityGroups;
    	      this.spotPrice = defaults.spotPrice;
    	      this.userData = defaults.userData;
    	      this.userDataBase64 = defaults.userDataBase64;
    	      this.vpcClassicLinkId = defaults.vpcClassicLinkId;
    	      this.vpcClassicLinkSecurityGroups = defaults.vpcClassicLinkSecurityGroups;
        }

        public Builder associatePublicIpAddress(@Nullable Output<Boolean> associatePublicIpAddress) {
            this.associatePublicIpAddress = associatePublicIpAddress;
            return this;
        }

        public Builder associatePublicIpAddress(@Nullable Boolean associatePublicIpAddress) {
            this.associatePublicIpAddress = Output.ofNullable(associatePublicIpAddress);
            return this;
        }

        public Builder ebsBlockDevices(@Nullable Output<List<LaunchConfigurationEbsBlockDeviceArgs>> ebsBlockDevices) {
            this.ebsBlockDevices = ebsBlockDevices;
            return this;
        }

        public Builder ebsBlockDevices(@Nullable List<LaunchConfigurationEbsBlockDeviceArgs> ebsBlockDevices) {
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

        public Builder enableMonitoring(@Nullable Output<Boolean> enableMonitoring) {
            this.enableMonitoring = enableMonitoring;
            return this;
        }

        public Builder enableMonitoring(@Nullable Boolean enableMonitoring) {
            this.enableMonitoring = Output.ofNullable(enableMonitoring);
            return this;
        }

        public Builder ephemeralBlockDevices(@Nullable Output<List<LaunchConfigurationEphemeralBlockDeviceArgs>> ephemeralBlockDevices) {
            this.ephemeralBlockDevices = ephemeralBlockDevices;
            return this;
        }

        public Builder ephemeralBlockDevices(@Nullable List<LaunchConfigurationEphemeralBlockDeviceArgs> ephemeralBlockDevices) {
            this.ephemeralBlockDevices = Output.ofNullable(ephemeralBlockDevices);
            return this;
        }

        public Builder iamInstanceProfile(@Nullable Output<String> iamInstanceProfile) {
            this.iamInstanceProfile = iamInstanceProfile;
            return this;
        }

        public Builder imageId(Output<String> imageId) {
            this.imageId = Objects.requireNonNull(imageId);
            return this;
        }

        public Builder imageId(String imageId) {
            this.imageId = Output.of(Objects.requireNonNull(imageId));
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

        public Builder metadataOptions(@Nullable Output<LaunchConfigurationMetadataOptionsArgs> metadataOptions) {
            this.metadataOptions = metadataOptions;
            return this;
        }

        public Builder metadataOptions(@Nullable LaunchConfigurationMetadataOptionsArgs metadataOptions) {
            this.metadataOptions = Output.ofNullable(metadataOptions);
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

        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }

        public Builder namePrefix(@Nullable String namePrefix) {
            this.namePrefix = Output.ofNullable(namePrefix);
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

        public Builder rootBlockDevice(@Nullable Output<LaunchConfigurationRootBlockDeviceArgs> rootBlockDevice) {
            this.rootBlockDevice = rootBlockDevice;
            return this;
        }

        public Builder rootBlockDevice(@Nullable LaunchConfigurationRootBlockDeviceArgs rootBlockDevice) {
            this.rootBlockDevice = Output.ofNullable(rootBlockDevice);
            return this;
        }

        public Builder securityGroups(@Nullable Output<List<String>> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }

        public Builder securityGroups(@Nullable List<String> securityGroups) {
            this.securityGroups = Output.ofNullable(securityGroups);
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

        public Builder userData(@Nullable Output<String> userData) {
            this.userData = userData;
            return this;
        }

        public Builder userData(@Nullable String userData) {
            this.userData = Output.ofNullable(userData);
            return this;
        }

        public Builder userDataBase64(@Nullable Output<String> userDataBase64) {
            this.userDataBase64 = userDataBase64;
            return this;
        }

        public Builder userDataBase64(@Nullable String userDataBase64) {
            this.userDataBase64 = Output.ofNullable(userDataBase64);
            return this;
        }

        public Builder vpcClassicLinkId(@Nullable Output<String> vpcClassicLinkId) {
            this.vpcClassicLinkId = vpcClassicLinkId;
            return this;
        }

        public Builder vpcClassicLinkId(@Nullable String vpcClassicLinkId) {
            this.vpcClassicLinkId = Output.ofNullable(vpcClassicLinkId);
            return this;
        }

        public Builder vpcClassicLinkSecurityGroups(@Nullable Output<List<String>> vpcClassicLinkSecurityGroups) {
            this.vpcClassicLinkSecurityGroups = vpcClassicLinkSecurityGroups;
            return this;
        }

        public Builder vpcClassicLinkSecurityGroups(@Nullable List<String> vpcClassicLinkSecurityGroups) {
            this.vpcClassicLinkSecurityGroups = Output.ofNullable(vpcClassicLinkSecurityGroups);
            return this;
        }
        public LaunchConfigurationArgs build() {
            return new LaunchConfigurationArgs(associatePublicIpAddress, ebsBlockDevices, ebsOptimized, enableMonitoring, ephemeralBlockDevices, iamInstanceProfile, imageId, instanceType, keyName, metadataOptions, name, namePrefix, placementTenancy, rootBlockDevice, securityGroups, spotPrice, userData, userDataBase64, vpcClassicLinkId, vpcClassicLinkSecurityGroups);
        }
    }
}
