// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Track property condition operation
     * 
     */
    @EnumType
    public enum TrackPropertyCompareOperation {
        /**
         * Unknown track property compare operation
         * 
         */
        Unknown("Unknown"),
        /**
         * Equal operation
         * 
         */
        Equal("Equal");

        private final String value;

        TrackPropertyCompareOperation(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "TrackPropertyCompareOperation[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
