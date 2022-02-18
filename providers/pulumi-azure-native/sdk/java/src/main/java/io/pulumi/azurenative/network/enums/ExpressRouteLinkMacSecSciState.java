// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Sci mode enabled/disabled.
     * 
     */
    @EnumType
    public enum ExpressRouteLinkMacSecSciState {
        Disabled("Disabled"),
        Enabled("Enabled");

        private final String value;

        ExpressRouteLinkMacSecSciState(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ExpressRouteLinkMacSecSciState[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
