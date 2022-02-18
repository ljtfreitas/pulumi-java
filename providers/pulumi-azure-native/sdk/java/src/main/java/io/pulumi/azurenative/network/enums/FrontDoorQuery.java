// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Treatment of URL query terms when forming the cache key.
     * 
     */
    @EnumType
    public enum FrontDoorQuery {
        StripNone("StripNone"),
        StripAll("StripAll"),
        StripOnly("StripOnly"),
        StripAllExcept("StripAllExcept");

        private final String value;

        FrontDoorQuery(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "FrontDoorQuery[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
