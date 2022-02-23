// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1ConversationTurnUserInputResponse;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1ConversationTurnVirtualAgentOutputResponse;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowCxV3beta1ConversationTurnResponse {
    /**
     * The user input.
     * 
     */
    private final GoogleCloudDialogflowCxV3beta1ConversationTurnUserInputResponse userInput;
    /**
     * The virtual agent output.
     * 
     */
    private final GoogleCloudDialogflowCxV3beta1ConversationTurnVirtualAgentOutputResponse virtualAgentOutput;

    @OutputCustomType.Constructor({"userInput","virtualAgentOutput"})
    private GoogleCloudDialogflowCxV3beta1ConversationTurnResponse(
        GoogleCloudDialogflowCxV3beta1ConversationTurnUserInputResponse userInput,
        GoogleCloudDialogflowCxV3beta1ConversationTurnVirtualAgentOutputResponse virtualAgentOutput) {
        this.userInput = Objects.requireNonNull(userInput);
        this.virtualAgentOutput = Objects.requireNonNull(virtualAgentOutput);
    }

    /**
     * The user input.
     * 
     */
    public GoogleCloudDialogflowCxV3beta1ConversationTurnUserInputResponse getUserInput() {
        return this.userInput;
    }
    /**
     * The virtual agent output.
     * 
     */
    public GoogleCloudDialogflowCxV3beta1ConversationTurnVirtualAgentOutputResponse getVirtualAgentOutput() {
        return this.virtualAgentOutput;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1ConversationTurnResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3beta1ConversationTurnUserInputResponse userInput;
        private GoogleCloudDialogflowCxV3beta1ConversationTurnVirtualAgentOutputResponse virtualAgentOutput;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1ConversationTurnResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.userInput = defaults.userInput;
    	      this.virtualAgentOutput = defaults.virtualAgentOutput;
        }

        public Builder setUserInput(GoogleCloudDialogflowCxV3beta1ConversationTurnUserInputResponse userInput) {
            this.userInput = Objects.requireNonNull(userInput);
            return this;
        }

        public Builder setVirtualAgentOutput(GoogleCloudDialogflowCxV3beta1ConversationTurnVirtualAgentOutputResponse virtualAgentOutput) {
            this.virtualAgentOutput = Objects.requireNonNull(virtualAgentOutput);
            return this;
        }
        public GoogleCloudDialogflowCxV3beta1ConversationTurnResponse build() {
            return new GoogleCloudDialogflowCxV3beta1ConversationTurnResponse(userInput, virtualAgentOutput);
        }
    }
}
