// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum InstanceType {
        T4G_Micro("db.t4g.micro"),
        T4G_Small("db.t4g.small"),
        T4G_Medium("db.t4g.medium"),
        T4G_Large("db.t4g.large"),
        T4G_XLarge("db.t4g.xlarge"),
        T4G_2XLarge("db.t4g.2xlarge"),
        T3_Micro("db.t3.micro"),
        T3_Small("db.t3.small"),
        T3_Medium("db.t3.medium"),
        T3_Large("db.t3.large"),
        T3_XLarge("db.t3.xlarge"),
        T3_2XLarge("db.t3.2xlarge"),
        T2_Micro("db.t2.micro"),
        T2_Small("db.t2.small"),
        T2_Medium("db.t2.medium"),
        T2_Large("db.t2.large"),
        T2_XLarge("db.t2.xlarge"),
        T2_2XLarge("db.t2.2xlarge"),
        M1_Small("db.m1.small"),
        M1_Medium("db.m1.medium"),
        M1_Large("db.m1.large"),
        M1_XLarge("db.m1.xlarge"),
        M2_XLarge("db.m2.xlarge"),
        M2_2XLarge("db.m2.2xlarge"),
        M2_4XLarge("db.m2.4xlarge"),
        M3_Medium("db.m3.medium"),
        M3_Large("db.m3.large"),
        M3_XLarge("db.m3.xlarge"),
        M3_2XLarge("db.m3.2xlarge"),
        M4_Large("db.m4.large"),
        M4_XLarge("db.m4.xlarge"),
        M4_2XLarge("db.m4.2xlarge"),
        M4_4XLarge("db.m4.4xlarge"),
        M4_10XLarge("db.m4.10xlarge"),
        M4_16XLarge("db.m4.10xlarge"),
        M5_Large("db.m5.large"),
        M5_XLarge("db.m5.xlarge"),
        M5_2XLarge("db.m5.2xlarge"),
        M5_4XLarge("db.m5.4xlarge"),
        M5_12XLarge("db.m5.12xlarge"),
        M5_24XLarge("db.m5.24xlarge"),
        M6G_Large("db.m6g.large"),
        M6G_XLarge("db.m6g.xlarge"),
        M6G_2XLarge("db.m6g.2xlarge"),
        M6G_4XLarge("db.m6g.4xlarge"),
        M6G_8XLarge("db.m6g.8xlarge"),
        M6G_12XLarge("db.m6g.12xlarge"),
        M6G_16XLarge("db.m6g.16xlarge"),
        R3_Large("db.r3.large"),
        R3_XLarge("db.r3.xlarge"),
        R3_2XLarge("db.r3.2xlarge"),
        R3_4XLarge("db.r3.4xlarge"),
        R3_8XLarge("db.r3.8xlarge"),
        R4_Large("db.r4.large"),
        R4_XLarge("db.r4.xlarge"),
        R4_2XLarge("db.r4.2xlarge"),
        R4_4XLarge("db.r4.4xlarge"),
        R4_8XLarge("db.r4.8xlarge"),
        R4_16XLarge("db.r4.16xlarge"),
        R5_Large("db.r5.large"),
        R5_XLarge("db.r5.xlarge"),
        R5_2XLarge("db.r5.2xlarge"),
        R5_4XLarge("db.r5.4xlarge"),
        R5_12XLarge("db.r5.12xlarge"),
        R5_24XLarge("db.r5.24xlarge"),
        R6G_Large("db.r6g.large"),
        R6G_XLarge("db.r6g.xlarge"),
        R6G_2XLarge("db.r6g.2xlarge"),
        R6G_4XLarge("db.r6g.4xlarge"),
        R6G_8XLarge("db.r6g.8xlarge"),
        R6G_12XLarge("db.r6g.12xlarge"),
        R6G_16XLarge("db.r6g.16xlarge"),
        X1_16XLarge("db.x1.16xlarge"),
        X1_32XLarge("db.x1.32xlarge"),
        X1E_XLarge("db.x1e.xlarge"),
        X1E_2XLarge("db.x1e.2xlarge"),
        X1E_4XLarge("db.x1e.4xlarge"),
        X1E_8XLarge("db.x1e.8xlarge"),
        X1E_32XLarge("db.x1e.32xlarge");

        private final String value;

        InstanceType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "InstanceType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
