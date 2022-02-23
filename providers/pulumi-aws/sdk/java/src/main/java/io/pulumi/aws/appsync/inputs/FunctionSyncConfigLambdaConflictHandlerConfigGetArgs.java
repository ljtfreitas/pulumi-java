// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FunctionSyncConfigLambdaConflictHandlerConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FunctionSyncConfigLambdaConflictHandlerConfigGetArgs Empty = new FunctionSyncConfigLambdaConflictHandlerConfigGetArgs();

    /**
     * The Amazon Resource Name (ARN) for the Lambda function to use as the Conflict Handler.
     * 
     */
    @InputImport(name="lambdaConflictHandlerArn")
    private final @Nullable Input<String> lambdaConflictHandlerArn;

    public Input<String> getLambdaConflictHandlerArn() {
        return this.lambdaConflictHandlerArn == null ? Input.empty() : this.lambdaConflictHandlerArn;
    }

    public FunctionSyncConfigLambdaConflictHandlerConfigGetArgs(@Nullable Input<String> lambdaConflictHandlerArn) {
        this.lambdaConflictHandlerArn = lambdaConflictHandlerArn;
    }

    private FunctionSyncConfigLambdaConflictHandlerConfigGetArgs() {
        this.lambdaConflictHandlerArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionSyncConfigLambdaConflictHandlerConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> lambdaConflictHandlerArn;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionSyncConfigLambdaConflictHandlerConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lambdaConflictHandlerArn = defaults.lambdaConflictHandlerArn;
        }

        public Builder setLambdaConflictHandlerArn(@Nullable Input<String> lambdaConflictHandlerArn) {
            this.lambdaConflictHandlerArn = lambdaConflictHandlerArn;
            return this;
        }

        public Builder setLambdaConflictHandlerArn(@Nullable String lambdaConflictHandlerArn) {
            this.lambdaConflictHandlerArn = Input.ofNullable(lambdaConflictHandlerArn);
            return this;
        }
        public FunctionSyncConfigLambdaConflictHandlerConfigGetArgs build() {
            return new FunctionSyncConfigLambdaConflictHandlerConfigGetArgs(lambdaConflictHandlerArn);
        }
    }
}
