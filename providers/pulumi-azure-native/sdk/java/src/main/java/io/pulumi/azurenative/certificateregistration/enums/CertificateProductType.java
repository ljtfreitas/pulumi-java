// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.certificateregistration.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Certificate product type.
     * 
     */
    @EnumType
    public enum CertificateProductType {
        StandardDomainValidatedSsl("StandardDomainValidatedSsl"),
        StandardDomainValidatedWildCardSsl("StandardDomainValidatedWildCardSsl");

        private final String value;

        CertificateProductType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "CertificateProductType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
