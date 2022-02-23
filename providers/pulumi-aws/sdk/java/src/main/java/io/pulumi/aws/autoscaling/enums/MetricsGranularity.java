// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscaling.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * See https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_EnableMetricsCollection.html
     * 
     */
    @EnumType
    public enum MetricsGranularity {
        OneMinute("1Minute");

        private final String value;

        MetricsGranularity(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "MetricsGranularity[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
