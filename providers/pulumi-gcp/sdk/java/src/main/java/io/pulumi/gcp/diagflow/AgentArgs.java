// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AgentArgs extends io.pulumi.resources.ResourceArgs {

    public static final AgentArgs Empty = new AgentArgs();

    @InputImport(name="apiVersion")
    private final @Nullable Input<String> apiVersion;

    public Input<String> getApiVersion() {
        return this.apiVersion == null ? Input.empty() : this.apiVersion;
    }

    @InputImport(name="avatarUri")
    private final @Nullable Input<String> avatarUri;

    public Input<String> getAvatarUri() {
        return this.avatarUri == null ? Input.empty() : this.avatarUri;
    }

    @InputImport(name="classificationThreshold")
    private final @Nullable Input<Double> classificationThreshold;

    public Input<Double> getClassificationThreshold() {
        return this.classificationThreshold == null ? Input.empty() : this.classificationThreshold;
    }

    @InputImport(name="defaultLanguageCode", required=true)
    private final Input<String> defaultLanguageCode;

    public Input<String> getDefaultLanguageCode() {
        return this.defaultLanguageCode;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="displayName", required=true)
    private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    @InputImport(name="enableLogging")
    private final @Nullable Input<Boolean> enableLogging;

    public Input<Boolean> getEnableLogging() {
        return this.enableLogging == null ? Input.empty() : this.enableLogging;
    }

    @InputImport(name="matchMode")
    private final @Nullable Input<String> matchMode;

    public Input<String> getMatchMode() {
        return this.matchMode == null ? Input.empty() : this.matchMode;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="supportedLanguageCodes")
    private final @Nullable Input<List<String>> supportedLanguageCodes;

    public Input<List<String>> getSupportedLanguageCodes() {
        return this.supportedLanguageCodes == null ? Input.empty() : this.supportedLanguageCodes;
    }

    @InputImport(name="tier")
    private final @Nullable Input<String> tier;

    public Input<String> getTier() {
        return this.tier == null ? Input.empty() : this.tier;
    }

    @InputImport(name="timeZone", required=true)
    private final Input<String> timeZone;

    public Input<String> getTimeZone() {
        return this.timeZone;
    }

    public AgentArgs(
        @Nullable Input<String> apiVersion,
        @Nullable Input<String> avatarUri,
        @Nullable Input<Double> classificationThreshold,
        Input<String> defaultLanguageCode,
        @Nullable Input<String> description,
        Input<String> displayName,
        @Nullable Input<Boolean> enableLogging,
        @Nullable Input<String> matchMode,
        @Nullable Input<String> project,
        @Nullable Input<List<String>> supportedLanguageCodes,
        @Nullable Input<String> tier,
        Input<String> timeZone) {
        this.apiVersion = apiVersion;
        this.avatarUri = avatarUri;
        this.classificationThreshold = classificationThreshold;
        this.defaultLanguageCode = Objects.requireNonNull(defaultLanguageCode, "expected parameter 'defaultLanguageCode' to be non-null");
        this.description = description;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.enableLogging = enableLogging;
        this.matchMode = matchMode;
        this.project = project;
        this.supportedLanguageCodes = supportedLanguageCodes;
        this.tier = tier;
        this.timeZone = Objects.requireNonNull(timeZone, "expected parameter 'timeZone' to be non-null");
    }

    private AgentArgs() {
        this.apiVersion = Input.empty();
        this.avatarUri = Input.empty();
        this.classificationThreshold = Input.empty();
        this.defaultLanguageCode = Input.empty();
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.enableLogging = Input.empty();
        this.matchMode = Input.empty();
        this.project = Input.empty();
        this.supportedLanguageCodes = Input.empty();
        this.tier = Input.empty();
        this.timeZone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AgentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> apiVersion;
        private @Nullable Input<String> avatarUri;
        private @Nullable Input<Double> classificationThreshold;
        private Input<String> defaultLanguageCode;
        private @Nullable Input<String> description;
        private Input<String> displayName;
        private @Nullable Input<Boolean> enableLogging;
        private @Nullable Input<String> matchMode;
        private @Nullable Input<String> project;
        private @Nullable Input<List<String>> supportedLanguageCodes;
        private @Nullable Input<String> tier;
        private Input<String> timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(AgentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.avatarUri = defaults.avatarUri;
    	      this.classificationThreshold = defaults.classificationThreshold;
    	      this.defaultLanguageCode = defaults.defaultLanguageCode;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.enableLogging = defaults.enableLogging;
    	      this.matchMode = defaults.matchMode;
    	      this.project = defaults.project;
    	      this.supportedLanguageCodes = defaults.supportedLanguageCodes;
    	      this.tier = defaults.tier;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder setApiVersion(@Nullable Input<String> apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder setApiVersion(@Nullable String apiVersion) {
            this.apiVersion = Input.ofNullable(apiVersion);
            return this;
        }

        public Builder setAvatarUri(@Nullable Input<String> avatarUri) {
            this.avatarUri = avatarUri;
            return this;
        }

        public Builder setAvatarUri(@Nullable String avatarUri) {
            this.avatarUri = Input.ofNullable(avatarUri);
            return this;
        }

        public Builder setClassificationThreshold(@Nullable Input<Double> classificationThreshold) {
            this.classificationThreshold = classificationThreshold;
            return this;
        }

        public Builder setClassificationThreshold(@Nullable Double classificationThreshold) {
            this.classificationThreshold = Input.ofNullable(classificationThreshold);
            return this;
        }

        public Builder setDefaultLanguageCode(Input<String> defaultLanguageCode) {
            this.defaultLanguageCode = Objects.requireNonNull(defaultLanguageCode);
            return this;
        }

        public Builder setDefaultLanguageCode(String defaultLanguageCode) {
            this.defaultLanguageCode = Input.of(Objects.requireNonNull(defaultLanguageCode));
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDisplayName(Input<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Input.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder setEnableLogging(@Nullable Input<Boolean> enableLogging) {
            this.enableLogging = enableLogging;
            return this;
        }

        public Builder setEnableLogging(@Nullable Boolean enableLogging) {
            this.enableLogging = Input.ofNullable(enableLogging);
            return this;
        }

        public Builder setMatchMode(@Nullable Input<String> matchMode) {
            this.matchMode = matchMode;
            return this;
        }

        public Builder setMatchMode(@Nullable String matchMode) {
            this.matchMode = Input.ofNullable(matchMode);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setSupportedLanguageCodes(@Nullable Input<List<String>> supportedLanguageCodes) {
            this.supportedLanguageCodes = supportedLanguageCodes;
            return this;
        }

        public Builder setSupportedLanguageCodes(@Nullable List<String> supportedLanguageCodes) {
            this.supportedLanguageCodes = Input.ofNullable(supportedLanguageCodes);
            return this;
        }

        public Builder setTier(@Nullable Input<String> tier) {
            this.tier = tier;
            return this;
        }

        public Builder setTier(@Nullable String tier) {
            this.tier = Input.ofNullable(tier);
            return this;
        }

        public Builder setTimeZone(Input<String> timeZone) {
            this.timeZone = Objects.requireNonNull(timeZone);
            return this;
        }

        public Builder setTimeZone(String timeZone) {
            this.timeZone = Input.of(Objects.requireNonNull(timeZone));
            return this;
        }

        public AgentArgs build() {
            return new AgentArgs(apiVersion, avatarUri, classificationThreshold, defaultLanguageCode, description, displayName, enableLogging, matchMode, project, supportedLanguageCodes, tier, timeZone);
        }
    }
}