// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The granularity of rows in the report.
     * 
     */
    @EnumType
    public enum ReportGranularityType {
        Daily("Daily"),
        Monthly("Monthly");

        private final String value;

        ReportGranularityType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ReportGranularityType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
