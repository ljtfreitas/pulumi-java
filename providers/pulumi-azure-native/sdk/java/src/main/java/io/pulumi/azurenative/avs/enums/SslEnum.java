// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Protect LDAP communication using SSL certificate (LDAPS)
     * 
     */
    @EnumType
    public enum SslEnum {
        Enabled("Enabled"),
        Disabled("Disabled");

        private final String value;

        SslEnum(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SslEnum[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
