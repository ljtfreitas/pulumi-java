// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Round-Robin load balancing settings for a backend pool
 * 
 */
public final class LoadBalancingSettingsParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final LoadBalancingSettingsParametersArgs Empty = new LoadBalancingSettingsParametersArgs();

    /**
     * The additional latency in milliseconds for probes to fall into the lowest latency bucket
     * 
     */
    @InputImport(name="additionalLatencyInMilliseconds")
        private final @Nullable Input<Integer> additionalLatencyInMilliseconds;

    public Input<Integer> getAdditionalLatencyInMilliseconds() {
        return this.additionalLatencyInMilliseconds == null ? Input.empty() : this.additionalLatencyInMilliseconds;
    }

    /**
     * The number of samples to consider for load balancing decisions
     * 
     */
    @InputImport(name="sampleSize")
        private final @Nullable Input<Integer> sampleSize;

    public Input<Integer> getSampleSize() {
        return this.sampleSize == null ? Input.empty() : this.sampleSize;
    }

    /**
     * The number of samples within the sample period that must succeed
     * 
     */
    @InputImport(name="successfulSamplesRequired")
        private final @Nullable Input<Integer> successfulSamplesRequired;

    public Input<Integer> getSuccessfulSamplesRequired() {
        return this.successfulSamplesRequired == null ? Input.empty() : this.successfulSamplesRequired;
    }

    public LoadBalancingSettingsParametersArgs(
        @Nullable Input<Integer> additionalLatencyInMilliseconds,
        @Nullable Input<Integer> sampleSize,
        @Nullable Input<Integer> successfulSamplesRequired) {
        this.additionalLatencyInMilliseconds = additionalLatencyInMilliseconds;
        this.sampleSize = sampleSize;
        this.successfulSamplesRequired = successfulSamplesRequired;
    }

    private LoadBalancingSettingsParametersArgs() {
        this.additionalLatencyInMilliseconds = Input.empty();
        this.sampleSize = Input.empty();
        this.successfulSamplesRequired = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancingSettingsParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> additionalLatencyInMilliseconds;
        private @Nullable Input<Integer> sampleSize;
        private @Nullable Input<Integer> successfulSamplesRequired;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancingSettingsParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalLatencyInMilliseconds = defaults.additionalLatencyInMilliseconds;
    	      this.sampleSize = defaults.sampleSize;
    	      this.successfulSamplesRequired = defaults.successfulSamplesRequired;
        }

        public Builder setAdditionalLatencyInMilliseconds(@Nullable Input<Integer> additionalLatencyInMilliseconds) {
            this.additionalLatencyInMilliseconds = additionalLatencyInMilliseconds;
            return this;
        }

        public Builder setAdditionalLatencyInMilliseconds(@Nullable Integer additionalLatencyInMilliseconds) {
            this.additionalLatencyInMilliseconds = Input.ofNullable(additionalLatencyInMilliseconds);
            return this;
        }

        public Builder setSampleSize(@Nullable Input<Integer> sampleSize) {
            this.sampleSize = sampleSize;
            return this;
        }

        public Builder setSampleSize(@Nullable Integer sampleSize) {
            this.sampleSize = Input.ofNullable(sampleSize);
            return this;
        }

        public Builder setSuccessfulSamplesRequired(@Nullable Input<Integer> successfulSamplesRequired) {
            this.successfulSamplesRequired = successfulSamplesRequired;
            return this;
        }

        public Builder setSuccessfulSamplesRequired(@Nullable Integer successfulSamplesRequired) {
            this.successfulSamplesRequired = Input.ofNullable(successfulSamplesRequired);
            return this;
        }
        public LoadBalancingSettingsParametersArgs build() {
            return new LoadBalancingSettingsParametersArgs(additionalLatencyInMilliseconds, sampleSize, successfulSamplesRequired);
        }
    }
}
