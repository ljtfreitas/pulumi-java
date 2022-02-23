// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Static definitions of the ProactiveDetection configuration rule (same values for all components).
 * 
 */
public final class ApplicationInsightsComponentProactiveDetectionConfigurationResponseRuleDefinitions extends io.pulumi.resources.InvokeArgs {

    public static final ApplicationInsightsComponentProactiveDetectionConfigurationResponseRuleDefinitions Empty = new ApplicationInsightsComponentProactiveDetectionConfigurationResponseRuleDefinitions();

    /**
     * The rule description
     * 
     */
    @InputImport(name="description")
        private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * The rule name as it is displayed in UI
     * 
     */
    @InputImport(name="displayName")
        private final @Nullable String displayName;

    public Optional<String> getDisplayName() {
        return this.displayName == null ? Optional.empty() : Optional.ofNullable(this.displayName);
    }

    /**
     * URL which displays additional info about the proactive detection rule
     * 
     */
    @InputImport(name="helpUrl")
        private final @Nullable String helpUrl;

    public Optional<String> getHelpUrl() {
        return this.helpUrl == null ? Optional.empty() : Optional.ofNullable(this.helpUrl);
    }

    /**
     * A flag indicating whether the rule is enabled by default
     * 
     */
    @InputImport(name="isEnabledByDefault")
        private final @Nullable Boolean isEnabledByDefault;

    public Optional<Boolean> getIsEnabledByDefault() {
        return this.isEnabledByDefault == null ? Optional.empty() : Optional.ofNullable(this.isEnabledByDefault);
    }

    /**
     * A flag indicating whether the rule is hidden (from the UI)
     * 
     */
    @InputImport(name="isHidden")
        private final @Nullable Boolean isHidden;

    public Optional<Boolean> getIsHidden() {
        return this.isHidden == null ? Optional.empty() : Optional.ofNullable(this.isHidden);
    }

    /**
     * A flag indicating whether the rule is in preview
     * 
     */
    @InputImport(name="isInPreview")
        private final @Nullable Boolean isInPreview;

    public Optional<Boolean> getIsInPreview() {
        return this.isInPreview == null ? Optional.empty() : Optional.ofNullable(this.isInPreview);
    }

    /**
     * The rule name
     * 
     */
    @InputImport(name="name")
        private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * A flag indicating whether email notifications are supported for detections for this rule
     * 
     */
    @InputImport(name="supportsEmailNotifications")
        private final @Nullable Boolean supportsEmailNotifications;

    public Optional<Boolean> getSupportsEmailNotifications() {
        return this.supportsEmailNotifications == null ? Optional.empty() : Optional.ofNullable(this.supportsEmailNotifications);
    }

    public ApplicationInsightsComponentProactiveDetectionConfigurationResponseRuleDefinitions(
        @Nullable String description,
        @Nullable String displayName,
        @Nullable String helpUrl,
        @Nullable Boolean isEnabledByDefault,
        @Nullable Boolean isHidden,
        @Nullable Boolean isInPreview,
        @Nullable String name,
        @Nullable Boolean supportsEmailNotifications) {
        this.description = description;
        this.displayName = displayName;
        this.helpUrl = helpUrl;
        this.isEnabledByDefault = isEnabledByDefault;
        this.isHidden = isHidden;
        this.isInPreview = isInPreview;
        this.name = name;
        this.supportsEmailNotifications = supportsEmailNotifications;
    }

    private ApplicationInsightsComponentProactiveDetectionConfigurationResponseRuleDefinitions() {
        this.description = null;
        this.displayName = null;
        this.helpUrl = null;
        this.isEnabledByDefault = null;
        this.isHidden = null;
        this.isInPreview = null;
        this.name = null;
        this.supportsEmailNotifications = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationInsightsComponentProactiveDetectionConfigurationResponseRuleDefinitions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable String displayName;
        private @Nullable String helpUrl;
        private @Nullable Boolean isEnabledByDefault;
        private @Nullable Boolean isHidden;
        private @Nullable Boolean isInPreview;
        private @Nullable String name;
        private @Nullable Boolean supportsEmailNotifications;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationInsightsComponentProactiveDetectionConfigurationResponseRuleDefinitions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.helpUrl = defaults.helpUrl;
    	      this.isEnabledByDefault = defaults.isEnabledByDefault;
    	      this.isHidden = defaults.isHidden;
    	      this.isInPreview = defaults.isInPreview;
    	      this.name = defaults.name;
    	      this.supportsEmailNotifications = defaults.supportsEmailNotifications;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setHelpUrl(@Nullable String helpUrl) {
            this.helpUrl = helpUrl;
            return this;
        }

        public Builder setIsEnabledByDefault(@Nullable Boolean isEnabledByDefault) {
            this.isEnabledByDefault = isEnabledByDefault;
            return this;
        }

        public Builder setIsHidden(@Nullable Boolean isHidden) {
            this.isHidden = isHidden;
            return this;
        }

        public Builder setIsInPreview(@Nullable Boolean isInPreview) {
            this.isInPreview = isInPreview;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setSupportsEmailNotifications(@Nullable Boolean supportsEmailNotifications) {
            this.supportsEmailNotifications = supportsEmailNotifications;
            return this;
        }
        public ApplicationInsightsComponentProactiveDetectionConfigurationResponseRuleDefinitions build() {
            return new ApplicationInsightsComponentProactiveDetectionConfigurationResponseRuleDefinitions(description, displayName, helpUrl, isEnabledByDefault, isHidden, isInPreview, name, supportsEmailNotifications);
        }
    }
}
