// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudbuild.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.cloudbuild.inputs.TriggerBuildArtifactsArgs;
import io.pulumi.gcp.cloudbuild.inputs.TriggerBuildAvailableSecretsArgs;
import io.pulumi.gcp.cloudbuild.inputs.TriggerBuildOptionsArgs;
import io.pulumi.gcp.cloudbuild.inputs.TriggerBuildSecretArgs;
import io.pulumi.gcp.cloudbuild.inputs.TriggerBuildSourceArgs;
import io.pulumi.gcp.cloudbuild.inputs.TriggerBuildStepArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TriggerBuildArgs extends io.pulumi.resources.ResourceArgs {

    public static final TriggerBuildArgs Empty = new TriggerBuildArgs();

    /**
     * Artifacts produced by the build that should be uploaded upon successful completion of all build steps.
     * Structure is documented below.
     * 
     */
    @Import(name="artifacts")
      private final @Nullable Output<TriggerBuildArtifactsArgs> artifacts;

    public Output<TriggerBuildArtifactsArgs> getArtifacts() {
        return this.artifacts == null ? Output.empty() : this.artifacts;
    }

    /**
     * Secrets and secret environment variables.
     * Structure is documented below.
     * 
     */
    @Import(name="availableSecrets")
      private final @Nullable Output<TriggerBuildAvailableSecretsArgs> availableSecrets;

    public Output<TriggerBuildAvailableSecretsArgs> getAvailableSecrets() {
        return this.availableSecrets == null ? Output.empty() : this.availableSecrets;
    }

    /**
     * A list of images to be pushed upon the successful completion of all build steps.
     * The images will be pushed using the builder service account's credentials.
     * The digests of the pushed images will be stored in the Build resource's results field.
     * If any of the images fail to be pushed, the build is marked FAILURE.
     * 
     */
    @Import(name="images")
      private final @Nullable Output<List<String>> images;

    public Output<List<String>> getImages() {
        return this.images == null ? Output.empty() : this.images;
    }

    /**
     * Google Cloud Storage bucket where logs should be written.
     * Logs file names will be of the format ${logsBucket}/log-${build_id}.txt.
     * 
     */
    @Import(name="logsBucket")
      private final @Nullable Output<String> logsBucket;

    public Output<String> getLogsBucket() {
        return this.logsBucket == null ? Output.empty() : this.logsBucket;
    }

    /**
     * Special options for this build.
     * Structure is documented below.
     * 
     */
    @Import(name="options")
      private final @Nullable Output<TriggerBuildOptionsArgs> options;

    public Output<TriggerBuildOptionsArgs> getOptions() {
        return this.options == null ? Output.empty() : this.options;
    }

    /**
     * TTL in queue for this build. If provided and the build is enqueued longer than this value,
     * the build will expire and the build status will be EXPIRED.
     * The TTL starts ticking from createTime.
     * A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    @Import(name="queueTtl")
      private final @Nullable Output<String> queueTtl;

    public Output<String> getQueueTtl() {
        return this.queueTtl == null ? Output.empty() : this.queueTtl;
    }

    /**
     * Secrets to decrypt using Cloud Key Management Service.
     * Structure is documented below.
     * 
     */
    @Import(name="secrets")
      private final @Nullable Output<List<TriggerBuildSecretArgs>> secrets;

    public Output<List<TriggerBuildSecretArgs>> getSecrets() {
        return this.secrets == null ? Output.empty() : this.secrets;
    }

    /**
     * The location of the source files to build.
     * One of `storageSource` or `repoSource` must be provided.
     * Structure is documented below.
     * 
     */
    @Import(name="source")
      private final @Nullable Output<TriggerBuildSourceArgs> source;

    public Output<TriggerBuildSourceArgs> getSource() {
        return this.source == null ? Output.empty() : this.source;
    }

    /**
     * The operations to be performed on the workspace.
     * Structure is documented below.
     * 
     */
    @Import(name="steps", required=true)
      private final Output<List<TriggerBuildStepArgs>> steps;

    public Output<List<TriggerBuildStepArgs>> getSteps() {
        return this.steps;
    }

    /**
     * Substitutions to use in a triggered build. Should only be used with triggers.run
     * 
     */
    @Import(name="substitutions")
      private final @Nullable Output<Map<String,String>> substitutions;

    public Output<Map<String,String>> getSubstitutions() {
        return this.substitutions == null ? Output.empty() : this.substitutions;
    }

    /**
     * Tags for annotation of a Build. These are not docker tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<String>> tags;

    public Output<List<String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * Time limit for executing this build step. If not defined,
     * the step has no
     * time limit and will be allowed to continue to run until either it
     * completes or the build itself times out.
     * 
     */
    @Import(name="timeout")
      private final @Nullable Output<String> timeout;

    public Output<String> getTimeout() {
        return this.timeout == null ? Output.empty() : this.timeout;
    }

    public TriggerBuildArgs(
        @Nullable Output<TriggerBuildArtifactsArgs> artifacts,
        @Nullable Output<TriggerBuildAvailableSecretsArgs> availableSecrets,
        @Nullable Output<List<String>> images,
        @Nullable Output<String> logsBucket,
        @Nullable Output<TriggerBuildOptionsArgs> options,
        @Nullable Output<String> queueTtl,
        @Nullable Output<List<TriggerBuildSecretArgs>> secrets,
        @Nullable Output<TriggerBuildSourceArgs> source,
        Output<List<TriggerBuildStepArgs>> steps,
        @Nullable Output<Map<String,String>> substitutions,
        @Nullable Output<List<String>> tags,
        @Nullable Output<String> timeout) {
        this.artifacts = artifacts;
        this.availableSecrets = availableSecrets;
        this.images = images;
        this.logsBucket = logsBucket;
        this.options = options;
        this.queueTtl = queueTtl;
        this.secrets = secrets;
        this.source = source;
        this.steps = Objects.requireNonNull(steps, "expected parameter 'steps' to be non-null");
        this.substitutions = substitutions;
        this.tags = tags;
        this.timeout = timeout;
    }

    private TriggerBuildArgs() {
        this.artifacts = Output.empty();
        this.availableSecrets = Output.empty();
        this.images = Output.empty();
        this.logsBucket = Output.empty();
        this.options = Output.empty();
        this.queueTtl = Output.empty();
        this.secrets = Output.empty();
        this.source = Output.empty();
        this.steps = Output.empty();
        this.substitutions = Output.empty();
        this.tags = Output.empty();
        this.timeout = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerBuildArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<TriggerBuildArtifactsArgs> artifacts;
        private @Nullable Output<TriggerBuildAvailableSecretsArgs> availableSecrets;
        private @Nullable Output<List<String>> images;
        private @Nullable Output<String> logsBucket;
        private @Nullable Output<TriggerBuildOptionsArgs> options;
        private @Nullable Output<String> queueTtl;
        private @Nullable Output<List<TriggerBuildSecretArgs>> secrets;
        private @Nullable Output<TriggerBuildSourceArgs> source;
        private Output<List<TriggerBuildStepArgs>> steps;
        private @Nullable Output<Map<String,String>> substitutions;
        private @Nullable Output<List<String>> tags;
        private @Nullable Output<String> timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerBuildArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifacts = defaults.artifacts;
    	      this.availableSecrets = defaults.availableSecrets;
    	      this.images = defaults.images;
    	      this.logsBucket = defaults.logsBucket;
    	      this.options = defaults.options;
    	      this.queueTtl = defaults.queueTtl;
    	      this.secrets = defaults.secrets;
    	      this.source = defaults.source;
    	      this.steps = defaults.steps;
    	      this.substitutions = defaults.substitutions;
    	      this.tags = defaults.tags;
    	      this.timeout = defaults.timeout;
        }

        public Builder artifacts(@Nullable Output<TriggerBuildArtifactsArgs> artifacts) {
            this.artifacts = artifacts;
            return this;
        }

        public Builder artifacts(@Nullable TriggerBuildArtifactsArgs artifacts) {
            this.artifacts = Output.ofNullable(artifacts);
            return this;
        }

        public Builder availableSecrets(@Nullable Output<TriggerBuildAvailableSecretsArgs> availableSecrets) {
            this.availableSecrets = availableSecrets;
            return this;
        }

        public Builder availableSecrets(@Nullable TriggerBuildAvailableSecretsArgs availableSecrets) {
            this.availableSecrets = Output.ofNullable(availableSecrets);
            return this;
        }

        public Builder images(@Nullable Output<List<String>> images) {
            this.images = images;
            return this;
        }

        public Builder images(@Nullable List<String> images) {
            this.images = Output.ofNullable(images);
            return this;
        }

        public Builder logsBucket(@Nullable Output<String> logsBucket) {
            this.logsBucket = logsBucket;
            return this;
        }

        public Builder logsBucket(@Nullable String logsBucket) {
            this.logsBucket = Output.ofNullable(logsBucket);
            return this;
        }

        public Builder options(@Nullable Output<TriggerBuildOptionsArgs> options) {
            this.options = options;
            return this;
        }

        public Builder options(@Nullable TriggerBuildOptionsArgs options) {
            this.options = Output.ofNullable(options);
            return this;
        }

        public Builder queueTtl(@Nullable Output<String> queueTtl) {
            this.queueTtl = queueTtl;
            return this;
        }

        public Builder queueTtl(@Nullable String queueTtl) {
            this.queueTtl = Output.ofNullable(queueTtl);
            return this;
        }

        public Builder secrets(@Nullable Output<List<TriggerBuildSecretArgs>> secrets) {
            this.secrets = secrets;
            return this;
        }

        public Builder secrets(@Nullable List<TriggerBuildSecretArgs> secrets) {
            this.secrets = Output.ofNullable(secrets);
            return this;
        }

        public Builder source(@Nullable Output<TriggerBuildSourceArgs> source) {
            this.source = source;
            return this;
        }

        public Builder source(@Nullable TriggerBuildSourceArgs source) {
            this.source = Output.ofNullable(source);
            return this;
        }

        public Builder steps(Output<List<TriggerBuildStepArgs>> steps) {
            this.steps = Objects.requireNonNull(steps);
            return this;
        }

        public Builder steps(List<TriggerBuildStepArgs> steps) {
            this.steps = Output.of(Objects.requireNonNull(steps));
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

        public Builder timeout(@Nullable Output<String> timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder timeout(@Nullable String timeout) {
            this.timeout = Output.ofNullable(timeout);
            return this;
        }
        public TriggerBuildArgs build() {
            return new TriggerBuildArgs(artifacts, availableSecrets, images, logsBucket, options, queueTtl, secrets, source, steps, substitutions, tags, timeout);
        }
    }
}
