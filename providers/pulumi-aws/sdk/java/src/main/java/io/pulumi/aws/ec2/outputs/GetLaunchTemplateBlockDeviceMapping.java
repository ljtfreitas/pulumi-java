// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.aws.ec2.outputs.GetLaunchTemplateBlockDeviceMappingEb;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetLaunchTemplateBlockDeviceMapping {
    private final String deviceName;
    private final List<GetLaunchTemplateBlockDeviceMappingEb> ebs;
    private final String noDevice;
    private final String virtualName;

    @CustomType.Constructor
    private GetLaunchTemplateBlockDeviceMapping(
        @CustomType.Parameter("deviceName") String deviceName,
        @CustomType.Parameter("ebs") List<GetLaunchTemplateBlockDeviceMappingEb> ebs,
        @CustomType.Parameter("noDevice") String noDevice,
        @CustomType.Parameter("virtualName") String virtualName) {
        this.deviceName = deviceName;
        this.ebs = ebs;
        this.noDevice = noDevice;
        this.virtualName = virtualName;
    }

    public String getDeviceName() {
        return this.deviceName;
    }
    public List<GetLaunchTemplateBlockDeviceMappingEb> getEbs() {
        return this.ebs;
    }
    public String getNoDevice() {
        return this.noDevice;
    }
    public String getVirtualName() {
        return this.virtualName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLaunchTemplateBlockDeviceMapping defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deviceName;
        private List<GetLaunchTemplateBlockDeviceMappingEb> ebs;
        private String noDevice;
        private String virtualName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLaunchTemplateBlockDeviceMapping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.ebs = defaults.ebs;
    	      this.noDevice = defaults.noDevice;
    	      this.virtualName = defaults.virtualName;
        }

        public Builder deviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder ebs(List<GetLaunchTemplateBlockDeviceMappingEb> ebs) {
            this.ebs = Objects.requireNonNull(ebs);
            return this;
        }

        public Builder noDevice(String noDevice) {
            this.noDevice = Objects.requireNonNull(noDevice);
            return this;
        }

        public Builder virtualName(String virtualName) {
            this.virtualName = Objects.requireNonNull(virtualName);
            return this;
        }
        public GetLaunchTemplateBlockDeviceMapping build() {
            return new GetLaunchTemplateBlockDeviceMapping(deviceName, ebs, noDevice, virtualName);
        }
    }
}
