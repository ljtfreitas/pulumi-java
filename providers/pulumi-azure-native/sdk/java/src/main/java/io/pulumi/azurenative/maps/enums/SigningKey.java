// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.maps.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The Map account key to use for signing.
     * 
     */
    @EnumType
    public enum SigningKey {
        PrimaryKey("primaryKey"),
        SecondaryKey("secondaryKey");

        private final String value;

        SigningKey(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SigningKey[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
