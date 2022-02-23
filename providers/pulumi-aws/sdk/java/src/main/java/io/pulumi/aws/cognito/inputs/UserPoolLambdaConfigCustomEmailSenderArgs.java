// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class UserPoolLambdaConfigCustomEmailSenderArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserPoolLambdaConfigCustomEmailSenderArgs Empty = new UserPoolLambdaConfigCustomEmailSenderArgs();

    /**
     * The Lambda Amazon Resource Name of the Lambda function that Amazon Cognito triggers to send SMS notifications to users.
     * 
     */
    @InputImport(name="lambdaArn", required=true)
    private final Input<String> lambdaArn;

    public Input<String> getLambdaArn() {
        return this.lambdaArn;
    }

    /**
     * The Lambda version represents the signature of the "request" attribute in the "event" information Amazon Cognito passes to your custom SMS Lambda function. The only supported value is `V1_0`.
     * 
     */
    @InputImport(name="lambdaVersion", required=true)
    private final Input<String> lambdaVersion;

    public Input<String> getLambdaVersion() {
        return this.lambdaVersion;
    }

    public UserPoolLambdaConfigCustomEmailSenderArgs(
        Input<String> lambdaArn,
        Input<String> lambdaVersion) {
        this.lambdaArn = Objects.requireNonNull(lambdaArn, "expected parameter 'lambdaArn' to be non-null");
        this.lambdaVersion = Objects.requireNonNull(lambdaVersion, "expected parameter 'lambdaVersion' to be non-null");
    }

    private UserPoolLambdaConfigCustomEmailSenderArgs() {
        this.lambdaArn = Input.empty();
        this.lambdaVersion = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolLambdaConfigCustomEmailSenderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> lambdaArn;
        private Input<String> lambdaVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPoolLambdaConfigCustomEmailSenderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lambdaArn = defaults.lambdaArn;
    	      this.lambdaVersion = defaults.lambdaVersion;
        }

        public Builder setLambdaArn(Input<String> lambdaArn) {
            this.lambdaArn = Objects.requireNonNull(lambdaArn);
            return this;
        }

        public Builder setLambdaArn(String lambdaArn) {
            this.lambdaArn = Input.of(Objects.requireNonNull(lambdaArn));
            return this;
        }

        public Builder setLambdaVersion(Input<String> lambdaVersion) {
            this.lambdaVersion = Objects.requireNonNull(lambdaVersion);
            return this;
        }

        public Builder setLambdaVersion(String lambdaVersion) {
            this.lambdaVersion = Input.of(Objects.requireNonNull(lambdaVersion));
            return this;
        }
        public UserPoolLambdaConfigCustomEmailSenderArgs build() {
            return new UserPoolLambdaConfigCustomEmailSenderArgs(lambdaArn, lambdaVersion);
        }
    }
}
