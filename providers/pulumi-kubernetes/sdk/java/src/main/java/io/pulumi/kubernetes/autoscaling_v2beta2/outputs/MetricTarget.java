// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2beta2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MetricTarget {
    /**
     * averageUtilization is the target value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods. Currently only valid for Resource metric source type
     * 
     */
    private final @Nullable Integer averageUtilization;
    /**
     * averageValue is the target value of the average of the metric across all relevant pods (as a quantity)
     * 
     */
    private final @Nullable String averageValue;
    /**
     * type represents whether the metric type is Utilization, Value, or AverageValue
     * 
     */
    private final String type;
    /**
     * value is the target value of the metric (as a quantity).
     * 
     */
    private final @Nullable String value;

    @OutputCustomType.Constructor({"averageUtilization","averageValue","type","value"})
    private MetricTarget(
        @Nullable Integer averageUtilization,
        @Nullable String averageValue,
        String type,
        @Nullable String value) {
        this.averageUtilization = averageUtilization;
        this.averageValue = averageValue;
        this.type = Objects.requireNonNull(type);
        this.value = value;
    }

    /**
     * averageUtilization is the target value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods. Currently only valid for Resource metric source type
     * 
     */
    public Optional<Integer> getAverageUtilization() {
        return Optional.ofNullable(this.averageUtilization);
    }
    /**
     * averageValue is the target value of the average of the metric across all relevant pods (as a quantity)
     * 
     */
    public Optional<String> getAverageValue() {
        return Optional.ofNullable(this.averageValue);
    }
    /**
     * type represents whether the metric type is Utilization, Value, or AverageValue
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * value is the target value of the metric (as a quantity).
     * 
     */
    public Optional<String> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricTarget defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer averageUtilization;
        private @Nullable String averageValue;
        private String type;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.averageUtilization = defaults.averageUtilization;
    	      this.averageValue = defaults.averageValue;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder setAverageUtilization(@Nullable Integer averageUtilization) {
            this.averageUtilization = averageUtilization;
            return this;
        }

        public Builder setAverageValue(@Nullable String averageValue) {
            this.averageValue = averageValue;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = value;
            return this;
        }
        public MetricTarget build() {
            return new MetricTarget(averageUtilization, averageValue, type, value);
        }
    }
}
