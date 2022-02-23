// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2ValueFrequencyResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GooglePrivacyDlpV2CategoricalStatsHistogramBucketResponse {
    /**
     * Total number of values in this bucket.
     * 
     */
    private final String bucketSize;
    /**
     * Total number of distinct values in this bucket.
     * 
     */
    private final String bucketValueCount;
    /**
     * Sample of value frequencies in this bucket. The total number of values returned per bucket is capped at 20.
     * 
     */
    private final List<GooglePrivacyDlpV2ValueFrequencyResponse> bucketValues;
    /**
     * Lower bound on the value frequency of the values in this bucket.
     * 
     */
    private final String valueFrequencyLowerBound;
    /**
     * Upper bound on the value frequency of the values in this bucket.
     * 
     */
    private final String valueFrequencyUpperBound;

    @OutputCustomType.Constructor({"bucketSize","bucketValueCount","bucketValues","valueFrequencyLowerBound","valueFrequencyUpperBound"})
    private GooglePrivacyDlpV2CategoricalStatsHistogramBucketResponse(
        String bucketSize,
        String bucketValueCount,
        List<GooglePrivacyDlpV2ValueFrequencyResponse> bucketValues,
        String valueFrequencyLowerBound,
        String valueFrequencyUpperBound) {
        this.bucketSize = Objects.requireNonNull(bucketSize);
        this.bucketValueCount = Objects.requireNonNull(bucketValueCount);
        this.bucketValues = Objects.requireNonNull(bucketValues);
        this.valueFrequencyLowerBound = Objects.requireNonNull(valueFrequencyLowerBound);
        this.valueFrequencyUpperBound = Objects.requireNonNull(valueFrequencyUpperBound);
    }

    /**
     * Total number of values in this bucket.
     * 
     */
    public String getBucketSize() {
        return this.bucketSize;
    }
    /**
     * Total number of distinct values in this bucket.
     * 
     */
    public String getBucketValueCount() {
        return this.bucketValueCount;
    }
    /**
     * Sample of value frequencies in this bucket. The total number of values returned per bucket is capped at 20.
     * 
     */
    public List<GooglePrivacyDlpV2ValueFrequencyResponse> getBucketValues() {
        return this.bucketValues;
    }
    /**
     * Lower bound on the value frequency of the values in this bucket.
     * 
     */
    public String getValueFrequencyLowerBound() {
        return this.valueFrequencyLowerBound;
    }
    /**
     * Upper bound on the value frequency of the values in this bucket.
     * 
     */
    public String getValueFrequencyUpperBound() {
        return this.valueFrequencyUpperBound;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2CategoricalStatsHistogramBucketResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucketSize;
        private String bucketValueCount;
        private List<GooglePrivacyDlpV2ValueFrequencyResponse> bucketValues;
        private String valueFrequencyLowerBound;
        private String valueFrequencyUpperBound;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2CategoricalStatsHistogramBucketResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketSize = defaults.bucketSize;
    	      this.bucketValueCount = defaults.bucketValueCount;
    	      this.bucketValues = defaults.bucketValues;
    	      this.valueFrequencyLowerBound = defaults.valueFrequencyLowerBound;
    	      this.valueFrequencyUpperBound = defaults.valueFrequencyUpperBound;
        }

        public Builder setBucketSize(String bucketSize) {
            this.bucketSize = Objects.requireNonNull(bucketSize);
            return this;
        }

        public Builder setBucketValueCount(String bucketValueCount) {
            this.bucketValueCount = Objects.requireNonNull(bucketValueCount);
            return this;
        }

        public Builder setBucketValues(List<GooglePrivacyDlpV2ValueFrequencyResponse> bucketValues) {
            this.bucketValues = Objects.requireNonNull(bucketValues);
            return this;
        }

        public Builder setValueFrequencyLowerBound(String valueFrequencyLowerBound) {
            this.valueFrequencyLowerBound = Objects.requireNonNull(valueFrequencyLowerBound);
            return this;
        }

        public Builder setValueFrequencyUpperBound(String valueFrequencyUpperBound) {
            this.valueFrequencyUpperBound = Objects.requireNonNull(valueFrequencyUpperBound);
            return this;
        }
        public GooglePrivacyDlpV2CategoricalStatsHistogramBucketResponse build() {
            return new GooglePrivacyDlpV2CategoricalStatsHistogramBucketResponse(bucketSize, bucketValueCount, bucketValues, valueFrequencyLowerBound, valueFrequencyUpperBound);
        }
    }
}
