// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkflowTemplateJobSchedulingGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplateJobSchedulingGetArgs Empty = new WorkflowTemplateJobSchedulingGetArgs();

    /**
     * Optional. Maximum number of times per hour a driver may be restarted as a result of driver exiting with non-zero code before job is reported failed. A job may be reported as thrashing if driver exits with non-zero code 4 times within 10 minute window. Maximum value is 10.
     * 
     */
    @InputImport(name="maxFailuresPerHour")
        private final @Nullable Input<Integer> maxFailuresPerHour;

    public Input<Integer> getMaxFailuresPerHour() {
        return this.maxFailuresPerHour == null ? Input.empty() : this.maxFailuresPerHour;
    }

    /**
     * Optional. Maximum number of times in total a driver may be restarted as a result of driver exiting with non-zero code before job is reported failed. Maximum value is 240
     * 
     */
    @InputImport(name="maxFailuresTotal")
        private final @Nullable Input<Integer> maxFailuresTotal;

    public Input<Integer> getMaxFailuresTotal() {
        return this.maxFailuresTotal == null ? Input.empty() : this.maxFailuresTotal;
    }

    public WorkflowTemplateJobSchedulingGetArgs(
        @Nullable Input<Integer> maxFailuresPerHour,
        @Nullable Input<Integer> maxFailuresTotal) {
        this.maxFailuresPerHour = maxFailuresPerHour;
        this.maxFailuresTotal = maxFailuresTotal;
    }

    private WorkflowTemplateJobSchedulingGetArgs() {
        this.maxFailuresPerHour = Input.empty();
        this.maxFailuresTotal = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplateJobSchedulingGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> maxFailuresPerHour;
        private @Nullable Input<Integer> maxFailuresTotal;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplateJobSchedulingGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxFailuresPerHour = defaults.maxFailuresPerHour;
    	      this.maxFailuresTotal = defaults.maxFailuresTotal;
        }

        public Builder setMaxFailuresPerHour(@Nullable Input<Integer> maxFailuresPerHour) {
            this.maxFailuresPerHour = maxFailuresPerHour;
            return this;
        }

        public Builder setMaxFailuresPerHour(@Nullable Integer maxFailuresPerHour) {
            this.maxFailuresPerHour = Input.ofNullable(maxFailuresPerHour);
            return this;
        }

        public Builder setMaxFailuresTotal(@Nullable Input<Integer> maxFailuresTotal) {
            this.maxFailuresTotal = maxFailuresTotal;
            return this;
        }

        public Builder setMaxFailuresTotal(@Nullable Integer maxFailuresTotal) {
            this.maxFailuresTotal = Input.ofNullable(maxFailuresTotal);
            return this;
        }
        public WorkflowTemplateJobSchedulingGetArgs build() {
            return new WorkflowTemplateJobSchedulingGetArgs(maxFailuresPerHour, maxFailuresTotal);
        }
    }
}
