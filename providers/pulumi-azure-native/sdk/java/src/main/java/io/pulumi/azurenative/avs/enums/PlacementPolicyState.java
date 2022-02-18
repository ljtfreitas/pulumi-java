// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Whether the placement policy is enabled or disabled
     * 
     */
    @EnumType
    public enum PlacementPolicyState {
        Enabled("Enabled"),
        Disabled("Disabled");

        private final String value;

        PlacementPolicyState(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "PlacementPolicyState[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
