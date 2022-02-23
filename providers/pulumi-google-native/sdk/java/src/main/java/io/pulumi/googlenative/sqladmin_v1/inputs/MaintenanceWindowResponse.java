// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Maintenance window. This specifies when a Cloud SQL instance is restarted for system maintenance purposes.
 * 
 */
public final class MaintenanceWindowResponse extends io.pulumi.resources.InvokeArgs {

    public static final MaintenanceWindowResponse Empty = new MaintenanceWindowResponse();

    /**
     * day of week (1-7), starting on Monday.
     * 
     */
    @InputImport(name="day", required=true)
      private final Integer day;

    public Integer getDay() {
        return this.day;
    }

    /**
     * hour of day - 0 to 23.
     * 
     */
    @InputImport(name="hour", required=true)
      private final Integer hour;

    public Integer getHour() {
        return this.hour;
    }

    /**
     * This is always `sql#maintenanceWindow`.
     * 
     */
    @InputImport(name="kind", required=true)
      private final String kind;

    public String getKind() {
        return this.kind;
    }

    /**
     * Maintenance timing setting: `canary` (Earlier) or `stable` (Later). [Learn more](https://cloud.google.com/sql/docs/mysql/instance-settings#maintenance-timing-2ndgen).
     * 
     */
    @InputImport(name="updateTrack", required=true)
      private final String updateTrack;

    public String getUpdateTrack() {
        return this.updateTrack;
    }

    public MaintenanceWindowResponse(
        Integer day,
        Integer hour,
        String kind,
        String updateTrack) {
        this.day = Objects.requireNonNull(day, "expected parameter 'day' to be non-null");
        this.hour = Objects.requireNonNull(hour, "expected parameter 'hour' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.updateTrack = Objects.requireNonNull(updateTrack, "expected parameter 'updateTrack' to be non-null");
    }

    private MaintenanceWindowResponse() {
        this.day = null;
        this.hour = null;
        this.kind = null;
        this.updateTrack = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaintenanceWindowResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer day;
        private Integer hour;
        private String kind;
        private String updateTrack;

        public Builder() {
    	      // Empty
        }

        public Builder(MaintenanceWindowResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.hour = defaults.hour;
    	      this.kind = defaults.kind;
    	      this.updateTrack = defaults.updateTrack;
        }

        public Builder setDay(Integer day) {
            this.day = Objects.requireNonNull(day);
            return this;
        }

        public Builder setHour(Integer hour) {
            this.hour = Objects.requireNonNull(hour);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setUpdateTrack(String updateTrack) {
            this.updateTrack = Objects.requireNonNull(updateTrack);
            return this;
        }
        public MaintenanceWindowResponse build() {
            return new MaintenanceWindowResponse(day, hour, kind, updateTrack);
        }
    }
}
