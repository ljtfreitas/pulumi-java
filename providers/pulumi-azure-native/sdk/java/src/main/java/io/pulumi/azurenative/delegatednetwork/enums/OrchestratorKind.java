// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.delegatednetwork.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The kind of workbook. Choices are user and shared.
     * 
     */
    @EnumType
    public enum OrchestratorKind {
        Kubernetes("Kubernetes");

        private final String value;

        OrchestratorKind(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "OrchestratorKind[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
