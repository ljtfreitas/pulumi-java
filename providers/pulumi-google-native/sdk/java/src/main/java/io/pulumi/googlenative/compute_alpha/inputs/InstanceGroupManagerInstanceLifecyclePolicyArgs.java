// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_alpha.inputs.InstanceGroupManagerInstanceLifecyclePolicyMetadataBasedReadinessSignalArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceGroupManagerInstanceLifecyclePolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceGroupManagerInstanceLifecyclePolicyArgs Empty = new InstanceGroupManagerInstanceLifecyclePolicyArgs();

    /**
     * The configuration for metadata based readiness signal sent by the instance during initialization when stopping / suspending an instance. The Instance Group Manager will wait for a signal that indicates successful initialization before stopping / suspending an instance. If a successful readiness signal is not sent before timeout, the corresponding instance will not be stopped / suspended. Instead, an error will be visible in the lastAttempt.errors field of the managed instance in the listmanagedinstances method. If metadataBasedReadinessSignal.timeoutSec is unset, the Instance Group Manager will directly proceed to suspend / stop instances, skipping initialization on them.
     * 
     */
    @Import(name="metadataBasedReadinessSignal")
      private final @Nullable Output<InstanceGroupManagerInstanceLifecyclePolicyMetadataBasedReadinessSignalArgs> metadataBasedReadinessSignal;

    public Output<InstanceGroupManagerInstanceLifecyclePolicyMetadataBasedReadinessSignalArgs> getMetadataBasedReadinessSignal() {
        return this.metadataBasedReadinessSignal == null ? Output.empty() : this.metadataBasedReadinessSignal;
    }

    public InstanceGroupManagerInstanceLifecyclePolicyArgs(@Nullable Output<InstanceGroupManagerInstanceLifecyclePolicyMetadataBasedReadinessSignalArgs> metadataBasedReadinessSignal) {
        this.metadataBasedReadinessSignal = metadataBasedReadinessSignal;
    }

    private InstanceGroupManagerInstanceLifecyclePolicyArgs() {
        this.metadataBasedReadinessSignal = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupManagerInstanceLifecyclePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<InstanceGroupManagerInstanceLifecyclePolicyMetadataBasedReadinessSignalArgs> metadataBasedReadinessSignal;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupManagerInstanceLifecyclePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadataBasedReadinessSignal = defaults.metadataBasedReadinessSignal;
        }

        public Builder metadataBasedReadinessSignal(@Nullable Output<InstanceGroupManagerInstanceLifecyclePolicyMetadataBasedReadinessSignalArgs> metadataBasedReadinessSignal) {
            this.metadataBasedReadinessSignal = metadataBasedReadinessSignal;
            return this;
        }

        public Builder metadataBasedReadinessSignal(@Nullable InstanceGroupManagerInstanceLifecyclePolicyMetadataBasedReadinessSignalArgs metadataBasedReadinessSignal) {
            this.metadataBasedReadinessSignal = Output.ofNullable(metadataBasedReadinessSignal);
            return this;
        }
        public InstanceGroupManagerInstanceLifecyclePolicyArgs build() {
            return new InstanceGroupManagerInstanceLifecyclePolicyArgs(metadataBasedReadinessSignal);
        }
    }
}
