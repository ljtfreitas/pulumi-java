// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbformariadb.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Enable Storage Auto Grow.
     * 
     */
    @EnumType
    public enum StorageAutogrow {
        Enabled("Enabled"),
        Disabled("Disabled");

        private final String value;

        StorageAutogrow(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "StorageAutogrow[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
