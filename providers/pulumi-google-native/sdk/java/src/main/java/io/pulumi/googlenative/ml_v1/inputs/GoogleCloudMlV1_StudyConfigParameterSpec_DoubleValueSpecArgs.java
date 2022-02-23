// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GoogleCloudMlV1_StudyConfigParameterSpec_DoubleValueSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudMlV1_StudyConfigParameterSpec_DoubleValueSpecArgs Empty = new GoogleCloudMlV1_StudyConfigParameterSpec_DoubleValueSpecArgs();

    /**
     * Must be specified if type is `DOUBLE`. Maximum value of the parameter.
     * 
     */
    @InputImport(name="maxValue")
      private final @Nullable Input<Double> maxValue;

    public Input<Double> getMaxValue() {
        return this.maxValue == null ? Input.empty() : this.maxValue;
    }

    /**
     * Must be specified if type is `DOUBLE`. Minimum value of the parameter.
     * 
     */
    @InputImport(name="minValue")
      private final @Nullable Input<Double> minValue;

    public Input<Double> getMinValue() {
        return this.minValue == null ? Input.empty() : this.minValue;
    }

    public GoogleCloudMlV1_StudyConfigParameterSpec_DoubleValueSpecArgs(
        @Nullable Input<Double> maxValue,
        @Nullable Input<Double> minValue) {
        this.maxValue = maxValue;
        this.minValue = minValue;
    }

    private GoogleCloudMlV1_StudyConfigParameterSpec_DoubleValueSpecArgs() {
        this.maxValue = Input.empty();
        this.minValue = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1_StudyConfigParameterSpec_DoubleValueSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Double> maxValue;
        private @Nullable Input<Double> minValue;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1_StudyConfigParameterSpec_DoubleValueSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxValue = defaults.maxValue;
    	      this.minValue = defaults.minValue;
        }

        public Builder setMaxValue(@Nullable Input<Double> maxValue) {
            this.maxValue = maxValue;
            return this;
        }

        public Builder setMaxValue(@Nullable Double maxValue) {
            this.maxValue = Input.ofNullable(maxValue);
            return this;
        }

        public Builder setMinValue(@Nullable Input<Double> minValue) {
            this.minValue = minValue;
            return this;
        }

        public Builder setMinValue(@Nullable Double minValue) {
            this.minValue = Input.ofNullable(minValue);
            return this;
        }
        public GoogleCloudMlV1_StudyConfigParameterSpec_DoubleValueSpecArgs build() {
            return new GoogleCloudMlV1_StudyConfigParameterSpec_DoubleValueSpecArgs(maxValue, minValue);
        }
    }
}
