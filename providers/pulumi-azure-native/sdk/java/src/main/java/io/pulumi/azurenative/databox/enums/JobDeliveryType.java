// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Delivery type of Job.
     * 
     */
    @EnumType
    public enum JobDeliveryType {
        /**
         * Non Scheduled job.
         * 
         */
        NonScheduled("NonScheduled"),
        /**
         * Scheduled job.
         * 
         */
        Scheduled("Scheduled");

        private final String value;

        JobDeliveryType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "JobDeliveryType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
