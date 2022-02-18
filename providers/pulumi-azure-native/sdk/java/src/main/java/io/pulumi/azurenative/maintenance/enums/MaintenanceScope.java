// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.maintenance.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Gets or sets maintenanceScope of the configuration. It represent the impact area of the maintenance
     * 
     */
    @EnumType
    public enum MaintenanceScope {
        All("All"),
        Host("Host"),
        Resource("Resource"),
        InResource("InResource");

        private final String value;

        MaintenanceScope(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "MaintenanceScope[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
