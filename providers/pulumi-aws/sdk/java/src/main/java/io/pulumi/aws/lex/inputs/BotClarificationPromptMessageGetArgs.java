// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lex.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BotClarificationPromptMessageGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotClarificationPromptMessageGetArgs Empty = new BotClarificationPromptMessageGetArgs();

    /**
     * The text of the message.
     * 
     */
    @Import(name="content", required=true)
      private final Output<String> content;

    public Output<String> getContent() {
        return this.content;
    }

    /**
     * The content type of the message string.
     * 
     */
    @Import(name="contentType", required=true)
      private final Output<String> contentType;

    public Output<String> getContentType() {
        return this.contentType;
    }

    /**
     * Identifies the message group that the message belongs to. When a group
     * is assigned to a message, Amazon Lex returns one message from each group in the response.
     * 
     */
    @Import(name="groupNumber")
      private final @Nullable Output<Integer> groupNumber;

    public Output<Integer> getGroupNumber() {
        return this.groupNumber == null ? Output.empty() : this.groupNumber;
    }

    public BotClarificationPromptMessageGetArgs(
        Output<String> content,
        Output<String> contentType,
        @Nullable Output<Integer> groupNumber) {
        this.content = Objects.requireNonNull(content, "expected parameter 'content' to be non-null");
        this.contentType = Objects.requireNonNull(contentType, "expected parameter 'contentType' to be non-null");
        this.groupNumber = groupNumber;
    }

    private BotClarificationPromptMessageGetArgs() {
        this.content = Output.empty();
        this.contentType = Output.empty();
        this.groupNumber = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotClarificationPromptMessageGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> content;
        private Output<String> contentType;
        private @Nullable Output<Integer> groupNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(BotClarificationPromptMessageGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.contentType = defaults.contentType;
    	      this.groupNumber = defaults.groupNumber;
        }

        public Builder content(Output<String> content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }

        public Builder content(String content) {
            this.content = Output.of(Objects.requireNonNull(content));
            return this;
        }

        public Builder contentType(Output<String> contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }

        public Builder contentType(String contentType) {
            this.contentType = Output.of(Objects.requireNonNull(contentType));
            return this;
        }

        public Builder groupNumber(@Nullable Output<Integer> groupNumber) {
            this.groupNumber = groupNumber;
            return this;
        }

        public Builder groupNumber(@Nullable Integer groupNumber) {
            this.groupNumber = Output.ofNullable(groupNumber);
            return this;
        }
        public BotClarificationPromptMessageGetArgs build() {
            return new BotClarificationPromptMessageGetArgs(content, contentType, groupNumber);
        }
    }
}
