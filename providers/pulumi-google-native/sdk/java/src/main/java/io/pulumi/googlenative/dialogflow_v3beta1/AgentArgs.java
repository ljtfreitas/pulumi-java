// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1AdvancedSettingsArgs;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1SpeechToTextSettingsArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AgentArgs extends io.pulumi.resources.ResourceArgs {

    public static final AgentArgs Empty = new AgentArgs();

    /**
     * Hierarchical advanced settings for this agent. The settings exposed at the lower level overrides the settings exposed at the higher level.
     * 
     */
    @Import(name="advancedSettings")
      private final @Nullable Output<GoogleCloudDialogflowCxV3beta1AdvancedSettingsArgs> advancedSettings;

    public Output<GoogleCloudDialogflowCxV3beta1AdvancedSettingsArgs> getAdvancedSettings() {
        return this.advancedSettings == null ? Output.empty() : this.advancedSettings;
    }

    /**
     * The URI of the agent's avatar. Avatars are used throughout the Dialogflow console and in the self-hosted [Web Demo](https://cloud.google.com/dialogflow/docs/integrations/web-demo) integration.
     * 
     */
    @Import(name="avatarUri")
      private final @Nullable Output<String> avatarUri;

    public Output<String> getAvatarUri() {
        return this.avatarUri == null ? Output.empty() : this.avatarUri;
    }

    /**
     * Immutable. The default language of the agent as a language tag. See [Language Support](https://cloud.google.com/dialogflow/cx/docs/reference/language) for a list of the currently supported language codes. This field cannot be set by the Agents.UpdateAgent method.
     * 
     */
    @Import(name="defaultLanguageCode", required=true)
      private final Output<String> defaultLanguageCode;

    public Output<String> getDefaultLanguageCode() {
        return this.defaultLanguageCode;
    }

    /**
     * The description of the agent. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The human-readable name of the agent, unique within the location.
     * 
     */
    @Import(name="displayName", required=true)
      private final Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * Indicates if automatic spell correction is enabled in detect intent requests.
     * 
     */
    @Import(name="enableSpellCorrection")
      private final @Nullable Output<Boolean> enableSpellCorrection;

    public Output<Boolean> getEnableSpellCorrection() {
        return this.enableSpellCorrection == null ? Output.empty() : this.enableSpellCorrection;
    }

    /**
     * Indicates if stackdriver logging is enabled for the agent. Please use agent.advanced_settings instead.
     * 
     */
    @Import(name="enableStackdriverLogging")
      private final @Nullable Output<Boolean> enableStackdriverLogging;

    public Output<Boolean> getEnableStackdriverLogging() {
        return this.enableStackdriverLogging == null ? Output.empty() : this.enableStackdriverLogging;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The unique identifier of the agent. Required for the Agents.UpdateAgent method. Agents.CreateAgent populates the name automatically. Format: `projects//locations//agents/`.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * Name of the SecuritySettings reference for the agent. Format: `projects//locations//securitySettings/`.
     * 
     */
    @Import(name="securitySettings")
      private final @Nullable Output<String> securitySettings;

    public Output<String> getSecuritySettings() {
        return this.securitySettings == null ? Output.empty() : this.securitySettings;
    }

    /**
     * Speech recognition related settings.
     * 
     */
    @Import(name="speechToTextSettings")
      private final @Nullable Output<GoogleCloudDialogflowCxV3beta1SpeechToTextSettingsArgs> speechToTextSettings;

    public Output<GoogleCloudDialogflowCxV3beta1SpeechToTextSettingsArgs> getSpeechToTextSettings() {
        return this.speechToTextSettings == null ? Output.empty() : this.speechToTextSettings;
    }

    /**
     * Immutable. Name of the start flow in this agent. A start flow will be automatically created when the agent is created, and can only be deleted by deleting the agent. Format: `projects//locations//agents//flows/`.
     * 
     */
    @Import(name="startFlow")
      private final @Nullable Output<String> startFlow;

    public Output<String> getStartFlow() {
        return this.startFlow == null ? Output.empty() : this.startFlow;
    }

    /**
     * The list of all languages supported by the agent (except for the `default_language_code`).
     * 
     */
    @Import(name="supportedLanguageCodes")
      private final @Nullable Output<List<String>> supportedLanguageCodes;

    public Output<List<String>> getSupportedLanguageCodes() {
        return this.supportedLanguageCodes == null ? Output.empty() : this.supportedLanguageCodes;
    }

    /**
     * The time zone of the agent from the [time zone database](https://www.iana.org/time-zones), e.g., America/New_York, Europe/Paris.
     * 
     */
    @Import(name="timeZone", required=true)
      private final Output<String> timeZone;

    public Output<String> getTimeZone() {
        return this.timeZone;
    }

    public AgentArgs(
        @Nullable Output<GoogleCloudDialogflowCxV3beta1AdvancedSettingsArgs> advancedSettings,
        @Nullable Output<String> avatarUri,
        Output<String> defaultLanguageCode,
        @Nullable Output<String> description,
        Output<String> displayName,
        @Nullable Output<Boolean> enableSpellCorrection,
        @Nullable Output<Boolean> enableStackdriverLogging,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> securitySettings,
        @Nullable Output<GoogleCloudDialogflowCxV3beta1SpeechToTextSettingsArgs> speechToTextSettings,
        @Nullable Output<String> startFlow,
        @Nullable Output<List<String>> supportedLanguageCodes,
        Output<String> timeZone) {
        this.advancedSettings = advancedSettings;
        this.avatarUri = avatarUri;
        this.defaultLanguageCode = Objects.requireNonNull(defaultLanguageCode, "expected parameter 'defaultLanguageCode' to be non-null");
        this.description = description;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.enableSpellCorrection = enableSpellCorrection;
        this.enableStackdriverLogging = enableStackdriverLogging;
        this.location = location;
        this.name = name;
        this.project = project;
        this.securitySettings = securitySettings;
        this.speechToTextSettings = speechToTextSettings;
        this.startFlow = startFlow;
        this.supportedLanguageCodes = supportedLanguageCodes;
        this.timeZone = Objects.requireNonNull(timeZone, "expected parameter 'timeZone' to be non-null");
    }

    private AgentArgs() {
        this.advancedSettings = Output.empty();
        this.avatarUri = Output.empty();
        this.defaultLanguageCode = Output.empty();
        this.description = Output.empty();
        this.displayName = Output.empty();
        this.enableSpellCorrection = Output.empty();
        this.enableStackdriverLogging = Output.empty();
        this.location = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.securitySettings = Output.empty();
        this.speechToTextSettings = Output.empty();
        this.startFlow = Output.empty();
        this.supportedLanguageCodes = Output.empty();
        this.timeZone = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AgentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<GoogleCloudDialogflowCxV3beta1AdvancedSettingsArgs> advancedSettings;
        private @Nullable Output<String> avatarUri;
        private Output<String> defaultLanguageCode;
        private @Nullable Output<String> description;
        private Output<String> displayName;
        private @Nullable Output<Boolean> enableSpellCorrection;
        private @Nullable Output<Boolean> enableStackdriverLogging;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> securitySettings;
        private @Nullable Output<GoogleCloudDialogflowCxV3beta1SpeechToTextSettingsArgs> speechToTextSettings;
        private @Nullable Output<String> startFlow;
        private @Nullable Output<List<String>> supportedLanguageCodes;
        private Output<String> timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(AgentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advancedSettings = defaults.advancedSettings;
    	      this.avatarUri = defaults.avatarUri;
    	      this.defaultLanguageCode = defaults.defaultLanguageCode;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.enableSpellCorrection = defaults.enableSpellCorrection;
    	      this.enableStackdriverLogging = defaults.enableStackdriverLogging;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.securitySettings = defaults.securitySettings;
    	      this.speechToTextSettings = defaults.speechToTextSettings;
    	      this.startFlow = defaults.startFlow;
    	      this.supportedLanguageCodes = defaults.supportedLanguageCodes;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder advancedSettings(@Nullable Output<GoogleCloudDialogflowCxV3beta1AdvancedSettingsArgs> advancedSettings) {
            this.advancedSettings = advancedSettings;
            return this;
        }

        public Builder advancedSettings(@Nullable GoogleCloudDialogflowCxV3beta1AdvancedSettingsArgs advancedSettings) {
            this.advancedSettings = Output.ofNullable(advancedSettings);
            return this;
        }

        public Builder avatarUri(@Nullable Output<String> avatarUri) {
            this.avatarUri = avatarUri;
            return this;
        }

        public Builder avatarUri(@Nullable String avatarUri) {
            this.avatarUri = Output.ofNullable(avatarUri);
            return this;
        }

        public Builder defaultLanguageCode(Output<String> defaultLanguageCode) {
            this.defaultLanguageCode = Objects.requireNonNull(defaultLanguageCode);
            return this;
        }

        public Builder defaultLanguageCode(String defaultLanguageCode) {
            this.defaultLanguageCode = Output.of(Objects.requireNonNull(defaultLanguageCode));
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
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

        public Builder enableSpellCorrection(@Nullable Output<Boolean> enableSpellCorrection) {
            this.enableSpellCorrection = enableSpellCorrection;
            return this;
        }

        public Builder enableSpellCorrection(@Nullable Boolean enableSpellCorrection) {
            this.enableSpellCorrection = Output.ofNullable(enableSpellCorrection);
            return this;
        }

        public Builder enableStackdriverLogging(@Nullable Output<Boolean> enableStackdriverLogging) {
            this.enableStackdriverLogging = enableStackdriverLogging;
            return this;
        }

        public Builder enableStackdriverLogging(@Nullable Boolean enableStackdriverLogging) {
            this.enableStackdriverLogging = Output.ofNullable(enableStackdriverLogging);
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

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
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

        public Builder speechToTextSettings(@Nullable Output<GoogleCloudDialogflowCxV3beta1SpeechToTextSettingsArgs> speechToTextSettings) {
            this.speechToTextSettings = speechToTextSettings;
            return this;
        }

        public Builder speechToTextSettings(@Nullable GoogleCloudDialogflowCxV3beta1SpeechToTextSettingsArgs speechToTextSettings) {
            this.speechToTextSettings = Output.ofNullable(speechToTextSettings);
            return this;
        }

        public Builder startFlow(@Nullable Output<String> startFlow) {
            this.startFlow = startFlow;
            return this;
        }

        public Builder startFlow(@Nullable String startFlow) {
            this.startFlow = Output.ofNullable(startFlow);
            return this;
        }

        public Builder supportedLanguageCodes(@Nullable Output<List<String>> supportedLanguageCodes) {
            this.supportedLanguageCodes = supportedLanguageCodes;
            return this;
        }

        public Builder supportedLanguageCodes(@Nullable List<String> supportedLanguageCodes) {
            this.supportedLanguageCodes = Output.ofNullable(supportedLanguageCodes);
            return this;
        }

        public Builder timeZone(Output<String> timeZone) {
            this.timeZone = Objects.requireNonNull(timeZone);
            return this;
        }

        public Builder timeZone(String timeZone) {
            this.timeZone = Output.of(Objects.requireNonNull(timeZone));
            return this;
        }
        public AgentArgs build() {
            return new AgentArgs(advancedSettings, avatarUri, defaultLanguageCode, description, displayName, enableSpellCorrection, enableStackdriverLogging, location, name, project, securitySettings, speechToTextSettings, startFlow, supportedLanguageCodes, timeZone);
        }
    }
}
