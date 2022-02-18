// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Determines whether this link is supposed to create or delete instances if Link is NOT Reference Only.
     * 
     */
    @EnumType
    public enum InstanceOperationType {
        Upsert("Upsert"),
        Delete("Delete");

        private final String value;

        InstanceOperationType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "InstanceOperationType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
