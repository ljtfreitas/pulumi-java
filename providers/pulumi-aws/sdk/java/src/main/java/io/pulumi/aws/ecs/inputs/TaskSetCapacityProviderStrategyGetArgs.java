// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="base")
      private final @Nullable Output<Integer> base;

    public Output<Integer> getBase() {
        return this.base == null ? Output.empty() : this.base;
    }

    /**
     * The short name or full Amazon Resource Name (ARN) of the capacity provider.
     * 
     */
    @Import(name="capacityProvider", required=true)
      private final Output<String> capacityProvider;

    public Output<String> getCapacityProvider() {
        return this.capacityProvider;
    }

    /**
     * The relative percentage of the total number of launched tasks that should use the specified capacity provider.
     * 
     */
    @Import(name="weight", required=true)
      private final Output<Integer> weight;

    public Output<Integer> getWeight() {
        return this.weight;
    }

    public TaskSetCapacityProviderStrategyGetArgs(
        @Nullable Output<Integer> base,
        Output<String> capacityProvider,
        Output<Integer> weight) {
        this.base = base;
        this.capacityProvider = Objects.requireNonNull(capacityProvider, "expected parameter 'capacityProvider' to be non-null");
        this.weight = Objects.requireNonNull(weight, "expected parameter 'weight' to be non-null");
    }

    private TaskSetCapacityProviderStrategyGetArgs() {
        this.base = Output.empty();
        this.capacityProvider = Output.empty();
        this.weight = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskSetCapacityProviderStrategyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> base;
        private Output<String> capacityProvider;
        private Output<Integer> weight;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskSetCapacityProviderStrategyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.base = defaults.base;
    	      this.capacityProvider = defaults.capacityProvider;
    	      this.weight = defaults.weight;
        }

        public Builder base(@Nullable Output<Integer> base) {
            this.base = base;
            return this;
        }

        public Builder base(@Nullable Integer base) {
            this.base = Output.ofNullable(base);
            return this;
        }

        public Builder capacityProvider(Output<String> capacityProvider) {
            this.capacityProvider = Objects.requireNonNull(capacityProvider);
            return this;
        }

        public Builder capacityProvider(String capacityProvider) {
            this.capacityProvider = Output.of(Objects.requireNonNull(capacityProvider));
            return this;
        }

        public Builder weight(Output<Integer> weight) {
            this.weight = Objects.requireNonNull(weight);
            return this;
        }

        public Builder weight(Integer weight) {
            this.weight = Output.of(Objects.requireNonNull(weight));
            return this;
        }
        public TaskSetCapacityProviderStrategyGetArgs build() {
            return new TaskSetCapacityProviderStrategyGetArgs(base, capacityProvider, weight);
        }
    }
}
