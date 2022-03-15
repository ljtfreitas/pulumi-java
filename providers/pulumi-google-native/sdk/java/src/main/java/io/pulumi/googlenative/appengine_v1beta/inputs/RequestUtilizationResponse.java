// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * Target scaling by request utilization. Only applicable in the App Engine flexible environment.
 * 
 */
public final class RequestUtilizationResponse extends io.pulumi.resources.InvokeArgs {

    public static final RequestUtilizationResponse Empty = new RequestUtilizationResponse();

    /**
     * Target number of concurrent requests.
     * 
     */
    @Import(name="targetConcurrentRequests", required=true)
      private final Integer targetConcurrentRequests;

    public Integer getTargetConcurrentRequests() {
        return this.targetConcurrentRequests;
    }

    /**
     * Target requests per second.
     * 
     */
    @Import(name="targetRequestCountPerSecond", required=true)
      private final Integer targetRequestCountPerSecond;

    public Integer getTargetRequestCountPerSecond() {
        return this.targetRequestCountPerSecond;
    }

    public RequestUtilizationResponse(
        Integer targetConcurrentRequests,
        Integer targetRequestCountPerSecond) {
        this.targetConcurrentRequests = Objects.requireNonNull(targetConcurrentRequests, "expected parameter 'targetConcurrentRequests' to be non-null");
        this.targetRequestCountPerSecond = Objects.requireNonNull(targetRequestCountPerSecond, "expected parameter 'targetRequestCountPerSecond' to be non-null");
    }

    private RequestUtilizationResponse() {
        this.targetConcurrentRequests = null;
        this.targetRequestCountPerSecond = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RequestUtilizationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer targetConcurrentRequests;
        private Integer targetRequestCountPerSecond;

        public Builder() {
    	      // Empty
        }

        public Builder(RequestUtilizationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetConcurrentRequests = defaults.targetConcurrentRequests;
    	      this.targetRequestCountPerSecond = defaults.targetRequestCountPerSecond;
        }

        public Builder targetConcurrentRequests(Integer targetConcurrentRequests) {
            this.targetConcurrentRequests = Objects.requireNonNull(targetConcurrentRequests);
            return this;
        }

        public Builder targetRequestCountPerSecond(Integer targetRequestCountPerSecond) {
            this.targetRequestCountPerSecond = Objects.requireNonNull(targetRequestCountPerSecond);
            return this;
        }
        public RequestUtilizationResponse build() {
            return new RequestUtilizationResponse(targetConcurrentRequests, targetRequestCountPerSecond);
        }
    }
}
