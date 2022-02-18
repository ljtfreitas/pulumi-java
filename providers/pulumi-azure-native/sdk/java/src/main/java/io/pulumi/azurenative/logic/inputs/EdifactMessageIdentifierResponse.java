// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The Edifact message identifier.
 * 
 */
public final class EdifactMessageIdentifierResponse extends io.pulumi.resources.InvokeArgs {

    public static final EdifactMessageIdentifierResponse Empty = new EdifactMessageIdentifierResponse();

    /**
     * The message id on which this envelope settings has to be applied.
     * 
     */
    @InputImport(name="messageId", required=true)
    private final String messageId;

    public String getMessageId() {
        return this.messageId;
    }

    public EdifactMessageIdentifierResponse(String messageId) {
        this.messageId = Objects.requireNonNull(messageId, "expected parameter 'messageId' to be non-null");
    }

    private EdifactMessageIdentifierResponse() {
        this.messageId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdifactMessageIdentifierResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String messageId;

        public Builder() {
    	      // Empty
        }

        public Builder(EdifactMessageIdentifierResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messageId = defaults.messageId;
        }

        public Builder setMessageId(String messageId) {
            this.messageId = Objects.requireNonNull(messageId);
            return this;
        }

        public EdifactMessageIdentifierResponse build() {
            return new EdifactMessageIdentifierResponse(messageId);
        }
    }
}
