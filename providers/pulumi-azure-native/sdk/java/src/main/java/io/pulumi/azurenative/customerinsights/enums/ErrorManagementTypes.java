// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type of error management to use for the mapping.
     * 
     */
    @EnumType
    public enum ErrorManagementTypes {
        RejectAndContinue("RejectAndContinue"),
        StopImport("StopImport"),
        RejectUntilLimit("RejectUntilLimit");

        private final String value;

        ErrorManagementTypes(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ErrorManagementTypes[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
