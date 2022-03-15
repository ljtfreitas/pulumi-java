// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class RequestUtilizationResponse {
    /**
     * Target number of concurrent requests.
     * 
     */
    private final Integer targetConcurrentRequests;
    /**
     * Target requests per second.
     * 
     */
    private final Integer targetRequestCountPerSecond;

    @CustomType.Constructor
    private RequestUtilizationResponse(
        @CustomType.Parameter("targetConcurrentRequests") Integer targetConcurrentRequests,
        @CustomType.Parameter("targetRequestCountPerSecond") Integer targetRequestCountPerSecond) {
        this.targetConcurrentRequests = targetConcurrentRequests;
        this.targetRequestCountPerSecond = targetRequestCountPerSecond;
    }

    /**
     * Target number of concurrent requests.
     * 
    */
    public Integer getTargetConcurrentRequests() {
        return this.targetConcurrentRequests;
    }
    /**
     * Target requests per second.
     * 
    */
    public Integer getTargetRequestCountPerSecond() {
        return this.targetRequestCountPerSecond;
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
