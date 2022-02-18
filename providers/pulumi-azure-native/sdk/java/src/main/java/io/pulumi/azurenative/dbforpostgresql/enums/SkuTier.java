// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbforpostgresql.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The tier of the particular SKU, e.g. Basic.
     * 
     */
    @EnumType
    public enum SkuTier {
        Basic("Basic"),
        GeneralPurpose("GeneralPurpose"),
        MemoryOptimized("MemoryOptimized");

        private final String value;

        SkuTier(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SkuTier[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
