// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * VM-VM placement policy properties
 * 
 */
public final class VmVmPlacementPolicyPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final VmVmPlacementPolicyPropertiesResponse Empty = new VmVmPlacementPolicyPropertiesResponse();

    /**
     * placement policy affinity type
     * 
     */
    @InputImport(name="affinityType", required=true)
        private final String affinityType;

    public String getAffinityType() {
        return this.affinityType;
    }

    /**
     * Display name of the placement policy
     * 
     */
    @InputImport(name="displayName")
        private final @Nullable String displayName;

    public Optional<String> getDisplayName() {
        return this.displayName == null ? Optional.empty() : Optional.ofNullable(this.displayName);
    }

    /**
     * The provisioning state
     * 
     */
    @InputImport(name="provisioningState", required=true)
        private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Whether the placement policy is enabled or disabled
     * 
     */
    @InputImport(name="state")
        private final @Nullable String state;

    public Optional<String> getState() {
        return this.state == null ? Optional.empty() : Optional.ofNullable(this.state);
    }

    /**
     * placement policy type
     * Expected value is 'VmVm'.
     * 
     */
    @InputImport(name="type", required=true)
        private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * Virtual machine members list
     * 
     */
    @InputImport(name="vmMembers", required=true)
        private final List<String> vmMembers;

    public List<String> getVmMembers() {
        return this.vmMembers;
    }

    public VmVmPlacementPolicyPropertiesResponse(
        String affinityType,
        @Nullable String displayName,
        String provisioningState,
        @Nullable String state,
        String type,
        List<String> vmMembers) {
        this.affinityType = Objects.requireNonNull(affinityType, "expected parameter 'affinityType' to be non-null");
        this.displayName = displayName;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.state = state;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.vmMembers = Objects.requireNonNull(vmMembers, "expected parameter 'vmMembers' to be non-null");
    }

    private VmVmPlacementPolicyPropertiesResponse() {
        this.affinityType = null;
        this.displayName = null;
        this.provisioningState = null;
        this.state = null;
        this.type = null;
        this.vmMembers = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VmVmPlacementPolicyPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String affinityType;
        private @Nullable String displayName;
        private String provisioningState;
        private @Nullable String state;
        private String type;
        private List<String> vmMembers;

        public Builder() {
    	      // Empty
        }

        public Builder(VmVmPlacementPolicyPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.affinityType = defaults.affinityType;
    	      this.displayName = defaults.displayName;
    	      this.provisioningState = defaults.provisioningState;
    	      this.state = defaults.state;
    	      this.type = defaults.type;
    	      this.vmMembers = defaults.vmMembers;
        }

        public Builder setAffinityType(String affinityType) {
            this.affinityType = Objects.requireNonNull(affinityType);
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = state;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVmMembers(List<String> vmMembers) {
            this.vmMembers = Objects.requireNonNull(vmMembers);
            return this;
        }
        public VmVmPlacementPolicyPropertiesResponse build() {
            return new VmVmPlacementPolicyPropertiesResponse(affinityType, displayName, provisioningState, state, type, vmMembers);
        }
    }
}
