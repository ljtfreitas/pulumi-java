// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum NetworkPerformanceConfigExternalIpEgressBandwidthTier {
        Default("DEFAULT"),
        Tier1("TIER_1");

        private final String value;

        NetworkPerformanceConfigExternalIpEgressBandwidthTier(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "NetworkPerformanceConfigExternalIpEgressBandwidthTier[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
