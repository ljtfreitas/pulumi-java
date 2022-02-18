// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.aad.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Enabled or Disabled flag to turn on Group-based filtered sync
     * 
     */
    @EnumType
    public enum FilteredSync {
        Enabled("Enabled"),
        Disabled("Disabled");

        private final String value;

        FilteredSync(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "FilteredSync[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
