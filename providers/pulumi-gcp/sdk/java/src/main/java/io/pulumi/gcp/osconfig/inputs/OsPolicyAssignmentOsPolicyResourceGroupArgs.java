// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupInventoryFilterArgs;
import io.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OsPolicyAssignmentOsPolicyResourceGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final OsPolicyAssignmentOsPolicyResourceGroupArgs Empty = new OsPolicyAssignmentOsPolicyResourceGroupArgs();

    /**
     * List of inventory filters for the resource group. The resources in this resource group are applied to the target VM if it satisfies at least one of the following inventory filters. For example, to apply this resource group to VMs running either `RHEL` or `CentOS` operating systems, specify 2 items for the list with following values: inventory_filters[0].os_short_name='rhel' and inventory_filters[1].os_short_name='centos' If the list is empty, this resource group will be applied to the target VM unconditionally.
     * 
     */
    @InputImport(name="inventoryFilters")
        private final @Nullable Input<List<OsPolicyAssignmentOsPolicyResourceGroupInventoryFilterArgs>> inventoryFilters;

    public Input<List<OsPolicyAssignmentOsPolicyResourceGroupInventoryFilterArgs>> getInventoryFilters() {
        return this.inventoryFilters == null ? Input.empty() : this.inventoryFilters;
    }

    /**
     * Required. List of resources configured for this resource group. The resources are executed in the exact order specified here.
     * 
     */
    @InputImport(name="resources", required=true)
        private final Input<List<OsPolicyAssignmentOsPolicyResourceGroupResourceArgs>> resources;

    public Input<List<OsPolicyAssignmentOsPolicyResourceGroupResourceArgs>> getResources() {
        return this.resources;
    }

    public OsPolicyAssignmentOsPolicyResourceGroupArgs(
        @Nullable Input<List<OsPolicyAssignmentOsPolicyResourceGroupInventoryFilterArgs>> inventoryFilters,
        Input<List<OsPolicyAssignmentOsPolicyResourceGroupResourceArgs>> resources) {
        this.inventoryFilters = inventoryFilters;
        this.resources = Objects.requireNonNull(resources, "expected parameter 'resources' to be non-null");
    }

    private OsPolicyAssignmentOsPolicyResourceGroupArgs() {
        this.inventoryFilters = Input.empty();
        this.resources = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<OsPolicyAssignmentOsPolicyResourceGroupInventoryFilterArgs>> inventoryFilters;
        private Input<List<OsPolicyAssignmentOsPolicyResourceGroupResourceArgs>> resources;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inventoryFilters = defaults.inventoryFilters;
    	      this.resources = defaults.resources;
        }

        public Builder setInventoryFilters(@Nullable Input<List<OsPolicyAssignmentOsPolicyResourceGroupInventoryFilterArgs>> inventoryFilters) {
            this.inventoryFilters = inventoryFilters;
            return this;
        }

        public Builder setInventoryFilters(@Nullable List<OsPolicyAssignmentOsPolicyResourceGroupInventoryFilterArgs> inventoryFilters) {
            this.inventoryFilters = Input.ofNullable(inventoryFilters);
            return this;
        }

        public Builder setResources(Input<List<OsPolicyAssignmentOsPolicyResourceGroupResourceArgs>> resources) {
            this.resources = Objects.requireNonNull(resources);
            return this;
        }

        public Builder setResources(List<OsPolicyAssignmentOsPolicyResourceGroupResourceArgs> resources) {
            this.resources = Input.of(Objects.requireNonNull(resources));
            return this;
        }
        public OsPolicyAssignmentOsPolicyResourceGroupArgs build() {
            return new OsPolicyAssignmentOsPolicyResourceGroupArgs(inventoryFilters, resources);
        }
    }
}
