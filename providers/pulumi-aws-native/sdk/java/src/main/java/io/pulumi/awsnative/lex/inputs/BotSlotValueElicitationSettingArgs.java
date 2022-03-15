// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import io.pulumi.awsnative.lex.enums.BotSlotConstraint;
import io.pulumi.awsnative.lex.inputs.BotPromptSpecificationArgs;
import io.pulumi.awsnative.lex.inputs.BotSampleUtteranceArgs;
import io.pulumi.awsnative.lex.inputs.BotSlotDefaultValueSpecificationArgs;
import io.pulumi.awsnative.lex.inputs.BotWaitAndContinueSpecificationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Settings that you can use for eliciting a slot value.
 * 
 */
public final class BotSlotValueElicitationSettingArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotSlotValueElicitationSettingArgs Empty = new BotSlotValueElicitationSettingArgs();

    /**
     * A list of default values for a slot.
     * 
     */
    @Import(name="defaultValueSpecification")
      private final @Nullable Output<BotSlotDefaultValueSpecificationArgs> defaultValueSpecification;

    public Output<BotSlotDefaultValueSpecificationArgs> getDefaultValueSpecification() {
        return this.defaultValueSpecification == null ? Output.empty() : this.defaultValueSpecification;
    }

    /**
     * The prompt that Amazon Lex uses to elicit the slot value from the user.
     * 
     */
    @Import(name="promptSpecification")
      private final @Nullable Output<BotPromptSpecificationArgs> promptSpecification;

    public Output<BotPromptSpecificationArgs> getPromptSpecification() {
        return this.promptSpecification == null ? Output.empty() : this.promptSpecification;
    }

    /**
     * If you know a specific pattern that users might respond to an Amazon Lex request for a slot value, you can provide those utterances to improve accuracy.
     * 
     */
    @Import(name="sampleUtterances")
      private final @Nullable Output<List<BotSampleUtteranceArgs>> sampleUtterances;

    public Output<List<BotSampleUtteranceArgs>> getSampleUtterances() {
        return this.sampleUtterances == null ? Output.empty() : this.sampleUtterances;
    }

    /**
     * Specifies whether the slot is required or optional.
     * 
     */
    @Import(name="slotConstraint", required=true)
      private final Output<BotSlotConstraint> slotConstraint;

    public Output<BotSlotConstraint> getSlotConstraint() {
        return this.slotConstraint;
    }

    /**
     * Specifies the prompts that Amazon Lex uses while a bot is waiting for customer input.
     * 
     */
    @Import(name="waitAndContinueSpecification")
      private final @Nullable Output<BotWaitAndContinueSpecificationArgs> waitAndContinueSpecification;

    public Output<BotWaitAndContinueSpecificationArgs> getWaitAndContinueSpecification() {
        return this.waitAndContinueSpecification == null ? Output.empty() : this.waitAndContinueSpecification;
    }

    public BotSlotValueElicitationSettingArgs(
        @Nullable Output<BotSlotDefaultValueSpecificationArgs> defaultValueSpecification,
        @Nullable Output<BotPromptSpecificationArgs> promptSpecification,
        @Nullable Output<List<BotSampleUtteranceArgs>> sampleUtterances,
        Output<BotSlotConstraint> slotConstraint,
        @Nullable Output<BotWaitAndContinueSpecificationArgs> waitAndContinueSpecification) {
        this.defaultValueSpecification = defaultValueSpecification;
        this.promptSpecification = promptSpecification;
        this.sampleUtterances = sampleUtterances;
        this.slotConstraint = Objects.requireNonNull(slotConstraint, "expected parameter 'slotConstraint' to be non-null");
        this.waitAndContinueSpecification = waitAndContinueSpecification;
    }

    private BotSlotValueElicitationSettingArgs() {
        this.defaultValueSpecification = Output.empty();
        this.promptSpecification = Output.empty();
        this.sampleUtterances = Output.empty();
        this.slotConstraint = Output.empty();
        this.waitAndContinueSpecification = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotSlotValueElicitationSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<BotSlotDefaultValueSpecificationArgs> defaultValueSpecification;
        private @Nullable Output<BotPromptSpecificationArgs> promptSpecification;
        private @Nullable Output<List<BotSampleUtteranceArgs>> sampleUtterances;
        private Output<BotSlotConstraint> slotConstraint;
        private @Nullable Output<BotWaitAndContinueSpecificationArgs> waitAndContinueSpecification;

        public Builder() {
    	      // Empty
        }

        public Builder(BotSlotValueElicitationSettingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultValueSpecification = defaults.defaultValueSpecification;
    	      this.promptSpecification = defaults.promptSpecification;
    	      this.sampleUtterances = defaults.sampleUtterances;
    	      this.slotConstraint = defaults.slotConstraint;
    	      this.waitAndContinueSpecification = defaults.waitAndContinueSpecification;
        }

        public Builder defaultValueSpecification(@Nullable Output<BotSlotDefaultValueSpecificationArgs> defaultValueSpecification) {
            this.defaultValueSpecification = defaultValueSpecification;
            return this;
        }

        public Builder defaultValueSpecification(@Nullable BotSlotDefaultValueSpecificationArgs defaultValueSpecification) {
            this.defaultValueSpecification = Output.ofNullable(defaultValueSpecification);
            return this;
        }

        public Builder promptSpecification(@Nullable Output<BotPromptSpecificationArgs> promptSpecification) {
            this.promptSpecification = promptSpecification;
            return this;
        }

        public Builder promptSpecification(@Nullable BotPromptSpecificationArgs promptSpecification) {
            this.promptSpecification = Output.ofNullable(promptSpecification);
            return this;
        }

        public Builder sampleUtterances(@Nullable Output<List<BotSampleUtteranceArgs>> sampleUtterances) {
            this.sampleUtterances = sampleUtterances;
            return this;
        }

        public Builder sampleUtterances(@Nullable List<BotSampleUtteranceArgs> sampleUtterances) {
            this.sampleUtterances = Output.ofNullable(sampleUtterances);
            return this;
        }

        public Builder slotConstraint(Output<BotSlotConstraint> slotConstraint) {
            this.slotConstraint = Objects.requireNonNull(slotConstraint);
            return this;
        }

        public Builder slotConstraint(BotSlotConstraint slotConstraint) {
            this.slotConstraint = Output.of(Objects.requireNonNull(slotConstraint));
            return this;
        }

        public Builder waitAndContinueSpecification(@Nullable Output<BotWaitAndContinueSpecificationArgs> waitAndContinueSpecification) {
            this.waitAndContinueSpecification = waitAndContinueSpecification;
            return this;
        }

        public Builder waitAndContinueSpecification(@Nullable BotWaitAndContinueSpecificationArgs waitAndContinueSpecification) {
            this.waitAndContinueSpecification = Output.ofNullable(waitAndContinueSpecification);
            return this;
        }
        public BotSlotValueElicitationSettingArgs build() {
            return new BotSlotValueElicitationSettingArgs(defaultValueSpecification, promptSpecification, sampleUtterances, slotConstraint, waitAndContinueSpecification);
        }
    }
}
