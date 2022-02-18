// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.PipelineReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.TriggerPipelineReferenceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Trigger that allows the referenced pipeline to depend on other pipeline runs based on runDimension Name/Value pairs. Upstream pipelines should declare the same runDimension Name and their runs should have the values for those runDimensions. The referenced pipeline run would be triggered if the values for the runDimension match for all upstream pipeline runs.
 * 
 */
public final class ChainingTriggerArgs extends io.pulumi.resources.ResourceArgs {

    public static final ChainingTriggerArgs Empty = new ChainingTriggerArgs();

    /**
     * List of tags that can be used for describing the trigger.
     * 
     */
    @InputImport(name="annotations")
    private final @Nullable Input<List<Object>> annotations;

    public Input<List<Object>> getAnnotations() {
        return this.annotations == null ? Input.empty() : this.annotations;
    }

    /**
     * Upstream Pipelines.
     * 
     */
    @InputImport(name="dependsOn", required=true)
    private final Input<List<PipelineReferenceArgs>> dependsOn;

    public Input<List<PipelineReferenceArgs>> getDependsOn() {
        return this.dependsOn;
    }

    /**
     * Trigger description.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Pipeline for which runs are created when all upstream pipelines complete successfully.
     * 
     */
    @InputImport(name="pipeline", required=true)
    private final Input<TriggerPipelineReferenceArgs> pipeline;

    public Input<TriggerPipelineReferenceArgs> getPipeline() {
        return this.pipeline;
    }

    /**
     * Run Dimension property that needs to be emitted by upstream pipelines.
     * 
     */
    @InputImport(name="runDimension", required=true)
    private final Input<String> runDimension;

    public Input<String> getRunDimension() {
        return this.runDimension;
    }

    /**
     * Trigger type.
     * Expected value is 'ChainingTrigger'.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public ChainingTriggerArgs(
        @Nullable Input<List<Object>> annotations,
        Input<List<PipelineReferenceArgs>> dependsOn,
        @Nullable Input<String> description,
        Input<TriggerPipelineReferenceArgs> pipeline,
        Input<String> runDimension,
        Input<String> type) {
        this.annotations = annotations;
        this.dependsOn = Objects.requireNonNull(dependsOn, "expected parameter 'dependsOn' to be non-null");
        this.description = description;
        this.pipeline = Objects.requireNonNull(pipeline, "expected parameter 'pipeline' to be non-null");
        this.runDimension = Objects.requireNonNull(runDimension, "expected parameter 'runDimension' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ChainingTriggerArgs() {
        this.annotations = Input.empty();
        this.dependsOn = Input.empty();
        this.description = Input.empty();
        this.pipeline = Input.empty();
        this.runDimension = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChainingTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<Object>> annotations;
        private Input<List<PipelineReferenceArgs>> dependsOn;
        private @Nullable Input<String> description;
        private Input<TriggerPipelineReferenceArgs> pipeline;
        private Input<String> runDimension;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ChainingTriggerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.pipeline = defaults.pipeline;
    	      this.runDimension = defaults.runDimension;
    	      this.type = defaults.type;
        }

        public Builder setAnnotations(@Nullable Input<List<Object>> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = Input.ofNullable(annotations);
            return this;
        }

        public Builder setDependsOn(Input<List<PipelineReferenceArgs>> dependsOn) {
            this.dependsOn = Objects.requireNonNull(dependsOn);
            return this;
        }

        public Builder setDependsOn(List<PipelineReferenceArgs> dependsOn) {
            this.dependsOn = Input.of(Objects.requireNonNull(dependsOn));
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setPipeline(Input<TriggerPipelineReferenceArgs> pipeline) {
            this.pipeline = Objects.requireNonNull(pipeline);
            return this;
        }

        public Builder setPipeline(TriggerPipelineReferenceArgs pipeline) {
            this.pipeline = Input.of(Objects.requireNonNull(pipeline));
            return this;
        }

        public Builder setRunDimension(Input<String> runDimension) {
            this.runDimension = Objects.requireNonNull(runDimension);
            return this;
        }

        public Builder setRunDimension(String runDimension) {
            this.runDimension = Input.of(Objects.requireNonNull(runDimension));
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public ChainingTriggerArgs build() {
            return new ChainingTriggerArgs(annotations, dependsOn, description, pipeline, runDimension, type);
        }
    }
}
