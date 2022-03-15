// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.customerprofiles.inputs;

import io.pulumi.awsnative.customerprofiles.inputs.IntegrationSourceFlowConfigArgs;
import io.pulumi.awsnative.customerprofiles.inputs.IntegrationTaskArgs;
import io.pulumi.awsnative.customerprofiles.inputs.IntegrationTriggerConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IntegrationFlowDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntegrationFlowDefinitionArgs Empty = new IntegrationFlowDefinitionArgs();

    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    @Import(name="flowName", required=true)
      private final Output<String> flowName;

    public Output<String> getFlowName() {
        return this.flowName;
    }

    @Import(name="kmsArn", required=true)
      private final Output<String> kmsArn;

    public Output<String> getKmsArn() {
        return this.kmsArn;
    }

    @Import(name="sourceFlowConfig", required=true)
      private final Output<IntegrationSourceFlowConfigArgs> sourceFlowConfig;

    public Output<IntegrationSourceFlowConfigArgs> getSourceFlowConfig() {
        return this.sourceFlowConfig;
    }

    @Import(name="tasks", required=true)
      private final Output<List<IntegrationTaskArgs>> tasks;

    public Output<List<IntegrationTaskArgs>> getTasks() {
        return this.tasks;
    }

    @Import(name="triggerConfig", required=true)
      private final Output<IntegrationTriggerConfigArgs> triggerConfig;

    public Output<IntegrationTriggerConfigArgs> getTriggerConfig() {
        return this.triggerConfig;
    }

    public IntegrationFlowDefinitionArgs(
        @Nullable Output<String> description,
        Output<String> flowName,
        Output<String> kmsArn,
        Output<IntegrationSourceFlowConfigArgs> sourceFlowConfig,
        Output<List<IntegrationTaskArgs>> tasks,
        Output<IntegrationTriggerConfigArgs> triggerConfig) {
        this.description = description;
        this.flowName = Objects.requireNonNull(flowName, "expected parameter 'flowName' to be non-null");
        this.kmsArn = Objects.requireNonNull(kmsArn, "expected parameter 'kmsArn' to be non-null");
        this.sourceFlowConfig = Objects.requireNonNull(sourceFlowConfig, "expected parameter 'sourceFlowConfig' to be non-null");
        this.tasks = Objects.requireNonNull(tasks, "expected parameter 'tasks' to be non-null");
        this.triggerConfig = Objects.requireNonNull(triggerConfig, "expected parameter 'triggerConfig' to be non-null");
    }

    private IntegrationFlowDefinitionArgs() {
        this.description = Output.empty();
        this.flowName = Output.empty();
        this.kmsArn = Output.empty();
        this.sourceFlowConfig = Output.empty();
        this.tasks = Output.empty();
        this.triggerConfig = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationFlowDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private Output<String> flowName;
        private Output<String> kmsArn;
        private Output<IntegrationSourceFlowConfigArgs> sourceFlowConfig;
        private Output<List<IntegrationTaskArgs>> tasks;
        private Output<IntegrationTriggerConfigArgs> triggerConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationFlowDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.flowName = defaults.flowName;
    	      this.kmsArn = defaults.kmsArn;
    	      this.sourceFlowConfig = defaults.sourceFlowConfig;
    	      this.tasks = defaults.tasks;
    	      this.triggerConfig = defaults.triggerConfig;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder flowName(Output<String> flowName) {
            this.flowName = Objects.requireNonNull(flowName);
            return this;
        }

        public Builder flowName(String flowName) {
            this.flowName = Output.of(Objects.requireNonNull(flowName));
            return this;
        }

        public Builder kmsArn(Output<String> kmsArn) {
            this.kmsArn = Objects.requireNonNull(kmsArn);
            return this;
        }

        public Builder kmsArn(String kmsArn) {
            this.kmsArn = Output.of(Objects.requireNonNull(kmsArn));
            return this;
        }

        public Builder sourceFlowConfig(Output<IntegrationSourceFlowConfigArgs> sourceFlowConfig) {
            this.sourceFlowConfig = Objects.requireNonNull(sourceFlowConfig);
            return this;
        }

        public Builder sourceFlowConfig(IntegrationSourceFlowConfigArgs sourceFlowConfig) {
            this.sourceFlowConfig = Output.of(Objects.requireNonNull(sourceFlowConfig));
            return this;
        }

        public Builder tasks(Output<List<IntegrationTaskArgs>> tasks) {
            this.tasks = Objects.requireNonNull(tasks);
            return this;
        }

        public Builder tasks(List<IntegrationTaskArgs> tasks) {
            this.tasks = Output.of(Objects.requireNonNull(tasks));
            return this;
        }

        public Builder triggerConfig(Output<IntegrationTriggerConfigArgs> triggerConfig) {
            this.triggerConfig = Objects.requireNonNull(triggerConfig);
            return this;
        }

        public Builder triggerConfig(IntegrationTriggerConfigArgs triggerConfig) {
            this.triggerConfig = Output.of(Objects.requireNonNull(triggerConfig));
            return this;
        }
        public IntegrationFlowDefinitionArgs build() {
            return new IntegrationFlowDefinitionArgs(description, flowName, kmsArn, sourceFlowConfig, tasks, triggerConfig);
        }
    }
}
