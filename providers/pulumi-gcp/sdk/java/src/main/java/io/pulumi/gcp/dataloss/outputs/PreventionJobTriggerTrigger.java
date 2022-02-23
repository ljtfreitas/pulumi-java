// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.dataloss.outputs.PreventionJobTriggerTriggerSchedule;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PreventionJobTriggerTrigger {
    /**
     * Schedule for triggered jobs
     * Structure is documented below.
     * 
     */
    private final @Nullable PreventionJobTriggerTriggerSchedule schedule;

    @OutputCustomType.Constructor({"schedule"})
    private PreventionJobTriggerTrigger(@Nullable PreventionJobTriggerTriggerSchedule schedule) {
        this.schedule = schedule;
    }

    /**
     * Schedule for triggered jobs
     * Structure is documented below.
     * 
     */
    public Optional<PreventionJobTriggerTriggerSchedule> getSchedule() {
        return Optional.ofNullable(this.schedule);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionJobTriggerTrigger defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable PreventionJobTriggerTriggerSchedule schedule;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionJobTriggerTrigger defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.schedule = defaults.schedule;
        }

        public Builder setSchedule(@Nullable PreventionJobTriggerTriggerSchedule schedule) {
            this.schedule = schedule;
            return this;
        }
        public PreventionJobTriggerTrigger build() {
            return new PreventionJobTriggerTrigger(schedule);
        }
    }
}
