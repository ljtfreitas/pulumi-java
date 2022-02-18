// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Hyper-V Replica Azure specific input for creating a protection profile.
 * 
 */
public final class HyperVReplicaAzurePolicyInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final HyperVReplicaAzurePolicyInputArgs Empty = new HyperVReplicaAzurePolicyInputArgs();

    /**
     * The interval (in hours) at which Hyper-V Replica should create an application consistent snapshot within the VM.
     * 
     */
    @InputImport(name="applicationConsistentSnapshotFrequencyInHours")
    private final @Nullable Input<Integer> applicationConsistentSnapshotFrequencyInHours;

    public Input<Integer> getApplicationConsistentSnapshotFrequencyInHours() {
        return this.applicationConsistentSnapshotFrequencyInHours == null ? Input.empty() : this.applicationConsistentSnapshotFrequencyInHours;
    }

    /**
     * The class type.
     * Expected value is 'HyperVReplicaAzure'.
     * 
     */
    @InputImport(name="instanceType")
    private final @Nullable Input<String> instanceType;

    public Input<String> getInstanceType() {
        return this.instanceType == null ? Input.empty() : this.instanceType;
    }

    /**
     * The scheduled start time for the initial replication. If this parameter is Null, the initial replication starts immediately.
     * 
     */
    @InputImport(name="onlineReplicationStartTime")
    private final @Nullable Input<String> onlineReplicationStartTime;

    public Input<String> getOnlineReplicationStartTime() {
        return this.onlineReplicationStartTime == null ? Input.empty() : this.onlineReplicationStartTime;
    }

    /**
     * The duration (in hours) to which point the recovery history needs to be maintained.
     * 
     */
    @InputImport(name="recoveryPointHistoryDuration")
    private final @Nullable Input<Integer> recoveryPointHistoryDuration;

    public Input<Integer> getRecoveryPointHistoryDuration() {
        return this.recoveryPointHistoryDuration == null ? Input.empty() : this.recoveryPointHistoryDuration;
    }

    /**
     * The replication interval.
     * 
     */
    @InputImport(name="replicationInterval")
    private final @Nullable Input<Integer> replicationInterval;

    public Input<Integer> getReplicationInterval() {
        return this.replicationInterval == null ? Input.empty() : this.replicationInterval;
    }

    /**
     * The list of storage accounts to which the VMs in the primary cloud can replicate to.
     * 
     */
    @InputImport(name="storageAccounts")
    private final @Nullable Input<List<String>> storageAccounts;

    public Input<List<String>> getStorageAccounts() {
        return this.storageAccounts == null ? Input.empty() : this.storageAccounts;
    }

    public HyperVReplicaAzurePolicyInputArgs(
        @Nullable Input<Integer> applicationConsistentSnapshotFrequencyInHours,
        @Nullable Input<String> instanceType,
        @Nullable Input<String> onlineReplicationStartTime,
        @Nullable Input<Integer> recoveryPointHistoryDuration,
        @Nullable Input<Integer> replicationInterval,
        @Nullable Input<List<String>> storageAccounts) {
        this.applicationConsistentSnapshotFrequencyInHours = applicationConsistentSnapshotFrequencyInHours;
        this.instanceType = instanceType;
        this.onlineReplicationStartTime = onlineReplicationStartTime;
        this.recoveryPointHistoryDuration = recoveryPointHistoryDuration;
        this.replicationInterval = replicationInterval;
        this.storageAccounts = storageAccounts;
    }

    private HyperVReplicaAzurePolicyInputArgs() {
        this.applicationConsistentSnapshotFrequencyInHours = Input.empty();
        this.instanceType = Input.empty();
        this.onlineReplicationStartTime = Input.empty();
        this.recoveryPointHistoryDuration = Input.empty();
        this.replicationInterval = Input.empty();
        this.storageAccounts = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HyperVReplicaAzurePolicyInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> applicationConsistentSnapshotFrequencyInHours;
        private @Nullable Input<String> instanceType;
        private @Nullable Input<String> onlineReplicationStartTime;
        private @Nullable Input<Integer> recoveryPointHistoryDuration;
        private @Nullable Input<Integer> replicationInterval;
        private @Nullable Input<List<String>> storageAccounts;

        public Builder() {
    	      // Empty
        }

        public Builder(HyperVReplicaAzurePolicyInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationConsistentSnapshotFrequencyInHours = defaults.applicationConsistentSnapshotFrequencyInHours;
    	      this.instanceType = defaults.instanceType;
    	      this.onlineReplicationStartTime = defaults.onlineReplicationStartTime;
    	      this.recoveryPointHistoryDuration = defaults.recoveryPointHistoryDuration;
    	      this.replicationInterval = defaults.replicationInterval;
    	      this.storageAccounts = defaults.storageAccounts;
        }

        public Builder setApplicationConsistentSnapshotFrequencyInHours(@Nullable Input<Integer> applicationConsistentSnapshotFrequencyInHours) {
            this.applicationConsistentSnapshotFrequencyInHours = applicationConsistentSnapshotFrequencyInHours;
            return this;
        }

        public Builder setApplicationConsistentSnapshotFrequencyInHours(@Nullable Integer applicationConsistentSnapshotFrequencyInHours) {
            this.applicationConsistentSnapshotFrequencyInHours = Input.ofNullable(applicationConsistentSnapshotFrequencyInHours);
            return this;
        }

        public Builder setInstanceType(@Nullable Input<String> instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        public Builder setInstanceType(@Nullable String instanceType) {
            this.instanceType = Input.ofNullable(instanceType);
            return this;
        }

        public Builder setOnlineReplicationStartTime(@Nullable Input<String> onlineReplicationStartTime) {
            this.onlineReplicationStartTime = onlineReplicationStartTime;
            return this;
        }

        public Builder setOnlineReplicationStartTime(@Nullable String onlineReplicationStartTime) {
            this.onlineReplicationStartTime = Input.ofNullable(onlineReplicationStartTime);
            return this;
        }

        public Builder setRecoveryPointHistoryDuration(@Nullable Input<Integer> recoveryPointHistoryDuration) {
            this.recoveryPointHistoryDuration = recoveryPointHistoryDuration;
            return this;
        }

        public Builder setRecoveryPointHistoryDuration(@Nullable Integer recoveryPointHistoryDuration) {
            this.recoveryPointHistoryDuration = Input.ofNullable(recoveryPointHistoryDuration);
            return this;
        }

        public Builder setReplicationInterval(@Nullable Input<Integer> replicationInterval) {
            this.replicationInterval = replicationInterval;
            return this;
        }

        public Builder setReplicationInterval(@Nullable Integer replicationInterval) {
            this.replicationInterval = Input.ofNullable(replicationInterval);
            return this;
        }

        public Builder setStorageAccounts(@Nullable Input<List<String>> storageAccounts) {
            this.storageAccounts = storageAccounts;
            return this;
        }

        public Builder setStorageAccounts(@Nullable List<String> storageAccounts) {
            this.storageAccounts = Input.ofNullable(storageAccounts);
            return this;
        }

        public HyperVReplicaAzurePolicyInputArgs build() {
            return new HyperVReplicaAzurePolicyInputArgs(applicationConsistentSnapshotFrequencyInHours, instanceType, onlineReplicationStartTime, recoveryPointHistoryDuration, replicationInterval, storageAccounts);
        }
    }
}
