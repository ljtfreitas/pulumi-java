// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.enums.RosettaNetPipActivityType;
import io.pulumi.azurenative.logic.inputs.RosettaNetPipAcknowledgmentOfReceiptSettingsArgs;
import io.pulumi.azurenative.logic.inputs.RosettaNetPipActivityBehaviorArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * The integration account RosettaNet ProcessConfiguration activity settings.
 * 
 */
public final class RosettaNetPipActivitySettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final RosettaNetPipActivitySettingsArgs Empty = new RosettaNetPipActivitySettingsArgs();

    /**
     * The RosettaNet ProcessConfiguration acknowledgement settings.
     * 
     */
    @Import(name="acknowledgmentOfReceiptSettings", required=true)
      private final Output<RosettaNetPipAcknowledgmentOfReceiptSettingsArgs> acknowledgmentOfReceiptSettings;

    public Output<RosettaNetPipAcknowledgmentOfReceiptSettingsArgs> getAcknowledgmentOfReceiptSettings() {
        return this.acknowledgmentOfReceiptSettings;
    }

    /**
     * The RosettaNet ProcessConfiguration activity behavior.
     * 
     */
    @Import(name="activityBehavior", required=true)
      private final Output<RosettaNetPipActivityBehaviorArgs> activityBehavior;

    public Output<RosettaNetPipActivityBehaviorArgs> getActivityBehavior() {
        return this.activityBehavior;
    }

    /**
     * The RosettaNet ProcessConfiguration activity type.
     * 
     */
    @Import(name="activityType", required=true)
      private final Output<RosettaNetPipActivityType> activityType;

    public Output<RosettaNetPipActivityType> getActivityType() {
        return this.activityType;
    }

    public RosettaNetPipActivitySettingsArgs(
        Output<RosettaNetPipAcknowledgmentOfReceiptSettingsArgs> acknowledgmentOfReceiptSettings,
        Output<RosettaNetPipActivityBehaviorArgs> activityBehavior,
        Output<RosettaNetPipActivityType> activityType) {
        this.acknowledgmentOfReceiptSettings = Objects.requireNonNull(acknowledgmentOfReceiptSettings, "expected parameter 'acknowledgmentOfReceiptSettings' to be non-null");
        this.activityBehavior = Objects.requireNonNull(activityBehavior, "expected parameter 'activityBehavior' to be non-null");
        this.activityType = Objects.requireNonNull(activityType, "expected parameter 'activityType' to be non-null");
    }

    private RosettaNetPipActivitySettingsArgs() {
        this.acknowledgmentOfReceiptSettings = Output.empty();
        this.activityBehavior = Output.empty();
        this.activityType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RosettaNetPipActivitySettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<RosettaNetPipAcknowledgmentOfReceiptSettingsArgs> acknowledgmentOfReceiptSettings;
        private Output<RosettaNetPipActivityBehaviorArgs> activityBehavior;
        private Output<RosettaNetPipActivityType> activityType;

        public Builder() {
    	      // Empty
        }

        public Builder(RosettaNetPipActivitySettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acknowledgmentOfReceiptSettings = defaults.acknowledgmentOfReceiptSettings;
    	      this.activityBehavior = defaults.activityBehavior;
    	      this.activityType = defaults.activityType;
        }

        public Builder acknowledgmentOfReceiptSettings(Output<RosettaNetPipAcknowledgmentOfReceiptSettingsArgs> acknowledgmentOfReceiptSettings) {
            this.acknowledgmentOfReceiptSettings = Objects.requireNonNull(acknowledgmentOfReceiptSettings);
            return this;
        }

        public Builder acknowledgmentOfReceiptSettings(RosettaNetPipAcknowledgmentOfReceiptSettingsArgs acknowledgmentOfReceiptSettings) {
            this.acknowledgmentOfReceiptSettings = Output.of(Objects.requireNonNull(acknowledgmentOfReceiptSettings));
            return this;
        }

        public Builder activityBehavior(Output<RosettaNetPipActivityBehaviorArgs> activityBehavior) {
            this.activityBehavior = Objects.requireNonNull(activityBehavior);
            return this;
        }

        public Builder activityBehavior(RosettaNetPipActivityBehaviorArgs activityBehavior) {
            this.activityBehavior = Output.of(Objects.requireNonNull(activityBehavior));
            return this;
        }

        public Builder activityType(Output<RosettaNetPipActivityType> activityType) {
            this.activityType = Objects.requireNonNull(activityType);
            return this;
        }

        public Builder activityType(RosettaNetPipActivityType activityType) {
            this.activityType = Output.of(Objects.requireNonNull(activityType));
            return this;
        }
        public RosettaNetPipActivitySettingsArgs build() {
            return new RosettaNetPipActivitySettingsArgs(acknowledgmentOfReceiptSettings, activityBehavior, activityType);
        }
    }
}
