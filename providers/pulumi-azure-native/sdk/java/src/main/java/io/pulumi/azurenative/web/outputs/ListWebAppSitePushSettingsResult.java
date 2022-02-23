// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListWebAppSitePushSettingsResult {
    /**
     * Gets or sets a JSON string containing a list of dynamic tags that will be evaluated from user claims in the push registration endpoint.
     * 
     */
    private final @Nullable String dynamicTagsJson;
    /**
     * Resource Id.
     * 
     */
    private final String id;
    /**
     * Gets or sets a flag indicating whether the Push endpoint is enabled.
     * 
     */
    private final Boolean isPushEnabled;
    /**
     * Kind of resource.
     * 
     */
    private final @Nullable String kind;
    /**
     * Resource Name.
     * 
     */
    private final String name;
    /**
     * Gets or sets a JSON string containing a list of tags that are whitelisted for use by the push registration endpoint.
     * 
     */
    private final @Nullable String tagWhitelistJson;
    /**
     * Gets or sets a JSON string containing a list of tags that require user authentication to be used in the push registration endpoint.
     * Tags can consist of alphanumeric characters and the following:
     * '_', '@', '#', '.', ':', '-'.
     * Validation should be performed at the PushRequestHandler.
     * 
     */
    private final @Nullable String tagsRequiringAuth;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"dynamicTagsJson","id","isPushEnabled","kind","name","tagWhitelistJson","tagsRequiringAuth","type"})
    private ListWebAppSitePushSettingsResult(
        @Nullable String dynamicTagsJson,
        String id,
        Boolean isPushEnabled,
        @Nullable String kind,
        String name,
        @Nullable String tagWhitelistJson,
        @Nullable String tagsRequiringAuth,
        String type) {
        this.dynamicTagsJson = dynamicTagsJson;
        this.id = Objects.requireNonNull(id);
        this.isPushEnabled = Objects.requireNonNull(isPushEnabled);
        this.kind = kind;
        this.name = Objects.requireNonNull(name);
        this.tagWhitelistJson = tagWhitelistJson;
        this.tagsRequiringAuth = tagsRequiringAuth;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Gets or sets a JSON string containing a list of dynamic tags that will be evaluated from user claims in the push registration endpoint.
     * 
     */
    public Optional<String> getDynamicTagsJson() {
        return Optional.ofNullable(this.dynamicTagsJson);
    }
    /**
     * Resource Id.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Gets or sets a flag indicating whether the Push endpoint is enabled.
     * 
     */
    public Boolean getIsPushEnabled() {
        return this.isPushEnabled;
    }
    /**
     * Kind of resource.
     * 
     */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * Resource Name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Gets or sets a JSON string containing a list of tags that are whitelisted for use by the push registration endpoint.
     * 
     */
    public Optional<String> getTagWhitelistJson() {
        return Optional.ofNullable(this.tagWhitelistJson);
    }
    /**
     * Gets or sets a JSON string containing a list of tags that require user authentication to be used in the push registration endpoint.
     * Tags can consist of alphanumeric characters and the following:
     * '_', '@', '#', '.', ':', '-'.
     * Validation should be performed at the PushRequestHandler.
     * 
     */
    public Optional<String> getTagsRequiringAuth() {
        return Optional.ofNullable(this.tagsRequiringAuth);
    }
    /**
     * Resource type.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListWebAppSitePushSettingsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dynamicTagsJson;
        private String id;
        private Boolean isPushEnabled;
        private @Nullable String kind;
        private String name;
        private @Nullable String tagWhitelistJson;
        private @Nullable String tagsRequiringAuth;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ListWebAppSitePushSettingsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dynamicTagsJson = defaults.dynamicTagsJson;
    	      this.id = defaults.id;
    	      this.isPushEnabled = defaults.isPushEnabled;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.tagWhitelistJson = defaults.tagWhitelistJson;
    	      this.tagsRequiringAuth = defaults.tagsRequiringAuth;
    	      this.type = defaults.type;
        }

        public Builder setDynamicTagsJson(@Nullable String dynamicTagsJson) {
            this.dynamicTagsJson = dynamicTagsJson;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIsPushEnabled(Boolean isPushEnabled) {
            this.isPushEnabled = Objects.requireNonNull(isPushEnabled);
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setTagWhitelistJson(@Nullable String tagWhitelistJson) {
            this.tagWhitelistJson = tagWhitelistJson;
            return this;
        }

        public Builder setTagsRequiringAuth(@Nullable String tagsRequiringAuth) {
            this.tagsRequiringAuth = tagsRequiringAuth;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ListWebAppSitePushSettingsResult build() {
            return new ListWebAppSitePushSettingsResult(dynamicTagsJson, id, isPushEnabled, kind, name, tagWhitelistJson, tagsRequiringAuth, type);
        }
    }
}
