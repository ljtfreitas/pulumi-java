// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.awsnative.appflow.enums.FlowTriggerType;
import io.pulumi.awsnative.appflow.inputs.FlowScheduledTriggerPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Trigger settings of the flow.
 * 
 */
public final class FlowTriggerConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowTriggerConfigArgs Empty = new FlowTriggerConfigArgs();

    /**
     * Details required based on the type of trigger
     * 
     */
    @Import(name="triggerProperties")
      private final @Nullable Output<FlowScheduledTriggerPropertiesArgs> triggerProperties;

    public Output<FlowScheduledTriggerPropertiesArgs> getTriggerProperties() {
        return this.triggerProperties == null ? Output.empty() : this.triggerProperties;
    }

    /**
     * Trigger type of the flow
     * 
     */
    @Import(name="triggerType", required=true)
      private final Output<FlowTriggerType> triggerType;

    public Output<FlowTriggerType> getTriggerType() {
        return this.triggerType;
    }

    public FlowTriggerConfigArgs(
        @Nullable Output<FlowScheduledTriggerPropertiesArgs> triggerProperties,
        Output<FlowTriggerType> triggerType) {
        this.triggerProperties = triggerProperties;
        this.triggerType = Objects.requireNonNull(triggerType, "expected parameter 'triggerType' to be non-null");
    }

    private FlowTriggerConfigArgs() {
        this.triggerProperties = Output.empty();
        this.triggerType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowTriggerConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<FlowScheduledTriggerPropertiesArgs> triggerProperties;
        private Output<FlowTriggerType> triggerType;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowTriggerConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.triggerProperties = defaults.triggerProperties;
    	      this.triggerType = defaults.triggerType;
        }

        public Builder triggerProperties(@Nullable Output<FlowScheduledTriggerPropertiesArgs> triggerProperties) {
            this.triggerProperties = triggerProperties;
            return this;
        }

        public Builder triggerProperties(@Nullable FlowScheduledTriggerPropertiesArgs triggerProperties) {
            this.triggerProperties = Output.ofNullable(triggerProperties);
            return this;
        }

        public Builder triggerType(Output<FlowTriggerType> triggerType) {
            this.triggerType = Objects.requireNonNull(triggerType);
            return this;
        }

        public Builder triggerType(FlowTriggerType triggerType) {
            this.triggerType = Output.of(Objects.requireNonNull(triggerType));
            return this;
        }
        public FlowTriggerConfigArgs build() {
            return new FlowTriggerConfigArgs(triggerProperties, triggerType);
        }
    }
}
