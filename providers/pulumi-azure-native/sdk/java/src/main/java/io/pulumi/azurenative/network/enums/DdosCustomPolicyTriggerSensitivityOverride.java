// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The customized DDoS protection trigger rate sensitivity degrees. High: Trigger rate set with most sensitivity w.r.t. normal traffic. Default: Trigger rate set with moderate sensitivity w.r.t. normal traffic. Low: Trigger rate set with less sensitivity w.r.t. normal traffic. Relaxed: Trigger rate set with least sensitivity w.r.t. normal traffic.
     * 
     */
    @EnumType
    public enum DdosCustomPolicyTriggerSensitivityOverride {
        Relaxed("Relaxed"),
        Low("Low"),
        Default("Default"),
        High("High");

        private final String value;

        DdosCustomPolicyTriggerSensitivityOverride(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DdosCustomPolicyTriggerSensitivityOverride[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
