// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * how to match header value
     * 
     */
    @EnumType
    public enum HeaderMatchType {
        Exact("exact");

        private final String value;

        HeaderMatchType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "HeaderMatchType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
