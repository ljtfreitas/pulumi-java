// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.athena.outputs;

import io.pulumi.aws.athena.outputs.WorkgroupConfigurationEngineVersion;
import io.pulumi.aws.athena.outputs.WorkgroupConfigurationResultConfiguration;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WorkgroupConfiguration {
    /**
     * Integer for the upper data usage limit (cutoff) for the amount of bytes a single query in a workgroup is allowed to scan. Must be at least `10485760`.
     * 
     */
    private final @Nullable Integer bytesScannedCutoffPerQuery;
    /**
     * Boolean whether the settings for the workgroup override client-side settings. For more information, see [Workgroup Settings Override Client-Side Settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html). Defaults to `true`.
     * 
     */
    private final @Nullable Boolean enforceWorkgroupConfiguration;
    /**
     * Configuration block for the Athena Engine Versioning. For more information, see [Athena Engine Versioning](https://docs.aws.amazon.com/athena/latest/ug/engine-versions.html). Documented below.
     * 
     */
    private final @Nullable WorkgroupConfigurationEngineVersion engineVersion;
    /**
     * Boolean whether Amazon CloudWatch metrics are enabled for the workgroup. Defaults to `true`.
     * 
     */
    private final @Nullable Boolean publishCloudwatchMetricsEnabled;
    /**
     * If set to true , allows members assigned to a workgroup to reference Amazon S3 Requester Pays buckets in queries. If set to false , workgroup members cannot query data from Requester Pays buckets, and queries that retrieve data from Requester Pays buckets cause an error. The default is false . For more information about Requester Pays buckets, see [Requester Pays Buckets](https://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html) in the Amazon Simple Storage Service Developer Guide.
     * 
     */
    private final @Nullable Boolean requesterPaysEnabled;
    /**
     * Configuration block with result settings. Documented below.
     * 
     */
    private final @Nullable WorkgroupConfigurationResultConfiguration resultConfiguration;

    @OutputCustomType.Constructor({"bytesScannedCutoffPerQuery","enforceWorkgroupConfiguration","engineVersion","publishCloudwatchMetricsEnabled","requesterPaysEnabled","resultConfiguration"})
    private WorkgroupConfiguration(
        @Nullable Integer bytesScannedCutoffPerQuery,
        @Nullable Boolean enforceWorkgroupConfiguration,
        @Nullable WorkgroupConfigurationEngineVersion engineVersion,
        @Nullable Boolean publishCloudwatchMetricsEnabled,
        @Nullable Boolean requesterPaysEnabled,
        @Nullable WorkgroupConfigurationResultConfiguration resultConfiguration) {
        this.bytesScannedCutoffPerQuery = bytesScannedCutoffPerQuery;
        this.enforceWorkgroupConfiguration = enforceWorkgroupConfiguration;
        this.engineVersion = engineVersion;
        this.publishCloudwatchMetricsEnabled = publishCloudwatchMetricsEnabled;
        this.requesterPaysEnabled = requesterPaysEnabled;
        this.resultConfiguration = resultConfiguration;
    }

    /**
     * Integer for the upper data usage limit (cutoff) for the amount of bytes a single query in a workgroup is allowed to scan. Must be at least `10485760`.
     * 
     */
    public Optional<Integer> getBytesScannedCutoffPerQuery() {
        return Optional.ofNullable(this.bytesScannedCutoffPerQuery);
    }
    /**
     * Boolean whether the settings for the workgroup override client-side settings. For more information, see [Workgroup Settings Override Client-Side Settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html). Defaults to `true`.
     * 
     */
    public Optional<Boolean> getEnforceWorkgroupConfiguration() {
        return Optional.ofNullable(this.enforceWorkgroupConfiguration);
    }
    /**
     * Configuration block for the Athena Engine Versioning. For more information, see [Athena Engine Versioning](https://docs.aws.amazon.com/athena/latest/ug/engine-versions.html). Documented below.
     * 
     */
    public Optional<WorkgroupConfigurationEngineVersion> getEngineVersion() {
        return Optional.ofNullable(this.engineVersion);
    }
    /**
     * Boolean whether Amazon CloudWatch metrics are enabled for the workgroup. Defaults to `true`.
     * 
     */
    public Optional<Boolean> getPublishCloudwatchMetricsEnabled() {
        return Optional.ofNullable(this.publishCloudwatchMetricsEnabled);
    }
    /**
     * If set to true , allows members assigned to a workgroup to reference Amazon S3 Requester Pays buckets in queries. If set to false , workgroup members cannot query data from Requester Pays buckets, and queries that retrieve data from Requester Pays buckets cause an error. The default is false . For more information about Requester Pays buckets, see [Requester Pays Buckets](https://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html) in the Amazon Simple Storage Service Developer Guide.
     * 
     */
    public Optional<Boolean> getRequesterPaysEnabled() {
        return Optional.ofNullable(this.requesterPaysEnabled);
    }
    /**
     * Configuration block with result settings. Documented below.
     * 
     */
    public Optional<WorkgroupConfigurationResultConfiguration> getResultConfiguration() {
        return Optional.ofNullable(this.resultConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkgroupConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer bytesScannedCutoffPerQuery;
        private @Nullable Boolean enforceWorkgroupConfiguration;
        private @Nullable WorkgroupConfigurationEngineVersion engineVersion;
        private @Nullable Boolean publishCloudwatchMetricsEnabled;
        private @Nullable Boolean requesterPaysEnabled;
        private @Nullable WorkgroupConfigurationResultConfiguration resultConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkgroupConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bytesScannedCutoffPerQuery = defaults.bytesScannedCutoffPerQuery;
    	      this.enforceWorkgroupConfiguration = defaults.enforceWorkgroupConfiguration;
    	      this.engineVersion = defaults.engineVersion;
    	      this.publishCloudwatchMetricsEnabled = defaults.publishCloudwatchMetricsEnabled;
    	      this.requesterPaysEnabled = defaults.requesterPaysEnabled;
    	      this.resultConfiguration = defaults.resultConfiguration;
        }

        public Builder setBytesScannedCutoffPerQuery(@Nullable Integer bytesScannedCutoffPerQuery) {
            this.bytesScannedCutoffPerQuery = bytesScannedCutoffPerQuery;
            return this;
        }

        public Builder setEnforceWorkgroupConfiguration(@Nullable Boolean enforceWorkgroupConfiguration) {
            this.enforceWorkgroupConfiguration = enforceWorkgroupConfiguration;
            return this;
        }

        public Builder setEngineVersion(@Nullable WorkgroupConfigurationEngineVersion engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }

        public Builder setPublishCloudwatchMetricsEnabled(@Nullable Boolean publishCloudwatchMetricsEnabled) {
            this.publishCloudwatchMetricsEnabled = publishCloudwatchMetricsEnabled;
            return this;
        }

        public Builder setRequesterPaysEnabled(@Nullable Boolean requesterPaysEnabled) {
            this.requesterPaysEnabled = requesterPaysEnabled;
            return this;
        }

        public Builder setResultConfiguration(@Nullable WorkgroupConfigurationResultConfiguration resultConfiguration) {
            this.resultConfiguration = resultConfiguration;
            return this;
        }
        public WorkgroupConfiguration build() {
            return new WorkgroupConfiguration(bytesScannedCutoffPerQuery, enforceWorkgroupConfiguration, engineVersion, publishCloudwatchMetricsEnabled, requesterPaysEnabled, resultConfiguration);
        }
    }
}
