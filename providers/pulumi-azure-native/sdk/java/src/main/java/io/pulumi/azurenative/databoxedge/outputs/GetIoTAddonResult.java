// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.outputs;

import io.pulumi.azurenative.databoxedge.outputs.IoTDeviceInfoResponse;
import io.pulumi.azurenative.databoxedge.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetIoTAddonResult {
    /**
     * Host OS supported by the IoT addon.
     * 
     */
    private final String hostPlatform;
    /**
     * Platform where the runtime is hosted.
     * 
     */
    private final String hostPlatformType;
    /**
     * The path ID that uniquely identifies the object.
     * 
     */
    private final String id;
    /**
     * IoT device metadata to which appliance needs to be connected.
     * 
     */
    private final IoTDeviceInfoResponse ioTDeviceDetails;
    /**
     * IoT edge device to which the IoT Addon needs to be configured.
     * 
     */
    private final IoTDeviceInfoResponse ioTEdgeDeviceDetails;
    /**
     * Addon type.
     * Expected value is 'IotEdge'.
     * 
     */
    private final String kind;
    /**
     * The object name.
     * 
     */
    private final String name;
    /**
     * Addon Provisioning State
     * 
     */
    private final String provisioningState;
    /**
     * Addon type
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The hierarchical type of the object.
     * 
     */
    private final String type;
    /**
     * Version of IoT running on the appliance.
     * 
     */
    private final String version;

    @OutputCustomType.Constructor({"hostPlatform","hostPlatformType","id","ioTDeviceDetails","ioTEdgeDeviceDetails","kind","name","provisioningState","systemData","type","version"})
    private GetIoTAddonResult(
        String hostPlatform,
        String hostPlatformType,
        String id,
        IoTDeviceInfoResponse ioTDeviceDetails,
        IoTDeviceInfoResponse ioTEdgeDeviceDetails,
        String kind,
        String name,
        String provisioningState,
        SystemDataResponse systemData,
        String type,
        String version) {
        this.hostPlatform = Objects.requireNonNull(hostPlatform);
        this.hostPlatformType = Objects.requireNonNull(hostPlatformType);
        this.id = Objects.requireNonNull(id);
        this.ioTDeviceDetails = Objects.requireNonNull(ioTDeviceDetails);
        this.ioTEdgeDeviceDetails = Objects.requireNonNull(ioTEdgeDeviceDetails);
        this.kind = Objects.requireNonNull(kind);
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.systemData = Objects.requireNonNull(systemData);
        this.type = Objects.requireNonNull(type);
        this.version = Objects.requireNonNull(version);
    }

    /**
     * Host OS supported by the IoT addon.
     * 
     */
    public String getHostPlatform() {
        return this.hostPlatform;
    }
    /**
     * Platform where the runtime is hosted.
     * 
     */
    public String getHostPlatformType() {
        return this.hostPlatformType;
    }
    /**
     * The path ID that uniquely identifies the object.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * IoT device metadata to which appliance needs to be connected.
     * 
     */
    public IoTDeviceInfoResponse getIoTDeviceDetails() {
        return this.ioTDeviceDetails;
    }
    /**
     * IoT edge device to which the IoT Addon needs to be configured.
     * 
     */
    public IoTDeviceInfoResponse getIoTEdgeDeviceDetails() {
        return this.ioTEdgeDeviceDetails;
    }
    /**
     * Addon type.
     * Expected value is 'IotEdge'.
     * 
     */
    public String getKind() {
        return this.kind;
    }
    /**
     * The object name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Addon Provisioning State
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Addon type
     * 
     */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * The hierarchical type of the object.
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * Version of IoT running on the appliance.
     * 
     */
    public String getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIoTAddonResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String hostPlatform;
        private String hostPlatformType;
        private String id;
        private IoTDeviceInfoResponse ioTDeviceDetails;
        private IoTDeviceInfoResponse ioTEdgeDeviceDetails;
        private String kind;
        private String name;
        private String provisioningState;
        private SystemDataResponse systemData;
        private String type;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIoTAddonResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostPlatform = defaults.hostPlatform;
    	      this.hostPlatformType = defaults.hostPlatformType;
    	      this.id = defaults.id;
    	      this.ioTDeviceDetails = defaults.ioTDeviceDetails;
    	      this.ioTEdgeDeviceDetails = defaults.ioTEdgeDeviceDetails;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder setHostPlatform(String hostPlatform) {
            this.hostPlatform = Objects.requireNonNull(hostPlatform);
            return this;
        }

        public Builder setHostPlatformType(String hostPlatformType) {
            this.hostPlatformType = Objects.requireNonNull(hostPlatformType);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIoTDeviceDetails(IoTDeviceInfoResponse ioTDeviceDetails) {
            this.ioTDeviceDetails = Objects.requireNonNull(ioTDeviceDetails);
            return this;
        }

        public Builder setIoTEdgeDeviceDetails(IoTDeviceInfoResponse ioTEdgeDeviceDetails) {
            this.ioTEdgeDeviceDetails = Objects.requireNonNull(ioTEdgeDeviceDetails);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public GetIoTAddonResult build() {
            return new GetIoTAddonResult(hostPlatform, hostPlatformType, id, ioTDeviceDetails, ioTEdgeDeviceDetails, kind, name, provisioningState, systemData, type, version);
        }
    }
}
