// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The compute type of the endpoint.
     * 
     */
    @EnumType
    public enum EndpointComputeType {
        Managed("Managed"),
        K8S("K8S"),
        AzureMLCompute("AzureMLCompute");

        private final String value;

        EndpointComputeType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "EndpointComputeType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
