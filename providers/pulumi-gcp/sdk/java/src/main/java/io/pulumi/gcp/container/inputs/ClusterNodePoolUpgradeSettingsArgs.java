// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class ClusterNodePoolUpgradeSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterNodePoolUpgradeSettingsArgs Empty = new ClusterNodePoolUpgradeSettingsArgs();

    @Import(name="maxSurge", required=true)
      private final Output<Integer> maxSurge;

    public Output<Integer> getMaxSurge() {
        return this.maxSurge;
    }

    @Import(name="maxUnavailable", required=true)
      private final Output<Integer> maxUnavailable;

    public Output<Integer> getMaxUnavailable() {
        return this.maxUnavailable;
    }

    public ClusterNodePoolUpgradeSettingsArgs(
        Output<Integer> maxSurge,
        Output<Integer> maxUnavailable) {
        this.maxSurge = Objects.requireNonNull(maxSurge, "expected parameter 'maxSurge' to be non-null");
        this.maxUnavailable = Objects.requireNonNull(maxUnavailable, "expected parameter 'maxUnavailable' to be non-null");
    }

    private ClusterNodePoolUpgradeSettingsArgs() {
        this.maxSurge = Output.empty();
        this.maxUnavailable = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodePoolUpgradeSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> maxSurge;
        private Output<Integer> maxUnavailable;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterNodePoolUpgradeSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxSurge = defaults.maxSurge;
    	      this.maxUnavailable = defaults.maxUnavailable;
        }

        public Builder maxSurge(Output<Integer> maxSurge) {
            this.maxSurge = Objects.requireNonNull(maxSurge);
            return this;
        }

        public Builder maxSurge(Integer maxSurge) {
            this.maxSurge = Output.of(Objects.requireNonNull(maxSurge));
            return this;
        }

        public Builder maxUnavailable(Output<Integer> maxUnavailable) {
            this.maxUnavailable = Objects.requireNonNull(maxUnavailable);
            return this;
        }

        public Builder maxUnavailable(Integer maxUnavailable) {
            this.maxUnavailable = Output.of(Objects.requireNonNull(maxUnavailable));
            return this;
        }
        public ClusterNodePoolUpgradeSettingsArgs build() {
            return new ClusterNodePoolUpgradeSettingsArgs(maxSurge, maxUnavailable);
        }
    }
}
