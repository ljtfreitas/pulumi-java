// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2FieldIdArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration of the timespan of the items to include in scanning. Currently only supported when inspecting Google Cloud Storage and BigQuery.
 * 
 */
public final class GooglePrivacyDlpV2TimespanConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2TimespanConfigArgs Empty = new GooglePrivacyDlpV2TimespanConfigArgs();

    /**
     * When the job is started by a JobTrigger we will automatically figure out a valid start_time to avoid scanning files that have not been modified since the last time the JobTrigger executed. This will be based on the time of the execution of the last run of the JobTrigger.
     * 
     */
    @Import(name="enableAutoPopulationOfTimespanConfig")
      private final @Nullable Output<Boolean> enableAutoPopulationOfTimespanConfig;

    public Output<Boolean> getEnableAutoPopulationOfTimespanConfig() {
        return this.enableAutoPopulationOfTimespanConfig == null ? Output.empty() : this.enableAutoPopulationOfTimespanConfig;
    }

    /**
     * Exclude files, tables, or rows newer than this value. If not set, no upper time limit is applied.
     * 
     */
    @Import(name="endTime")
      private final @Nullable Output<String> endTime;

    public Output<String> getEndTime() {
        return this.endTime == null ? Output.empty() : this.endTime;
    }

    /**
     * Exclude files, tables, or rows older than this value. If not set, no lower time limit is applied.
     * 
     */
    @Import(name="startTime")
      private final @Nullable Output<String> startTime;

    public Output<String> getStartTime() {
        return this.startTime == null ? Output.empty() : this.startTime;
    }

    /**
     * Specification of the field containing the timestamp of scanned items. Used for data sources like Datastore and BigQuery. For BigQuery: If this value is not specified and the table was modified between the given start and end times, the entire table will be scanned. If this value is specified, then rows are filtered based on the given start and end times. Rows with a `NULL` value in the provided BigQuery column are skipped. Valid data types of the provided BigQuery column are: `INTEGER`, `DATE`, `TIMESTAMP`, and `DATETIME`. For Datastore: If this value is specified, then entities are filtered based on the given start and end times. If an entity does not contain the provided timestamp property or contains empty or invalid values, then it is included. Valid data types of the provided timestamp property are: `TIMESTAMP`.
     * 
     */
    @Import(name="timestampField")
      private final @Nullable Output<GooglePrivacyDlpV2FieldIdArgs> timestampField;

    public Output<GooglePrivacyDlpV2FieldIdArgs> getTimestampField() {
        return this.timestampField == null ? Output.empty() : this.timestampField;
    }

    public GooglePrivacyDlpV2TimespanConfigArgs(
        @Nullable Output<Boolean> enableAutoPopulationOfTimespanConfig,
        @Nullable Output<String> endTime,
        @Nullable Output<String> startTime,
        @Nullable Output<GooglePrivacyDlpV2FieldIdArgs> timestampField) {
        this.enableAutoPopulationOfTimespanConfig = enableAutoPopulationOfTimespanConfig;
        this.endTime = endTime;
        this.startTime = startTime;
        this.timestampField = timestampField;
    }

    private GooglePrivacyDlpV2TimespanConfigArgs() {
        this.enableAutoPopulationOfTimespanConfig = Output.empty();
        this.endTime = Output.empty();
        this.startTime = Output.empty();
        this.timestampField = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2TimespanConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enableAutoPopulationOfTimespanConfig;
        private @Nullable Output<String> endTime;
        private @Nullable Output<String> startTime;
        private @Nullable Output<GooglePrivacyDlpV2FieldIdArgs> timestampField;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2TimespanConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableAutoPopulationOfTimespanConfig = defaults.enableAutoPopulationOfTimespanConfig;
    	      this.endTime = defaults.endTime;
    	      this.startTime = defaults.startTime;
    	      this.timestampField = defaults.timestampField;
        }

        public Builder enableAutoPopulationOfTimespanConfig(@Nullable Output<Boolean> enableAutoPopulationOfTimespanConfig) {
            this.enableAutoPopulationOfTimespanConfig = enableAutoPopulationOfTimespanConfig;
            return this;
        }

        public Builder enableAutoPopulationOfTimespanConfig(@Nullable Boolean enableAutoPopulationOfTimespanConfig) {
            this.enableAutoPopulationOfTimespanConfig = Output.ofNullable(enableAutoPopulationOfTimespanConfig);
            return this;
        }

        public Builder endTime(@Nullable Output<String> endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder endTime(@Nullable String endTime) {
            this.endTime = Output.ofNullable(endTime);
            return this;
        }

        public Builder startTime(@Nullable Output<String> startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder startTime(@Nullable String startTime) {
            this.startTime = Output.ofNullable(startTime);
            return this;
        }

        public Builder timestampField(@Nullable Output<GooglePrivacyDlpV2FieldIdArgs> timestampField) {
            this.timestampField = timestampField;
            return this;
        }

        public Builder timestampField(@Nullable GooglePrivacyDlpV2FieldIdArgs timestampField) {
            this.timestampField = Output.ofNullable(timestampField);
            return this;
        }
        public GooglePrivacyDlpV2TimespanConfigArgs build() {
            return new GooglePrivacyDlpV2TimespanConfigArgs(enableAutoPopulationOfTimespanConfig, endTime, startTime, timestampField);
        }
    }
}
