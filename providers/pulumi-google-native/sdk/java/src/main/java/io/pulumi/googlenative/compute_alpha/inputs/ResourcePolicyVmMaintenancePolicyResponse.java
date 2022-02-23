// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.inputs.ResourcePolicyVmMaintenancePolicyConcurrencyControlResponse;
import io.pulumi.googlenative.compute_alpha.inputs.ResourcePolicyVmMaintenancePolicyMaintenanceWindowResponse;
import java.util.Objects;


public final class ResourcePolicyVmMaintenancePolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final ResourcePolicyVmMaintenancePolicyResponse Empty = new ResourcePolicyVmMaintenancePolicyResponse();

    @InputImport(name="concurrencyControlGroup", required=true)
      private final ResourcePolicyVmMaintenancePolicyConcurrencyControlResponse concurrencyControlGroup;

    public ResourcePolicyVmMaintenancePolicyConcurrencyControlResponse getConcurrencyControlGroup() {
        return this.concurrencyControlGroup;
    }

    /**
     * Maintenance windows that are applied to VMs covered by this policy.
     * 
     */
    @InputImport(name="maintenanceWindow", required=true)
      private final ResourcePolicyVmMaintenancePolicyMaintenanceWindowResponse maintenanceWindow;

    public ResourcePolicyVmMaintenancePolicyMaintenanceWindowResponse getMaintenanceWindow() {
        return this.maintenanceWindow;
    }

    public ResourcePolicyVmMaintenancePolicyResponse(
        ResourcePolicyVmMaintenancePolicyConcurrencyControlResponse concurrencyControlGroup,
        ResourcePolicyVmMaintenancePolicyMaintenanceWindowResponse maintenanceWindow) {
        this.concurrencyControlGroup = Objects.requireNonNull(concurrencyControlGroup, "expected parameter 'concurrencyControlGroup' to be non-null");
        this.maintenanceWindow = Objects.requireNonNull(maintenanceWindow, "expected parameter 'maintenanceWindow' to be non-null");
    }

    private ResourcePolicyVmMaintenancePolicyResponse() {
        this.concurrencyControlGroup = null;
        this.maintenanceWindow = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyVmMaintenancePolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourcePolicyVmMaintenancePolicyConcurrencyControlResponse concurrencyControlGroup;
        private ResourcePolicyVmMaintenancePolicyMaintenanceWindowResponse maintenanceWindow;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyVmMaintenancePolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.concurrencyControlGroup = defaults.concurrencyControlGroup;
    	      this.maintenanceWindow = defaults.maintenanceWindow;
        }

        public Builder setConcurrencyControlGroup(ResourcePolicyVmMaintenancePolicyConcurrencyControlResponse concurrencyControlGroup) {
            this.concurrencyControlGroup = Objects.requireNonNull(concurrencyControlGroup);
            return this;
        }

        public Builder setMaintenanceWindow(ResourcePolicyVmMaintenancePolicyMaintenanceWindowResponse maintenanceWindow) {
            this.maintenanceWindow = Objects.requireNonNull(maintenanceWindow);
            return this;
        }
        public ResourcePolicyVmMaintenancePolicyResponse build() {
            return new ResourcePolicyVmMaintenancePolicyResponse(concurrencyControlGroup, maintenanceWindow);
        }
    }
}
