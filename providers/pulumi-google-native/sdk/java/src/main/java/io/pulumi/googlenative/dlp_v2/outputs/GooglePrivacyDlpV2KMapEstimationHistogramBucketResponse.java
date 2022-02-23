// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2KMapEstimationQuasiIdValuesResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GooglePrivacyDlpV2KMapEstimationHistogramBucketResponse {
    /**
     * Number of records within these anonymity bounds.
     * 
     */
    private final String bucketSize;
    /**
     * Total number of distinct quasi-identifier tuple values in this bucket.
     * 
     */
    private final String bucketValueCount;
    /**
     * Sample of quasi-identifier tuple values in this bucket. The total number of classes returned per bucket is capped at 20.
     * 
     */
    private final List<GooglePrivacyDlpV2KMapEstimationQuasiIdValuesResponse> bucketValues;
    /**
     * Always greater than or equal to min_anonymity.
     * 
     */
    private final String maxAnonymity;
    /**
     * Always positive.
     * 
     */
    private final String minAnonymity;

    @OutputCustomType.Constructor({"bucketSize","bucketValueCount","bucketValues","maxAnonymity","minAnonymity"})
    private GooglePrivacyDlpV2KMapEstimationHistogramBucketResponse(
        String bucketSize,
        String bucketValueCount,
        List<GooglePrivacyDlpV2KMapEstimationQuasiIdValuesResponse> bucketValues,
        String maxAnonymity,
        String minAnonymity) {
        this.bucketSize = Objects.requireNonNull(bucketSize);
        this.bucketValueCount = Objects.requireNonNull(bucketValueCount);
        this.bucketValues = Objects.requireNonNull(bucketValues);
        this.maxAnonymity = Objects.requireNonNull(maxAnonymity);
        this.minAnonymity = Objects.requireNonNull(minAnonymity);
    }

    /**
     * Number of records within these anonymity bounds.
     * 
     */
    public String getBucketSize() {
        return this.bucketSize;
    }
    /**
     * Total number of distinct quasi-identifier tuple values in this bucket.
     * 
     */
    public String getBucketValueCount() {
        return this.bucketValueCount;
    }
    /**
     * Sample of quasi-identifier tuple values in this bucket. The total number of classes returned per bucket is capped at 20.
     * 
     */
    public List<GooglePrivacyDlpV2KMapEstimationQuasiIdValuesResponse> getBucketValues() {
        return this.bucketValues;
    }
    /**
     * Always greater than or equal to min_anonymity.
     * 
     */
    public String getMaxAnonymity() {
        return this.maxAnonymity;
    }
    /**
     * Always positive.
     * 
     */
    public String getMinAnonymity() {
        return this.minAnonymity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2KMapEstimationHistogramBucketResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucketSize;
        private String bucketValueCount;
        private List<GooglePrivacyDlpV2KMapEstimationQuasiIdValuesResponse> bucketValues;
        private String maxAnonymity;
        private String minAnonymity;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2KMapEstimationHistogramBucketResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketSize = defaults.bucketSize;
    	      this.bucketValueCount = defaults.bucketValueCount;
    	      this.bucketValues = defaults.bucketValues;
    	      this.maxAnonymity = defaults.maxAnonymity;
    	      this.minAnonymity = defaults.minAnonymity;
        }

        public Builder setBucketSize(String bucketSize) {
            this.bucketSize = Objects.requireNonNull(bucketSize);
            return this;
        }

        public Builder setBucketValueCount(String bucketValueCount) {
            this.bucketValueCount = Objects.requireNonNull(bucketValueCount);
            return this;
        }

        public Builder setBucketValues(List<GooglePrivacyDlpV2KMapEstimationQuasiIdValuesResponse> bucketValues) {
            this.bucketValues = Objects.requireNonNull(bucketValues);
            return this;
        }

        public Builder setMaxAnonymity(String maxAnonymity) {
            this.maxAnonymity = Objects.requireNonNull(maxAnonymity);
            return this;
        }

        public Builder setMinAnonymity(String minAnonymity) {
            this.minAnonymity = Objects.requireNonNull(minAnonymity);
            return this;
        }
        public GooglePrivacyDlpV2KMapEstimationHistogramBucketResponse build() {
            return new GooglePrivacyDlpV2KMapEstimationHistogramBucketResponse(bucketSize, bucketValueCount, bucketValues, maxAnonymity, minAnonymity);
        }
    }
}
