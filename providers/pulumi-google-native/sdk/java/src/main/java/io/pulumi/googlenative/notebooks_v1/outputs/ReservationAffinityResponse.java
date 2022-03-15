// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ReservationAffinityResponse {
    /**
     * Optional. Type of reservation to consume
     * 
     */
    private final String consumeReservationType;
    /**
     * Optional. Corresponds to the label key of reservation resource.
     * 
     */
    private final String key;
    /**
     * Optional. Corresponds to the label values of reservation resource.
     * 
     */
    private final List<String> values;

    @CustomType.Constructor
    private ReservationAffinityResponse(
        @CustomType.Parameter("consumeReservationType") String consumeReservationType,
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("values") List<String> values) {
        this.consumeReservationType = consumeReservationType;
        this.key = key;
        this.values = values;
    }

    /**
     * Optional. Type of reservation to consume
     * 
    */
    public String getConsumeReservationType() {
        return this.consumeReservationType;
    }
    /**
     * Optional. Corresponds to the label key of reservation resource.
     * 
    */
    public String getKey() {
        return this.key;
    }
    /**
     * Optional. Corresponds to the label values of reservation resource.
     * 
    */
    public List<String> getValues() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReservationAffinityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String consumeReservationType;
        private String key;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ReservationAffinityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consumeReservationType = defaults.consumeReservationType;
    	      this.key = defaults.key;
    	      this.values = defaults.values;
        }

        public Builder consumeReservationType(String consumeReservationType) {
            this.consumeReservationType = Objects.requireNonNull(consumeReservationType);
            return this;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder values(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public ReservationAffinityResponse build() {
            return new ReservationAffinityResponse(consumeReservationType, key, values);
        }
    }
}
