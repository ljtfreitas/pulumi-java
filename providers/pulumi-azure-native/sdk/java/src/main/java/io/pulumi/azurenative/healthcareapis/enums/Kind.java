// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.healthcareapis.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The kind of the service.
     * 
     */
    @EnumType
    public enum Kind {
        Fhir("fhir"),
        FhirStu3("fhir-Stu3"),
        FhirR4("fhir-R4");

        private final String value;

        Kind(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "Kind[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
