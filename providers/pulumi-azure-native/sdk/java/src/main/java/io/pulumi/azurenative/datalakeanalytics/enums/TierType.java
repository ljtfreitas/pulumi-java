// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datalakeanalytics.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The commitment tier for the next month.
     * 
     */
    @EnumType
    public enum TierType {
        Consumption("Consumption"),
        Commitment_100AUHours("Commitment_100AUHours"),
        Commitment_500AUHours("Commitment_500AUHours"),
        Commitment_1000AUHours("Commitment_1000AUHours"),
        Commitment_5000AUHours("Commitment_5000AUHours"),
        Commitment_10000AUHours("Commitment_10000AUHours"),
        Commitment_50000AUHours("Commitment_50000AUHours"),
        Commitment_100000AUHours("Commitment_100000AUHours"),
        Commitment_500000AUHours("Commitment_500000AUHours");

        private final String value;

        TierType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "TierType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
