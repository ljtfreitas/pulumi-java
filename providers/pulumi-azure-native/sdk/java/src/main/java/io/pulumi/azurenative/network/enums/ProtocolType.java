// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * RNM supported protocol types.
     * 
     */
    @EnumType
    public enum ProtocolType {
        DoNotUse("DoNotUse"),
        Icmp("Icmp"),
        Tcp("Tcp"),
        Udp("Udp"),
        Gre("Gre"),
        Esp("Esp"),
        Ah("Ah"),
        Vxlan("Vxlan"),
        All("All");

        private final String value;

        ProtocolType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ProtocolType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
