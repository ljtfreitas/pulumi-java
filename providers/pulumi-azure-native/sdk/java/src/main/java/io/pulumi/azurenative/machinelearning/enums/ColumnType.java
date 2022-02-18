// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Data type of the column.
     * 
     */
    @EnumType
    public enum ColumnType {
        Boolean("Boolean"),
        Integer("Integer"),
        Number("Number"),
        String("String");

        private final String value;

        ColumnType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ColumnType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
