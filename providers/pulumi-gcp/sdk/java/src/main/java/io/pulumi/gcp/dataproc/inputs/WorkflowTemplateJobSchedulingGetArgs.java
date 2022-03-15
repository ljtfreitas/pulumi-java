// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkflowTemplateJobSchedulingGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplateJobSchedulingGetArgs Empty = new WorkflowTemplateJobSchedulingGetArgs();

    /**
     * Optional. Maximum number of times per hour a driver may be restarted as a result of driver exiting with non-zero code before job is reported failed. A job may be reported as thrashing if driver exits with non-zero code 4 times within 10 minute window. Maximum value is 10.
     * 
     */
    @Import(name="maxFailuresPerHour")
      private final @Nullable Output<Integer> maxFailuresPerHour;

    public Output<Integer> getMaxFailuresPerHour() {
        return this.maxFailuresPerHour == null ? Output.empty() : this.maxFailuresPerHour;
    }

    /**
     * Optional. Maximum number of times in total a driver may be restarted as a result of driver exiting with non-zero code before job is reported failed. Maximum value is 240
     * 
     */
    @Import(name="maxFailuresTotal")
      private final @Nullable Output<Integer> maxFailuresTotal;

    public Output<Integer> getMaxFailuresTotal() {
        return this.maxFailuresTotal == null ? Output.empty() : this.maxFailuresTotal;
    }

    public WorkflowTemplateJobSchedulingGetArgs(
        @Nullable Output<Integer> maxFailuresPerHour,
        @Nullable Output<Integer> maxFailuresTotal) {
        this.maxFailuresPerHour = maxFailuresPerHour;
        this.maxFailuresTotal = maxFailuresTotal;
    }

    private WorkflowTemplateJobSchedulingGetArgs() {
        this.maxFailuresPerHour = Output.empty();
        this.maxFailuresTotal = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplateJobSchedulingGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> maxFailuresPerHour;
        private @Nullable Output<Integer> maxFailuresTotal;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplateJobSchedulingGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxFailuresPerHour = defaults.maxFailuresPerHour;
    	      this.maxFailuresTotal = defaults.maxFailuresTotal;
        }

        public Builder maxFailuresPerHour(@Nullable Output<Integer> maxFailuresPerHour) {
            this.maxFailuresPerHour = maxFailuresPerHour;
            return this;
        }

        public Builder maxFailuresPerHour(@Nullable Integer maxFailuresPerHour) {
            this.maxFailuresPerHour = Output.ofNullable(maxFailuresPerHour);
            return this;
        }

        public Builder maxFailuresTotal(@Nullable Output<Integer> maxFailuresTotal) {
            this.maxFailuresTotal = maxFailuresTotal;
            return this;
        }

        public Builder maxFailuresTotal(@Nullable Integer maxFailuresTotal) {
            this.maxFailuresTotal = Output.ofNullable(maxFailuresTotal);
            return this;
        }
        public WorkflowTemplateJobSchedulingGetArgs build() {
            return new WorkflowTemplateJobSchedulingGetArgs(maxFailuresPerHour, maxFailuresTotal);
        }
    }
}
