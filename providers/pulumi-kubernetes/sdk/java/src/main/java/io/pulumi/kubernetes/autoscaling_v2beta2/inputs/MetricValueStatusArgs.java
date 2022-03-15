// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2beta2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * MetricValueStatus holds the current value for a metric
 * 
 */
public final class MetricValueStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetricValueStatusArgs Empty = new MetricValueStatusArgs();

    /**
     * currentAverageUtilization is the current value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods.
     * 
     */
    @Import(name="averageUtilization")
      private final @Nullable Output<Integer> averageUtilization;

    public Output<Integer> getAverageUtilization() {
        return this.averageUtilization == null ? Output.empty() : this.averageUtilization;
    }

    /**
     * averageValue is the current value of the average of the metric across all relevant pods (as a quantity)
     * 
     */
    @Import(name="averageValue")
      private final @Nullable Output<String> averageValue;

    public Output<String> getAverageValue() {
        return this.averageValue == null ? Output.empty() : this.averageValue;
    }

    /**
     * value is the current value of the metric (as a quantity).
     * 
     */
    @Import(name="value")
      private final @Nullable Output<String> value;

    public Output<String> getValue() {
        return this.value == null ? Output.empty() : this.value;
    }

    public MetricValueStatusArgs(
        @Nullable Output<Integer> averageUtilization,
        @Nullable Output<String> averageValue,
        @Nullable Output<String> value) {
        this.averageUtilization = averageUtilization;
        this.averageValue = averageValue;
        this.value = value;
    }

    private MetricValueStatusArgs() {
        this.averageUtilization = Output.empty();
        this.averageValue = Output.empty();
        this.value = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricValueStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> averageUtilization;
        private @Nullable Output<String> averageValue;
        private @Nullable Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricValueStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.averageUtilization = defaults.averageUtilization;
    	      this.averageValue = defaults.averageValue;
    	      this.value = defaults.value;
        }

        public Builder averageUtilization(@Nullable Output<Integer> averageUtilization) {
            this.averageUtilization = averageUtilization;
            return this;
        }

        public Builder averageUtilization(@Nullable Integer averageUtilization) {
            this.averageUtilization = Output.ofNullable(averageUtilization);
            return this;
        }

        public Builder averageValue(@Nullable Output<String> averageValue) {
            this.averageValue = averageValue;
            return this;
        }

        public Builder averageValue(@Nullable String averageValue) {
            this.averageValue = Output.ofNullable(averageValue);
            return this;
        }

        public Builder value(@Nullable Output<String> value) {
            this.value = value;
            return this;
        }

        public Builder value(@Nullable String value) {
            this.value = Output.ofNullable(value);
            return this;
        }
        public MetricValueStatusArgs build() {
            return new MetricValueStatusArgs(averageUtilization, averageValue, value);
        }
    }
}
