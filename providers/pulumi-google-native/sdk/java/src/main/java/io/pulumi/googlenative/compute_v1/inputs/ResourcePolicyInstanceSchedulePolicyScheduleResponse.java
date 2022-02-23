// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Schedule for an instance operation.
 * 
 */
public final class ResourcePolicyInstanceSchedulePolicyScheduleResponse extends io.pulumi.resources.InvokeArgs {

    public static final ResourcePolicyInstanceSchedulePolicyScheduleResponse Empty = new ResourcePolicyInstanceSchedulePolicyScheduleResponse();

    /**
     * Specifies the frequency for the operation, using the unix-cron format.
     * 
     */
    @InputImport(name="schedule", required=true)
      private final String schedule;

    public String getSchedule() {
        return this.schedule;
    }

    public ResourcePolicyInstanceSchedulePolicyScheduleResponse(String schedule) {
        this.schedule = Objects.requireNonNull(schedule, "expected parameter 'schedule' to be non-null");
    }

    private ResourcePolicyInstanceSchedulePolicyScheduleResponse() {
        this.schedule = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyInstanceSchedulePolicyScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String schedule;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyInstanceSchedulePolicyScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.schedule = defaults.schedule;
        }

        public Builder setSchedule(String schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }
        public ResourcePolicyInstanceSchedulePolicyScheduleResponse build() {
            return new ResourcePolicyInstanceSchedulePolicyScheduleResponse(schedule);
        }
    }
}
