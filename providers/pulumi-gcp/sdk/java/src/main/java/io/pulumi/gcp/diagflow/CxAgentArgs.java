// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.diagflow.inputs.CxAgentSpeechToTextSettingsArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CxAgentArgs extends io.pulumi.resources.ResourceArgs {

    public static final CxAgentArgs Empty = new CxAgentArgs();

    /**
     * The URI of the agent's avatar. Avatars are used throughout the Dialogflow console and in the self-hosted Web Demo integration.
     * 
     */
    @Import(name="avatarUri")
      private final @Nullable Output<String> avatarUri;

    public Output<String> avatarUri() {
        return this.avatarUri == null ? Codegen.empty() : this.avatarUri;
    }

    /**
     * The default language of the agent as a language tag. [See Language Support](https://cloud.google.com/dialogflow/cx/docs/reference/language)
     * for a list of the currently supported language codes. This field cannot be updated after creation.
     * 
     */
    @Import(name="defaultLanguageCode", required=true)
      private final Output<String> defaultLanguageCode;

    public Output<String> defaultLanguageCode() {
        return this.defaultLanguageCode;
    }

    /**
     * The description of this agent. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The human-readable name of the agent, unique within the location.
     * 
     */
    @Import(name="displayName", required=true)
      private final Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * Indicates if automatic spell correction is enabled in detect intent requests.
     * 
     */
    @Import(name="enableSpellCorrection")
      private final @Nullable Output<Boolean> enableSpellCorrection;

    public Output<Boolean> enableSpellCorrection() {
        return this.enableSpellCorrection == null ? Codegen.empty() : this.enableSpellCorrection;
    }

    /**
     * Determines whether this agent should log conversation queries.
     * 
     */
    @Import(name="enableStackdriverLogging")
      private final @Nullable Output<Boolean> enableStackdriverLogging;

    public Output<Boolean> enableStackdriverLogging() {
        return this.enableStackdriverLogging == null ? Codegen.empty() : this.enableStackdriverLogging;
    }

    /**
     * The name of the location this agent is located in.
     * > **Note:** The first time you are deploying an Agent in your project you must configure location settings.
     * This is a one time step but at the moment you can only [configure location settings](https://cloud.google.com/dialogflow/cx/docs/concept/region#location-settings) via the Dialogflow CX console.
     * Another options is to use global location so you don't need to manually configure location settings.
     * 
     */
    @Import(name="location", required=true)
      private final Output<String> location;

    public Output<String> location() {
        return this.location;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * Name of the SecuritySettings reference for the agent. Format: projects/<Project ID>/locations/<Location ID>/securitySettings/<Security Settings ID>.
     * 
     */
    @Import(name="securitySettings")
      private final @Nullable Output<String> securitySettings;

    public Output<String> securitySettings() {
        return this.securitySettings == null ? Codegen.empty() : this.securitySettings;
    }

    /**
     * Settings related to speech recognition.
     * Structure is documented below.
     * 
     */
    @Import(name="speechToTextSettings")
      private final @Nullable Output<CxAgentSpeechToTextSettingsArgs> speechToTextSettings;

    public Output<CxAgentSpeechToTextSettingsArgs> speechToTextSettings() {
        return this.speechToTextSettings == null ? Codegen.empty() : this.speechToTextSettings;
    }

    /**
     * The list of all languages supported by this agent (except for the default_language_code).
     * 
     */
    @Import(name="supportedLanguageCodes")
      private final @Nullable Output<List<String>> supportedLanguageCodes;

    public Output<List<String>> supportedLanguageCodes() {
        return this.supportedLanguageCodes == null ? Codegen.empty() : this.supportedLanguageCodes;
    }

    /**
     * The time zone of this agent from the [time zone database](https://www.iana.org/time-zones), e.g., America/New_York,
     * Europe/Paris.
     * 
     */
    @Import(name="timeZone", required=true)
      private final Output<String> timeZone;

    public Output<String> timeZone() {
        return this.timeZone;
    }

    public CxAgentArgs(
        @Nullable Output<String> avatarUri,
        Output<String> defaultLanguageCode,
        @Nullable Output<String> description,
        Output<String> displayName,
        @Nullable Output<Boolean> enableSpellCorrection,
        @Nullable Output<Boolean> enableStackdriverLogging,
        Output<String> location,
        @Nullable Output<String> project,
        @Nullable Output<String> securitySettings,
        @Nullable Output<CxAgentSpeechToTextSettingsArgs> speechToTextSettings,
        @Nullable Output<List<String>> supportedLanguageCodes,
        Output<String> timeZone) {
        this.avatarUri = avatarUri;
        this.defaultLanguageCode = Objects.requireNonNull(defaultLanguageCode, "expected parameter 'defaultLanguageCode' to be non-null");
        this.description = description;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.enableSpellCorrection = enableSpellCorrection;
        this.enableStackdriverLogging = enableStackdriverLogging;
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
        this.securitySettings = securitySettings;
        this.speechToTextSettings = speechToTextSettings;
        this.supportedLanguageCodes = supportedLanguageCodes;
        this.timeZone = Objects.requireNonNull(timeZone, "expected parameter 'timeZone' to be non-null");
    }

    private CxAgentArgs() {
        this.avatarUri = Codegen.empty();
        this.defaultLanguageCode = Codegen.empty();
        this.description = Codegen.empty();
        this.displayName = Codegen.empty();
        this.enableSpellCorrection = Codegen.empty();
        this.enableStackdriverLogging = Codegen.empty();
        this.location = Codegen.empty();
        this.project = Codegen.empty();
        this.securitySettings = Codegen.empty();
        this.speechToTextSettings = Codegen.empty();
        this.supportedLanguageCodes = Codegen.empty();
        this.timeZone = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxAgentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> avatarUri;
        private Output<String> defaultLanguageCode;
        private @Nullable Output<String> description;
        private Output<String> displayName;
        private @Nullable Output<Boolean> enableSpellCorrection;
        private @Nullable Output<Boolean> enableStackdriverLogging;
        private Output<String> location;
        private @Nullable Output<String> project;
        private @Nullable Output<String> securitySettings;
        private @Nullable Output<CxAgentSpeechToTextSettingsArgs> speechToTextSettings;
        private @Nullable Output<List<String>> supportedLanguageCodes;
        private Output<String> timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(CxAgentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.avatarUri = defaults.avatarUri;
    	      this.defaultLanguageCode = defaults.defaultLanguageCode;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.enableSpellCorrection = defaults.enableSpellCorrection;
    	      this.enableStackdriverLogging = defaults.enableStackdriverLogging;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.securitySettings = defaults.securitySettings;
    	      this.speechToTextSettings = defaults.speechToTextSettings;
    	      this.supportedLanguageCodes = defaults.supportedLanguageCodes;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder avatarUri(@Nullable Output<String> avatarUri) {
            this.avatarUri = avatarUri;
            return this;
        }
        public Builder avatarUri(@Nullable String avatarUri) {
            this.avatarUri = Codegen.ofNullable(avatarUri);
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
            this.description = Codegen.ofNullable(description);
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
            this.enableSpellCorrection = Codegen.ofNullable(enableSpellCorrection);
            return this;
        }
        public Builder enableStackdriverLogging(@Nullable Output<Boolean> enableStackdriverLogging) {
            this.enableStackdriverLogging = enableStackdriverLogging;
            return this;
        }
        public Builder enableStackdriverLogging(@Nullable Boolean enableStackdriverLogging) {
            this.enableStackdriverLogging = Codegen.ofNullable(enableStackdriverLogging);
            return this;
        }
        public Builder location(Output<String> location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder location(String location) {
            this.location = Output.of(Objects.requireNonNull(location));
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder securitySettings(@Nullable Output<String> securitySettings) {
            this.securitySettings = securitySettings;
            return this;
        }
        public Builder securitySettings(@Nullable String securitySettings) {
            this.securitySettings = Codegen.ofNullable(securitySettings);
            return this;
        }
        public Builder speechToTextSettings(@Nullable Output<CxAgentSpeechToTextSettingsArgs> speechToTextSettings) {
            this.speechToTextSettings = speechToTextSettings;
            return this;
        }
        public Builder speechToTextSettings(@Nullable CxAgentSpeechToTextSettingsArgs speechToTextSettings) {
            this.speechToTextSettings = Codegen.ofNullable(speechToTextSettings);
            return this;
        }
        public Builder supportedLanguageCodes(@Nullable Output<List<String>> supportedLanguageCodes) {
            this.supportedLanguageCodes = supportedLanguageCodes;
            return this;
        }
        public Builder supportedLanguageCodes(@Nullable List<String> supportedLanguageCodes) {
            this.supportedLanguageCodes = Codegen.ofNullable(supportedLanguageCodes);
            return this;
        }
        public Builder supportedLanguageCodes(String... supportedLanguageCodes) {
            return supportedLanguageCodes(List.of(supportedLanguageCodes));
        }
        public Builder timeZone(Output<String> timeZone) {
            this.timeZone = Objects.requireNonNull(timeZone);
            return this;
        }
        public Builder timeZone(String timeZone) {
            this.timeZone = Output.of(Objects.requireNonNull(timeZone));
            return this;
        }        public CxAgentArgs build() {
            return new CxAgentArgs(avatarUri, defaultLanguageCode, description, displayName, enableSpellCorrection, enableStackdriverLogging, location, project, securitySettings, speechToTextSettings, supportedLanguageCodes, timeZone);
        }
    }
}
