// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.InMageRcmAgentUpgradeBlockingErrorDetailsResponse;
import io.pulumi.azurenative.recoveryservices.inputs.InMageRcmLastAgentUpgradeErrorDetailsResponse;
import io.pulumi.azurenative.recoveryservices.inputs.InMageRcmMobilityAgentDetailsResponse;
import io.pulumi.azurenative.recoveryservices.inputs.InMageRcmNicDetailsResponse;
import io.pulumi.azurenative.recoveryservices.inputs.InMageRcmProtectedDiskDetailsResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * InMageRcm provider specific details.
 * 
 */
public final class InMageRcmReplicationDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final InMageRcmReplicationDetailsResponse Empty = new InMageRcmReplicationDetailsResponse();

    /**
     * The agent upgrade blocking error information.
     * 
     */
    @Import(name="agentUpgradeBlockingErrorDetails", required=true)
      private final List<InMageRcmAgentUpgradeBlockingErrorDetailsResponse> agentUpgradeBlockingErrorDetails;

    public List<InMageRcmAgentUpgradeBlockingErrorDetailsResponse> getAgentUpgradeBlockingErrorDetails() {
        return this.agentUpgradeBlockingErrorDetails;
    }

    /**
     * The agent auto upgrade state.
     * 
     */
    @Import(name="agentUpgradeState", required=true)
      private final String agentUpgradeState;

    public String getAgentUpgradeState() {
        return this.agentUpgradeState;
    }

    /**
     * The allocated memory in MB.
     * 
     */
    @Import(name="allocatedMemoryInMB", required=true)
      private final Double allocatedMemoryInMB;

    public Double getAllocatedMemoryInMB() {
        return this.allocatedMemoryInMB;
    }

    /**
     * The type of the discovered VM.
     * 
     */
    @Import(name="discoveryType", required=true)
      private final String discoveryType;

    public String getDiscoveryType() {
        return this.discoveryType;
    }

    /**
     * The ARM Id of the discovered VM.
     * 
     */
    @Import(name="fabricDiscoveryMachineId", required=true)
      private final String fabricDiscoveryMachineId;

    public String getFabricDiscoveryMachineId() {
        return this.fabricDiscoveryMachineId;
    }

    /**
     * The recovery point Id to which the VM was failed over.
     * 
     */
    @Import(name="failoverRecoveryPointId", required=true)
      private final String failoverRecoveryPointId;

    public String getFailoverRecoveryPointId() {
        return this.failoverRecoveryPointId;
    }

    /**
     * The firmware type.
     * 
     */
    @Import(name="firmwareType", required=true)
      private final String firmwareType;

    public String getFirmwareType() {
        return this.firmwareType;
    }

    /**
     * The initial replication processed bytes. This includes sum of total bytes transferred and matched bytes on all selected disks in source VM.
     * 
     */
    @Import(name="initialReplicationProcessedBytes", required=true)
      private final Double initialReplicationProcessedBytes;

    public Double getInitialReplicationProcessedBytes() {
        return this.initialReplicationProcessedBytes;
    }

    /**
     * The initial replication progress percentage. This is calculated based on total bytes processed for all disks in the source VM.
     * 
     */
    @Import(name="initialReplicationProgressPercentage", required=true)
      private final Integer initialReplicationProgressPercentage;

    public Integer getInitialReplicationProgressPercentage() {
        return this.initialReplicationProgressPercentage;
    }

    /**
     * The initial replication transferred bytes from source VM to azure for all selected disks on source VM.
     * 
     */
    @Import(name="initialReplicationTransferredBytes", required=true)
      private final Double initialReplicationTransferredBytes;

    public Double getInitialReplicationTransferredBytes() {
        return this.initialReplicationTransferredBytes;
    }

    /**
     * Gets the Instance type.
     * Expected value is 'InMageRcm'.
     * 
     */
    @Import(name="instanceType", required=true)
      private final String instanceType;

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * The virtual machine internal identifier.
     * 
     */
    @Import(name="internalIdentifier", required=true)
      private final String internalIdentifier;

    public String getInternalIdentifier() {
        return this.internalIdentifier;
    }

    /**
     * A value indicating whether last agent upgrade was successful or not.
     * 
     */
    @Import(name="isLastUpgradeSuccessful", required=true)
      private final String isLastUpgradeSuccessful;

    public String getIsLastUpgradeSuccessful() {
        return this.isLastUpgradeSuccessful;
    }

    /**
     * The last agent upgrade error information.
     * 
     */
    @Import(name="lastAgentUpgradeErrorDetails", required=true)
      private final List<InMageRcmLastAgentUpgradeErrorDetailsResponse> lastAgentUpgradeErrorDetails;

    public List<InMageRcmLastAgentUpgradeErrorDetailsResponse> getLastAgentUpgradeErrorDetails() {
        return this.lastAgentUpgradeErrorDetails;
    }

    /**
     * The last agent upgrade failed or cancelled job Id.
     * 
     */
    @Import(name="lastAgentUpgradeFailedJobId", required=true)
      private final String lastAgentUpgradeFailedJobId;

    public String getLastAgentUpgradeFailedJobId() {
        return this.lastAgentUpgradeFailedJobId;
    }

    /**
     * The last agent upgrade type.
     * 
     */
    @Import(name="lastAgentUpgradeType", required=true)
      private final String lastAgentUpgradeType;

    public String getLastAgentUpgradeType() {
        return this.lastAgentUpgradeType;
    }

    /**
     * The last recovery point Id.
     * 
     */
    @Import(name="lastRecoveryPointId", required=true)
      private final String lastRecoveryPointId;

    public String getLastRecoveryPointId() {
        return this.lastRecoveryPointId;
    }

    /**
     * The last recovery point received time.
     * 
     */
    @Import(name="lastRecoveryPointReceived", required=true)
      private final String lastRecoveryPointReceived;

    public String getLastRecoveryPointReceived() {
        return this.lastRecoveryPointReceived;
    }

    /**
     * The last recovery point objective calculated time.
     * 
     */
    @Import(name="lastRpoCalculatedTime", required=true)
      private final String lastRpoCalculatedTime;

    public String getLastRpoCalculatedTime() {
        return this.lastRpoCalculatedTime;
    }

    /**
     * The last recovery point objective value.
     * 
     */
    @Import(name="lastRpoInSeconds", required=true)
      private final Double lastRpoInSeconds;

    public Double getLastRpoInSeconds() {
        return this.lastRpoInSeconds;
    }

    /**
     * License Type of the VM to be used.
     * 
     */
    @Import(name="licenseType", required=true)
      private final String licenseType;

    public String getLicenseType() {
        return this.licenseType;
    }

    /**
     * The mobility agent information.
     * 
     */
    @Import(name="mobilityAgentDetails", required=true)
      private final InMageRcmMobilityAgentDetailsResponse mobilityAgentDetails;

    public InMageRcmMobilityAgentDetailsResponse getMobilityAgentDetails() {
        return this.mobilityAgentDetails;
    }

    /**
     * The multi VM group name.
     * 
     */
    @Import(name="multiVmGroupName", required=true)
      private final String multiVmGroupName;

    public String getMultiVmGroupName() {
        return this.multiVmGroupName;
    }

    /**
     * The type of the OS on the VM.
     * 
     */
    @Import(name="osType", required=true)
      private final String osType;

    public String getOsType() {
        return this.osType;
    }

    /**
     * The process server Id.
     * 
     */
    @Import(name="processServerId", required=true)
      private final String processServerId;

    public String getProcessServerId() {
        return this.processServerId;
    }

    /**
     * The process server name.
     * 
     */
    @Import(name="processServerName", required=true)
      private final String processServerName;

    public String getProcessServerName() {
        return this.processServerName;
    }

    /**
     * The processor core count.
     * 
     */
    @Import(name="processorCoreCount", required=true)
      private final Integer processorCoreCount;

    public Integer getProcessorCoreCount() {
        return this.processorCoreCount;
    }

    /**
     * The list of protected disks.
     * 
     */
    @Import(name="protectedDisks", required=true)
      private final List<InMageRcmProtectedDiskDetailsResponse> protectedDisks;

    public List<InMageRcmProtectedDiskDetailsResponse> getProtectedDisks() {
        return this.protectedDisks;
    }

    /**
     * The resync processed bytes. This includes sum of total bytes transferred and matched bytes on all selected disks in source VM.
     * 
     */
    @Import(name="resyncProcessedBytes", required=true)
      private final Double resyncProcessedBytes;

    public Double getResyncProcessedBytes() {
        return this.resyncProcessedBytes;
    }

    /**
     * The resync progress percentage. This is calculated based on total bytes processed for all disks in the source VM.
     * 
     */
    @Import(name="resyncProgressPercentage", required=true)
      private final Integer resyncProgressPercentage;

    public Integer getResyncProgressPercentage() {
        return this.resyncProgressPercentage;
    }

    /**
     * A value indicating whether resync is required.
     * 
     */
    @Import(name="resyncRequired", required=true)
      private final String resyncRequired;

    public String getResyncRequired() {
        return this.resyncRequired;
    }

    /**
     * The resync state.
     * 
     */
    @Import(name="resyncState", required=true)
      private final String resyncState;

    public String getResyncState() {
        return this.resyncState;
    }

    /**
     * The resync transferred bytes from source VM to azure for all selected disks on source VM.
     * 
     */
    @Import(name="resyncTransferredBytes", required=true)
      private final Double resyncTransferredBytes;

    public Double getResyncTransferredBytes() {
        return this.resyncTransferredBytes;
    }

    /**
     * The run-as account Id.
     * 
     */
    @Import(name="runAsAccountId", required=true)
      private final String runAsAccountId;

    public String getRunAsAccountId() {
        return this.runAsAccountId;
    }

    /**
     * The target availability set Id.
     * 
     */
    @Import(name="targetAvailabilitySetId", required=true)
      private final String targetAvailabilitySetId;

    public String getTargetAvailabilitySetId() {
        return this.targetAvailabilitySetId;
    }

    /**
     * The target availability zone.
     * 
     */
    @Import(name="targetAvailabilityZone", required=true)
      private final String targetAvailabilityZone;

    public String getTargetAvailabilityZone() {
        return this.targetAvailabilityZone;
    }

    /**
     * The target boot diagnostics storage account ARM Id.
     * 
     */
    @Import(name="targetBootDiagnosticsStorageAccountId", required=true)
      private final String targetBootDiagnosticsStorageAccountId;

    public String getTargetBootDiagnosticsStorageAccountId() {
        return this.targetBootDiagnosticsStorageAccountId;
    }

    /**
     * The target generation.
     * 
     */
    @Import(name="targetGeneration", required=true)
      private final String targetGeneration;

    public String getTargetGeneration() {
        return this.targetGeneration;
    }

    /**
     * The target network Id.
     * 
     */
    @Import(name="targetNetworkId", required=true)
      private final String targetNetworkId;

    public String getTargetNetworkId() {
        return this.targetNetworkId;
    }

    /**
     * The target proximity placement group Id.
     * 
     */
    @Import(name="targetProximityPlacementGroupId", required=true)
      private final String targetProximityPlacementGroupId;

    public String getTargetProximityPlacementGroupId() {
        return this.targetProximityPlacementGroupId;
    }

    /**
     * The target resource group Id.
     * 
     */
    @Import(name="targetResourceGroupId", required=true)
      private final String targetResourceGroupId;

    public String getTargetResourceGroupId() {
        return this.targetResourceGroupId;
    }

    /**
     * Target VM name.
     * 
     */
    @Import(name="targetVmName", required=true)
      private final String targetVmName;

    public String getTargetVmName() {
        return this.targetVmName;
    }

    /**
     * The target VM size.
     * 
     */
    @Import(name="targetVmSize", required=true)
      private final String targetVmSize;

    public String getTargetVmSize() {
        return this.targetVmSize;
    }

    /**
     * The test network Id.
     * 
     */
    @Import(name="testNetworkId", required=true)
      private final String testNetworkId;

    public String getTestNetworkId() {
        return this.testNetworkId;
    }

    /**
     * The network details.
     * 
     */
    @Import(name="vmNics", required=true)
      private final List<InMageRcmNicDetailsResponse> vmNics;

    public List<InMageRcmNicDetailsResponse> getVmNics() {
        return this.vmNics;
    }

    public InMageRcmReplicationDetailsResponse(
        List<InMageRcmAgentUpgradeBlockingErrorDetailsResponse> agentUpgradeBlockingErrorDetails,
        String agentUpgradeState,
        Double allocatedMemoryInMB,
        String discoveryType,
        String fabricDiscoveryMachineId,
        String failoverRecoveryPointId,
        String firmwareType,
        Double initialReplicationProcessedBytes,
        Integer initialReplicationProgressPercentage,
        Double initialReplicationTransferredBytes,
        String instanceType,
        String internalIdentifier,
        String isLastUpgradeSuccessful,
        List<InMageRcmLastAgentUpgradeErrorDetailsResponse> lastAgentUpgradeErrorDetails,
        String lastAgentUpgradeFailedJobId,
        String lastAgentUpgradeType,
        String lastRecoveryPointId,
        String lastRecoveryPointReceived,
        String lastRpoCalculatedTime,
        Double lastRpoInSeconds,
        String licenseType,
        InMageRcmMobilityAgentDetailsResponse mobilityAgentDetails,
        String multiVmGroupName,
        String osType,
        String processServerId,
        String processServerName,
        Integer processorCoreCount,
        List<InMageRcmProtectedDiskDetailsResponse> protectedDisks,
        Double resyncProcessedBytes,
        Integer resyncProgressPercentage,
        String resyncRequired,
        String resyncState,
        Double resyncTransferredBytes,
        String runAsAccountId,
        String targetAvailabilitySetId,
        String targetAvailabilityZone,
        String targetBootDiagnosticsStorageAccountId,
        String targetGeneration,
        String targetNetworkId,
        String targetProximityPlacementGroupId,
        String targetResourceGroupId,
        String targetVmName,
        String targetVmSize,
        String testNetworkId,
        List<InMageRcmNicDetailsResponse> vmNics) {
        this.agentUpgradeBlockingErrorDetails = Objects.requireNonNull(agentUpgradeBlockingErrorDetails, "expected parameter 'agentUpgradeBlockingErrorDetails' to be non-null");
        this.agentUpgradeState = Objects.requireNonNull(agentUpgradeState, "expected parameter 'agentUpgradeState' to be non-null");
        this.allocatedMemoryInMB = Objects.requireNonNull(allocatedMemoryInMB, "expected parameter 'allocatedMemoryInMB' to be non-null");
        this.discoveryType = Objects.requireNonNull(discoveryType, "expected parameter 'discoveryType' to be non-null");
        this.fabricDiscoveryMachineId = Objects.requireNonNull(fabricDiscoveryMachineId, "expected parameter 'fabricDiscoveryMachineId' to be non-null");
        this.failoverRecoveryPointId = Objects.requireNonNull(failoverRecoveryPointId, "expected parameter 'failoverRecoveryPointId' to be non-null");
        this.firmwareType = Objects.requireNonNull(firmwareType, "expected parameter 'firmwareType' to be non-null");
        this.initialReplicationProcessedBytes = Objects.requireNonNull(initialReplicationProcessedBytes, "expected parameter 'initialReplicationProcessedBytes' to be non-null");
        this.initialReplicationProgressPercentage = Objects.requireNonNull(initialReplicationProgressPercentage, "expected parameter 'initialReplicationProgressPercentage' to be non-null");
        this.initialReplicationTransferredBytes = Objects.requireNonNull(initialReplicationTransferredBytes, "expected parameter 'initialReplicationTransferredBytes' to be non-null");
        this.instanceType = Objects.requireNonNull(instanceType, "expected parameter 'instanceType' to be non-null");
        this.internalIdentifier = Objects.requireNonNull(internalIdentifier, "expected parameter 'internalIdentifier' to be non-null");
        this.isLastUpgradeSuccessful = Objects.requireNonNull(isLastUpgradeSuccessful, "expected parameter 'isLastUpgradeSuccessful' to be non-null");
        this.lastAgentUpgradeErrorDetails = Objects.requireNonNull(lastAgentUpgradeErrorDetails, "expected parameter 'lastAgentUpgradeErrorDetails' to be non-null");
        this.lastAgentUpgradeFailedJobId = Objects.requireNonNull(lastAgentUpgradeFailedJobId, "expected parameter 'lastAgentUpgradeFailedJobId' to be non-null");
        this.lastAgentUpgradeType = Objects.requireNonNull(lastAgentUpgradeType, "expected parameter 'lastAgentUpgradeType' to be non-null");
        this.lastRecoveryPointId = Objects.requireNonNull(lastRecoveryPointId, "expected parameter 'lastRecoveryPointId' to be non-null");
        this.lastRecoveryPointReceived = Objects.requireNonNull(lastRecoveryPointReceived, "expected parameter 'lastRecoveryPointReceived' to be non-null");
        this.lastRpoCalculatedTime = Objects.requireNonNull(lastRpoCalculatedTime, "expected parameter 'lastRpoCalculatedTime' to be non-null");
        this.lastRpoInSeconds = Objects.requireNonNull(lastRpoInSeconds, "expected parameter 'lastRpoInSeconds' to be non-null");
        this.licenseType = Objects.requireNonNull(licenseType, "expected parameter 'licenseType' to be non-null");
        this.mobilityAgentDetails = Objects.requireNonNull(mobilityAgentDetails, "expected parameter 'mobilityAgentDetails' to be non-null");
        this.multiVmGroupName = Objects.requireNonNull(multiVmGroupName, "expected parameter 'multiVmGroupName' to be non-null");
        this.osType = Objects.requireNonNull(osType, "expected parameter 'osType' to be non-null");
        this.processServerId = Objects.requireNonNull(processServerId, "expected parameter 'processServerId' to be non-null");
        this.processServerName = Objects.requireNonNull(processServerName, "expected parameter 'processServerName' to be non-null");
        this.processorCoreCount = Objects.requireNonNull(processorCoreCount, "expected parameter 'processorCoreCount' to be non-null");
        this.protectedDisks = Objects.requireNonNull(protectedDisks, "expected parameter 'protectedDisks' to be non-null");
        this.resyncProcessedBytes = Objects.requireNonNull(resyncProcessedBytes, "expected parameter 'resyncProcessedBytes' to be non-null");
        this.resyncProgressPercentage = Objects.requireNonNull(resyncProgressPercentage, "expected parameter 'resyncProgressPercentage' to be non-null");
        this.resyncRequired = Objects.requireNonNull(resyncRequired, "expected parameter 'resyncRequired' to be non-null");
        this.resyncState = Objects.requireNonNull(resyncState, "expected parameter 'resyncState' to be non-null");
        this.resyncTransferredBytes = Objects.requireNonNull(resyncTransferredBytes, "expected parameter 'resyncTransferredBytes' to be non-null");
        this.runAsAccountId = Objects.requireNonNull(runAsAccountId, "expected parameter 'runAsAccountId' to be non-null");
        this.targetAvailabilitySetId = Objects.requireNonNull(targetAvailabilitySetId, "expected parameter 'targetAvailabilitySetId' to be non-null");
        this.targetAvailabilityZone = Objects.requireNonNull(targetAvailabilityZone, "expected parameter 'targetAvailabilityZone' to be non-null");
        this.targetBootDiagnosticsStorageAccountId = Objects.requireNonNull(targetBootDiagnosticsStorageAccountId, "expected parameter 'targetBootDiagnosticsStorageAccountId' to be non-null");
        this.targetGeneration = Objects.requireNonNull(targetGeneration, "expected parameter 'targetGeneration' to be non-null");
        this.targetNetworkId = Objects.requireNonNull(targetNetworkId, "expected parameter 'targetNetworkId' to be non-null");
        this.targetProximityPlacementGroupId = Objects.requireNonNull(targetProximityPlacementGroupId, "expected parameter 'targetProximityPlacementGroupId' to be non-null");
        this.targetResourceGroupId = Objects.requireNonNull(targetResourceGroupId, "expected parameter 'targetResourceGroupId' to be non-null");
        this.targetVmName = Objects.requireNonNull(targetVmName, "expected parameter 'targetVmName' to be non-null");
        this.targetVmSize = Objects.requireNonNull(targetVmSize, "expected parameter 'targetVmSize' to be non-null");
        this.testNetworkId = Objects.requireNonNull(testNetworkId, "expected parameter 'testNetworkId' to be non-null");
        this.vmNics = Objects.requireNonNull(vmNics, "expected parameter 'vmNics' to be non-null");
    }

    private InMageRcmReplicationDetailsResponse() {
        this.agentUpgradeBlockingErrorDetails = List.of();
        this.agentUpgradeState = null;
        this.allocatedMemoryInMB = null;
        this.discoveryType = null;
        this.fabricDiscoveryMachineId = null;
        this.failoverRecoveryPointId = null;
        this.firmwareType = null;
        this.initialReplicationProcessedBytes = null;
        this.initialReplicationProgressPercentage = null;
        this.initialReplicationTransferredBytes = null;
        this.instanceType = null;
        this.internalIdentifier = null;
        this.isLastUpgradeSuccessful = null;
        this.lastAgentUpgradeErrorDetails = List.of();
        this.lastAgentUpgradeFailedJobId = null;
        this.lastAgentUpgradeType = null;
        this.lastRecoveryPointId = null;
        this.lastRecoveryPointReceived = null;
        this.lastRpoCalculatedTime = null;
        this.lastRpoInSeconds = null;
        this.licenseType = null;
        this.mobilityAgentDetails = null;
        this.multiVmGroupName = null;
        this.osType = null;
        this.processServerId = null;
        this.processServerName = null;
        this.processorCoreCount = null;
        this.protectedDisks = List.of();
        this.resyncProcessedBytes = null;
        this.resyncProgressPercentage = null;
        this.resyncRequired = null;
        this.resyncState = null;
        this.resyncTransferredBytes = null;
        this.runAsAccountId = null;
        this.targetAvailabilitySetId = null;
        this.targetAvailabilityZone = null;
        this.targetBootDiagnosticsStorageAccountId = null;
        this.targetGeneration = null;
        this.targetNetworkId = null;
        this.targetProximityPlacementGroupId = null;
        this.targetResourceGroupId = null;
        this.targetVmName = null;
        this.targetVmSize = null;
        this.testNetworkId = null;
        this.vmNics = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InMageRcmReplicationDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<InMageRcmAgentUpgradeBlockingErrorDetailsResponse> agentUpgradeBlockingErrorDetails;
        private String agentUpgradeState;
        private Double allocatedMemoryInMB;
        private String discoveryType;
        private String fabricDiscoveryMachineId;
        private String failoverRecoveryPointId;
        private String firmwareType;
        private Double initialReplicationProcessedBytes;
        private Integer initialReplicationProgressPercentage;
        private Double initialReplicationTransferredBytes;
        private String instanceType;
        private String internalIdentifier;
        private String isLastUpgradeSuccessful;
        private List<InMageRcmLastAgentUpgradeErrorDetailsResponse> lastAgentUpgradeErrorDetails;
        private String lastAgentUpgradeFailedJobId;
        private String lastAgentUpgradeType;
        private String lastRecoveryPointId;
        private String lastRecoveryPointReceived;
        private String lastRpoCalculatedTime;
        private Double lastRpoInSeconds;
        private String licenseType;
        private InMageRcmMobilityAgentDetailsResponse mobilityAgentDetails;
        private String multiVmGroupName;
        private String osType;
        private String processServerId;
        private String processServerName;
        private Integer processorCoreCount;
        private List<InMageRcmProtectedDiskDetailsResponse> protectedDisks;
        private Double resyncProcessedBytes;
        private Integer resyncProgressPercentage;
        private String resyncRequired;
        private String resyncState;
        private Double resyncTransferredBytes;
        private String runAsAccountId;
        private String targetAvailabilitySetId;
        private String targetAvailabilityZone;
        private String targetBootDiagnosticsStorageAccountId;
        private String targetGeneration;
        private String targetNetworkId;
        private String targetProximityPlacementGroupId;
        private String targetResourceGroupId;
        private String targetVmName;
        private String targetVmSize;
        private String testNetworkId;
        private List<InMageRcmNicDetailsResponse> vmNics;

        public Builder() {
    	      // Empty
        }

        public Builder(InMageRcmReplicationDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentUpgradeBlockingErrorDetails = defaults.agentUpgradeBlockingErrorDetails;
    	      this.agentUpgradeState = defaults.agentUpgradeState;
    	      this.allocatedMemoryInMB = defaults.allocatedMemoryInMB;
    	      this.discoveryType = defaults.discoveryType;
    	      this.fabricDiscoveryMachineId = defaults.fabricDiscoveryMachineId;
    	      this.failoverRecoveryPointId = defaults.failoverRecoveryPointId;
    	      this.firmwareType = defaults.firmwareType;
    	      this.initialReplicationProcessedBytes = defaults.initialReplicationProcessedBytes;
    	      this.initialReplicationProgressPercentage = defaults.initialReplicationProgressPercentage;
    	      this.initialReplicationTransferredBytes = defaults.initialReplicationTransferredBytes;
    	      this.instanceType = defaults.instanceType;
    	      this.internalIdentifier = defaults.internalIdentifier;
    	      this.isLastUpgradeSuccessful = defaults.isLastUpgradeSuccessful;
    	      this.lastAgentUpgradeErrorDetails = defaults.lastAgentUpgradeErrorDetails;
    	      this.lastAgentUpgradeFailedJobId = defaults.lastAgentUpgradeFailedJobId;
    	      this.lastAgentUpgradeType = defaults.lastAgentUpgradeType;
    	      this.lastRecoveryPointId = defaults.lastRecoveryPointId;
    	      this.lastRecoveryPointReceived = defaults.lastRecoveryPointReceived;
    	      this.lastRpoCalculatedTime = defaults.lastRpoCalculatedTime;
    	      this.lastRpoInSeconds = defaults.lastRpoInSeconds;
    	      this.licenseType = defaults.licenseType;
    	      this.mobilityAgentDetails = defaults.mobilityAgentDetails;
    	      this.multiVmGroupName = defaults.multiVmGroupName;
    	      this.osType = defaults.osType;
    	      this.processServerId = defaults.processServerId;
    	      this.processServerName = defaults.processServerName;
    	      this.processorCoreCount = defaults.processorCoreCount;
    	      this.protectedDisks = defaults.protectedDisks;
    	      this.resyncProcessedBytes = defaults.resyncProcessedBytes;
    	      this.resyncProgressPercentage = defaults.resyncProgressPercentage;
    	      this.resyncRequired = defaults.resyncRequired;
    	      this.resyncState = defaults.resyncState;
    	      this.resyncTransferredBytes = defaults.resyncTransferredBytes;
    	      this.runAsAccountId = defaults.runAsAccountId;
    	      this.targetAvailabilitySetId = defaults.targetAvailabilitySetId;
    	      this.targetAvailabilityZone = defaults.targetAvailabilityZone;
    	      this.targetBootDiagnosticsStorageAccountId = defaults.targetBootDiagnosticsStorageAccountId;
    	      this.targetGeneration = defaults.targetGeneration;
    	      this.targetNetworkId = defaults.targetNetworkId;
    	      this.targetProximityPlacementGroupId = defaults.targetProximityPlacementGroupId;
    	      this.targetResourceGroupId = defaults.targetResourceGroupId;
    	      this.targetVmName = defaults.targetVmName;
    	      this.targetVmSize = defaults.targetVmSize;
    	      this.testNetworkId = defaults.testNetworkId;
    	      this.vmNics = defaults.vmNics;
        }

        public Builder agentUpgradeBlockingErrorDetails(List<InMageRcmAgentUpgradeBlockingErrorDetailsResponse> agentUpgradeBlockingErrorDetails) {
            this.agentUpgradeBlockingErrorDetails = Objects.requireNonNull(agentUpgradeBlockingErrorDetails);
            return this;
        }

        public Builder agentUpgradeState(String agentUpgradeState) {
            this.agentUpgradeState = Objects.requireNonNull(agentUpgradeState);
            return this;
        }

        public Builder allocatedMemoryInMB(Double allocatedMemoryInMB) {
            this.allocatedMemoryInMB = Objects.requireNonNull(allocatedMemoryInMB);
            return this;
        }

        public Builder discoveryType(String discoveryType) {
            this.discoveryType = Objects.requireNonNull(discoveryType);
            return this;
        }

        public Builder fabricDiscoveryMachineId(String fabricDiscoveryMachineId) {
            this.fabricDiscoveryMachineId = Objects.requireNonNull(fabricDiscoveryMachineId);
            return this;
        }

        public Builder failoverRecoveryPointId(String failoverRecoveryPointId) {
            this.failoverRecoveryPointId = Objects.requireNonNull(failoverRecoveryPointId);
            return this;
        }

        public Builder firmwareType(String firmwareType) {
            this.firmwareType = Objects.requireNonNull(firmwareType);
            return this;
        }

        public Builder initialReplicationProcessedBytes(Double initialReplicationProcessedBytes) {
            this.initialReplicationProcessedBytes = Objects.requireNonNull(initialReplicationProcessedBytes);
            return this;
        }

        public Builder initialReplicationProgressPercentage(Integer initialReplicationProgressPercentage) {
            this.initialReplicationProgressPercentage = Objects.requireNonNull(initialReplicationProgressPercentage);
            return this;
        }

        public Builder initialReplicationTransferredBytes(Double initialReplicationTransferredBytes) {
            this.initialReplicationTransferredBytes = Objects.requireNonNull(initialReplicationTransferredBytes);
            return this;
        }

        public Builder instanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder internalIdentifier(String internalIdentifier) {
            this.internalIdentifier = Objects.requireNonNull(internalIdentifier);
            return this;
        }

        public Builder isLastUpgradeSuccessful(String isLastUpgradeSuccessful) {
            this.isLastUpgradeSuccessful = Objects.requireNonNull(isLastUpgradeSuccessful);
            return this;
        }

        public Builder lastAgentUpgradeErrorDetails(List<InMageRcmLastAgentUpgradeErrorDetailsResponse> lastAgentUpgradeErrorDetails) {
            this.lastAgentUpgradeErrorDetails = Objects.requireNonNull(lastAgentUpgradeErrorDetails);
            return this;
        }

        public Builder lastAgentUpgradeFailedJobId(String lastAgentUpgradeFailedJobId) {
            this.lastAgentUpgradeFailedJobId = Objects.requireNonNull(lastAgentUpgradeFailedJobId);
            return this;
        }

        public Builder lastAgentUpgradeType(String lastAgentUpgradeType) {
            this.lastAgentUpgradeType = Objects.requireNonNull(lastAgentUpgradeType);
            return this;
        }

        public Builder lastRecoveryPointId(String lastRecoveryPointId) {
            this.lastRecoveryPointId = Objects.requireNonNull(lastRecoveryPointId);
            return this;
        }

        public Builder lastRecoveryPointReceived(String lastRecoveryPointReceived) {
            this.lastRecoveryPointReceived = Objects.requireNonNull(lastRecoveryPointReceived);
            return this;
        }

        public Builder lastRpoCalculatedTime(String lastRpoCalculatedTime) {
            this.lastRpoCalculatedTime = Objects.requireNonNull(lastRpoCalculatedTime);
            return this;
        }

        public Builder lastRpoInSeconds(Double lastRpoInSeconds) {
            this.lastRpoInSeconds = Objects.requireNonNull(lastRpoInSeconds);
            return this;
        }

        public Builder licenseType(String licenseType) {
            this.licenseType = Objects.requireNonNull(licenseType);
            return this;
        }

        public Builder mobilityAgentDetails(InMageRcmMobilityAgentDetailsResponse mobilityAgentDetails) {
            this.mobilityAgentDetails = Objects.requireNonNull(mobilityAgentDetails);
            return this;
        }

        public Builder multiVmGroupName(String multiVmGroupName) {
            this.multiVmGroupName = Objects.requireNonNull(multiVmGroupName);
            return this;
        }

        public Builder osType(String osType) {
            this.osType = Objects.requireNonNull(osType);
            return this;
        }

        public Builder processServerId(String processServerId) {
            this.processServerId = Objects.requireNonNull(processServerId);
            return this;
        }

        public Builder processServerName(String processServerName) {
            this.processServerName = Objects.requireNonNull(processServerName);
            return this;
        }

        public Builder processorCoreCount(Integer processorCoreCount) {
            this.processorCoreCount = Objects.requireNonNull(processorCoreCount);
            return this;
        }

        public Builder protectedDisks(List<InMageRcmProtectedDiskDetailsResponse> protectedDisks) {
            this.protectedDisks = Objects.requireNonNull(protectedDisks);
            return this;
        }

        public Builder resyncProcessedBytes(Double resyncProcessedBytes) {
            this.resyncProcessedBytes = Objects.requireNonNull(resyncProcessedBytes);
            return this;
        }

        public Builder resyncProgressPercentage(Integer resyncProgressPercentage) {
            this.resyncProgressPercentage = Objects.requireNonNull(resyncProgressPercentage);
            return this;
        }

        public Builder resyncRequired(String resyncRequired) {
            this.resyncRequired = Objects.requireNonNull(resyncRequired);
            return this;
        }

        public Builder resyncState(String resyncState) {
            this.resyncState = Objects.requireNonNull(resyncState);
            return this;
        }

        public Builder resyncTransferredBytes(Double resyncTransferredBytes) {
            this.resyncTransferredBytes = Objects.requireNonNull(resyncTransferredBytes);
            return this;
        }

        public Builder runAsAccountId(String runAsAccountId) {
            this.runAsAccountId = Objects.requireNonNull(runAsAccountId);
            return this;
        }

        public Builder targetAvailabilitySetId(String targetAvailabilitySetId) {
            this.targetAvailabilitySetId = Objects.requireNonNull(targetAvailabilitySetId);
            return this;
        }

        public Builder targetAvailabilityZone(String targetAvailabilityZone) {
            this.targetAvailabilityZone = Objects.requireNonNull(targetAvailabilityZone);
            return this;
        }

        public Builder targetBootDiagnosticsStorageAccountId(String targetBootDiagnosticsStorageAccountId) {
            this.targetBootDiagnosticsStorageAccountId = Objects.requireNonNull(targetBootDiagnosticsStorageAccountId);
            return this;
        }

        public Builder targetGeneration(String targetGeneration) {
            this.targetGeneration = Objects.requireNonNull(targetGeneration);
            return this;
        }

        public Builder targetNetworkId(String targetNetworkId) {
            this.targetNetworkId = Objects.requireNonNull(targetNetworkId);
            return this;
        }

        public Builder targetProximityPlacementGroupId(String targetProximityPlacementGroupId) {
            this.targetProximityPlacementGroupId = Objects.requireNonNull(targetProximityPlacementGroupId);
            return this;
        }

        public Builder targetResourceGroupId(String targetResourceGroupId) {
            this.targetResourceGroupId = Objects.requireNonNull(targetResourceGroupId);
            return this;
        }

        public Builder targetVmName(String targetVmName) {
            this.targetVmName = Objects.requireNonNull(targetVmName);
            return this;
        }

        public Builder targetVmSize(String targetVmSize) {
            this.targetVmSize = Objects.requireNonNull(targetVmSize);
            return this;
        }

        public Builder testNetworkId(String testNetworkId) {
            this.testNetworkId = Objects.requireNonNull(testNetworkId);
            return this;
        }

        public Builder vmNics(List<InMageRcmNicDetailsResponse> vmNics) {
            this.vmNics = Objects.requireNonNull(vmNics);
            return this;
        }
        public InMageRcmReplicationDetailsResponse build() {
            return new InMageRcmReplicationDetailsResponse(agentUpgradeBlockingErrorDetails, agentUpgradeState, allocatedMemoryInMB, discoveryType, fabricDiscoveryMachineId, failoverRecoveryPointId, firmwareType, initialReplicationProcessedBytes, initialReplicationProgressPercentage, initialReplicationTransferredBytes, instanceType, internalIdentifier, isLastUpgradeSuccessful, lastAgentUpgradeErrorDetails, lastAgentUpgradeFailedJobId, lastAgentUpgradeType, lastRecoveryPointId, lastRecoveryPointReceived, lastRpoCalculatedTime, lastRpoInSeconds, licenseType, mobilityAgentDetails, multiVmGroupName, osType, processServerId, processServerName, processorCoreCount, protectedDisks, resyncProcessedBytes, resyncProgressPercentage, resyncRequired, resyncState, resyncTransferredBytes, runAsAccountId, targetAvailabilitySetId, targetAvailabilityZone, targetBootDiagnosticsStorageAccountId, targetGeneration, targetNetworkId, targetProximityPlacementGroupId, targetResourceGroupId, targetVmName, targetVmSize, testNetworkId, vmNics);
        }
    }
}
