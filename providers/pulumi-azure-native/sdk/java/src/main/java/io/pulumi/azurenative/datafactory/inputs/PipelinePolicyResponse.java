// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.PipelineElapsedTimeMetricPolicyResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Pipeline Policy.
 * 
 */
public final class PipelinePolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final PipelinePolicyResponse Empty = new PipelinePolicyResponse();

    /**
     * Pipeline ElapsedTime Metric Policy.
     * 
     */
    @InputImport(name="elapsedTimeMetric")
        private final @Nullable PipelineElapsedTimeMetricPolicyResponse elapsedTimeMetric;

    public Optional<PipelineElapsedTimeMetricPolicyResponse> getElapsedTimeMetric() {
        return this.elapsedTimeMetric == null ? Optional.empty() : Optional.ofNullable(this.elapsedTimeMetric);
    }

    public PipelinePolicyResponse(@Nullable PipelineElapsedTimeMetricPolicyResponse elapsedTimeMetric) {
        this.elapsedTimeMetric = elapsedTimeMetric;
    }

    private PipelinePolicyResponse() {
        this.elapsedTimeMetric = null;
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
