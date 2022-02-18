// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Gets or sets the type.
     * 
     */
    @EnumType
    public enum StorageSettingTypes {
        GeoRedundant("GeoRedundant"),
        LocallyRedundant("LocallyRedundant");

        private final String value;

        StorageSettingTypes(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "StorageSettingTypes[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
