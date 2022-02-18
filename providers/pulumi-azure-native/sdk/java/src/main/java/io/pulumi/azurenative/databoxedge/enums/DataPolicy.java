// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Data policy of the storage Account.
     * 
     */
    @EnumType
    public enum DataPolicy {
        Cloud("Cloud"),
        Local("Local");

        private final String value;

        DataPolicy(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DataPolicy[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
