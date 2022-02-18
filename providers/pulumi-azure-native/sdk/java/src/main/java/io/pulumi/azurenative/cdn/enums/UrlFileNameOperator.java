// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Describes operator to be matched
     * 
     */
    @EnumType
    public enum UrlFileNameOperator {
        Any("Any"),
        Equal("Equal"),
        Contains("Contains"),
        BeginsWith("BeginsWith"),
        EndsWith("EndsWith"),
        LessThan("LessThan"),
        LessThanOrEqual("LessThanOrEqual"),
        GreaterThan("GreaterThan"),
        GreaterThanOrEqual("GreaterThanOrEqual"),
        RegEx("RegEx");

        private final String value;

        UrlFileNameOperator(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "UrlFileNameOperator[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
