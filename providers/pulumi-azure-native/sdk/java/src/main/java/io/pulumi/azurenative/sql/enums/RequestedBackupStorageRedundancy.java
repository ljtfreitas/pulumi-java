// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The storage account type to be used to store backups for this database.
     * 
     */
    @EnumType
    public enum RequestedBackupStorageRedundancy {
        Geo("Geo"),
        Local("Local"),
        Zone("Zone");

        private final String value;

        RequestedBackupStorageRedundancy(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "RequestedBackupStorageRedundancy[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
