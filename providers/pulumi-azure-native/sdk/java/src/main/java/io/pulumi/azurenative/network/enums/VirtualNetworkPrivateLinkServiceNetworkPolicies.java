// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Enable or Disable apply network policies on private link service in the subnet.
     * 
     */
    @EnumType
    public enum VirtualNetworkPrivateLinkServiceNetworkPolicies {
        Enabled("Enabled"),
        Disabled("Disabled");

        private final String value;

        VirtualNetworkPrivateLinkServiceNetworkPolicies(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "VirtualNetworkPrivateLinkServiceNetworkPolicies[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
