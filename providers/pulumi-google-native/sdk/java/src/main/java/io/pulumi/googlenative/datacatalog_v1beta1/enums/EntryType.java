// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1beta1.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum EntryType {
        EntryTypeUnspecified("ENTRY_TYPE_UNSPECIFIED"),
        Table("TABLE"),
        Model("MODEL"),
        DataStream("DATA_STREAM"),
        Fileset("FILESET");

        private final String value;

        EntryType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "EntryType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }