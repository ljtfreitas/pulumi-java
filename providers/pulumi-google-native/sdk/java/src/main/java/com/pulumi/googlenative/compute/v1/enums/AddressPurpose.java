// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The purpose of this resource, which can be one of the following values: - GCE_ENDPOINT for addresses that are used by VM instances, alias IP ranges, load balancers, and similar resources. - DNS_RESOLVER for a DNS resolver address in a subnetwork for a Cloud DNS inbound forwarder IP addresses (regional internal IP address in a subnet of a VPC network) - VPC_PEERING for global internal IP addresses used for private services access allocated ranges. - NAT_AUTO for the regional external IP addresses used by Cloud NAT when allocating addresses using automatic NAT IP address allocation. - IPSEC_INTERCONNECT for addresses created from a private IP range that are reserved for a VLAN attachment in an *IPsec-encrypted Cloud Interconnect* configuration. These addresses are regional resources. Not currently available publicly. - `SHARED_LOADBALANCER_VIP` for an internal IP address that is assigned to multiple internal forwarding rules. - `PRIVATE_SERVICE_CONNECT` for a private network address that is used to configure Private Service Connect. Only global internal addresses can use this purpose.
     * 
     */
    @EnumType
    public enum AddressPurpose {
        /**
         * DNS resolver address in the subnetwork.
         * 
         */
        DnsResolver("DNS_RESOLVER"),
        /**
         * VM internal/alias IP, Internal LB service IP, etc.
         * 
         */
        GceEndpoint("GCE_ENDPOINT"),
        /**
         * A regional internal IP address range reserved for the VLAN attachment that is used in IPsec-encrypted Cloud Interconnect. This regional internal IP address range must not overlap with any IP address range of subnet/route in the VPC network and its peering networks. After the VLAN attachment is created with the reserved IP address range, when creating a new VPN gateway, its interface IP address is allocated from the associated VLAN attachment’s IP address range.
         * 
         */
        IpsecInterconnect("IPSEC_INTERCONNECT"),
        /**
         * External IP automatically reserved for Cloud NAT.
         * 
         */
        NatAuto("NAT_AUTO"),
        /**
         * A private network IP address that can be used to configure Private Service Connect. This purpose can be specified only for GLOBAL addresses of Type INTERNAL
         * 
         */
        PrivateServiceConnect("PRIVATE_SERVICE_CONNECT"),
        /**
         * A regional internal IP address range reserved for Serverless.
         * 
         */
        Serverless("SERVERLESS"),
        /**
         * A private network IP address that can be shared by multiple Internal Load Balancer forwarding rules.
         * 
         */
        SharedLoadbalancerVip("SHARED_LOADBALANCER_VIP"),
        /**
         * IP range for peer networks.
         * 
         */
        VpcPeering("VPC_PEERING");

        private final String value;

        AddressPurpose(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AddressPurpose[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
