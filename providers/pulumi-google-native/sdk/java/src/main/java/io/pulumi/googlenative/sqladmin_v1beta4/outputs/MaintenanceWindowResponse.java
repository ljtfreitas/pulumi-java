// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1beta4.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MaintenanceWindowResponse {
    /**
     * day of week (1-7), starting on Monday.
     * 
     */
    private final Integer day;
    /**
     * hour of day - 0 to 23.
     * 
     */
    private final Integer hour;
    /**
     * This is always `sql#maintenanceWindow`.
     * 
     */
    private final String kind;
    /**
     * Maintenance timing setting: `canary` (Earlier) or `stable` (Later). [Learn more](https://cloud.google.com/sql/docs/mysql/instance-settings#maintenance-timing-2ndgen).
     * 
     */
    private final String updateTrack;

    @CustomType.Constructor
    private MaintenanceWindowResponse(
        @CustomType.Parameter("day") Integer day,
        @CustomType.Parameter("hour") Integer hour,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("updateTrack") String updateTrack) {
        this.day = day;
        this.hour = hour;
        this.kind = kind;
        this.updateTrack = updateTrack;
    }

    /**
     * day of week (1-7), starting on Monday.
     * 
    */
    public Integer getDay() {
        return this.day;
    }
    /**
     * hour of day - 0 to 23.
     * 
    */
    public Integer getHour() {
        return this.hour;
    }
    /**
     * This is always `sql#maintenanceWindow`.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Maintenance timing setting: `canary` (Earlier) or `stable` (Later). [Learn more](https://cloud.google.com/sql/docs/mysql/instance-settings#maintenance-timing-2ndgen).
     * 
    */
    public String getUpdateTrack() {
        return this.updateTrack;
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

        public Builder day(Integer day) {
            this.day = Objects.requireNonNull(day);
            return this;
        }

        public Builder hour(Integer hour) {
            this.hour = Objects.requireNonNull(hour);
            return this;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder updateTrack(String updateTrack) {
            this.updateTrack = Objects.requireNonNull(updateTrack);
            return this;
        }
        public MaintenanceWindowResponse build() {
            return new MaintenanceWindowResponse(day, hour, kind, updateTrack);
        }
    }
}
