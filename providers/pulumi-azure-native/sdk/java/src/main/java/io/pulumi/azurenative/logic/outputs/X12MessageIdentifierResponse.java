// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class X12MessageIdentifierResponse {
    /**
     * The message id.
     * 
     */
    private final String messageId;

    @OutputCustomType.Constructor({"messageId"})
    private X12MessageIdentifierResponse(String messageId) {
        this.messageId = Objects.requireNonNull(messageId);
    }

    /**
     * The message id.
     * 
     */
    public String getMessageId() {
        return this.messageId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(X12MessageIdentifierResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String messageId;

        public Builder() {
    	      // Empty
        }

        public Builder(X12MessageIdentifierResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messageId = defaults.messageId;
        }

        public Builder setMessageId(String messageId) {
            this.messageId = Objects.requireNonNull(messageId);
            return this;
        }

        public X12MessageIdentifierResponse build() {
            return new X12MessageIdentifierResponse(messageId);
        }
    }
}
