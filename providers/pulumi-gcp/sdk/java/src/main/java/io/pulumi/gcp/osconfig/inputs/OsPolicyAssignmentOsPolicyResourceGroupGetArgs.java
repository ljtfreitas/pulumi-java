// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupInventoryFilterGetArgs;
import io.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceGetArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OsPolicyAssignmentOsPolicyResourceGroupGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final OsPolicyAssignmentOsPolicyResourceGroupGetArgs Empty = new OsPolicyAssignmentOsPolicyResourceGroupGetArgs();

    /**
     * List of inventory filters for the resource group. The resources in this resource group are applied to the target VM if it satisfies at least one of the following inventory filters. For example, to apply this resource group to VMs running either `RHEL` or `CentOS` operating systems, specify 2 items for the list with following values: inventory_filters[0].os_short_name='rhel' and inventory_filters[1].os_short_name='centos' If the list is empty, this resource group will be applied to the target VM unconditionally.
     * 
     */
    @InputImport(name="inventoryFilters")
        private final @Nullable Input<List<OsPolicyAssignmentOsPolicyResourceGroupInventoryFilterGetArgs>> inventoryFilters;

    public Input<List<OsPolicyAssignmentOsPolicyResourceGroupInventoryFilterGetArgs>> getInventoryFilters() {
        return this.inventoryFilters == null ? Input.empty() : this.inventoryFilters;
    }

    /**
     * Required. List of resources configured for this resource group. The resources are executed in the exact order specified here.
     * 
     */
    @InputImport(name="resources", required=true)
        private final Input<List<OsPolicyAssignmentOsPolicyResourceGroupResourceGetArgs>> resources;

    public Input<List<OsPolicyAssignmentOsPolicyResourceGroupResourceGetArgs>> getResources() {
        return this.resources;
    }

    public OsPolicyAssignmentOsPolicyResourceGroupGetArgs(
        @Nullable Input<List<OsPolicyAssignmentOsPolicyResourceGroupInventoryFilterGetArgs>> inventoryFilters,
        Input<List<OsPolicyAssignmentOsPolicyResourceGroupResourceGetArgs>> resources) {
        this.inventoryFilters = inventoryFilters;
        this.resources = Objects.requireNonNull(resources, "expected parameter 'resources' to be non-null");
    }

    private OsPolicyAssignmentOsPolicyResourceGroupGetArgs() {
        this.inventoryFilters = Input.empty();
        this.resources = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<OsPolicyAssignmentOsPolicyResourceGroupInventoryFilterGetArgs>> inventoryFilters;
        private Input<List<OsPolicyAssignmentOsPolicyResourceGroupResourceGetArgs>> resources;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inventoryFilters = defaults.inventoryFilters;
    	      this.resources = defaults.resources;
        }

        public Builder setInventoryFilters(@Nullable Input<List<OsPolicyAssignmentOsPolicyResourceGroupInventoryFilterGetArgs>> inventoryFilters) {
            this.inventoryFilters = inventoryFilters;
            return this;
        }

        public Builder setInventoryFilters(@Nullable List<OsPolicyAssignmentOsPolicyResourceGroupInventoryFilterGetArgs> inventoryFilters) {
            this.inventoryFilters = Input.ofNullable(inventoryFilters);
            return this;
        }

        public Builder setResources(Input<List<OsPolicyAssignmentOsPolicyResourceGroupResourceGetArgs>> resources) {
            this.resources = Objects.requireNonNull(resources);
            return this;
        }

        public Builder setResources(List<OsPolicyAssignmentOsPolicyResourceGroupResourceGetArgs> resources) {
            this.resources = Input.of(Objects.requireNonNull(resources));
            return this;
        }
        public OsPolicyAssignmentOsPolicyResourceGroupGetArgs build() {
            return new OsPolicyAssignmentOsPolicyResourceGroupGetArgs(inventoryFilters, resources);
        }
    }
}
