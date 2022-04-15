// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ResourcePolicyInstanceSchedulePolicyVmStopSchedule {
    /**
     * Specifies the frequency for the operation, using the unix-cron format.
     * 
     */
    private final String schedule;

    @CustomType.Constructor
    private ResourcePolicyInstanceSchedulePolicyVmStopSchedule(@CustomType.Parameter("schedule") String schedule) {
        this.schedule = schedule;
    }

    /**
     * Specifies the frequency for the operation, using the unix-cron format.
     * 
    */
    public String schedule() {
        return this.schedule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyInstanceSchedulePolicyVmStopSchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String schedule;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyInstanceSchedulePolicyVmStopSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.schedule = defaults.schedule;
        }

        public Builder schedule(String schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }        public ResourcePolicyInstanceSchedulePolicyVmStopSchedule build() {
            return new ResourcePolicyInstanceSchedulePolicyVmStopSchedule(schedule);
        }
    }
}
