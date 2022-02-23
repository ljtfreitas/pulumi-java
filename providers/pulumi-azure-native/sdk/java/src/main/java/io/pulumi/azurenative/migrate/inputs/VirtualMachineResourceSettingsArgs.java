// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.azurenative.migrate.enums.TargetAvailabilityZone;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Gets or sets the virtual machine resource settings.
 * 
 */
public final class VirtualMachineResourceSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualMachineResourceSettingsArgs Empty = new VirtualMachineResourceSettingsArgs();

    /**
     * The resource type. For example, the value can be Microsoft.Compute/virtualMachines.
     * Expected value is 'Microsoft.Compute/virtualMachines'.
     * 
     */
    @InputImport(name="resourceType", required=true)
        private final Input<String> resourceType;

    public Input<String> getPropResourceType() {
        return this.resourceType;
    }

    /**
     * Gets or sets the target availability set id for virtual machines not in an availability set at source.
     * 
     */
    @InputImport(name="targetAvailabilitySetId")
        private final @Nullable Input<String> targetAvailabilitySetId;

    public Input<String> getTargetAvailabilitySetId() {
        return this.targetAvailabilitySetId == null ? Input.empty() : this.targetAvailabilitySetId;
    }

    /**
     * Gets or sets the target availability zone.
     * 
     */
    @InputImport(name="targetAvailabilityZone")
        private final @Nullable Input<Either<String,TargetAvailabilityZone>> targetAvailabilityZone;

    public Input<Either<String,TargetAvailabilityZone>> getTargetAvailabilityZone() {
        return this.targetAvailabilityZone == null ? Input.empty() : this.targetAvailabilityZone;
    }

    /**
     * Gets or sets the target Resource name.
     * 
     */
    @InputImport(name="targetResourceName", required=true)
        private final Input<String> targetResourceName;

    public Input<String> getTargetResourceName() {
        return this.targetResourceName;
    }

    /**
     * Gets or sets the target virtual machine size.
     * 
     */
    @InputImport(name="targetVmSize")
        private final @Nullable Input<String> targetVmSize;

    public Input<String> getTargetVmSize() {
        return this.targetVmSize == null ? Input.empty() : this.targetVmSize;
    }

    public VirtualMachineResourceSettingsArgs(
        Input<String> resourceType,
        @Nullable Input<String> targetAvailabilitySetId,
        @Nullable Input<Either<String,TargetAvailabilityZone>> targetAvailabilityZone,
        Input<String> targetResourceName,
        @Nullable Input<String> targetVmSize) {
        this.resourceType = Objects.requireNonNull(resourceType, "expected parameter 'resourceType' to be non-null");
        this.targetAvailabilitySetId = targetAvailabilitySetId;
        this.targetAvailabilityZone = targetAvailabilityZone;
        this.targetResourceName = Objects.requireNonNull(targetResourceName, "expected parameter 'targetResourceName' to be non-null");
        this.targetVmSize = targetVmSize;
    }

    private VirtualMachineResourceSettingsArgs() {
        this.resourceType = Input.empty();
        this.targetAvailabilitySetId = Input.empty();
        this.targetAvailabilityZone = Input.empty();
        this.targetResourceName = Input.empty();
        this.targetVmSize = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineResourceSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> resourceType;
        private @Nullable Input<String> targetAvailabilitySetId;
        private @Nullable Input<Either<String,TargetAvailabilityZone>> targetAvailabilityZone;
        private Input<String> targetResourceName;
        private @Nullable Input<String> targetVmSize;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineResourceSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceType = defaults.resourceType;
    	      this.targetAvailabilitySetId = defaults.targetAvailabilitySetId;
    	      this.targetAvailabilityZone = defaults.targetAvailabilityZone;
    	      this.targetResourceName = defaults.targetResourceName;
    	      this.targetVmSize = defaults.targetVmSize;
        }

        public Builder setResourceType(Input<String> resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }

        public Builder setResourceType(String resourceType) {
            this.resourceType = Input.of(Objects.requireNonNull(resourceType));
            return this;
        }

        public Builder setTargetAvailabilitySetId(@Nullable Input<String> targetAvailabilitySetId) {
            this.targetAvailabilitySetId = targetAvailabilitySetId;
            return this;
        }

        public Builder setTargetAvailabilitySetId(@Nullable String targetAvailabilitySetId) {
            this.targetAvailabilitySetId = Input.ofNullable(targetAvailabilitySetId);
            return this;
        }

        public Builder setTargetAvailabilityZone(@Nullable Input<Either<String,TargetAvailabilityZone>> targetAvailabilityZone) {
            this.targetAvailabilityZone = targetAvailabilityZone;
            return this;
        }

        public Builder setTargetAvailabilityZone(@Nullable Either<String,TargetAvailabilityZone> targetAvailabilityZone) {
            this.targetAvailabilityZone = Input.ofNullable(targetAvailabilityZone);
            return this;
        }

        public Builder setTargetResourceName(Input<String> targetResourceName) {
            this.targetResourceName = Objects.requireNonNull(targetResourceName);
            return this;
        }

        public Builder setTargetResourceName(String targetResourceName) {
            this.targetResourceName = Input.of(Objects.requireNonNull(targetResourceName));
            return this;
        }

        public Builder setTargetVmSize(@Nullable Input<String> targetVmSize) {
            this.targetVmSize = targetVmSize;
            return this;
        }

        public Builder setTargetVmSize(@Nullable String targetVmSize) {
            this.targetVmSize = Input.ofNullable(targetVmSize);
            return this;
        }
        public VirtualMachineResourceSettingsArgs build() {
            return new VirtualMachineResourceSettingsArgs(resourceType, targetAvailabilitySetId, targetAvailabilityZone, targetResourceName, targetVmSize);
        }
    }
}
