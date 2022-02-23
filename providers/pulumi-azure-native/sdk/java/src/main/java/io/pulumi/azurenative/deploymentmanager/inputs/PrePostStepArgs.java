// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The properties that define a step.
 * 
 */
public final class PrePostStepArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrePostStepArgs Empty = new PrePostStepArgs();

    /**
     * The resource Id of the step to be run.
     * 
     */
    @InputImport(name="stepId", required=true)
        private final Input<String> stepId;

    public Input<String> getStepId() {
        return this.stepId;
    }

    public PrePostStepArgs(Input<String> stepId) {
        this.stepId = Objects.requireNonNull(stepId, "expected parameter 'stepId' to be non-null");
    }

    private PrePostStepArgs() {
        this.stepId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrePostStepArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> stepId;

        public Builder() {
    	      // Empty
        }

        public Builder(PrePostStepArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.stepId = defaults.stepId;
        }

        public Builder setStepId(Input<String> stepId) {
            this.stepId = Objects.requireNonNull(stepId);
            return this;
        }

        public Builder setStepId(String stepId) {
            this.stepId = Input.of(Objects.requireNonNull(stepId));
            return this;
        }
        public PrePostStepArgs build() {
            return new PrePostStepArgs(stepId);
        }
    }
}
