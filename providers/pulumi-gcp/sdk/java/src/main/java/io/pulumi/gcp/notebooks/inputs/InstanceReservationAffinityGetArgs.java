// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.notebooks.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceReservationAffinityGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceReservationAffinityGetArgs Empty = new InstanceReservationAffinityGetArgs();

    /**
     * The type of Compute Reservation.
     * Possible values are `NO_RESERVATION`, `ANY_RESERVATION`, and `SPECIFIC_RESERVATION`.
     * 
     */
    @InputImport(name="consumeReservationType", required=true)
        private final Input<String> consumeReservationType;

    public Input<String> getConsumeReservationType() {
        return this.consumeReservationType;
    }

    /**
     * Corresponds to the label key of reservation resource.
     * 
     */
    @InputImport(name="key")
        private final @Nullable Input<String> key;

    public Input<String> getKey() {
        return this.key == null ? Input.empty() : this.key;
    }

    /**
     * Corresponds to the label values of reservation resource.
     * 
     */
    @InputImport(name="values")
        private final @Nullable Input<List<String>> values;

    public Input<List<String>> getValues() {
        return this.values == null ? Input.empty() : this.values;
    }

    public InstanceReservationAffinityGetArgs(
        Input<String> consumeReservationType,
        @Nullable Input<String> key,
        @Nullable Input<List<String>> values) {
        this.consumeReservationType = Objects.requireNonNull(consumeReservationType, "expected parameter 'consumeReservationType' to be non-null");
        this.key = key;
        this.values = values;
    }

    private InstanceReservationAffinityGetArgs() {
        this.consumeReservationType = Input.empty();
        this.key = Input.empty();
        this.values = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceReservationAffinityGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> consumeReservationType;
        private @Nullable Input<String> key;
        private @Nullable Input<List<String>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceReservationAffinityGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consumeReservationType = defaults.consumeReservationType;
    	      this.key = defaults.key;
    	      this.values = defaults.values;
        }

        public Builder setConsumeReservationType(Input<String> consumeReservationType) {
            this.consumeReservationType = Objects.requireNonNull(consumeReservationType);
            return this;
        }

        public Builder setConsumeReservationType(String consumeReservationType) {
            this.consumeReservationType = Input.of(Objects.requireNonNull(consumeReservationType));
            return this;
        }

        public Builder setKey(@Nullable Input<String> key) {
            this.key = key;
            return this;
        }

        public Builder setKey(@Nullable String key) {
            this.key = Input.ofNullable(key);
            return this;
        }

        public Builder setValues(@Nullable Input<List<String>> values) {
            this.values = values;
            return this;
        }

        public Builder setValues(@Nullable List<String> values) {
            this.values = Input.ofNullable(values);
            return this;
        }
        public InstanceReservationAffinityGetArgs build() {
            return new InstanceReservationAffinityGetArgs(consumeReservationType, key, values);
        }
    }
}
