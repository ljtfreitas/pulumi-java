// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1beta4.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.sqladmin_v1beta4.enums.MaintenanceWindowUpdateTrack;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Maintenance window. This specifies when a Cloud SQL instance is restarted for system maintenance purposes.
 * 
 */
public final class MaintenanceWindowArgs extends io.pulumi.resources.ResourceArgs {

    public static final MaintenanceWindowArgs Empty = new MaintenanceWindowArgs();

    /**
     * day of week (1-7), starting on Monday.
     * 
     */
    @Import(name="day")
      private final @Nullable Output<Integer> day;

    public Output<Integer> getDay() {
        return this.day == null ? Output.empty() : this.day;
    }

    /**
     * hour of day - 0 to 23.
     * 
     */
    @Import(name="hour")
      private final @Nullable Output<Integer> hour;

    public Output<Integer> getHour() {
        return this.hour == null ? Output.empty() : this.hour;
    }

    /**
     * This is always `sql#maintenanceWindow`.
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Output.empty() : this.kind;
    }

    /**
     * Maintenance timing setting: `canary` (Earlier) or `stable` (Later). [Learn more](https://cloud.google.com/sql/docs/mysql/instance-settings#maintenance-timing-2ndgen).
     * 
     */
    @Import(name="updateTrack")
      private final @Nullable Output<MaintenanceWindowUpdateTrack> updateTrack;

    public Output<MaintenanceWindowUpdateTrack> getUpdateTrack() {
        return this.updateTrack == null ? Output.empty() : this.updateTrack;
    }

    public MaintenanceWindowArgs(
        @Nullable Output<Integer> day,
        @Nullable Output<Integer> hour,
        @Nullable Output<String> kind,
        @Nullable Output<MaintenanceWindowUpdateTrack> updateTrack) {
        this.day = day;
        this.hour = hour;
        this.kind = kind;
        this.updateTrack = updateTrack;
    }

    private MaintenanceWindowArgs() {
        this.day = Output.empty();
        this.hour = Output.empty();
        this.kind = Output.empty();
        this.updateTrack = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaintenanceWindowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> day;
        private @Nullable Output<Integer> hour;
        private @Nullable Output<String> kind;
        private @Nullable Output<MaintenanceWindowUpdateTrack> updateTrack;

        public Builder() {
    	      // Empty
        }

        public Builder(MaintenanceWindowArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.hour = defaults.hour;
    	      this.kind = defaults.kind;
    	      this.updateTrack = defaults.updateTrack;
        }

        public Builder day(@Nullable Output<Integer> day) {
            this.day = day;
            return this;
        }

        public Builder day(@Nullable Integer day) {
            this.day = Output.ofNullable(day);
            return this;
        }

        public Builder hour(@Nullable Output<Integer> hour) {
            this.hour = hour;
            return this;
        }

        public Builder hour(@Nullable Integer hour) {
            this.hour = Output.ofNullable(hour);
            return this;
        }

        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder kind(@Nullable String kind) {
            this.kind = Output.ofNullable(kind);
            return this;
        }

        public Builder updateTrack(@Nullable Output<MaintenanceWindowUpdateTrack> updateTrack) {
            this.updateTrack = updateTrack;
            return this;
        }

        public Builder updateTrack(@Nullable MaintenanceWindowUpdateTrack updateTrack) {
            this.updateTrack = Output.ofNullable(updateTrack);
            return this;
        }
        public MaintenanceWindowArgs build() {
            return new MaintenanceWindowArgs(day, hour, kind, updateTrack);
        }
    }
}
