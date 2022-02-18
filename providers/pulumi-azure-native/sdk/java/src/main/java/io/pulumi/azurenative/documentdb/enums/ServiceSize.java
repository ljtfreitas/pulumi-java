// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Instance type for the service.
     * 
     */
    @EnumType
    public enum ServiceSize {
        Cosmos_D4s("Cosmos.D4s"),
        Cosmos_D8s("Cosmos.D8s"),
        Cosmos_D16s("Cosmos.D16s");

        private final String value;

        ServiceSize(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ServiceSize[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
