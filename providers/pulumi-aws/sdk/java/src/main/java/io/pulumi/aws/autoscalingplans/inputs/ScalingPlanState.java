// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscalingplans.inputs;

import io.pulumi.aws.autoscalingplans.inputs.ScalingPlanApplicationSourceGetArgs;
import io.pulumi.aws.autoscalingplans.inputs.ScalingPlanScalingInstructionGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ScalingPlanState extends io.pulumi.resources.ResourceArgs {

    public static final ScalingPlanState Empty = new ScalingPlanState();

    /**
     * A CloudFormation stack or set of tags. You can create one scaling plan per application source.
     * 
     */
    @Import(name="applicationSource")
      private final @Nullable Output<ScalingPlanApplicationSourceGetArgs> applicationSource;

    public Output<ScalingPlanApplicationSourceGetArgs> getApplicationSource() {
        return this.applicationSource == null ? Output.empty() : this.applicationSource;
    }

    /**
     * The name of the scaling plan. Names cannot contain vertical bars, colons, or forward slashes.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The scaling instructions. More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_ScalingInstruction.html).
     * 
     */
    @Import(name="scalingInstructions")
      private final @Nullable Output<List<ScalingPlanScalingInstructionGetArgs>> scalingInstructions;

    public Output<List<ScalingPlanScalingInstructionGetArgs>> getScalingInstructions() {
        return this.scalingInstructions == null ? Output.empty() : this.scalingInstructions;
    }

    /**
     * The version number of the scaling plan. This value is always 1.
     * 
     */
    @Import(name="scalingPlanVersion")
      private final @Nullable Output<Integer> scalingPlanVersion;

    public Output<Integer> getScalingPlanVersion() {
        return this.scalingPlanVersion == null ? Output.empty() : this.scalingPlanVersion;
    }

    public ScalingPlanState(
        @Nullable Output<ScalingPlanApplicationSourceGetArgs> applicationSource,
        @Nullable Output<String> name,
        @Nullable Output<List<ScalingPlanScalingInstructionGetArgs>> scalingInstructions,
        @Nullable Output<Integer> scalingPlanVersion) {
        this.applicationSource = applicationSource;
        this.name = name;
        this.scalingInstructions = scalingInstructions;
        this.scalingPlanVersion = scalingPlanVersion;
    }

    private ScalingPlanState() {
        this.applicationSource = Output.empty();
        this.name = Output.empty();
        this.scalingInstructions = Output.empty();
        this.scalingPlanVersion = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScalingPlanState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ScalingPlanApplicationSourceGetArgs> applicationSource;
        private @Nullable Output<String> name;
        private @Nullable Output<List<ScalingPlanScalingInstructionGetArgs>> scalingInstructions;
        private @Nullable Output<Integer> scalingPlanVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(ScalingPlanState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationSource = defaults.applicationSource;
    	      this.name = defaults.name;
    	      this.scalingInstructions = defaults.scalingInstructions;
    	      this.scalingPlanVersion = defaults.scalingPlanVersion;
        }

        public Builder applicationSource(@Nullable Output<ScalingPlanApplicationSourceGetArgs> applicationSource) {
            this.applicationSource = applicationSource;
            return this;
        }

        public Builder applicationSource(@Nullable ScalingPlanApplicationSourceGetArgs applicationSource) {
            this.applicationSource = Output.ofNullable(applicationSource);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder scalingInstructions(@Nullable Output<List<ScalingPlanScalingInstructionGetArgs>> scalingInstructions) {
            this.scalingInstructions = scalingInstructions;
            return this;
        }

        public Builder scalingInstructions(@Nullable List<ScalingPlanScalingInstructionGetArgs> scalingInstructions) {
            this.scalingInstructions = Output.ofNullable(scalingInstructions);
            return this;
        }

        public Builder scalingPlanVersion(@Nullable Output<Integer> scalingPlanVersion) {
            this.scalingPlanVersion = scalingPlanVersion;
            return this;
        }

        public Builder scalingPlanVersion(@Nullable Integer scalingPlanVersion) {
            this.scalingPlanVersion = Output.ofNullable(scalingPlanVersion);
            return this;
        }
        public ScalingPlanState build() {
            return new ScalingPlanState(applicationSource, name, scalingInstructions, scalingPlanVersion);
        }
    }
}
