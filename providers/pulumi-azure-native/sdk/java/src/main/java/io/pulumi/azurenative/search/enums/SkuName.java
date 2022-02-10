// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.search.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum SkuName {
        Free("free"),
        Basic("basic"),
        Standard("standard"),
        Standard2("standard2"),
        Standard3("standard3"),
        Storage_optimized_l1("storage_optimized_l1"),
        Storage_optimized_l2("storage_optimized_l2");

        private final String value;

        SkuName(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SkuName[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }