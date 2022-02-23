// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda.inputs;

import io.pulumi.aws.lambda.inputs.FunctionEventInvokeConfigDestinationConfigOnFailureArgs;
import io.pulumi.aws.lambda.inputs.FunctionEventInvokeConfigDestinationConfigOnSuccessArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FunctionEventInvokeConfigDestinationConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final FunctionEventInvokeConfigDestinationConfigArgs Empty = new FunctionEventInvokeConfigDestinationConfigArgs();

    /**
     * Configuration block with destination configuration for failed asynchronous invocations. See below for details.
     * 
     */
    @InputImport(name="onFailure")
    private final @Nullable Input<FunctionEventInvokeConfigDestinationConfigOnFailureArgs> onFailure;

    public Input<FunctionEventInvokeConfigDestinationConfigOnFailureArgs> getOnFailure() {
        return this.onFailure == null ? Input.empty() : this.onFailure;
    }

    /**
     * Configuration block with destination configuration for successful asynchronous invocations. See below for details.
     * 
     */
    @InputImport(name="onSuccess")
    private final @Nullable Input<FunctionEventInvokeConfigDestinationConfigOnSuccessArgs> onSuccess;

    public Input<FunctionEventInvokeConfigDestinationConfigOnSuccessArgs> getOnSuccess() {
        return this.onSuccess == null ? Input.empty() : this.onSuccess;
    }

    public FunctionEventInvokeConfigDestinationConfigArgs(
        @Nullable Input<FunctionEventInvokeConfigDestinationConfigOnFailureArgs> onFailure,
        @Nullable Input<FunctionEventInvokeConfigDestinationConfigOnSuccessArgs> onSuccess) {
        this.onFailure = onFailure;
        this.onSuccess = onSuccess;
    }

    private FunctionEventInvokeConfigDestinationConfigArgs() {
        this.onFailure = Input.empty();
        this.onSuccess = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionEventInvokeConfigDestinationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<FunctionEventInvokeConfigDestinationConfigOnFailureArgs> onFailure;
        private @Nullable Input<FunctionEventInvokeConfigDestinationConfigOnSuccessArgs> onSuccess;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionEventInvokeConfigDestinationConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.onFailure = defaults.onFailure;
    	      this.onSuccess = defaults.onSuccess;
        }

        public Builder setOnFailure(@Nullable Input<FunctionEventInvokeConfigDestinationConfigOnFailureArgs> onFailure) {
            this.onFailure = onFailure;
            return this;
        }

        public Builder setOnFailure(@Nullable FunctionEventInvokeConfigDestinationConfigOnFailureArgs onFailure) {
            this.onFailure = Input.ofNullable(onFailure);
            return this;
        }

        public Builder setOnSuccess(@Nullable Input<FunctionEventInvokeConfigDestinationConfigOnSuccessArgs> onSuccess) {
            this.onSuccess = onSuccess;
            return this;
        }

        public Builder setOnSuccess(@Nullable FunctionEventInvokeConfigDestinationConfigOnSuccessArgs onSuccess) {
            this.onSuccess = Input.ofNullable(onSuccess);
            return this;
        }
        public FunctionEventInvokeConfigDestinationConfigArgs build() {
            return new FunctionEventInvokeConfigDestinationConfigArgs(onFailure, onSuccess);
        }
    }
}