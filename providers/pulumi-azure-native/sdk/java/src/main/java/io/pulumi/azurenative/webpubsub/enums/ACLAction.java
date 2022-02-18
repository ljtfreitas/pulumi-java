// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.webpubsub.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Default action when no other rule matches
     * 
     */
    @EnumType
    public enum ACLAction {
        Allow("Allow"),
        Deny("Deny");

        private final String value;

        ACLAction(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ACLAction[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
