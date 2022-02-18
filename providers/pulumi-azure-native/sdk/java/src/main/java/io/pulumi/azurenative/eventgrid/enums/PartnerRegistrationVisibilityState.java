// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Visibility state of the partner registration.
     * 
     */
    @EnumType
    public enum PartnerRegistrationVisibilityState {
        Hidden("Hidden"),
        PublicPreview("PublicPreview"),
        GenerallyAvailable("GenerallyAvailable");

        private final String value;

        PartnerRegistrationVisibilityState(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "PartnerRegistrationVisibilityState[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
