// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.awsnative.appflow.enums.FlowScheduledTriggerPropertiesDataPullMode;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Details required for scheduled trigger type
 * 
 */
public final class FlowScheduledTriggerProperties extends io.pulumi.resources.InvokeArgs {

    public static final FlowScheduledTriggerProperties Empty = new FlowScheduledTriggerProperties();

    @InputImport(name="dataPullMode")
        private final @Nullable FlowScheduledTriggerPropertiesDataPullMode dataPullMode;

    public Optional<FlowScheduledTriggerPropertiesDataPullMode> getDataPullMode() {
        return this.dataPullMode == null ? Optional.empty() : Optional.ofNullable(this.dataPullMode);
    }

    @InputImport(name="scheduleEndTime")
        private final @Nullable Double scheduleEndTime;

    public Optional<Double> getScheduleEndTime() {
        return this.scheduleEndTime == null ? Optional.empty() : Optional.ofNullable(this.scheduleEndTime);
    }

    @InputImport(name="scheduleExpression", required=true)
        private final String scheduleExpression;

    public String getScheduleExpression() {
        return this.scheduleExpression;
    }

    @InputImport(name="scheduleOffset")
        private final @Nullable Double scheduleOffset;

    public Optional<Double> getScheduleOffset() {
        return this.scheduleOffset == null ? Optional.empty() : Optional.ofNullable(this.scheduleOffset);
    }

    @InputImport(name="scheduleStartTime")
        private final @Nullable Double scheduleStartTime;

    public Optional<Double> getScheduleStartTime() {
        return this.scheduleStartTime == null ? Optional.empty() : Optional.ofNullable(this.scheduleStartTime);
    }

    @InputImport(name="timeZone")
        private final @Nullable String timeZone;

    public Optional<String> getTimeZone() {
        return this.timeZone == null ? Optional.empty() : Optional.ofNullable(this.timeZone);
    }

    public FlowScheduledTriggerProperties(
        @Nullable FlowScheduledTriggerPropertiesDataPullMode dataPullMode,
        @Nullable Double scheduleEndTime,
        String scheduleExpression,
        @Nullable Double scheduleOffset,
        @Nullable Double scheduleStartTime,
        @Nullable String timeZone) {
        this.dataPullMode = dataPullMode;
        this.scheduleEndTime = scheduleEndTime;
        this.scheduleExpression = Objects.requireNonNull(scheduleExpression, "expected parameter 'scheduleExpression' to be non-null");
        this.scheduleOffset = scheduleOffset;
        this.scheduleStartTime = scheduleStartTime;
        this.timeZone = timeZone;
    }

    private FlowScheduledTriggerProperties() {
        this.dataPullMode = null;
        this.scheduleEndTime = null;
        this.scheduleExpression = null;
        this.scheduleOffset = null;
        this.scheduleStartTime = null;
        this.timeZone = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowScheduledTriggerProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FlowScheduledTriggerPropertiesDataPullMode dataPullMode;
        private @Nullable Double scheduleEndTime;
        private String scheduleExpression;
        private @Nullable Double scheduleOffset;
        private @Nullable Double scheduleStartTime;
        private @Nullable String timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowScheduledTriggerProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataPullMode = defaults.dataPullMode;
    	      this.scheduleEndTime = defaults.scheduleEndTime;
    	      this.scheduleExpression = defaults.scheduleExpression;
    	      this.scheduleOffset = defaults.scheduleOffset;
    	      this.scheduleStartTime = defaults.scheduleStartTime;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder setDataPullMode(@Nullable FlowScheduledTriggerPropertiesDataPullMode dataPullMode) {
            this.dataPullMode = dataPullMode;
            return this;
        }

        public Builder setScheduleEndTime(@Nullable Double scheduleEndTime) {
            this.scheduleEndTime = scheduleEndTime;
            return this;
        }

        public Builder setScheduleExpression(String scheduleExpression) {
            this.scheduleExpression = Objects.requireNonNull(scheduleExpression);
            return this;
        }

        public Builder setScheduleOffset(@Nullable Double scheduleOffset) {
            this.scheduleOffset = scheduleOffset;
            return this;
        }

        public Builder setScheduleStartTime(@Nullable Double scheduleStartTime) {
            this.scheduleStartTime = scheduleStartTime;
            return this;
        }

        public Builder setTimeZone(@Nullable String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public FlowScheduledTriggerProperties build() {
            return new FlowScheduledTriggerProperties(dataPullMode, scheduleEndTime, scheduleExpression, scheduleOffset, scheduleStartTime, timeZone);
        }
    }
}
