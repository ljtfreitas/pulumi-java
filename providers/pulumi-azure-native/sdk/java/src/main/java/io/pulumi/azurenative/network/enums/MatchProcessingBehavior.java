// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * If this rule is a match should the rules engine continue running the remaining rules or stop. If not present, defaults to Continue.
     * 
     */
    @EnumType
    public enum MatchProcessingBehavior {
        Continue("Continue"),
        Stop("Stop");

        private final String value;

        MatchProcessingBehavior(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "MatchProcessingBehavior[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
