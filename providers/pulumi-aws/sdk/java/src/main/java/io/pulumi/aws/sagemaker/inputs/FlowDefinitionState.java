// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopActivationConfigGetArgs;
import io.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopConfigGetArgs;
import io.pulumi.aws.sagemaker.inputs.FlowDefinitionHumanLoopRequestSourceGetArgs;
import io.pulumi.aws.sagemaker.inputs.FlowDefinitionOutputConfigGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlowDefinitionState extends io.pulumi.resources.ResourceArgs {

    public static final FlowDefinitionState Empty = new FlowDefinitionState();

    /**
     * The Amazon Resource Name (ARN) assigned by AWS to this Flow Definition.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * The name of your flow definition.
     * 
     */
    @Import(name="flowDefinitionName")
      private final @Nullable Output<String> flowDefinitionName;

    public Output<String> getFlowDefinitionName() {
        return this.flowDefinitionName == null ? Output.empty() : this.flowDefinitionName;
    }

    /**
     * An object containing information about the events that trigger a human workflow. See Human Loop Activation Config details below.
     * 
     */
    @Import(name="humanLoopActivationConfig")
      private final @Nullable Output<FlowDefinitionHumanLoopActivationConfigGetArgs> humanLoopActivationConfig;

    public Output<FlowDefinitionHumanLoopActivationConfigGetArgs> getHumanLoopActivationConfig() {
        return this.humanLoopActivationConfig == null ? Output.empty() : this.humanLoopActivationConfig;
    }

    /**
     * An object containing information about the tasks the human reviewers will perform. See Human Loop Config details below.
     * 
     */
    @Import(name="humanLoopConfig")
      private final @Nullable Output<FlowDefinitionHumanLoopConfigGetArgs> humanLoopConfig;

    public Output<FlowDefinitionHumanLoopConfigGetArgs> getHumanLoopConfig() {
        return this.humanLoopConfig == null ? Output.empty() : this.humanLoopConfig;
    }

    /**
     * Container for configuring the source of human task requests. Use to specify if Amazon Rekognition or Amazon Textract is used as an integration source. See Human Loop Request Source details below.
     * 
     */
    @Import(name="humanLoopRequestSource")
      private final @Nullable Output<FlowDefinitionHumanLoopRequestSourceGetArgs> humanLoopRequestSource;

    public Output<FlowDefinitionHumanLoopRequestSourceGetArgs> getHumanLoopRequestSource() {
        return this.humanLoopRequestSource == null ? Output.empty() : this.humanLoopRequestSource;
    }

    /**
     * An object containing information about where the human review results will be uploaded. See Output Config details below.
     * 
     */
    @Import(name="outputConfig")
      private final @Nullable Output<FlowDefinitionOutputConfigGetArgs> outputConfig;

    public Output<FlowDefinitionOutputConfigGetArgs> getOutputConfig() {
        return this.outputConfig == null ? Output.empty() : this.outputConfig;
    }

    /**
     * The Amazon Resource Name (ARN) of the role needed to call other services on your behalf.
     * 
     */
    @Import(name="roleArn")
      private final @Nullable Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn == null ? Output.empty() : this.roleArn;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    public FlowDefinitionState(
        @Nullable Output<String> arn,
        @Nullable Output<String> flowDefinitionName,
        @Nullable Output<FlowDefinitionHumanLoopActivationConfigGetArgs> humanLoopActivationConfig,
        @Nullable Output<FlowDefinitionHumanLoopConfigGetArgs> humanLoopConfig,
        @Nullable Output<FlowDefinitionHumanLoopRequestSourceGetArgs> humanLoopRequestSource,
        @Nullable Output<FlowDefinitionOutputConfigGetArgs> outputConfig,
        @Nullable Output<String> roleArn,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.flowDefinitionName = flowDefinitionName;
        this.humanLoopActivationConfig = humanLoopActivationConfig;
        this.humanLoopConfig = humanLoopConfig;
        this.humanLoopRequestSource = humanLoopRequestSource;
        this.outputConfig = outputConfig;
        this.roleArn = roleArn;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private FlowDefinitionState() {
        this.arn = Output.empty();
        this.flowDefinitionName = Output.empty();
        this.humanLoopActivationConfig = Output.empty();
        this.humanLoopConfig = Output.empty();
        this.humanLoopRequestSource = Output.empty();
        this.outputConfig = Output.empty();
        this.roleArn = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowDefinitionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> flowDefinitionName;
        private @Nullable Output<FlowDefinitionHumanLoopActivationConfigGetArgs> humanLoopActivationConfig;
        private @Nullable Output<FlowDefinitionHumanLoopConfigGetArgs> humanLoopConfig;
        private @Nullable Output<FlowDefinitionHumanLoopRequestSourceGetArgs> humanLoopRequestSource;
        private @Nullable Output<FlowDefinitionOutputConfigGetArgs> outputConfig;
        private @Nullable Output<String> roleArn;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowDefinitionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.flowDefinitionName = defaults.flowDefinitionName;
    	      this.humanLoopActivationConfig = defaults.humanLoopActivationConfig;
    	      this.humanLoopConfig = defaults.humanLoopConfig;
    	      this.humanLoopRequestSource = defaults.humanLoopRequestSource;
    	      this.outputConfig = defaults.outputConfig;
    	      this.roleArn = defaults.roleArn;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }

        public Builder flowDefinitionName(@Nullable Output<String> flowDefinitionName) {
            this.flowDefinitionName = flowDefinitionName;
            return this;
        }

        public Builder flowDefinitionName(@Nullable String flowDefinitionName) {
            this.flowDefinitionName = Output.ofNullable(flowDefinitionName);
            return this;
        }

        public Builder humanLoopActivationConfig(@Nullable Output<FlowDefinitionHumanLoopActivationConfigGetArgs> humanLoopActivationConfig) {
            this.humanLoopActivationConfig = humanLoopActivationConfig;
            return this;
        }

        public Builder humanLoopActivationConfig(@Nullable FlowDefinitionHumanLoopActivationConfigGetArgs humanLoopActivationConfig) {
            this.humanLoopActivationConfig = Output.ofNullable(humanLoopActivationConfig);
            return this;
        }

        public Builder humanLoopConfig(@Nullable Output<FlowDefinitionHumanLoopConfigGetArgs> humanLoopConfig) {
            this.humanLoopConfig = humanLoopConfig;
            return this;
        }

        public Builder humanLoopConfig(@Nullable FlowDefinitionHumanLoopConfigGetArgs humanLoopConfig) {
            this.humanLoopConfig = Output.ofNullable(humanLoopConfig);
            return this;
        }

        public Builder humanLoopRequestSource(@Nullable Output<FlowDefinitionHumanLoopRequestSourceGetArgs> humanLoopRequestSource) {
            this.humanLoopRequestSource = humanLoopRequestSource;
            return this;
        }

        public Builder humanLoopRequestSource(@Nullable FlowDefinitionHumanLoopRequestSourceGetArgs humanLoopRequestSource) {
            this.humanLoopRequestSource = Output.ofNullable(humanLoopRequestSource);
            return this;
        }

        public Builder outputConfig(@Nullable Output<FlowDefinitionOutputConfigGetArgs> outputConfig) {
            this.outputConfig = outputConfig;
            return this;
        }

        public Builder outputConfig(@Nullable FlowDefinitionOutputConfigGetArgs outputConfig) {
            this.outputConfig = Output.ofNullable(outputConfig);
            return this;
        }

        public Builder roleArn(@Nullable Output<String> roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = Output.ofNullable(roleArn);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }
        public FlowDefinitionState build() {
            return new FlowDefinitionState(arn, flowDefinitionName, humanLoopActivationConfig, humanLoopConfig, humanLoopRequestSource, outputConfig, roleArn, tags, tagsAll);
        }
    }
}
