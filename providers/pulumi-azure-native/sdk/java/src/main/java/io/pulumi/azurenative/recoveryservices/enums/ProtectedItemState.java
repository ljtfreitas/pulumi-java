// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Protection state of the backup engine
     * 
     */
    @EnumType
    public enum ProtectedItemState {
        Invalid("Invalid"),
        IRPending("IRPending"),
        Protected("Protected"),
        ProtectionError("ProtectionError"),
        ProtectionStopped("ProtectionStopped"),
        ProtectionPaused("ProtectionPaused");

        private final String value;

        ProtectedItemState(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ProtectedItemState[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
