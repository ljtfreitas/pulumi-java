// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.cloudbuild_v1.enums.TriggerEventType;
import io.pulumi.googlenative.cloudbuild_v1.inputs.ApprovalConfigArgs;
import io.pulumi.googlenative.cloudbuild_v1.inputs.BitbucketServerTriggerConfigArgs;
import io.pulumi.googlenative.cloudbuild_v1.inputs.BuildArgs;
import io.pulumi.googlenative.cloudbuild_v1.inputs.GitFileSourceArgs;
import io.pulumi.googlenative.cloudbuild_v1.inputs.GitHubEventsConfigArgs;
import io.pulumi.googlenative.cloudbuild_v1.inputs.GitRepoSourceArgs;
import io.pulumi.googlenative.cloudbuild_v1.inputs.PubsubConfigArgs;
import io.pulumi.googlenative.cloudbuild_v1.inputs.RepoSourceArgs;
import io.pulumi.googlenative.cloudbuild_v1.inputs.WebhookConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TriggerArgs extends io.pulumi.resources.ResourceArgs {

    public static final TriggerArgs Empty = new TriggerArgs();

    /**
     * Configuration for manual approval to start a build invocation of this BuildTrigger.
     * 
     */
    @Import(name="approvalConfig")
      private final @Nullable Output<ApprovalConfigArgs> approvalConfig;

    public Output<ApprovalConfigArgs> getApprovalConfig() {
        return this.approvalConfig == null ? Output.empty() : this.approvalConfig;
    }

    /**
     * Autodetect build configuration. The following precedence is used (case insensitive): 1. cloudbuild.yaml 2. cloudbuild.yml 3. cloudbuild.json 4. Dockerfile Currently only available for GitHub App Triggers.
     * 
     */
    @Import(name="autodetect")
      private final @Nullable Output<Boolean> autodetect;

    public Output<Boolean> getAutodetect() {
        return this.autodetect == null ? Output.empty() : this.autodetect;
    }

    /**
     * BitbucketServerTriggerConfig describes the configuration of a trigger that creates a build whenever a Bitbucket Server event is received.
     * 
     */
    @Import(name="bitbucketServerTriggerConfig")
      private final @Nullable Output<BitbucketServerTriggerConfigArgs> bitbucketServerTriggerConfig;

    public Output<BitbucketServerTriggerConfigArgs> getBitbucketServerTriggerConfig() {
        return this.bitbucketServerTriggerConfig == null ? Output.empty() : this.bitbucketServerTriggerConfig;
    }

    /**
     * Contents of the build template.
     * 
     */
    @Import(name="build")
      private final @Nullable Output<BuildArgs> build;

    public Output<BuildArgs> getBuild() {
        return this.build == null ? Output.empty() : this.build;
    }

    /**
     * Human-readable description of this trigger.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * If true, the trigger will never automatically execute a build.
     * 
     */
    @Import(name="disabled")
      private final @Nullable Output<Boolean> disabled;

    public Output<Boolean> getDisabled() {
        return this.disabled == null ? Output.empty() : this.disabled;
    }

    /**
     * EventType allows the user to explicitly set the type of event to which this BuildTrigger should respond. This field will be validated against the rest of the configuration if it is set.
     * 
     */
    @Import(name="eventType")
      private final @Nullable Output<TriggerEventType> eventType;

    public Output<TriggerEventType> getEventType() {
        return this.eventType == null ? Output.empty() : this.eventType;
    }

    /**
     * Path, from the source root, to the build configuration file (i.e. cloudbuild.yaml).
     * 
     */
    @Import(name="filename")
      private final @Nullable Output<String> filename;

    public Output<String> getFilename() {
        return this.filename == null ? Output.empty() : this.filename;
    }

    /**
     * A Common Expression Language string.
     * 
     */
    @Import(name="filter")
      private final @Nullable Output<String> filter;

    public Output<String> getFilter() {
        return this.filter == null ? Output.empty() : this.filter;
    }

    /**
     * The file source describing the local or remote Build template.
     * 
     */
    @Import(name="gitFileSource")
      private final @Nullable Output<GitFileSourceArgs> gitFileSource;

    public Output<GitFileSourceArgs> getGitFileSource() {
        return this.gitFileSource == null ? Output.empty() : this.gitFileSource;
    }

    /**
     * GitHubEventsConfig describes the configuration of a trigger that creates a build whenever a GitHub event is received. Mutually exclusive with `trigger_template`.
     * 
     */
    @Import(name="github")
      private final @Nullable Output<GitHubEventsConfigArgs> github;

    public Output<GitHubEventsConfigArgs> getGithub() {
        return this.github == null ? Output.empty() : this.github;
    }

    /**
     * ignored_files and included_files are file glob matches using https://golang.org/pkg/path/filepath/#Match extended with support for "**". If ignored_files and changed files are both empty, then they are not used to determine whether or not to trigger a build. If ignored_files is not empty, then we ignore any files that match any of the ignored_file globs. If the change has no files that are outside of the ignored_files globs, then we do not trigger a build.
     * 
     */
    @Import(name="ignoredFiles")
      private final @Nullable Output<List<String>> ignoredFiles;

    public Output<List<String>> getIgnoredFiles() {
        return this.ignoredFiles == null ? Output.empty() : this.ignoredFiles;
    }

    /**
     * If any of the files altered in the commit pass the ignored_files filter and included_files is empty, then as far as this filter is concerned, we should trigger the build. If any of the files altered in the commit pass the ignored_files filter and included_files is not empty, then we make sure that at least one of those files matches a included_files glob. If not, then we do not trigger a build.
     * 
     */
    @Import(name="includedFiles")
      private final @Nullable Output<List<String>> includedFiles;

    public Output<List<String>> getIncludedFiles() {
        return this.includedFiles == null ? Output.empty() : this.includedFiles;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * User-assigned name of the trigger. Must be unique within the project. Trigger names must meet the following requirements: + They must contain only alphanumeric characters and dashes. + They can be 1-64 characters long. + They must begin and end with an alphanumeric character.
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

    @Import(name="projectId", required=true)
      private final Output<String> projectId;

    public Output<String> getProjectId() {
        return this.projectId;
    }

    /**
     * PubsubConfig describes the configuration of a trigger that creates a build whenever a Pub/Sub message is published.
     * 
     */
    @Import(name="pubsubConfig")
      private final @Nullable Output<PubsubConfigArgs> pubsubConfig;

    public Output<PubsubConfigArgs> getPubsubConfig() {
        return this.pubsubConfig == null ? Output.empty() : this.pubsubConfig;
    }

    /**
     * The `Trigger` name with format: `projects/{project}/locations/{location}/triggers/{trigger}`, where {trigger} is a unique identifier generated by the service.
     * 
     */
    @Import(name="resourceName")
      private final @Nullable Output<String> resourceName;

    public Output<String> getPropResourceName() {
        return this.resourceName == null ? Output.empty() : this.resourceName;
    }

    /**
     * The service account used for all user-controlled operations including UpdateBuildTrigger, RunBuildTrigger, CreateBuild, and CancelBuild. If no service account is set, then the standard Cloud Build service account ([PROJECT_NUM]@system.gserviceaccount.com) will be used instead. Format: `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT_ID_OR_EMAIL}`
     * 
     */
    @Import(name="serviceAccount")
      private final @Nullable Output<String> serviceAccount;

    public Output<String> getServiceAccount() {
        return this.serviceAccount == null ? Output.empty() : this.serviceAccount;
    }

    /**
     * The repo and ref of the repository from which to build. This field is used only for those triggers that do not respond to SCM events. Triggers that respond to such events build source at whatever commit caused the event. This field is currently only used by Webhook, Pub/Sub, Manual, and Cron triggers.
     * 
     */
    @Import(name="sourceToBuild")
      private final @Nullable Output<GitRepoSourceArgs> sourceToBuild;

    public Output<GitRepoSourceArgs> getSourceToBuild() {
        return this.sourceToBuild == null ? Output.empty() : this.sourceToBuild;
    }

    /**
     * Substitutions for Build resource. The keys must match the following regular expression: `^_[A-Z0-9_]+$`.
     * 
     */
    @Import(name="substitutions")
      private final @Nullable Output<Map<String,String>> substitutions;

    public Output<Map<String,String>> getSubstitutions() {
        return this.substitutions == null ? Output.empty() : this.substitutions;
    }

    /**
     * Tags for annotation of a `BuildTrigger`
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<String>> tags;

    public Output<List<String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * Template describing the types of source changes to trigger a build. Branch and tag names in trigger templates are interpreted as regular expressions. Any branch or tag change that matches that regular expression will trigger a build. Mutually exclusive with `github`.
     * 
     */
    @Import(name="triggerTemplate")
      private final @Nullable Output<RepoSourceArgs> triggerTemplate;

    public Output<RepoSourceArgs> getTriggerTemplate() {
        return this.triggerTemplate == null ? Output.empty() : this.triggerTemplate;
    }

    /**
     * WebhookConfig describes the configuration of a trigger that creates a build whenever a webhook is sent to a trigger's webhook URL.
     * 
     */
    @Import(name="webhookConfig")
      private final @Nullable Output<WebhookConfigArgs> webhookConfig;

    public Output<WebhookConfigArgs> getWebhookConfig() {
        return this.webhookConfig == null ? Output.empty() : this.webhookConfig;
    }

    public TriggerArgs(
        @Nullable Output<ApprovalConfigArgs> approvalConfig,
        @Nullable Output<Boolean> autodetect,
        @Nullable Output<BitbucketServerTriggerConfigArgs> bitbucketServerTriggerConfig,
        @Nullable Output<BuildArgs> build,
        @Nullable Output<String> description,
        @Nullable Output<Boolean> disabled,
        @Nullable Output<TriggerEventType> eventType,
        @Nullable Output<String> filename,
        @Nullable Output<String> filter,
        @Nullable Output<GitFileSourceArgs> gitFileSource,
        @Nullable Output<GitHubEventsConfigArgs> github,
        @Nullable Output<List<String>> ignoredFiles,
        @Nullable Output<List<String>> includedFiles,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        Output<String> projectId,
        @Nullable Output<PubsubConfigArgs> pubsubConfig,
        @Nullable Output<String> resourceName,
        @Nullable Output<String> serviceAccount,
        @Nullable Output<GitRepoSourceArgs> sourceToBuild,
        @Nullable Output<Map<String,String>> substitutions,
        @Nullable Output<List<String>> tags,
        @Nullable Output<RepoSourceArgs> triggerTemplate,
        @Nullable Output<WebhookConfigArgs> webhookConfig) {
        this.approvalConfig = approvalConfig;
        this.autodetect = autodetect;
        this.bitbucketServerTriggerConfig = bitbucketServerTriggerConfig;
        this.build = build;
        this.description = description;
        this.disabled = disabled;
        this.eventType = eventType;
        this.filename = filename;
        this.filter = filter;
        this.gitFileSource = gitFileSource;
        this.github = github;
        this.ignoredFiles = ignoredFiles;
        this.includedFiles = includedFiles;
        this.location = location;
        this.name = name;
        this.project = project;
        this.projectId = Objects.requireNonNull(projectId, "expected parameter 'projectId' to be non-null");
        this.pubsubConfig = pubsubConfig;
        this.resourceName = resourceName;
        this.serviceAccount = serviceAccount;
        this.sourceToBuild = sourceToBuild;
        this.substitutions = substitutions;
        this.tags = tags;
        this.triggerTemplate = triggerTemplate;
        this.webhookConfig = webhookConfig;
    }

    private TriggerArgs() {
        this.approvalConfig = Output.empty();
        this.autodetect = Output.empty();
        this.bitbucketServerTriggerConfig = Output.empty();
        this.build = Output.empty();
        this.description = Output.empty();
        this.disabled = Output.empty();
        this.eventType = Output.empty();
        this.filename = Output.empty();
        this.filter = Output.empty();
        this.gitFileSource = Output.empty();
        this.github = Output.empty();
        this.ignoredFiles = Output.empty();
        this.includedFiles = Output.empty();
        this.location = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.projectId = Output.empty();
        this.pubsubConfig = Output.empty();
        this.resourceName = Output.empty();
        this.serviceAccount = Output.empty();
        this.sourceToBuild = Output.empty();
        this.substitutions = Output.empty();
        this.tags = Output.empty();
        this.triggerTemplate = Output.empty();
        this.webhookConfig = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ApprovalConfigArgs> approvalConfig;
        private @Nullable Output<Boolean> autodetect;
        private @Nullable Output<BitbucketServerTriggerConfigArgs> bitbucketServerTriggerConfig;
        private @Nullable Output<BuildArgs> build;
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> disabled;
        private @Nullable Output<TriggerEventType> eventType;
        private @Nullable Output<String> filename;
        private @Nullable Output<String> filter;
        private @Nullable Output<GitFileSourceArgs> gitFileSource;
        private @Nullable Output<GitHubEventsConfigArgs> github;
        private @Nullable Output<List<String>> ignoredFiles;
        private @Nullable Output<List<String>> includedFiles;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private Output<String> projectId;
        private @Nullable Output<PubsubConfigArgs> pubsubConfig;
        private @Nullable Output<String> resourceName;
        private @Nullable Output<String> serviceAccount;
        private @Nullable Output<GitRepoSourceArgs> sourceToBuild;
        private @Nullable Output<Map<String,String>> substitutions;
        private @Nullable Output<List<String>> tags;
        private @Nullable Output<RepoSourceArgs> triggerTemplate;
        private @Nullable Output<WebhookConfigArgs> webhookConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.approvalConfig = defaults.approvalConfig;
    	      this.autodetect = defaults.autodetect;
    	      this.bitbucketServerTriggerConfig = defaults.bitbucketServerTriggerConfig;
    	      this.build = defaults.build;
    	      this.description = defaults.description;
    	      this.disabled = defaults.disabled;
    	      this.eventType = defaults.eventType;
    	      this.filename = defaults.filename;
    	      this.filter = defaults.filter;
    	      this.gitFileSource = defaults.gitFileSource;
    	      this.github = defaults.github;
    	      this.ignoredFiles = defaults.ignoredFiles;
    	      this.includedFiles = defaults.includedFiles;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.projectId = defaults.projectId;
    	      this.pubsubConfig = defaults.pubsubConfig;
    	      this.resourceName = defaults.resourceName;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.sourceToBuild = defaults.sourceToBuild;
    	      this.substitutions = defaults.substitutions;
    	      this.tags = defaults.tags;
    	      this.triggerTemplate = defaults.triggerTemplate;
    	      this.webhookConfig = defaults.webhookConfig;
        }

        public Builder approvalConfig(@Nullable Output<ApprovalConfigArgs> approvalConfig) {
            this.approvalConfig = approvalConfig;
            return this;
        }

        public Builder approvalConfig(@Nullable ApprovalConfigArgs approvalConfig) {
            this.approvalConfig = Output.ofNullable(approvalConfig);
            return this;
        }

        public Builder autodetect(@Nullable Output<Boolean> autodetect) {
            this.autodetect = autodetect;
            return this;
        }

        public Builder autodetect(@Nullable Boolean autodetect) {
            this.autodetect = Output.ofNullable(autodetect);
            return this;
        }

        public Builder bitbucketServerTriggerConfig(@Nullable Output<BitbucketServerTriggerConfigArgs> bitbucketServerTriggerConfig) {
            this.bitbucketServerTriggerConfig = bitbucketServerTriggerConfig;
            return this;
        }

        public Builder bitbucketServerTriggerConfig(@Nullable BitbucketServerTriggerConfigArgs bitbucketServerTriggerConfig) {
            this.bitbucketServerTriggerConfig = Output.ofNullable(bitbucketServerTriggerConfig);
            return this;
        }

        public Builder build(@Nullable Output<BuildArgs> build) {
            this.build = build;
            return this;
        }

        public Builder build(@Nullable BuildArgs build) {
            this.build = Output.ofNullable(build);
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

        public Builder disabled(@Nullable Output<Boolean> disabled) {
            this.disabled = disabled;
            return this;
        }

        public Builder disabled(@Nullable Boolean disabled) {
            this.disabled = Output.ofNullable(disabled);
            return this;
        }

        public Builder eventType(@Nullable Output<TriggerEventType> eventType) {
            this.eventType = eventType;
            return this;
        }

        public Builder eventType(@Nullable TriggerEventType eventType) {
            this.eventType = Output.ofNullable(eventType);
            return this;
        }

        public Builder filename(@Nullable Output<String> filename) {
            this.filename = filename;
            return this;
        }

        public Builder filename(@Nullable String filename) {
            this.filename = Output.ofNullable(filename);
            return this;
        }

        public Builder filter(@Nullable Output<String> filter) {
            this.filter = filter;
            return this;
        }

        public Builder filter(@Nullable String filter) {
            this.filter = Output.ofNullable(filter);
            return this;
        }

        public Builder gitFileSource(@Nullable Output<GitFileSourceArgs> gitFileSource) {
            this.gitFileSource = gitFileSource;
            return this;
        }

        public Builder gitFileSource(@Nullable GitFileSourceArgs gitFileSource) {
            this.gitFileSource = Output.ofNullable(gitFileSource);
            return this;
        }

        public Builder github(@Nullable Output<GitHubEventsConfigArgs> github) {
            this.github = github;
            return this;
        }

        public Builder github(@Nullable GitHubEventsConfigArgs github) {
            this.github = Output.ofNullable(github);
            return this;
        }

        public Builder ignoredFiles(@Nullable Output<List<String>> ignoredFiles) {
            this.ignoredFiles = ignoredFiles;
            return this;
        }

        public Builder ignoredFiles(@Nullable List<String> ignoredFiles) {
            this.ignoredFiles = Output.ofNullable(ignoredFiles);
            return this;
        }

        public Builder includedFiles(@Nullable Output<List<String>> includedFiles) {
            this.includedFiles = includedFiles;
            return this;
        }

        public Builder includedFiles(@Nullable List<String> includedFiles) {
            this.includedFiles = Output.ofNullable(includedFiles);
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

        public Builder projectId(Output<String> projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }

        public Builder projectId(String projectId) {
            this.projectId = Output.of(Objects.requireNonNull(projectId));
            return this;
        }

        public Builder pubsubConfig(@Nullable Output<PubsubConfigArgs> pubsubConfig) {
            this.pubsubConfig = pubsubConfig;
            return this;
        }

        public Builder pubsubConfig(@Nullable PubsubConfigArgs pubsubConfig) {
            this.pubsubConfig = Output.ofNullable(pubsubConfig);
            return this;
        }

        public Builder resourceName(@Nullable Output<String> resourceName) {
            this.resourceName = resourceName;
            return this;
        }

        public Builder resourceName(@Nullable String resourceName) {
            this.resourceName = Output.ofNullable(resourceName);
            return this;
        }

        public Builder serviceAccount(@Nullable Output<String> serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }

        public Builder serviceAccount(@Nullable String serviceAccount) {
            this.serviceAccount = Output.ofNullable(serviceAccount);
            return this;
        }

        public Builder sourceToBuild(@Nullable Output<GitRepoSourceArgs> sourceToBuild) {
            this.sourceToBuild = sourceToBuild;
            return this;
        }

        public Builder sourceToBuild(@Nullable GitRepoSourceArgs sourceToBuild) {
            this.sourceToBuild = Output.ofNullable(sourceToBuild);
            return this;
        }

        public Builder substitutions(@Nullable Output<Map<String,String>> substitutions) {
            this.substitutions = substitutions;
            return this;
        }

        public Builder substitutions(@Nullable Map<String,String> substitutions) {
            this.substitutions = Output.ofNullable(substitutions);
            return this;
        }

        public Builder tags(@Nullable Output<List<String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder triggerTemplate(@Nullable Output<RepoSourceArgs> triggerTemplate) {
            this.triggerTemplate = triggerTemplate;
            return this;
        }

        public Builder triggerTemplate(@Nullable RepoSourceArgs triggerTemplate) {
            this.triggerTemplate = Output.ofNullable(triggerTemplate);
            return this;
        }

        public Builder webhookConfig(@Nullable Output<WebhookConfigArgs> webhookConfig) {
            this.webhookConfig = webhookConfig;
            return this;
        }

        public Builder webhookConfig(@Nullable WebhookConfigArgs webhookConfig) {
            this.webhookConfig = Output.ofNullable(webhookConfig);
            return this;
        }
        public TriggerArgs build() {
            return new TriggerArgs(approvalConfig, autodetect, bitbucketServerTriggerConfig, build, description, disabled, eventType, filename, filter, gitFileSource, github, ignoredFiles, includedFiles, location, name, project, projectId, pubsubConfig, resourceName, serviceAccount, sourceToBuild, substitutions, tags, triggerTemplate, webhookConfig);
        }
    }
}
