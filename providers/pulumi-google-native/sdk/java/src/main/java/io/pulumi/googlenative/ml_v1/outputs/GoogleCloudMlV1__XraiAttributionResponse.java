// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudMlV1__XraiAttributionResponse {
    /**
     * Number of steps for approximating the path integral. A good value to start is 50 and gradually increase until the sum to diff property is met within the desired error range.
     * 
     */
    private final Integer numIntegralSteps;

    @OutputCustomType.Constructor({"numIntegralSteps"})
    private GoogleCloudMlV1__XraiAttributionResponse(Integer numIntegralSteps) {
        this.numIntegralSteps = Objects.requireNonNull(numIntegralSteps);
    }

    /**
     * Number of steps for approximating the path integral. A good value to start is 50 and gradually increase until the sum to diff property is met within the desired error range.
     * 
     */
    public Integer getNumIntegralSteps() {
        return this.numIntegralSteps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__XraiAttributionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer numIntegralSteps;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__XraiAttributionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.numIntegralSteps = defaults.numIntegralSteps;
        }

        public Builder setNumIntegralSteps(Integer numIntegralSteps) {
            this.numIntegralSteps = Objects.requireNonNull(numIntegralSteps);
            return this;
        }
        public GoogleCloudMlV1__XraiAttributionResponse build() {
            return new GoogleCloudMlV1__XraiAttributionResponse(numIntegralSteps);
        }
    }
}
