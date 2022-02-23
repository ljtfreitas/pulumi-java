// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sqlvirtualmachine.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Set a patching window during which Windows and SQL patches will be applied.
 * 
 */
public final class AutoPatchingSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final AutoPatchingSettingsResponse Empty = new AutoPatchingSettingsResponse();

    /**
     * Day of week to apply the patch on.
     * 
     */
    @InputImport(name="dayOfWeek")
        private final @Nullable String dayOfWeek;

    public Optional<String> getDayOfWeek() {
        return this.dayOfWeek == null ? Optional.empty() : Optional.ofNullable(this.dayOfWeek);
    }

    /**
     * Enable or disable autopatching on SQL virtual machine.
     * 
     */
    @InputImport(name="enable")
        private final @Nullable Boolean enable;

    public Optional<Boolean> getEnable() {
        return this.enable == null ? Optional.empty() : Optional.ofNullable(this.enable);
    }

    /**
     * Duration of patching.
     * 
     */
    @InputImport(name="maintenanceWindowDuration")
        private final @Nullable Integer maintenanceWindowDuration;

    public Optional<Integer> getMaintenanceWindowDuration() {
        return this.maintenanceWindowDuration == null ? Optional.empty() : Optional.ofNullable(this.maintenanceWindowDuration);
    }

    /**
     * Hour of the day when patching is initiated. Local VM time.
     * 
     */
    @InputImport(name="maintenanceWindowStartingHour")
        private final @Nullable Integer maintenanceWindowStartingHour;

    public Optional<Integer> getMaintenanceWindowStartingHour() {
        return this.maintenanceWindowStartingHour == null ? Optional.empty() : Optional.ofNullable(this.maintenanceWindowStartingHour);
    }

    public AutoPatchingSettingsResponse(
        @Nullable String dayOfWeek,
        @Nullable Boolean enable,
        @Nullable Integer maintenanceWindowDuration,
        @Nullable Integer maintenanceWindowStartingHour) {
        this.dayOfWeek = dayOfWeek;
        this.enable = enable;
        this.maintenanceWindowDuration = maintenanceWindowDuration;
        this.maintenanceWindowStartingHour = maintenanceWindowStartingHour;
    }

    private AutoPatchingSettingsResponse() {
        this.dayOfWeek = null;
        this.enable = null;
        this.maintenanceWindowDuration = null;
        this.maintenanceWindowStartingHour = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoPatchingSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dayOfWeek;
        private @Nullable Boolean enable;
        private @Nullable Integer maintenanceWindowDuration;
        private @Nullable Integer maintenanceWindowStartingHour;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoPatchingSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dayOfWeek = defaults.dayOfWeek;
    	      this.enable = defaults.enable;
    	      this.maintenanceWindowDuration = defaults.maintenanceWindowDuration;
    	      this.maintenanceWindowStartingHour = defaults.maintenanceWindowStartingHour;
        }

        public Builder setDayOfWeek(@Nullable String dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
            return this;
        }

        public Builder setEnable(@Nullable Boolean enable) {
            this.enable = enable;
            return this;
        }

        public Builder setMaintenanceWindowDuration(@Nullable Integer maintenanceWindowDuration) {
            this.maintenanceWindowDuration = maintenanceWindowDuration;
            return this;
        }

        public Builder setMaintenanceWindowStartingHour(@Nullable Integer maintenanceWindowStartingHour) {
            this.maintenanceWindowStartingHour = maintenanceWindowStartingHour;
            return this;
        }
        public AutoPatchingSettingsResponse build() {
            return new AutoPatchingSettingsResponse(dayOfWeek, enable, maintenanceWindowDuration, maintenanceWindowStartingHour);
        }
    }
}
