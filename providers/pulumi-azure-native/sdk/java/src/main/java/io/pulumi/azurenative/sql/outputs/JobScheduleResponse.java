// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class JobScheduleResponse {
    private final @Nullable Boolean enabled;
    private final @Nullable String endTime;
    private final @Nullable String interval;
    private final @Nullable String startTime;
    private final @Nullable String type;

    @OutputCustomType.Constructor({"enabled","endTime","interval","startTime","type"})
    private JobScheduleResponse(
        @Nullable Boolean enabled,
        @Nullable String endTime,
        @Nullable String interval,
        @Nullable String startTime,
        @Nullable String type) {
        this.enabled = enabled;
        this.endTime = endTime;
        this.interval = interval;
        this.startTime = startTime;
        this.type = type;
    }

    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Optional<String> getEndTime() {
        return Optional.ofNullable(this.endTime);
    }
    public Optional<String> getInterval() {
        return Optional.ofNullable(this.interval);
    }
    public Optional<String> getStartTime() {
        return Optional.ofNullable(this.startTime);
    }
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable String endTime;
        private @Nullable String interval;
        private @Nullable String startTime;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(JobScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.endTime = defaults.endTime;
    	      this.interval = defaults.interval;
    	      this.startTime = defaults.startTime;
    	      this.type = defaults.type;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEndTime(@Nullable String endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder setInterval(@Nullable String interval) {
            this.interval = interval;
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public JobScheduleResponse build() {
            return new JobScheduleResponse(enabled, endTime, interval, startTime, type);
        }
    }
}