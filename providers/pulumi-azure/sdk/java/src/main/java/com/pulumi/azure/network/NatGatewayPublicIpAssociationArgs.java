// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class NatGatewayPublicIpAssociationArgs extends com.pulumi.resources.ResourceArgs {

    public static final NatGatewayPublicIpAssociationArgs Empty = new NatGatewayPublicIpAssociationArgs();

    /**
     * The ID of the NAT Gateway. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="natGatewayId", required=true)
    private Output<String> natGatewayId;

    /**
     * @return The ID of the NAT Gateway. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> natGatewayId() {
        return this.natGatewayId;
    }

    /**
     * The ID of the Public IP which this NAT Gateway which should be connected to. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="publicIpAddressId", required=true)
    private Output<String> publicIpAddressId;

    /**
     * @return The ID of the Public IP which this NAT Gateway which should be connected to. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> publicIpAddressId() {
        return this.publicIpAddressId;
    }

    private NatGatewayPublicIpAssociationArgs() {}

    private NatGatewayPublicIpAssociationArgs(NatGatewayPublicIpAssociationArgs $) {
        this.natGatewayId = $.natGatewayId;
        this.publicIpAddressId = $.publicIpAddressId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NatGatewayPublicIpAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NatGatewayPublicIpAssociationArgs $;

        public Builder() {
            $ = new NatGatewayPublicIpAssociationArgs();
        }

        public Builder(NatGatewayPublicIpAssociationArgs defaults) {
            $ = new NatGatewayPublicIpAssociationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param natGatewayId The ID of the NAT Gateway. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder natGatewayId(Output<String> natGatewayId) {
            $.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * @param natGatewayId The ID of the NAT Gateway. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder natGatewayId(String natGatewayId) {
            return natGatewayId(Output.of(natGatewayId));
        }

        /**
         * @param publicIpAddressId The ID of the Public IP which this NAT Gateway which should be connected to. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder publicIpAddressId(Output<String> publicIpAddressId) {
            $.publicIpAddressId = publicIpAddressId;
            return this;
        }

        /**
         * @param publicIpAddressId The ID of the Public IP which this NAT Gateway which should be connected to. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder publicIpAddressId(String publicIpAddressId) {
            return publicIpAddressId(Output.of(publicIpAddressId));
        }

        public NatGatewayPublicIpAssociationArgs build() {
            $.natGatewayId = Objects.requireNonNull($.natGatewayId, "expected parameter 'natGatewayId' to be non-null");
            $.publicIpAddressId = Objects.requireNonNull($.publicIpAddressId, "expected parameter 'publicIpAddressId' to be non-null");
            return $;
        }
    }

}
