// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum GoogleCloudDatacatalogV1BigQueryConnectionSpecConnectionType {
        ConnectionTypeUnspecified("CONNECTION_TYPE_UNSPECIFIED"),
        CloudSql("CLOUD_SQL");

        private final String value;

        GoogleCloudDatacatalogV1BigQueryConnectionSpecConnectionType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GoogleCloudDatacatalogV1BigQueryConnectionSpecConnectionType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }