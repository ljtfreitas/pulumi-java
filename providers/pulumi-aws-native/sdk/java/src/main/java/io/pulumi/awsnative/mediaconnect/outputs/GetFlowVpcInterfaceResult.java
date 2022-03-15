// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediaconnect.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetFlowVpcInterfaceResult {
    /**
     * IDs of the network interfaces created in customer's account by MediaConnect.
     * 
     */
    private final @Nullable List<String> networkInterfaceIds;
    /**
     * Role Arn MediaConnect can assumes to create ENIs in customer's account.
     * 
     */
    private final @Nullable String roleArn;
    /**
     * Security Group IDs to be used on ENI.
     * 
     */
    private final @Nullable List<String> securityGroupIds;
    /**
     * Subnet must be in the AZ of the Flow
     * 
     */
    private final @Nullable String subnetId;

    @CustomType.Constructor
    private GetFlowVpcInterfaceResult(
        @CustomType.Parameter("networkInterfaceIds") @Nullable List<String> networkInterfaceIds,
        @CustomType.Parameter("roleArn") @Nullable String roleArn,
        @CustomType.Parameter("securityGroupIds") @Nullable List<String> securityGroupIds,
        @CustomType.Parameter("subnetId") @Nullable String subnetId) {
        this.networkInterfaceIds = networkInterfaceIds;
        this.roleArn = roleArn;
        this.securityGroupIds = securityGroupIds;
        this.subnetId = subnetId;
    }

    /**
     * IDs of the network interfaces created in customer's account by MediaConnect.
     * 
    */
    public List<String> getNetworkInterfaceIds() {
        return this.networkInterfaceIds == null ? List.of() : this.networkInterfaceIds;
    }
    /**
     * Role Arn MediaConnect can assumes to create ENIs in customer's account.
     * 
    */
    public Optional<String> getRoleArn() {
        return Optional.ofNullable(this.roleArn);
    }
    /**
     * Security Group IDs to be used on ENI.
     * 
    */
    public List<String> getSecurityGroupIds() {
        return this.securityGroupIds == null ? List.of() : this.securityGroupIds;
    }
    /**
     * Subnet must be in the AZ of the Flow
     * 
    */
    public Optional<String> getSubnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFlowVpcInterfaceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> networkInterfaceIds;
        private @Nullable String roleArn;
        private @Nullable List<String> securityGroupIds;
        private @Nullable String subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFlowVpcInterfaceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkInterfaceIds = defaults.networkInterfaceIds;
    	      this.roleArn = defaults.roleArn;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.subnetId = defaults.subnetId;
        }

        public Builder networkInterfaceIds(@Nullable List<String> networkInterfaceIds) {
            this.networkInterfaceIds = networkInterfaceIds;
            return this;
        }

        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        public Builder securityGroupIds(@Nullable List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        public Builder subnetId(@Nullable String subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        public GetFlowVpcInterfaceResult build() {
            return new GetFlowVpcInterfaceResult(networkInterfaceIds, roleArn, securityGroupIds, subnetId);
        }
    }
}
