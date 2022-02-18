// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.timeseriesinsights.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * An enum that represents the format of the local timestamp property that needs to be set.
     * 
     */
    @EnumType
    public enum LocalTimestampFormat {
        Embedded("Embedded");

        private final String value;

        LocalTimestampFormat(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "LocalTimestampFormat[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
