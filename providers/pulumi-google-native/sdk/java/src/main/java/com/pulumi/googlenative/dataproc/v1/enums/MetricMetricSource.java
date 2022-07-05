// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc.v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Required. Default metrics are collected unless metricOverrides are specified for the metric source (see Available OSS metrics (https://cloud.google.com/dataproc/docs/guides/monitoring#available_oss_metrics) for more information).
     * 
     */
    @EnumType
    public enum MetricMetricSource {
        /**
         * Required unspecified metric source.
         * 
         */
        MetricSourceUnspecified("METRIC_SOURCE_UNSPECIFIED"),
        /**
         * Default monitoring agent metrics. If this source is enabled, Dataproc enables the monitoring agent in Compute Engine, and collects default monitoring agent metrics, which are published with an agent.googleapis.com prefix.
         * 
         */
        MonitoringAgentDefaults("MONITORING_AGENT_DEFAULTS"),
        /**
         * HDFS metric source.
         * 
         */
        Hdfs("HDFS"),
        /**
         * Spark metric source.
         * 
         */
        Spark("SPARK"),
        /**
         * YARN metric source.
         * 
         */
        Yarn("YARN"),
        /**
         * Spark History Server metric source.
         * 
         */
        SparkHistoryServer("SPARK_HISTORY_SERVER"),
        /**
         * Hiveserver2 metric source.
         * 
         */
        Hiveserver2("HIVESERVER2");

        private final String value;

        MetricMetricSource(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "MetricMetricSource[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
