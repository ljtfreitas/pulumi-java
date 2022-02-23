// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.container.inputs.ClusterClusterAutoscalingAutoProvisioningDefaultsGetArgs;
import io.pulumi.gcp.container.inputs.ClusterClusterAutoscalingResourceLimitGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterClusterAutoscalingGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterClusterAutoscalingGetArgs Empty = new ClusterClusterAutoscalingGetArgs();

    /**
     * Contains defaults for a node pool created by NAP.
     * Structure is documented below.
     * 
     */
    @InputImport(name="autoProvisioningDefaults")
        private final @Nullable Input<ClusterClusterAutoscalingAutoProvisioningDefaultsGetArgs> autoProvisioningDefaults;

    public Input<ClusterClusterAutoscalingAutoProvisioningDefaultsGetArgs> getAutoProvisioningDefaults() {
        return this.autoProvisioningDefaults == null ? Input.empty() : this.autoProvisioningDefaults;
    }

    /**
     * ) Configuration
     * options for the [Autoscaling profile](https://cloud.google.com/kubernetes-engine/docs/concepts/cluster-autoscaler#autoscaling_profiles)
     * feature, which lets you choose whether the cluster autoscaler should optimize for resource utilization or resource availability
     * when deciding to remove nodes from a cluster. Can be `BALANCED` or `OPTIMIZE_UTILIZATION`. Defaults to `BALANCED`.
     * 
     */
    @InputImport(name="autoscalingProfile")
        private final @Nullable Input<String> autoscalingProfile;

    public Input<String> getAutoscalingProfile() {
        return this.autoscalingProfile == null ? Input.empty() : this.autoscalingProfile;
    }

    /**
     * Enable the PodSecurityPolicy controller for this cluster.
     * If enabled, pods must be valid under a PodSecurityPolicy to be created.
     * 
     */
    @InputImport(name="enabled", required=true)
        private final Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled;
    }

    /**
     * Global constraints for machine resources in the
     * cluster. Configuring the `cpu` and `memory` types is required if node
     * auto-provisioning is enabled. These limits will apply to node pool autoscaling
     * in addition to node auto-provisioning. Structure is documented below.
     * 
     */
    @InputImport(name="resourceLimits")
        private final @Nullable Input<List<ClusterClusterAutoscalingResourceLimitGetArgs>> resourceLimits;

    public Input<List<ClusterClusterAutoscalingResourceLimitGetArgs>> getResourceLimits() {
        return this.resourceLimits == null ? Input.empty() : this.resourceLimits;
    }

    public ClusterClusterAutoscalingGetArgs(
        @Nullable Input<ClusterClusterAutoscalingAutoProvisioningDefaultsGetArgs> autoProvisioningDefaults,
        @Nullable Input<String> autoscalingProfile,
        Input<Boolean> enabled,
        @Nullable Input<List<ClusterClusterAutoscalingResourceLimitGetArgs>> resourceLimits) {
        this.autoProvisioningDefaults = autoProvisioningDefaults;
        this.autoscalingProfile = autoscalingProfile;
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.resourceLimits = resourceLimits;
    }

    private ClusterClusterAutoscalingGetArgs() {
        this.autoProvisioningDefaults = Input.empty();
        this.autoscalingProfile = Input.empty();
        this.enabled = Input.empty();
        this.resourceLimits = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterAutoscalingGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ClusterClusterAutoscalingAutoProvisioningDefaultsGetArgs> autoProvisioningDefaults;
        private @Nullable Input<String> autoscalingProfile;
        private Input<Boolean> enabled;
        private @Nullable Input<List<ClusterClusterAutoscalingResourceLimitGetArgs>> resourceLimits;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClusterAutoscalingGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoProvisioningDefaults = defaults.autoProvisioningDefaults;
    	      this.autoscalingProfile = defaults.autoscalingProfile;
    	      this.enabled = defaults.enabled;
    	      this.resourceLimits = defaults.resourceLimits;
        }

        public Builder setAutoProvisioningDefaults(@Nullable Input<ClusterClusterAutoscalingAutoProvisioningDefaultsGetArgs> autoProvisioningDefaults) {
            this.autoProvisioningDefaults = autoProvisioningDefaults;
            return this;
        }

        public Builder setAutoProvisioningDefaults(@Nullable ClusterClusterAutoscalingAutoProvisioningDefaultsGetArgs autoProvisioningDefaults) {
            this.autoProvisioningDefaults = Input.ofNullable(autoProvisioningDefaults);
            return this;
        }

        public Builder setAutoscalingProfile(@Nullable Input<String> autoscalingProfile) {
            this.autoscalingProfile = autoscalingProfile;
            return this;
        }

        public Builder setAutoscalingProfile(@Nullable String autoscalingProfile) {
            this.autoscalingProfile = Input.ofNullable(autoscalingProfile);
            return this;
        }

        public Builder setEnabled(Input<Boolean> enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Input.of(Objects.requireNonNull(enabled));
            return this;
        }

        public Builder setResourceLimits(@Nullable Input<List<ClusterClusterAutoscalingResourceLimitGetArgs>> resourceLimits) {
            this.resourceLimits = resourceLimits;
            return this;
        }

        public Builder setResourceLimits(@Nullable List<ClusterClusterAutoscalingResourceLimitGetArgs> resourceLimits) {
            this.resourceLimits = Input.ofNullable(resourceLimits);
            return this;
        }
        public ClusterClusterAutoscalingGetArgs build() {
            return new ClusterClusterAutoscalingGetArgs(autoProvisioningDefaults, autoscalingProfile, enabled, resourceLimits);
        }
    }
}
