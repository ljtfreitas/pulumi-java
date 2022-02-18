// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Type of the key source.
     * 
     */
    @EnumType
    public enum KeySource {
        /**
         * Batch creates and manages the encryption keys used to protect the account data.
         * 
         */
        Microsoft_Batch("Microsoft.Batch"),
        /**
         * The encryption keys used to protect the account data are stored in an external key vault. If this is set then the Batch Account identity must be set to `SystemAssigned` and a valid Key Identifier must also be supplied under the keyVaultProperties.
         * 
         */
        Microsoft_KeyVault("Microsoft.KeyVault");

        private final String value;

        KeySource(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "KeySource[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
