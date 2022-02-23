// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.outputs;

import io.pulumi.azurenative.databoxedge.outputs.ComputeResourceResponse;
import io.pulumi.azurenative.databoxedge.outputs.IoTDeviceInfoResponse;
import io.pulumi.azurenative.databoxedge.outputs.IoTEdgeAgentInfoResponse;
import io.pulumi.azurenative.databoxedge.outputs.MountPointMapResponse;
import io.pulumi.azurenative.databoxedge.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetIoTRoleResult {
    /**
     * Resource allocation
     * 
     */
    private final @Nullable ComputeResourceResponse computeResource;
    /**
     * Host OS supported by the IoT role.
     * 
     */
    private final String hostPlatform;
    /**
     * Platform where the Iot runtime is hosted.
     * 
     */
    private final String hostPlatformType;
    /**
     * The path ID that uniquely identifies the object.
     * 
     */
    private final String id;
    /**
     * IoT device metadata to which data box edge device needs to be connected.
     * 
     */
    private final IoTDeviceInfoResponse ioTDeviceDetails;
    /**
     * Iot edge agent details to download the agent and bootstrap iot runtime.
     * 
     */
    private final @Nullable IoTEdgeAgentInfoResponse ioTEdgeAgentInfo;
    /**
     * IoT edge device to which the IoT role needs to be configured.
     * 
     */
    private final IoTDeviceInfoResponse ioTEdgeDeviceDetails;
    /**
     * Role type.
     * Expected value is 'IOT'.
     * 
     */
    private final String kind;
    /**
     * The object name.
     * 
     */
    private final String name;
    /**
     * Role status.
     * 
     */
    private final String roleStatus;
    /**
     * Mount points of shares in role(s).
     * 
     */
    private final @Nullable List<MountPointMapResponse> shareMappings;
    /**
     * Role configured on ASE resource
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The hierarchical type of the object.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"computeResource","hostPlatform","hostPlatformType","id","ioTDeviceDetails","ioTEdgeAgentInfo","ioTEdgeDeviceDetails","kind","name","roleStatus","shareMappings","systemData","type"})
    private GetIoTRoleResult(
        @Nullable ComputeResourceResponse computeResource,
        String hostPlatform,
        String hostPlatformType,
        String id,
        IoTDeviceInfoResponse ioTDeviceDetails,
        @Nullable IoTEdgeAgentInfoResponse ioTEdgeAgentInfo,
        IoTDeviceInfoResponse ioTEdgeDeviceDetails,
        String kind,
        String name,
        String roleStatus,
        @Nullable List<MountPointMapResponse> shareMappings,
        SystemDataResponse systemData,
        String type) {
        this.computeResource = computeResource;
        this.hostPlatform = Objects.requireNonNull(hostPlatform);
        this.hostPlatformType = Objects.requireNonNull(hostPlatformType);
        this.id = Objects.requireNonNull(id);
        this.ioTDeviceDetails = Objects.requireNonNull(ioTDeviceDetails);
        this.ioTEdgeAgentInfo = ioTEdgeAgentInfo;
        this.ioTEdgeDeviceDetails = Objects.requireNonNull(ioTEdgeDeviceDetails);
        this.kind = Objects.requireNonNull(kind);
        this.name = Objects.requireNonNull(name);
        this.roleStatus = Objects.requireNonNull(roleStatus);
        this.shareMappings = shareMappings;
        this.systemData = Objects.requireNonNull(systemData);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Resource allocation
     * 
     */
    public Optional<ComputeResourceResponse> getComputeResource() {
        return Optional.ofNullable(this.computeResource);
    }
    /**
     * Host OS supported by the IoT role.
     * 
     */
    public String getHostPlatform() {
        return this.hostPlatform;
    }
    /**
     * Platform where the Iot runtime is hosted.
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
     * IoT device metadata to which data box edge device needs to be connected.
     * 
     */
    public IoTDeviceInfoResponse getIoTDeviceDetails() {
        return this.ioTDeviceDetails;
    }
    /**
     * Iot edge agent details to download the agent and bootstrap iot runtime.
     * 
     */
    public Optional<IoTEdgeAgentInfoResponse> getIoTEdgeAgentInfo() {
        return Optional.ofNullable(this.ioTEdgeAgentInfo);
    }
    /**
     * IoT edge device to which the IoT role needs to be configured.
     * 
     */
    public IoTDeviceInfoResponse getIoTEdgeDeviceDetails() {
        return this.ioTEdgeDeviceDetails;
    }
    /**
     * Role type.
     * Expected value is 'IOT'.
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
     * Role status.
     * 
     */
    public String getRoleStatus() {
        return this.roleStatus;
    }
    /**
     * Mount points of shares in role(s).
     * 
     */
    public List<MountPointMapResponse> getShareMappings() {
        return this.shareMappings == null ? List.of() : this.shareMappings;
    }
    /**
     * Role configured on ASE resource
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

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIoTRoleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ComputeResourceResponse computeResource;
        private String hostPlatform;
        private String hostPlatformType;
        private String id;
        private IoTDeviceInfoResponse ioTDeviceDetails;
        private @Nullable IoTEdgeAgentInfoResponse ioTEdgeAgentInfo;
        private IoTDeviceInfoResponse ioTEdgeDeviceDetails;
        private String kind;
        private String name;
        private String roleStatus;
        private @Nullable List<MountPointMapResponse> shareMappings;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIoTRoleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeResource = defaults.computeResource;
    	      this.hostPlatform = defaults.hostPlatform;
    	      this.hostPlatformType = defaults.hostPlatformType;
    	      this.id = defaults.id;
    	      this.ioTDeviceDetails = defaults.ioTDeviceDetails;
    	      this.ioTEdgeAgentInfo = defaults.ioTEdgeAgentInfo;
    	      this.ioTEdgeDeviceDetails = defaults.ioTEdgeDeviceDetails;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.roleStatus = defaults.roleStatus;
    	      this.shareMappings = defaults.shareMappings;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setComputeResource(@Nullable ComputeResourceResponse computeResource) {
            this.computeResource = computeResource;
            return this;
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

        public Builder setIoTEdgeAgentInfo(@Nullable IoTEdgeAgentInfoResponse ioTEdgeAgentInfo) {
            this.ioTEdgeAgentInfo = ioTEdgeAgentInfo;
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

        public Builder setRoleStatus(String roleStatus) {
            this.roleStatus = Objects.requireNonNull(roleStatus);
            return this;
        }

        public Builder setShareMappings(@Nullable List<MountPointMapResponse> shareMappings) {
            this.shareMappings = shareMappings;
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
        public GetIoTRoleResult build() {
            return new GetIoTRoleResult(computeResource, hostPlatform, hostPlatformType, id, ioTDeviceDetails, ioTEdgeAgentInfo, ioTEdgeDeviceDetails, kind, name, roleStatus, shareMappings, systemData, type);
        }
    }
}
