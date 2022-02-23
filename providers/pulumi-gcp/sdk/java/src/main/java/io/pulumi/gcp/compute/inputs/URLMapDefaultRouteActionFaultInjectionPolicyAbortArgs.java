// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class URLMapDefaultRouteActionFaultInjectionPolicyAbortArgs extends io.pulumi.resources.ResourceArgs {

    public static final URLMapDefaultRouteActionFaultInjectionPolicyAbortArgs Empty = new URLMapDefaultRouteActionFaultInjectionPolicyAbortArgs();

    /**
     * The HTTP status code used to abort the request.
     * The value must be between 200 and 599 inclusive.
     * 
     */
    @InputImport(name="httpStatus")
        private final @Nullable Input<Integer> httpStatus;

    public Input<Integer> getHttpStatus() {
        return this.httpStatus == null ? Input.empty() : this.httpStatus;
    }

    /**
     * The percentage of traffic (connections/operations/requests) which will be aborted as part of fault injection.
     * The value must be between 0.0 and 100.0 inclusive.
     * 
     */
    @InputImport(name="percentage")
        private final @Nullable Input<Double> percentage;

    public Input<Double> getPercentage() {
        return this.percentage == null ? Input.empty() : this.percentage;
    }

    public URLMapDefaultRouteActionFaultInjectionPolicyAbortArgs(
        @Nullable Input<Integer> httpStatus,
        @Nullable Input<Double> percentage) {
        this.httpStatus = httpStatus;
        this.percentage = percentage;
    }

    private URLMapDefaultRouteActionFaultInjectionPolicyAbortArgs() {
        this.httpStatus = Input.empty();
        this.percentage = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapDefaultRouteActionFaultInjectionPolicyAbortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> httpStatus;
        private @Nullable Input<Double> percentage;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapDefaultRouteActionFaultInjectionPolicyAbortArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpStatus = defaults.httpStatus;
    	      this.percentage = defaults.percentage;
        }

        public Builder setHttpStatus(@Nullable Input<Integer> httpStatus) {
            this.httpStatus = httpStatus;
            return this;
        }

        public Builder setHttpStatus(@Nullable Integer httpStatus) {
            this.httpStatus = Input.ofNullable(httpStatus);
            return this;
        }

        public Builder setPercentage(@Nullable Input<Double> percentage) {
            this.percentage = percentage;
            return this;
        }

        public Builder setPercentage(@Nullable Double percentage) {
            this.percentage = Input.ofNullable(percentage);
            return this;
        }
        public URLMapDefaultRouteActionFaultInjectionPolicyAbortArgs build() {
            return new URLMapDefaultRouteActionFaultInjectionPolicyAbortArgs(httpStatus, percentage);
        }
    }
}
