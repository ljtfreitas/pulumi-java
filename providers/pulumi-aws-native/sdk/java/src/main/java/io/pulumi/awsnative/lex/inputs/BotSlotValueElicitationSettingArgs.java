// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import io.pulumi.awsnative.lex.enums.BotSlotConstraint;
import io.pulumi.awsnative.lex.inputs.BotPromptSpecificationArgs;
import io.pulumi.awsnative.lex.inputs.BotSampleUtteranceArgs;
import io.pulumi.awsnative.lex.inputs.BotSlotDefaultValueSpecificationArgs;
import io.pulumi.awsnative.lex.inputs.BotWaitAndContinueSpecificationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="defaultValueSpecification")
        private final @Nullable Input<BotSlotDefaultValueSpecificationArgs> defaultValueSpecification;

    public Input<BotSlotDefaultValueSpecificationArgs> getDefaultValueSpecification() {
        return this.defaultValueSpecification == null ? Input.empty() : this.defaultValueSpecification;
    }

    /**
     * The prompt that Amazon Lex uses to elicit the slot value from the user.
     * 
     */
    @InputImport(name="promptSpecification")
        private final @Nullable Input<BotPromptSpecificationArgs> promptSpecification;

    public Input<BotPromptSpecificationArgs> getPromptSpecification() {
        return this.promptSpecification == null ? Input.empty() : this.promptSpecification;
    }

    /**
     * If you know a specific pattern that users might respond to an Amazon Lex request for a slot value, you can provide those utterances to improve accuracy.
     * 
     */
    @InputImport(name="sampleUtterances")
        private final @Nullable Input<List<BotSampleUtteranceArgs>> sampleUtterances;

    public Input<List<BotSampleUtteranceArgs>> getSampleUtterances() {
        return this.sampleUtterances == null ? Input.empty() : this.sampleUtterances;
    }

    /**
     * Specifies whether the slot is required or optional.
     * 
     */
    @InputImport(name="slotConstraint", required=true)
        private final Input<BotSlotConstraint> slotConstraint;

    public Input<BotSlotConstraint> getSlotConstraint() {
        return this.slotConstraint;
    }

    /**
     * Specifies the prompts that Amazon Lex uses while a bot is waiting for customer input.
     * 
     */
    @InputImport(name="waitAndContinueSpecification")
        private final @Nullable Input<BotWaitAndContinueSpecificationArgs> waitAndContinueSpecification;

    public Input<BotWaitAndContinueSpecificationArgs> getWaitAndContinueSpecification() {
        return this.waitAndContinueSpecification == null ? Input.empty() : this.waitAndContinueSpecification;
    }

    public BotSlotValueElicitationSettingArgs(
        @Nullable Input<BotSlotDefaultValueSpecificationArgs> defaultValueSpecification,
        @Nullable Input<BotPromptSpecificationArgs> promptSpecification,
        @Nullable Input<List<BotSampleUtteranceArgs>> sampleUtterances,
        Input<BotSlotConstraint> slotConstraint,
        @Nullable Input<BotWaitAndContinueSpecificationArgs> waitAndContinueSpecification) {
        this.defaultValueSpecification = defaultValueSpecification;
        this.promptSpecification = promptSpecification;
        this.sampleUtterances = sampleUtterances;
        this.slotConstraint = Objects.requireNonNull(slotConstraint, "expected parameter 'slotConstraint' to be non-null");
        this.waitAndContinueSpecification = waitAndContinueSpecification;
    }

    private BotSlotValueElicitationSettingArgs() {
        this.defaultValueSpecification = Input.empty();
        this.promptSpecification = Input.empty();
        this.sampleUtterances = Input.empty();
        this.slotConstraint = Input.empty();
        this.waitAndContinueSpecification = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotSlotValueElicitationSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<BotSlotDefaultValueSpecificationArgs> defaultValueSpecification;
        private @Nullable Input<BotPromptSpecificationArgs> promptSpecification;
        private @Nullable Input<List<BotSampleUtteranceArgs>> sampleUtterances;
        private Input<BotSlotConstraint> slotConstraint;
        private @Nullable Input<BotWaitAndContinueSpecificationArgs> waitAndContinueSpecification;

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

        public Builder setDefaultValueSpecification(@Nullable Input<BotSlotDefaultValueSpecificationArgs> defaultValueSpecification) {
            this.defaultValueSpecification = defaultValueSpecification;
            return this;
        }

        public Builder setDefaultValueSpecification(@Nullable BotSlotDefaultValueSpecificationArgs defaultValueSpecification) {
            this.defaultValueSpecification = Input.ofNullable(defaultValueSpecification);
            return this;
        }

        public Builder setPromptSpecification(@Nullable Input<BotPromptSpecificationArgs> promptSpecification) {
            this.promptSpecification = promptSpecification;
            return this;
        }

        public Builder setPromptSpecification(@Nullable BotPromptSpecificationArgs promptSpecification) {
            this.promptSpecification = Input.ofNullable(promptSpecification);
            return this;
        }

        public Builder setSampleUtterances(@Nullable Input<List<BotSampleUtteranceArgs>> sampleUtterances) {
            this.sampleUtterances = sampleUtterances;
            return this;
        }

        public Builder setSampleUtterances(@Nullable List<BotSampleUtteranceArgs> sampleUtterances) {
            this.sampleUtterances = Input.ofNullable(sampleUtterances);
            return this;
        }

        public Builder setSlotConstraint(Input<BotSlotConstraint> slotConstraint) {
            this.slotConstraint = Objects.requireNonNull(slotConstraint);
            return this;
        }

        public Builder setSlotConstraint(BotSlotConstraint slotConstraint) {
            this.slotConstraint = Input.of(Objects.requireNonNull(slotConstraint));
            return this;
        }

        public Builder setWaitAndContinueSpecification(@Nullable Input<BotWaitAndContinueSpecificationArgs> waitAndContinueSpecification) {
            this.waitAndContinueSpecification = waitAndContinueSpecification;
            return this;
        }

        public Builder setWaitAndContinueSpecification(@Nullable BotWaitAndContinueSpecificationArgs waitAndContinueSpecification) {
            this.waitAndContinueSpecification = Input.ofNullable(waitAndContinueSpecification);
            return this;
        }
        public BotSlotValueElicitationSettingArgs build() {
            return new BotSlotValueElicitationSettingArgs(defaultValueSpecification, promptSpecification, sampleUtterances, slotConstraint, waitAndContinueSpecification);
        }
    }
}
