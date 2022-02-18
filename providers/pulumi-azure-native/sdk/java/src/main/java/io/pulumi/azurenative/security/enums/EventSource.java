// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * A valid event source type.
     * 
     */
    @EnumType
    public enum EventSource {
        Assessments("Assessments"),
        AssessmentsSnapshot("AssessmentsSnapshot"),
        SubAssessments("SubAssessments"),
        SubAssessmentsSnapshot("SubAssessmentsSnapshot"),
        Alerts("Alerts"),
        SecureScores("SecureScores"),
        SecureScoresSnapshot("SecureScoresSnapshot"),
        SecureScoreControls("SecureScoreControls"),
        SecureScoreControlsSnapshot("SecureScoreControlsSnapshot"),
        RegulatoryComplianceAssessment("RegulatoryComplianceAssessment"),
        RegulatoryComplianceAssessmentSnapshot("RegulatoryComplianceAssessmentSnapshot");

        private final String value;

        EventSource(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "EventSource[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
