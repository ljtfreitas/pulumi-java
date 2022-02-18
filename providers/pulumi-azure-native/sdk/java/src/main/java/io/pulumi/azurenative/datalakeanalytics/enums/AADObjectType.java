// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datalakeanalytics.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type of AAD object the object identifier refers to.
     * 
     */
    @EnumType
    public enum AADObjectType {
        User("User"),
        Group("Group"),
        ServicePrincipal("ServicePrincipal");

        private final String value;

        AADObjectType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AADObjectType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
