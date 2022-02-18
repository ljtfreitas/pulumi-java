// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Enum indicating if this favorite definition is owned by a specific user or is shared between all users with access to the Application Insights component.
     * 
     */
    @EnumType
    public enum FavoriteType {
        Shared("shared"),
        User("user");

        private final String value;

        FavoriteType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "FavoriteType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
