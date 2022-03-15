// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * VMwareCbt NIC details.
 * 
 */
public final class VMwareCbtNicDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final VMwareCbtNicDetailsResponse Empty = new VMwareCbtNicDetailsResponse();

    /**
     * A value indicating whether this is the primary NIC.
     * 
     */
    @Import(name="isPrimaryNic")
      private final @Nullable String isPrimaryNic;

    public Optional<String> getIsPrimaryNic() {
        return this.isPrimaryNic == null ? Optional.empty() : Optional.ofNullable(this.isPrimaryNic);
    }

    /**
     * A value indicating whether this NIC is selected for migration.
     * 
     */
    @Import(name="isSelectedForMigration")
      private final @Nullable String isSelectedForMigration;

    public Optional<String> getIsSelectedForMigration() {
        return this.isSelectedForMigration == null ? Optional.empty() : Optional.ofNullable(this.isSelectedForMigration);
    }

    /**
     * The NIC Id.
     * 
     */
    @Import(name="nicId", required=true)
      private final String nicId;

    public String getNicId() {
        return this.nicId;
    }

    /**
     * The source IP address.
     * 
     */
    @Import(name="sourceIPAddress", required=true)
      private final String sourceIPAddress;

    public String getSourceIPAddress() {
        return this.sourceIPAddress;
    }

    /**
     * The source IP address type.
     * 
     */
    @Import(name="sourceIPAddressType", required=true)
      private final String sourceIPAddressType;

    public String getSourceIPAddressType() {
        return this.sourceIPAddressType;
    }

    /**
     * Source network Id.
     * 
     */
    @Import(name="sourceNetworkId", required=true)
      private final String sourceNetworkId;

    public String getSourceNetworkId() {
        return this.sourceNetworkId;
    }

    /**
     * The target IP address.
     * 
     */
    @Import(name="targetIPAddress")
      private final @Nullable String targetIPAddress;

    public Optional<String> getTargetIPAddress() {
        return this.targetIPAddress == null ? Optional.empty() : Optional.ofNullable(this.targetIPAddress);
    }

    /**
     * The target IP address type.
     * 
     */
    @Import(name="targetIPAddressType")
      private final @Nullable String targetIPAddressType;

    public Optional<String> getTargetIPAddressType() {
        return this.targetIPAddressType == null ? Optional.empty() : Optional.ofNullable(this.targetIPAddressType);
    }

    /**
     * Target subnet name.
     * 
     */
    @Import(name="targetSubnetName")
      private final @Nullable String targetSubnetName;

    public Optional<String> getTargetSubnetName() {
        return this.targetSubnetName == null ? Optional.empty() : Optional.ofNullable(this.targetSubnetName);
    }

    public VMwareCbtNicDetailsResponse(
        @Nullable String isPrimaryNic,
        @Nullable String isSelectedForMigration,
        String nicId,
        String sourceIPAddress,
        String sourceIPAddressType,
        String sourceNetworkId,
        @Nullable String targetIPAddress,
        @Nullable String targetIPAddressType,
        @Nullable String targetSubnetName) {
        this.isPrimaryNic = isPrimaryNic;
        this.isSelectedForMigration = isSelectedForMigration;
        this.nicId = Objects.requireNonNull(nicId, "expected parameter 'nicId' to be non-null");
        this.sourceIPAddress = Objects.requireNonNull(sourceIPAddress, "expected parameter 'sourceIPAddress' to be non-null");
        this.sourceIPAddressType = Objects.requireNonNull(sourceIPAddressType, "expected parameter 'sourceIPAddressType' to be non-null");
        this.sourceNetworkId = Objects.requireNonNull(sourceNetworkId, "expected parameter 'sourceNetworkId' to be non-null");
        this.targetIPAddress = targetIPAddress;
        this.targetIPAddressType = targetIPAddressType;
        this.targetSubnetName = targetSubnetName;
    }

    private VMwareCbtNicDetailsResponse() {
        this.isPrimaryNic = null;
        this.isSelectedForMigration = null;
        this.nicId = null;
        this.sourceIPAddress = null;
        this.sourceIPAddressType = null;
        this.sourceNetworkId = null;
        this.targetIPAddress = null;
        this.targetIPAddressType = null;
        this.targetSubnetName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VMwareCbtNicDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String isPrimaryNic;
        private @Nullable String isSelectedForMigration;
        private String nicId;
        private String sourceIPAddress;
        private String sourceIPAddressType;
        private String sourceNetworkId;
        private @Nullable String targetIPAddress;
        private @Nullable String targetIPAddressType;
        private @Nullable String targetSubnetName;

        public Builder() {
    	      // Empty
        }

        public Builder(VMwareCbtNicDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isPrimaryNic = defaults.isPrimaryNic;
    	      this.isSelectedForMigration = defaults.isSelectedForMigration;
    	      this.nicId = defaults.nicId;
    	      this.sourceIPAddress = defaults.sourceIPAddress;
    	      this.sourceIPAddressType = defaults.sourceIPAddressType;
    	      this.sourceNetworkId = defaults.sourceNetworkId;
    	      this.targetIPAddress = defaults.targetIPAddress;
    	      this.targetIPAddressType = defaults.targetIPAddressType;
    	      this.targetSubnetName = defaults.targetSubnetName;
        }

        public Builder isPrimaryNic(@Nullable String isPrimaryNic) {
            this.isPrimaryNic = isPrimaryNic;
            return this;
        }

        public Builder isSelectedForMigration(@Nullable String isSelectedForMigration) {
            this.isSelectedForMigration = isSelectedForMigration;
            return this;
        }

        public Builder nicId(String nicId) {
            this.nicId = Objects.requireNonNull(nicId);
            return this;
        }

        public Builder sourceIPAddress(String sourceIPAddress) {
            this.sourceIPAddress = Objects.requireNonNull(sourceIPAddress);
            return this;
        }

        public Builder sourceIPAddressType(String sourceIPAddressType) {
            this.sourceIPAddressType = Objects.requireNonNull(sourceIPAddressType);
            return this;
        }

        public Builder sourceNetworkId(String sourceNetworkId) {
            this.sourceNetworkId = Objects.requireNonNull(sourceNetworkId);
            return this;
        }

        public Builder targetIPAddress(@Nullable String targetIPAddress) {
            this.targetIPAddress = targetIPAddress;
            return this;
        }

        public Builder targetIPAddressType(@Nullable String targetIPAddressType) {
            this.targetIPAddressType = targetIPAddressType;
            return this;
        }

        public Builder targetSubnetName(@Nullable String targetSubnetName) {
            this.targetSubnetName = targetSubnetName;
            return this;
        }
        public VMwareCbtNicDetailsResponse build() {
            return new VMwareCbtNicDetailsResponse(isPrimaryNic, isSelectedForMigration, nicId, sourceIPAddress, sourceIPAddressType, sourceNetworkId, targetIPAddress, targetIPAddressType, targetSubnetName);
        }
    }
}
