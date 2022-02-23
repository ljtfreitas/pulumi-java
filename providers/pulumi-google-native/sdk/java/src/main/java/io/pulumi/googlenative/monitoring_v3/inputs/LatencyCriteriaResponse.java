// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Parameters for a latency threshold SLI.
 * 
 */
public final class LatencyCriteriaResponse extends io.pulumi.resources.InvokeArgs {

    public static final LatencyCriteriaResponse Empty = new LatencyCriteriaResponse();

    /**
     * Good service is defined to be the count of requests made to this service that return in no more than threshold.
     * 
     */
    @InputImport(name="threshold", required=true)
      private final String threshold;

    public String getThreshold() {
        return this.threshold;
    }

    public LatencyCriteriaResponse(String threshold) {
        this.threshold = Objects.requireNonNull(threshold, "expected parameter 'threshold' to be non-null");
    }

    private LatencyCriteriaResponse() {
        this.threshold = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LatencyCriteriaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String threshold;

        public Builder() {
    	      // Empty
        }

        public Builder(LatencyCriteriaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.threshold = defaults.threshold;
        }

        public Builder setThreshold(String threshold) {
            this.threshold = Objects.requireNonNull(threshold);
            return this;
        }
        public LatencyCriteriaResponse build() {
            return new LatencyCriteriaResponse(threshold);
        }
    }
}
