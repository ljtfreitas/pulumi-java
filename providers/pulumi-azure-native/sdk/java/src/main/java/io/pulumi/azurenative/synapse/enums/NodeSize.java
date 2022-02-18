// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The level of compute power that each node in the Big Data pool has.
     * 
     */
    @EnumType
    public enum NodeSize {
        None("None"),
        Small("Small"),
        Medium("Medium"),
        Large("Large"),
        XLarge("XLarge"),
        XXLarge("XXLarge"),
        XXXLarge("XXXLarge");

        private final String value;

        NodeSize(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "NodeSize[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
