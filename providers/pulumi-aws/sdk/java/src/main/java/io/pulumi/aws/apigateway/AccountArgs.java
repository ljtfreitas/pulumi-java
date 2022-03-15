// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccountArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccountArgs Empty = new AccountArgs();

    /**
     * The ARN of an IAM role for CloudWatch (to allow logging & monitoring). See more [in AWS Docs](https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-stage-settings.html#how-to-stage-settings-console). Logging & monitoring can be enabled/disabled and otherwise tuned on the API Gateway Stage level.
     * 
     */
    @Import(name="cloudwatchRoleArn")
      private final @Nullable Output<String> cloudwatchRoleArn;

    public Output<String> getCloudwatchRoleArn() {
        return this.cloudwatchRoleArn == null ? Output.empty() : this.cloudwatchRoleArn;
    }

    public AccountArgs(@Nullable Output<String> cloudwatchRoleArn) {
        this.cloudwatchRoleArn = cloudwatchRoleArn;
    }

    private AccountArgs() {
        this.cloudwatchRoleArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> cloudwatchRoleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudwatchRoleArn = defaults.cloudwatchRoleArn;
        }

        public Builder cloudwatchRoleArn(@Nullable Output<String> cloudwatchRoleArn) {
            this.cloudwatchRoleArn = cloudwatchRoleArn;
            return this;
        }

        public Builder cloudwatchRoleArn(@Nullable String cloudwatchRoleArn) {
            this.cloudwatchRoleArn = Output.ofNullable(cloudwatchRoleArn);
            return this;
        }
        public AccountArgs build() {
            return new AccountArgs(cloudwatchRoleArn);
        }
    }
}
