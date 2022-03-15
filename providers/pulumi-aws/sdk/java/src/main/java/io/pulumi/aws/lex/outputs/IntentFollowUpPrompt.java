// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lex.outputs;

import io.pulumi.aws.lex.outputs.IntentFollowUpPromptPrompt;
import io.pulumi.aws.lex.outputs.IntentFollowUpPromptRejectionStatement;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class IntentFollowUpPrompt {
    /**
     * Prompts for information from the user. Attributes are documented under prompt.
     * 
     */
    private final IntentFollowUpPromptPrompt prompt;
    /**
     * If the user answers "no" to the question defined in the prompt field,
     * Amazon Lex responds with this statement to acknowledge that the intent was canceled. Attributes are
     * documented below under statement.
     * 
     */
    private final IntentFollowUpPromptRejectionStatement rejectionStatement;

    @CustomType.Constructor
    private IntentFollowUpPrompt(
        @CustomType.Parameter("prompt") IntentFollowUpPromptPrompt prompt,
        @CustomType.Parameter("rejectionStatement") IntentFollowUpPromptRejectionStatement rejectionStatement) {
        this.prompt = prompt;
        this.rejectionStatement = rejectionStatement;
    }

    /**
     * Prompts for information from the user. Attributes are documented under prompt.
     * 
    */
    public IntentFollowUpPromptPrompt getPrompt() {
        return this.prompt;
    }
    /**
     * If the user answers "no" to the question defined in the prompt field,
     * Amazon Lex responds with this statement to acknowledge that the intent was canceled. Attributes are
     * documented below under statement.
     * 
    */
    public IntentFollowUpPromptRejectionStatement getRejectionStatement() {
        return this.rejectionStatement;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntentFollowUpPrompt defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntentFollowUpPromptPrompt prompt;
        private IntentFollowUpPromptRejectionStatement rejectionStatement;

        public Builder() {
    	      // Empty
        }

        public Builder(IntentFollowUpPrompt defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.prompt = defaults.prompt;
    	      this.rejectionStatement = defaults.rejectionStatement;
        }

        public Builder prompt(IntentFollowUpPromptPrompt prompt) {
            this.prompt = Objects.requireNonNull(prompt);
            return this;
        }

        public Builder rejectionStatement(IntentFollowUpPromptRejectionStatement rejectionStatement) {
            this.rejectionStatement = Objects.requireNonNull(rejectionStatement);
            return this;
        }
        public IntentFollowUpPrompt build() {
            return new IntentFollowUpPrompt(prompt, rejectionStatement);
        }
    }
}
