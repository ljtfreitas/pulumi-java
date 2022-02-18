// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Identity Provider Type identifier.
     * 
     */
    @EnumType
    public enum IdentityProviderType {
        /**
         * Facebook as Identity provider.
         * 
         */
        Facebook("facebook"),
        /**
         * Google as Identity provider.
         * 
         */
        Google("google"),
        /**
         * Microsoft Live as Identity provider.
         * 
         */
        Microsoft("microsoft"),
        /**
         * Twitter as Identity provider.
         * 
         */
        Twitter("twitter"),
        /**
         * Azure Active Directory as Identity provider.
         * 
         */
        Aad("aad"),
        /**
         * Azure Active Directory B2C as Identity provider.
         * 
         */
        AadB2C("aadB2C");

        private final String value;

        IdentityProviderType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "IdentityProviderType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
