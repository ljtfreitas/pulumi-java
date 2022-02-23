// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.container_v1.inputs.MaintenanceExclusionOptionsArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents an arbitrary window of time.
 * 
 */
public final class TimeWindowArgs extends io.pulumi.resources.ResourceArgs {

    public static final TimeWindowArgs Empty = new TimeWindowArgs();

    /**
     * The time that the window ends. The end time should take place after the start time.
     * 
     */
    @InputImport(name="endTime")
      private final @Nullable Input<String> endTime;

    public Input<String> getEndTime() {
        return this.endTime == null ? Input.empty() : this.endTime;
    }

    /**
     * MaintenanceExclusionOptions provides maintenance exclusion related options.
     * 
     */
    @InputImport(name="maintenanceExclusionOptions")
      private final @Nullable Input<MaintenanceExclusionOptionsArgs> maintenanceExclusionOptions;

    public Input<MaintenanceExclusionOptionsArgs> getMaintenanceExclusionOptions() {
        return this.maintenanceExclusionOptions == null ? Input.empty() : this.maintenanceExclusionOptions;
    }

    /**
     * The time that the window first starts.
     * 
     */
    @InputImport(name="startTime")
      private final @Nullable Input<String> startTime;

    public Input<String> getStartTime() {
        return this.startTime == null ? Input.empty() : this.startTime;
    }

    public TimeWindowArgs(
        @Nullable Input<String> endTime,
        @Nullable Input<MaintenanceExclusionOptionsArgs> maintenanceExclusionOptions,
        @Nullable Input<String> startTime) {
        this.endTime = endTime;
        this.maintenanceExclusionOptions = maintenanceExclusionOptions;
        this.startTime = startTime;
    }

    private TimeWindowArgs() {
        this.endTime = Input.empty();
        this.maintenanceExclusionOptions = Input.empty();
        this.startTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimeWindowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> endTime;
        private @Nullable Input<MaintenanceExclusionOptionsArgs> maintenanceExclusionOptions;
        private @Nullable Input<String> startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(TimeWindowArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.maintenanceExclusionOptions = defaults.maintenanceExclusionOptions;
    	      this.startTime = defaults.startTime;
        }

        public Builder setEndTime(@Nullable Input<String> endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder setEndTime(@Nullable String endTime) {
            this.endTime = Input.ofNullable(endTime);
            return this;
        }

        public Builder setMaintenanceExclusionOptions(@Nullable Input<MaintenanceExclusionOptionsArgs> maintenanceExclusionOptions) {
            this.maintenanceExclusionOptions = maintenanceExclusionOptions;
            return this;
        }

        public Builder setMaintenanceExclusionOptions(@Nullable MaintenanceExclusionOptionsArgs maintenanceExclusionOptions) {
            this.maintenanceExclusionOptions = Input.ofNullable(maintenanceExclusionOptions);
            return this;
        }

        public Builder setStartTime(@Nullable Input<String> startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = Input.ofNullable(startTime);
            return this;
        }
        public TimeWindowArgs build() {
            return new TimeWindowArgs(endTime, maintenanceExclusionOptions, startTime);
        }
    }
}
