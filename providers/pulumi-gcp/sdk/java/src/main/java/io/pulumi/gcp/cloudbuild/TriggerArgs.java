// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudbuild;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.cloudbuild.inputs.TriggerBuildArgs;
import io.pulumi.gcp.cloudbuild.inputs.TriggerGithubArgs;
import io.pulumi.gcp.cloudbuild.inputs.TriggerPubsubConfigArgs;
import io.pulumi.gcp.cloudbuild.inputs.TriggerTriggerTemplateArgs;
import io.pulumi.gcp.cloudbuild.inputs.TriggerWebhookConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TriggerArgs extends io.pulumi.resources.ResourceArgs {

    public static final TriggerArgs Empty = new TriggerArgs();

    /**
     * Contents of the build template. Either a filename or build template must be provided.
     * Structure is documented below.
     * 
     */
    @Import(name="build")
      private final @Nullable Output<TriggerBuildArgs> build;

    public Output<TriggerBuildArgs> build() {
        return this.build == null ? Codegen.empty() : this.build;
    }

    /**
     * Human-readable description of the trigger.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Whether the trigger is disabled or not. If true, the trigger will never result in a build.
     * 
     */
    @Import(name="disabled")
      private final @Nullable Output<Boolean> disabled;

    public Output<Boolean> disabled() {
        return this.disabled == null ? Codegen.empty() : this.disabled;
    }

    /**
     * Path, from the source root, to a file whose contents is used for the template. Either a filename or build template must be provided.
     * 
     */
    @Import(name="filename")
      private final @Nullable Output<String> filename;

    public Output<String> filename() {
        return this.filename == null ? Codegen.empty() : this.filename;
    }

    /**
     * Describes the configuration of a trigger that creates a build whenever a GitHub event is received.
     * One of `trigger_template`, `github`, `pubsub_config` or `webhook_config` must be provided.
     * Structure is documented below.
     * 
     */
    @Import(name="github")
      private final @Nullable Output<TriggerGithubArgs> github;

    public Output<TriggerGithubArgs> github() {
        return this.github == null ? Codegen.empty() : this.github;
    }

    /**
     * ignoredFiles and includedFiles are file glob matches using https://golang.org/pkg/path/filepath/#Match
     * extended with support for `**`.
     * If ignoredFiles and changed files are both empty, then they are not
     * used to determine whether or not to trigger a build.
     * If ignoredFiles is not empty, then we ignore any files that match any
     * of the ignored_file globs. If the change has no files that are outside
     * of the ignoredFiles globs, then we do not trigger a build.
     * 
     */
    @Import(name="ignoredFiles")
      private final @Nullable Output<List<String>> ignoredFiles;

    public Output<List<String>> ignoredFiles() {
        return this.ignoredFiles == null ? Codegen.empty() : this.ignoredFiles;
    }

    /**
     * ignoredFiles and includedFiles are file glob matches using https://golang.org/pkg/path/filepath/#Match
     * extended with support for `**`.
     * If any of the files altered in the commit pass the ignoredFiles filter
     * and includedFiles is empty, then as far as this filter is concerned, we
     * should trigger the build.
     * If any of the files altered in the commit pass the ignoredFiles filter
     * and includedFiles is not empty, then we make sure that at least one of
     * those files matches a includedFiles glob. If not, then we do not trigger
     * a build.
     * 
     */
    @Import(name="includedFiles")
      private final @Nullable Output<List<String>> includedFiles;

    public Output<List<String>> includedFiles() {
        return this.includedFiles == null ? Codegen.empty() : this.includedFiles;
    }

    /**
     * Name of the volume to mount.
     * Volume names must be unique per build step and must be valid names for Docker volumes.
     * Each named volume must be used by at least two build steps.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
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
     * PubsubConfig describes the configuration of a trigger that creates
     * a build whenever a Pub/Sub message is published.
     * One of `trigger_template`, `github`, `pubsub_config` or `webhook_config` must be provided.
     * Structure is documented below.
     * 
     */
    @Import(name="pubsubConfig")
      private final @Nullable Output<TriggerPubsubConfigArgs> pubsubConfig;

    public Output<TriggerPubsubConfigArgs> pubsubConfig() {
        return this.pubsubConfig == null ? Codegen.empty() : this.pubsubConfig;
    }

    /**
     * The service account used for all user-controlled operations including
     * triggers.patch, triggers.run, builds.create, and builds.cancel.
     * If no service account is set, then the standard Cloud Build service account
     * ([PROJECT_NUM]@system.gserviceaccount.com) will be used instead.
     * Format: projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT_ID_OR_EMAIL}
     * 
     */
    @Import(name="serviceAccount")
      private final @Nullable Output<String> serviceAccount;

    public Output<String> serviceAccount() {
        return this.serviceAccount == null ? Codegen.empty() : this.serviceAccount;
    }

    /**
     * Substitutions to use in a triggered build. Should only be used with triggers.run
     * 
     */
    @Import(name="substitutions")
      private final @Nullable Output<Map<String,String>> substitutions;

    public Output<Map<String,String>> substitutions() {
        return this.substitutions == null ? Codegen.empty() : this.substitutions;
    }

    /**
     * Tags for annotation of a Build. These are not docker tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<String>> tags;

    public Output<List<String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * Template describing the types of source changes to trigger a build.
     * Branch and tag names in trigger templates are interpreted as regular
     * expressions. Any branch or tag change that matches that regular
     * expression will trigger a build.
     * One of `trigger_template`, `github`, `pubsub_config` or `webhook_config` must be provided.
     * Structure is documented below.
     * 
     */
    @Import(name="triggerTemplate")
      private final @Nullable Output<TriggerTriggerTemplateArgs> triggerTemplate;

    public Output<TriggerTriggerTemplateArgs> triggerTemplate() {
        return this.triggerTemplate == null ? Codegen.empty() : this.triggerTemplate;
    }

    /**
     * WebhookConfig describes the configuration of a trigger that creates
     * a build whenever a webhook is sent to a trigger's webhook URL.
     * One of `trigger_template`, `github`, `pubsub_config` or `webhook_config` must be provided.
     * Structure is documented below.
     * 
     */
    @Import(name="webhookConfig")
      private final @Nullable Output<TriggerWebhookConfigArgs> webhookConfig;

    public Output<TriggerWebhookConfigArgs> webhookConfig() {
        return this.webhookConfig == null ? Codegen.empty() : this.webhookConfig;
    }

    public TriggerArgs(
        @Nullable Output<TriggerBuildArgs> build,
        @Nullable Output<String> description,
        @Nullable Output<Boolean> disabled,
        @Nullable Output<String> filename,
        @Nullable Output<TriggerGithubArgs> github,
        @Nullable Output<List<String>> ignoredFiles,
        @Nullable Output<List<String>> includedFiles,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<TriggerPubsubConfigArgs> pubsubConfig,
        @Nullable Output<String> serviceAccount,
        @Nullable Output<Map<String,String>> substitutions,
        @Nullable Output<List<String>> tags,
        @Nullable Output<TriggerTriggerTemplateArgs> triggerTemplate,
        @Nullable Output<TriggerWebhookConfigArgs> webhookConfig) {
        this.build = build;
        this.description = description;
        this.disabled = disabled;
        this.filename = filename;
        this.github = github;
        this.ignoredFiles = ignoredFiles;
        this.includedFiles = includedFiles;
        this.name = name;
        this.project = project;
        this.pubsubConfig = pubsubConfig;
        this.serviceAccount = serviceAccount;
        this.substitutions = substitutions;
        this.tags = tags;
        this.triggerTemplate = triggerTemplate;
        this.webhookConfig = webhookConfig;
    }

    private TriggerArgs() {
        this.build = Codegen.empty();
        this.description = Codegen.empty();
        this.disabled = Codegen.empty();
        this.filename = Codegen.empty();
        this.github = Codegen.empty();
        this.ignoredFiles = Codegen.empty();
        this.includedFiles = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.pubsubConfig = Codegen.empty();
        this.serviceAccount = Codegen.empty();
        this.substitutions = Codegen.empty();
        this.tags = Codegen.empty();
        this.triggerTemplate = Codegen.empty();
        this.webhookConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<TriggerBuildArgs> build;
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> disabled;
        private @Nullable Output<String> filename;
        private @Nullable Output<TriggerGithubArgs> github;
        private @Nullable Output<List<String>> ignoredFiles;
        private @Nullable Output<List<String>> includedFiles;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<TriggerPubsubConfigArgs> pubsubConfig;
        private @Nullable Output<String> serviceAccount;
        private @Nullable Output<Map<String,String>> substitutions;
        private @Nullable Output<List<String>> tags;
        private @Nullable Output<TriggerTriggerTemplateArgs> triggerTemplate;
        private @Nullable Output<TriggerWebhookConfigArgs> webhookConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.build = defaults.build;
    	      this.description = defaults.description;
    	      this.disabled = defaults.disabled;
    	      this.filename = defaults.filename;
    	      this.github = defaults.github;
    	      this.ignoredFiles = defaults.ignoredFiles;
    	      this.includedFiles = defaults.includedFiles;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.pubsubConfig = defaults.pubsubConfig;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.substitutions = defaults.substitutions;
    	      this.tags = defaults.tags;
    	      this.triggerTemplate = defaults.triggerTemplate;
    	      this.webhookConfig = defaults.webhookConfig;
        }

        public Builder build(@Nullable Output<TriggerBuildArgs> build) {
            this.build = build;
            return this;
        }
        public Builder build(@Nullable TriggerBuildArgs build) {
            this.build = Codegen.ofNullable(build);
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
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            this.disabled = disabled;
            return this;
        }
        public Builder disabled(@Nullable Boolean disabled) {
            this.disabled = Codegen.ofNullable(disabled);
            return this;
        }
        public Builder filename(@Nullable Output<String> filename) {
            this.filename = filename;
            return this;
        }
        public Builder filename(@Nullable String filename) {
            this.filename = Codegen.ofNullable(filename);
            return this;
        }
        public Builder github(@Nullable Output<TriggerGithubArgs> github) {
            this.github = github;
            return this;
        }
        public Builder github(@Nullable TriggerGithubArgs github) {
            this.github = Codegen.ofNullable(github);
            return this;
        }
        public Builder ignoredFiles(@Nullable Output<List<String>> ignoredFiles) {
            this.ignoredFiles = ignoredFiles;
            return this;
        }
        public Builder ignoredFiles(@Nullable List<String> ignoredFiles) {
            this.ignoredFiles = Codegen.ofNullable(ignoredFiles);
            return this;
        }
        public Builder ignoredFiles(String... ignoredFiles) {
            return ignoredFiles(List.of(ignoredFiles));
        }
        public Builder includedFiles(@Nullable Output<List<String>> includedFiles) {
            this.includedFiles = includedFiles;
            return this;
        }
        public Builder includedFiles(@Nullable List<String> includedFiles) {
            this.includedFiles = Codegen.ofNullable(includedFiles);
            return this;
        }
        public Builder includedFiles(String... includedFiles) {
            return includedFiles(List.of(includedFiles));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
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
        public Builder pubsubConfig(@Nullable Output<TriggerPubsubConfigArgs> pubsubConfig) {
            this.pubsubConfig = pubsubConfig;
            return this;
        }
        public Builder pubsubConfig(@Nullable TriggerPubsubConfigArgs pubsubConfig) {
            this.pubsubConfig = Codegen.ofNullable(pubsubConfig);
            return this;
        }
        public Builder serviceAccount(@Nullable Output<String> serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }
        public Builder serviceAccount(@Nullable String serviceAccount) {
            this.serviceAccount = Codegen.ofNullable(serviceAccount);
            return this;
        }
        public Builder substitutions(@Nullable Output<Map<String,String>> substitutions) {
            this.substitutions = substitutions;
            return this;
        }
        public Builder substitutions(@Nullable Map<String,String> substitutions) {
            this.substitutions = Codegen.ofNullable(substitutions);
            return this;
        }
        public Builder tags(@Nullable Output<List<String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public Builder triggerTemplate(@Nullable Output<TriggerTriggerTemplateArgs> triggerTemplate) {
            this.triggerTemplate = triggerTemplate;
            return this;
        }
        public Builder triggerTemplate(@Nullable TriggerTriggerTemplateArgs triggerTemplate) {
            this.triggerTemplate = Codegen.ofNullable(triggerTemplate);
            return this;
        }
        public Builder webhookConfig(@Nullable Output<TriggerWebhookConfigArgs> webhookConfig) {
            this.webhookConfig = webhookConfig;
            return this;
        }
        public Builder webhookConfig(@Nullable TriggerWebhookConfigArgs webhookConfig) {
            this.webhookConfig = Codegen.ofNullable(webhookConfig);
            return this;
        }        public TriggerArgs build() {
            return new TriggerArgs(build, description, disabled, filename, github, ignoredFiles, includedFiles, name, project, pubsubConfig, serviceAccount, substitutions, tags, triggerTemplate, webhookConfig);
        }
    }
}
