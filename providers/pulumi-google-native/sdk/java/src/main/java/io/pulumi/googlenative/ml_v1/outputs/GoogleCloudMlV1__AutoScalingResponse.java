// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.ml_v1.outputs.GoogleCloudMlV1__MetricSpecResponse;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudMlV1__AutoScalingResponse {
    private final Integer maxNodes;
    private final List<GoogleCloudMlV1__MetricSpecResponse> metrics;
    private final Integer minNodes;

    @OutputCustomType.Constructor({"maxNodes","metrics","minNodes"})
    private GoogleCloudMlV1__AutoScalingResponse(
        Integer maxNodes,
        List<GoogleCloudMlV1__MetricSpecResponse> metrics,
        Integer minNodes) {
        this.maxNodes = Objects.requireNonNull(maxNodes);
        this.metrics = Objects.requireNonNull(metrics);
        this.minNodes = Objects.requireNonNull(minNodes);
    }

    public Integer getMaxNodes() {
        return this.maxNodes;
    }
    public List<GoogleCloudMlV1__MetricSpecResponse> getMetrics() {
        return this.metrics;
    }
    public Integer getMinNodes() {
        return this.minNodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__AutoScalingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxNodes;
        private List<GoogleCloudMlV1__MetricSpecResponse> metrics;
        private Integer minNodes;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__AutoScalingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxNodes = defaults.maxNodes;
    	      this.metrics = defaults.metrics;
    	      this.minNodes = defaults.minNodes;
        }

        public Builder setMaxNodes(Integer maxNodes) {
            this.maxNodes = Objects.requireNonNull(maxNodes);
            return this;
        }

        public Builder setMetrics(List<GoogleCloudMlV1__MetricSpecResponse> metrics) {
            this.metrics = Objects.requireNonNull(metrics);
            return this;
        }

        public Builder setMinNodes(Integer minNodes) {
            this.minNodes = Objects.requireNonNull(minNodes);
            return this;
        }

        public GoogleCloudMlV1__AutoScalingResponse build() {
            return new GoogleCloudMlV1__AutoScalingResponse(maxNodes, metrics, minNodes);
        }
    }
}