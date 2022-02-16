// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigTimespanConfigTimestampFieldGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionJobTriggerInspectJobStorageConfigTimespanConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionJobTriggerInspectJobStorageConfigTimespanConfigGetArgs Empty = new PreventionJobTriggerInspectJobStorageConfigTimespanConfigGetArgs();

    @InputImport(name="enableAutoPopulationOfTimespanConfig")
    private final @Nullable Input<Boolean> enableAutoPopulationOfTimespanConfig;

    public Input<Boolean> getEnableAutoPopulationOfTimespanConfig() {
        return this.enableAutoPopulationOfTimespanConfig == null ? Input.empty() : this.enableAutoPopulationOfTimespanConfig;
    }

    @InputImport(name="endTime")
    private final @Nullable Input<String> endTime;

    public Input<String> getEndTime() {
        return this.endTime == null ? Input.empty() : this.endTime;
    }

    @InputImport(name="startTime")
    private final @Nullable Input<String> startTime;

    public Input<String> getStartTime() {
        return this.startTime == null ? Input.empty() : this.startTime;
    }

    @InputImport(name="timestampField", required=true)
    private final Input<PreventionJobTriggerInspectJobStorageConfigTimespanConfigTimestampFieldGetArgs> timestampField;

    public Input<PreventionJobTriggerInspectJobStorageConfigTimespanConfigTimestampFieldGetArgs> getTimestampField() {
        return this.timestampField;
    }

    public PreventionJobTriggerInspectJobStorageConfigTimespanConfigGetArgs(
        @Nullable Input<Boolean> enableAutoPopulationOfTimespanConfig,
        @Nullable Input<String> endTime,
        @Nullable Input<String> startTime,
        Input<PreventionJobTriggerInspectJobStorageConfigTimespanConfigTimestampFieldGetArgs> timestampField) {
        this.enableAutoPopulationOfTimespanConfig = enableAutoPopulationOfTimespanConfig;
        this.endTime = endTime;
        this.startTime = startTime;
        this.timestampField = Objects.requireNonNull(timestampField, "expected parameter 'timestampField' to be non-null");
    }

    private PreventionJobTriggerInspectJobStorageConfigTimespanConfigGetArgs() {
        this.enableAutoPopulationOfTimespanConfig = Input.empty();
        this.endTime = Input.empty();
        this.startTime = Input.empty();
        this.timestampField = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionJobTriggerInspectJobStorageConfigTimespanConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enableAutoPopulationOfTimespanConfig;
        private @Nullable Input<String> endTime;
        private @Nullable Input<String> startTime;
        private Input<PreventionJobTriggerInspectJobStorageConfigTimespanConfigTimestampFieldGetArgs> timestampField;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionJobTriggerInspectJobStorageConfigTimespanConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableAutoPopulationOfTimespanConfig = defaults.enableAutoPopulationOfTimespanConfig;
    	      this.endTime = defaults.endTime;
    	      this.startTime = defaults.startTime;
    	      this.timestampField = defaults.timestampField;
        }

        public Builder setEnableAutoPopulationOfTimespanConfig(@Nullable Input<Boolean> enableAutoPopulationOfTimespanConfig) {
            this.enableAutoPopulationOfTimespanConfig = enableAutoPopulationOfTimespanConfig;
            return this;
        }

        public Builder setEnableAutoPopulationOfTimespanConfig(@Nullable Boolean enableAutoPopulationOfTimespanConfig) {
            this.enableAutoPopulationOfTimespanConfig = Input.ofNullable(enableAutoPopulationOfTimespanConfig);
            return this;
        }

        public Builder setEndTime(@Nullable Input<String> endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder setEndTime(@Nullable String endTime) {
            this.endTime = Input.ofNullable(endTime);
            return this;
        }

        public Builder setStartTime(@Nullable Input<String> startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = Input.ofNullable(startTime);
            return this;
        }

        public Builder setTimestampField(Input<PreventionJobTriggerInspectJobStorageConfigTimespanConfigTimestampFieldGetArgs> timestampField) {
            this.timestampField = Objects.requireNonNull(timestampField);
            return this;
        }

        public Builder setTimestampField(PreventionJobTriggerInspectJobStorageConfigTimespanConfigTimestampFieldGetArgs timestampField) {
            this.timestampField = Input.of(Objects.requireNonNull(timestampField));
            return this;
        }

        public PreventionJobTriggerInspectJobStorageConfigTimespanConfigGetArgs build() {
            return new PreventionJobTriggerInspectJobStorageConfigTimespanConfigGetArgs(enableAutoPopulationOfTimespanConfig, endTime, startTime, timestampField);
        }
    }
}