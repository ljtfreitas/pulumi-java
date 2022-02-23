// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.enums.SchedulingNodeAffinityOperator;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Node Affinity: the configuration of desired nodes onto which this Instance could be scheduled.
 * 
 */
public final class SchedulingNodeAffinityArgs extends io.pulumi.resources.ResourceArgs {

    public static final SchedulingNodeAffinityArgs Empty = new SchedulingNodeAffinityArgs();

    /**
     * Corresponds to the label key of Node resource.
     * 
     */
    @InputImport(name="key")
      private final @Nullable Input<String> key;

    public Input<String> getKey() {
        return this.key == null ? Input.empty() : this.key;
    }

    /**
     * Defines the operation of node selection. Valid operators are IN for affinity and NOT_IN for anti-affinity.
     * 
     */
    @InputImport(name="operator")
      private final @Nullable Input<SchedulingNodeAffinityOperator> operator;

    public Input<SchedulingNodeAffinityOperator> getOperator() {
        return this.operator == null ? Input.empty() : this.operator;
    }

    /**
     * Corresponds to the label values of Node resource.
     * 
     */
    @InputImport(name="values")
      private final @Nullable Input<List<String>> values;

    public Input<List<String>> getValues() {
        return this.values == null ? Input.empty() : this.values;
    }

    public SchedulingNodeAffinityArgs(
        @Nullable Input<String> key,
        @Nullable Input<SchedulingNodeAffinityOperator> operator,
        @Nullable Input<List<String>> values) {
        this.key = key;
        this.operator = operator;
        this.values = values;
    }

    private SchedulingNodeAffinityArgs() {
        this.key = Input.empty();
        this.operator = Input.empty();
        this.values = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchedulingNodeAffinityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> key;
        private @Nullable Input<SchedulingNodeAffinityOperator> operator;
        private @Nullable Input<List<String>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(SchedulingNodeAffinityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.operator = defaults.operator;
    	      this.values = defaults.values;
        }

        public Builder setKey(@Nullable Input<String> key) {
            this.key = key;
            return this;
        }

        public Builder setKey(@Nullable String key) {
            this.key = Input.ofNullable(key);
            return this;
        }

        public Builder setOperator(@Nullable Input<SchedulingNodeAffinityOperator> operator) {
            this.operator = operator;
            return this;
        }

        public Builder setOperator(@Nullable SchedulingNodeAffinityOperator operator) {
            this.operator = Input.ofNullable(operator);
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
        public SchedulingNodeAffinityArgs build() {
            return new SchedulingNodeAffinityArgs(key, operator, values);
        }
    }
}
