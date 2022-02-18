// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagecache.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * ARM provisioning state, see https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/Addendum.md#provisioningstate-property
     * 
     */
    @EnumType
    public enum ProvisioningStateType {
        Succeeded("Succeeded"),
        Failed("Failed"),
        Cancelled("Cancelled"),
        Creating("Creating"),
        Deleting("Deleting"),
        Updating("Updating");

        private final String value;

        ProvisioningStateType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ProvisioningStateType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
