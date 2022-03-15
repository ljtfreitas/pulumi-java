// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codepipeline.inputs;

import io.pulumi.aws.codepipeline.inputs.PipelineArtifactStoreGetArgs;
import io.pulumi.aws.codepipeline.inputs.PipelineStageGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PipelineState extends io.pulumi.resources.ResourceArgs {

    public static final PipelineState Empty = new PipelineState();

    /**
     * The codepipeline ARN.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * One or more artifact_store blocks. Artifact stores are documented below.
     * 
     */
    @Import(name="artifactStore")
      private final @Nullable Output<PipelineArtifactStoreGetArgs> artifactStore;

    public Output<PipelineArtifactStoreGetArgs> getArtifactStore() {
        return this.artifactStore == null ? Output.empty() : this.artifactStore;
    }

    /**
     * The name of the pipeline.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * A service role Amazon Resource Name (ARN) that grants AWS CodePipeline permission to make calls to AWS services on your behalf.
     * 
     */
    @Import(name="roleArn")
      private final @Nullable Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn == null ? Output.empty() : this.roleArn;
    }

    /**
     * A stage block. Stages are documented below.
     * 
     */
    @Import(name="stages")
      private final @Nullable Output<List<PipelineStageGetArgs>> stages;

    public Output<List<PipelineStageGetArgs>> getStages() {
        return this.stages == null ? Output.empty() : this.stages;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    public PipelineState(
        @Nullable Output<String> arn,
        @Nullable Output<PipelineArtifactStoreGetArgs> artifactStore,
        @Nullable Output<String> name,
        @Nullable Output<String> roleArn,
        @Nullable Output<List<PipelineStageGetArgs>> stages,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.artifactStore = artifactStore;
        this.name = name;
        this.roleArn = roleArn;
        this.stages = stages;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private PipelineState() {
        this.arn = Output.empty();
        this.artifactStore = Output.empty();
        this.name = Output.empty();
        this.roleArn = Output.empty();
        this.stages = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<PipelineArtifactStoreGetArgs> artifactStore;
        private @Nullable Output<String> name;
        private @Nullable Output<String> roleArn;
        private @Nullable Output<List<PipelineStageGetArgs>> stages;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.artifactStore = defaults.artifactStore;
    	      this.name = defaults.name;
    	      this.roleArn = defaults.roleArn;
    	      this.stages = defaults.stages;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }

        public Builder artifactStore(@Nullable Output<PipelineArtifactStoreGetArgs> artifactStore) {
            this.artifactStore = artifactStore;
            return this;
        }

        public Builder artifactStore(@Nullable PipelineArtifactStoreGetArgs artifactStore) {
            this.artifactStore = Output.ofNullable(artifactStore);
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

        public Builder roleArn(@Nullable Output<String> roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = Output.ofNullable(roleArn);
            return this;
        }

        public Builder stages(@Nullable Output<List<PipelineStageGetArgs>> stages) {
            this.stages = stages;
            return this;
        }

        public Builder stages(@Nullable List<PipelineStageGetArgs> stages) {
            this.stages = Output.ofNullable(stages);
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
        public PipelineState build() {
            return new PipelineState(arn, artifactStore, name, roleArn, stages, tags, tagsAll);
        }
    }
}
