// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cache.enums;

import io.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Clustering policy - default is OSSCluster. Specified at create time.
     * 
     */
    @EnumType
    public enum ClusteringPolicy {
        EnterpriseCluster("EnterpriseCluster"),
        OSSCluster("OSSCluster");

        private final String value;

        ClusteringPolicy(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "ClusteringPolicy[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
