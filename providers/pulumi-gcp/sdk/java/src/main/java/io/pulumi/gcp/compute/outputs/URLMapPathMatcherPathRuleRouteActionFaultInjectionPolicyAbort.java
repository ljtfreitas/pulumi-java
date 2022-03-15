// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbort {
    /**
     * The HTTP status code used to abort the request.
     * The value must be between 200 and 599 inclusive.
     * 
     */
    private final Integer httpStatus;
    /**
     * The percentage of traffic (connections/operations/requests) which will be aborted as part of fault injection.
     * The value must be between 0.0 and 100.0 inclusive.
     * 
     */
    private final Double percentage;

    @CustomType.Constructor
    private URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbort(
        @CustomType.Parameter("httpStatus") Integer httpStatus,
        @CustomType.Parameter("percentage") Double percentage) {
        this.httpStatus = httpStatus;
        this.percentage = percentage;
    }

    /**
     * The HTTP status code used to abort the request.
     * The value must be between 200 and 599 inclusive.
     * 
    */
    public Integer getHttpStatus() {
        return this.httpStatus;
    }
    /**
     * The percentage of traffic (connections/operations/requests) which will be aborted as part of fault injection.
     * The value must be between 0.0 and 100.0 inclusive.
     * 
    */
    public Double getPercentage() {
        return this.percentage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbort defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer httpStatus;
        private Double percentage;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbort defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpStatus = defaults.httpStatus;
    	      this.percentage = defaults.percentage;
        }

        public Builder httpStatus(Integer httpStatus) {
            this.httpStatus = Objects.requireNonNull(httpStatus);
            return this;
        }

        public Builder percentage(Double percentage) {
            this.percentage = Objects.requireNonNull(percentage);
            return this;
        }
        public URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbort build() {
            return new URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbort(httpStatus, percentage);
        }
    }
}
