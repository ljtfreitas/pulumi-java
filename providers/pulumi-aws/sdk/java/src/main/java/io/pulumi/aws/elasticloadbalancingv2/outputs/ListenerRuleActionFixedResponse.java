// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticloadbalancingv2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListenerRuleActionFixedResponse {
    /**
     * The content type. Valid values are `text/plain`, `text/css`, `text/html`, `application/javascript` and `application/json`.
     * 
     */
    private final String contentType;
    /**
     * The message body.
     * 
     */
    private final @Nullable String messageBody;
    /**
     * The HTTP response code. Valid values are `2XX`, `4XX`, or `5XX`.
     * 
     */
    private final @Nullable String statusCode;

    @OutputCustomType.Constructor({"contentType","messageBody","statusCode"})
    private ListenerRuleActionFixedResponse(
        String contentType,
        @Nullable String messageBody,
        @Nullable String statusCode) {
        this.contentType = Objects.requireNonNull(contentType);
        this.messageBody = messageBody;
        this.statusCode = statusCode;
    }

    /**
     * The content type. Valid values are `text/plain`, `text/css`, `text/html`, `application/javascript` and `application/json`.
     * 
     */
    public String getContentType() {
        return this.contentType;
    }
    /**
     * The message body.
     * 
     */
    public Optional<String> getMessageBody() {
        return Optional.ofNullable(this.messageBody);
    }
    /**
     * The HTTP response code. Valid values are `2XX`, `4XX`, or `5XX`.
     * 
     */
    public Optional<String> getStatusCode() {
        return Optional.ofNullable(this.statusCode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleActionFixedResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String contentType;
        private @Nullable String messageBody;
        private @Nullable String statusCode;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleActionFixedResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentType = defaults.contentType;
    	      this.messageBody = defaults.messageBody;
    	      this.statusCode = defaults.statusCode;
        }

        public Builder setContentType(String contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }

        public Builder setMessageBody(@Nullable String messageBody) {
            this.messageBody = messageBody;
            return this;
        }

        public Builder setStatusCode(@Nullable String statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public ListenerRuleActionFixedResponse build() {
            return new ListenerRuleActionFixedResponse(contentType, messageBody, statusCode);
        }
    }
}
