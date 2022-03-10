// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.athena.outputs;

import io.pulumi.awsnative.athena.outputs.WorkGroupEngineVersion;
import io.pulumi.awsnative.athena.outputs.WorkGroupResultConfigurationUpdates;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WorkGroupConfigurationUpdates {
    private final @Nullable Integer bytesScannedCutoffPerQuery;
    private final @Nullable Boolean enforceWorkGroupConfiguration;
    private final @Nullable WorkGroupEngineVersion engineVersion;
    private final @Nullable Boolean publishCloudWatchMetricsEnabled;
    private final @Nullable Boolean removeBytesScannedCutoffPerQuery;
    private final @Nullable Boolean requesterPaysEnabled;
    private final @Nullable WorkGroupResultConfigurationUpdates resultConfigurationUpdates;

    @OutputCustomType.Constructor
    private WorkGroupConfigurationUpdates(
        @OutputCustomType.Parameter("bytesScannedCutoffPerQuery") @Nullable Integer bytesScannedCutoffPerQuery,
        @OutputCustomType.Parameter("enforceWorkGroupConfiguration") @Nullable Boolean enforceWorkGroupConfiguration,
        @OutputCustomType.Parameter("engineVersion") @Nullable WorkGroupEngineVersion engineVersion,
        @OutputCustomType.Parameter("publishCloudWatchMetricsEnabled") @Nullable Boolean publishCloudWatchMetricsEnabled,
        @OutputCustomType.Parameter("removeBytesScannedCutoffPerQuery") @Nullable Boolean removeBytesScannedCutoffPerQuery,
        @OutputCustomType.Parameter("requesterPaysEnabled") @Nullable Boolean requesterPaysEnabled,
        @OutputCustomType.Parameter("resultConfigurationUpdates") @Nullable WorkGroupResultConfigurationUpdates resultConfigurationUpdates) {
        this.bytesScannedCutoffPerQuery = bytesScannedCutoffPerQuery;
        this.enforceWorkGroupConfiguration = enforceWorkGroupConfiguration;
        this.engineVersion = engineVersion;
        this.publishCloudWatchMetricsEnabled = publishCloudWatchMetricsEnabled;
        this.removeBytesScannedCutoffPerQuery = removeBytesScannedCutoffPerQuery;
        this.requesterPaysEnabled = requesterPaysEnabled;
        this.resultConfigurationUpdates = resultConfigurationUpdates;
    }

    public Optional<Integer> getBytesScannedCutoffPerQuery() {
        return Optional.ofNullable(this.bytesScannedCutoffPerQuery);
    }
    public Optional<Boolean> getEnforceWorkGroupConfiguration() {
        return Optional.ofNullable(this.enforceWorkGroupConfiguration);
    }
    public Optional<WorkGroupEngineVersion> getEngineVersion() {
        return Optional.ofNullable(this.engineVersion);
    }
    public Optional<Boolean> getPublishCloudWatchMetricsEnabled() {
        return Optional.ofNullable(this.publishCloudWatchMetricsEnabled);
    }
    public Optional<Boolean> getRemoveBytesScannedCutoffPerQuery() {
        return Optional.ofNullable(this.removeBytesScannedCutoffPerQuery);
    }
    public Optional<Boolean> getRequesterPaysEnabled() {
        return Optional.ofNullable(this.requesterPaysEnabled);
    }
    public Optional<WorkGroupResultConfigurationUpdates> getResultConfigurationUpdates() {
        return Optional.ofNullable(this.resultConfigurationUpdates);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkGroupConfigurationUpdates defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer bytesScannedCutoffPerQuery;
        private @Nullable Boolean enforceWorkGroupConfiguration;
        private @Nullable WorkGroupEngineVersion engineVersion;
        private @Nullable Boolean publishCloudWatchMetricsEnabled;
        private @Nullable Boolean removeBytesScannedCutoffPerQuery;
        private @Nullable Boolean requesterPaysEnabled;
        private @Nullable WorkGroupResultConfigurationUpdates resultConfigurationUpdates;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkGroupConfigurationUpdates defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bytesScannedCutoffPerQuery = defaults.bytesScannedCutoffPerQuery;
    	      this.enforceWorkGroupConfiguration = defaults.enforceWorkGroupConfiguration;
    	      this.engineVersion = defaults.engineVersion;
    	      this.publishCloudWatchMetricsEnabled = defaults.publishCloudWatchMetricsEnabled;
    	      this.removeBytesScannedCutoffPerQuery = defaults.removeBytesScannedCutoffPerQuery;
    	      this.requesterPaysEnabled = defaults.requesterPaysEnabled;
    	      this.resultConfigurationUpdates = defaults.resultConfigurationUpdates;
        }

        public Builder setBytesScannedCutoffPerQuery(@Nullable Integer bytesScannedCutoffPerQuery) {
            this.bytesScannedCutoffPerQuery = bytesScannedCutoffPerQuery;
            return this;
        }

        public Builder setEnforceWorkGroupConfiguration(@Nullable Boolean enforceWorkGroupConfiguration) {
            this.enforceWorkGroupConfiguration = enforceWorkGroupConfiguration;
            return this;
        }

        public Builder setEngineVersion(@Nullable WorkGroupEngineVersion engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }

        public Builder setPublishCloudWatchMetricsEnabled(@Nullable Boolean publishCloudWatchMetricsEnabled) {
            this.publishCloudWatchMetricsEnabled = publishCloudWatchMetricsEnabled;
            return this;
        }

        public Builder setRemoveBytesScannedCutoffPerQuery(@Nullable Boolean removeBytesScannedCutoffPerQuery) {
            this.removeBytesScannedCutoffPerQuery = removeBytesScannedCutoffPerQuery;
            return this;
        }

        public Builder setRequesterPaysEnabled(@Nullable Boolean requesterPaysEnabled) {
            this.requesterPaysEnabled = requesterPaysEnabled;
            return this;
        }

        public Builder setResultConfigurationUpdates(@Nullable WorkGroupResultConfigurationUpdates resultConfigurationUpdates) {
            this.resultConfigurationUpdates = resultConfigurationUpdates;
            return this;
        }
        public WorkGroupConfigurationUpdates build() {
            return new WorkGroupConfigurationUpdates(bytesScannedCutoffPerQuery, enforceWorkGroupConfiguration, engineVersion, publishCloudWatchMetricsEnabled, removeBytesScannedCutoffPerQuery, requesterPaysEnabled, resultConfigurationUpdates);
        }
    }
}
