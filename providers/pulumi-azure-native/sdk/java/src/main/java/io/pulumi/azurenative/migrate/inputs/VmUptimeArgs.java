// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VmUptimeArgs extends io.pulumi.resources.ResourceArgs {

    public static final VmUptimeArgs Empty = new VmUptimeArgs();

    /**
     * Number of days in a month for VM uptime.
     * 
     */
    @Import(name="daysPerMonth")
      private final @Nullable Output<Double> daysPerMonth;

    public Output<Double> getDaysPerMonth() {
        return this.daysPerMonth == null ? Output.empty() : this.daysPerMonth;
    }

    /**
     * Number of hours per day for VM uptime.
     * 
     */
    @Import(name="hoursPerDay")
      private final @Nullable Output<Double> hoursPerDay;

    public Output<Double> getHoursPerDay() {
        return this.hoursPerDay == null ? Output.empty() : this.hoursPerDay;
    }

    public VmUptimeArgs(
        @Nullable Output<Double> daysPerMonth,
        @Nullable Output<Double> hoursPerDay) {
        this.daysPerMonth = daysPerMonth;
        this.hoursPerDay = hoursPerDay;
    }

    private VmUptimeArgs() {
        this.daysPerMonth = Output.empty();
        this.hoursPerDay = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VmUptimeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Double> daysPerMonth;
        private @Nullable Output<Double> hoursPerDay;

        public Builder() {
    	      // Empty
        }

        public Builder(VmUptimeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.daysPerMonth = defaults.daysPerMonth;
    	      this.hoursPerDay = defaults.hoursPerDay;
        }

        public Builder daysPerMonth(@Nullable Output<Double> daysPerMonth) {
            this.daysPerMonth = daysPerMonth;
            return this;
        }

        public Builder daysPerMonth(@Nullable Double daysPerMonth) {
            this.daysPerMonth = Output.ofNullable(daysPerMonth);
            return this;
        }

        public Builder hoursPerDay(@Nullable Output<Double> hoursPerDay) {
            this.hoursPerDay = hoursPerDay;
            return this;
        }

        public Builder hoursPerDay(@Nullable Double hoursPerDay) {
            this.hoursPerDay = Output.ofNullable(hoursPerDay);
            return this;
        }
        public VmUptimeArgs build() {
            return new VmUptimeArgs(daysPerMonth, hoursPerDay);
        }
    }
}
