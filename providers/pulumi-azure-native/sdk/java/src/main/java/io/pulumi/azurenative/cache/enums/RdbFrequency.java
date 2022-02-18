// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cache.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Sets the frequency at which a snapshot of the database is created.
     * 
     */
    @EnumType
    public enum RdbFrequency {
        RdbFrequency_1h("1h"),
        RdbFrequency_6h("6h"),
        RdbFrequency_12h("12h");

        private final String value;

        RdbFrequency(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "RdbFrequency[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
