// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigMessageAnalysisConfigArgs;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigArgs;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1NotificationConfigArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines the Human Agent Assistant to connect to a conversation.
 * 
 */
public final class GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigArgs Empty = new GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigArgs();

    /**
     * Configuration for agent assistance of end user participant. Currently, this feature is not general available, please contact Google to get access.
     * 
     */
    @Import(name="endUserSuggestionConfig")
      private final @Nullable Output<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigArgs> endUserSuggestionConfig;

    public Output<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigArgs> getEndUserSuggestionConfig() {
        return this.endUserSuggestionConfig == null ? Output.empty() : this.endUserSuggestionConfig;
    }

    /**
     * Configuration for agent assistance of human agent participant.
     * 
     */
    @Import(name="humanAgentSuggestionConfig")
      private final @Nullable Output<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigArgs> humanAgentSuggestionConfig;

    public Output<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigArgs> getHumanAgentSuggestionConfig() {
        return this.humanAgentSuggestionConfig == null ? Output.empty() : this.humanAgentSuggestionConfig;
    }

    /**
     * Configuration for message analysis.
     * 
     */
    @Import(name="messageAnalysisConfig")
      private final @Nullable Output<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigMessageAnalysisConfigArgs> messageAnalysisConfig;

    public Output<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigMessageAnalysisConfigArgs> getMessageAnalysisConfig() {
        return this.messageAnalysisConfig == null ? Output.empty() : this.messageAnalysisConfig;
    }

    /**
     * Pub/Sub topic on which to publish new agent assistant events.
     * 
     */
    @Import(name="notificationConfig")
      private final @Nullable Output<GoogleCloudDialogflowV2beta1NotificationConfigArgs> notificationConfig;

    public Output<GoogleCloudDialogflowV2beta1NotificationConfigArgs> getNotificationConfig() {
        return this.notificationConfig == null ? Output.empty() : this.notificationConfig;
    }

    public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigArgs(
        @Nullable Output<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigArgs> endUserSuggestionConfig,
        @Nullable Output<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigArgs> humanAgentSuggestionConfig,
        @Nullable Output<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigMessageAnalysisConfigArgs> messageAnalysisConfig,
        @Nullable Output<GoogleCloudDialogflowV2beta1NotificationConfigArgs> notificationConfig) {
        this.endUserSuggestionConfig = endUserSuggestionConfig;
        this.humanAgentSuggestionConfig = humanAgentSuggestionConfig;
        this.messageAnalysisConfig = messageAnalysisConfig;
        this.notificationConfig = notificationConfig;
    }

    private GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigArgs() {
        this.endUserSuggestionConfig = Output.empty();
        this.humanAgentSuggestionConfig = Output.empty();
        this.messageAnalysisConfig = Output.empty();
        this.notificationConfig = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigArgs> endUserSuggestionConfig;
        private @Nullable Output<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigArgs> humanAgentSuggestionConfig;
        private @Nullable Output<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigMessageAnalysisConfigArgs> messageAnalysisConfig;
        private @Nullable Output<GoogleCloudDialogflowV2beta1NotificationConfigArgs> notificationConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endUserSuggestionConfig = defaults.endUserSuggestionConfig;
    	      this.humanAgentSuggestionConfig = defaults.humanAgentSuggestionConfig;
    	      this.messageAnalysisConfig = defaults.messageAnalysisConfig;
    	      this.notificationConfig = defaults.notificationConfig;
        }

        public Builder endUserSuggestionConfig(@Nullable Output<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigArgs> endUserSuggestionConfig) {
            this.endUserSuggestionConfig = endUserSuggestionConfig;
            return this;
        }

        public Builder endUserSuggestionConfig(@Nullable GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigArgs endUserSuggestionConfig) {
            this.endUserSuggestionConfig = Output.ofNullable(endUserSuggestionConfig);
            return this;
        }

        public Builder humanAgentSuggestionConfig(@Nullable Output<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigArgs> humanAgentSuggestionConfig) {
            this.humanAgentSuggestionConfig = humanAgentSuggestionConfig;
            return this;
        }

        public Builder humanAgentSuggestionConfig(@Nullable GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigArgs humanAgentSuggestionConfig) {
            this.humanAgentSuggestionConfig = Output.ofNullable(humanAgentSuggestionConfig);
            return this;
        }

        public Builder messageAnalysisConfig(@Nullable Output<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigMessageAnalysisConfigArgs> messageAnalysisConfig) {
            this.messageAnalysisConfig = messageAnalysisConfig;
            return this;
        }

        public Builder messageAnalysisConfig(@Nullable GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigMessageAnalysisConfigArgs messageAnalysisConfig) {
            this.messageAnalysisConfig = Output.ofNullable(messageAnalysisConfig);
            return this;
        }

        public Builder notificationConfig(@Nullable Output<GoogleCloudDialogflowV2beta1NotificationConfigArgs> notificationConfig) {
            this.notificationConfig = notificationConfig;
            return this;
        }

        public Builder notificationConfig(@Nullable GoogleCloudDialogflowV2beta1NotificationConfigArgs notificationConfig) {
            this.notificationConfig = Output.ofNullable(notificationConfig);
            return this;
        }
        public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigArgs build() {
            return new GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigArgs(endUserSuggestionConfig, humanAgentSuggestionConfig, messageAnalysisConfig, notificationConfig);
        }
    }
}
