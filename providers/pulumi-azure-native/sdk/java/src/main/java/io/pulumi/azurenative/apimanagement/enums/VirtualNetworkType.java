// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type of VPN in which API Management service needs to be configured in. None (Default Value) means the API Management service is not part of any Virtual Network, External means the API Management deployment is set up inside a Virtual Network having an Internet Facing Endpoint, and Internal means that API Management deployment is setup inside a Virtual Network having an Intranet Facing Endpoint only.
     * 
     */
    @EnumType
    public enum VirtualNetworkType {
        /**
         * The service is not part of any Virtual Network.
         * 
         */
        None("None"),
        /**
         * The service is part of Virtual Network and it is accessible from Internet.
         * 
         */
        External("External"),
        /**
         * The service is part of Virtual Network and it is only accessible from within the virtual network.
         * 
         */
        Internal("Internal");

        private final String value;

        VirtualNetworkType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "VirtualNetworkType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
