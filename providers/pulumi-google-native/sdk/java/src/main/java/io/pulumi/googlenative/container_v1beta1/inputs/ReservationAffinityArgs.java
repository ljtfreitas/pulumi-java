// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.container_v1beta1.enums.ReservationAffinityConsumeReservationType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * [ReservationAffinity](https://cloud.google.com/compute/docs/instances/reserving-zonal-resources) is the configuration of desired reservation which instances could take capacity from.
 * 
 */
public final class ReservationAffinityArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReservationAffinityArgs Empty = new ReservationAffinityArgs();

    /**
     * Corresponds to the type of reservation consumption.
     * 
     */
    @Import(name="consumeReservationType")
      private final @Nullable Output<ReservationAffinityConsumeReservationType> consumeReservationType;

    public Output<ReservationAffinityConsumeReservationType> getConsumeReservationType() {
        return this.consumeReservationType == null ? Output.empty() : this.consumeReservationType;
    }

    /**
     * Corresponds to the label key of a reservation resource. To target a SPECIFIC_RESERVATION by name, specify "googleapis.com/reservation-name" as the key and specify the name of your reservation as its value.
     * 
     */
    @Import(name="key")
      private final @Nullable Output<String> key;

    public Output<String> getKey() {
        return this.key == null ? Output.empty() : this.key;
    }

    /**
     * Corresponds to the label value(s) of reservation resource(s).
     * 
     */
    @Import(name="values")
      private final @Nullable Output<List<String>> values;

    public Output<List<String>> getValues() {
        return this.values == null ? Output.empty() : this.values;
    }

    public ReservationAffinityArgs(
        @Nullable Output<ReservationAffinityConsumeReservationType> consumeReservationType,
        @Nullable Output<String> key,
        @Nullable Output<List<String>> values) {
        this.consumeReservationType = consumeReservationType;
        this.key = key;
        this.values = values;
    }

    private ReservationAffinityArgs() {
        this.consumeReservationType = Output.empty();
        this.key = Output.empty();
        this.values = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReservationAffinityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ReservationAffinityConsumeReservationType> consumeReservationType;
        private @Nullable Output<String> key;
        private @Nullable Output<List<String>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ReservationAffinityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consumeReservationType = defaults.consumeReservationType;
    	      this.key = defaults.key;
    	      this.values = defaults.values;
        }

        public Builder consumeReservationType(@Nullable Output<ReservationAffinityConsumeReservationType> consumeReservationType) {
            this.consumeReservationType = consumeReservationType;
            return this;
        }

        public Builder consumeReservationType(@Nullable ReservationAffinityConsumeReservationType consumeReservationType) {
            this.consumeReservationType = Output.ofNullable(consumeReservationType);
            return this;
        }

        public Builder key(@Nullable Output<String> key) {
            this.key = key;
            return this;
        }

        public Builder key(@Nullable String key) {
            this.key = Output.ofNullable(key);
            return this;
        }

        public Builder values(@Nullable Output<List<String>> values) {
            this.values = values;
            return this;
        }

        public Builder values(@Nullable List<String> values) {
            this.values = Output.ofNullable(values);
            return this;
        }
        public ReservationAffinityArgs build() {
            return new ReservationAffinityArgs(consumeReservationType, key, values);
        }
    }
}
