// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BotAliasLambdaCodeHook {
    /**
     * The version of the request-response that you want Amazon Lex to use to invoke your Lambda function.
     * 
     */
    private final String codeHookInterfaceVersion;
    /**
     * The Amazon Resource Name (ARN) of the Lambda function.
     * 
     */
    private final String lambdaArn;

    @OutputCustomType.Constructor({"codeHookInterfaceVersion","lambdaArn"})
    private BotAliasLambdaCodeHook(
        String codeHookInterfaceVersion,
        String lambdaArn) {
        this.codeHookInterfaceVersion = Objects.requireNonNull(codeHookInterfaceVersion);
        this.lambdaArn = Objects.requireNonNull(lambdaArn);
    }

    /**
     * The version of the request-response that you want Amazon Lex to use to invoke your Lambda function.
     * 
     */
    public String getCodeHookInterfaceVersion() {
        return this.codeHookInterfaceVersion;
    }
    /**
     * The Amazon Resource Name (ARN) of the Lambda function.
     * 
     */
    public String getLambdaArn() {
        return this.lambdaArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotAliasLambdaCodeHook defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String codeHookInterfaceVersion;
        private String lambdaArn;

        public Builder() {
    	      // Empty
        }

        public Builder(BotAliasLambdaCodeHook defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.codeHookInterfaceVersion = defaults.codeHookInterfaceVersion;
    	      this.lambdaArn = defaults.lambdaArn;
        }

        public Builder setCodeHookInterfaceVersion(String codeHookInterfaceVersion) {
            this.codeHookInterfaceVersion = Objects.requireNonNull(codeHookInterfaceVersion);
            return this;
        }

        public Builder setLambdaArn(String lambdaArn) {
            this.lambdaArn = Objects.requireNonNull(lambdaArn);
            return this;
        }
        public BotAliasLambdaCodeHook build() {
            return new BotAliasLambdaCodeHook(codeHookInterfaceVersion, lambdaArn);
        }
    }
}
