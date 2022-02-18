// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum WebhookAction {
        Push("push"),
        Delete("delete"),
        Quarantine("quarantine"),
        Chart_push("chart_push"),
        Chart_delete("chart_delete");

        private final String value;

        WebhookAction(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "WebhookAction[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
