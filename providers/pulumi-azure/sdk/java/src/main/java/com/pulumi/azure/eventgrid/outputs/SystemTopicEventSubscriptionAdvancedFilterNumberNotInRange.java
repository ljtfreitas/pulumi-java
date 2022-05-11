// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventgrid.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class SystemTopicEventSubscriptionAdvancedFilterNumberNotInRange {
    /**
     * @return Specifies the field within the event data that you want to use for filtering. Type of the field can be a number, boolean, or string.
     * 
     */
    private final String key;
    /**
     * @return Specifies an array of values to compare to when using a multiple values operator.
     * 
     */
    private final List<List<Double>> values;

    @CustomType.Constructor
    private SystemTopicEventSubscriptionAdvancedFilterNumberNotInRange(
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("values") List<List<Double>> values) {
        this.key = key;
        this.values = values;
    }

    /**
     * @return Specifies the field within the event data that you want to use for filtering. Type of the field can be a number, boolean, or string.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return Specifies an array of values to compare to when using a multiple values operator.
     * 
     */
    public List<List<Double>> values() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SystemTopicEventSubscriptionAdvancedFilterNumberNotInRange defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private List<List<Double>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(SystemTopicEventSubscriptionAdvancedFilterNumberNotInRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.values = defaults.values;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder values(List<List<Double>> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }        public SystemTopicEventSubscriptionAdvancedFilterNumberNotInRange build() {
            return new SystemTopicEventSubscriptionAdvancedFilterNumberNotInRange(key, values);
        }
    }
}
