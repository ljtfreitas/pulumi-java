// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The kind of service (Stateless or Stateful).
     * 
     */
    @EnumType
    public enum ServiceKind {
        /**
         * Indicates the service kind is invalid. All Service Fabric enumerations have the invalid type. The value is zero.
         * 
         */
        Invalid("Invalid"),
        /**
         * Does not use Service Fabric to make its state highly available or reliable. The value is 1.
         * 
         */
        Stateless("Stateless"),
        /**
         * Uses Service Fabric to make its state or part of its state highly available and reliable. The value is 2.
         * 
         */
        Stateful("Stateful");

        private final String value;

        ServiceKind(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ServiceKind[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
