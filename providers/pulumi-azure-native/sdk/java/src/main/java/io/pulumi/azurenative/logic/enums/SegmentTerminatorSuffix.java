// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The segment terminator suffix.
     * 
     */
    @EnumType
    public enum SegmentTerminatorSuffix {
        NotSpecified("NotSpecified"),
        None("None"),
        CR("CR"),
        LF("LF"),
        CRLF("CRLF");

        private final String value;

        SegmentTerminatorSuffix(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "SegmentTerminatorSuffix[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
