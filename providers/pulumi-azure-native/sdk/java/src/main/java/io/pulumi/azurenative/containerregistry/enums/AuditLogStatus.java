// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Indicates whether audit logs are enabled on the connected registry.
     * 
     */
    @EnumType
    public enum AuditLogStatus {
        Enabled("Enabled"),
        Disabled("Disabled");

        private final String value;

        AuditLogStatus(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AuditLogStatus[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
