// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class InstanceReservationAffinitySpecificReservationArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceReservationAffinitySpecificReservationArgs Empty = new InstanceReservationAffinitySpecificReservationArgs();

    /**
     * Corresponds to the label key of a reservation resource. To target a SPECIFIC_RESERVATION by name, specify compute.googleapis.com/reservation-name as the key and specify the name of your reservation as the only value.
     * 
     */
    @InputImport(name="key", required=true)
        private final Input<String> key;

    public Input<String> getKey() {
        return this.key;
    }

    /**
     * Corresponds to the label values of a reservation resource.
     * 
     */
    @InputImport(name="values", required=true)
        private final Input<List<String>> values;

    public Input<List<String>> getValues() {
        return this.values;
    }

    public InstanceReservationAffinitySpecificReservationArgs(
        Input<String> key,
        Input<List<String>> values) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.values = Objects.requireNonNull(values, "expected parameter 'values' to be non-null");
    }

    private InstanceReservationAffinitySpecificReservationArgs() {
        this.key = Input.empty();
        this.values = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceReservationAffinitySpecificReservationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> key;
        private Input<List<String>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceReservationAffinitySpecificReservationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.values = defaults.values;
        }

        public Builder setKey(Input<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setKey(String key) {
            this.key = Input.of(Objects.requireNonNull(key));
            return this;
        }

        public Builder setValues(Input<List<String>> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }

        public Builder setValues(List<String> values) {
            this.values = Input.of(Objects.requireNonNull(values));
            return this;
        }
        public InstanceReservationAffinitySpecificReservationArgs build() {
            return new InstanceReservationAffinitySpecificReservationArgs(key, values);
        }
    }
}
