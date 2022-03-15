// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EndpointConfigurationAsyncInferenceConfigClientConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointConfigurationAsyncInferenceConfigClientConfigArgs Empty = new EndpointConfigurationAsyncInferenceConfigClientConfigArgs();

    /**
     * The maximum number of concurrent requests sent by the SageMaker client to the model container. If no value is provided, Amazon SageMaker will choose an optimal value for you.
     * 
     */
    @Import(name="maxConcurrentInvocationsPerInstance")
      private final @Nullable Output<Integer> maxConcurrentInvocationsPerInstance;

    public Output<Integer> getMaxConcurrentInvocationsPerInstance() {
        return this.maxConcurrentInvocationsPerInstance == null ? Output.empty() : this.maxConcurrentInvocationsPerInstance;
    }

    public EndpointConfigurationAsyncInferenceConfigClientConfigArgs(@Nullable Output<Integer> maxConcurrentInvocationsPerInstance) {
        this.maxConcurrentInvocationsPerInstance = maxConcurrentInvocationsPerInstance;
    }

    private EndpointConfigurationAsyncInferenceConfigClientConfigArgs() {
        this.maxConcurrentInvocationsPerInstance = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointConfigurationAsyncInferenceConfigClientConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> maxConcurrentInvocationsPerInstance;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointConfigurationAsyncInferenceConfigClientConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxConcurrentInvocationsPerInstance = defaults.maxConcurrentInvocationsPerInstance;
        }

        public Builder maxConcurrentInvocationsPerInstance(@Nullable Output<Integer> maxConcurrentInvocationsPerInstance) {
            this.maxConcurrentInvocationsPerInstance = maxConcurrentInvocationsPerInstance;
            return this;
        }

        public Builder maxConcurrentInvocationsPerInstance(@Nullable Integer maxConcurrentInvocationsPerInstance) {
            this.maxConcurrentInvocationsPerInstance = Output.ofNullable(maxConcurrentInvocationsPerInstance);
            return this;
        }
        public EndpointConfigurationAsyncInferenceConfigClientConfigArgs build() {
            return new EndpointConfigurationAsyncInferenceConfigClientConfigArgs(maxConcurrentInvocationsPerInstance);
        }
    }
}
