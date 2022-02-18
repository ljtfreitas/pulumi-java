// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.timeseriesinsights.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type of the key property.
     * 
     */
    @EnumType
    public enum ReferenceDataKeyPropertyType {
        String("String"),
        Double("Double"),
        Bool("Bool"),
        DateTime("DateTime");

        private final String value;

        ReferenceDataKeyPropertyType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ReferenceDataKeyPropertyType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
