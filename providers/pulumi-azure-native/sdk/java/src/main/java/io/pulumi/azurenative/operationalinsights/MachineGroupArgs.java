// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights;

import io.pulumi.azurenative.operationalinsights.enums.MachineGroupType;
import io.pulumi.azurenative.operationalinsights.inputs.MachineReferenceWithHintsArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MachineGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final MachineGroupArgs Empty = new MachineGroupArgs();

    /**
     * Count of machines in this group. The value of count may be bigger than the number of machines in case of the group has been truncated due to exceeding the max number of machines a group can handle.
     * 
     */
    @InputImport(name="count")
        private final @Nullable Input<Integer> count;

    public Input<Integer> getCount() {
        return this.count == null ? Input.empty() : this.count;
    }

    /**
     * User defined name for the group
     * 
     */
    @InputImport(name="displayName", required=true)
        private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * Type of the machine group
     * 
     */
    @InputImport(name="groupType")
        private final @Nullable Input<Either<String,MachineGroupType>> groupType;

    public Input<Either<String,MachineGroupType>> getGroupType() {
        return this.groupType == null ? Input.empty() : this.groupType;
    }

    /**
     * Additional resource type qualifier.
     * Expected value is 'machineGroup'.
     * 
     */
    @InputImport(name="kind", required=true)
        private final Input<String> kind;

    public Input<String> getKind() {
        return this.kind;
    }

    /**
     * Machine Group resource name.
     * 
     */
    @InputImport(name="machineGroupName")
        private final @Nullable Input<String> machineGroupName;

    public Input<String> getMachineGroupName() {
        return this.machineGroupName == null ? Input.empty() : this.machineGroupName;
    }

    /**
     * References of the machines in this group. The hints within each reference do not represent the current value of the corresponding fields. They are a snapshot created during the last time the machine group was updated.
     * 
     */
    @InputImport(name="machines")
        private final @Nullable Input<List<MachineReferenceWithHintsArgs>> machines;

    public Input<List<MachineReferenceWithHintsArgs>> getMachines() {
        return this.machines == null ? Input.empty() : this.machines;
    }

    /**
     * Resource group name within the specified subscriptionId.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * OMS workspace containing the resources of interest.
     * 
     */
    @InputImport(name="workspaceName", required=true)
        private final Input<String> workspaceName;

    public Input<String> getWorkspaceName() {
        return this.workspaceName;
    }

    public MachineGroupArgs(
        @Nullable Input<Integer> count,
        Input<String> displayName,
        @Nullable Input<Either<String,MachineGroupType>> groupType,
        Input<String> kind,
        @Nullable Input<String> machineGroupName,
        @Nullable Input<List<MachineReferenceWithHintsArgs>> machines,
        Input<String> resourceGroupName,
        Input<String> workspaceName) {
        this.count = count;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.groupType = groupType;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.machineGroupName = machineGroupName;
        this.machines = machines;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private MachineGroupArgs() {
        this.count = Input.empty();
        this.displayName = Input.empty();
        this.groupType = Input.empty();
        this.kind = Input.empty();
        this.machineGroupName = Input.empty();
        this.machines = Input.empty();
        this.resourceGroupName = Input.empty();
        this.workspaceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MachineGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> count;
        private Input<String> displayName;
        private @Nullable Input<Either<String,MachineGroupType>> groupType;
        private Input<String> kind;
        private @Nullable Input<String> machineGroupName;
        private @Nullable Input<List<MachineReferenceWithHintsArgs>> machines;
        private Input<String> resourceGroupName;
        private Input<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(MachineGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.displayName = defaults.displayName;
    	      this.groupType = defaults.groupType;
    	      this.kind = defaults.kind;
    	      this.machineGroupName = defaults.machineGroupName;
    	      this.machines = defaults.machines;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setCount(@Nullable Input<Integer> count) {
            this.count = count;
            return this;
        }

        public Builder setCount(@Nullable Integer count) {
            this.count = Input.ofNullable(count);
            return this;
        }

        public Builder setDisplayName(Input<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Input.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder setGroupType(@Nullable Input<Either<String,MachineGroupType>> groupType) {
            this.groupType = groupType;
            return this;
        }

        public Builder setGroupType(@Nullable Either<String,MachineGroupType> groupType) {
            this.groupType = Input.ofNullable(groupType);
            return this;
        }

        public Builder setKind(Input<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Input.of(Objects.requireNonNull(kind));
            return this;
        }

        public Builder setMachineGroupName(@Nullable Input<String> machineGroupName) {
            this.machineGroupName = machineGroupName;
            return this;
        }

        public Builder setMachineGroupName(@Nullable String machineGroupName) {
            this.machineGroupName = Input.ofNullable(machineGroupName);
            return this;
        }

        public Builder setMachines(@Nullable Input<List<MachineReferenceWithHintsArgs>> machines) {
            this.machines = machines;
            return this;
        }

        public Builder setMachines(@Nullable List<MachineReferenceWithHintsArgs> machines) {
            this.machines = Input.ofNullable(machines);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setWorkspaceName(Input<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }

        public Builder setWorkspaceName(String workspaceName) {
            this.workspaceName = Input.of(Objects.requireNonNull(workspaceName));
            return this;
        }
        public MachineGroupArgs build() {
            return new MachineGroupArgs(count, displayName, groupType, kind, machineGroupName, machines, resourceGroupName, workspaceName);
        }
    }
}
