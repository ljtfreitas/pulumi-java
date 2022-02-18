// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customproviders.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The routing types that are supported for action requests.
     * 
     */
    @EnumType
    public enum ActionRouting {
        Proxy("Proxy");

        private final String value;

        ActionRouting(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ActionRouting[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
