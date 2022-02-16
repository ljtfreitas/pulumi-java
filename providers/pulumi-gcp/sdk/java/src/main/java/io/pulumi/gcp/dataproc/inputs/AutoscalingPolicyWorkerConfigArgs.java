// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AutoscalingPolicyWorkerConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutoscalingPolicyWorkerConfigArgs Empty = new AutoscalingPolicyWorkerConfigArgs();

    @InputImport(name="maxInstances", required=true)
    private final Input<Integer> maxInstances;

    public Input<Integer> getMaxInstances() {
        return this.maxInstances;
    }

    @InputImport(name="minInstances")
    private final @Nullable Input<Integer> minInstances;

    public Input<Integer> getMinInstances() {
        return this.minInstances == null ? Input.empty() : this.minInstances;
    }

    @InputImport(name="weight")
    private final @Nullable Input<Integer> weight;

    public Input<Integer> getWeight() {
        return this.weight == null ? Input.empty() : this.weight;
    }

    public AutoscalingPolicyWorkerConfigArgs(
        Input<Integer> maxInstances,
        @Nullable Input<Integer> minInstances,
        @Nullable Input<Integer> weight) {
        this.maxInstances = Objects.requireNonNull(maxInstances, "expected parameter 'maxInstances' to be non-null");
        this.minInstances = minInstances;
        this.weight = weight;
    }

    private AutoscalingPolicyWorkerConfigArgs() {
        this.maxInstances = Input.empty();
        this.minInstances = Input.empty();
        this.weight = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalingPolicyWorkerConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> maxInstances;
        private @Nullable Input<Integer> minInstances;
        private @Nullable Input<Integer> weight;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalingPolicyWorkerConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxInstances = defaults.maxInstances;
    	      this.minInstances = defaults.minInstances;
    	      this.weight = defaults.weight;
        }

        public Builder setMaxInstances(Input<Integer> maxInstances) {
            this.maxInstances = Objects.requireNonNull(maxInstances);
            return this;
        }

        public Builder setMaxInstances(Integer maxInstances) {
            this.maxInstances = Input.of(Objects.requireNonNull(maxInstances));
            return this;
        }

        public Builder setMinInstances(@Nullable Input<Integer> minInstances) {
            this.minInstances = minInstances;
            return this;
        }

        public Builder setMinInstances(@Nullable Integer minInstances) {
            this.minInstances = Input.ofNullable(minInstances);
            return this;
        }

        public Builder setWeight(@Nullable Input<Integer> weight) {
            this.weight = weight;
            return this;
        }

        public Builder setWeight(@Nullable Integer weight) {
            this.weight = Input.ofNullable(weight);
            return this;
        }

        public AutoscalingPolicyWorkerConfigArgs build() {
            return new AutoscalingPolicyWorkerConfigArgs(maxInstances, minInstances, weight);
        }
    }
}