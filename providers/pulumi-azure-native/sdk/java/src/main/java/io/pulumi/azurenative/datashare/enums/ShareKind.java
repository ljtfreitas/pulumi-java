// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Share kind.
     * 
     */
    @EnumType
    public enum ShareKind {
        CopyBased("CopyBased"),
        InPlace("InPlace");

        private final String value;

        ShareKind(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ShareKind[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
