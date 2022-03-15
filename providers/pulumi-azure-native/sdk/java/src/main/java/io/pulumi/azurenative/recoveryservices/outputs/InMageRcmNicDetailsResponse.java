// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class InMageRcmNicDetailsResponse {
    /**
     * A value indicating whether this is the primary NIC.
     * 
     */
    private final String isPrimaryNic;
    /**
     * A value indicating whether this NIC is selected for failover.
     * 
     */
    private final String isSelectedForFailover;
    /**
     * The NIC Id.
     * 
     */
    private final String nicId;
    /**
     * The source IP address.
     * 
     */
    private final String sourceIPAddress;
    /**
     * The source IP address type.
     * 
     */
    private final String sourceIPAddressType;
    /**
     * Source network Id.
     * 
     */
    private final String sourceNetworkId;
    /**
     * Source subnet name.
     * 
     */
    private final String sourceSubnetName;
    /**
     * The target IP address.
     * 
     */
    private final String targetIPAddress;
    /**
     * The target IP address type.
     * 
     */
    private final String targetIPAddressType;
    /**
     * Target subnet name.
     * 
     */
    private final String targetSubnetName;
    /**
     * The test IP address.
     * 
     */
    private final String testIPAddress;
    /**
     * The test IP address type.
     * 
     */
    private final String testIPAddressType;
    /**
     * Test subnet name.
     * 
     */
    private final String testSubnetName;

    @CustomType.Constructor
    private InMageRcmNicDetailsResponse(
        @CustomType.Parameter("isPrimaryNic") String isPrimaryNic,
        @CustomType.Parameter("isSelectedForFailover") String isSelectedForFailover,
        @CustomType.Parameter("nicId") String nicId,
        @CustomType.Parameter("sourceIPAddress") String sourceIPAddress,
        @CustomType.Parameter("sourceIPAddressType") String sourceIPAddressType,
        @CustomType.Parameter("sourceNetworkId") String sourceNetworkId,
        @CustomType.Parameter("sourceSubnetName") String sourceSubnetName,
        @CustomType.Parameter("targetIPAddress") String targetIPAddress,
        @CustomType.Parameter("targetIPAddressType") String targetIPAddressType,
        @CustomType.Parameter("targetSubnetName") String targetSubnetName,
        @CustomType.Parameter("testIPAddress") String testIPAddress,
        @CustomType.Parameter("testIPAddressType") String testIPAddressType,
        @CustomType.Parameter("testSubnetName") String testSubnetName) {
        this.isPrimaryNic = isPrimaryNic;
        this.isSelectedForFailover = isSelectedForFailover;
        this.nicId = nicId;
        this.sourceIPAddress = sourceIPAddress;
        this.sourceIPAddressType = sourceIPAddressType;
        this.sourceNetworkId = sourceNetworkId;
        this.sourceSubnetName = sourceSubnetName;
        this.targetIPAddress = targetIPAddress;
        this.targetIPAddressType = targetIPAddressType;
        this.targetSubnetName = targetSubnetName;
        this.testIPAddress = testIPAddress;
        this.testIPAddressType = testIPAddressType;
        this.testSubnetName = testSubnetName;
    }

    /**
     * A value indicating whether this is the primary NIC.
     * 
    */
    public String getIsPrimaryNic() {
        return this.isPrimaryNic;
    }
    /**
     * A value indicating whether this NIC is selected for failover.
     * 
    */
    public String getIsSelectedForFailover() {
        return this.isSelectedForFailover;
    }
    /**
     * The NIC Id.
     * 
    */
    public String getNicId() {
        return this.nicId;
    }
    /**
     * The source IP address.
     * 
    */
    public String getSourceIPAddress() {
        return this.sourceIPAddress;
    }
    /**
     * The source IP address type.
     * 
    */
    public String getSourceIPAddressType() {
        return this.sourceIPAddressType;
    }
    /**
     * Source network Id.
     * 
    */
    public String getSourceNetworkId() {
        return this.sourceNetworkId;
    }
    /**
     * Source subnet name.
     * 
    */
    public String getSourceSubnetName() {
        return this.sourceSubnetName;
    }
    /**
     * The target IP address.
     * 
    */
    public String getTargetIPAddress() {
        return this.targetIPAddress;
    }
    /**
     * The target IP address type.
     * 
    */
    public String getTargetIPAddressType() {
        return this.targetIPAddressType;
    }
    /**
     * Target subnet name.
     * 
    */
    public String getTargetSubnetName() {
        return this.targetSubnetName;
    }
    /**
     * The test IP address.
     * 
    */
    public String getTestIPAddress() {
        return this.testIPAddress;
    }
    /**
     * The test IP address type.
     * 
    */
    public String getTestIPAddressType() {
        return this.testIPAddressType;
    }
    /**
     * Test subnet name.
     * 
    */
    public String getTestSubnetName() {
        return this.testSubnetName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InMageRcmNicDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String isPrimaryNic;
        private String isSelectedForFailover;
        private String nicId;
        private String sourceIPAddress;
        private String sourceIPAddressType;
        private String sourceNetworkId;
        private String sourceSubnetName;
        private String targetIPAddress;
        private String targetIPAddressType;
        private String targetSubnetName;
        private String testIPAddress;
        private String testIPAddressType;
        private String testSubnetName;

        public Builder() {
    	      // Empty
        }

        public Builder(InMageRcmNicDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isPrimaryNic = defaults.isPrimaryNic;
    	      this.isSelectedForFailover = defaults.isSelectedForFailover;
    	      this.nicId = defaults.nicId;
    	      this.sourceIPAddress = defaults.sourceIPAddress;
    	      this.sourceIPAddressType = defaults.sourceIPAddressType;
    	      this.sourceNetworkId = defaults.sourceNetworkId;
    	      this.sourceSubnetName = defaults.sourceSubnetName;
    	      this.targetIPAddress = defaults.targetIPAddress;
    	      this.targetIPAddressType = defaults.targetIPAddressType;
    	      this.targetSubnetName = defaults.targetSubnetName;
    	      this.testIPAddress = defaults.testIPAddress;
    	      this.testIPAddressType = defaults.testIPAddressType;
    	      this.testSubnetName = defaults.testSubnetName;
        }

        public Builder isPrimaryNic(String isPrimaryNic) {
            this.isPrimaryNic = Objects.requireNonNull(isPrimaryNic);
            return this;
        }

        public Builder isSelectedForFailover(String isSelectedForFailover) {
            this.isSelectedForFailover = Objects.requireNonNull(isSelectedForFailover);
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

        public Builder sourceSubnetName(String sourceSubnetName) {
            this.sourceSubnetName = Objects.requireNonNull(sourceSubnetName);
            return this;
        }

        public Builder targetIPAddress(String targetIPAddress) {
            this.targetIPAddress = Objects.requireNonNull(targetIPAddress);
            return this;
        }

        public Builder targetIPAddressType(String targetIPAddressType) {
            this.targetIPAddressType = Objects.requireNonNull(targetIPAddressType);
            return this;
        }

        public Builder targetSubnetName(String targetSubnetName) {
            this.targetSubnetName = Objects.requireNonNull(targetSubnetName);
            return this;
        }

        public Builder testIPAddress(String testIPAddress) {
            this.testIPAddress = Objects.requireNonNull(testIPAddress);
            return this;
        }

        public Builder testIPAddressType(String testIPAddressType) {
            this.testIPAddressType = Objects.requireNonNull(testIPAddressType);
            return this;
        }

        public Builder testSubnetName(String testSubnetName) {
            this.testSubnetName = Objects.requireNonNull(testSubnetName);
            return this;
        }
        public InMageRcmNicDetailsResponse build() {
            return new InMageRcmNicDetailsResponse(isPrimaryNic, isSelectedForFailover, nicId, sourceIPAddress, sourceIPAddressType, sourceNetworkId, sourceSubnetName, targetIPAddress, targetIPAddressType, targetSubnetName, testIPAddress, testIPAddressType, testSubnetName);
        }
    }
}
