// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Custom conversation models used in agent assist feature. Supported feature: ARTICLE_SUGGESTION, SMART_COMPOSE, SMART_REPLY.
 * 
 */
public final class GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationModelConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationModelConfigArgs Empty = new GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationModelConfigArgs();

    /**
     * Conversation model resource name. Format: `projects//conversationModels/`.
     * 
     */
    @InputImport(name="model")
      private final @Nullable Input<String> model;

    public Input<String> getModel() {
        return this.model == null ? Input.empty() : this.model;
    }

    public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationModelConfigArgs(@Nullable Input<String> model) {
        this.model = model;
    }

    private GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationModelConfigArgs() {
        this.model = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationModelConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> model;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationModelConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.model = defaults.model;
        }

        public Builder setModel(@Nullable Input<String> model) {
            this.model = model;
            return this;
        }

        public Builder setModel(@Nullable String model) {
            this.model = Input.ofNullable(model);
            return this;
        }
        public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationModelConfigArgs build() {
            return new GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationModelConfigArgs(model);
        }
    }
}
