// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.scheduler.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Gets or sets the state.
     * 
     */
    @EnumType
    public enum JobCollectionState {
        Enabled("Enabled"),
        Disabled("Disabled"),
        Suspended("Suspended"),
        Deleted("Deleted");

        private final String value;

        JobCollectionState(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "JobCollectionState[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
