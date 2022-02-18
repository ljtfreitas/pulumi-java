// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The authentication type to be used to connect to the FTP server.
     * 
     */
    @EnumType
    public enum FtpAuthenticationType {
        Basic("Basic"),
        Anonymous("Anonymous");

        private final String value;

        FtpAuthenticationType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "FtpAuthenticationType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
