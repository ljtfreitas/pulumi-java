// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.osconfig_v1alpha.outputs.OSPolicyAssignmentInstanceFilterInventoryResponse;
import io.pulumi.googlenative.osconfig_v1alpha.outputs.OSPolicyAssignmentLabelSetResponse;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class OSPolicyAssignmentInstanceFilterResponse {
    /**
     * Target all VMs in the project. If true, no other criteria is permitted.
     * 
     */
    private final Boolean all;
    /**
     * List of label sets used for VM exclusion. If the list has more than one label set, the VM is excluded if any of the label sets are applicable for the VM.
     * 
     */
    private final List<OSPolicyAssignmentLabelSetResponse> exclusionLabels;
    /**
     * List of label sets used for VM inclusion. If the list has more than one `LabelSet`, the VM is included if any of the label sets are applicable for the VM.
     * 
     */
    private final List<OSPolicyAssignmentLabelSetResponse> inclusionLabels;
    /**
     * List of inventories to select VMs. A VM is selected if its inventory data matches at least one of the following inventories.
     * 
     */
    private final List<OSPolicyAssignmentInstanceFilterInventoryResponse> inventories;

    @OutputCustomType.Constructor({"all","exclusionLabels","inclusionLabels","inventories"})
    private OSPolicyAssignmentInstanceFilterResponse(
        Boolean all,
        List<OSPolicyAssignmentLabelSetResponse> exclusionLabels,
        List<OSPolicyAssignmentLabelSetResponse> inclusionLabels,
        List<OSPolicyAssignmentInstanceFilterInventoryResponse> inventories) {
        this.all = Objects.requireNonNull(all);
        this.exclusionLabels = Objects.requireNonNull(exclusionLabels);
        this.inclusionLabels = Objects.requireNonNull(inclusionLabels);
        this.inventories = Objects.requireNonNull(inventories);
    }

    /**
     * Target all VMs in the project. If true, no other criteria is permitted.
     * 
     */
    public Boolean getAll() {
        return this.all;
    }
    /**
     * List of label sets used for VM exclusion. If the list has more than one label set, the VM is excluded if any of the label sets are applicable for the VM.
     * 
     */
    public List<OSPolicyAssignmentLabelSetResponse> getExclusionLabels() {
        return this.exclusionLabels;
    }
    /**
     * List of label sets used for VM inclusion. If the list has more than one `LabelSet`, the VM is included if any of the label sets are applicable for the VM.
     * 
     */
    public List<OSPolicyAssignmentLabelSetResponse> getInclusionLabels() {
        return this.inclusionLabels;
    }
    /**
     * List of inventories to select VMs. A VM is selected if its inventory data matches at least one of the following inventories.
     * 
     */
    public List<OSPolicyAssignmentInstanceFilterInventoryResponse> getInventories() {
        return this.inventories;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyAssignmentInstanceFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean all;
        private List<OSPolicyAssignmentLabelSetResponse> exclusionLabels;
        private List<OSPolicyAssignmentLabelSetResponse> inclusionLabels;
        private List<OSPolicyAssignmentInstanceFilterInventoryResponse> inventories;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyAssignmentInstanceFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.all = defaults.all;
    	      this.exclusionLabels = defaults.exclusionLabels;
    	      this.inclusionLabels = defaults.inclusionLabels;
    	      this.inventories = defaults.inventories;
        }

        public Builder setAll(Boolean all) {
            this.all = Objects.requireNonNull(all);
            return this;
        }

        public Builder setExclusionLabels(List<OSPolicyAssignmentLabelSetResponse> exclusionLabels) {
            this.exclusionLabels = Objects.requireNonNull(exclusionLabels);
            return this;
        }

        public Builder setInclusionLabels(List<OSPolicyAssignmentLabelSetResponse> inclusionLabels) {
            this.inclusionLabels = Objects.requireNonNull(inclusionLabels);
            return this;
        }

        public Builder setInventories(List<OSPolicyAssignmentInstanceFilterInventoryResponse> inventories) {
            this.inventories = Objects.requireNonNull(inventories);
            return this;
        }
        public OSPolicyAssignmentInstanceFilterResponse build() {
            return new OSPolicyAssignmentInstanceFilterResponse(all, exclusionLabels, inclusionLabels, inventories);
        }
    }
}
