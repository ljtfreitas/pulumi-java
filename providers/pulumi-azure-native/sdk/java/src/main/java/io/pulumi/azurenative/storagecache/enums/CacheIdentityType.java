// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagecache.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type of identity used for the cache
     * 
     */
    @EnumType
    public enum CacheIdentityType {
        SystemAssigned("SystemAssigned"),
        None("None");

        private final String value;

        CacheIdentityType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "CacheIdentityType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
