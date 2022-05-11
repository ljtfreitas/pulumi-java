// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventgrid.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class EventSubscriptionAdvancedFilterNumberLessThan {
    /**
     * @return Specifies the field within the event data that you want to use for filtering. Type of the field can be a number, boolean, or string.
     * 
     */
    private final String key;
    /**
     * @return Specifies a single value to compare to when using a single value operator.
     * 
     */
    private final Double value;

    @CustomType.Constructor
    private EventSubscriptionAdvancedFilterNumberLessThan(
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("value") Double value) {
        this.key = key;
        this.value = value;
    }

    /**
     * @return Specifies the field within the event data that you want to use for filtering. Type of the field can be a number, boolean, or string.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return Specifies a single value to compare to when using a single value operator.
     * 
     */
    public Double value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventSubscriptionAdvancedFilterNumberLessThan defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private Double value;

        public Builder() {
    	      // Empty
        }

        public Builder(EventSubscriptionAdvancedFilterNumberLessThan defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder value(Double value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public EventSubscriptionAdvancedFilterNumberLessThan build() {
            return new EventSubscriptionAdvancedFilterNumberLessThan(key, value);
        }
    }
}
