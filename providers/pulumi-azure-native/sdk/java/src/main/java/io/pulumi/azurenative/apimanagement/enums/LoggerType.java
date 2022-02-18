// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Logger type.
     * 
     */
    @EnumType
    public enum LoggerType {
        /**
         * Azure Event Hub as log destination.
         * 
         */
        AzureEventHub("azureEventHub"),
        /**
         * Azure Application Insights as log destination.
         * 
         */
        ApplicationInsights("applicationInsights"),
        /**
         * Azure Monitor
         * 
         */
        AzureMonitor("azureMonitor");

        private final String value;

        LoggerType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "LoggerType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
