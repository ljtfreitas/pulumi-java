// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Specifies the type of identity framework.
     * 
     */
    @EnumType
    public enum IdentityConfigurationType {
        Managed("Managed"),
        AMLToken("AMLToken");

        private final String value;

        IdentityConfigurationType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "IdentityConfigurationType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
