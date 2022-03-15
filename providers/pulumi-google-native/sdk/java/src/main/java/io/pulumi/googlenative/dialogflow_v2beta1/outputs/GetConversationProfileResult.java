// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1AutomatedAgentConfigResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1LoggingConfigResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1NotificationConfigResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1SpeechToTextConfigResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetConversationProfileResult {
    /**
     * Configuration for an automated agent to use with this profile.
     * 
     */
    private final GoogleCloudDialogflowV2beta1AutomatedAgentConfigResponse automatedAgentConfig;
    /**
     * Create time of the conversation profile.
     * 
     */
    private final String createTime;
    /**
     * Human readable name for this profile. Max length 1024 bytes.
     * 
     */
    private final String displayName;
    /**
     * Configuration for agent assistance to use with this profile.
     * 
     */
    private final GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigResponse humanAgentAssistantConfig;
    /**
     * Configuration for connecting to a live agent. Currently, this feature is not general available, please contact Google to get access.
     * 
     */
    private final GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigResponse humanAgentHandoffConfig;
    /**
     * Language code for the conversation profile. If not specified, the language is en-US. Language at ConversationProfile should be set for all non en-us languages. This should be a [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag. Example: "en-US".
     * 
     */
    private final String languageCode;
    /**
     * Configuration for logging conversation lifecycle events.
     * 
     */
    private final GoogleCloudDialogflowV2beta1LoggingConfigResponse loggingConfig;
    /**
     * The unique identifier of this conversation profile. Format: `projects//locations//conversationProfiles/`.
     * 
     */
    private final String name;
    /**
     * Configuration for publishing new message events. Event will be sent in format of ConversationEvent
     * 
     */
    private final GoogleCloudDialogflowV2beta1NotificationConfigResponse newMessageEventNotificationConfig;
    /**
     * Configuration for publishing conversation lifecycle events.
     * 
     */
    private final GoogleCloudDialogflowV2beta1NotificationConfigResponse notificationConfig;
    /**
     * Name of the CX SecuritySettings reference for the agent. Format: `projects//locations//securitySettings/`.
     * 
     */
    private final String securitySettings;
    /**
     * Settings for speech transcription.
     * 
     */
    private final GoogleCloudDialogflowV2beta1SpeechToTextConfigResponse sttConfig;
    /**
     * The time zone of this conversational profile from the [time zone database](https://www.iana.org/time-zones), e.g., America/New_York, Europe/Paris. Defaults to America/New_York.
     * 
     */
    private final String timeZone;
    /**
     * Update time of the conversation profile.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetConversationProfileResult(
        @CustomType.Parameter("automatedAgentConfig") GoogleCloudDialogflowV2beta1AutomatedAgentConfigResponse automatedAgentConfig,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("humanAgentAssistantConfig") GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigResponse humanAgentAssistantConfig,
        @CustomType.Parameter("humanAgentHandoffConfig") GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigResponse humanAgentHandoffConfig,
        @CustomType.Parameter("languageCode") String languageCode,
        @CustomType.Parameter("loggingConfig") GoogleCloudDialogflowV2beta1LoggingConfigResponse loggingConfig,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("newMessageEventNotificationConfig") GoogleCloudDialogflowV2beta1NotificationConfigResponse newMessageEventNotificationConfig,
        @CustomType.Parameter("notificationConfig") GoogleCloudDialogflowV2beta1NotificationConfigResponse notificationConfig,
        @CustomType.Parameter("securitySettings") String securitySettings,
        @CustomType.Parameter("sttConfig") GoogleCloudDialogflowV2beta1SpeechToTextConfigResponse sttConfig,
        @CustomType.Parameter("timeZone") String timeZone,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.automatedAgentConfig = automatedAgentConfig;
        this.createTime = createTime;
        this.displayName = displayName;
        this.humanAgentAssistantConfig = humanAgentAssistantConfig;
        this.humanAgentHandoffConfig = humanAgentHandoffConfig;
        this.languageCode = languageCode;
        this.loggingConfig = loggingConfig;
        this.name = name;
        this.newMessageEventNotificationConfig = newMessageEventNotificationConfig;
        this.notificationConfig = notificationConfig;
        this.securitySettings = securitySettings;
        this.sttConfig = sttConfig;
        this.timeZone = timeZone;
        this.updateTime = updateTime;
    }

    /**
     * Configuration for an automated agent to use with this profile.
     * 
    */
    public GoogleCloudDialogflowV2beta1AutomatedAgentConfigResponse getAutomatedAgentConfig() {
        return this.automatedAgentConfig;
    }
    /**
     * Create time of the conversation profile.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Human readable name for this profile. Max length 1024 bytes.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Configuration for agent assistance to use with this profile.
     * 
    */
    public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigResponse getHumanAgentAssistantConfig() {
        return this.humanAgentAssistantConfig;
    }
    /**
     * Configuration for connecting to a live agent. Currently, this feature is not general available, please contact Google to get access.
     * 
    */
    public GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigResponse getHumanAgentHandoffConfig() {
        return this.humanAgentHandoffConfig;
    }
    /**
     * Language code for the conversation profile. If not specified, the language is en-US. Language at ConversationProfile should be set for all non en-us languages. This should be a [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag. Example: "en-US".
     * 
    */
    public String getLanguageCode() {
        return this.languageCode;
    }
    /**
     * Configuration for logging conversation lifecycle events.
     * 
    */
    public GoogleCloudDialogflowV2beta1LoggingConfigResponse getLoggingConfig() {
        return this.loggingConfig;
    }
    /**
     * The unique identifier of this conversation profile. Format: `projects//locations//conversationProfiles/`.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Configuration for publishing new message events. Event will be sent in format of ConversationEvent
     * 
    */
    public GoogleCloudDialogflowV2beta1NotificationConfigResponse getNewMessageEventNotificationConfig() {
        return this.newMessageEventNotificationConfig;
    }
    /**
     * Configuration for publishing conversation lifecycle events.
     * 
    */
    public GoogleCloudDialogflowV2beta1NotificationConfigResponse getNotificationConfig() {
        return this.notificationConfig;
    }
    /**
     * Name of the CX SecuritySettings reference for the agent. Format: `projects//locations//securitySettings/`.
     * 
    */
    public String getSecuritySettings() {
        return this.securitySettings;
    }
    /**
     * Settings for speech transcription.
     * 
    */
    public GoogleCloudDialogflowV2beta1SpeechToTextConfigResponse getSttConfig() {
        return this.sttConfig;
    }
    /**
     * The time zone of this conversational profile from the [time zone database](https://www.iana.org/time-zones), e.g., America/New_York, Europe/Paris. Defaults to America/New_York.
     * 
    */
    public String getTimeZone() {
        return this.timeZone;
    }
    /**
     * Update time of the conversation profile.
     * 
    */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConversationProfileResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2beta1AutomatedAgentConfigResponse automatedAgentConfig;
        private String createTime;
        private String displayName;
        private GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigResponse humanAgentAssistantConfig;
        private GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigResponse humanAgentHandoffConfig;
        private String languageCode;
        private GoogleCloudDialogflowV2beta1LoggingConfigResponse loggingConfig;
        private String name;
        private GoogleCloudDialogflowV2beta1NotificationConfigResponse newMessageEventNotificationConfig;
        private GoogleCloudDialogflowV2beta1NotificationConfigResponse notificationConfig;
        private String securitySettings;
        private GoogleCloudDialogflowV2beta1SpeechToTextConfigResponse sttConfig;
        private String timeZone;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConversationProfileResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automatedAgentConfig = defaults.automatedAgentConfig;
    	      this.createTime = defaults.createTime;
    	      this.displayName = defaults.displayName;
    	      this.humanAgentAssistantConfig = defaults.humanAgentAssistantConfig;
    	      this.humanAgentHandoffConfig = defaults.humanAgentHandoffConfig;
    	      this.languageCode = defaults.languageCode;
    	      this.loggingConfig = defaults.loggingConfig;
    	      this.name = defaults.name;
    	      this.newMessageEventNotificationConfig = defaults.newMessageEventNotificationConfig;
    	      this.notificationConfig = defaults.notificationConfig;
    	      this.securitySettings = defaults.securitySettings;
    	      this.sttConfig = defaults.sttConfig;
    	      this.timeZone = defaults.timeZone;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder automatedAgentConfig(GoogleCloudDialogflowV2beta1AutomatedAgentConfigResponse automatedAgentConfig) {
            this.automatedAgentConfig = Objects.requireNonNull(automatedAgentConfig);
            return this;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder humanAgentAssistantConfig(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigResponse humanAgentAssistantConfig) {
            this.humanAgentAssistantConfig = Objects.requireNonNull(humanAgentAssistantConfig);
            return this;
        }

        public Builder humanAgentHandoffConfig(GoogleCloudDialogflowV2beta1HumanAgentHandoffConfigResponse humanAgentHandoffConfig) {
            this.humanAgentHandoffConfig = Objects.requireNonNull(humanAgentHandoffConfig);
            return this;
        }

        public Builder languageCode(String languageCode) {
            this.languageCode = Objects.requireNonNull(languageCode);
            return this;
        }

        public Builder loggingConfig(GoogleCloudDialogflowV2beta1LoggingConfigResponse loggingConfig) {
            this.loggingConfig = Objects.requireNonNull(loggingConfig);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder newMessageEventNotificationConfig(GoogleCloudDialogflowV2beta1NotificationConfigResponse newMessageEventNotificationConfig) {
            this.newMessageEventNotificationConfig = Objects.requireNonNull(newMessageEventNotificationConfig);
            return this;
        }

        public Builder notificationConfig(GoogleCloudDialogflowV2beta1NotificationConfigResponse notificationConfig) {
            this.notificationConfig = Objects.requireNonNull(notificationConfig);
            return this;
        }

        public Builder securitySettings(String securitySettings) {
            this.securitySettings = Objects.requireNonNull(securitySettings);
            return this;
        }

        public Builder sttConfig(GoogleCloudDialogflowV2beta1SpeechToTextConfigResponse sttConfig) {
            this.sttConfig = Objects.requireNonNull(sttConfig);
            return this;
        }

        public Builder timeZone(String timeZone) {
            this.timeZone = Objects.requireNonNull(timeZone);
            return this;
        }

        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public GetConversationProfileResult build() {
            return new GetConversationProfileResult(automatedAgentConfig, createTime, displayName, humanAgentAssistantConfig, humanAgentHandoffConfig, languageCode, loggingConfig, name, newMessageEventNotificationConfig, notificationConfig, securitySettings, sttConfig, timeZone, updateTime);
        }
    }
}
