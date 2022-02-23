// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.PipelineElapsedTimeMetricPolicyResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PipelinePolicyResponse {
    /**
     * Pipeline ElapsedTime Metric Policy.
     * 
     */
    private final @Nullable PipelineElapsedTimeMetricPolicyResponse elapsedTimeMetric;

    @OutputCustomType.Constructor({"elapsedTimeMetric"})
    private PipelinePolicyResponse(@Nullable PipelineElapsedTimeMetricPolicyResponse elapsedTimeMetric) {
        this.elapsedTimeMetric = elapsedTimeMetric;
    }

    /**
     * Pipeline ElapsedTime Metric Policy.
     * 
     */
    public Optional<PipelineElapsedTimeMetricPolicyResponse> getElapsedTimeMetric() {
        return Optional.ofNullable(this.elapsedTimeMetric);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelinePolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable PipelineElapsedTimeMetricPolicyResponse elapsedTimeMetric;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelinePolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.elapsedTimeMetric = defaults.elapsedTimeMetric;
        }

        public Builder setElapsedTimeMetric(@Nullable PipelineElapsedTimeMetricPolicyResponse elapsedTimeMetric) {
            this.elapsedTimeMetric = elapsedTimeMetric;
            return this;
        }
        public PipelinePolicyResponse build() {
            return new PipelinePolicyResponse(elapsedTimeMetric);
        }
    }
}
