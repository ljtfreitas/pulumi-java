// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.TriggerPipelineReferenceResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Base class for all triggers that support one to many model for trigger to pipeline.
 * 
 */
public final class MultiplePipelineTriggerResponse extends io.pulumi.resources.InvokeArgs {

    public static final MultiplePipelineTriggerResponse Empty = new MultiplePipelineTriggerResponse();

    /**
     * List of tags that can be used for describing the trigger.
     * 
     */
    @InputImport(name="annotations")
    private final @Nullable List<Object> annotations;

    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }

    /**
     * Trigger description.
     * 
     */
    @InputImport(name="description")
    private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * Pipelines that need to be started.
     * 
     */
    @InputImport(name="pipelines")
    private final @Nullable List<TriggerPipelineReferenceResponse> pipelines;

    public List<TriggerPipelineReferenceResponse> getPipelines() {
        return this.pipelines == null ? List.of() : this.pipelines;
    }

    /**
     * Indicates if trigger is running or not. Updated when Start/Stop APIs are called on the Trigger.
     * 
     */
    @InputImport(name="runtimeState", required=true)
    private final String runtimeState;

    public String getRuntimeState() {
        return this.runtimeState;
    }

    /**
     * Trigger type.
     * Expected value is 'MultiplePipelineTrigger'.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public MultiplePipelineTriggerResponse(
        @Nullable List<Object> annotations,
        @Nullable String description,
        @Nullable List<TriggerPipelineReferenceResponse> pipelines,
        String runtimeState,
        String type) {
        this.annotations = annotations;
        this.description = description;
        this.pipelines = pipelines;
        this.runtimeState = Objects.requireNonNull(runtimeState, "expected parameter 'runtimeState' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private MultiplePipelineTriggerResponse() {
        this.annotations = List.of();
        this.description = null;
        this.pipelines = List.of();
        this.runtimeState = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MultiplePipelineTriggerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private @Nullable String description;
        private @Nullable List<TriggerPipelineReferenceResponse> pipelines;
        private String runtimeState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(MultiplePipelineTriggerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.description = defaults.description;
    	      this.pipelines = defaults.pipelines;
    	      this.runtimeState = defaults.runtimeState;
    	      this.type = defaults.type;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setPipelines(@Nullable List<TriggerPipelineReferenceResponse> pipelines) {
            this.pipelines = pipelines;
            return this;
        }

        public Builder setRuntimeState(String runtimeState) {
            this.runtimeState = Objects.requireNonNull(runtimeState);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public MultiplePipelineTriggerResponse build() {
            return new MultiplePipelineTriggerResponse(annotations, description, pipelines, runtimeState, type);
        }
    }
}
