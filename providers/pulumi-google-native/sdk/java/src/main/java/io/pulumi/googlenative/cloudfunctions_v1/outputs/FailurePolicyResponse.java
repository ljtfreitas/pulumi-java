// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudfunctions_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.cloudfunctions_v1.outputs.RetryResponse;
import java.util.Objects;

@CustomType
public final class FailurePolicyResponse {
    /**
     * If specified, then the function will be retried in case of a failure.
     * 
     */
    private final RetryResponse retry;

    @CustomType.Constructor
    private FailurePolicyResponse(@CustomType.Parameter("retry") RetryResponse retry) {
        this.retry = retry;
    }

    /**
     * If specified, then the function will be retried in case of a failure.
     * 
    */
    public RetryResponse getRetry() {
        return this.retry;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FailurePolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RetryResponse retry;

        public Builder() {
    	      // Empty
        }

        public Builder(FailurePolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.retry = defaults.retry;
        }

        public Builder retry(RetryResponse retry) {
            this.retry = Objects.requireNonNull(retry);
            return this;
        }
        public FailurePolicyResponse build() {
            return new FailurePolicyResponse(retry);
        }
    }
}
