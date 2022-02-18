// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The direction for the resource provider connection.
     * 
     */
    @EnumType
    public enum ResourceProviderConnection {
        Inbound("Inbound"),
        Outbound("Outbound");

        private final String value;

        ResourceProviderConnection(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ResourceProviderConnection[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
