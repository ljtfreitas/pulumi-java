// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum CreateMode {
        Default("Default"),
        Copy("Copy"),
        Secondary("Secondary"),
        PointInTimeRestore("PointInTimeRestore"),
        Restore("Restore"),
        Recovery("Recovery"),
        RestoreExternalBackup("RestoreExternalBackup"),
        RestoreExternalBackupSecondary("RestoreExternalBackupSecondary"),
        RestoreLongTermRetentionBackup("RestoreLongTermRetentionBackup"),
        OnlineSecondary("OnlineSecondary");

        private final String value;

        CreateMode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "CreateMode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }