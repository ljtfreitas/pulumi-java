// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MonthlyScheduleResponse {
    /**
     * Indicates which days of the month snapshot should be taken. A comma delimited string.
     * 
     */
    private final @Nullable String daysOfMonth;
    /**
     * Indicates which hour in UTC timezone a snapshot should be taken
     * 
     */
    private final @Nullable Integer hour;
    /**
     * Indicates which minute snapshot should be taken
     * 
     */
    private final @Nullable Integer minute;
    /**
     * Monthly snapshot count to keep
     * 
     */
    private final @Nullable Integer snapshotsToKeep;
    /**
     * Resource size in bytes, current storage usage for the volume in bytes
     * 
     */
    private final @Nullable Double usedBytes;

    @CustomType.Constructor
    private MonthlyScheduleResponse(
        @CustomType.Parameter("daysOfMonth") @Nullable String daysOfMonth,
        @CustomType.Parameter("hour") @Nullable Integer hour,
        @CustomType.Parameter("minute") @Nullable Integer minute,
        @CustomType.Parameter("snapshotsToKeep") @Nullable Integer snapshotsToKeep,
        @CustomType.Parameter("usedBytes") @Nullable Double usedBytes) {
        this.daysOfMonth = daysOfMonth;
        this.hour = hour;
        this.minute = minute;
        this.snapshotsToKeep = snapshotsToKeep;
        this.usedBytes = usedBytes;
    }

    /**
     * Indicates which days of the month snapshot should be taken. A comma delimited string.
     * 
    */
    public Optional<String> getDaysOfMonth() {
        return Optional.ofNullable(this.daysOfMonth);
    }
    /**
     * Indicates which hour in UTC timezone a snapshot should be taken
     * 
    */
    public Optional<Integer> getHour() {
        return Optional.ofNullable(this.hour);
    }
    /**
     * Indicates which minute snapshot should be taken
     * 
    */
    public Optional<Integer> getMinute() {
        return Optional.ofNullable(this.minute);
    }
    /**
     * Monthly snapshot count to keep
     * 
    */
    public Optional<Integer> getSnapshotsToKeep() {
        return Optional.ofNullable(this.snapshotsToKeep);
    }
    /**
     * Resource size in bytes, current storage usage for the volume in bytes
     * 
    */
    public Optional<Double> getUsedBytes() {
        return Optional.ofNullable(this.usedBytes);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonthlyScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String daysOfMonth;
        private @Nullable Integer hour;
        private @Nullable Integer minute;
        private @Nullable Integer snapshotsToKeep;
        private @Nullable Double usedBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(MonthlyScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.daysOfMonth = defaults.daysOfMonth;
    	      this.hour = defaults.hour;
    	      this.minute = defaults.minute;
    	      this.snapshotsToKeep = defaults.snapshotsToKeep;
    	      this.usedBytes = defaults.usedBytes;
        }

        public Builder daysOfMonth(@Nullable String daysOfMonth) {
            this.daysOfMonth = daysOfMonth;
            return this;
        }

        public Builder hour(@Nullable Integer hour) {
            this.hour = hour;
            return this;
        }

        public Builder minute(@Nullable Integer minute) {
            this.minute = minute;
            return this;
        }

        public Builder snapshotsToKeep(@Nullable Integer snapshotsToKeep) {
            this.snapshotsToKeep = snapshotsToKeep;
            return this;
        }

        public Builder usedBytes(@Nullable Double usedBytes) {
            this.usedBytes = usedBytes;
            return this;
        }
        public MonthlyScheduleResponse build() {
            return new MonthlyScheduleResponse(daysOfMonth, hour, minute, snapshotsToKeep, usedBytes);
        }
    }
}
