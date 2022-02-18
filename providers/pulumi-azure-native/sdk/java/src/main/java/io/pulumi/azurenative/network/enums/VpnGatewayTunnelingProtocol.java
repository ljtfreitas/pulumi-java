// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * VPN protocol enabled for the VpnServerConfiguration.
     * 
     */
    @EnumType
    public enum VpnGatewayTunnelingProtocol {
        IkeV2("IkeV2"),
        OpenVPN("OpenVPN");

        private final String value;

        VpnGatewayTunnelingProtocol(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "VpnGatewayTunnelingProtocol[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
