// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum ContainerType {
        /**
         * A Docker compatible container technology will be used to launch the containers.
         * 
         */
        DockerCompatible("DockerCompatible");

        private final String value;

        ContainerType(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ContainerType[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
