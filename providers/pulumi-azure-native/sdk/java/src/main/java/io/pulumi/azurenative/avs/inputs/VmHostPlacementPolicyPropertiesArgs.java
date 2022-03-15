// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.inputs;

import io.pulumi.azurenative.avs.enums.AffinityType;
import io.pulumi.azurenative.avs.enums.PlacementPolicyState;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * VM-Host placement policy properties
 * 
 */
public final class VmHostPlacementPolicyPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final VmHostPlacementPolicyPropertiesArgs Empty = new VmHostPlacementPolicyPropertiesArgs();

    /**
     * placement policy affinity type
     * 
     */
    @Import(name="affinityType", required=true)
      private final Output<Either<String,AffinityType>> affinityType;

    public Output<Either<String,AffinityType>> getAffinityType() {
        return this.affinityType;
    }

    /**
     * Display name of the placement policy
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Output.empty() : this.displayName;
    }

    /**
     * Host members list
     * 
     */
    @Import(name="hostMembers", required=true)
      private final Output<List<String>> hostMembers;

    public Output<List<String>> getHostMembers() {
        return this.hostMembers;
    }

    /**
     * Whether the placement policy is enabled or disabled
     * 
     */
    @Import(name="state")
      private final @Nullable Output<Either<String,PlacementPolicyState>> state;

    public Output<Either<String,PlacementPolicyState>> getState() {
        return this.state == null ? Output.empty() : this.state;
    }

    /**
     * placement policy type
     * Expected value is 'VmHost'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    /**
     * Virtual machine members list
     * 
     */
    @Import(name="vmMembers", required=true)
      private final Output<List<String>> vmMembers;

    public Output<List<String>> getVmMembers() {
        return this.vmMembers;
    }

    public VmHostPlacementPolicyPropertiesArgs(
        Output<Either<String,AffinityType>> affinityType,
        @Nullable Output<String> displayName,
        Output<List<String>> hostMembers,
        @Nullable Output<Either<String,PlacementPolicyState>> state,
        Output<String> type,
        Output<List<String>> vmMembers) {
        this.affinityType = Objects.requireNonNull(affinityType, "expected parameter 'affinityType' to be non-null");
        this.displayName = displayName;
        this.hostMembers = Objects.requireNonNull(hostMembers, "expected parameter 'hostMembers' to be non-null");
        this.state = state;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.vmMembers = Objects.requireNonNull(vmMembers, "expected parameter 'vmMembers' to be non-null");
    }

    private VmHostPlacementPolicyPropertiesArgs() {
        this.affinityType = Output.empty();
        this.displayName = Output.empty();
        this.hostMembers = Output.empty();
        this.state = Output.empty();
        this.type = Output.empty();
        this.vmMembers = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VmHostPlacementPolicyPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Either<String,AffinityType>> affinityType;
        private @Nullable Output<String> displayName;
        private Output<List<String>> hostMembers;
        private @Nullable Output<Either<String,PlacementPolicyState>> state;
        private Output<String> type;
        private Output<List<String>> vmMembers;

        public Builder() {
    	      // Empty
        }

        public Builder(VmHostPlacementPolicyPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.affinityType = defaults.affinityType;
    	      this.displayName = defaults.displayName;
    	      this.hostMembers = defaults.hostMembers;
    	      this.state = defaults.state;
    	      this.type = defaults.type;
    	      this.vmMembers = defaults.vmMembers;
        }

        public Builder affinityType(Output<Either<String,AffinityType>> affinityType) {
            this.affinityType = Objects.requireNonNull(affinityType);
            return this;
        }

        public Builder affinityType(Either<String,AffinityType> affinityType) {
            this.affinityType = Output.of(Objects.requireNonNull(affinityType));
            return this;
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = Output.ofNullable(displayName);
            return this;
        }

        public Builder hostMembers(Output<List<String>> hostMembers) {
            this.hostMembers = Objects.requireNonNull(hostMembers);
            return this;
        }

        public Builder hostMembers(List<String> hostMembers) {
            this.hostMembers = Output.of(Objects.requireNonNull(hostMembers));
            return this;
        }

        public Builder state(@Nullable Output<Either<String,PlacementPolicyState>> state) {
            this.state = state;
            return this;
        }

        public Builder state(@Nullable Either<String,PlacementPolicyState> state) {
            this.state = Output.ofNullable(state);
            return this;
        }

        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder vmMembers(Output<List<String>> vmMembers) {
            this.vmMembers = Objects.requireNonNull(vmMembers);
            return this;
        }

        public Builder vmMembers(List<String> vmMembers) {
            this.vmMembers = Output.of(Objects.requireNonNull(vmMembers));
            return this;
        }
        public VmHostPlacementPolicyPropertiesArgs build() {
            return new VmHostPlacementPolicyPropertiesArgs(affinityType, displayName, hostMembers, state, type, vmMembers);
        }
    }
}
