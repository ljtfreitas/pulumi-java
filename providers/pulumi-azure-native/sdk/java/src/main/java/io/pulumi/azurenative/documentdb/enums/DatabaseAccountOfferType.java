// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The offer type for the database
     * 
     */
    @EnumType
    public enum DatabaseAccountOfferType {
        Standard("Standard");

        private final String value;

        DatabaseAccountOfferType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DatabaseAccountOfferType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
