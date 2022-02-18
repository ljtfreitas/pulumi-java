// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.plant.tree_v1.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum Farm {
        Pulumi_Planters_Inc_("Pulumi Planters Inc."),
        Plants_R_Us("Plants'R'Us");

        private final String value;

        Farm(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "Farm[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
