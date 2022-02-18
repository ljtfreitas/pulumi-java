// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Connection protocol used for this connection.
     * 
     */
    @EnumType
    public enum VirtualNetworkGatewayConnectionProtocol {
        IKEv2("IKEv2"),
        IKEv1("IKEv1");

        private final String value;

        VirtualNetworkGatewayConnectionProtocol(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "VirtualNetworkGatewayConnectionProtocol[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
