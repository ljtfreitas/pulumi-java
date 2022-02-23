// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudMlV1_StudyConfigParameterSpec_IntegerValueSpecResponse {
    /**
     * Must be specified if type is `INTEGER`. Maximum value of the parameter.
     * 
     */
    private final String maxValue;
    /**
     * Must be specified if type is `INTEGER`. Minimum value of the parameter.
     * 
     */
    private final String minValue;

    @OutputCustomType.Constructor({"maxValue","minValue"})
    private GoogleCloudMlV1_StudyConfigParameterSpec_IntegerValueSpecResponse(
        String maxValue,
        String minValue) {
        this.maxValue = Objects.requireNonNull(maxValue);
        this.minValue = Objects.requireNonNull(minValue);
    }

    /**
     * Must be specified if type is `INTEGER`. Maximum value of the parameter.
     * 
     */
    public String getMaxValue() {
        return this.maxValue;
    }
    /**
     * Must be specified if type is `INTEGER`. Minimum value of the parameter.
     * 
     */
    public String getMinValue() {
        return this.minValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1_StudyConfigParameterSpec_IntegerValueSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String maxValue;
        private String minValue;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1_StudyConfigParameterSpec_IntegerValueSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxValue = defaults.maxValue;
    	      this.minValue = defaults.minValue;
        }

        public Builder setMaxValue(String maxValue) {
            this.maxValue = Objects.requireNonNull(maxValue);
            return this;
        }

        public Builder setMinValue(String minValue) {
            this.minValue = Objects.requireNonNull(minValue);
            return this;
        }
        public GoogleCloudMlV1_StudyConfigParameterSpec_IntegerValueSpecResponse build() {
            return new GoogleCloudMlV1_StudyConfigParameterSpec_IntegerValueSpecResponse(maxValue, minValue);
        }
    }
}
