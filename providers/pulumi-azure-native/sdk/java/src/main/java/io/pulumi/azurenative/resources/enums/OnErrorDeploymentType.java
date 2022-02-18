// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The deployment on error behavior type. Possible values are LastSuccessful and SpecificDeployment.
     * 
     */
    @EnumType
    public enum OnErrorDeploymentType {
        LastSuccessful("LastSuccessful"),
        SpecificDeployment("SpecificDeployment");

        private final String value;

        OnErrorDeploymentType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "OnErrorDeploymentType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
