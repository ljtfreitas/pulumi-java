// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudiot_v1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum PublicKeyCredentialFormat {
        UnspecifiedPublicKeyFormat("UNSPECIFIED_PUBLIC_KEY_FORMAT"),
        RsaPem("RSA_PEM"),
        RsaX509Pem("RSA_X509_PEM"),
        Es256Pem("ES256_PEM"),
        Es256X509Pem("ES256_X509_PEM");

        private final String value;

        PublicKeyCredentialFormat(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "PublicKeyCredentialFormat[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }