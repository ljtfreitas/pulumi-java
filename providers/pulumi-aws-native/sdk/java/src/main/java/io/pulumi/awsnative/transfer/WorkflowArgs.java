// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.transfer;

import io.pulumi.awsnative.transfer.inputs.WorkflowStepArgs;
import io.pulumi.awsnative.transfer.inputs.WorkflowTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkflowArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowArgs Empty = new WorkflowArgs();

    /**
     * A textual description for the workflow.
     * 
     */
    @InputImport(name="description")
        private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Specifies the steps (actions) to take if any errors are encountered during execution of the workflow.
     * 
     */
    @InputImport(name="onExceptionSteps")
        private final @Nullable Input<List<WorkflowStepArgs>> onExceptionSteps;

    public Input<List<WorkflowStepArgs>> getOnExceptionSteps() {
        return this.onExceptionSteps == null ? Input.empty() : this.onExceptionSteps;
    }

    /**
     * Specifies the details for the steps that are in the specified workflow.
     * 
     */
    @InputImport(name="steps", required=true)
        private final Input<List<WorkflowStepArgs>> steps;

    public Input<List<WorkflowStepArgs>> getSteps() {
        return this.steps;
    }

    /**
     * Key-value pairs that can be used to group and search for workflows. Tags are metadata attached to workflows for any purpose.
     * 
     */
    @InputImport(name="tags")
        private final @Nullable Input<List<WorkflowTagArgs>> tags;

    public Input<List<WorkflowTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public WorkflowArgs(
        @Nullable Input<String> description,
        @Nullable Input<List<WorkflowStepArgs>> onExceptionSteps,
        Input<List<WorkflowStepArgs>> steps,
        @Nullable Input<List<WorkflowTagArgs>> tags) {
        this.description = description;
        this.onExceptionSteps = onExceptionSteps;
        this.steps = Objects.requireNonNull(steps, "expected parameter 'steps' to be non-null");
        this.tags = tags;
    }

    private WorkflowArgs() {
        this.description = Input.empty();
        this.onExceptionSteps = Input.empty();
        this.steps = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<List<WorkflowStepArgs>> onExceptionSteps;
        private Input<List<WorkflowStepArgs>> steps;
        private @Nullable Input<List<WorkflowTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.onExceptionSteps = defaults.onExceptionSteps;
    	      this.steps = defaults.steps;
    	      this.tags = defaults.tags;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setOnExceptionSteps(@Nullable Input<List<WorkflowStepArgs>> onExceptionSteps) {
            this.onExceptionSteps = onExceptionSteps;
            return this;
        }

        public Builder setOnExceptionSteps(@Nullable List<WorkflowStepArgs> onExceptionSteps) {
            this.onExceptionSteps = Input.ofNullable(onExceptionSteps);
            return this;
        }

        public Builder setSteps(Input<List<WorkflowStepArgs>> steps) {
            this.steps = Objects.requireNonNull(steps);
            return this;
        }

        public Builder setSteps(List<WorkflowStepArgs> steps) {
            this.steps = Input.of(Objects.requireNonNull(steps));
            return this;
        }

        public Builder setTags(@Nullable Input<List<WorkflowTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<WorkflowTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public WorkflowArgs build() {
            return new WorkflowArgs(description, onExceptionSteps, steps, tags);
        }
    }
}
