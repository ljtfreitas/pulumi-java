// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.iam_v1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum KeyKeyAlgorithm {
        KeyAlgUnspecified("KEY_ALG_UNSPECIFIED"),
        KeyAlgRsa1024("KEY_ALG_RSA_1024"),
        KeyAlgRsa2048("KEY_ALG_RSA_2048");

        private final String value;

        KeyKeyAlgorithm(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "KeyKeyAlgorithm[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }