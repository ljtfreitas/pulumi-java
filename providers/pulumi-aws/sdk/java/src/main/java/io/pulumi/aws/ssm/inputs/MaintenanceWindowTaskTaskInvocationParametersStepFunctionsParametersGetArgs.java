// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssm.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParametersGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParametersGetArgs Empty = new MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParametersGetArgs();

    /**
     * The inputs for the STEP_FUNCTION task.
     * 
     */
    @InputImport(name="input")
    private final @Nullable Input<String> input;

    public Input<String> getInput() {
        return this.input == null ? Input.empty() : this.input;
    }

    /**
     * The name of the STEP_FUNCTION task.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParametersGetArgs(
        @Nullable Input<String> input,
        @Nullable Input<String> name) {
        this.input = input;
        this.name = name;
    }

    private MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParametersGetArgs() {
        this.input = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParametersGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> input;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParametersGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.input = defaults.input;
    	      this.name = defaults.name;
        }

        public Builder setInput(@Nullable Input<String> input) {
            this.input = input;
            return this;
        }

        public Builder setInput(@Nullable String input) {
            this.input = Input.ofNullable(input);
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
        public MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParametersGetArgs build() {
            return new MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParametersGetArgs(input, name);
        }
    }
}
