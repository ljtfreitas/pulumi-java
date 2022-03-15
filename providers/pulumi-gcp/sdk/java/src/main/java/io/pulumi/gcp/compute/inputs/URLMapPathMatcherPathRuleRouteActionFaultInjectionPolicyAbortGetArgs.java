// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;


public final class URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbortGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbortGetArgs Empty = new URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbortGetArgs();

    /**
     * The HTTP status code used to abort the request.
     * The value must be between 200 and 599 inclusive.
     * 
     */
    @Import(name="httpStatus", required=true)
      private final Output<Integer> httpStatus;

    public Output<Integer> getHttpStatus() {
        return this.httpStatus;
    }

    /**
     * The percentage of traffic (connections/operations/requests) which will be aborted as part of fault injection.
     * The value must be between 0.0 and 100.0 inclusive.
     * 
     */
    @Import(name="percentage", required=true)
      private final Output<Double> percentage;

    public Output<Double> getPercentage() {
        return this.percentage;
    }

    public URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbortGetArgs(
        Output<Integer> httpStatus,
        Output<Double> percentage) {
        this.httpStatus = Objects.requireNonNull(httpStatus, "expected parameter 'httpStatus' to be non-null");
        this.percentage = Objects.requireNonNull(percentage, "expected parameter 'percentage' to be non-null");
    }

    private URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbortGetArgs() {
        this.httpStatus = Output.empty();
        this.percentage = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbortGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> httpStatus;
        private Output<Double> percentage;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbortGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpStatus = defaults.httpStatus;
    	      this.percentage = defaults.percentage;
        }

        public Builder httpStatus(Output<Integer> httpStatus) {
            this.httpStatus = Objects.requireNonNull(httpStatus);
            return this;
        }

        public Builder httpStatus(Integer httpStatus) {
            this.httpStatus = Output.of(Objects.requireNonNull(httpStatus));
            return this;
        }

        public Builder percentage(Output<Double> percentage) {
            this.percentage = Objects.requireNonNull(percentage);
            return this;
        }

        public Builder percentage(Double percentage) {
            this.percentage = Output.of(Objects.requireNonNull(percentage));
            return this;
        }
        public URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbortGetArgs build() {
            return new URLMapPathMatcherPathRuleRouteActionFaultInjectionPolicyAbortGetArgs(httpStatus, percentage);
        }
    }
}
