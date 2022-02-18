// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.solutions.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * JIT approval mode.
     * 
     */
    @EnumType
    public enum JitApprovalMode {
        NotSpecified("NotSpecified"),
        AutoApprove("AutoApprove"),
        ManualApprove("ManualApprove");

        private final String value;

        JitApprovalMode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "JitApprovalMode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
