// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sourcerepo_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.sourcerepo_v1.inputs.MirrorConfigArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RepoArgs extends io.pulumi.resources.ResourceArgs {

    public static final RepoArgs Empty = new RepoArgs();

    /**
     * How this repository mirrors a repository managed by another service. Read-only field.
     * 
     */
    @InputImport(name="mirrorConfig")
      private final @Nullable Input<MirrorConfigArgs> mirrorConfig;

    public Input<MirrorConfigArgs> getMirrorConfig() {
        return this.mirrorConfig == null ? Input.empty() : this.mirrorConfig;
    }

    /**
     * Resource name of the repository, of the form `projects//repos/`. The repo name may contain slashes. eg, `projects/myproject/repos/name/with/slash`
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * How this repository publishes a change in the repository through Cloud Pub/Sub. Keyed by the topic names.
     * 
     */
    @InputImport(name="pubsubConfigs")
      private final @Nullable Input<Map<String,String>> pubsubConfigs;

    public Input<Map<String,String>> getPubsubConfigs() {
        return this.pubsubConfigs == null ? Input.empty() : this.pubsubConfigs;
    }

    /**
     * The disk usage of the repo, in bytes. Read-only field. Size is only returned by GetRepo.
     * 
     */
    @InputImport(name="size")
      private final @Nullable Input<String> size;

    public Input<String> getSize() {
        return this.size == null ? Input.empty() : this.size;
    }

    /**
     * URL to clone the repository from Google Cloud Source Repositories. Read-only field.
     * 
     */
    @InputImport(name="url")
      private final @Nullable Input<String> url;

    public Input<String> getUrl() {
        return this.url == null ? Input.empty() : this.url;
    }

    public RepoArgs(
        @Nullable Input<MirrorConfigArgs> mirrorConfig,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<Map<String,String>> pubsubConfigs,
        @Nullable Input<String> size,
        @Nullable Input<String> url) {
        this.mirrorConfig = mirrorConfig;
        this.name = name;
        this.project = project;
        this.pubsubConfigs = pubsubConfigs;
        this.size = size;
        this.url = url;
    }

    private RepoArgs() {
        this.mirrorConfig = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.pubsubConfigs = Input.empty();
        this.size = Input.empty();
        this.url = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<MirrorConfigArgs> mirrorConfig;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<Map<String,String>> pubsubConfigs;
        private @Nullable Input<String> size;
        private @Nullable Input<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(RepoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mirrorConfig = defaults.mirrorConfig;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.pubsubConfigs = defaults.pubsubConfigs;
    	      this.size = defaults.size;
    	      this.url = defaults.url;
        }

        public Builder setMirrorConfig(@Nullable Input<MirrorConfigArgs> mirrorConfig) {
            this.mirrorConfig = mirrorConfig;
            return this;
        }

        public Builder setMirrorConfig(@Nullable MirrorConfigArgs mirrorConfig) {
            this.mirrorConfig = Input.ofNullable(mirrorConfig);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
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

        public Builder setPubsubConfigs(@Nullable Input<Map<String,String>> pubsubConfigs) {
            this.pubsubConfigs = pubsubConfigs;
            return this;
        }

        public Builder setPubsubConfigs(@Nullable Map<String,String> pubsubConfigs) {
            this.pubsubConfigs = Input.ofNullable(pubsubConfigs);
            return this;
        }

        public Builder setSize(@Nullable Input<String> size) {
            this.size = size;
            return this;
        }

        public Builder setSize(@Nullable String size) {
            this.size = Input.ofNullable(size);
            return this;
        }

        public Builder setUrl(@Nullable Input<String> url) {
            this.url = url;
            return this;
        }

        public Builder setUrl(@Nullable String url) {
            this.url = Input.ofNullable(url);
            return this;
        }
        public RepoArgs build() {
            return new RepoArgs(mirrorConfig, name, project, pubsubConfigs, size, url);
        }
    }
}
