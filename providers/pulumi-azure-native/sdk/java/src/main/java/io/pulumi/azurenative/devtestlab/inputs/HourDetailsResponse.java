// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of an hourly schedule.
 * 
 */
public final class HourDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final HourDetailsResponse Empty = new HourDetailsResponse();

    /**
     * Minutes of the hour the schedule will run.
     * 
     */
    @InputImport(name="minute")
        private final @Nullable Integer minute;

    public Optional<Integer> getMinute() {
        return this.minute == null ? Optional.empty() : Optional.ofNullable(this.minute);
    }

    public HourDetailsResponse(@Nullable Integer minute) {
        this.minute = minute;
    }

    private HourDetailsResponse() {
        this.minute = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HourDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer minute;

        public Builder() {
    	      // Empty
        }

        public Builder(HourDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minute = defaults.minute;
        }

        public Builder setMinute(@Nullable Integer minute) {
            this.minute = minute;
            return this;
        }
        public HourDetailsResponse build() {
            return new HourDetailsResponse(minute);
        }
    }
}
