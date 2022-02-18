// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type of the extended location.
     * 
     */
    @EnumType
    public enum ExtendedLocationTypes {
        EdgeZone("EdgeZone");

        private final String value;

        ExtendedLocationTypes(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ExtendedLocationTypes[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
