// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Contains cluster daemon metrics, such as HDFS and YARN stats.Beta Feature: This report is available for testing purposes only. It may be changed before final release.
 * 
 */
public final class ClusterMetricsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ClusterMetricsResponse Empty = new ClusterMetricsResponse();

    /**
     * The HDFS metrics.
     * 
     */
    @InputImport(name="hdfsMetrics", required=true)
      private final Map<String,String> hdfsMetrics;

    public Map<String,String> getHdfsMetrics() {
        return this.hdfsMetrics;
    }

    /**
     * The YARN metrics.
     * 
     */
    @InputImport(name="yarnMetrics", required=true)
      private final Map<String,String> yarnMetrics;

    public Map<String,String> getYarnMetrics() {
        return this.yarnMetrics;
    }

    public ClusterMetricsResponse(
        Map<String,String> hdfsMetrics,
        Map<String,String> yarnMetrics) {
        this.hdfsMetrics = Objects.requireNonNull(hdfsMetrics, "expected parameter 'hdfsMetrics' to be non-null");
        this.yarnMetrics = Objects.requireNonNull(yarnMetrics, "expected parameter 'yarnMetrics' to be non-null");
    }

    private ClusterMetricsResponse() {
        this.hdfsMetrics = Map.of();
        this.yarnMetrics = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterMetricsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> hdfsMetrics;
        private Map<String,String> yarnMetrics;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterMetricsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hdfsMetrics = defaults.hdfsMetrics;
    	      this.yarnMetrics = defaults.yarnMetrics;
        }

        public Builder setHdfsMetrics(Map<String,String> hdfsMetrics) {
            this.hdfsMetrics = Objects.requireNonNull(hdfsMetrics);
            return this;
        }

        public Builder setYarnMetrics(Map<String,String> yarnMetrics) {
            this.yarnMetrics = Objects.requireNonNull(yarnMetrics);
            return this;
        }
        public ClusterMetricsResponse build() {
            return new ClusterMetricsResponse(hdfsMetrics, yarnMetrics);
        }
    }
}
