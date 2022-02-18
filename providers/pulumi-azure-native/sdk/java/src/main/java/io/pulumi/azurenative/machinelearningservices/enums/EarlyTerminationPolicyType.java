// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Name of policy configuration
     * 
     */
    @EnumType
    public enum EarlyTerminationPolicyType {
        Bandit("Bandit"),
        MedianStopping("MedianStopping"),
        TruncationSelection("TruncationSelection");

        private final String value;

        EarlyTerminationPolicyType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "EarlyTerminationPolicyType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
