// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * A valid comparer operator to use. A case-insensitive comparison will be applied for String PropertyType.
     * 
     */
    @EnumType
    public enum Operator {
        /**
         * Applies for decimal and non-decimal operands
         * 
         */
        Equals("Equals"),
        /**
         * Applies only for decimal operands
         * 
         */
        GreaterThan("GreaterThan"),
        /**
         * Applies only for decimal operands
         * 
         */
        GreaterThanOrEqualTo("GreaterThanOrEqualTo"),
        /**
         * Applies only for decimal operands
         * 
         */
        LesserThan("LesserThan"),
        /**
         * Applies only for decimal operands
         * 
         */
        LesserThanOrEqualTo("LesserThanOrEqualTo"),
        /**
         * Applies  for decimal and non-decimal operands
         * 
         */
        NotEquals("NotEquals"),
        /**
         * Applies only for non-decimal operands
         * 
         */
        Contains("Contains"),
        /**
         * Applies only for non-decimal operands
         * 
         */
        StartsWith("StartsWith"),
        /**
         * Applies only for non-decimal operands
         * 
         */
        EndsWith("EndsWith");

        private final String value;

        Operator(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "Operator[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
