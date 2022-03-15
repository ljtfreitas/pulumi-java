// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.docker.inputs.RemoteImageBuildGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RemoteImageState extends io.pulumi.resources.ResourceArgs {

    public static final RemoteImageState Empty = new RemoteImageState();

    /**
     * Configuration to build an image. Please see [docker build command
     * reference](https://docs.docker.com/engine/reference/commandline/build/#options) too.
     * 
     */
    @Import(name="build")
      private final @Nullable Output<RemoteImageBuildGetArgs> build;

    public Output<RemoteImageBuildGetArgs> getBuild() {
        return this.build == null ? Output.empty() : this.build;
    }

    /**
     * If true, then the image is removed forcibly when the resource is destroyed.
     * 
     */
    @Import(name="forceRemove")
      private final @Nullable Output<Boolean> forceRemove;

    public Output<Boolean> getForceRemove() {
        return this.forceRemove == null ? Output.empty() : this.forceRemove;
    }

    /**
     * If true, then the Docker image won't be deleted on destroy operation. If this is false, it will delete the image from
     * the docker local storage on destroy operation.
     * 
     */
    @Import(name="keepLocally")
      private final @Nullable Output<Boolean> keepLocally;

    public Output<Boolean> getKeepLocally() {
        return this.keepLocally == null ? Output.empty() : this.keepLocally;
    }

    /**
     * The ID of the image in the form of `sha256:<hash>` image digest. Do not confuse it with the default `latest` tag.
     * 
     * @Deprecated
     * Use repo_digest instead
     * 
     */
    @Deprecated /* Use repo_digest instead */
    @Import(name="latest")
      private final @Nullable Output<String> latest;

    @Deprecated /* Use repo_digest instead */
    public Output<String> getLatest() {
        return this.latest == null ? Output.empty() : this.latest;
    }

    /**
     * The name of the Docker image, including any tags or SHA256 repo digests.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * @Deprecated
     * Is unused and will be removed.
     * 
     */
    @Deprecated /* Is unused and will be removed. */
    @Import(name="output")
      private final @Nullable Output<String> output;

    @Deprecated /* Is unused and will be removed. */
    public Output<String> getOutput() {
        return this.output == null ? Output.empty() : this.output;
    }

    /**
     * A value which cause an image pull when changed
     * 
     * @Deprecated
     * Use field pull_triggers instead
     * 
     */
    @Deprecated /* Use field pull_triggers instead */
    @Import(name="pullTrigger")
      private final @Nullable Output<String> pullTrigger;

    @Deprecated /* Use field pull_triggers instead */
    public Output<String> getPullTrigger() {
        return this.pullTrigger == null ? Output.empty() : this.pullTrigger;
    }

    /**
     * List of values which cause an image pull when changed. This is used to store the image digest from the registry when
     * using the [docker_registry_image](../data-sources/registry_image.md).
     * 
     */
    @Import(name="pullTriggers")
      private final @Nullable Output<List<String>> pullTriggers;

    public Output<List<String>> getPullTriggers() {
        return this.pullTriggers == null ? Output.empty() : this.pullTriggers;
    }

    /**
     * The image sha256 digest in the form of `repo[:tag]@sha256:<hash>`.
     * 
     */
    @Import(name="repoDigest")
      private final @Nullable Output<String> repoDigest;

    public Output<String> getRepoDigest() {
        return this.repoDigest == null ? Output.empty() : this.repoDigest;
    }

    public RemoteImageState(
        @Nullable Output<RemoteImageBuildGetArgs> build,
        @Nullable Output<Boolean> forceRemove,
        @Nullable Output<Boolean> keepLocally,
        @Nullable Output<String> latest,
        @Nullable Output<String> name,
        @Nullable Output<String> output,
        @Nullable Output<String> pullTrigger,
        @Nullable Output<List<String>> pullTriggers,
        @Nullable Output<String> repoDigest) {
        this.build = build;
        this.forceRemove = forceRemove;
        this.keepLocally = keepLocally;
        this.latest = latest;
        this.name = name;
        this.output = output;
        this.pullTrigger = pullTrigger;
        this.pullTriggers = pullTriggers;
        this.repoDigest = repoDigest;
    }

    private RemoteImageState() {
        this.build = Output.empty();
        this.forceRemove = Output.empty();
        this.keepLocally = Output.empty();
        this.latest = Output.empty();
        this.name = Output.empty();
        this.output = Output.empty();
        this.pullTrigger = Output.empty();
        this.pullTriggers = Output.empty();
        this.repoDigest = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RemoteImageState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RemoteImageBuildGetArgs> build;
        private @Nullable Output<Boolean> forceRemove;
        private @Nullable Output<Boolean> keepLocally;
        private @Nullable Output<String> latest;
        private @Nullable Output<String> name;
        private @Nullable Output<String> output;
        private @Nullable Output<String> pullTrigger;
        private @Nullable Output<List<String>> pullTriggers;
        private @Nullable Output<String> repoDigest;

        public Builder() {
    	      // Empty
        }

        public Builder(RemoteImageState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.build = defaults.build;
    	      this.forceRemove = defaults.forceRemove;
    	      this.keepLocally = defaults.keepLocally;
    	      this.latest = defaults.latest;
    	      this.name = defaults.name;
    	      this.output = defaults.output;
    	      this.pullTrigger = defaults.pullTrigger;
    	      this.pullTriggers = defaults.pullTriggers;
    	      this.repoDigest = defaults.repoDigest;
        }

        public Builder build(@Nullable Output<RemoteImageBuildGetArgs> build) {
            this.build = build;
            return this;
        }

        public Builder build(@Nullable RemoteImageBuildGetArgs build) {
            this.build = Output.ofNullable(build);
            return this;
        }

        public Builder forceRemove(@Nullable Output<Boolean> forceRemove) {
            this.forceRemove = forceRemove;
            return this;
        }

        public Builder forceRemove(@Nullable Boolean forceRemove) {
            this.forceRemove = Output.ofNullable(forceRemove);
            return this;
        }

        public Builder keepLocally(@Nullable Output<Boolean> keepLocally) {
            this.keepLocally = keepLocally;
            return this;
        }

        public Builder keepLocally(@Nullable Boolean keepLocally) {
            this.keepLocally = Output.ofNullable(keepLocally);
            return this;
        }

        public Builder latest(@Nullable Output<String> latest) {
            this.latest = latest;
            return this;
        }

        public Builder latest(@Nullable String latest) {
            this.latest = Output.ofNullable(latest);
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

        public Builder output(@Nullable Output<String> output) {
            this.output = output;
            return this;
        }

        public Builder output(@Nullable String output) {
            this.output = Output.ofNullable(output);
            return this;
        }

        public Builder pullTrigger(@Nullable Output<String> pullTrigger) {
            this.pullTrigger = pullTrigger;
            return this;
        }

        public Builder pullTrigger(@Nullable String pullTrigger) {
            this.pullTrigger = Output.ofNullable(pullTrigger);
            return this;
        }

        public Builder pullTriggers(@Nullable Output<List<String>> pullTriggers) {
            this.pullTriggers = pullTriggers;
            return this;
        }

        public Builder pullTriggers(@Nullable List<String> pullTriggers) {
            this.pullTriggers = Output.ofNullable(pullTriggers);
            return this;
        }

        public Builder repoDigest(@Nullable Output<String> repoDigest) {
            this.repoDigest = repoDigest;
            return this;
        }

        public Builder repoDigest(@Nullable String repoDigest) {
            this.repoDigest = Output.ofNullable(repoDigest);
            return this;
        }
        public RemoteImageState build() {
            return new RemoteImageState(build, forceRemove, keepLocally, latest, name, output, pullTrigger, pullTriggers, repoDigest);
        }
    }
}
