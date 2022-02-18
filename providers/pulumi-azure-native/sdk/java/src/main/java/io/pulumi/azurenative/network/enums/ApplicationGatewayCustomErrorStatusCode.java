// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Status code of the application gateway customer error.
     * 
     */
    @EnumType
    public enum ApplicationGatewayCustomErrorStatusCode {
        HttpStatus403("HttpStatus403"),
        HttpStatus502("HttpStatus502");

        private final String value;

        ApplicationGatewayCustomErrorStatusCode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ApplicationGatewayCustomErrorStatusCode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
