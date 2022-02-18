// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The permissions assigned to the shared access policy.
     * 
     */
    @EnumType
    public enum AccessRights {
        RegistryRead("RegistryRead"),
        RegistryWrite("RegistryWrite"),
        ServiceConnect("ServiceConnect"),
        DeviceConnect("DeviceConnect"),
        RegistryRead_RegistryWrite("RegistryRead, RegistryWrite"),
        RegistryRead_ServiceConnect("RegistryRead, ServiceConnect"),
        RegistryRead_DeviceConnect("RegistryRead, DeviceConnect"),
        RegistryWrite_ServiceConnect("RegistryWrite, ServiceConnect"),
        RegistryWrite_DeviceConnect("RegistryWrite, DeviceConnect"),
        ServiceConnect_DeviceConnect("ServiceConnect, DeviceConnect"),
        RegistryRead_RegistryWrite_ServiceConnect("RegistryRead, RegistryWrite, ServiceConnect"),
        RegistryRead_RegistryWrite_DeviceConnect("RegistryRead, RegistryWrite, DeviceConnect"),
        RegistryRead_ServiceConnect_DeviceConnect("RegistryRead, ServiceConnect, DeviceConnect"),
        RegistryWrite_ServiceConnect_DeviceConnect("RegistryWrite, ServiceConnect, DeviceConnect"),
        RegistryRead_RegistryWrite_ServiceConnect_DeviceConnect("RegistryRead, RegistryWrite, ServiceConnect, DeviceConnect");

        private final String value;

        AccessRights(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "AccessRights[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
