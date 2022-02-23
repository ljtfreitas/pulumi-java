// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigMessageAnalysisConfigResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1NotificationConfigResponse;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigResponse {
    /**
     * Configuration for agent assistance of end user participant. Currently, this feature is not general available, please contact Google to get access.
     * 
     */
    private final GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigResponse endUserSuggestionConfig;
    /**
     * Configuration for agent assistance of human agent participant.
     * 
     */
    private final GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigResponse humanAgentSuggestionConfig;
    /**
     * Configuration for message analysis.
     * 
     */
    private final GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigMessageAnalysisConfigResponse messageAnalysisConfig;
    /**
     * Pub/Sub topic on which to publish new agent assistant events.
     * 
     */
    private final GoogleCloudDialogflowV2beta1NotificationConfigResponse notificationConfig;

    @OutputCustomType.Constructor({"endUserSuggestionConfig","humanAgentSuggestionConfig","messageAnalysisConfig","notificationConfig"})
    private GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigResponse(
        GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigResponse endUserSuggestionConfig,
        GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigResponse humanAgentSuggestionConfig,
        GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigMessageAnalysisConfigResponse messageAnalysisConfig,
        GoogleCloudDialogflowV2beta1NotificationConfigResponse notificationConfig) {
        this.endUserSuggestionConfig = Objects.requireNonNull(endUserSuggestionConfig);
        this.humanAgentSuggestionConfig = Objects.requireNonNull(humanAgentSuggestionConfig);
        this.messageAnalysisConfig = Objects.requireNonNull(messageAnalysisConfig);
        this.notificationConfig = Objects.requireNonNull(notificationConfig);
    }

    /**
     * Configuration for agent assistance of end user participant. Currently, this feature is not general available, please contact Google to get access.
     * 
     */
    public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigResponse getEndUserSuggestionConfig() {
        return this.endUserSuggestionConfig;
    }
    /**
     * Configuration for agent assistance of human agent participant.
     * 
     */
    public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigResponse getHumanAgentSuggestionConfig() {
        return this.humanAgentSuggestionConfig;
    }
    /**
     * Configuration for message analysis.
     * 
     */
    public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigMessageAnalysisConfigResponse getMessageAnalysisConfig() {
        return this.messageAnalysisConfig;
    }
    /**
     * Pub/Sub topic on which to publish new agent assistant events.
     * 
     */
    public GoogleCloudDialogflowV2beta1NotificationConfigResponse getNotificationConfig() {
        return this.notificationConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigResponse endUserSuggestionConfig;
        private GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigResponse humanAgentSuggestionConfig;
        private GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigMessageAnalysisConfigResponse messageAnalysisConfig;
        private GoogleCloudDialogflowV2beta1NotificationConfigResponse notificationConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endUserSuggestionConfig = defaults.endUserSuggestionConfig;
    	      this.humanAgentSuggestionConfig = defaults.humanAgentSuggestionConfig;
    	      this.messageAnalysisConfig = defaults.messageAnalysisConfig;
    	      this.notificationConfig = defaults.notificationConfig;
        }

        public Builder setEndUserSuggestionConfig(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigResponse endUserSuggestionConfig) {
            this.endUserSuggestionConfig = Objects.requireNonNull(endUserSuggestionConfig);
            return this;
        }

        public Builder setHumanAgentSuggestionConfig(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionConfigResponse humanAgentSuggestionConfig) {
            this.humanAgentSuggestionConfig = Objects.requireNonNull(humanAgentSuggestionConfig);
            return this;
        }

        public Builder setMessageAnalysisConfig(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigMessageAnalysisConfigResponse messageAnalysisConfig) {
            this.messageAnalysisConfig = Objects.requireNonNull(messageAnalysisConfig);
            return this;
        }

        public Builder setNotificationConfig(GoogleCloudDialogflowV2beta1NotificationConfigResponse notificationConfig) {
            this.notificationConfig = Objects.requireNonNull(notificationConfig);
            return this;
        }
        public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigResponse build() {
            return new GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigResponse(endUserSuggestionConfig, humanAgentSuggestionConfig, messageAnalysisConfig, notificationConfig);
        }
    }
}
