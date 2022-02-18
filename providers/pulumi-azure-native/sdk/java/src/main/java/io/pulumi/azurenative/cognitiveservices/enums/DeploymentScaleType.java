// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cognitiveservices.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Deployment scale type.
     * 
     */
    @EnumType
    public enum DeploymentScaleType {
        Manual("Manual");

        private final String value;

        DeploymentScaleType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DeploymentScaleType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
