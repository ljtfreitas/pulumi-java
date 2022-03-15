// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ReportAggregationResponse {
    /**
     * The name of the aggregation function to use.
     * 
     */
    private final String function;
    /**
     * The name of the column to aggregate.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private ReportAggregationResponse(
        @CustomType.Parameter("function") String function,
        @CustomType.Parameter("name") String name) {
        this.function = function;
        this.name = name;
    }

    /**
     * The name of the aggregation function to use.
     * 
    */
    public String getFunction() {
        return this.function;
    }
    /**
     * The name of the column to aggregate.
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportAggregationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String function;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportAggregationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.function = defaults.function;
    	      this.name = defaults.name;
        }

        public Builder function(String function) {
            this.function = Objects.requireNonNull(function);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public ReportAggregationResponse build() {
            return new ReportAggregationResponse(function, name);
        }
    }
}
