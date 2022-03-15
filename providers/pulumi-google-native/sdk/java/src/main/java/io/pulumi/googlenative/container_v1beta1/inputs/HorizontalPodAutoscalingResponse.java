// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Configuration options for the horizontal pod autoscaling feature, which increases or decreases the number of replica pods a replication controller has based on the resource usage of the existing pods.
 * 
 */
public final class HorizontalPodAutoscalingResponse extends io.pulumi.resources.InvokeArgs {

    public static final HorizontalPodAutoscalingResponse Empty = new HorizontalPodAutoscalingResponse();

    /**
     * Whether the Horizontal Pod Autoscaling feature is enabled in the cluster. When enabled, it ensures that metrics are collected into Stackdriver Monitoring.
     * 
     */
    @Import(name="disabled", required=true)
      private final Boolean disabled;

    public Boolean getDisabled() {
        return this.disabled;
    }

    public HorizontalPodAutoscalingResponse(Boolean disabled) {
        this.disabled = Objects.requireNonNull(disabled, "expected parameter 'disabled' to be non-null");
    }

    private HorizontalPodAutoscalingResponse() {
        this.disabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HorizontalPodAutoscalingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean disabled;

        public Builder() {
    	      // Empty
        }

        public Builder(HorizontalPodAutoscalingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabled = defaults.disabled;
        }

        public Builder disabled(Boolean disabled) {
            this.disabled = Objects.requireNonNull(disabled);
            return this;
        }
        public HorizontalPodAutoscalingResponse build() {
            return new HorizontalPodAutoscalingResponse(disabled);
        }
    }
}
