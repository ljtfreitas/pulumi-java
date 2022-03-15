// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentInstanceFilterExclusionLabelGetArgs;
import io.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentInstanceFilterInclusionLabelGetArgs;
import io.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentInstanceFilterInventoryGetArgs;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OsPolicyAssignmentInstanceFilterGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final OsPolicyAssignmentInstanceFilterGetArgs Empty = new OsPolicyAssignmentInstanceFilterGetArgs();

    /**
     * Target all VMs in the project. If true, no other criteria is permitted.
     * 
     */
    @Import(name="all")
      private final @Nullable Output<Boolean> all;

    public Output<Boolean> getAll() {
        return this.all == null ? Output.empty() : this.all;
    }

    /**
     * List of label sets used for VM exclusion. If the list has more than one label set, the VM is excluded if any of the label sets are applicable for the VM.
     * 
     */
    @Import(name="exclusionLabels")
      private final @Nullable Output<List<OsPolicyAssignmentInstanceFilterExclusionLabelGetArgs>> exclusionLabels;

    public Output<List<OsPolicyAssignmentInstanceFilterExclusionLabelGetArgs>> getExclusionLabels() {
        return this.exclusionLabels == null ? Output.empty() : this.exclusionLabels;
    }

    /**
     * List of label sets used for VM inclusion. If the list has more than one `LabelSet`, the VM is included if any of the label sets are applicable for the VM.
     * 
     */
    @Import(name="inclusionLabels")
      private final @Nullable Output<List<OsPolicyAssignmentInstanceFilterInclusionLabelGetArgs>> inclusionLabels;

    public Output<List<OsPolicyAssignmentInstanceFilterInclusionLabelGetArgs>> getInclusionLabels() {
        return this.inclusionLabels == null ? Output.empty() : this.inclusionLabels;
    }

    /**
     * List of inventories to select VMs. A VM is selected if its inventory data matches at least one of the following inventories.
     * 
     */
    @Import(name="inventories")
      private final @Nullable Output<List<OsPolicyAssignmentInstanceFilterInventoryGetArgs>> inventories;

    public Output<List<OsPolicyAssignmentInstanceFilterInventoryGetArgs>> getInventories() {
        return this.inventories == null ? Output.empty() : this.inventories;
    }

    public OsPolicyAssignmentInstanceFilterGetArgs(
        @Nullable Output<Boolean> all,
        @Nullable Output<List<OsPolicyAssignmentInstanceFilterExclusionLabelGetArgs>> exclusionLabels,
        @Nullable Output<List<OsPolicyAssignmentInstanceFilterInclusionLabelGetArgs>> inclusionLabels,
        @Nullable Output<List<OsPolicyAssignmentInstanceFilterInventoryGetArgs>> inventories) {
        this.all = all;
        this.exclusionLabels = exclusionLabels;
        this.inclusionLabels = inclusionLabels;
        this.inventories = inventories;
    }

    private OsPolicyAssignmentInstanceFilterGetArgs() {
        this.all = Output.empty();
        this.exclusionLabels = Output.empty();
        this.inclusionLabels = Output.empty();
        this.inventories = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentInstanceFilterGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> all;
        private @Nullable Output<List<OsPolicyAssignmentInstanceFilterExclusionLabelGetArgs>> exclusionLabels;
        private @Nullable Output<List<OsPolicyAssignmentInstanceFilterInclusionLabelGetArgs>> inclusionLabels;
        private @Nullable Output<List<OsPolicyAssignmentInstanceFilterInventoryGetArgs>> inventories;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentInstanceFilterGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.all = defaults.all;
    	      this.exclusionLabels = defaults.exclusionLabels;
    	      this.inclusionLabels = defaults.inclusionLabels;
    	      this.inventories = defaults.inventories;
        }

        public Builder all(@Nullable Output<Boolean> all) {
            this.all = all;
            return this;
        }

        public Builder all(@Nullable Boolean all) {
            this.all = Output.ofNullable(all);
            return this;
        }

        public Builder exclusionLabels(@Nullable Output<List<OsPolicyAssignmentInstanceFilterExclusionLabelGetArgs>> exclusionLabels) {
            this.exclusionLabels = exclusionLabels;
            return this;
        }

        public Builder exclusionLabels(@Nullable List<OsPolicyAssignmentInstanceFilterExclusionLabelGetArgs> exclusionLabels) {
            this.exclusionLabels = Output.ofNullable(exclusionLabels);
            return this;
        }

        public Builder inclusionLabels(@Nullable Output<List<OsPolicyAssignmentInstanceFilterInclusionLabelGetArgs>> inclusionLabels) {
            this.inclusionLabels = inclusionLabels;
            return this;
        }

        public Builder inclusionLabels(@Nullable List<OsPolicyAssignmentInstanceFilterInclusionLabelGetArgs> inclusionLabels) {
            this.inclusionLabels = Output.ofNullable(inclusionLabels);
            return this;
        }

        public Builder inventories(@Nullable Output<List<OsPolicyAssignmentInstanceFilterInventoryGetArgs>> inventories) {
            this.inventories = inventories;
            return this;
        }

        public Builder inventories(@Nullable List<OsPolicyAssignmentInstanceFilterInventoryGetArgs> inventories) {
            this.inventories = Output.ofNullable(inventories);
            return this;
        }
        public OsPolicyAssignmentInstanceFilterGetArgs build() {
            return new OsPolicyAssignmentInstanceFilterGetArgs(all, exclusionLabels, inclusionLabels, inventories);
        }
    }
}
