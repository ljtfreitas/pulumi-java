// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice;

import io.pulumi.azurenative.containerservice.inputs.TimeInWeekArgs;
import io.pulumi.azurenative.containerservice.inputs.TimeSpanArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MaintenanceConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final MaintenanceConfigurationArgs Empty = new MaintenanceConfigurationArgs();

    /**
     * The name of the maintenance configuration.
     * 
     */
    @InputImport(name="configName")
        private final @Nullable Input<String> configName;

    public Input<String> getConfigName() {
        return this.configName == null ? Input.empty() : this.configName;
    }

    /**
     * Time slots on which upgrade is not allowed.
     * 
     */
    @InputImport(name="notAllowedTime")
        private final @Nullable Input<List<TimeSpanArgs>> notAllowedTime;

    public Input<List<TimeSpanArgs>> getNotAllowedTime() {
        return this.notAllowedTime == null ? Input.empty() : this.notAllowedTime;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the managed cluster resource.
     * 
     */
    @InputImport(name="resourceName", required=true)
        private final Input<String> resourceName;

    public Input<String> getPropResourceName() {
        return this.resourceName;
    }

    /**
     * Weekday time slots allowed to upgrade.
     * 
     */
    @InputImport(name="timeInWeek")
        private final @Nullable Input<List<TimeInWeekArgs>> timeInWeek;

    public Input<List<TimeInWeekArgs>> getTimeInWeek() {
        return this.timeInWeek == null ? Input.empty() : this.timeInWeek;
    }

    public MaintenanceConfigurationArgs(
        @Nullable Input<String> configName,
        @Nullable Input<List<TimeSpanArgs>> notAllowedTime,
        Input<String> resourceGroupName,
        Input<String> resourceName,
        @Nullable Input<List<TimeInWeekArgs>> timeInWeek) {
        this.configName = configName;
        this.notAllowedTime = notAllowedTime;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
        this.timeInWeek = timeInWeek;
    }

    private MaintenanceConfigurationArgs() {
        this.configName = Input.empty();
        this.notAllowedTime = Input.empty();
        this.resourceGroupName = Input.empty();
        this.resourceName = Input.empty();
        this.timeInWeek = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaintenanceConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> configName;
        private @Nullable Input<List<TimeSpanArgs>> notAllowedTime;
        private Input<String> resourceGroupName;
        private Input<String> resourceName;
        private @Nullable Input<List<TimeInWeekArgs>> timeInWeek;

        public Builder() {
    	      // Empty
        }

        public Builder(MaintenanceConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configName = defaults.configName;
    	      this.notAllowedTime = defaults.notAllowedTime;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
    	      this.timeInWeek = defaults.timeInWeek;
        }

        public Builder setConfigName(@Nullable Input<String> configName) {
            this.configName = configName;
            return this;
        }

        public Builder setConfigName(@Nullable String configName) {
            this.configName = Input.ofNullable(configName);
            return this;
        }

        public Builder setNotAllowedTime(@Nullable Input<List<TimeSpanArgs>> notAllowedTime) {
            this.notAllowedTime = notAllowedTime;
            return this;
        }

        public Builder setNotAllowedTime(@Nullable List<TimeSpanArgs> notAllowedTime) {
            this.notAllowedTime = Input.ofNullable(notAllowedTime);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setResourceName(Input<String> resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }

        public Builder setResourceName(String resourceName) {
            this.resourceName = Input.of(Objects.requireNonNull(resourceName));
            return this;
        }

        public Builder setTimeInWeek(@Nullable Input<List<TimeInWeekArgs>> timeInWeek) {
            this.timeInWeek = timeInWeek;
            return this;
        }

        public Builder setTimeInWeek(@Nullable List<TimeInWeekArgs> timeInWeek) {
            this.timeInWeek = Input.ofNullable(timeInWeek);
            return this;
        }
        public MaintenanceConfigurationArgs build() {
            return new MaintenanceConfigurationArgs(configName, notAllowedTime, resourceGroupName, resourceName, timeInWeek);
        }
    }
}
