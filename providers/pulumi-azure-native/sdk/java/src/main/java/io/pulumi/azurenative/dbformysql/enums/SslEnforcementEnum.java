// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbformysql.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Enable ssl enforcement or not when connect to server.
     * 
     */
    @EnumType
    public enum SslEnforcementEnum {
        Enabled("Enabled"),
        Disabled("Disabled");

        private final String value;

        SslEnforcementEnum(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SslEnforcementEnum[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
