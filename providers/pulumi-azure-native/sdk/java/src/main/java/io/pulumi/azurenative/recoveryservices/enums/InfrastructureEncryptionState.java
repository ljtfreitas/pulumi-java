// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Enabling/Disabling the Double Encryption state
     * 
     */
    @EnumType
    public enum InfrastructureEncryptionState {
        Enabled("Enabled"),
        Disabled("Disabled");

        private final String value;

        InfrastructureEncryptionState(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "InfrastructureEncryptionState[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
