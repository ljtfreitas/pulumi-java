// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.directconnect;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GatewayAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final GatewayAssociationArgs Empty = new GatewayAssociationArgs();

    /**
     * VPC prefixes (CIDRs) to advertise to the Direct Connect gateway. Defaults to the CIDR block of the VPC associated with the Virtual Gateway. To enable drift detection, must be configured.
     * 
     */
    @InputImport(name="allowedPrefixes")
    private final @Nullable Input<List<String>> allowedPrefixes;

    public Input<List<String>> getAllowedPrefixes() {
        return this.allowedPrefixes == null ? Input.empty() : this.allowedPrefixes;
    }

    /**
     * The ID of the VGW or transit gateway with which to associate the Direct Connect gateway.
     * Used for single account Direct Connect gateway associations.
     * 
     */
    @InputImport(name="associatedGatewayId")
    private final @Nullable Input<String> associatedGatewayId;

    public Input<String> getAssociatedGatewayId() {
        return this.associatedGatewayId == null ? Input.empty() : this.associatedGatewayId;
    }

    /**
     * The ID of the AWS account that owns the VGW or transit gateway with which to associate the Direct Connect gateway.
     * Used for cross-account Direct Connect gateway associations.
     * 
     */
    @InputImport(name="associatedGatewayOwnerAccountId")
    private final @Nullable Input<String> associatedGatewayOwnerAccountId;

    public Input<String> getAssociatedGatewayOwnerAccountId() {
        return this.associatedGatewayOwnerAccountId == null ? Input.empty() : this.associatedGatewayOwnerAccountId;
    }

    /**
     * The ID of the Direct Connect gateway.
     * 
     */
    @InputImport(name="dxGatewayId", required=true)
    private final Input<String> dxGatewayId;

    public Input<String> getDxGatewayId() {
        return this.dxGatewayId;
    }

    /**
     * The ID of the Direct Connect gateway association proposal.
     * Used for cross-account Direct Connect gateway associations.
     * 
     */
    @InputImport(name="proposalId")
    private final @Nullable Input<String> proposalId;

    public Input<String> getProposalId() {
        return this.proposalId == null ? Input.empty() : this.proposalId;
    }

    /**
     * @deprecated
     * use 'associated_gateway_id' argument instead
     * 
     */
    @Deprecated /* use 'associated_gateway_id' argument instead */
    @InputImport(name="vpnGatewayId")
    private final @Nullable Input<String> vpnGatewayId;

    @Deprecated /* use 'associated_gateway_id' argument instead */
    public Input<String> getVpnGatewayId() {
        return this.vpnGatewayId == null ? Input.empty() : this.vpnGatewayId;
    }

    public GatewayAssociationArgs(
        @Nullable Input<List<String>> allowedPrefixes,
        @Nullable Input<String> associatedGatewayId,
        @Nullable Input<String> associatedGatewayOwnerAccountId,
        Input<String> dxGatewayId,
        @Nullable Input<String> proposalId,
        @Nullable Input<String> vpnGatewayId) {
        this.allowedPrefixes = allowedPrefixes;
        this.associatedGatewayId = associatedGatewayId;
        this.associatedGatewayOwnerAccountId = associatedGatewayOwnerAccountId;
        this.dxGatewayId = Objects.requireNonNull(dxGatewayId, "expected parameter 'dxGatewayId' to be non-null");
        this.proposalId = proposalId;
        this.vpnGatewayId = vpnGatewayId;
    }

    private GatewayAssociationArgs() {
        this.allowedPrefixes = Input.empty();
        this.associatedGatewayId = Input.empty();
        this.associatedGatewayOwnerAccountId = Input.empty();
        this.dxGatewayId = Input.empty();
        this.proposalId = Input.empty();
        this.vpnGatewayId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> allowedPrefixes;
        private @Nullable Input<String> associatedGatewayId;
        private @Nullable Input<String> associatedGatewayOwnerAccountId;
        private Input<String> dxGatewayId;
        private @Nullable Input<String> proposalId;
        private @Nullable Input<String> vpnGatewayId;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedPrefixes = defaults.allowedPrefixes;
    	      this.associatedGatewayId = defaults.associatedGatewayId;
    	      this.associatedGatewayOwnerAccountId = defaults.associatedGatewayOwnerAccountId;
    	      this.dxGatewayId = defaults.dxGatewayId;
    	      this.proposalId = defaults.proposalId;
    	      this.vpnGatewayId = defaults.vpnGatewayId;
        }

        public Builder setAllowedPrefixes(@Nullable Input<List<String>> allowedPrefixes) {
            this.allowedPrefixes = allowedPrefixes;
            return this;
        }

        public Builder setAllowedPrefixes(@Nullable List<String> allowedPrefixes) {
            this.allowedPrefixes = Input.ofNullable(allowedPrefixes);
            return this;
        }

        public Builder setAssociatedGatewayId(@Nullable Input<String> associatedGatewayId) {
            this.associatedGatewayId = associatedGatewayId;
            return this;
        }

        public Builder setAssociatedGatewayId(@Nullable String associatedGatewayId) {
            this.associatedGatewayId = Input.ofNullable(associatedGatewayId);
            return this;
        }

        public Builder setAssociatedGatewayOwnerAccountId(@Nullable Input<String> associatedGatewayOwnerAccountId) {
            this.associatedGatewayOwnerAccountId = associatedGatewayOwnerAccountId;
            return this;
        }

        public Builder setAssociatedGatewayOwnerAccountId(@Nullable String associatedGatewayOwnerAccountId) {
            this.associatedGatewayOwnerAccountId = Input.ofNullable(associatedGatewayOwnerAccountId);
            return this;
        }

        public Builder setDxGatewayId(Input<String> dxGatewayId) {
            this.dxGatewayId = Objects.requireNonNull(dxGatewayId);
            return this;
        }

        public Builder setDxGatewayId(String dxGatewayId) {
            this.dxGatewayId = Input.of(Objects.requireNonNull(dxGatewayId));
            return this;
        }

        public Builder setProposalId(@Nullable Input<String> proposalId) {
            this.proposalId = proposalId;
            return this;
        }

        public Builder setProposalId(@Nullable String proposalId) {
            this.proposalId = Input.ofNullable(proposalId);
            return this;
        }

        public Builder setVpnGatewayId(@Nullable Input<String> vpnGatewayId) {
            this.vpnGatewayId = vpnGatewayId;
            return this;
        }

        public Builder setVpnGatewayId(@Nullable String vpnGatewayId) {
            this.vpnGatewayId = Input.ofNullable(vpnGatewayId);
            return this;
        }
        public GatewayAssociationArgs build() {
            return new GatewayAssociationArgs(allowedPrefixes, associatedGatewayId, associatedGatewayOwnerAccountId, dxGatewayId, proposalId, vpnGatewayId);
        }
    }
}
