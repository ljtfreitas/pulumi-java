// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gkehub.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FeatureMembershipConfigmanagementHierarchyControllerGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FeatureMembershipConfigmanagementHierarchyControllerGetArgs Empty = new FeatureMembershipConfigmanagementHierarchyControllerGetArgs();

    /**
     * Whether hierarchical resource quota is enabled in this cluster.
     * 
     */
    @Import(name="enableHierarchicalResourceQuota")
      private final @Nullable Output<Boolean> enableHierarchicalResourceQuota;

    public Output<Boolean> getEnableHierarchicalResourceQuota() {
        return this.enableHierarchicalResourceQuota == null ? Output.empty() : this.enableHierarchicalResourceQuota;
    }

    /**
     * Whether pod tree labels are enabled in this cluster.
     * 
     */
    @Import(name="enablePodTreeLabels")
      private final @Nullable Output<Boolean> enablePodTreeLabels;

    public Output<Boolean> getEnablePodTreeLabels() {
        return this.enablePodTreeLabels == null ? Output.empty() : this.enablePodTreeLabels;
    }

    /**
     * Enables the installation of Policy Controller. If false, the rest of PolicyController fields take no effect.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Output.empty() : this.enabled;
    }

    public FeatureMembershipConfigmanagementHierarchyControllerGetArgs(
        @Nullable Output<Boolean> enableHierarchicalResourceQuota,
        @Nullable Output<Boolean> enablePodTreeLabels,
        @Nullable Output<Boolean> enabled) {
        this.enableHierarchicalResourceQuota = enableHierarchicalResourceQuota;
        this.enablePodTreeLabels = enablePodTreeLabels;
        this.enabled = enabled;
    }

    private FeatureMembershipConfigmanagementHierarchyControllerGetArgs() {
        this.enableHierarchicalResourceQuota = Output.empty();
        this.enablePodTreeLabels = Output.empty();
        this.enabled = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureMembershipConfigmanagementHierarchyControllerGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enableHierarchicalResourceQuota;
        private @Nullable Output<Boolean> enablePodTreeLabels;
        private @Nullable Output<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureMembershipConfigmanagementHierarchyControllerGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableHierarchicalResourceQuota = defaults.enableHierarchicalResourceQuota;
    	      this.enablePodTreeLabels = defaults.enablePodTreeLabels;
    	      this.enabled = defaults.enabled;
        }

        public Builder enableHierarchicalResourceQuota(@Nullable Output<Boolean> enableHierarchicalResourceQuota) {
            this.enableHierarchicalResourceQuota = enableHierarchicalResourceQuota;
            return this;
        }

        public Builder enableHierarchicalResourceQuota(@Nullable Boolean enableHierarchicalResourceQuota) {
            this.enableHierarchicalResourceQuota = Output.ofNullable(enableHierarchicalResourceQuota);
            return this;
        }

        public Builder enablePodTreeLabels(@Nullable Output<Boolean> enablePodTreeLabels) {
            this.enablePodTreeLabels = enablePodTreeLabels;
            return this;
        }

        public Builder enablePodTreeLabels(@Nullable Boolean enablePodTreeLabels) {
            this.enablePodTreeLabels = Output.ofNullable(enablePodTreeLabels);
            return this;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Output.ofNullable(enabled);
            return this;
        }
        public FeatureMembershipConfigmanagementHierarchyControllerGetArgs build() {
            return new FeatureMembershipConfigmanagementHierarchyControllerGetArgs(enableHierarchicalResourceQuota, enablePodTreeLabels, enabled);
        }
    }
}
