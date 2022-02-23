// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class AliasRoutingConfig {
    /**
     * A map that defines the proportion of events that should be sent to different versions of a lambda function.
     * 
     */
    private final @Nullable Map<String,Double> additionalVersionWeights;

    @OutputCustomType.Constructor({"additionalVersionWeights"})
    private AliasRoutingConfig(@Nullable Map<String,Double> additionalVersionWeights) {
        this.additionalVersionWeights = additionalVersionWeights;
    }

    /**
     * A map that defines the proportion of events that should be sent to different versions of a lambda function.
     * 
     */
    public Map<String,Double> getAdditionalVersionWeights() {
        return this.additionalVersionWeights == null ? Map.of() : this.additionalVersionWeights;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AliasRoutingConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,Double> additionalVersionWeights;

        public Builder() {
    	      // Empty
        }

        public Builder(AliasRoutingConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalVersionWeights = defaults.additionalVersionWeights;
        }

        public Builder setAdditionalVersionWeights(@Nullable Map<String,Double> additionalVersionWeights) {
            this.additionalVersionWeights = additionalVersionWeights;
            return this;
        }
        public AliasRoutingConfig build() {
            return new AliasRoutingConfig(additionalVersionWeights);
        }
    }
}
