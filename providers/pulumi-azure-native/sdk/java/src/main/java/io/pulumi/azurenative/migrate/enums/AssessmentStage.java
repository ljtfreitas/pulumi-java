// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * User configurable setting that describes the status of the assessment.
     * 
     */
    @EnumType
    public enum AssessmentStage {
        InProgress("InProgress"),
        UnderReview("UnderReview"),
        Approved("Approved");

        private final String value;

        AssessmentStage(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AssessmentStage[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
