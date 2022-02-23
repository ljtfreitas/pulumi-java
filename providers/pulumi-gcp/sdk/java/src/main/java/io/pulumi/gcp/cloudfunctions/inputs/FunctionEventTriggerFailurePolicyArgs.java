// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudfunctions.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


public final class FunctionEventTriggerFailurePolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final FunctionEventTriggerFailurePolicyArgs Empty = new FunctionEventTriggerFailurePolicyArgs();

    /**
     * Whether the function should be retried on failure. Defaults to `false`.
     * 
     */
    @InputImport(name="retry", required=true)
        private final Input<Boolean> retry;

    public Input<Boolean> getRetry() {
        return this.retry;
    }

    public FunctionEventTriggerFailurePolicyArgs(Input<Boolean> retry) {
        this.retry = Objects.requireNonNull(retry, "expected parameter 'retry' to be non-null");
    }

    private FunctionEventTriggerFailurePolicyArgs() {
        this.retry = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionEventTriggerFailurePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> retry;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionEventTriggerFailurePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.retry = defaults.retry;
        }

        public Builder setRetry(Input<Boolean> retry) {
            this.retry = Objects.requireNonNull(retry);
            return this;
        }

        public Builder setRetry(Boolean retry) {
            this.retry = Input.of(Objects.requireNonNull(retry));
            return this;
        }
        public FunctionEventTriggerFailurePolicyArgs build() {
            return new FunctionEventTriggerFailurePolicyArgs(retry);
        }
    }
}
