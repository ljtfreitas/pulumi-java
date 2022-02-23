// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ChannelRetentionPeriod extends io.pulumi.resources.InvokeArgs {

    public static final ChannelRetentionPeriod Empty = new ChannelRetentionPeriod();

    @InputImport(name="numberOfDays")
        private final @Nullable Integer numberOfDays;

    public Optional<Integer> getNumberOfDays() {
        return this.numberOfDays == null ? Optional.empty() : Optional.ofNullable(this.numberOfDays);
    }

    @InputImport(name="unlimited")
        private final @Nullable Boolean unlimited;

    public Optional<Boolean> getUnlimited() {
        return this.unlimited == null ? Optional.empty() : Optional.ofNullable(this.unlimited);
    }

    public ChannelRetentionPeriod(
        @Nullable Integer numberOfDays,
        @Nullable Boolean unlimited) {
        this.numberOfDays = numberOfDays;
        this.unlimited = unlimited;
    }

    private ChannelRetentionPeriod() {
        this.numberOfDays = null;
        this.unlimited = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelRetentionPeriod defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer numberOfDays;
        private @Nullable Boolean unlimited;

        public Builder() {
    	      // Empty
        }

        public Builder(ChannelRetentionPeriod defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.numberOfDays = defaults.numberOfDays;
    	      this.unlimited = defaults.unlimited;
        }

        public Builder setNumberOfDays(@Nullable Integer numberOfDays) {
            this.numberOfDays = numberOfDays;
            return this;
        }

        public Builder setUnlimited(@Nullable Boolean unlimited) {
            this.unlimited = unlimited;
            return this;
        }
        public ChannelRetentionPeriod build() {
            return new ChannelRetentionPeriod(numberOfDays, unlimited);
        }
    }
}
