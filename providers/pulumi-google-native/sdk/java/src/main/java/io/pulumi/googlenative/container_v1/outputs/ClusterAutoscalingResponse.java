// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.container_v1.outputs.AutoprovisioningNodePoolDefaultsResponse;
import io.pulumi.googlenative.container_v1.outputs.ResourceLimitResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ClusterAutoscalingResponse {
    /**
     * The list of Google Compute Engine [zones](https://cloud.google.com/compute/docs/zones#available) in which the NodePool's nodes can be created by NAP.
     * 
     */
    private final List<String> autoprovisioningLocations;
    /**
     * AutoprovisioningNodePoolDefaults contains defaults for a node pool created by NAP.
     * 
     */
    private final AutoprovisioningNodePoolDefaultsResponse autoprovisioningNodePoolDefaults;
    /**
     * Defines autoscaling behaviour.
     * 
     */
    private final String autoscalingProfile;
    /**
     * Enables automatic node pool creation and deletion.
     * 
     */
    private final Boolean enableNodeAutoprovisioning;
    /**
     * Contains global constraints regarding minimum and maximum amount of resources in the cluster.
     * 
     */
    private final List<ResourceLimitResponse> resourceLimits;

    @CustomType.Constructor
    private ClusterAutoscalingResponse(
        @CustomType.Parameter("autoprovisioningLocations") List<String> autoprovisioningLocations,
        @CustomType.Parameter("autoprovisioningNodePoolDefaults") AutoprovisioningNodePoolDefaultsResponse autoprovisioningNodePoolDefaults,
        @CustomType.Parameter("autoscalingProfile") String autoscalingProfile,
        @CustomType.Parameter("enableNodeAutoprovisioning") Boolean enableNodeAutoprovisioning,
        @CustomType.Parameter("resourceLimits") List<ResourceLimitResponse> resourceLimits) {
        this.autoprovisioningLocations = autoprovisioningLocations;
        this.autoprovisioningNodePoolDefaults = autoprovisioningNodePoolDefaults;
        this.autoscalingProfile = autoscalingProfile;
        this.enableNodeAutoprovisioning = enableNodeAutoprovisioning;
        this.resourceLimits = resourceLimits;
    }

    /**
     * The list of Google Compute Engine [zones](https://cloud.google.com/compute/docs/zones#available) in which the NodePool's nodes can be created by NAP.
     * 
    */
    public List<String> getAutoprovisioningLocations() {
        return this.autoprovisioningLocations;
    }
    /**
     * AutoprovisioningNodePoolDefaults contains defaults for a node pool created by NAP.
     * 
    */
    public AutoprovisioningNodePoolDefaultsResponse getAutoprovisioningNodePoolDefaults() {
        return this.autoprovisioningNodePoolDefaults;
    }
    /**
     * Defines autoscaling behaviour.
     * 
    */
    public String getAutoscalingProfile() {
        return this.autoscalingProfile;
    }
    /**
     * Enables automatic node pool creation and deletion.
     * 
    */
    public Boolean getEnableNodeAutoprovisioning() {
        return this.enableNodeAutoprovisioning;
    }
    /**
     * Contains global constraints regarding minimum and maximum amount of resources in the cluster.
     * 
    */
    public List<ResourceLimitResponse> getResourceLimits() {
        return this.resourceLimits;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterAutoscalingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> autoprovisioningLocations;
        private AutoprovisioningNodePoolDefaultsResponse autoprovisioningNodePoolDefaults;
        private String autoscalingProfile;
        private Boolean enableNodeAutoprovisioning;
        private List<ResourceLimitResponse> resourceLimits;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterAutoscalingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoprovisioningLocations = defaults.autoprovisioningLocations;
    	      this.autoprovisioningNodePoolDefaults = defaults.autoprovisioningNodePoolDefaults;
    	      this.autoscalingProfile = defaults.autoscalingProfile;
    	      this.enableNodeAutoprovisioning = defaults.enableNodeAutoprovisioning;
    	      this.resourceLimits = defaults.resourceLimits;
        }

        public Builder autoprovisioningLocations(List<String> autoprovisioningLocations) {
            this.autoprovisioningLocations = Objects.requireNonNull(autoprovisioningLocations);
            return this;
        }

        public Builder autoprovisioningNodePoolDefaults(AutoprovisioningNodePoolDefaultsResponse autoprovisioningNodePoolDefaults) {
            this.autoprovisioningNodePoolDefaults = Objects.requireNonNull(autoprovisioningNodePoolDefaults);
            return this;
        }

        public Builder autoscalingProfile(String autoscalingProfile) {
            this.autoscalingProfile = Objects.requireNonNull(autoscalingProfile);
            return this;
        }

        public Builder enableNodeAutoprovisioning(Boolean enableNodeAutoprovisioning) {
            this.enableNodeAutoprovisioning = Objects.requireNonNull(enableNodeAutoprovisioning);
            return this;
        }

        public Builder resourceLimits(List<ResourceLimitResponse> resourceLimits) {
            this.resourceLimits = Objects.requireNonNull(resourceLimits);
            return this;
        }
        public ClusterAutoscalingResponse build() {
            return new ClusterAutoscalingResponse(autoprovisioningLocations, autoprovisioningNodePoolDefaults, autoscalingProfile, enableNodeAutoprovisioning, resourceLimits);
        }
    }
}
