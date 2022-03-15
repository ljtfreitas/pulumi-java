// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.TriggerPipelineReferenceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Trigger that runs every time the selected Blob container changes.
 * 
 */
public final class BlobTriggerArgs extends io.pulumi.resources.ResourceArgs {

    public static final BlobTriggerArgs Empty = new BlobTriggerArgs();

    /**
     * List of tags that can be used for describing the trigger.
     * 
     */
    @Import(name="annotations")
      private final @Nullable Output<List<Object>> annotations;

    public Output<List<Object>> getAnnotations() {
        return this.annotations == null ? Output.empty() : this.annotations;
    }

    /**
     * Trigger description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The path of the container/folder that will trigger the pipeline.
     * 
     */
    @Import(name="folderPath", required=true)
      private final Output<String> folderPath;

    public Output<String> getFolderPath() {
        return this.folderPath;
    }

    /**
     * The Azure Storage linked service reference.
     * 
     */
    @Import(name="linkedService", required=true)
      private final Output<LinkedServiceReferenceArgs> linkedService;

    public Output<LinkedServiceReferenceArgs> getLinkedService() {
        return this.linkedService;
    }

    /**
     * The max number of parallel files to handle when it is triggered.
     * 
     */
    @Import(name="maxConcurrency", required=true)
      private final Output<Integer> maxConcurrency;

    public Output<Integer> getMaxConcurrency() {
        return this.maxConcurrency;
    }

    /**
     * Pipelines that need to be started.
     * 
     */
    @Import(name="pipelines")
      private final @Nullable Output<List<TriggerPipelineReferenceArgs>> pipelines;

    public Output<List<TriggerPipelineReferenceArgs>> getPipelines() {
        return this.pipelines == null ? Output.empty() : this.pipelines;
    }

    /**
     * Trigger type.
     * Expected value is 'BlobTrigger'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public BlobTriggerArgs(
        @Nullable Output<List<Object>> annotations,
        @Nullable Output<String> description,
        Output<String> folderPath,
        Output<LinkedServiceReferenceArgs> linkedService,
        Output<Integer> maxConcurrency,
        @Nullable Output<List<TriggerPipelineReferenceArgs>> pipelines,
        Output<String> type) {
        this.annotations = annotations;
        this.description = description;
        this.folderPath = Objects.requireNonNull(folderPath, "expected parameter 'folderPath' to be non-null");
        this.linkedService = Objects.requireNonNull(linkedService, "expected parameter 'linkedService' to be non-null");
        this.maxConcurrency = Objects.requireNonNull(maxConcurrency, "expected parameter 'maxConcurrency' to be non-null");
        this.pipelines = pipelines;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private BlobTriggerArgs() {
        this.annotations = Output.empty();
        this.description = Output.empty();
        this.folderPath = Output.empty();
        this.linkedService = Output.empty();
        this.maxConcurrency = Output.empty();
        this.pipelines = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BlobTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<Object>> annotations;
        private @Nullable Output<String> description;
        private Output<String> folderPath;
        private Output<LinkedServiceReferenceArgs> linkedService;
        private Output<Integer> maxConcurrency;
        private @Nullable Output<List<TriggerPipelineReferenceArgs>> pipelines;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(BlobTriggerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.description = defaults.description;
    	      this.folderPath = defaults.folderPath;
    	      this.linkedService = defaults.linkedService;
    	      this.maxConcurrency = defaults.maxConcurrency;
    	      this.pipelines = defaults.pipelines;
    	      this.type = defaults.type;
        }

        public Builder annotations(@Nullable Output<List<Object>> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = Output.ofNullable(annotations);
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

        public Builder folderPath(Output<String> folderPath) {
            this.folderPath = Objects.requireNonNull(folderPath);
            return this;
        }

        public Builder folderPath(String folderPath) {
            this.folderPath = Output.of(Objects.requireNonNull(folderPath));
            return this;
        }

        public Builder linkedService(Output<LinkedServiceReferenceArgs> linkedService) {
            this.linkedService = Objects.requireNonNull(linkedService);
            return this;
        }

        public Builder linkedService(LinkedServiceReferenceArgs linkedService) {
            this.linkedService = Output.of(Objects.requireNonNull(linkedService));
            return this;
        }

        public Builder maxConcurrency(Output<Integer> maxConcurrency) {
            this.maxConcurrency = Objects.requireNonNull(maxConcurrency);
            return this;
        }

        public Builder maxConcurrency(Integer maxConcurrency) {
            this.maxConcurrency = Output.of(Objects.requireNonNull(maxConcurrency));
            return this;
        }

        public Builder pipelines(@Nullable Output<List<TriggerPipelineReferenceArgs>> pipelines) {
            this.pipelines = pipelines;
            return this;
        }

        public Builder pipelines(@Nullable List<TriggerPipelineReferenceArgs> pipelines) {
            this.pipelines = Output.ofNullable(pipelines);
            return this;
        }

        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public BlobTriggerArgs build() {
            return new BlobTriggerArgs(annotations, description, folderPath, linkedService, maxConcurrency, pipelines, type);
        }
    }
}
