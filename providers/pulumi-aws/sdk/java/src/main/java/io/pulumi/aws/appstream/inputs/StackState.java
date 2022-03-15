// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appstream.inputs;

import io.pulumi.aws.appstream.inputs.StackAccessEndpointGetArgs;
import io.pulumi.aws.appstream.inputs.StackApplicationSettingsGetArgs;
import io.pulumi.aws.appstream.inputs.StackStorageConnectorGetArgs;
import io.pulumi.aws.appstream.inputs.StackUserSettingGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StackState extends io.pulumi.resources.ResourceArgs {

    public static final StackState Empty = new StackState();

    @Import(name="accessEndpoints")
      private final @Nullable Output<List<StackAccessEndpointGetArgs>> accessEndpoints;

    public Output<List<StackAccessEndpointGetArgs>> getAccessEndpoints() {
        return this.accessEndpoints == null ? Output.empty() : this.accessEndpoints;
    }

    /**
     * Settings for application settings persistence.
     * 
     */
    @Import(name="applicationSettings")
      private final @Nullable Output<StackApplicationSettingsGetArgs> applicationSettings;

    public Output<StackApplicationSettingsGetArgs> getApplicationSettings() {
        return this.applicationSettings == null ? Output.empty() : this.applicationSettings;
    }

    /**
     * ARN of the appstream stack.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * Date and time, in UTC and extended RFC 3339 format, when the stack was created.
     * 
     */
    @Import(name="createdTime")
      private final @Nullable Output<String> createdTime;

    public Output<String> getCreatedTime() {
        return this.createdTime == null ? Output.empty() : this.createdTime;
    }

    /**
     * Description for the AppStream stack.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Stack name to display.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Output.empty() : this.displayName;
    }

    /**
     * Domains where AppStream 2.0 streaming sessions can be embedded in an iframe. You must approve the domains that you want to host embedded AppStream 2.0 streaming sessions.
     * 
     */
    @Import(name="embedHostDomains")
      private final @Nullable Output<List<String>> embedHostDomains;

    public Output<List<String>> getEmbedHostDomains() {
        return this.embedHostDomains == null ? Output.empty() : this.embedHostDomains;
    }

    /**
     * URL that users are redirected to after they click the Send Feedback link. If no URL is specified, no Send Feedback link is displayed. .
     * 
     */
    @Import(name="feedbackUrl")
      private final @Nullable Output<String> feedbackUrl;

    public Output<String> getFeedbackUrl() {
        return this.feedbackUrl == null ? Output.empty() : this.feedbackUrl;
    }

    /**
     * Unique name for the AppStream stack.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * URL that users are redirected to after their streaming session ends.
     * 
     */
    @Import(name="redirectUrl")
      private final @Nullable Output<String> redirectUrl;

    public Output<String> getRedirectUrl() {
        return this.redirectUrl == null ? Output.empty() : this.redirectUrl;
    }

    /**
     * Configuration block for the storage connectors to enable. See below.
     * 
     */
    @Import(name="storageConnectors")
      private final @Nullable Output<List<StackStorageConnectorGetArgs>> storageConnectors;

    public Output<List<StackStorageConnectorGetArgs>> getStorageConnectors() {
        return this.storageConnectors == null ? Output.empty() : this.storageConnectors;
    }

    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    /**
     * Configuration block for the actions that are enabled or disabled for users during their streaming sessions. By default, these actions are enabled. See below.
     * 
     */
    @Import(name="userSettings")
      private final @Nullable Output<List<StackUserSettingGetArgs>> userSettings;

    public Output<List<StackUserSettingGetArgs>> getUserSettings() {
        return this.userSettings == null ? Output.empty() : this.userSettings;
    }

    public StackState(
        @Nullable Output<List<StackAccessEndpointGetArgs>> accessEndpoints,
        @Nullable Output<StackApplicationSettingsGetArgs> applicationSettings,
        @Nullable Output<String> arn,
        @Nullable Output<String> createdTime,
        @Nullable Output<String> description,
        @Nullable Output<String> displayName,
        @Nullable Output<List<String>> embedHostDomains,
        @Nullable Output<String> feedbackUrl,
        @Nullable Output<String> name,
        @Nullable Output<String> redirectUrl,
        @Nullable Output<List<StackStorageConnectorGetArgs>> storageConnectors,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<List<StackUserSettingGetArgs>> userSettings) {
        this.accessEndpoints = accessEndpoints;
        this.applicationSettings = applicationSettings;
        this.arn = arn;
        this.createdTime = createdTime;
        this.description = description;
        this.displayName = displayName;
        this.embedHostDomains = embedHostDomains;
        this.feedbackUrl = feedbackUrl;
        this.name = name;
        this.redirectUrl = redirectUrl;
        this.storageConnectors = storageConnectors;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.userSettings = userSettings;
    }

    private StackState() {
        this.accessEndpoints = Output.empty();
        this.applicationSettings = Output.empty();
        this.arn = Output.empty();
        this.createdTime = Output.empty();
        this.description = Output.empty();
        this.displayName = Output.empty();
        this.embedHostDomains = Output.empty();
        this.feedbackUrl = Output.empty();
        this.name = Output.empty();
        this.redirectUrl = Output.empty();
        this.storageConnectors = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
        this.userSettings = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StackState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<StackAccessEndpointGetArgs>> accessEndpoints;
        private @Nullable Output<StackApplicationSettingsGetArgs> applicationSettings;
        private @Nullable Output<String> arn;
        private @Nullable Output<String> createdTime;
        private @Nullable Output<String> description;
        private @Nullable Output<String> displayName;
        private @Nullable Output<List<String>> embedHostDomains;
        private @Nullable Output<String> feedbackUrl;
        private @Nullable Output<String> name;
        private @Nullable Output<String> redirectUrl;
        private @Nullable Output<List<StackStorageConnectorGetArgs>> storageConnectors;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<List<StackUserSettingGetArgs>> userSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(StackState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessEndpoints = defaults.accessEndpoints;
    	      this.applicationSettings = defaults.applicationSettings;
    	      this.arn = defaults.arn;
    	      this.createdTime = defaults.createdTime;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.embedHostDomains = defaults.embedHostDomains;
    	      this.feedbackUrl = defaults.feedbackUrl;
    	      this.name = defaults.name;
    	      this.redirectUrl = defaults.redirectUrl;
    	      this.storageConnectors = defaults.storageConnectors;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.userSettings = defaults.userSettings;
        }

        public Builder accessEndpoints(@Nullable Output<List<StackAccessEndpointGetArgs>> accessEndpoints) {
            this.accessEndpoints = accessEndpoints;
            return this;
        }

        public Builder accessEndpoints(@Nullable List<StackAccessEndpointGetArgs> accessEndpoints) {
            this.accessEndpoints = Output.ofNullable(accessEndpoints);
            return this;
        }

        public Builder applicationSettings(@Nullable Output<StackApplicationSettingsGetArgs> applicationSettings) {
            this.applicationSettings = applicationSettings;
            return this;
        }

        public Builder applicationSettings(@Nullable StackApplicationSettingsGetArgs applicationSettings) {
            this.applicationSettings = Output.ofNullable(applicationSettings);
            return this;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }

        public Builder createdTime(@Nullable Output<String> createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        public Builder createdTime(@Nullable String createdTime) {
            this.createdTime = Output.ofNullable(createdTime);
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

        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = Output.ofNullable(displayName);
            return this;
        }

        public Builder embedHostDomains(@Nullable Output<List<String>> embedHostDomains) {
            this.embedHostDomains = embedHostDomains;
            return this;
        }

        public Builder embedHostDomains(@Nullable List<String> embedHostDomains) {
            this.embedHostDomains = Output.ofNullable(embedHostDomains);
            return this;
        }

        public Builder feedbackUrl(@Nullable Output<String> feedbackUrl) {
            this.feedbackUrl = feedbackUrl;
            return this;
        }

        public Builder feedbackUrl(@Nullable String feedbackUrl) {
            this.feedbackUrl = Output.ofNullable(feedbackUrl);
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

        public Builder redirectUrl(@Nullable Output<String> redirectUrl) {
            this.redirectUrl = redirectUrl;
            return this;
        }

        public Builder redirectUrl(@Nullable String redirectUrl) {
            this.redirectUrl = Output.ofNullable(redirectUrl);
            return this;
        }

        public Builder storageConnectors(@Nullable Output<List<StackStorageConnectorGetArgs>> storageConnectors) {
            this.storageConnectors = storageConnectors;
            return this;
        }

        public Builder storageConnectors(@Nullable List<StackStorageConnectorGetArgs> storageConnectors) {
            this.storageConnectors = Output.ofNullable(storageConnectors);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }

        public Builder userSettings(@Nullable Output<List<StackUserSettingGetArgs>> userSettings) {
            this.userSettings = userSettings;
            return this;
        }

        public Builder userSettings(@Nullable List<StackUserSettingGetArgs> userSettings) {
            this.userSettings = Output.ofNullable(userSettings);
            return this;
        }
        public StackState build() {
            return new StackState(accessEndpoints, applicationSettings, arn, createdTime, description, displayName, embedHostDomains, feedbackUrl, name, redirectUrl, storageConnectors, tags, tagsAll, userSettings);
        }
    }
}
