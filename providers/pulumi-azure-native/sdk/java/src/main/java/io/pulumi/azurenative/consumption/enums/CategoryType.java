// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.consumption.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The category of the budget, whether the budget tracks cost or usage.
     * 
     */
    @EnumType
    public enum CategoryType {
        Cost("Cost");

        private final String value;

        CategoryType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "CategoryType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
