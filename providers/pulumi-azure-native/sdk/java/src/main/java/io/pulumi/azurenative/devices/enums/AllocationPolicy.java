// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Allocation policy to be used by this provisioning service.
     * 
     */
    @EnumType
    public enum AllocationPolicy {
        Hashed("Hashed"),
        GeoLatency("GeoLatency"),
        Static("Static");

        private final String value;

        AllocationPolicy(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AllocationPolicy[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
