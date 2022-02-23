// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda.outputs;

import io.pulumi.aws.lambda.outputs.FunctionEventInvokeConfigDestinationConfigOnFailure;
import io.pulumi.aws.lambda.outputs.FunctionEventInvokeConfigDestinationConfigOnSuccess;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FunctionEventInvokeConfigDestinationConfig {
    /**
     * Configuration block with destination configuration for failed asynchronous invocations. See below for details.
     * 
     */
    private final @Nullable FunctionEventInvokeConfigDestinationConfigOnFailure onFailure;
    /**
     * Configuration block with destination configuration for successful asynchronous invocations. See below for details.
     * 
     */
    private final @Nullable FunctionEventInvokeConfigDestinationConfigOnSuccess onSuccess;

    @OutputCustomType.Constructor({"onFailure","onSuccess"})
    private FunctionEventInvokeConfigDestinationConfig(
        @Nullable FunctionEventInvokeConfigDestinationConfigOnFailure onFailure,
        @Nullable FunctionEventInvokeConfigDestinationConfigOnSuccess onSuccess) {
        this.onFailure = onFailure;
        this.onSuccess = onSuccess;
    }

    /**
     * Configuration block with destination configuration for failed asynchronous invocations. See below for details.
     * 
     */
    public Optional<FunctionEventInvokeConfigDestinationConfigOnFailure> getOnFailure() {
        return Optional.ofNullable(this.onFailure);
    }
    /**
     * Configuration block with destination configuration for successful asynchronous invocations. See below for details.
     * 
     */
    public Optional<FunctionEventInvokeConfigDestinationConfigOnSuccess> getOnSuccess() {
        return Optional.ofNullable(this.onSuccess);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionEventInvokeConfigDestinationConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FunctionEventInvokeConfigDestinationConfigOnFailure onFailure;
        private @Nullable FunctionEventInvokeConfigDestinationConfigOnSuccess onSuccess;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionEventInvokeConfigDestinationConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.onFailure = defaults.onFailure;
    	      this.onSuccess = defaults.onSuccess;
        }

        public Builder setOnFailure(@Nullable FunctionEventInvokeConfigDestinationConfigOnFailure onFailure) {
            this.onFailure = onFailure;
            return this;
        }

        public Builder setOnSuccess(@Nullable FunctionEventInvokeConfigDestinationConfigOnSuccess onSuccess) {
            this.onSuccess = onSuccess;
            return this;
        }
        public FunctionEventInvokeConfigDestinationConfig build() {
            return new FunctionEventInvokeConfigDestinationConfig(onFailure, onSuccess);
        }
    }
}
