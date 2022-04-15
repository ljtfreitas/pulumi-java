// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeekArgs;
import java.util.List;
import java.util.Objects;


public final class ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleArgs Empty = new ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleArgs();

    /**
     * May contain up to seven (one for each day of the week) snapshot times.
     * Structure is documented below.
     * 
     */
    @Import(name="dayOfWeeks", required=true)
      private final Output<List<ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeekArgs>> dayOfWeeks;

    public Output<List<ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeekArgs>> dayOfWeeks() {
        return this.dayOfWeeks;
    }

    public ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleArgs(Output<List<ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeekArgs>> dayOfWeeks) {
        this.dayOfWeeks = Objects.requireNonNull(dayOfWeeks, "expected parameter 'dayOfWeeks' to be non-null");
    }

    private ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleArgs() {
        this.dayOfWeeks = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeekArgs>> dayOfWeeks;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dayOfWeeks = defaults.dayOfWeeks;
        }

        public Builder dayOfWeeks(Output<List<ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeekArgs>> dayOfWeeks) {
            this.dayOfWeeks = Objects.requireNonNull(dayOfWeeks);
            return this;
        }
        public Builder dayOfWeeks(List<ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeekArgs> dayOfWeeks) {
            this.dayOfWeeks = Output.of(Objects.requireNonNull(dayOfWeeks));
            return this;
        }
        public Builder dayOfWeeks(ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeekArgs... dayOfWeeks) {
            return dayOfWeeks(List.of(dayOfWeeks));
        }        public ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleArgs build() {
            return new ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleArgs(dayOfWeeks);
        }
    }
}
