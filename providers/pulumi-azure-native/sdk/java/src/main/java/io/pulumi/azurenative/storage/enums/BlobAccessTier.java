// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The access tier of a storage blob.
     * 
     */
    @EnumType
    public enum BlobAccessTier {
        /**
         * Optimized for storing data that is accessed frequently.
         * 
         */
        Hot("Hot"),
        /**
         * Optimized for storing data that is infrequently accessed and stored for at least 30 days.
         * 
         */
        Cool("Cool"),
        /**
         * Optimized for storing data that is rarely accessed and stored for at least 180 days with flexible latency requirements, on the order of hours.
         * 
         */
        Archive("Archive");

        private final String value;

        BlobAccessTier(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "BlobAccessTier[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
