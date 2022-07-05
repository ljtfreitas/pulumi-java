// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1beta1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Defined in CVSS v3
     * 
     */
    @EnumType
    public enum CVSSUserInteraction {
        /**
         * Defined in CVSS v3
         * 
         */
        UserInteractionUnspecified("USER_INTERACTION_UNSPECIFIED"),
        /**
         * Defined in CVSS v3
         * 
         */
        UserInteractionNone("USER_INTERACTION_NONE"),
        /**
         * Defined in CVSS v3
         * 
         */
        UserInteractionRequired("USER_INTERACTION_REQUIRED");

        private final String value;

        CVSSUserInteraction(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "CVSSUserInteraction[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
