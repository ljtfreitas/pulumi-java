// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type of configuration. The default and only option is ONE_TO_ONE_NAT.
     * 
     */
    @EnumType
    public enum AccessConfigType {
        DirectIpv6("DIRECT_IPV6"),
        OneToOneNat("ONE_TO_ONE_NAT");

        private final String value;

        AccessConfigType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AccessConfigType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
