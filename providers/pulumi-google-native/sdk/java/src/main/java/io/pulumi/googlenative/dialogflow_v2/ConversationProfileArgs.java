// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2AutomatedAgentConfigArgs;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2HumanAgentAssistantConfigArgs;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2HumanAgentHandoffConfigArgs;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2LoggingConfigArgs;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2NotificationConfigArgs;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2SpeechToTextConfigArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConversationProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConversationProfileArgs Empty = new ConversationProfileArgs();

    /**
     * Configuration for an automated agent to use with this profile.
     * 
     */
    @Import(name="automatedAgentConfig")
      private final @Nullable Output<GoogleCloudDialogflowV2AutomatedAgentConfigArgs> automatedAgentConfig;

    public Output<GoogleCloudDialogflowV2AutomatedAgentConfigArgs> getAutomatedAgentConfig() {
        return this.automatedAgentConfig == null ? Output.empty() : this.automatedAgentConfig;
    }

    /**
     * Human readable name for this profile. Max length 1024 bytes.
     * 
     */
    @Import(name="displayName", required=true)
      private final Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * Configuration for agent assistance to use with this profile.
     * 
     */
    @Import(name="humanAgentAssistantConfig")
      private final @Nullable Output<GoogleCloudDialogflowV2HumanAgentAssistantConfigArgs> humanAgentAssistantConfig;

    public Output<GoogleCloudDialogflowV2HumanAgentAssistantConfigArgs> getHumanAgentAssistantConfig() {
        return this.humanAgentAssistantConfig == null ? Output.empty() : this.humanAgentAssistantConfig;
    }

    /**
     * Configuration for connecting to a live agent. Currently, this feature is not general available, please contact Google to get access.
     * 
     */
    @Import(name="humanAgentHandoffConfig")
      private final @Nullable Output<GoogleCloudDialogflowV2HumanAgentHandoffConfigArgs> humanAgentHandoffConfig;

    public Output<GoogleCloudDialogflowV2HumanAgentHandoffConfigArgs> getHumanAgentHandoffConfig() {
        return this.humanAgentHandoffConfig == null ? Output.empty() : this.humanAgentHandoffConfig;
    }

    /**
     * Language code for the conversation profile. If not specified, the language is en-US. Language at ConversationProfile should be set for all non en-US languages. This should be a [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag. Example: "en-US".
     * 
     */
    @Import(name="languageCode")
      private final @Nullable Output<String> languageCode;

    public Output<String> getLanguageCode() {
        return this.languageCode == null ? Output.empty() : this.languageCode;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * Configuration for logging conversation lifecycle events.
     * 
     */
    @Import(name="loggingConfig")
      private final @Nullable Output<GoogleCloudDialogflowV2LoggingConfigArgs> loggingConfig;

    public Output<GoogleCloudDialogflowV2LoggingConfigArgs> getLoggingConfig() {
        return this.loggingConfig == null ? Output.empty() : this.loggingConfig;
    }

    /**
     * The unique identifier of this conversation profile. Format: `projects//locations//conversationProfiles/`.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Configuration for publishing new message events. Event will be sent in format of ConversationEvent
     * 
     */
    @Import(name="newMessageEventNotificationConfig")
      private final @Nullable Output<GoogleCloudDialogflowV2NotificationConfigArgs> newMessageEventNotificationConfig;

    public Output<GoogleCloudDialogflowV2NotificationConfigArgs> getNewMessageEventNotificationConfig() {
        return this.newMessageEventNotificationConfig == null ? Output.empty() : this.newMessageEventNotificationConfig;
    }

    /**
     * Configuration for publishing conversation lifecycle events.
     * 
     */
    @Import(name="notificationConfig")
      private final @Nullable Output<GoogleCloudDialogflowV2NotificationConfigArgs> notificationConfig;

    public Output<GoogleCloudDialogflowV2NotificationConfigArgs> getNotificationConfig() {
        return this.notificationConfig == null ? Output.empty() : this.notificationConfig;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * Name of the CX SecuritySettings reference for the agent. Format: `projects//locations//securitySettings/`.
     * 
     */
    @Import(name="securitySettings")
      private final @Nullable Output<String> securitySettings;

    public Output<String> getSecuritySettings() {
        return this.securitySettings == null ? Output.empty() : this.securitySettings;
    }

    /**
     * Settings for speech transcription.
     * 
     */
    @Import(name="sttConfig")
      private final @Nullable Output<GoogleCloudDialogflowV2SpeechToTextConfigArgs> sttConfig;

    public Output<GoogleCloudDialogflowV2SpeechToTextConfigArgs> getSttConfig() {
        return this.sttConfig == null ? Output.empty() : this.sttConfig;
    }

    /**
     * The time zone of this conversational profile from the [time zone database](https://www.iana.org/time-zones), e.g., America/New_York, Europe/Paris. Defaults to America/New_York.
     * 
     */
    @Import(name="timeZone")
      private final @Nullable Output<String> timeZone;

    public Output<String> getTimeZone() {
        return this.timeZone == null ? Output.empty() : this.timeZone;
    }

    public ConversationProfileArgs(
        @Nullable Output<GoogleCloudDialogflowV2AutomatedAgentConfigArgs> automatedAgentConfig,
        Output<String> displayName,
        @Nullable Output<GoogleCloudDialogflowV2HumanAgentAssistantConfigArgs> humanAgentAssistantConfig,
        @Nullable Output<GoogleCloudDialogflowV2HumanAgentHandoffConfigArgs> humanAgentHandoffConfig,
        @Nullable Output<String> languageCode,
        @Nullable Output<String> location,
        @Nullable Output<GoogleCloudDialogflowV2LoggingConfigArgs> loggingConfig,
        @Nullable Output<String> name,
        @Nullable Output<GoogleCloudDialogflowV2NotificationConfigArgs> newMessageEventNotificationConfig,
        @Nullable Output<GoogleCloudDialogflowV2NotificationConfigArgs> notificationConfig,
        @Nullable Output<String> project,
        @Nullable Output<String> securitySettings,
        @Nullable Output<GoogleCloudDialogflowV2SpeechToTextConfigArgs> sttConfig,
        @Nullable Output<String> timeZone) {
        this.automatedAgentConfig = automatedAgentConfig;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.humanAgentAssistantConfig = humanAgentAssistantConfig;
        this.humanAgentHandoffConfig = humanAgentHandoffConfig;
        this.languageCode = languageCode;
        this.location = location;
        this.loggingConfig = loggingConfig;
        this.name = name;
        this.newMessageEventNotificationConfig = newMessageEventNotificationConfig;
        this.notificationConfig = notificationConfig;
        this.project = project;
        this.securitySettings = securitySettings;
        this.sttConfig = sttConfig;
        this.timeZone = timeZone;
    }

    private ConversationProfileArgs() {
        this.automatedAgentConfig = Output.empty();
        this.displayName = Output.empty();
        this.humanAgentAssistantConfig = Output.empty();
        this.humanAgentHandoffConfig = Output.empty();
        this.languageCode = Output.empty();
        this.location = Output.empty();
        this.loggingConfig = Output.empty();
        this.name = Output.empty();
        this.newMessageEventNotificationConfig = Output.empty();
        this.notificationConfig = Output.empty();
        this.project = Output.empty();
        this.securitySettings = Output.empty();
        this.sttConfig = Output.empty();
        this.timeZone = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConversationProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<GoogleCloudDialogflowV2AutomatedAgentConfigArgs> automatedAgentConfig;
        private Output<String> displayName;
        private @Nullable Output<GoogleCloudDialogflowV2HumanAgentAssistantConfigArgs> humanAgentAssistantConfig;
        private @Nullable Output<GoogleCloudDialogflowV2HumanAgentHandoffConfigArgs> humanAgentHandoffConfig;
        private @Nullable Output<String> languageCode;
        private @Nullable Output<String> location;
        private @Nullable Output<GoogleCloudDialogflowV2LoggingConfigArgs> loggingConfig;
        private @Nullable Output<String> name;
        private @Nullable Output<GoogleCloudDialogflowV2NotificationConfigArgs> newMessageEventNotificationConfig;
        private @Nullable Output<GoogleCloudDialogflowV2NotificationConfigArgs> notificationConfig;
        private @Nullable Output<String> project;
        private @Nullable Output<String> securitySettings;
        private @Nullable Output<GoogleCloudDialogflowV2SpeechToTextConfigArgs> sttConfig;
        private @Nullable Output<String> timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(ConversationProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automatedAgentConfig = defaults.automatedAgentConfig;
    	      this.displayName = defaults.displayName;
    	      this.humanAgentAssistantConfig = defaults.humanAgentAssistantConfig;
    	      this.humanAgentHandoffConfig = defaults.humanAgentHandoffConfig;
    	      this.languageCode = defaults.languageCode;
    	      this.location = defaults.location;
    	      this.loggingConfig = defaults.loggingConfig;
    	      this.name = defaults.name;
    	      this.newMessageEventNotificationConfig = defaults.newMessageEventNotificationConfig;
    	      this.notificationConfig = defaults.notificationConfig;
    	      this.project = defaults.project;
    	      this.securitySettings = defaults.securitySettings;
    	      this.sttConfig = defaults.sttConfig;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder automatedAgentConfig(@Nullable Output<GoogleCloudDialogflowV2AutomatedAgentConfigArgs> automatedAgentConfig) {
            this.automatedAgentConfig = automatedAgentConfig;
            return this;
        }

        public Builder automatedAgentConfig(@Nullable GoogleCloudDialogflowV2AutomatedAgentConfigArgs automatedAgentConfig) {
            this.automatedAgentConfig = Output.ofNullable(automatedAgentConfig);
            return this;
        }

        public Builder displayName(Output<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = Output.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder humanAgentAssistantConfig(@Nullable Output<GoogleCloudDialogflowV2HumanAgentAssistantConfigArgs> humanAgentAssistantConfig) {
            this.humanAgentAssistantConfig = humanAgentAssistantConfig;
            return this;
        }

        public Builder humanAgentAssistantConfig(@Nullable GoogleCloudDialogflowV2HumanAgentAssistantConfigArgs humanAgentAssistantConfig) {
            this.humanAgentAssistantConfig = Output.ofNullable(humanAgentAssistantConfig);
            return this;
        }

        public Builder humanAgentHandoffConfig(@Nullable Output<GoogleCloudDialogflowV2HumanAgentHandoffConfigArgs> humanAgentHandoffConfig) {
            this.humanAgentHandoffConfig = humanAgentHandoffConfig;
            return this;
        }

        public Builder humanAgentHandoffConfig(@Nullable GoogleCloudDialogflowV2HumanAgentHandoffConfigArgs humanAgentHandoffConfig) {
            this.humanAgentHandoffConfig = Output.ofNullable(humanAgentHandoffConfig);
            return this;
        }

        public Builder languageCode(@Nullable Output<String> languageCode) {
            this.languageCode = languageCode;
            return this;
        }

        public Builder languageCode(@Nullable String languageCode) {
            this.languageCode = Output.ofNullable(languageCode);
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder loggingConfig(@Nullable Output<GoogleCloudDialogflowV2LoggingConfigArgs> loggingConfig) {
            this.loggingConfig = loggingConfig;
            return this;
        }

        public Builder loggingConfig(@Nullable GoogleCloudDialogflowV2LoggingConfigArgs loggingConfig) {
            this.loggingConfig = Output.ofNullable(loggingConfig);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder newMessageEventNotificationConfig(@Nullable Output<GoogleCloudDialogflowV2NotificationConfigArgs> newMessageEventNotificationConfig) {
            this.newMessageEventNotificationConfig = newMessageEventNotificationConfig;
            return this;
        }

        public Builder newMessageEventNotificationConfig(@Nullable GoogleCloudDialogflowV2NotificationConfigArgs newMessageEventNotificationConfig) {
            this.newMessageEventNotificationConfig = Output.ofNullable(newMessageEventNotificationConfig);
            return this;
        }

        public Builder notificationConfig(@Nullable Output<GoogleCloudDialogflowV2NotificationConfigArgs> notificationConfig) {
            this.notificationConfig = notificationConfig;
            return this;
        }

        public Builder notificationConfig(@Nullable GoogleCloudDialogflowV2NotificationConfigArgs notificationConfig) {
            this.notificationConfig = Output.ofNullable(notificationConfig);
            return this;
        }

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }

        public Builder securitySettings(@Nullable Output<String> securitySettings) {
            this.securitySettings = securitySettings;
            return this;
        }

        public Builder securitySettings(@Nullable String securitySettings) {
            this.securitySettings = Output.ofNullable(securitySettings);
            return this;
        }

        public Builder sttConfig(@Nullable Output<GoogleCloudDialogflowV2SpeechToTextConfigArgs> sttConfig) {
            this.sttConfig = sttConfig;
            return this;
        }

        public Builder sttConfig(@Nullable GoogleCloudDialogflowV2SpeechToTextConfigArgs sttConfig) {
            this.sttConfig = Output.ofNullable(sttConfig);
            return this;
        }

        public Builder timeZone(@Nullable Output<String> timeZone) {
            this.timeZone = timeZone;
            return this;
        }

        public Builder timeZone(@Nullable String timeZone) {
            this.timeZone = Output.ofNullable(timeZone);
            return this;
        }
        public ConversationProfileArgs build() {
            return new ConversationProfileArgs(automatedAgentConfig, displayName, humanAgentAssistantConfig, humanAgentHandoffConfig, languageCode, location, loggingConfig, name, newMessageEventNotificationConfig, notificationConfig, project, securitySettings, sttConfig, timeZone);
        }
    }
}
