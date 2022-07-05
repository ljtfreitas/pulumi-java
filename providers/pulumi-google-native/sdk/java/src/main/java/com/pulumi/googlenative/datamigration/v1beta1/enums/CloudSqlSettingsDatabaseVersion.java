// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datamigration.v1beta1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The database engine type and version.
     * 
     */
    @EnumType
    public enum CloudSqlSettingsDatabaseVersion {
        /**
         * Unspecified version.
         * 
         */
        SqlDatabaseVersionUnspecified("SQL_DATABASE_VERSION_UNSPECIFIED"),
        /**
         * MySQL 5.6.
         * 
         */
        Mysql56("MYSQL_5_6"),
        /**
         * MySQL 5.7.
         * 
         */
        Mysql57("MYSQL_5_7"),
        /**
         * MySQL 8.0.
         * 
         */
        Mysql80("MYSQL_8_0");

        private final String value;

        CloudSqlSettingsDatabaseVersion(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "CloudSqlSettingsDatabaseVersion[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
