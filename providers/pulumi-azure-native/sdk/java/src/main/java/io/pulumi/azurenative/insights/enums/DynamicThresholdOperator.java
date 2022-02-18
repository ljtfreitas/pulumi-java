// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The operator used to compare the metric value against the threshold.
     * 
     */
    @EnumType
    public enum DynamicThresholdOperator {
        GreaterThan("GreaterThan"),
        LessThan("LessThan"),
        GreaterOrLessThan("GreaterOrLessThan");

        private final String value;

        DynamicThresholdOperator(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DynamicThresholdOperator[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
