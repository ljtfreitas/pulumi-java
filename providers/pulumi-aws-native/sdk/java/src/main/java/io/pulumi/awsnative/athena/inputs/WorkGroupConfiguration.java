// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.athena.inputs;

import io.pulumi.awsnative.athena.inputs.WorkGroupEngineVersion;
import io.pulumi.awsnative.athena.inputs.WorkGroupResultConfiguration;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkGroupConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final WorkGroupConfiguration Empty = new WorkGroupConfiguration();

    @InputImport(name="bytesScannedCutoffPerQuery")
        private final @Nullable Integer bytesScannedCutoffPerQuery;

    public Optional<Integer> getBytesScannedCutoffPerQuery() {
        return this.bytesScannedCutoffPerQuery == null ? Optional.empty() : Optional.ofNullable(this.bytesScannedCutoffPerQuery);
    }

    @InputImport(name="enforceWorkGroupConfiguration")
        private final @Nullable Boolean enforceWorkGroupConfiguration;

    public Optional<Boolean> getEnforceWorkGroupConfiguration() {
        return this.enforceWorkGroupConfiguration == null ? Optional.empty() : Optional.ofNullable(this.enforceWorkGroupConfiguration);
    }

    @InputImport(name="engineVersion")
        private final @Nullable WorkGroupEngineVersion engineVersion;

    public Optional<WorkGroupEngineVersion> getEngineVersion() {
        return this.engineVersion == null ? Optional.empty() : Optional.ofNullable(this.engineVersion);
    }

    @InputImport(name="publishCloudWatchMetricsEnabled")
        private final @Nullable Boolean publishCloudWatchMetricsEnabled;

    public Optional<Boolean> getPublishCloudWatchMetricsEnabled() {
        return this.publishCloudWatchMetricsEnabled == null ? Optional.empty() : Optional.ofNullable(this.publishCloudWatchMetricsEnabled);
    }

    @InputImport(name="requesterPaysEnabled")
        private final @Nullable Boolean requesterPaysEnabled;

    public Optional<Boolean> getRequesterPaysEnabled() {
        return this.requesterPaysEnabled == null ? Optional.empty() : Optional.ofNullable(this.requesterPaysEnabled);
    }

    @InputImport(name="resultConfiguration")
        private final @Nullable WorkGroupResultConfiguration resultConfiguration;

    public Optional<WorkGroupResultConfiguration> getResultConfiguration() {
        return this.resultConfiguration == null ? Optional.empty() : Optional.ofNullable(this.resultConfiguration);
    }

    public WorkGroupConfiguration(
        @Nullable Integer bytesScannedCutoffPerQuery,
        @Nullable Boolean enforceWorkGroupConfiguration,
        @Nullable WorkGroupEngineVersion engineVersion,
        @Nullable Boolean publishCloudWatchMetricsEnabled,
        @Nullable Boolean requesterPaysEnabled,
        @Nullable WorkGroupResultConfiguration resultConfiguration) {
        this.bytesScannedCutoffPerQuery = bytesScannedCutoffPerQuery;
        this.enforceWorkGroupConfiguration = enforceWorkGroupConfiguration;
        this.engineVersion = engineVersion;
        this.publishCloudWatchMetricsEnabled = publishCloudWatchMetricsEnabled;
        this.requesterPaysEnabled = requesterPaysEnabled;
        this.resultConfiguration = resultConfiguration;
    }

    private WorkGroupConfiguration() {
        this.bytesScannedCutoffPerQuery = null;
        this.enforceWorkGroupConfiguration = null;
        this.engineVersion = null;
        this.publishCloudWatchMetricsEnabled = null;
        this.requesterPaysEnabled = null;
        this.resultConfiguration = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkGroupConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer bytesScannedCutoffPerQuery;
        private @Nullable Boolean enforceWorkGroupConfiguration;
        private @Nullable WorkGroupEngineVersion engineVersion;
        private @Nullable Boolean publishCloudWatchMetricsEnabled;
        private @Nullable Boolean requesterPaysEnabled;
        private @Nullable WorkGroupResultConfiguration resultConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkGroupConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bytesScannedCutoffPerQuery = defaults.bytesScannedCutoffPerQuery;
    	      this.enforceWorkGroupConfiguration = defaults.enforceWorkGroupConfiguration;
    	      this.engineVersion = defaults.engineVersion;
    	      this.publishCloudWatchMetricsEnabled = defaults.publishCloudWatchMetricsEnabled;
    	      this.requesterPaysEnabled = defaults.requesterPaysEnabled;
    	      this.resultConfiguration = defaults.resultConfiguration;
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

        public Builder setRequesterPaysEnabled(@Nullable Boolean requesterPaysEnabled) {
            this.requesterPaysEnabled = requesterPaysEnabled;
            return this;
        }

        public Builder setResultConfiguration(@Nullable WorkGroupResultConfiguration resultConfiguration) {
            this.resultConfiguration = resultConfiguration;
            return this;
        }
        public WorkGroupConfiguration build() {
            return new WorkGroupConfiguration(bytesScannedCutoffPerQuery, enforceWorkGroupConfiguration, engineVersion, publishCloudWatchMetricsEnabled, requesterPaysEnabled, resultConfiguration);
        }
    }
}
