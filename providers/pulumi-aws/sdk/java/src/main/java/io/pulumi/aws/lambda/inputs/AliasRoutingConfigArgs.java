// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AliasRoutingConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final AliasRoutingConfigArgs Empty = new AliasRoutingConfigArgs();

    /**
     * A map that defines the proportion of events that should be sent to different versions of a lambda function.
     * 
     */
    @Import(name="additionalVersionWeights")
      private final @Nullable Output<Map<String,Double>> additionalVersionWeights;

    public Output<Map<String,Double>> getAdditionalVersionWeights() {
        return this.additionalVersionWeights == null ? Output.empty() : this.additionalVersionWeights;
    }

    public AliasRoutingConfigArgs(@Nullable Output<Map<String,Double>> additionalVersionWeights) {
        this.additionalVersionWeights = additionalVersionWeights;
    }

    private AliasRoutingConfigArgs() {
        this.additionalVersionWeights = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AliasRoutingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,Double>> additionalVersionWeights;

        public Builder() {
    	      // Empty
        }

        public Builder(AliasRoutingConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalVersionWeights = defaults.additionalVersionWeights;
        }

        public Builder additionalVersionWeights(@Nullable Output<Map<String,Double>> additionalVersionWeights) {
            this.additionalVersionWeights = additionalVersionWeights;
            return this;
        }

        public Builder additionalVersionWeights(@Nullable Map<String,Double> additionalVersionWeights) {
            this.additionalVersionWeights = Output.ofNullable(additionalVersionWeights);
            return this;
        }
        public AliasRoutingConfigArgs build() {
            return new AliasRoutingConfigArgs(additionalVersionWeights);
        }
    }
}
