// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codepipeline;

import io.pulumi.aws.codepipeline.inputs.PipelineArtifactStoreArgs;
import io.pulumi.aws.codepipeline.inputs.PipelineStageArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PipelineArgs extends io.pulumi.resources.ResourceArgs {

    public static final PipelineArgs Empty = new PipelineArgs();

    /**
     * One or more artifact_store blocks. Artifact stores are documented below.
     * 
     */
    @InputImport(name="artifactStore", required=true)
    private final Input<PipelineArtifactStoreArgs> artifactStore;

    public Input<PipelineArtifactStoreArgs> getArtifactStore() {
        return this.artifactStore;
    }

    /**
     * The name of the pipeline.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A service role Amazon Resource Name (ARN) that grants AWS CodePipeline permission to make calls to AWS services on your behalf.
     * 
     */
    @InputImport(name="roleArn", required=true)
    private final Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn;
    }

    /**
     * A stage block. Stages are documented below.
     * 
     */
    @InputImport(name="stages", required=true)
    private final Input<List<PipelineStageArgs>> stages;

    public Input<List<PipelineStageArgs>> getStages() {
        return this.stages;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public PipelineArgs(
        Input<PipelineArtifactStoreArgs> artifactStore,
        @Nullable Input<String> name,
        Input<String> roleArn,
        Input<List<PipelineStageArgs>> stages,
        @Nullable Input<Map<String,String>> tags) {
        this.artifactStore = Objects.requireNonNull(artifactStore, "expected parameter 'artifactStore' to be non-null");
        this.name = name;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.stages = Objects.requireNonNull(stages, "expected parameter 'stages' to be non-null");
        this.tags = tags;
    }

    private PipelineArgs() {
        this.artifactStore = Input.empty();
        this.name = Input.empty();
        this.roleArn = Input.empty();
        this.stages = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<PipelineArtifactStoreArgs> artifactStore;
        private @Nullable Input<String> name;
        private Input<String> roleArn;
        private Input<List<PipelineStageArgs>> stages;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactStore = defaults.artifactStore;
    	      this.name = defaults.name;
    	      this.roleArn = defaults.roleArn;
    	      this.stages = defaults.stages;
    	      this.tags = defaults.tags;
        }

        public Builder setArtifactStore(Input<PipelineArtifactStoreArgs> artifactStore) {
            this.artifactStore = Objects.requireNonNull(artifactStore);
            return this;
        }

        public Builder setArtifactStore(PipelineArtifactStoreArgs artifactStore) {
            this.artifactStore = Input.of(Objects.requireNonNull(artifactStore));
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

        public Builder setRoleArn(Input<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Input.of(Objects.requireNonNull(roleArn));
            return this;
        }

        public Builder setStages(Input<List<PipelineStageArgs>> stages) {
            this.stages = Objects.requireNonNull(stages);
            return this;
        }

        public Builder setStages(List<PipelineStageArgs> stages) {
            this.stages = Input.of(Objects.requireNonNull(stages));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public PipelineArgs build() {
            return new PipelineArgs(artifactStore, name, roleArn, stages, tags);
        }
    }
}
