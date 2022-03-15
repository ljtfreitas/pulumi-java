// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.outputs;

import io.pulumi.azurenative.batch.outputs.ApplicationPackageReferenceResponse;
import io.pulumi.azurenative.batch.outputs.AutoScaleRunResponse;
import io.pulumi.azurenative.batch.outputs.BatchPoolIdentityResponse;
import io.pulumi.azurenative.batch.outputs.CertificateReferenceResponse;
import io.pulumi.azurenative.batch.outputs.DeploymentConfigurationResponse;
import io.pulumi.azurenative.batch.outputs.MetadataItemResponse;
import io.pulumi.azurenative.batch.outputs.MountConfigurationResponse;
import io.pulumi.azurenative.batch.outputs.NetworkConfigurationResponse;
import io.pulumi.azurenative.batch.outputs.ResizeOperationStatusResponse;
import io.pulumi.azurenative.batch.outputs.ScaleSettingsResponse;
import io.pulumi.azurenative.batch.outputs.StartTaskResponse;
import io.pulumi.azurenative.batch.outputs.TaskSchedulingPolicyResponse;
import io.pulumi.azurenative.batch.outputs.UserAccountResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPoolResult {
    private final String allocationState;
    private final String allocationStateTransitionTime;
    /**
     * The list of application licenses must be a subset of available Batch service application licenses. If a license is requested which is not supported, pool creation will fail.
     * 
     */
    private final @Nullable List<String> applicationLicenses;
    /**
     * Changes to application package references affect all new compute nodes joining the pool, but do not affect compute nodes that are already in the pool until they are rebooted or reimaged. There is a maximum of 10 application package references on any given pool.
     * 
     */
    private final @Nullable List<ApplicationPackageReferenceResponse> applicationPackages;
    /**
     * This property is set only if the pool automatically scales, i.e. autoScaleSettings are used.
     * 
     */
    private final AutoScaleRunResponse autoScaleRun;
    /**
     * For Windows compute nodes, the Batch service installs the certificates to the specified certificate store and location. For Linux compute nodes, the certificates are stored in a directory inside the task working directory and an environment variable AZ_BATCH_CERTIFICATES_DIR is supplied to the task to query for this location. For certificates with visibility of 'remoteUser', a 'certs' directory is created in the user's home directory (e.g., /home/{user-name}/certs) and certificates are placed in that directory.
     * 
     */
    private final @Nullable List<CertificateReferenceResponse> certificates;
    private final String creationTime;
    private final Integer currentDedicatedNodes;
    private final Integer currentLowPriorityNodes;
    /**
     * Using CloudServiceConfiguration specifies that the nodes should be creating using Azure Cloud Services (PaaS), while VirtualMachineConfiguration uses Azure Virtual Machines (IaaS).
     * 
     */
    private final @Nullable DeploymentConfigurationResponse deploymentConfiguration;
    /**
     * The display name need not be unique and can contain any Unicode characters up to a maximum length of 1024.
     * 
     */
    private final @Nullable String displayName;
    /**
     * The ETag of the resource, used for concurrency statements.
     * 
     */
    private final String etag;
    /**
     * The ID of the resource.
     * 
     */
    private final String id;
    /**
     * The type of identity used for the Batch Pool.
     * 
     */
    private final @Nullable BatchPoolIdentityResponse identity;
    /**
     * This imposes restrictions on which nodes can be assigned to the pool. Enabling this value can reduce the chance of the requested number of nodes to be allocated in the pool. If not specified, this value defaults to 'Disabled'.
     * 
     */
    private final @Nullable String interNodeCommunication;
    /**
     * This is the last time at which the pool level data, such as the targetDedicatedNodes or autoScaleSettings, changed. It does not factor in node-level changes such as a compute node changing state.
     * 
     */
    private final String lastModified;
    /**
     * The Batch service does not assign any meaning to metadata; it is solely for the use of user code.
     * 
     */
    private final @Nullable List<MetadataItemResponse> metadata;
    /**
     * This supports Azure Files, NFS, CIFS/SMB, and Blobfuse.
     * 
     */
    private final @Nullable List<MountConfigurationResponse> mountConfiguration;
    /**
     * The name of the resource.
     * 
     */
    private final String name;
    /**
     * The network configuration for a pool.
     * 
     */
    private final @Nullable NetworkConfigurationResponse networkConfiguration;
    private final String provisioningState;
    private final String provisioningStateTransitionTime;
    /**
     * Describes either the current operation (if the pool AllocationState is Resizing) or the previously completed operation (if the AllocationState is Steady).
     * 
     */
    private final ResizeOperationStatusResponse resizeOperationStatus;
    /**
     * Defines the desired size of the pool. This can either be 'fixedScale' where the requested targetDedicatedNodes is specified, or 'autoScale' which defines a formula which is periodically reevaluated. If this property is not specified, the pool will have a fixed scale with 0 targetDedicatedNodes.
     * 
     */
    private final @Nullable ScaleSettingsResponse scaleSettings;
    /**
     * In an PATCH (update) operation, this property can be set to an empty object to remove the start task from the pool.
     * 
     */
    private final @Nullable StartTaskResponse startTask;
    /**
     * If not specified, the default is spread.
     * 
     */
    private final @Nullable TaskSchedulingPolicyResponse taskSchedulingPolicy;
    /**
     * The default value is 1. The maximum value is the smaller of 4 times the number of cores of the vmSize of the pool or 256.
     * 
     */
    private final @Nullable Integer taskSlotsPerNode;
    /**
     * The type of the resource.
     * 
     */
    private final String type;
    private final @Nullable List<UserAccountResponse> userAccounts;
    /**
     * For information about available sizes of virtual machines for Cloud Services pools (pools created with cloudServiceConfiguration), see Sizes for Cloud Services (https://azure.microsoft.com/documentation/articles/cloud-services-sizes-specs/). Batch supports all Cloud Services VM sizes except ExtraSmall. For information about available VM sizes for pools using images from the Virtual Machines Marketplace (pools created with virtualMachineConfiguration) see Sizes for Virtual Machines (Linux) (https://azure.microsoft.com/documentation/articles/virtual-machines-linux-sizes/) or Sizes for Virtual Machines (Windows) (https://azure.microsoft.com/documentation/articles/virtual-machines-windows-sizes/). Batch supports all Azure VM sizes except STANDARD_A0 and those with premium storage (STANDARD_GS, STANDARD_DS, and STANDARD_DSV2 series).
     * 
     */
    private final @Nullable String vmSize;

    @CustomType.Constructor
    private GetPoolResult(
        @CustomType.Parameter("allocationState") String allocationState,
        @CustomType.Parameter("allocationStateTransitionTime") String allocationStateTransitionTime,
        @CustomType.Parameter("applicationLicenses") @Nullable List<String> applicationLicenses,
        @CustomType.Parameter("applicationPackages") @Nullable List<ApplicationPackageReferenceResponse> applicationPackages,
        @CustomType.Parameter("autoScaleRun") AutoScaleRunResponse autoScaleRun,
        @CustomType.Parameter("certificates") @Nullable List<CertificateReferenceResponse> certificates,
        @CustomType.Parameter("creationTime") String creationTime,
        @CustomType.Parameter("currentDedicatedNodes") Integer currentDedicatedNodes,
        @CustomType.Parameter("currentLowPriorityNodes") Integer currentLowPriorityNodes,
        @CustomType.Parameter("deploymentConfiguration") @Nullable DeploymentConfigurationResponse deploymentConfiguration,
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identity") @Nullable BatchPoolIdentityResponse identity,
        @CustomType.Parameter("interNodeCommunication") @Nullable String interNodeCommunication,
        @CustomType.Parameter("lastModified") String lastModified,
        @CustomType.Parameter("metadata") @Nullable List<MetadataItemResponse> metadata,
        @CustomType.Parameter("mountConfiguration") @Nullable List<MountConfigurationResponse> mountConfiguration,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("networkConfiguration") @Nullable NetworkConfigurationResponse networkConfiguration,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("provisioningStateTransitionTime") String provisioningStateTransitionTime,
        @CustomType.Parameter("resizeOperationStatus") ResizeOperationStatusResponse resizeOperationStatus,
        @CustomType.Parameter("scaleSettings") @Nullable ScaleSettingsResponse scaleSettings,
        @CustomType.Parameter("startTask") @Nullable StartTaskResponse startTask,
        @CustomType.Parameter("taskSchedulingPolicy") @Nullable TaskSchedulingPolicyResponse taskSchedulingPolicy,
        @CustomType.Parameter("taskSlotsPerNode") @Nullable Integer taskSlotsPerNode,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("userAccounts") @Nullable List<UserAccountResponse> userAccounts,
        @CustomType.Parameter("vmSize") @Nullable String vmSize) {
        this.allocationState = allocationState;
        this.allocationStateTransitionTime = allocationStateTransitionTime;
        this.applicationLicenses = applicationLicenses;
        this.applicationPackages = applicationPackages;
        this.autoScaleRun = autoScaleRun;
        this.certificates = certificates;
        this.creationTime = creationTime;
        this.currentDedicatedNodes = currentDedicatedNodes;
        this.currentLowPriorityNodes = currentLowPriorityNodes;
        this.deploymentConfiguration = deploymentConfiguration;
        this.displayName = displayName;
        this.etag = etag;
        this.id = id;
        this.identity = identity;
        this.interNodeCommunication = interNodeCommunication;
        this.lastModified = lastModified;
        this.metadata = metadata;
        this.mountConfiguration = mountConfiguration;
        this.name = name;
        this.networkConfiguration = networkConfiguration;
        this.provisioningState = provisioningState;
        this.provisioningStateTransitionTime = provisioningStateTransitionTime;
        this.resizeOperationStatus = resizeOperationStatus;
        this.scaleSettings = scaleSettings;
        this.startTask = startTask;
        this.taskSchedulingPolicy = taskSchedulingPolicy;
        this.taskSlotsPerNode = taskSlotsPerNode;
        this.type = type;
        this.userAccounts = userAccounts;
        this.vmSize = vmSize;
    }

    public String getAllocationState() {
        return this.allocationState;
    }
    public String getAllocationStateTransitionTime() {
        return this.allocationStateTransitionTime;
    }
    /**
     * The list of application licenses must be a subset of available Batch service application licenses. If a license is requested which is not supported, pool creation will fail.
     * 
    */
    public List<String> getApplicationLicenses() {
        return this.applicationLicenses == null ? List.of() : this.applicationLicenses;
    }
    /**
     * Changes to application package references affect all new compute nodes joining the pool, but do not affect compute nodes that are already in the pool until they are rebooted or reimaged. There is a maximum of 10 application package references on any given pool.
     * 
    */
    public List<ApplicationPackageReferenceResponse> getApplicationPackages() {
        return this.applicationPackages == null ? List.of() : this.applicationPackages;
    }
    /**
     * This property is set only if the pool automatically scales, i.e. autoScaleSettings are used.
     * 
    */
    public AutoScaleRunResponse getAutoScaleRun() {
        return this.autoScaleRun;
    }
    /**
     * For Windows compute nodes, the Batch service installs the certificates to the specified certificate store and location. For Linux compute nodes, the certificates are stored in a directory inside the task working directory and an environment variable AZ_BATCH_CERTIFICATES_DIR is supplied to the task to query for this location. For certificates with visibility of 'remoteUser', a 'certs' directory is created in the user's home directory (e.g., /home/{user-name}/certs) and certificates are placed in that directory.
     * 
    */
    public List<CertificateReferenceResponse> getCertificates() {
        return this.certificates == null ? List.of() : this.certificates;
    }
    public String getCreationTime() {
        return this.creationTime;
    }
    public Integer getCurrentDedicatedNodes() {
        return this.currentDedicatedNodes;
    }
    public Integer getCurrentLowPriorityNodes() {
        return this.currentLowPriorityNodes;
    }
    /**
     * Using CloudServiceConfiguration specifies that the nodes should be creating using Azure Cloud Services (PaaS), while VirtualMachineConfiguration uses Azure Virtual Machines (IaaS).
     * 
    */
    public Optional<DeploymentConfigurationResponse> getDeploymentConfiguration() {
        return Optional.ofNullable(this.deploymentConfiguration);
    }
    /**
     * The display name need not be unique and can contain any Unicode characters up to a maximum length of 1024.
     * 
    */
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * The ETag of the resource, used for concurrency statements.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * The ID of the resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The type of identity used for the Batch Pool.
     * 
    */
    public Optional<BatchPoolIdentityResponse> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * This imposes restrictions on which nodes can be assigned to the pool. Enabling this value can reduce the chance of the requested number of nodes to be allocated in the pool. If not specified, this value defaults to 'Disabled'.
     * 
    */
    public Optional<String> getInterNodeCommunication() {
        return Optional.ofNullable(this.interNodeCommunication);
    }
    /**
     * This is the last time at which the pool level data, such as the targetDedicatedNodes or autoScaleSettings, changed. It does not factor in node-level changes such as a compute node changing state.
     * 
    */
    public String getLastModified() {
        return this.lastModified;
    }
    /**
     * The Batch service does not assign any meaning to metadata; it is solely for the use of user code.
     * 
    */
    public List<MetadataItemResponse> getMetadata() {
        return this.metadata == null ? List.of() : this.metadata;
    }
    /**
     * This supports Azure Files, NFS, CIFS/SMB, and Blobfuse.
     * 
    */
    public List<MountConfigurationResponse> getMountConfiguration() {
        return this.mountConfiguration == null ? List.of() : this.mountConfiguration;
    }
    /**
     * The name of the resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The network configuration for a pool.
     * 
    */
    public Optional<NetworkConfigurationResponse> getNetworkConfiguration() {
        return Optional.ofNullable(this.networkConfiguration);
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public String getProvisioningStateTransitionTime() {
        return this.provisioningStateTransitionTime;
    }
    /**
     * Describes either the current operation (if the pool AllocationState is Resizing) or the previously completed operation (if the AllocationState is Steady).
     * 
    */
    public ResizeOperationStatusResponse getResizeOperationStatus() {
        return this.resizeOperationStatus;
    }
    /**
     * Defines the desired size of the pool. This can either be 'fixedScale' where the requested targetDedicatedNodes is specified, or 'autoScale' which defines a formula which is periodically reevaluated. If this property is not specified, the pool will have a fixed scale with 0 targetDedicatedNodes.
     * 
    */
    public Optional<ScaleSettingsResponse> getScaleSettings() {
        return Optional.ofNullable(this.scaleSettings);
    }
    /**
     * In an PATCH (update) operation, this property can be set to an empty object to remove the start task from the pool.
     * 
    */
    public Optional<StartTaskResponse> getStartTask() {
        return Optional.ofNullable(this.startTask);
    }
    /**
     * If not specified, the default is spread.
     * 
    */
    public Optional<TaskSchedulingPolicyResponse> getTaskSchedulingPolicy() {
        return Optional.ofNullable(this.taskSchedulingPolicy);
    }
    /**
     * The default value is 1. The maximum value is the smaller of 4 times the number of cores of the vmSize of the pool or 256.
     * 
    */
    public Optional<Integer> getTaskSlotsPerNode() {
        return Optional.ofNullable(this.taskSlotsPerNode);
    }
    /**
     * The type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }
    public List<UserAccountResponse> getUserAccounts() {
        return this.userAccounts == null ? List.of() : this.userAccounts;
    }
    /**
     * For information about available sizes of virtual machines for Cloud Services pools (pools created with cloudServiceConfiguration), see Sizes for Cloud Services (https://azure.microsoft.com/documentation/articles/cloud-services-sizes-specs/). Batch supports all Cloud Services VM sizes except ExtraSmall. For information about available VM sizes for pools using images from the Virtual Machines Marketplace (pools created with virtualMachineConfiguration) see Sizes for Virtual Machines (Linux) (https://azure.microsoft.com/documentation/articles/virtual-machines-linux-sizes/) or Sizes for Virtual Machines (Windows) (https://azure.microsoft.com/documentation/articles/virtual-machines-windows-sizes/). Batch supports all Azure VM sizes except STANDARD_A0 and those with premium storage (STANDARD_GS, STANDARD_DS, and STANDARD_DSV2 series).
     * 
    */
    public Optional<String> getVmSize() {
        return Optional.ofNullable(this.vmSize);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPoolResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String allocationState;
        private String allocationStateTransitionTime;
        private @Nullable List<String> applicationLicenses;
        private @Nullable List<ApplicationPackageReferenceResponse> applicationPackages;
        private AutoScaleRunResponse autoScaleRun;
        private @Nullable List<CertificateReferenceResponse> certificates;
        private String creationTime;
        private Integer currentDedicatedNodes;
        private Integer currentLowPriorityNodes;
        private @Nullable DeploymentConfigurationResponse deploymentConfiguration;
        private @Nullable String displayName;
        private String etag;
        private String id;
        private @Nullable BatchPoolIdentityResponse identity;
        private @Nullable String interNodeCommunication;
        private String lastModified;
        private @Nullable List<MetadataItemResponse> metadata;
        private @Nullable List<MountConfigurationResponse> mountConfiguration;
        private String name;
        private @Nullable NetworkConfigurationResponse networkConfiguration;
        private String provisioningState;
        private String provisioningStateTransitionTime;
        private ResizeOperationStatusResponse resizeOperationStatus;
        private @Nullable ScaleSettingsResponse scaleSettings;
        private @Nullable StartTaskResponse startTask;
        private @Nullable TaskSchedulingPolicyResponse taskSchedulingPolicy;
        private @Nullable Integer taskSlotsPerNode;
        private String type;
        private @Nullable List<UserAccountResponse> userAccounts;
        private @Nullable String vmSize;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPoolResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationState = defaults.allocationState;
    	      this.allocationStateTransitionTime = defaults.allocationStateTransitionTime;
    	      this.applicationLicenses = defaults.applicationLicenses;
    	      this.applicationPackages = defaults.applicationPackages;
    	      this.autoScaleRun = defaults.autoScaleRun;
    	      this.certificates = defaults.certificates;
    	      this.creationTime = defaults.creationTime;
    	      this.currentDedicatedNodes = defaults.currentDedicatedNodes;
    	      this.currentLowPriorityNodes = defaults.currentLowPriorityNodes;
    	      this.deploymentConfiguration = defaults.deploymentConfiguration;
    	      this.displayName = defaults.displayName;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.interNodeCommunication = defaults.interNodeCommunication;
    	      this.lastModified = defaults.lastModified;
    	      this.metadata = defaults.metadata;
    	      this.mountConfiguration = defaults.mountConfiguration;
    	      this.name = defaults.name;
    	      this.networkConfiguration = defaults.networkConfiguration;
    	      this.provisioningState = defaults.provisioningState;
    	      this.provisioningStateTransitionTime = defaults.provisioningStateTransitionTime;
    	      this.resizeOperationStatus = defaults.resizeOperationStatus;
    	      this.scaleSettings = defaults.scaleSettings;
    	      this.startTask = defaults.startTask;
    	      this.taskSchedulingPolicy = defaults.taskSchedulingPolicy;
    	      this.taskSlotsPerNode = defaults.taskSlotsPerNode;
    	      this.type = defaults.type;
    	      this.userAccounts = defaults.userAccounts;
    	      this.vmSize = defaults.vmSize;
        }

        public Builder allocationState(String allocationState) {
            this.allocationState = Objects.requireNonNull(allocationState);
            return this;
        }

        public Builder allocationStateTransitionTime(String allocationStateTransitionTime) {
            this.allocationStateTransitionTime = Objects.requireNonNull(allocationStateTransitionTime);
            return this;
        }

        public Builder applicationLicenses(@Nullable List<String> applicationLicenses) {
            this.applicationLicenses = applicationLicenses;
            return this;
        }

        public Builder applicationPackages(@Nullable List<ApplicationPackageReferenceResponse> applicationPackages) {
            this.applicationPackages = applicationPackages;
            return this;
        }

        public Builder autoScaleRun(AutoScaleRunResponse autoScaleRun) {
            this.autoScaleRun = Objects.requireNonNull(autoScaleRun);
            return this;
        }

        public Builder certificates(@Nullable List<CertificateReferenceResponse> certificates) {
            this.certificates = certificates;
            return this;
        }

        public Builder creationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }

        public Builder currentDedicatedNodes(Integer currentDedicatedNodes) {
            this.currentDedicatedNodes = Objects.requireNonNull(currentDedicatedNodes);
            return this;
        }

        public Builder currentLowPriorityNodes(Integer currentLowPriorityNodes) {
            this.currentLowPriorityNodes = Objects.requireNonNull(currentLowPriorityNodes);
            return this;
        }

        public Builder deploymentConfiguration(@Nullable DeploymentConfigurationResponse deploymentConfiguration) {
            this.deploymentConfiguration = deploymentConfiguration;
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder identity(@Nullable BatchPoolIdentityResponse identity) {
            this.identity = identity;
            return this;
        }

        public Builder interNodeCommunication(@Nullable String interNodeCommunication) {
            this.interNodeCommunication = interNodeCommunication;
            return this;
        }

        public Builder lastModified(String lastModified) {
            this.lastModified = Objects.requireNonNull(lastModified);
            return this;
        }

        public Builder metadata(@Nullable List<MetadataItemResponse> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder mountConfiguration(@Nullable List<MountConfigurationResponse> mountConfiguration) {
            this.mountConfiguration = mountConfiguration;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder networkConfiguration(@Nullable NetworkConfigurationResponse networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder provisioningStateTransitionTime(String provisioningStateTransitionTime) {
            this.provisioningStateTransitionTime = Objects.requireNonNull(provisioningStateTransitionTime);
            return this;
        }

        public Builder resizeOperationStatus(ResizeOperationStatusResponse resizeOperationStatus) {
            this.resizeOperationStatus = Objects.requireNonNull(resizeOperationStatus);
            return this;
        }

        public Builder scaleSettings(@Nullable ScaleSettingsResponse scaleSettings) {
            this.scaleSettings = scaleSettings;
            return this;
        }

        public Builder startTask(@Nullable StartTaskResponse startTask) {
            this.startTask = startTask;
            return this;
        }

        public Builder taskSchedulingPolicy(@Nullable TaskSchedulingPolicyResponse taskSchedulingPolicy) {
            this.taskSchedulingPolicy = taskSchedulingPolicy;
            return this;
        }

        public Builder taskSlotsPerNode(@Nullable Integer taskSlotsPerNode) {
            this.taskSlotsPerNode = taskSlotsPerNode;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder userAccounts(@Nullable List<UserAccountResponse> userAccounts) {
            this.userAccounts = userAccounts;
            return this;
        }

        public Builder vmSize(@Nullable String vmSize) {
            this.vmSize = vmSize;
            return this;
        }
        public GetPoolResult build() {
            return new GetPoolResult(allocationState, allocationStateTransitionTime, applicationLicenses, applicationPackages, autoScaleRun, certificates, creationTime, currentDedicatedNodes, currentLowPriorityNodes, deploymentConfiguration, displayName, etag, id, identity, interNodeCommunication, lastModified, metadata, mountConfiguration, name, networkConfiguration, provisioningState, provisioningStateTransitionTime, resizeOperationStatus, scaleSettings, startTask, taskSchedulingPolicy, taskSlotsPerNode, type, userAccounts, vmSize);
        }
    }
}
