// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationModelConfigArgs;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationProcessConfigArgs;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigArgs;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionTriggerSettingsArgs;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1SuggestionFeatureArgs;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Config for suggestion features.
 * 
 */
public final class GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionFeatureConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionFeatureConfigArgs Empty = new GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionFeatureConfigArgs();

    /**
     * Configs of custom conversation model.
     * 
     */
    @InputImport(name="conversationModelConfig")
      private final @Nullable Input<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationModelConfigArgs> conversationModelConfig;

    public Input<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationModelConfigArgs> getConversationModelConfig() {
        return this.conversationModelConfig == null ? Input.empty() : this.conversationModelConfig;
    }

    /**
     * Configs for processing conversation.
     * 
     */
    @InputImport(name="conversationProcessConfig")
      private final @Nullable Input<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationProcessConfigArgs> conversationProcessConfig;

    public Input<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationProcessConfigArgs> getConversationProcessConfig() {
        return this.conversationProcessConfig == null ? Input.empty() : this.conversationProcessConfig;
    }

    /**
     * Automatically iterates all participants and tries to compile suggestions. Supported features: ARTICLE_SUGGESTION, FAQ, DIALOGFLOW_ASSIST.
     * 
     */
    @InputImport(name="enableEventBasedSuggestion")
      private final @Nullable Input<Boolean> enableEventBasedSuggestion;

    public Input<Boolean> getEnableEventBasedSuggestion() {
        return this.enableEventBasedSuggestion == null ? Input.empty() : this.enableEventBasedSuggestion;
    }

    /**
     * Configs of query.
     * 
     */
    @InputImport(name="queryConfig")
      private final @Nullable Input<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigArgs> queryConfig;

    public Input<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigArgs> getQueryConfig() {
        return this.queryConfig == null ? Input.empty() : this.queryConfig;
    }

    /**
     * The suggestion feature.
     * 
     */
    @InputImport(name="suggestionFeature")
      private final @Nullable Input<GoogleCloudDialogflowV2beta1SuggestionFeatureArgs> suggestionFeature;

    public Input<GoogleCloudDialogflowV2beta1SuggestionFeatureArgs> getSuggestionFeature() {
        return this.suggestionFeature == null ? Input.empty() : this.suggestionFeature;
    }

    /**
     * Settings of suggestion trigger. Currently, only ARTICLE_SUGGESTION, FAQ, and DIALOGFLOW_ASSIST will use this field.
     * 
     */
    @InputImport(name="suggestionTriggerSettings")
      private final @Nullable Input<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionTriggerSettingsArgs> suggestionTriggerSettings;

    public Input<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionTriggerSettingsArgs> getSuggestionTriggerSettings() {
        return this.suggestionTriggerSettings == null ? Input.empty() : this.suggestionTriggerSettings;
    }

    public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionFeatureConfigArgs(
        @Nullable Input<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationModelConfigArgs> conversationModelConfig,
        @Nullable Input<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationProcessConfigArgs> conversationProcessConfig,
        @Nullable Input<Boolean> enableEventBasedSuggestion,
        @Nullable Input<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigArgs> queryConfig,
        @Nullable Input<GoogleCloudDialogflowV2beta1SuggestionFeatureArgs> suggestionFeature,
        @Nullable Input<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionTriggerSettingsArgs> suggestionTriggerSettings) {
        this.conversationModelConfig = conversationModelConfig;
        this.conversationProcessConfig = conversationProcessConfig;
        this.enableEventBasedSuggestion = enableEventBasedSuggestion;
        this.queryConfig = queryConfig;
        this.suggestionFeature = suggestionFeature;
        this.suggestionTriggerSettings = suggestionTriggerSettings;
    }

    private GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionFeatureConfigArgs() {
        this.conversationModelConfig = Input.empty();
        this.conversationProcessConfig = Input.empty();
        this.enableEventBasedSuggestion = Input.empty();
        this.queryConfig = Input.empty();
        this.suggestionFeature = Input.empty();
        this.suggestionTriggerSettings = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionFeatureConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationModelConfigArgs> conversationModelConfig;
        private @Nullable Input<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationProcessConfigArgs> conversationProcessConfig;
        private @Nullable Input<Boolean> enableEventBasedSuggestion;
        private @Nullable Input<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigArgs> queryConfig;
        private @Nullable Input<GoogleCloudDialogflowV2beta1SuggestionFeatureArgs> suggestionFeature;
        private @Nullable Input<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionTriggerSettingsArgs> suggestionTriggerSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionFeatureConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conversationModelConfig = defaults.conversationModelConfig;
    	      this.conversationProcessConfig = defaults.conversationProcessConfig;
    	      this.enableEventBasedSuggestion = defaults.enableEventBasedSuggestion;
    	      this.queryConfig = defaults.queryConfig;
    	      this.suggestionFeature = defaults.suggestionFeature;
    	      this.suggestionTriggerSettings = defaults.suggestionTriggerSettings;
        }

        public Builder setConversationModelConfig(@Nullable Input<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationModelConfigArgs> conversationModelConfig) {
            this.conversationModelConfig = conversationModelConfig;
            return this;
        }

        public Builder setConversationModelConfig(@Nullable GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationModelConfigArgs conversationModelConfig) {
            this.conversationModelConfig = Input.ofNullable(conversationModelConfig);
            return this;
        }

        public Builder setConversationProcessConfig(@Nullable Input<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationProcessConfigArgs> conversationProcessConfig) {
            this.conversationProcessConfig = conversationProcessConfig;
            return this;
        }

        public Builder setConversationProcessConfig(@Nullable GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationProcessConfigArgs conversationProcessConfig) {
            this.conversationProcessConfig = Input.ofNullable(conversationProcessConfig);
            return this;
        }

        public Builder setEnableEventBasedSuggestion(@Nullable Input<Boolean> enableEventBasedSuggestion) {
            this.enableEventBasedSuggestion = enableEventBasedSuggestion;
            return this;
        }

        public Builder setEnableEventBasedSuggestion(@Nullable Boolean enableEventBasedSuggestion) {
            this.enableEventBasedSuggestion = Input.ofNullable(enableEventBasedSuggestion);
            return this;
        }

        public Builder setQueryConfig(@Nullable Input<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigArgs> queryConfig) {
            this.queryConfig = queryConfig;
            return this;
        }

        public Builder setQueryConfig(@Nullable GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigArgs queryConfig) {
            this.queryConfig = Input.ofNullable(queryConfig);
            return this;
        }

        public Builder setSuggestionFeature(@Nullable Input<GoogleCloudDialogflowV2beta1SuggestionFeatureArgs> suggestionFeature) {
            this.suggestionFeature = suggestionFeature;
            return this;
        }

        public Builder setSuggestionFeature(@Nullable GoogleCloudDialogflowV2beta1SuggestionFeatureArgs suggestionFeature) {
            this.suggestionFeature = Input.ofNullable(suggestionFeature);
            return this;
        }

        public Builder setSuggestionTriggerSettings(@Nullable Input<GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionTriggerSettingsArgs> suggestionTriggerSettings) {
            this.suggestionTriggerSettings = suggestionTriggerSettings;
            return this;
        }

        public Builder setSuggestionTriggerSettings(@Nullable GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionTriggerSettingsArgs suggestionTriggerSettings) {
            this.suggestionTriggerSettings = Input.ofNullable(suggestionTriggerSettings);
            return this;
        }
        public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionFeatureConfigArgs build() {
            return new GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionFeatureConfigArgs(conversationModelConfig, conversationProcessConfig, enableEventBasedSuggestion, queryConfig, suggestionFeature, suggestionTriggerSettings);
        }
    }
}
