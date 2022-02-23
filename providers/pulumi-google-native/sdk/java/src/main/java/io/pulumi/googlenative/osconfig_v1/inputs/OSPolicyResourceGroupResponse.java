// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.osconfig_v1.inputs.OSPolicyInventoryFilterResponse;
import io.pulumi.googlenative.osconfig_v1.inputs.OSPolicyResourceResponse;
import java.util.List;
import java.util.Objects;


/**
 * Resource groups provide a mechanism to group OS policy resources. Resource groups enable OS policy authors to create a single OS policy to be applied to VMs running different operating Systems. When the OS policy is applied to a target VM, the appropriate resource group within the OS policy is selected based on the `OSFilter` specified within the resource group.
 * 
 */
public final class OSPolicyResourceGroupResponse extends io.pulumi.resources.InvokeArgs {

    public static final OSPolicyResourceGroupResponse Empty = new OSPolicyResourceGroupResponse();

    /**
     * List of inventory filters for the resource group. The resources in this resource group are applied to the target VM if it satisfies at least one of the following inventory filters. For example, to apply this resource group to VMs running either `RHEL` or `CentOS` operating systems, specify 2 items for the list with following values: inventory_filters[0].os_short_name='rhel' and inventory_filters[1].os_short_name='centos' If the list is empty, this resource group will be applied to the target VM unconditionally.
     * 
     */
    @InputImport(name="inventoryFilters", required=true)
      private final List<OSPolicyInventoryFilterResponse> inventoryFilters;

    public List<OSPolicyInventoryFilterResponse> getInventoryFilters() {
        return this.inventoryFilters;
    }

    /**
     * List of resources configured for this resource group. The resources are executed in the exact order specified here.
     * 
     */
    @InputImport(name="resources", required=true)
      private final List<OSPolicyResourceResponse> resources;

    public List<OSPolicyResourceResponse> getResources() {
        return this.resources;
    }

    public OSPolicyResourceGroupResponse(
        List<OSPolicyInventoryFilterResponse> inventoryFilters,
        List<OSPolicyResourceResponse> resources) {
        this.inventoryFilters = Objects.requireNonNull(inventoryFilters, "expected parameter 'inventoryFilters' to be non-null");
        this.resources = Objects.requireNonNull(resources, "expected parameter 'resources' to be non-null");
    }

    private OSPolicyResourceGroupResponse() {
        this.inventoryFilters = List.of();
        this.resources = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourceGroupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<OSPolicyInventoryFilterResponse> inventoryFilters;
        private List<OSPolicyResourceResponse> resources;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourceGroupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inventoryFilters = defaults.inventoryFilters;
    	      this.resources = defaults.resources;
        }

        public Builder setInventoryFilters(List<OSPolicyInventoryFilterResponse> inventoryFilters) {
            this.inventoryFilters = Objects.requireNonNull(inventoryFilters);
            return this;
        }

        public Builder setResources(List<OSPolicyResourceResponse> resources) {
            this.resources = Objects.requireNonNull(resources);
            return this;
        }
        public OSPolicyResourceGroupResponse build() {
            return new OSPolicyResourceGroupResponse(inventoryFilters, resources);
        }
    }
}
