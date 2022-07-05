// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Specifies how port is selected for health checking, can be one of following values: USE_FIXED_PORT: The port number in port is used for health checking. USE_NAMED_PORT: The portName is used for health checking. USE_SERVING_PORT: For NetworkEndpointGroup, the port specified for each network endpoint is used for health checking. For other backends, the port or named port specified in the Backend Service is used for health checking. If not specified, gRPC health check follows behavior specified in port and portName fields.
     * 
     */
    @EnumType
    public enum GRPCHealthCheckPortSpecification {
        /**
         * The port number in port is used for health checking.
         * 
         */
        UseFixedPort("USE_FIXED_PORT"),
        /**
         * The portName is used for health checking.
         * 
         */
        UseNamedPort("USE_NAMED_PORT"),
        /**
         * For NetworkEndpointGroup, the port specified for each network endpoint is used for health checking. For other backends, the port or named port specified in the Backend Service is used for health checking.
         * 
         */
        UseServingPort("USE_SERVING_PORT");

        private final String value;

        GRPCHealthCheckPortSpecification(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GRPCHealthCheckPortSpecification[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
