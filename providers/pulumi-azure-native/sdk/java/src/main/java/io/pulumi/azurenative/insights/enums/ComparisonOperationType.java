// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * the operator that is used to compare the metric data and the threshold.
     * 
     */
    @EnumType
    public enum ComparisonOperationType {
        Equals("Equals"),
        NotEquals("NotEquals"),
        GreaterThan("GreaterThan"),
        GreaterThanOrEqual("GreaterThanOrEqual"),
        LessThan("LessThan"),
        LessThanOrEqual("LessThanOrEqual");

        private final String value;

        ComparisonOperationType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ComparisonOperationType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
