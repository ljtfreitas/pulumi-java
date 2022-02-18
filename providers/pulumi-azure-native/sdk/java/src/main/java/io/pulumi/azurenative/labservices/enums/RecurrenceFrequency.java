// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The frequency of the recurrence.
     * 
     */
    @EnumType
    public enum RecurrenceFrequency {
        /**
         * Schedule will run every days.
         * 
         */
        Daily("Daily"),
        /**
         * Schedule will run every week on days specified in weekDays.
         * 
         */
        Weekly("Weekly");

        private final String value;

        RecurrenceFrequency(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "RecurrenceFrequency[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
