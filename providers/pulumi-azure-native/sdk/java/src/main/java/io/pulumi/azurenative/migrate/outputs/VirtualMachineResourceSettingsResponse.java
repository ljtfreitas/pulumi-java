// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualMachineResourceSettingsResponse {
    /**
     * The resource type. For example, the value can be Microsoft.Compute/virtualMachines.
     * Expected value is 'Microsoft.Compute/virtualMachines'.
     * 
     */
    private final String resourceType;
    /**
     * Gets or sets the target availability set id for virtual machines not in an availability set at source.
     * 
     */
    private final @Nullable String targetAvailabilitySetId;
    /**
     * Gets or sets the target availability zone.
     * 
     */
    private final @Nullable String targetAvailabilityZone;
    /**
     * Gets or sets the target Resource name.
     * 
     */
    private final String targetResourceName;
    /**
     * Gets or sets the target virtual machine size.
     * 
     */
    private final @Nullable String targetVmSize;

    @CustomType.Constructor
    private VirtualMachineResourceSettingsResponse(
        @CustomType.Parameter("resourceType") String resourceType,
        @CustomType.Parameter("targetAvailabilitySetId") @Nullable String targetAvailabilitySetId,
        @CustomType.Parameter("targetAvailabilityZone") @Nullable String targetAvailabilityZone,
        @CustomType.Parameter("targetResourceName") String targetResourceName,
        @CustomType.Parameter("targetVmSize") @Nullable String targetVmSize) {
        this.resourceType = resourceType;
        this.targetAvailabilitySetId = targetAvailabilitySetId;
        this.targetAvailabilityZone = targetAvailabilityZone;
        this.targetResourceName = targetResourceName;
        this.targetVmSize = targetVmSize;
    }

    /**
     * The resource type. For example, the value can be Microsoft.Compute/virtualMachines.
     * Expected value is 'Microsoft.Compute/virtualMachines'.
     * 
    */
    public String getPropResourceType() {
        return this.resourceType;
    }
    /**
     * Gets or sets the target availability set id for virtual machines not in an availability set at source.
     * 
    */
    public Optional<String> getTargetAvailabilitySetId() {
        return Optional.ofNullable(this.targetAvailabilitySetId);
    }
    /**
     * Gets or sets the target availability zone.
     * 
    */
    public Optional<String> getTargetAvailabilityZone() {
        return Optional.ofNullable(this.targetAvailabilityZone);
    }
    /**
     * Gets or sets the target Resource name.
     * 
    */
    public String getTargetResourceName() {
        return this.targetResourceName;
    }
    /**
     * Gets or sets the target virtual machine size.
     * 
    */
    public Optional<String> getTargetVmSize() {
        return Optional.ofNullable(this.targetVmSize);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineResourceSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceType;
        private @Nullable String targetAvailabilitySetId;
        private @Nullable String targetAvailabilityZone;
        private String targetResourceName;
        private @Nullable String targetVmSize;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineResourceSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceType = defaults.resourceType;
    	      this.targetAvailabilitySetId = defaults.targetAvailabilitySetId;
    	      this.targetAvailabilityZone = defaults.targetAvailabilityZone;
    	      this.targetResourceName = defaults.targetResourceName;
    	      this.targetVmSize = defaults.targetVmSize;
        }

        public Builder resourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }

        public Builder targetAvailabilitySetId(@Nullable String targetAvailabilitySetId) {
            this.targetAvailabilitySetId = targetAvailabilitySetId;
            return this;
        }

        public Builder targetAvailabilityZone(@Nullable String targetAvailabilityZone) {
            this.targetAvailabilityZone = targetAvailabilityZone;
            return this;
        }

        public Builder targetResourceName(String targetResourceName) {
            this.targetResourceName = Objects.requireNonNull(targetResourceName);
            return this;
        }

        public Builder targetVmSize(@Nullable String targetVmSize) {
            this.targetVmSize = targetVmSize;
            return this;
        }
        public VirtualMachineResourceSettingsResponse build() {
            return new VirtualMachineResourceSettingsResponse(resourceType, targetAvailabilitySetId, targetAvailabilityZone, targetResourceName, targetVmSize);
        }
    }
}
