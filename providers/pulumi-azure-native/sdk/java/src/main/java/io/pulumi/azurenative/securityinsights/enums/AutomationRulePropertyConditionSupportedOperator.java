// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The operator to use for evaluation the condition
     * 
     */
    @EnumType
    public enum AutomationRulePropertyConditionSupportedOperator {
        /**
         * Evaluates if the property equals at least one of the condition values
         * 
         */
        Equals("Equals"),
        /**
         * Evaluates if the property does not equal any of the condition values
         * 
         */
        NotEquals("NotEquals"),
        /**
         * Evaluates if the property contains at least one of the condition values
         * 
         */
        Contains("Contains"),
        /**
         * Evaluates if the property does not contain any of the condition values
         * 
         */
        NotContains("NotContains"),
        /**
         * Evaluates if the property starts with any of the condition values
         * 
         */
        StartsWith("StartsWith"),
        /**
         * Evaluates if the property does not start with any of the condition values
         * 
         */
        NotStartsWith("NotStartsWith"),
        /**
         * Evaluates if the property ends with any of the condition values
         * 
         */
        EndsWith("EndsWith"),
        /**
         * Evaluates if the property does not end with any of the condition values
         * 
         */
        NotEndsWith("NotEndsWith");

        private final String value;

        AutomationRulePropertyConditionSupportedOperator(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AutomationRulePropertyConditionSupportedOperator[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
