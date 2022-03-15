// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * NumberIn Advanced Filter.
 * 
 */
public final class NumberInAdvancedFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final NumberInAdvancedFilterArgs Empty = new NumberInAdvancedFilterArgs();

    /**
     * The field/property in the event based on which you want to filter.
     * 
     */
    @Import(name="key")
      private final @Nullable Output<String> key;

    public Output<String> getKey() {
        return this.key == null ? Output.empty() : this.key;
    }

    /**
     * The operator type used for filtering, e.g., NumberIn, StringContains, BoolEquals and others.
     * Expected value is 'NumberIn'.
     * 
     */
    @Import(name="operatorType", required=true)
      private final Output<String> operatorType;

    public Output<String> getOperatorType() {
        return this.operatorType;
    }

    /**
     * The set of filter values.
     * 
     */
    @Import(name="values")
      private final @Nullable Output<List<Double>> values;

    public Output<List<Double>> getValues() {
        return this.values == null ? Output.empty() : this.values;
    }

    public NumberInAdvancedFilterArgs(
        @Nullable Output<String> key,
        Output<String> operatorType,
        @Nullable Output<List<Double>> values) {
        this.key = key;
        this.operatorType = Objects.requireNonNull(operatorType, "expected parameter 'operatorType' to be non-null");
        this.values = values;
    }

    private NumberInAdvancedFilterArgs() {
        this.key = Output.empty();
        this.operatorType = Output.empty();
        this.values = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NumberInAdvancedFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> key;
        private Output<String> operatorType;
        private @Nullable Output<List<Double>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(NumberInAdvancedFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.operatorType = defaults.operatorType;
    	      this.values = defaults.values;
        }

        public Builder key(@Nullable Output<String> key) {
            this.key = key;
            return this;
        }

        public Builder key(@Nullable String key) {
            this.key = Output.ofNullable(key);
            return this;
        }

        public Builder operatorType(Output<String> operatorType) {
            this.operatorType = Objects.requireNonNull(operatorType);
            return this;
        }

        public Builder operatorType(String operatorType) {
            this.operatorType = Output.of(Objects.requireNonNull(operatorType));
            return this;
        }

        public Builder values(@Nullable Output<List<Double>> values) {
            this.values = values;
            return this;
        }

        public Builder values(@Nullable List<Double> values) {
            this.values = Output.ofNullable(values);
            return this;
        }
        public NumberInAdvancedFilterArgs build() {
            return new NumberInAdvancedFilterArgs(key, operatorType, values);
        }
    }
}
