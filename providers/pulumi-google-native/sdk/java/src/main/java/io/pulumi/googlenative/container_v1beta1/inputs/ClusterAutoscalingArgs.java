// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.container_v1beta1.enums.ClusterAutoscalingAutoscalingProfile;
import io.pulumi.googlenative.container_v1beta1.inputs.AutoprovisioningNodePoolDefaultsArgs;
import io.pulumi.googlenative.container_v1beta1.inputs.ResourceLimitArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ClusterAutoscaling contains global, per-cluster information required by Cluster Autoscaler to automatically adjust the size of the cluster and create/delete node pools based on the current needs.
 * 
 */
public final class ClusterAutoscalingArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterAutoscalingArgs Empty = new ClusterAutoscalingArgs();

    /**
     * The list of Google Compute Engine [zones](https://cloud.google.com/compute/docs/zones#available) in which the NodePool's nodes can be created by NAP.
     * 
     */
    @Import(name="autoprovisioningLocations")
      private final @Nullable Output<List<String>> autoprovisioningLocations;

    public Output<List<String>> getAutoprovisioningLocations() {
        return this.autoprovisioningLocations == null ? Output.empty() : this.autoprovisioningLocations;
    }

    /**
     * AutoprovisioningNodePoolDefaults contains defaults for a node pool created by NAP.
     * 
     */
    @Import(name="autoprovisioningNodePoolDefaults")
      private final @Nullable Output<AutoprovisioningNodePoolDefaultsArgs> autoprovisioningNodePoolDefaults;

    public Output<AutoprovisioningNodePoolDefaultsArgs> getAutoprovisioningNodePoolDefaults() {
        return this.autoprovisioningNodePoolDefaults == null ? Output.empty() : this.autoprovisioningNodePoolDefaults;
    }

    /**
     * Defines autoscaling behaviour.
     * 
     */
    @Import(name="autoscalingProfile")
      private final @Nullable Output<ClusterAutoscalingAutoscalingProfile> autoscalingProfile;

    public Output<ClusterAutoscalingAutoscalingProfile> getAutoscalingProfile() {
        return this.autoscalingProfile == null ? Output.empty() : this.autoscalingProfile;
    }

    /**
     * Enables automatic node pool creation and deletion.
     * 
     */
    @Import(name="enableNodeAutoprovisioning")
      private final @Nullable Output<Boolean> enableNodeAutoprovisioning;

    public Output<Boolean> getEnableNodeAutoprovisioning() {
        return this.enableNodeAutoprovisioning == null ? Output.empty() : this.enableNodeAutoprovisioning;
    }

    /**
     * Contains global constraints regarding minimum and maximum amount of resources in the cluster.
     * 
     */
    @Import(name="resourceLimits")
      private final @Nullable Output<List<ResourceLimitArgs>> resourceLimits;

    public Output<List<ResourceLimitArgs>> getResourceLimits() {
        return this.resourceLimits == null ? Output.empty() : this.resourceLimits;
    }

    public ClusterAutoscalingArgs(
        @Nullable Output<List<String>> autoprovisioningLocations,
        @Nullable Output<AutoprovisioningNodePoolDefaultsArgs> autoprovisioningNodePoolDefaults,
        @Nullable Output<ClusterAutoscalingAutoscalingProfile> autoscalingProfile,
        @Nullable Output<Boolean> enableNodeAutoprovisioning,
        @Nullable Output<List<ResourceLimitArgs>> resourceLimits) {
        this.autoprovisioningLocations = autoprovisioningLocations;
        this.autoprovisioningNodePoolDefaults = autoprovisioningNodePoolDefaults;
        this.autoscalingProfile = autoscalingProfile;
        this.enableNodeAutoprovisioning = enableNodeAutoprovisioning;
        this.resourceLimits = resourceLimits;
    }

    private ClusterAutoscalingArgs() {
        this.autoprovisioningLocations = Output.empty();
        this.autoprovisioningNodePoolDefaults = Output.empty();
        this.autoscalingProfile = Output.empty();
        this.enableNodeAutoprovisioning = Output.empty();
        this.resourceLimits = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterAutoscalingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> autoprovisioningLocations;
        private @Nullable Output<AutoprovisioningNodePoolDefaultsArgs> autoprovisioningNodePoolDefaults;
        private @Nullable Output<ClusterAutoscalingAutoscalingProfile> autoscalingProfile;
        private @Nullable Output<Boolean> enableNodeAutoprovisioning;
        private @Nullable Output<List<ResourceLimitArgs>> resourceLimits;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterAutoscalingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoprovisioningLocations = defaults.autoprovisioningLocations;
    	      this.autoprovisioningNodePoolDefaults = defaults.autoprovisioningNodePoolDefaults;
    	      this.autoscalingProfile = defaults.autoscalingProfile;
    	      this.enableNodeAutoprovisioning = defaults.enableNodeAutoprovisioning;
    	      this.resourceLimits = defaults.resourceLimits;
        }

        public Builder autoprovisioningLocations(@Nullable Output<List<String>> autoprovisioningLocations) {
            this.autoprovisioningLocations = autoprovisioningLocations;
            return this;
        }

        public Builder autoprovisioningLocations(@Nullable List<String> autoprovisioningLocations) {
            this.autoprovisioningLocations = Output.ofNullable(autoprovisioningLocations);
            return this;
        }

        public Builder autoprovisioningNodePoolDefaults(@Nullable Output<AutoprovisioningNodePoolDefaultsArgs> autoprovisioningNodePoolDefaults) {
            this.autoprovisioningNodePoolDefaults = autoprovisioningNodePoolDefaults;
            return this;
        }

        public Builder autoprovisioningNodePoolDefaults(@Nullable AutoprovisioningNodePoolDefaultsArgs autoprovisioningNodePoolDefaults) {
            this.autoprovisioningNodePoolDefaults = Output.ofNullable(autoprovisioningNodePoolDefaults);
            return this;
        }

        public Builder autoscalingProfile(@Nullable Output<ClusterAutoscalingAutoscalingProfile> autoscalingProfile) {
            this.autoscalingProfile = autoscalingProfile;
            return this;
        }

        public Builder autoscalingProfile(@Nullable ClusterAutoscalingAutoscalingProfile autoscalingProfile) {
            this.autoscalingProfile = Output.ofNullable(autoscalingProfile);
            return this;
        }

        public Builder enableNodeAutoprovisioning(@Nullable Output<Boolean> enableNodeAutoprovisioning) {
            this.enableNodeAutoprovisioning = enableNodeAutoprovisioning;
            return this;
        }

        public Builder enableNodeAutoprovisioning(@Nullable Boolean enableNodeAutoprovisioning) {
            this.enableNodeAutoprovisioning = Output.ofNullable(enableNodeAutoprovisioning);
            return this;
        }

        public Builder resourceLimits(@Nullable Output<List<ResourceLimitArgs>> resourceLimits) {
            this.resourceLimits = resourceLimits;
            return this;
        }

        public Builder resourceLimits(@Nullable List<ResourceLimitArgs> resourceLimits) {
            this.resourceLimits = Output.ofNullable(resourceLimits);
            return this;
        }
        public ClusterAutoscalingArgs build() {
            return new ClusterAutoscalingArgs(autoprovisioningLocations, autoprovisioningNodePoolDefaults, autoscalingProfile, enableNodeAutoprovisioning, resourceLimits);
        }
    }
}
