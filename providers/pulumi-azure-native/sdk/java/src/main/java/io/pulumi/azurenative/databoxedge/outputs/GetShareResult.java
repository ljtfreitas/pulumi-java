// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.outputs;

import io.pulumi.azurenative.databoxedge.outputs.AzureContainerInfoResponse;
import io.pulumi.azurenative.databoxedge.outputs.ClientAccessRightResponse;
import io.pulumi.azurenative.databoxedge.outputs.MountPointMapResponse;
import io.pulumi.azurenative.databoxedge.outputs.RefreshDetailsResponse;
import io.pulumi.azurenative.databoxedge.outputs.SystemDataResponse;
import io.pulumi.azurenative.databoxedge.outputs.UserAccessRightResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetShareResult {
    /**
     * Access protocol to be used by the share.
     * 
     */
    private final String accessProtocol;
    /**
     * Azure container mapping for the share.
     * 
     */
    private final @Nullable AzureContainerInfoResponse azureContainerInfo;
    /**
     * List of IP addresses and corresponding access rights on the share(required for NFS protocol).
     * 
     */
    private final @Nullable List<ClientAccessRightResponse> clientAccessRights;
    /**
     * Data policy of the share.
     * 
     */
    private final @Nullable String dataPolicy;
    /**
     * Description for the share.
     * 
     */
    private final @Nullable String description;
    /**
     * The path ID that uniquely identifies the object.
     * 
     */
    private final String id;
    /**
     * Current monitoring status of the share.
     * 
     */
    private final String monitoringStatus;
    /**
     * The object name.
     * 
     */
    private final String name;
    /**
     * Details of the refresh job on this share.
     * 
     */
    private final @Nullable RefreshDetailsResponse refreshDetails;
    /**
     * Share mount point to the role.
     * 
     */
    private final List<MountPointMapResponse> shareMappings;
    /**
     * Current status of the share.
     * 
     */
    private final String shareStatus;
    /**
     * Share on ASE device
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The hierarchical type of the object.
     * 
     */
    private final String type;
    /**
     * Mapping of users and corresponding access rights on the share (required for SMB protocol).
     * 
     */
    private final @Nullable List<UserAccessRightResponse> userAccessRights;

    @OutputCustomType.Constructor({"accessProtocol","azureContainerInfo","clientAccessRights","dataPolicy","description","id","monitoringStatus","name","refreshDetails","shareMappings","shareStatus","systemData","type","userAccessRights"})
    private GetShareResult(
        String accessProtocol,
        @Nullable AzureContainerInfoResponse azureContainerInfo,
        @Nullable List<ClientAccessRightResponse> clientAccessRights,
        @Nullable String dataPolicy,
        @Nullable String description,
        String id,
        String monitoringStatus,
        String name,
        @Nullable RefreshDetailsResponse refreshDetails,
        List<MountPointMapResponse> shareMappings,
        String shareStatus,
        SystemDataResponse systemData,
        String type,
        @Nullable List<UserAccessRightResponse> userAccessRights) {
        this.accessProtocol = Objects.requireNonNull(accessProtocol);
        this.azureContainerInfo = azureContainerInfo;
        this.clientAccessRights = clientAccessRights;
        this.dataPolicy = dataPolicy;
        this.description = description;
        this.id = Objects.requireNonNull(id);
        this.monitoringStatus = Objects.requireNonNull(monitoringStatus);
        this.name = Objects.requireNonNull(name);
        this.refreshDetails = refreshDetails;
        this.shareMappings = Objects.requireNonNull(shareMappings);
        this.shareStatus = Objects.requireNonNull(shareStatus);
        this.systemData = Objects.requireNonNull(systemData);
        this.type = Objects.requireNonNull(type);
        this.userAccessRights = userAccessRights;
    }

    /**
     * Access protocol to be used by the share.
     * 
     */
    public String getAccessProtocol() {
        return this.accessProtocol;
    }
    /**
     * Azure container mapping for the share.
     * 
     */
    public Optional<AzureContainerInfoResponse> getAzureContainerInfo() {
        return Optional.ofNullable(this.azureContainerInfo);
    }
    /**
     * List of IP addresses and corresponding access rights on the share(required for NFS protocol).
     * 
     */
    public List<ClientAccessRightResponse> getClientAccessRights() {
        return this.clientAccessRights == null ? List.of() : this.clientAccessRights;
    }
    /**
     * Data policy of the share.
     * 
     */
    public Optional<String> getDataPolicy() {
        return Optional.ofNullable(this.dataPolicy);
    }
    /**
     * Description for the share.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The path ID that uniquely identifies the object.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Current monitoring status of the share.
     * 
     */
    public String getMonitoringStatus() {
        return this.monitoringStatus;
    }
    /**
     * The object name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Details of the refresh job on this share.
     * 
     */
    public Optional<RefreshDetailsResponse> getRefreshDetails() {
        return Optional.ofNullable(this.refreshDetails);
    }
    /**
     * Share mount point to the role.
     * 
     */
    public List<MountPointMapResponse> getShareMappings() {
        return this.shareMappings;
    }
    /**
     * Current status of the share.
     * 
     */
    public String getShareStatus() {
        return this.shareStatus;
    }
    /**
     * Share on ASE device
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
     * Mapping of users and corresponding access rights on the share (required for SMB protocol).
     * 
     */
    public List<UserAccessRightResponse> getUserAccessRights() {
        return this.userAccessRights == null ? List.of() : this.userAccessRights;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetShareResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessProtocol;
        private @Nullable AzureContainerInfoResponse azureContainerInfo;
        private @Nullable List<ClientAccessRightResponse> clientAccessRights;
        private @Nullable String dataPolicy;
        private @Nullable String description;
        private String id;
        private String monitoringStatus;
        private String name;
        private @Nullable RefreshDetailsResponse refreshDetails;
        private List<MountPointMapResponse> shareMappings;
        private String shareStatus;
        private SystemDataResponse systemData;
        private String type;
        private @Nullable List<UserAccessRightResponse> userAccessRights;

        public Builder() {
    	      // Empty
        }

        public Builder(GetShareResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessProtocol = defaults.accessProtocol;
    	      this.azureContainerInfo = defaults.azureContainerInfo;
    	      this.clientAccessRights = defaults.clientAccessRights;
    	      this.dataPolicy = defaults.dataPolicy;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.monitoringStatus = defaults.monitoringStatus;
    	      this.name = defaults.name;
    	      this.refreshDetails = defaults.refreshDetails;
    	      this.shareMappings = defaults.shareMappings;
    	      this.shareStatus = defaults.shareStatus;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
    	      this.userAccessRights = defaults.userAccessRights;
        }

        public Builder setAccessProtocol(String accessProtocol) {
            this.accessProtocol = Objects.requireNonNull(accessProtocol);
            return this;
        }

        public Builder setAzureContainerInfo(@Nullable AzureContainerInfoResponse azureContainerInfo) {
            this.azureContainerInfo = azureContainerInfo;
            return this;
        }

        public Builder setClientAccessRights(@Nullable List<ClientAccessRightResponse> clientAccessRights) {
            this.clientAccessRights = clientAccessRights;
            return this;
        }

        public Builder setDataPolicy(@Nullable String dataPolicy) {
            this.dataPolicy = dataPolicy;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setMonitoringStatus(String monitoringStatus) {
            this.monitoringStatus = Objects.requireNonNull(monitoringStatus);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRefreshDetails(@Nullable RefreshDetailsResponse refreshDetails) {
            this.refreshDetails = refreshDetails;
            return this;
        }

        public Builder setShareMappings(List<MountPointMapResponse> shareMappings) {
            this.shareMappings = Objects.requireNonNull(shareMappings);
            return this;
        }

        public Builder setShareStatus(String shareStatus) {
            this.shareStatus = Objects.requireNonNull(shareStatus);
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

        public Builder setUserAccessRights(@Nullable List<UserAccessRightResponse> userAccessRights) {
            this.userAccessRights = userAccessRights;
            return this;
        }
        public GetShareResult build() {
            return new GetShareResult(accessProtocol, azureContainerInfo, clientAccessRights, dataPolicy, description, id, monitoringStatus, name, refreshDetails, shareMappings, shareStatus, systemData, type, userAccessRights);
        }
    }
}
