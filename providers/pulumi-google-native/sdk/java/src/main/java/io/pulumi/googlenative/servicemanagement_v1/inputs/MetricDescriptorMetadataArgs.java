// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Additional annotations that can be used to guide the usage of a metric.
 * 
 */
public final class MetricDescriptorMetadataArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetricDescriptorMetadataArgs Empty = new MetricDescriptorMetadataArgs();

    /**
     * The delay of data points caused by ingestion. Data points older than this age are guaranteed to be ingested and available to be read, excluding data loss due to errors.
     * 
     */
    @InputImport(name="ingestDelay")
      private final @Nullable Input<String> ingestDelay;

    public Input<String> getIngestDelay() {
        return this.ingestDelay == null ? Input.empty() : this.ingestDelay;
    }

    /**
     * The sampling period of metric data points. For metrics which are written periodically, consecutive data points are stored at this time interval, excluding data loss due to errors. Metrics with a higher granularity have a smaller sampling period.
     * 
     */
    @InputImport(name="samplePeriod")
      private final @Nullable Input<String> samplePeriod;

    public Input<String> getSamplePeriod() {
        return this.samplePeriod == null ? Input.empty() : this.samplePeriod;
    }

    public MetricDescriptorMetadataArgs(
        @Nullable Input<String> ingestDelay,
        @Nullable Input<String> samplePeriod) {
        this.ingestDelay = ingestDelay;
        this.samplePeriod = samplePeriod;
    }

    private MetricDescriptorMetadataArgs() {
        this.ingestDelay = Input.empty();
        this.samplePeriod = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricDescriptorMetadataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> ingestDelay;
        private @Nullable Input<String> samplePeriod;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricDescriptorMetadataArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ingestDelay = defaults.ingestDelay;
    	      this.samplePeriod = defaults.samplePeriod;
        }

        public Builder setIngestDelay(@Nullable Input<String> ingestDelay) {
            this.ingestDelay = ingestDelay;
            return this;
        }

        public Builder setIngestDelay(@Nullable String ingestDelay) {
            this.ingestDelay = Input.ofNullable(ingestDelay);
            return this;
        }

        public Builder setSamplePeriod(@Nullable Input<String> samplePeriod) {
            this.samplePeriod = samplePeriod;
            return this;
        }

        public Builder setSamplePeriod(@Nullable String samplePeriod) {
            this.samplePeriod = Input.ofNullable(samplePeriod);
            return this;
        }
        public MetricDescriptorMetadataArgs build() {
            return new MetricDescriptorMetadataArgs(ingestDelay, samplePeriod);
        }
    }
}
