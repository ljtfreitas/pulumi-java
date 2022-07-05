// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.tpu.v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The health status of the TPU node.
     * 
     */
    @EnumType
    public enum NodeHealth {
        /**
         * Health status is unknown: not initialized or failed to retrieve.
         * 
         */
        HealthUnspecified("HEALTH_UNSPECIFIED"),
        /**
         * The resource is healthy.
         * 
         */
        Healthy("HEALTHY"),
        /**
         * The resource is unhealthy.
         * 
         */
        DeprecatedUnhealthy("DEPRECATED_UNHEALTHY"),
        /**
         * The resource is unresponsive.
         * 
         */
        Timeout("TIMEOUT"),
        /**
         * The in-guest ML stack is unhealthy.
         * 
         */
        UnhealthyTensorflow("UNHEALTHY_TENSORFLOW"),
        /**
         * The node is under maintenance/priority boost caused rescheduling and will resume running once rescheduled.
         * 
         */
        UnhealthyMaintenance("UNHEALTHY_MAINTENANCE");

        private final String value;

        NodeHealth(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "NodeHealth[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
