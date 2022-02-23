// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationModelConfigResponse {
    /**
     * Conversation model resource name. Format: `projects//conversationModels/`.
     * 
     */
    private final String model;

    @OutputCustomType.Constructor({"model"})
    private GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationModelConfigResponse(String model) {
        this.model = Objects.requireNonNull(model);
    }

    /**
     * Conversation model resource name. Format: `projects//conversationModels/`.
     * 
     */
    public String getModel() {
        return this.model;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationModelConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String model;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationModelConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.model = defaults.model;
        }

        public Builder setModel(String model) {
            this.model = Objects.requireNonNull(model);
            return this;
        }
        public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationModelConfigResponse build() {
            return new GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationModelConfigResponse(model);
        }
    }
}
