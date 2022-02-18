// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type of identity used for the cluster. The type 'SystemAssigned, UserAssigned' includes both an implicitly created identity and a set of user assigned identities.
     * 
     */
    @EnumType
    public enum ResourceIdentityType {
        SystemAssigned("SystemAssigned"),
        UserAssigned("UserAssigned"),
        SystemAssigned_UserAssigned("SystemAssigned, UserAssigned"),
        None("None");

        private final String value;

        ResourceIdentityType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ResourceIdentityType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
