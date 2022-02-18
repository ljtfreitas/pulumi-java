// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.policyinsights.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The compliance state that should be set on the resource.
     * 
     */
    @EnumType
    public enum ComplianceState {
        /**
         * The resource is in compliance with the policy.
         * 
         */
        Compliant("Compliant"),
        /**
         * The resource is not in compliance with the policy.
         * 
         */
        NonCompliant("NonCompliant"),
        /**
         * The compliance state of the resource is not known.
         * 
         */
        Unknown("Unknown");

        private final String value;

        ComplianceState(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ComplianceState[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
