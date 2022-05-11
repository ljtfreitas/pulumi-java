// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SubnetNatGatewayAssociationState extends com.pulumi.resources.ResourceArgs {

    public static final SubnetNatGatewayAssociationState Empty = new SubnetNatGatewayAssociationState();

    /**
     * The ID of the NAT Gateway which should be associated with the Subnet. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="natGatewayId")
    private @Nullable Output<String> natGatewayId;

    /**
     * @return The ID of the NAT Gateway which should be associated with the Subnet. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> natGatewayId() {
        return Optional.ofNullable(this.natGatewayId);
    }

    /**
     * The ID of the Subnet. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="subnetId")
    private @Nullable Output<String> subnetId;

    /**
     * @return The ID of the Subnet. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    private SubnetNatGatewayAssociationState() {}

    private SubnetNatGatewayAssociationState(SubnetNatGatewayAssociationState $) {
        this.natGatewayId = $.natGatewayId;
        this.subnetId = $.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubnetNatGatewayAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubnetNatGatewayAssociationState $;

        public Builder() {
            $ = new SubnetNatGatewayAssociationState();
        }

        public Builder(SubnetNatGatewayAssociationState defaults) {
            $ = new SubnetNatGatewayAssociationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param natGatewayId The ID of the NAT Gateway which should be associated with the Subnet. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder natGatewayId(@Nullable Output<String> natGatewayId) {
            $.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * @param natGatewayId The ID of the NAT Gateway which should be associated with the Subnet. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder natGatewayId(String natGatewayId) {
            return natGatewayId(Output.of(natGatewayId));
        }

        /**
         * @param subnetId The ID of the Subnet. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(@Nullable Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param subnetId The ID of the Subnet. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        public SubnetNatGatewayAssociationState build() {
            return $;
        }
    }

}
