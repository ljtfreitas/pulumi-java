// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lex.inputs;

import io.pulumi.aws.lex.inputs.IntentConclusionStatementMessageGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IntentConclusionStatementGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntentConclusionStatementGetArgs Empty = new IntentConclusionStatementGetArgs();

    /**
     * A set of messages, each of which provides a message string and its type.
     * You can specify the message string in plain text or in Speech Synthesis Markup Language (SSML).
     * Attributes are documented under message. Must contain between 1 and 15 messages.
     * 
     */
    @InputImport(name="messages", required=true)
    private final Input<List<IntentConclusionStatementMessageGetArgs>> messages;

    public Input<List<IntentConclusionStatementMessageGetArgs>> getMessages() {
        return this.messages;
    }

    /**
     * The response card. Amazon Lex will substitute session attributes and
     * slot values into the response card. For more information, see
     * [Example: Using a Response Card](https://docs.aws.amazon.com/lex/latest/dg/ex-resp-card.html). Must be less than or equal to 50000 characters in length.
     * 
     */
    @InputImport(name="responseCard")
    private final @Nullable Input<String> responseCard;

    public Input<String> getResponseCard() {
        return this.responseCard == null ? Input.empty() : this.responseCard;
    }

    public IntentConclusionStatementGetArgs(
        Input<List<IntentConclusionStatementMessageGetArgs>> messages,
        @Nullable Input<String> responseCard) {
        this.messages = Objects.requireNonNull(messages, "expected parameter 'messages' to be non-null");
        this.responseCard = responseCard;
    }

    private IntentConclusionStatementGetArgs() {
        this.messages = Input.empty();
        this.responseCard = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntentConclusionStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<IntentConclusionStatementMessageGetArgs>> messages;
        private @Nullable Input<String> responseCard;

        public Builder() {
    	      // Empty
        }

        public Builder(IntentConclusionStatementGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messages = defaults.messages;
    	      this.responseCard = defaults.responseCard;
        }

        public Builder setMessages(Input<List<IntentConclusionStatementMessageGetArgs>> messages) {
            this.messages = Objects.requireNonNull(messages);
            return this;
        }

        public Builder setMessages(List<IntentConclusionStatementMessageGetArgs> messages) {
            this.messages = Input.of(Objects.requireNonNull(messages));
            return this;
        }

        public Builder setResponseCard(@Nullable Input<String> responseCard) {
            this.responseCard = responseCard;
            return this;
        }

        public Builder setResponseCard(@Nullable String responseCard) {
            this.responseCard = Input.ofNullable(responseCard);
            return this;
        }
        public IntentConclusionStatementGetArgs build() {
            return new IntentConclusionStatementGetArgs(messages, responseCard);
        }
    }
}