// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.container.inputs.GetClusterClusterAutoscalingAutoProvisioningDefault;
import io.pulumi.gcp.container.inputs.GetClusterClusterAutoscalingResourceLimit;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetClusterClusterAutoscaling extends io.pulumi.resources.InvokeArgs {

    public static final GetClusterClusterAutoscaling Empty = new GetClusterClusterAutoscaling();

    @Import(name="autoProvisioningDefaults", required=true)
      private final List<GetClusterClusterAutoscalingAutoProvisioningDefault> autoProvisioningDefaults;

    public List<GetClusterClusterAutoscalingAutoProvisioningDefault> getAutoProvisioningDefaults() {
        return this.autoProvisioningDefaults;
    }

    @Import(name="autoscalingProfile", required=true)
      private final String autoscalingProfile;

    public String getAutoscalingProfile() {
        return this.autoscalingProfile;
    }

    @Import(name="enabled", required=true)
      private final Boolean enabled;

    public Boolean getEnabled() {
        return this.enabled;
    }

    @Import(name="resourceLimits", required=true)
      private final List<GetClusterClusterAutoscalingResourceLimit> resourceLimits;

    public List<GetClusterClusterAutoscalingResourceLimit> getResourceLimits() {
        return this.resourceLimits;
    }

    public GetClusterClusterAutoscaling(
        List<GetClusterClusterAutoscalingAutoProvisioningDefault> autoProvisioningDefaults,
        String autoscalingProfile,
        Boolean enabled,
        List<GetClusterClusterAutoscalingResourceLimit> resourceLimits) {
        this.autoProvisioningDefaults = Objects.requireNonNull(autoProvisioningDefaults, "expected parameter 'autoProvisioningDefaults' to be non-null");
        this.autoscalingProfile = Objects.requireNonNull(autoscalingProfile, "expected parameter 'autoscalingProfile' to be non-null");
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.resourceLimits = Objects.requireNonNull(resourceLimits, "expected parameter 'resourceLimits' to be non-null");
    }

    private GetClusterClusterAutoscaling() {
        this.autoProvisioningDefaults = List.of();
        this.autoscalingProfile = null;
        this.enabled = null;
        this.resourceLimits = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterClusterAutoscaling defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetClusterClusterAutoscalingAutoProvisioningDefault> autoProvisioningDefaults;
        private String autoscalingProfile;
        private Boolean enabled;
        private List<GetClusterClusterAutoscalingResourceLimit> resourceLimits;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterClusterAutoscaling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoProvisioningDefaults = defaults.autoProvisioningDefaults;
    	      this.autoscalingProfile = defaults.autoscalingProfile;
    	      this.enabled = defaults.enabled;
    	      this.resourceLimits = defaults.resourceLimits;
        }

        public Builder autoProvisioningDefaults(List<GetClusterClusterAutoscalingAutoProvisioningDefault> autoProvisioningDefaults) {
            this.autoProvisioningDefaults = Objects.requireNonNull(autoProvisioningDefaults);
            return this;
        }

        public Builder autoscalingProfile(String autoscalingProfile) {
            this.autoscalingProfile = Objects.requireNonNull(autoscalingProfile);
            return this;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder resourceLimits(List<GetClusterClusterAutoscalingResourceLimit> resourceLimits) {
            this.resourceLimits = Objects.requireNonNull(resourceLimits);
            return this;
        }
        public GetClusterClusterAutoscaling build() {
            return new GetClusterClusterAutoscaling(autoProvisioningDefaults, autoscalingProfile, enabled, resourceLimits);
        }
    }
}
