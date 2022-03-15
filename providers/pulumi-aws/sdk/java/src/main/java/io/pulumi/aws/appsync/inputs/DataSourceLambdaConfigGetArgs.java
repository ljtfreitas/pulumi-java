// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DataSourceLambdaConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceLambdaConfigGetArgs Empty = new DataSourceLambdaConfigGetArgs();

    /**
     * The ARN for the Lambda function.
     * 
     */
    @Import(name="functionArn", required=true)
      private final Output<String> functionArn;

    public Output<String> getFunctionArn() {
        return this.functionArn;
    }

    public DataSourceLambdaConfigGetArgs(Output<String> functionArn) {
        this.functionArn = Objects.requireNonNull(functionArn, "expected parameter 'functionArn' to be non-null");
    }

    private DataSourceLambdaConfigGetArgs() {
        this.functionArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceLambdaConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> functionArn;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceLambdaConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.functionArn = defaults.functionArn;
        }

        public Builder functionArn(Output<String> functionArn) {
            this.functionArn = Objects.requireNonNull(functionArn);
            return this;
        }

        public Builder functionArn(String functionArn) {
            this.functionArn = Output.of(Objects.requireNonNull(functionArn));
            return this;
        }
        public DataSourceLambdaConfigGetArgs build() {
            return new DataSourceLambdaConfigGetArgs(functionArn);
        }
    }
}
