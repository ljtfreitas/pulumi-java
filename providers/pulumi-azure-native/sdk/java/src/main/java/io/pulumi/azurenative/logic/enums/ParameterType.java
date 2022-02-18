// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type.
     * 
     */
    @EnumType
    public enum ParameterType {
        NotSpecified("NotSpecified"),
        String("String"),
        SecureString("SecureString"),
        Int("Int"),
        Float("Float"),
        Bool("Bool"),
        Array("Array"),
        Object("Object"),
        SecureObject("SecureObject");

        private final String value;

        ParameterType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ParameterType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
