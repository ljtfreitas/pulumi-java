// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class ClusterMaintenancePolicyRecurringWindowGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterMaintenancePolicyRecurringWindowGetArgs Empty = new ClusterMaintenancePolicyRecurringWindowGetArgs();

    @Import(name="endTime", required=true)
      private final Output<String> endTime;

    public Output<String> endTime() {
        return this.endTime;
    }

    @Import(name="recurrence", required=true)
      private final Output<String> recurrence;

    public Output<String> recurrence() {
        return this.recurrence;
    }

    @Import(name="startTime", required=true)
      private final Output<String> startTime;

    public Output<String> startTime() {
        return this.startTime;
    }

    public ClusterMaintenancePolicyRecurringWindowGetArgs(
        Output<String> endTime,
        Output<String> recurrence,
        Output<String> startTime) {
        this.endTime = Objects.requireNonNull(endTime, "expected parameter 'endTime' to be non-null");
        this.recurrence = Objects.requireNonNull(recurrence, "expected parameter 'recurrence' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
    }

    private ClusterMaintenancePolicyRecurringWindowGetArgs() {
        this.endTime = Codegen.empty();
        this.recurrence = Codegen.empty();
        this.startTime = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterMaintenancePolicyRecurringWindowGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> endTime;
        private Output<String> recurrence;
        private Output<String> startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterMaintenancePolicyRecurringWindowGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.recurrence = defaults.recurrence;
    	      this.startTime = defaults.startTime;
        }

        public Builder endTime(Output<String> endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }
        public Builder endTime(String endTime) {
            this.endTime = Output.of(Objects.requireNonNull(endTime));
            return this;
        }
        public Builder recurrence(Output<String> recurrence) {
            this.recurrence = Objects.requireNonNull(recurrence);
            return this;
        }
        public Builder recurrence(String recurrence) {
            this.recurrence = Output.of(Objects.requireNonNull(recurrence));
            return this;
        }
        public Builder startTime(Output<String> startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Output.of(Objects.requireNonNull(startTime));
            return this;
        }        public ClusterMaintenancePolicyRecurringWindowGetArgs build() {
            return new ClusterMaintenancePolicyRecurringWindowGetArgs(endTime, recurrence, startTime);
        }
    }
}
