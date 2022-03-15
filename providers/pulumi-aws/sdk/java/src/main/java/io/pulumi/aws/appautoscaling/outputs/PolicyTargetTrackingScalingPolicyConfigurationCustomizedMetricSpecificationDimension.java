// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appautoscaling.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension {
    /**
     * The name of the policy. Must be between 1 and 255 characters in length.
     * 
     */
    private final String name;
    /**
     * Value of the dimension.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("value") String value) {
        this.name = name;
        this.value = value;
    }

    /**
     * The name of the policy. Must be between 1 and 255 characters in length.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Value of the dimension.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension build() {
            return new PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecificationDimension(name, value);
        }
    }
}
