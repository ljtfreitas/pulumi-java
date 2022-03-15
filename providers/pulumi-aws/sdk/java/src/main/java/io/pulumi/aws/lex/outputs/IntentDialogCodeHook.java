// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lex.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class IntentDialogCodeHook {
    /**
     * The version of the request-response that you want Amazon Lex to use
     * to invoke your Lambda function. For more information, see
     * [Using Lambda Functions](https://docs.aws.amazon.com/lex/latest/dg/using-lambda.html). Must be less than or equal to 5 characters in length.
     * 
     */
    private final String messageVersion;
    /**
     * The Amazon Resource Name (ARN) of the Lambda function.
     * 
     */
    private final String uri;

    @CustomType.Constructor
    private IntentDialogCodeHook(
        @CustomType.Parameter("messageVersion") String messageVersion,
        @CustomType.Parameter("uri") String uri) {
        this.messageVersion = messageVersion;
        this.uri = uri;
    }

    /**
     * The version of the request-response that you want Amazon Lex to use
     * to invoke your Lambda function. For more information, see
     * [Using Lambda Functions](https://docs.aws.amazon.com/lex/latest/dg/using-lambda.html). Must be less than or equal to 5 characters in length.
     * 
    */
    public String getMessageVersion() {
        return this.messageVersion;
    }
    /**
     * The Amazon Resource Name (ARN) of the Lambda function.
     * 
    */
    public String getUri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntentDialogCodeHook defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String messageVersion;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(IntentDialogCodeHook defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messageVersion = defaults.messageVersion;
    	      this.uri = defaults.uri;
        }

        public Builder messageVersion(String messageVersion) {
            this.messageVersion = Objects.requireNonNull(messageVersion);
            return this;
        }

        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }
        public IntentDialogCodeHook build() {
            return new IntentDialogCodeHook(messageVersion, uri);
        }
    }
}
