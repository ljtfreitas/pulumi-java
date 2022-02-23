// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaskSetCapacityProviderStrategyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskSetCapacityProviderStrategyGetArgs Empty = new TaskSetCapacityProviderStrategyGetArgs();

    /**
     * The number of tasks, at a minimum, to run on the specified capacity provider. Only one capacity provider in a capacity provider strategy can have a base defined.
     * 
     */
    @InputImport(name="base")
    private final @Nullable Input<Integer> base;

    public Input<Integer> getBase() {
        return this.base == null ? Input.empty() : this.base;
    }

    /**
     * The short name or full Amazon Resource Name (ARN) of the capacity provider.
     * 
     */
    @InputImport(name="capacityProvider", required=true)
    private final Input<String> capacityProvider;

    public Input<String> getCapacityProvider() {
        return this.capacityProvider;
    }

    /**
     * The relative percentage of the total number of launched tasks that should use the specified capacity provider.
     * 
     */
    @InputImport(name="weight", required=true)
    private final Input<Integer> weight;

    public Input<Integer> getWeight() {
        return this.weight;
    }

    public TaskSetCapacityProviderStrategyGetArgs(
        @Nullable Input<Integer> base,
        Input<String> capacityProvider,
        Input<Integer> weight) {
        this.base = base;
        this.capacityProvider = Objects.requireNonNull(capacityProvider, "expected parameter 'capacityProvider' to be non-null");
        this.weight = Objects.requireNonNull(weight, "expected parameter 'weight' to be non-null");
    }

    private TaskSetCapacityProviderStrategyGetArgs() {
        this.base = Input.empty();
        this.capacityProvider = Input.empty();
        this.weight = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskSetCapacityProviderStrategyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> base;
        private Input<String> capacityProvider;
        private Input<Integer> weight;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskSetCapacityProviderStrategyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.base = defaults.base;
    	      this.capacityProvider = defaults.capacityProvider;
    	      this.weight = defaults.weight;
        }

        public Builder setBase(@Nullable Input<Integer> base) {
            this.base = base;
            return this;
        }

        public Builder setBase(@Nullable Integer base) {
            this.base = Input.ofNullable(base);
            return this;
        }

        public Builder setCapacityProvider(Input<String> capacityProvider) {
            this.capacityProvider = Objects.requireNonNull(capacityProvider);
            return this;
        }

        public Builder setCapacityProvider(String capacityProvider) {
            this.capacityProvider = Input.of(Objects.requireNonNull(capacityProvider));
            return this;
        }

        public Builder setWeight(Input<Integer> weight) {
            this.weight = Objects.requireNonNull(weight);
            return this;
        }

        public Builder setWeight(Integer weight) {
            this.weight = Input.of(Objects.requireNonNull(weight));
            return this;
        }
        public TaskSetCapacityProviderStrategyGetArgs build() {
            return new TaskSetCapacityProviderStrategyGetArgs(base, capacityProvider, weight);
        }
    }
}
