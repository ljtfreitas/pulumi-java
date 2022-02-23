// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.osconfig_v1beta.enums.PatchRolloutMode;
import io.pulumi.googlenative.osconfig_v1beta.inputs.FixedOrPercentArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Patch rollout configuration specifications. Contains details on the concurrency control when applying patch(es) to all targeted VMs.
 * 
 */
public final class PatchRolloutArgs extends io.pulumi.resources.ResourceArgs {

    public static final PatchRolloutArgs Empty = new PatchRolloutArgs();

    /**
     * The maximum number (or percentage) of VMs per zone to disrupt at any given moment. The number of VMs calculated from multiplying the percentage by the total number of VMs in a zone is rounded up. During patching, a VM is considered disrupted from the time the agent is notified to begin until patching has completed. This disruption time includes the time to complete reboot and any post-patch steps. A VM contributes to the disruption budget if its patching operation fails either when applying the patches, running pre or post patch steps, or if it fails to respond with a success notification before timing out. VMs that are not running or do not have an active agent do not count toward this disruption budget. For zone-by-zone rollouts, if the disruption budget in a zone is exceeded, the patch job stops, because continuing to the next zone requires completion of the patch process in the previous zone. For example, if the disruption budget has a fixed value of `10`, and 8 VMs fail to patch in the current zone, the patch job continues to patch 2 VMs at a time until the zone is completed. When that zone is completed successfully, patching begins with 10 VMs at a time in the next zone. If 10 VMs in the next zone fail to patch, the patch job stops.
     * 
     */
    @InputImport(name="disruptionBudget")
      private final @Nullable Input<FixedOrPercentArgs> disruptionBudget;

    public Input<FixedOrPercentArgs> getDisruptionBudget() {
        return this.disruptionBudget == null ? Input.empty() : this.disruptionBudget;
    }

    /**
     * Mode of the patch rollout.
     * 
     */
    @InputImport(name="mode")
      private final @Nullable Input<PatchRolloutMode> mode;

    public Input<PatchRolloutMode> getMode() {
        return this.mode == null ? Input.empty() : this.mode;
    }

    public PatchRolloutArgs(
        @Nullable Input<FixedOrPercentArgs> disruptionBudget,
        @Nullable Input<PatchRolloutMode> mode) {
        this.disruptionBudget = disruptionBudget;
        this.mode = mode;
    }

    private PatchRolloutArgs() {
        this.disruptionBudget = Input.empty();
        this.mode = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchRolloutArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<FixedOrPercentArgs> disruptionBudget;
        private @Nullable Input<PatchRolloutMode> mode;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchRolloutArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disruptionBudget = defaults.disruptionBudget;
    	      this.mode = defaults.mode;
        }

        public Builder setDisruptionBudget(@Nullable Input<FixedOrPercentArgs> disruptionBudget) {
            this.disruptionBudget = disruptionBudget;
            return this;
        }

        public Builder setDisruptionBudget(@Nullable FixedOrPercentArgs disruptionBudget) {
            this.disruptionBudget = Input.ofNullable(disruptionBudget);
            return this;
        }

        public Builder setMode(@Nullable Input<PatchRolloutMode> mode) {
            this.mode = mode;
            return this;
        }

        public Builder setMode(@Nullable PatchRolloutMode mode) {
            this.mode = Input.ofNullable(mode);
            return this;
        }
        public PatchRolloutArgs build() {
            return new PatchRolloutArgs(disruptionBudget, mode);
        }
    }
}
