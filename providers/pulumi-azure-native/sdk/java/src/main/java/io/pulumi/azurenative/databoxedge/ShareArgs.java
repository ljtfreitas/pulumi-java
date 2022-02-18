// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge;

import io.pulumi.azurenative.databoxedge.enums.DataPolicy;
import io.pulumi.azurenative.databoxedge.enums.MonitoringStatus;
import io.pulumi.azurenative.databoxedge.enums.ShareAccessProtocol;
import io.pulumi.azurenative.databoxedge.enums.ShareStatus;
import io.pulumi.azurenative.databoxedge.inputs.AzureContainerInfoArgs;
import io.pulumi.azurenative.databoxedge.inputs.ClientAccessRightArgs;
import io.pulumi.azurenative.databoxedge.inputs.RefreshDetailsArgs;
import io.pulumi.azurenative.databoxedge.inputs.UserAccessRightArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ShareArgs extends io.pulumi.resources.ResourceArgs {

    public static final ShareArgs Empty = new ShareArgs();

    /**
     * Access protocol to be used by the share.
     * 
     */
    @InputImport(name="accessProtocol", required=true)
    private final Input<Either<String,ShareAccessProtocol>> accessProtocol;

    public Input<Either<String,ShareAccessProtocol>> getAccessProtocol() {
        return this.accessProtocol;
    }

    /**
     * Azure container mapping for the share.
     * 
     */
    @InputImport(name="azureContainerInfo")
    private final @Nullable Input<AzureContainerInfoArgs> azureContainerInfo;

    public Input<AzureContainerInfoArgs> getAzureContainerInfo() {
        return this.azureContainerInfo == null ? Input.empty() : this.azureContainerInfo;
    }

    /**
     * List of IP addresses and corresponding access rights on the share(required for NFS protocol).
     * 
     */
    @InputImport(name="clientAccessRights")
    private final @Nullable Input<List<ClientAccessRightArgs>> clientAccessRights;

    public Input<List<ClientAccessRightArgs>> getClientAccessRights() {
        return this.clientAccessRights == null ? Input.empty() : this.clientAccessRights;
    }

    /**
     * Data policy of the share.
     * 
     */
    @InputImport(name="dataPolicy")
    private final @Nullable Input<Either<String,DataPolicy>> dataPolicy;

    public Input<Either<String,DataPolicy>> getDataPolicy() {
        return this.dataPolicy == null ? Input.empty() : this.dataPolicy;
    }

    /**
     * Description for the share.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The device name.
     * 
     */
    @InputImport(name="deviceName", required=true)
    private final Input<String> deviceName;

    public Input<String> getDeviceName() {
        return this.deviceName;
    }

    /**
     * Current monitoring status of the share.
     * 
     */
    @InputImport(name="monitoringStatus", required=true)
    private final Input<Either<String,MonitoringStatus>> monitoringStatus;

    public Input<Either<String,MonitoringStatus>> getMonitoringStatus() {
        return this.monitoringStatus;
    }

    /**
     * The share name.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Details of the refresh job on this share.
     * 
     */
    @InputImport(name="refreshDetails")
    private final @Nullable Input<RefreshDetailsArgs> refreshDetails;

    public Input<RefreshDetailsArgs> getRefreshDetails() {
        return this.refreshDetails == null ? Input.empty() : this.refreshDetails;
    }

    /**
     * The resource group name.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Current status of the share.
     * 
     */
    @InputImport(name="shareStatus", required=true)
    private final Input<Either<String,ShareStatus>> shareStatus;

    public Input<Either<String,ShareStatus>> getShareStatus() {
        return this.shareStatus;
    }

    /**
     * Mapping of users and corresponding access rights on the share (required for SMB protocol).
     * 
     */
    @InputImport(name="userAccessRights")
    private final @Nullable Input<List<UserAccessRightArgs>> userAccessRights;

    public Input<List<UserAccessRightArgs>> getUserAccessRights() {
        return this.userAccessRights == null ? Input.empty() : this.userAccessRights;
    }

    public ShareArgs(
        Input<Either<String,ShareAccessProtocol>> accessProtocol,
        @Nullable Input<AzureContainerInfoArgs> azureContainerInfo,
        @Nullable Input<List<ClientAccessRightArgs>> clientAccessRights,
        @Nullable Input<Either<String,DataPolicy>> dataPolicy,
        @Nullable Input<String> description,
        Input<String> deviceName,
        Input<Either<String,MonitoringStatus>> monitoringStatus,
        @Nullable Input<String> name,
        @Nullable Input<RefreshDetailsArgs> refreshDetails,
        Input<String> resourceGroupName,
        Input<Either<String,ShareStatus>> shareStatus,
        @Nullable Input<List<UserAccessRightArgs>> userAccessRights) {
        this.accessProtocol = Objects.requireNonNull(accessProtocol, "expected parameter 'accessProtocol' to be non-null");
        this.azureContainerInfo = azureContainerInfo;
        this.clientAccessRights = clientAccessRights;
        this.dataPolicy = dataPolicy;
        this.description = description;
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.monitoringStatus = Objects.requireNonNull(monitoringStatus, "expected parameter 'monitoringStatus' to be non-null");
        this.name = name;
        this.refreshDetails = refreshDetails;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.shareStatus = Objects.requireNonNull(shareStatus, "expected parameter 'shareStatus' to be non-null");
        this.userAccessRights = userAccessRights;
    }

    private ShareArgs() {
        this.accessProtocol = Input.empty();
        this.azureContainerInfo = Input.empty();
        this.clientAccessRights = Input.empty();
        this.dataPolicy = Input.empty();
        this.description = Input.empty();
        this.deviceName = Input.empty();
        this.monitoringStatus = Input.empty();
        this.name = Input.empty();
        this.refreshDetails = Input.empty();
        this.resourceGroupName = Input.empty();
        this.shareStatus = Input.empty();
        this.userAccessRights = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ShareArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,ShareAccessProtocol>> accessProtocol;
        private @Nullable Input<AzureContainerInfoArgs> azureContainerInfo;
        private @Nullable Input<List<ClientAccessRightArgs>> clientAccessRights;
        private @Nullable Input<Either<String,DataPolicy>> dataPolicy;
        private @Nullable Input<String> description;
        private Input<String> deviceName;
        private Input<Either<String,MonitoringStatus>> monitoringStatus;
        private @Nullable Input<String> name;
        private @Nullable Input<RefreshDetailsArgs> refreshDetails;
        private Input<String> resourceGroupName;
        private Input<Either<String,ShareStatus>> shareStatus;
        private @Nullable Input<List<UserAccessRightArgs>> userAccessRights;

        public Builder() {
    	      // Empty
        }

        public Builder(ShareArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessProtocol = defaults.accessProtocol;
    	      this.azureContainerInfo = defaults.azureContainerInfo;
    	      this.clientAccessRights = defaults.clientAccessRights;
    	      this.dataPolicy = defaults.dataPolicy;
    	      this.description = defaults.description;
    	      this.deviceName = defaults.deviceName;
    	      this.monitoringStatus = defaults.monitoringStatus;
    	      this.name = defaults.name;
    	      this.refreshDetails = defaults.refreshDetails;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.shareStatus = defaults.shareStatus;
    	      this.userAccessRights = defaults.userAccessRights;
        }

        public Builder setAccessProtocol(Input<Either<String,ShareAccessProtocol>> accessProtocol) {
            this.accessProtocol = Objects.requireNonNull(accessProtocol);
            return this;
        }

        public Builder setAccessProtocol(Either<String,ShareAccessProtocol> accessProtocol) {
            this.accessProtocol = Input.of(Objects.requireNonNull(accessProtocol));
            return this;
        }

        public Builder setAzureContainerInfo(@Nullable Input<AzureContainerInfoArgs> azureContainerInfo) {
            this.azureContainerInfo = azureContainerInfo;
            return this;
        }

        public Builder setAzureContainerInfo(@Nullable AzureContainerInfoArgs azureContainerInfo) {
            this.azureContainerInfo = Input.ofNullable(azureContainerInfo);
            return this;
        }

        public Builder setClientAccessRights(@Nullable Input<List<ClientAccessRightArgs>> clientAccessRights) {
            this.clientAccessRights = clientAccessRights;
            return this;
        }

        public Builder setClientAccessRights(@Nullable List<ClientAccessRightArgs> clientAccessRights) {
            this.clientAccessRights = Input.ofNullable(clientAccessRights);
            return this;
        }

        public Builder setDataPolicy(@Nullable Input<Either<String,DataPolicy>> dataPolicy) {
            this.dataPolicy = dataPolicy;
            return this;
        }

        public Builder setDataPolicy(@Nullable Either<String,DataPolicy> dataPolicy) {
            this.dataPolicy = Input.ofNullable(dataPolicy);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDeviceName(Input<String> deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder setDeviceName(String deviceName) {
            this.deviceName = Input.of(Objects.requireNonNull(deviceName));
            return this;
        }

        public Builder setMonitoringStatus(Input<Either<String,MonitoringStatus>> monitoringStatus) {
            this.monitoringStatus = Objects.requireNonNull(monitoringStatus);
            return this;
        }

        public Builder setMonitoringStatus(Either<String,MonitoringStatus> monitoringStatus) {
            this.monitoringStatus = Input.of(Objects.requireNonNull(monitoringStatus));
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setRefreshDetails(@Nullable Input<RefreshDetailsArgs> refreshDetails) {
            this.refreshDetails = refreshDetails;
            return this;
        }

        public Builder setRefreshDetails(@Nullable RefreshDetailsArgs refreshDetails) {
            this.refreshDetails = Input.ofNullable(refreshDetails);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setShareStatus(Input<Either<String,ShareStatus>> shareStatus) {
            this.shareStatus = Objects.requireNonNull(shareStatus);
            return this;
        }

        public Builder setShareStatus(Either<String,ShareStatus> shareStatus) {
            this.shareStatus = Input.of(Objects.requireNonNull(shareStatus));
            return this;
        }

        public Builder setUserAccessRights(@Nullable Input<List<UserAccessRightArgs>> userAccessRights) {
            this.userAccessRights = userAccessRights;
            return this;
        }

        public Builder setUserAccessRights(@Nullable List<UserAccessRightArgs> userAccessRights) {
            this.userAccessRights = Input.ofNullable(userAccessRights);
            return this;
        }

        public ShareArgs build() {
            return new ShareArgs(accessProtocol, azureContainerInfo, clientAccessRights, dataPolicy, description, deviceName, monitoringStatus, name, refreshDetails, resourceGroupName, shareStatus, userAccessRights);
        }
    }
}
