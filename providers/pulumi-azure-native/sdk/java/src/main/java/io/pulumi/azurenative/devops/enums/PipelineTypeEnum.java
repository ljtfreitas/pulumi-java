// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devops.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Specifies which CI/CD provider to use. Valid options are 'azurePipeline', 'githubWorkflow'.
     * 
     */
    @EnumType
    public enum PipelineTypeEnum {
        GithubWorkflow("githubWorkflow"),
        AzurePipeline("azurePipeline");

        private final String value;

        PipelineTypeEnum(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "PipelineTypeEnum[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
