// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The data format of the message. Optionally the data format can be added to each message.
     * 
     */
    @EnumType
    public enum DataFormat {
        MULTIJSON("MULTIJSON"),
        JSON("JSON"),
        CSV("CSV");

        private final String value;

        DataFormat(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DataFormat[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
