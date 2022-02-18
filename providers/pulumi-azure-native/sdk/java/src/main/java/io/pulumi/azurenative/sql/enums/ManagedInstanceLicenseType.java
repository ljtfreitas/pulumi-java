// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The license type. Possible values are 'LicenseIncluded' (regular price inclusive of a new SQL license) and 'BasePrice' (discounted AHB price for bringing your own SQL licenses).
     * 
     */
    @EnumType
    public enum ManagedInstanceLicenseType {
        LicenseIncluded("LicenseIncluded"),
        BasePrice("BasePrice");

        private final String value;

        ManagedInstanceLicenseType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ManagedInstanceLicenseType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
