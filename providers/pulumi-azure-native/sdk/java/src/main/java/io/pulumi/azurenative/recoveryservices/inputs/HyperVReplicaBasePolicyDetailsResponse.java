// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Base class for HyperVReplica policy details.
 * 
 */
public final class HyperVReplicaBasePolicyDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final HyperVReplicaBasePolicyDetailsResponse Empty = new HyperVReplicaBasePolicyDetailsResponse();

    /**
     * A value indicating the authentication type.
     * 
     */
    @Import(name="allowedAuthenticationType")
      private final @Nullable Integer allowedAuthenticationType;

    public Optional<Integer> getAllowedAuthenticationType() {
        return this.allowedAuthenticationType == null ? Optional.empty() : Optional.ofNullable(this.allowedAuthenticationType);
    }

    /**
     * A value indicating the application consistent frequency.
     * 
     */
    @Import(name="applicationConsistentSnapshotFrequencyInHours")
      private final @Nullable Integer applicationConsistentSnapshotFrequencyInHours;

    public Optional<Integer> getApplicationConsistentSnapshotFrequencyInHours() {
        return this.applicationConsistentSnapshotFrequencyInHours == null ? Optional.empty() : Optional.ofNullable(this.applicationConsistentSnapshotFrequencyInHours);
    }

    /**
     * A value indicating whether compression has to be enabled.
     * 
     */
    @Import(name="compression")
      private final @Nullable String compression;

    public Optional<String> getCompression() {
        return this.compression == null ? Optional.empty() : Optional.ofNullable(this.compression);
    }

    /**
     * A value indicating whether IR is online.
     * 
     */
    @Import(name="initialReplicationMethod")
      private final @Nullable String initialReplicationMethod;

    public Optional<String> getInitialReplicationMethod() {
        return this.initialReplicationMethod == null ? Optional.empty() : Optional.ofNullable(this.initialReplicationMethod);
    }

    /**
     * Gets the class type. Overridden in derived classes.
     * Expected value is 'HyperVReplicaBasePolicyDetails'.
     * 
     */
    @Import(name="instanceType", required=true)
      private final String instanceType;

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * A value indicating the offline IR export path.
     * 
     */
    @Import(name="offlineReplicationExportPath")
      private final @Nullable String offlineReplicationExportPath;

    public Optional<String> getOfflineReplicationExportPath() {
        return this.offlineReplicationExportPath == null ? Optional.empty() : Optional.ofNullable(this.offlineReplicationExportPath);
    }

    /**
     * A value indicating the offline IR import path.
     * 
     */
    @Import(name="offlineReplicationImportPath")
      private final @Nullable String offlineReplicationImportPath;

    public Optional<String> getOfflineReplicationImportPath() {
        return this.offlineReplicationImportPath == null ? Optional.empty() : Optional.ofNullable(this.offlineReplicationImportPath);
    }

    /**
     * A value indicating the online IR start time.
     * 
     */
    @Import(name="onlineReplicationStartTime")
      private final @Nullable String onlineReplicationStartTime;

    public Optional<String> getOnlineReplicationStartTime() {
        return this.onlineReplicationStartTime == null ? Optional.empty() : Optional.ofNullable(this.onlineReplicationStartTime);
    }

    /**
     * A value indicating the number of recovery points.
     * 
     */
    @Import(name="recoveryPoints")
      private final @Nullable Integer recoveryPoints;

    public Optional<Integer> getRecoveryPoints() {
        return this.recoveryPoints == null ? Optional.empty() : Optional.ofNullable(this.recoveryPoints);
    }

    /**
     * A value indicating whether the VM has to be auto deleted. Supported Values: String.Empty, None, OnRecoveryCloud
     * 
     */
    @Import(name="replicaDeletionOption")
      private final @Nullable String replicaDeletionOption;

    public Optional<String> getReplicaDeletionOption() {
        return this.replicaDeletionOption == null ? Optional.empty() : Optional.ofNullable(this.replicaDeletionOption);
    }

    /**
     * A value indicating the recovery HTTPS port.
     * 
     */
    @Import(name="replicationPort")
      private final @Nullable Integer replicationPort;

    public Optional<Integer> getReplicationPort() {
        return this.replicationPort == null ? Optional.empty() : Optional.ofNullable(this.replicationPort);
    }

    public HyperVReplicaBasePolicyDetailsResponse(
        @Nullable Integer allowedAuthenticationType,
        @Nullable Integer applicationConsistentSnapshotFrequencyInHours,
        @Nullable String compression,
        @Nullable String initialReplicationMethod,
        String instanceType,
        @Nullable String offlineReplicationExportPath,
        @Nullable String offlineReplicationImportPath,
        @Nullable String onlineReplicationStartTime,
        @Nullable Integer recoveryPoints,
        @Nullable String replicaDeletionOption,
        @Nullable Integer replicationPort) {
        this.allowedAuthenticationType = allowedAuthenticationType;
        this.applicationConsistentSnapshotFrequencyInHours = applicationConsistentSnapshotFrequencyInHours;
        this.compression = compression;
        this.initialReplicationMethod = initialReplicationMethod;
        this.instanceType = Objects.requireNonNull(instanceType, "expected parameter 'instanceType' to be non-null");
        this.offlineReplicationExportPath = offlineReplicationExportPath;
        this.offlineReplicationImportPath = offlineReplicationImportPath;
        this.onlineReplicationStartTime = onlineReplicationStartTime;
        this.recoveryPoints = recoveryPoints;
        this.replicaDeletionOption = replicaDeletionOption;
        this.replicationPort = replicationPort;
    }

    private HyperVReplicaBasePolicyDetailsResponse() {
        this.allowedAuthenticationType = null;
        this.applicationConsistentSnapshotFrequencyInHours = null;
        this.compression = null;
        this.initialReplicationMethod = null;
        this.instanceType = null;
        this.offlineReplicationExportPath = null;
        this.offlineReplicationImportPath = null;
        this.onlineReplicationStartTime = null;
        this.recoveryPoints = null;
        this.replicaDeletionOption = null;
        this.replicationPort = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HyperVReplicaBasePolicyDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer allowedAuthenticationType;
        private @Nullable Integer applicationConsistentSnapshotFrequencyInHours;
        private @Nullable String compression;
        private @Nullable String initialReplicationMethod;
        private String instanceType;
        private @Nullable String offlineReplicationExportPath;
        private @Nullable String offlineReplicationImportPath;
        private @Nullable String onlineReplicationStartTime;
        private @Nullable Integer recoveryPoints;
        private @Nullable String replicaDeletionOption;
        private @Nullable Integer replicationPort;

        public Builder() {
    	      // Empty
        }

        public Builder(HyperVReplicaBasePolicyDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedAuthenticationType = defaults.allowedAuthenticationType;
    	      this.applicationConsistentSnapshotFrequencyInHours = defaults.applicationConsistentSnapshotFrequencyInHours;
    	      this.compression = defaults.compression;
    	      this.initialReplicationMethod = defaults.initialReplicationMethod;
    	      this.instanceType = defaults.instanceType;
    	      this.offlineReplicationExportPath = defaults.offlineReplicationExportPath;
    	      this.offlineReplicationImportPath = defaults.offlineReplicationImportPath;
    	      this.onlineReplicationStartTime = defaults.onlineReplicationStartTime;
    	      this.recoveryPoints = defaults.recoveryPoints;
    	      this.replicaDeletionOption = defaults.replicaDeletionOption;
    	      this.replicationPort = defaults.replicationPort;
        }

        public Builder allowedAuthenticationType(@Nullable Integer allowedAuthenticationType) {
            this.allowedAuthenticationType = allowedAuthenticationType;
            return this;
        }

        public Builder applicationConsistentSnapshotFrequencyInHours(@Nullable Integer applicationConsistentSnapshotFrequencyInHours) {
            this.applicationConsistentSnapshotFrequencyInHours = applicationConsistentSnapshotFrequencyInHours;
            return this;
        }

        public Builder compression(@Nullable String compression) {
            this.compression = compression;
            return this;
        }

        public Builder initialReplicationMethod(@Nullable String initialReplicationMethod) {
            this.initialReplicationMethod = initialReplicationMethod;
            return this;
        }

        public Builder instanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder offlineReplicationExportPath(@Nullable String offlineReplicationExportPath) {
            this.offlineReplicationExportPath = offlineReplicationExportPath;
            return this;
        }

        public Builder offlineReplicationImportPath(@Nullable String offlineReplicationImportPath) {
            this.offlineReplicationImportPath = offlineReplicationImportPath;
            return this;
        }

        public Builder onlineReplicationStartTime(@Nullable String onlineReplicationStartTime) {
            this.onlineReplicationStartTime = onlineReplicationStartTime;
            return this;
        }

        public Builder recoveryPoints(@Nullable Integer recoveryPoints) {
            this.recoveryPoints = recoveryPoints;
            return this;
        }

        public Builder replicaDeletionOption(@Nullable String replicaDeletionOption) {
            this.replicaDeletionOption = replicaDeletionOption;
            return this;
        }

        public Builder replicationPort(@Nullable Integer replicationPort) {
            this.replicationPort = replicationPort;
            return this;
        }
        public HyperVReplicaBasePolicyDetailsResponse build() {
            return new HyperVReplicaBasePolicyDetailsResponse(allowedAuthenticationType, applicationConsistentSnapshotFrequencyInHours, compression, initialReplicationMethod, instanceType, offlineReplicationExportPath, offlineReplicationImportPath, onlineReplicationStartTime, recoveryPoints, replicaDeletionOption, replicationPort);
        }
    }
}
