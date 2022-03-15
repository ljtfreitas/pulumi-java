// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lex.inputs;

import io.pulumi.aws.lex.inputs.IntentConfirmationPromptMessageGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IntentConfirmationPromptGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntentConfirmationPromptGetArgs Empty = new IntentConfirmationPromptGetArgs();

    /**
     * The number of times to prompt the user for information. Must be a number between 1 and 5 (inclusive).
     * 
     */
    @Import(name="maxAttempts", required=true)
      private final Output<Integer> maxAttempts;

    public Output<Integer> getMaxAttempts() {
        return this.maxAttempts;
    }

    /**
     * A set of messages, each of which provides a message string and its type.
     * You can specify the message string in plain text or in Speech Synthesis Markup Language (SSML).
     * Attributes are documented under message. Must contain between 1 and 15 messages.
     * 
     */
    @Import(name="messages", required=true)
      private final Output<List<IntentConfirmationPromptMessageGetArgs>> messages;

    public Output<List<IntentConfirmationPromptMessageGetArgs>> getMessages() {
        return this.messages;
    }

    /**
     * The response card. Amazon Lex will substitute session attributes and
     * slot values into the response card. For more information, see
     * [Example: Using a Response Card](https://docs.aws.amazon.com/lex/latest/dg/ex-resp-card.html). Must be less than or equal to 50000 characters in length.
     * 
     */
    @Import(name="responseCard")
      private final @Nullable Output<String> responseCard;

    public Output<String> getResponseCard() {
        return this.responseCard == null ? Output.empty() : this.responseCard;
    }

    public IntentConfirmationPromptGetArgs(
        Output<Integer> maxAttempts,
        Output<List<IntentConfirmationPromptMessageGetArgs>> messages,
        @Nullable Output<String> responseCard) {
        this.maxAttempts = Objects.requireNonNull(maxAttempts, "expected parameter 'maxAttempts' to be non-null");
        this.messages = Objects.requireNonNull(messages, "expected parameter 'messages' to be non-null");
        this.responseCard = responseCard;
    }

    private IntentConfirmationPromptGetArgs() {
        this.maxAttempts = Output.empty();
        this.messages = Output.empty();
        this.responseCard = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntentConfirmationPromptGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> maxAttempts;
        private Output<List<IntentConfirmationPromptMessageGetArgs>> messages;
        private @Nullable Output<String> responseCard;

        public Builder() {
    	      // Empty
        }

        public Builder(IntentConfirmationPromptGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxAttempts = defaults.maxAttempts;
    	      this.messages = defaults.messages;
    	      this.responseCard = defaults.responseCard;
        }

        public Builder maxAttempts(Output<Integer> maxAttempts) {
            this.maxAttempts = Objects.requireNonNull(maxAttempts);
            return this;
        }

        public Builder maxAttempts(Integer maxAttempts) {
            this.maxAttempts = Output.of(Objects.requireNonNull(maxAttempts));
            return this;
        }

        public Builder messages(Output<List<IntentConfirmationPromptMessageGetArgs>> messages) {
            this.messages = Objects.requireNonNull(messages);
            return this;
        }

        public Builder messages(List<IntentConfirmationPromptMessageGetArgs> messages) {
            this.messages = Output.of(Objects.requireNonNull(messages));
            return this;
        }

        public Builder responseCard(@Nullable Output<String> responseCard) {
            this.responseCard = responseCard;
            return this;
        }

        public Builder responseCard(@Nullable String responseCard) {
            this.responseCard = Output.ofNullable(responseCard);
            return this;
        }
        public IntentConfirmationPromptGetArgs build() {
            return new IntentConfirmationPromptGetArgs(maxAttempts, messages, responseCard);
        }
    }
}
