// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MetricDescriptorMetadataResponse {
    /**
     * The delay of data points caused by ingestion. Data points older than this age are guaranteed to be ingested and available to be read, excluding data loss due to errors.
     * 
     */
    private final String ingestDelay;
    /**
     * The sampling period of metric data points. For metrics which are written periodically, consecutive data points are stored at this time interval, excluding data loss due to errors. Metrics with a higher granularity have a smaller sampling period.
     * 
     */
    private final String samplePeriod;

    @CustomType.Constructor
    private MetricDescriptorMetadataResponse(
        @CustomType.Parameter("ingestDelay") String ingestDelay,
        @CustomType.Parameter("samplePeriod") String samplePeriod) {
        this.ingestDelay = ingestDelay;
        this.samplePeriod = samplePeriod;
    }

    /**
     * The delay of data points caused by ingestion. Data points older than this age are guaranteed to be ingested and available to be read, excluding data loss due to errors.
     * 
    */
    public String getIngestDelay() {
        return this.ingestDelay;
    }
    /**
     * The sampling period of metric data points. For metrics which are written periodically, consecutive data points are stored at this time interval, excluding data loss due to errors. Metrics with a higher granularity have a smaller sampling period.
     * 
    */
    public String getSamplePeriod() {
        return this.samplePeriod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricDescriptorMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ingestDelay;
        private String samplePeriod;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricDescriptorMetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ingestDelay = defaults.ingestDelay;
    	      this.samplePeriod = defaults.samplePeriod;
        }

        public Builder ingestDelay(String ingestDelay) {
            this.ingestDelay = Objects.requireNonNull(ingestDelay);
            return this;
        }

        public Builder samplePeriod(String samplePeriod) {
            this.samplePeriod = Objects.requireNonNull(samplePeriod);
            return this;
        }
        public MetricDescriptorMetadataResponse build() {
            return new MetricDescriptorMetadataResponse(ingestDelay, samplePeriod);
        }
    }
}
