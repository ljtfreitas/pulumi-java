// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.compute.inputs.GetResourcePolicyInstanceSchedulePolicyVmStartSchedule;
import io.pulumi.gcp.compute.inputs.GetResourcePolicyInstanceSchedulePolicyVmStopSchedule;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetResourcePolicyInstanceSchedulePolicy extends io.pulumi.resources.InvokeArgs {

    public static final GetResourcePolicyInstanceSchedulePolicy Empty = new GetResourcePolicyInstanceSchedulePolicy();

    @Import(name="expirationTime", required=true)
      private final String expirationTime;

    public String getExpirationTime() {
        return this.expirationTime;
    }

    @Import(name="startTime", required=true)
      private final String startTime;

    public String getStartTime() {
        return this.startTime;
    }

    @Import(name="timeZone", required=true)
      private final String timeZone;

    public String getTimeZone() {
        return this.timeZone;
    }

    @Import(name="vmStartSchedules", required=true)
      private final List<GetResourcePolicyInstanceSchedulePolicyVmStartSchedule> vmStartSchedules;

    public List<GetResourcePolicyInstanceSchedulePolicyVmStartSchedule> getVmStartSchedules() {
        return this.vmStartSchedules;
    }

    @Import(name="vmStopSchedules", required=true)
      private final List<GetResourcePolicyInstanceSchedulePolicyVmStopSchedule> vmStopSchedules;

    public List<GetResourcePolicyInstanceSchedulePolicyVmStopSchedule> getVmStopSchedules() {
        return this.vmStopSchedules;
    }

    public GetResourcePolicyInstanceSchedulePolicy(
        String expirationTime,
        String startTime,
        String timeZone,
        List<GetResourcePolicyInstanceSchedulePolicyVmStartSchedule> vmStartSchedules,
        List<GetResourcePolicyInstanceSchedulePolicyVmStopSchedule> vmStopSchedules) {
        this.expirationTime = Objects.requireNonNull(expirationTime, "expected parameter 'expirationTime' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
        this.timeZone = Objects.requireNonNull(timeZone, "expected parameter 'timeZone' to be non-null");
        this.vmStartSchedules = Objects.requireNonNull(vmStartSchedules, "expected parameter 'vmStartSchedules' to be non-null");
        this.vmStopSchedules = Objects.requireNonNull(vmStopSchedules, "expected parameter 'vmStopSchedules' to be non-null");
    }

    private GetResourcePolicyInstanceSchedulePolicy() {
        this.expirationTime = null;
        this.startTime = null;
        this.timeZone = null;
        this.vmStartSchedules = List.of();
        this.vmStopSchedules = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourcePolicyInstanceSchedulePolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String expirationTime;
        private String startTime;
        private String timeZone;
        private List<GetResourcePolicyInstanceSchedulePolicyVmStartSchedule> vmStartSchedules;
        private List<GetResourcePolicyInstanceSchedulePolicyVmStopSchedule> vmStopSchedules;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourcePolicyInstanceSchedulePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationTime = defaults.expirationTime;
    	      this.startTime = defaults.startTime;
    	      this.timeZone = defaults.timeZone;
    	      this.vmStartSchedules = defaults.vmStartSchedules;
    	      this.vmStopSchedules = defaults.vmStopSchedules;
        }

        public Builder expirationTime(String expirationTime) {
            this.expirationTime = Objects.requireNonNull(expirationTime);
            return this;
        }

        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder timeZone(String timeZone) {
            this.timeZone = Objects.requireNonNull(timeZone);
            return this;
        }

        public Builder vmStartSchedules(List<GetResourcePolicyInstanceSchedulePolicyVmStartSchedule> vmStartSchedules) {
            this.vmStartSchedules = Objects.requireNonNull(vmStartSchedules);
            return this;
        }

        public Builder vmStopSchedules(List<GetResourcePolicyInstanceSchedulePolicyVmStopSchedule> vmStopSchedules) {
            this.vmStopSchedules = Objects.requireNonNull(vmStopSchedules);
            return this;
        }
        public GetResourcePolicyInstanceSchedulePolicy build() {
            return new GetResourcePolicyInstanceSchedulePolicy(expirationTime, startTime, timeZone, vmStartSchedules, vmStopSchedules);
        }
    }
}
