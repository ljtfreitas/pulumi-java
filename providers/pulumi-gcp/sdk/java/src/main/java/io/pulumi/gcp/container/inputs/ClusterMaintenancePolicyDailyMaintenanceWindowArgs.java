// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterMaintenancePolicyDailyMaintenanceWindowArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterMaintenancePolicyDailyMaintenanceWindowArgs Empty = new ClusterMaintenancePolicyDailyMaintenanceWindowArgs();

    @Import(name="duration")
      private final @Nullable Output<String> duration;

    public Output<String> getDuration() {
        return this.duration == null ? Output.empty() : this.duration;
    }

    @Import(name="startTime", required=true)
      private final Output<String> startTime;

    public Output<String> getStartTime() {
        return this.startTime;
    }

    public ClusterMaintenancePolicyDailyMaintenanceWindowArgs(
        @Nullable Output<String> duration,
        Output<String> startTime) {
        this.duration = duration;
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
    }

    private ClusterMaintenancePolicyDailyMaintenanceWindowArgs() {
        this.duration = Output.empty();
        this.startTime = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterMaintenancePolicyDailyMaintenanceWindowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> duration;
        private Output<String> startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterMaintenancePolicyDailyMaintenanceWindowArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
    	      this.startTime = defaults.startTime;
        }

        public Builder duration(@Nullable Output<String> duration) {
            this.duration = duration;
            return this;
        }

        public Builder duration(@Nullable String duration) {
            this.duration = Output.ofNullable(duration);
            return this;
        }

        public Builder startTime(Output<String> startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder startTime(String startTime) {
            this.startTime = Output.of(Objects.requireNonNull(startTime));
            return this;
        }
        public ClusterMaintenancePolicyDailyMaintenanceWindowArgs build() {
            return new ClusterMaintenancePolicyDailyMaintenanceWindowArgs(duration, startTime);
        }
    }
}
