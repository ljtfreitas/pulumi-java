// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudfunctions_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.cloudfunctions_v1.inputs.RetryArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FailurePolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final FailurePolicyArgs Empty = new FailurePolicyArgs();

    @InputImport(name="retry")
    private final @Nullable Input<RetryArgs> retry;

    public Input<RetryArgs> getRetry() {
        return this.retry == null ? Input.empty() : this.retry;
    }

    public FailurePolicyArgs(@Nullable Input<RetryArgs> retry) {
        this.retry = retry;
    }

    private FailurePolicyArgs() {
        this.retry = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FailurePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RetryArgs> retry;

        public Builder() {
    	      // Empty
        }

        public Builder(FailurePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.retry = defaults.retry;
        }

        public Builder setRetry(@Nullable Input<RetryArgs> retry) {
            this.retry = retry;
            return this;
        }

        public Builder setRetry(@Nullable RetryArgs retry) {
            this.retry = Input.ofNullable(retry);
            return this;
        }

        public FailurePolicyArgs build() {
            return new FailurePolicyArgs(retry);
        }
    }
}