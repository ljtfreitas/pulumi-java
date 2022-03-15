// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.outputs;

import io.pulumi.aws.kinesis.outputs.AnalyticsApplicationInputsProcessingConfigurationLambda;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class AnalyticsApplicationInputsProcessingConfiguration {
    /**
     * The Lambda function configuration. See Lambda below for more details.
     * 
     */
    private final AnalyticsApplicationInputsProcessingConfigurationLambda lambda;

    @CustomType.Constructor
    private AnalyticsApplicationInputsProcessingConfiguration(@CustomType.Parameter("lambda") AnalyticsApplicationInputsProcessingConfigurationLambda lambda) {
        this.lambda = lambda;
    }

    /**
     * The Lambda function configuration. See Lambda below for more details.
     * 
    */
    public AnalyticsApplicationInputsProcessingConfigurationLambda getLambda() {
        return this.lambda;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationInputsProcessingConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AnalyticsApplicationInputsProcessingConfigurationLambda lambda;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsApplicationInputsProcessingConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lambda = defaults.lambda;
        }

        public Builder lambda(AnalyticsApplicationInputsProcessingConfigurationLambda lambda) {
            this.lambda = Objects.requireNonNull(lambda);
            return this;
        }
        public AnalyticsApplicationInputsProcessingConfiguration build() {
            return new AnalyticsApplicationInputsProcessingConfiguration(lambda);
        }
    }
}
