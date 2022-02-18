// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The peering type.
     * 
     */
    @EnumType
    public enum ExpressRoutePeeringType {
        AzurePublicPeering("AzurePublicPeering"),
        AzurePrivatePeering("AzurePrivatePeering"),
        MicrosoftPeering("MicrosoftPeering");

        private final String value;

        ExpressRoutePeeringType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ExpressRoutePeeringType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
