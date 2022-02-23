// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Hourly Schedule properties
 * 
 */
public final class HourlyScheduleArgs extends io.pulumi.resources.ResourceArgs {

    public static final HourlyScheduleArgs Empty = new HourlyScheduleArgs();

    /**
     * Indicates which minute snapshot should be taken
     * 
     */
    @InputImport(name="minute")
        private final @Nullable Input<Integer> minute;

    public Input<Integer> getMinute() {
        return this.minute == null ? Input.empty() : this.minute;
    }

    /**
     * Hourly snapshot count to keep
     * 
     */
    @InputImport(name="snapshotsToKeep")
        private final @Nullable Input<Integer> snapshotsToKeep;

    public Input<Integer> getSnapshotsToKeep() {
        return this.snapshotsToKeep == null ? Input.empty() : this.snapshotsToKeep;
    }

    /**
     * Resource size in bytes, current storage usage for the volume in bytes
     * 
     */
    @InputImport(name="usedBytes")
        private final @Nullable Input<Double> usedBytes;

    public Input<Double> getUsedBytes() {
        return this.usedBytes == null ? Input.empty() : this.usedBytes;
    }

    public HourlyScheduleArgs(
        @Nullable Input<Integer> minute,
        @Nullable Input<Integer> snapshotsToKeep,
        @Nullable Input<Double> usedBytes) {
        this.minute = minute;
        this.snapshotsToKeep = snapshotsToKeep;
        this.usedBytes = usedBytes;
    }

    private HourlyScheduleArgs() {
        this.minute = Input.empty();
        this.snapshotsToKeep = Input.empty();
        this.usedBytes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HourlyScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> minute;
        private @Nullable Input<Integer> snapshotsToKeep;
        private @Nullable Input<Double> usedBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(HourlyScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minute = defaults.minute;
    	      this.snapshotsToKeep = defaults.snapshotsToKeep;
    	      this.usedBytes = defaults.usedBytes;
        }

        public Builder setMinute(@Nullable Input<Integer> minute) {
            this.minute = minute;
            return this;
        }

        public Builder setMinute(@Nullable Integer minute) {
            this.minute = Input.ofNullable(minute);
            return this;
        }

        public Builder setSnapshotsToKeep(@Nullable Input<Integer> snapshotsToKeep) {
            this.snapshotsToKeep = snapshotsToKeep;
            return this;
        }

        public Builder setSnapshotsToKeep(@Nullable Integer snapshotsToKeep) {
            this.snapshotsToKeep = Input.ofNullable(snapshotsToKeep);
            return this;
        }

        public Builder setUsedBytes(@Nullable Input<Double> usedBytes) {
            this.usedBytes = usedBytes;
            return this;
        }

        public Builder setUsedBytes(@Nullable Double usedBytes) {
            this.usedBytes = Input.ofNullable(usedBytes);
            return this;
        }
        public HourlyScheduleArgs build() {
            return new HourlyScheduleArgs(minute, snapshotsToKeep, usedBytes);
        }
    }
}
