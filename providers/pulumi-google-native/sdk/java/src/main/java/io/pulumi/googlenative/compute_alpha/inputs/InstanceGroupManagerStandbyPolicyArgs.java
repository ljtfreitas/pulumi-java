// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceGroupManagerStandbyPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceGroupManagerStandbyPolicyArgs Empty = new InstanceGroupManagerStandbyPolicyArgs();

    @InputImport(name="initialDelaySec")
      private final @Nullable Input<Integer> initialDelaySec;

    public Input<Integer> getInitialDelaySec() {
        return this.initialDelaySec == null ? Input.empty() : this.initialDelaySec;
    }

    public InstanceGroupManagerStandbyPolicyArgs(@Nullable Input<Integer> initialDelaySec) {
        this.initialDelaySec = initialDelaySec;
    }

    private InstanceGroupManagerStandbyPolicyArgs() {
        this.initialDelaySec = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupManagerStandbyPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> initialDelaySec;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupManagerStandbyPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.initialDelaySec = defaults.initialDelaySec;
        }

        public Builder setInitialDelaySec(@Nullable Input<Integer> initialDelaySec) {
            this.initialDelaySec = initialDelaySec;
            return this;
        }

        public Builder setInitialDelaySec(@Nullable Integer initialDelaySec) {
            this.initialDelaySec = Input.ofNullable(initialDelaySec);
            return this;
        }
        public InstanceGroupManagerStandbyPolicyArgs build() {
            return new InstanceGroupManagerStandbyPolicyArgs(initialDelaySec);
        }
    }
}
