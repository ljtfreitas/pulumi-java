// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssm.inputs;

import io.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersAutomationParametersGetArgs;
import io.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersLambdaParametersGetArgs;
import io.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersGetArgs;
import io.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParametersGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MaintenanceWindowTaskTaskInvocationParametersGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final MaintenanceWindowTaskTaskInvocationParametersGetArgs Empty = new MaintenanceWindowTaskTaskInvocationParametersGetArgs();

    /**
     * The parameters for an AUTOMATION task type. Documented below.
     * 
     */
    @Import(name="automationParameters")
      private final @Nullable Output<MaintenanceWindowTaskTaskInvocationParametersAutomationParametersGetArgs> automationParameters;

    public Output<MaintenanceWindowTaskTaskInvocationParametersAutomationParametersGetArgs> getAutomationParameters() {
        return this.automationParameters == null ? Output.empty() : this.automationParameters;
    }

    /**
     * The parameters for a LAMBDA task type. Documented below.
     * 
     */
    @Import(name="lambdaParameters")
      private final @Nullable Output<MaintenanceWindowTaskTaskInvocationParametersLambdaParametersGetArgs> lambdaParameters;

    public Output<MaintenanceWindowTaskTaskInvocationParametersLambdaParametersGetArgs> getLambdaParameters() {
        return this.lambdaParameters == null ? Output.empty() : this.lambdaParameters;
    }

    /**
     * The parameters for a RUN_COMMAND task type. Documented below.
     * 
     */
    @Import(name="runCommandParameters")
      private final @Nullable Output<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersGetArgs> runCommandParameters;

    public Output<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersGetArgs> getRunCommandParameters() {
        return this.runCommandParameters == null ? Output.empty() : this.runCommandParameters;
    }

    /**
     * The parameters for a STEP_FUNCTIONS task type. Documented below.
     * 
     */
    @Import(name="stepFunctionsParameters")
      private final @Nullable Output<MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParametersGetArgs> stepFunctionsParameters;

    public Output<MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParametersGetArgs> getStepFunctionsParameters() {
        return this.stepFunctionsParameters == null ? Output.empty() : this.stepFunctionsParameters;
    }

    public MaintenanceWindowTaskTaskInvocationParametersGetArgs(
        @Nullable Output<MaintenanceWindowTaskTaskInvocationParametersAutomationParametersGetArgs> automationParameters,
        @Nullable Output<MaintenanceWindowTaskTaskInvocationParametersLambdaParametersGetArgs> lambdaParameters,
        @Nullable Output<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersGetArgs> runCommandParameters,
        @Nullable Output<MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParametersGetArgs> stepFunctionsParameters) {
        this.automationParameters = automationParameters;
        this.lambdaParameters = lambdaParameters;
        this.runCommandParameters = runCommandParameters;
        this.stepFunctionsParameters = stepFunctionsParameters;
    }

    private MaintenanceWindowTaskTaskInvocationParametersGetArgs() {
        this.automationParameters = Output.empty();
        this.lambdaParameters = Output.empty();
        this.runCommandParameters = Output.empty();
        this.stepFunctionsParameters = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaintenanceWindowTaskTaskInvocationParametersGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<MaintenanceWindowTaskTaskInvocationParametersAutomationParametersGetArgs> automationParameters;
        private @Nullable Output<MaintenanceWindowTaskTaskInvocationParametersLambdaParametersGetArgs> lambdaParameters;
        private @Nullable Output<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersGetArgs> runCommandParameters;
        private @Nullable Output<MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParametersGetArgs> stepFunctionsParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(MaintenanceWindowTaskTaskInvocationParametersGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automationParameters = defaults.automationParameters;
    	      this.lambdaParameters = defaults.lambdaParameters;
    	      this.runCommandParameters = defaults.runCommandParameters;
    	      this.stepFunctionsParameters = defaults.stepFunctionsParameters;
        }

        public Builder automationParameters(@Nullable Output<MaintenanceWindowTaskTaskInvocationParametersAutomationParametersGetArgs> automationParameters) {
            this.automationParameters = automationParameters;
            return this;
        }

        public Builder automationParameters(@Nullable MaintenanceWindowTaskTaskInvocationParametersAutomationParametersGetArgs automationParameters) {
            this.automationParameters = Output.ofNullable(automationParameters);
            return this;
        }

        public Builder lambdaParameters(@Nullable Output<MaintenanceWindowTaskTaskInvocationParametersLambdaParametersGetArgs> lambdaParameters) {
            this.lambdaParameters = lambdaParameters;
            return this;
        }

        public Builder lambdaParameters(@Nullable MaintenanceWindowTaskTaskInvocationParametersLambdaParametersGetArgs lambdaParameters) {
            this.lambdaParameters = Output.ofNullable(lambdaParameters);
            return this;
        }

        public Builder runCommandParameters(@Nullable Output<MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersGetArgs> runCommandParameters) {
            this.runCommandParameters = runCommandParameters;
            return this;
        }

        public Builder runCommandParameters(@Nullable MaintenanceWindowTaskTaskInvocationParametersRunCommandParametersGetArgs runCommandParameters) {
            this.runCommandParameters = Output.ofNullable(runCommandParameters);
            return this;
        }

        public Builder stepFunctionsParameters(@Nullable Output<MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParametersGetArgs> stepFunctionsParameters) {
            this.stepFunctionsParameters = stepFunctionsParameters;
            return this;
        }

        public Builder stepFunctionsParameters(@Nullable MaintenanceWindowTaskTaskInvocationParametersStepFunctionsParametersGetArgs stepFunctionsParameters) {
            this.stepFunctionsParameters = Output.ofNullable(stepFunctionsParameters);
            return this;
        }
        public MaintenanceWindowTaskTaskInvocationParametersGetArgs build() {
            return new MaintenanceWindowTaskTaskInvocationParametersGetArgs(automationParameters, lambdaParameters, runCommandParameters, stepFunctionsParameters);
        }
    }
}
