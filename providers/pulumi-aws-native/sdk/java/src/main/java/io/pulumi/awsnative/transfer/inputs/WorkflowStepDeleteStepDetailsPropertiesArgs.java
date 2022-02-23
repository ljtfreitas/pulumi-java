// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.transfer.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Details for a step that deletes the file.
 * 
 */
public final class WorkflowStepDeleteStepDetailsPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowStepDeleteStepDetailsPropertiesArgs Empty = new WorkflowStepDeleteStepDetailsPropertiesArgs();

    /**
     * The name of the step, used as an identifier.
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public WorkflowStepDeleteStepDetailsPropertiesArgs(@Nullable Input<String> name) {
        this.name = name;
    }

    private WorkflowStepDeleteStepDetailsPropertiesArgs() {
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowStepDeleteStepDetailsPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowStepDeleteStepDetailsPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }
        public WorkflowStepDeleteStepDetailsPropertiesArgs build() {
            return new WorkflowStepDeleteStepDetailsPropertiesArgs(name);
        }
    }
}
