// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.container_v1.inputs.DailyMaintenanceWindowArgs;
import io.pulumi.googlenative.container_v1.inputs.RecurringTimeWindowArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * MaintenanceWindow defines the maintenance window to be used for the cluster.
 * 
 */
public final class MaintenanceWindowArgs extends io.pulumi.resources.ResourceArgs {

    public static final MaintenanceWindowArgs Empty = new MaintenanceWindowArgs();

    /**
     * DailyMaintenanceWindow specifies a daily maintenance operation window.
     * 
     */
    @InputImport(name="dailyMaintenanceWindow")
      private final @Nullable Input<DailyMaintenanceWindowArgs> dailyMaintenanceWindow;

    public Input<DailyMaintenanceWindowArgs> getDailyMaintenanceWindow() {
        return this.dailyMaintenanceWindow == null ? Input.empty() : this.dailyMaintenanceWindow;
    }

    /**
     * Exceptions to maintenance window. Non-emergency maintenance should not occur in these windows.
     * 
     */
    @InputImport(name="maintenanceExclusions")
      private final @Nullable Input<Map<String,String>> maintenanceExclusions;

    public Input<Map<String,String>> getMaintenanceExclusions() {
        return this.maintenanceExclusions == null ? Input.empty() : this.maintenanceExclusions;
    }

    /**
     * RecurringWindow specifies some number of recurring time periods for maintenance to occur. The time windows may be overlapping. If no maintenance windows are set, maintenance can occur at any time.
     * 
     */
    @InputImport(name="recurringWindow")
      private final @Nullable Input<RecurringTimeWindowArgs> recurringWindow;

    public Input<RecurringTimeWindowArgs> getRecurringWindow() {
        return this.recurringWindow == null ? Input.empty() : this.recurringWindow;
    }

    public MaintenanceWindowArgs(
        @Nullable Input<DailyMaintenanceWindowArgs> dailyMaintenanceWindow,
        @Nullable Input<Map<String,String>> maintenanceExclusions,
        @Nullable Input<RecurringTimeWindowArgs> recurringWindow) {
        this.dailyMaintenanceWindow = dailyMaintenanceWindow;
        this.maintenanceExclusions = maintenanceExclusions;
        this.recurringWindow = recurringWindow;
    }

    private MaintenanceWindowArgs() {
        this.dailyMaintenanceWindow = Input.empty();
        this.maintenanceExclusions = Input.empty();
        this.recurringWindow = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaintenanceWindowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DailyMaintenanceWindowArgs> dailyMaintenanceWindow;
        private @Nullable Input<Map<String,String>> maintenanceExclusions;
        private @Nullable Input<RecurringTimeWindowArgs> recurringWindow;

        public Builder() {
    	      // Empty
        }

        public Builder(MaintenanceWindowArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dailyMaintenanceWindow = defaults.dailyMaintenanceWindow;
    	      this.maintenanceExclusions = defaults.maintenanceExclusions;
    	      this.recurringWindow = defaults.recurringWindow;
        }

        public Builder setDailyMaintenanceWindow(@Nullable Input<DailyMaintenanceWindowArgs> dailyMaintenanceWindow) {
            this.dailyMaintenanceWindow = dailyMaintenanceWindow;
            return this;
        }

        public Builder setDailyMaintenanceWindow(@Nullable DailyMaintenanceWindowArgs dailyMaintenanceWindow) {
            this.dailyMaintenanceWindow = Input.ofNullable(dailyMaintenanceWindow);
            return this;
        }

        public Builder setMaintenanceExclusions(@Nullable Input<Map<String,String>> maintenanceExclusions) {
            this.maintenanceExclusions = maintenanceExclusions;
            return this;
        }

        public Builder setMaintenanceExclusions(@Nullable Map<String,String> maintenanceExclusions) {
            this.maintenanceExclusions = Input.ofNullable(maintenanceExclusions);
            return this;
        }

        public Builder setRecurringWindow(@Nullable Input<RecurringTimeWindowArgs> recurringWindow) {
            this.recurringWindow = recurringWindow;
            return this;
        }

        public Builder setRecurringWindow(@Nullable RecurringTimeWindowArgs recurringWindow) {
            this.recurringWindow = Input.ofNullable(recurringWindow);
            return this;
        }
        public MaintenanceWindowArgs build() {
            return new MaintenanceWindowArgs(dailyMaintenanceWindow, maintenanceExclusions, recurringWindow);
        }
    }
}
