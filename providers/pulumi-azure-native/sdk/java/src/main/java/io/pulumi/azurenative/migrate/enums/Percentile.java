// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Percentile of performance data used to recommend Azure size.
     * 
     */
    @EnumType
    public enum Percentile {
        Percentile50("Percentile50"),
        Percentile90("Percentile90"),
        Percentile95("Percentile95"),
        Percentile99("Percentile99");

        private final String value;

        Percentile(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "Percentile[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
