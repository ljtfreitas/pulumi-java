// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.container.inputs.GetClusterMaintenancePolicyDailyMaintenanceWindow;
import io.pulumi.gcp.container.inputs.GetClusterMaintenancePolicyMaintenanceExclusion;
import io.pulumi.gcp.container.inputs.GetClusterMaintenancePolicyRecurringWindow;
import java.util.List;
import java.util.Objects;


public final class GetClusterMaintenancePolicy extends io.pulumi.resources.InvokeArgs {

    public static final GetClusterMaintenancePolicy Empty = new GetClusterMaintenancePolicy();

    @InputImport(name="dailyMaintenanceWindows", required=true)
        private final List<GetClusterMaintenancePolicyDailyMaintenanceWindow> dailyMaintenanceWindows;

    public List<GetClusterMaintenancePolicyDailyMaintenanceWindow> getDailyMaintenanceWindows() {
        return this.dailyMaintenanceWindows;
    }

    @InputImport(name="maintenanceExclusions", required=true)
        private final List<GetClusterMaintenancePolicyMaintenanceExclusion> maintenanceExclusions;

    public List<GetClusterMaintenancePolicyMaintenanceExclusion> getMaintenanceExclusions() {
        return this.maintenanceExclusions;
    }

    @InputImport(name="recurringWindows", required=true)
        private final List<GetClusterMaintenancePolicyRecurringWindow> recurringWindows;

    public List<GetClusterMaintenancePolicyRecurringWindow> getRecurringWindows() {
        return this.recurringWindows;
    }

    public GetClusterMaintenancePolicy(
        List<GetClusterMaintenancePolicyDailyMaintenanceWindow> dailyMaintenanceWindows,
        List<GetClusterMaintenancePolicyMaintenanceExclusion> maintenanceExclusions,
        List<GetClusterMaintenancePolicyRecurringWindow> recurringWindows) {
        this.dailyMaintenanceWindows = Objects.requireNonNull(dailyMaintenanceWindows, "expected parameter 'dailyMaintenanceWindows' to be non-null");
        this.maintenanceExclusions = Objects.requireNonNull(maintenanceExclusions, "expected parameter 'maintenanceExclusions' to be non-null");
        this.recurringWindows = Objects.requireNonNull(recurringWindows, "expected parameter 'recurringWindows' to be non-null");
    }

    private GetClusterMaintenancePolicy() {
        this.dailyMaintenanceWindows = List.of();
        this.maintenanceExclusions = List.of();
        this.recurringWindows = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterMaintenancePolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetClusterMaintenancePolicyDailyMaintenanceWindow> dailyMaintenanceWindows;
        private List<GetClusterMaintenancePolicyMaintenanceExclusion> maintenanceExclusions;
        private List<GetClusterMaintenancePolicyRecurringWindow> recurringWindows;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterMaintenancePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dailyMaintenanceWindows = defaults.dailyMaintenanceWindows;
    	      this.maintenanceExclusions = defaults.maintenanceExclusions;
    	      this.recurringWindows = defaults.recurringWindows;
        }

        public Builder setDailyMaintenanceWindows(List<GetClusterMaintenancePolicyDailyMaintenanceWindow> dailyMaintenanceWindows) {
            this.dailyMaintenanceWindows = Objects.requireNonNull(dailyMaintenanceWindows);
            return this;
        }

        public Builder setMaintenanceExclusions(List<GetClusterMaintenancePolicyMaintenanceExclusion> maintenanceExclusions) {
            this.maintenanceExclusions = Objects.requireNonNull(maintenanceExclusions);
            return this;
        }

        public Builder setRecurringWindows(List<GetClusterMaintenancePolicyRecurringWindow> recurringWindows) {
            this.recurringWindows = Objects.requireNonNull(recurringWindows);
            return this;
        }
        public GetClusterMaintenancePolicy build() {
            return new GetClusterMaintenancePolicy(dailyMaintenanceWindows, maintenanceExclusions, recurringWindows);
        }
    }
}
