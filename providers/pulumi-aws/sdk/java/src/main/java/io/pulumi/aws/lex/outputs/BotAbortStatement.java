// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lex.outputs;

import io.pulumi.aws.lex.outputs.BotAbortStatementMessage;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BotAbortStatement {
    /**
     * A set of messages, each of which provides a message string and its type. You
     * can specify the message string in plain text or in Speech Synthesis Markup Language (SSML). Attributes
     * are documented under message.
     * 
     */
    private final List<BotAbortStatementMessage> messages;
    /**
     * The response card. Amazon Lex will substitute session attributes and
     * slot values into the response card. For more information, see
     * [Example: Using a Response Card](https://docs.aws.amazon.com/lex/latest/dg/ex-resp-card.html).
     * 
     */
    private final @Nullable String responseCard;

    @CustomType.Constructor
    private BotAbortStatement(
        @CustomType.Parameter("messages") List<BotAbortStatementMessage> messages,
        @CustomType.Parameter("responseCard") @Nullable String responseCard) {
        this.messages = messages;
        this.responseCard = responseCard;
    }

    /**
     * A set of messages, each of which provides a message string and its type. You
     * can specify the message string in plain text or in Speech Synthesis Markup Language (SSML). Attributes
     * are documented under message.
     * 
    */
    public List<BotAbortStatementMessage> getMessages() {
        return this.messages;
    }
    /**
     * The response card. Amazon Lex will substitute session attributes and
     * slot values into the response card. For more information, see
     * [Example: Using a Response Card](https://docs.aws.amazon.com/lex/latest/dg/ex-resp-card.html).
     * 
    */
    public Optional<String> getResponseCard() {
        return Optional.ofNullable(this.responseCard);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotAbortStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<BotAbortStatementMessage> messages;
        private @Nullable String responseCard;

        public Builder() {
    	      // Empty
        }

        public Builder(BotAbortStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messages = defaults.messages;
    	      this.responseCard = defaults.responseCard;
        }

        public Builder messages(List<BotAbortStatementMessage> messages) {
            this.messages = Objects.requireNonNull(messages);
            return this;
        }

        public Builder responseCard(@Nullable String responseCard) {
            this.responseCard = responseCard;
            return this;
        }
        public BotAbortStatement build() {
            return new BotAbortStatement(messages, responseCard);
        }
    }
}
