// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class PatchDeploymentRecurringScheduleWeeklyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PatchDeploymentRecurringScheduleWeeklyGetArgs Empty = new PatchDeploymentRecurringScheduleWeeklyGetArgs();

    /**
     * A day of the week.
     * Possible values are `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, `SATURDAY`, and `SUNDAY`.
     * 
     */
    @Import(name="dayOfWeek", required=true)
      private final Output<String> dayOfWeek;

    public Output<String> dayOfWeek() {
        return this.dayOfWeek;
    }

    public PatchDeploymentRecurringScheduleWeeklyGetArgs(Output<String> dayOfWeek) {
        this.dayOfWeek = Objects.requireNonNull(dayOfWeek, "expected parameter 'dayOfWeek' to be non-null");
    }

    private PatchDeploymentRecurringScheduleWeeklyGetArgs() {
        this.dayOfWeek = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchDeploymentRecurringScheduleWeeklyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> dayOfWeek;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchDeploymentRecurringScheduleWeeklyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dayOfWeek = defaults.dayOfWeek;
        }

        public Builder dayOfWeek(Output<String> dayOfWeek) {
            this.dayOfWeek = Objects.requireNonNull(dayOfWeek);
            return this;
        }
        public Builder dayOfWeek(String dayOfWeek) {
            this.dayOfWeek = Output.of(Objects.requireNonNull(dayOfWeek));
            return this;
        }        public PatchDeploymentRecurringScheduleWeeklyGetArgs build() {
            return new PatchDeploymentRecurringScheduleWeeklyGetArgs(dayOfWeek);
        }
    }
}
