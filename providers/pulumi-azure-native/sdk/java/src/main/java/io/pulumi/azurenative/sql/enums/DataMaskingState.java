// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The state of the data masking policy.
     * 
     */
    @EnumType
    public enum DataMaskingState {
        Disabled("Disabled"),
        Enabled("Enabled");

        private final String value;

        DataMaskingState(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DataMaskingState[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
