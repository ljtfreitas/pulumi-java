// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class GetAmiBlockDeviceMapping extends io.pulumi.resources.InvokeArgs {

    public static final GetAmiBlockDeviceMapping Empty = new GetAmiBlockDeviceMapping();

    /**
     * The physical name of the device.
     * 
     */
    @InputImport(name="deviceName", required=true)
    private final String deviceName;

    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * Map containing EBS information, if the device is EBS based. Unlike most object attributes, these are accessed directly (e.g., `ebs.volume_size` or `ebs["volume_size"]`) rather than accessed through the first element of a list (e.g., `ebs[0].volume_size`).
     * 
     */
    @InputImport(name="ebs", required=true)
    private final Map<String,String> ebs;

    public Map<String,String> getEbs() {
        return this.ebs;
    }

    /**
     * Suppresses the specified device included in the block device mapping of the AMI.
     * 
     */
    @InputImport(name="noDevice", required=true)
    private final String noDevice;

    public String getNoDevice() {
        return this.noDevice;
    }

    /**
     * The virtual device name (for instance stores).
     * 
     */
    @InputImport(name="virtualName", required=true)
    private final String virtualName;

    public String getVirtualName() {
        return this.virtualName;
    }

    public GetAmiBlockDeviceMapping(
        String deviceName,
        Map<String,String> ebs,
        String noDevice,
        String virtualName) {
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.ebs = Objects.requireNonNull(ebs, "expected parameter 'ebs' to be non-null");
        this.noDevice = Objects.requireNonNull(noDevice, "expected parameter 'noDevice' to be non-null");
        this.virtualName = Objects.requireNonNull(virtualName, "expected parameter 'virtualName' to be non-null");
    }

    private GetAmiBlockDeviceMapping() {
        this.deviceName = null;
        this.ebs = Map.of();
        this.noDevice = null;
        this.virtualName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAmiBlockDeviceMapping defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deviceName;
        private Map<String,String> ebs;
        private String noDevice;
        private String virtualName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAmiBlockDeviceMapping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.ebs = defaults.ebs;
    	      this.noDevice = defaults.noDevice;
    	      this.virtualName = defaults.virtualName;
        }

        public Builder setDeviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder setEbs(Map<String,String> ebs) {
            this.ebs = Objects.requireNonNull(ebs);
            return this;
        }

        public Builder setNoDevice(String noDevice) {
            this.noDevice = Objects.requireNonNull(noDevice);
            return this;
        }

        public Builder setVirtualName(String virtualName) {
            this.virtualName = Objects.requireNonNull(virtualName);
            return this;
        }
        public GetAmiBlockDeviceMapping build() {
            return new GetAmiBlockDeviceMapping(deviceName, ebs, noDevice, virtualName);
        }
    }
}
