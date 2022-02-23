// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2LDiversityEquivalenceClassResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GooglePrivacyDlpV2LDiversityHistogramBucketResponse {
    /**
     * Total number of equivalence classes in this bucket.
     * 
     */
    private final String bucketSize;
    /**
     * Total number of distinct equivalence classes in this bucket.
     * 
     */
    private final String bucketValueCount;
    /**
     * Sample of equivalence classes in this bucket. The total number of classes returned per bucket is capped at 20.
     * 
     */
    private final List<GooglePrivacyDlpV2LDiversityEquivalenceClassResponse> bucketValues;
    /**
     * Lower bound on the sensitive value frequencies of the equivalence classes in this bucket.
     * 
     */
    private final String sensitiveValueFrequencyLowerBound;
    /**
     * Upper bound on the sensitive value frequencies of the equivalence classes in this bucket.
     * 
     */
    private final String sensitiveValueFrequencyUpperBound;

    @OutputCustomType.Constructor({"bucketSize","bucketValueCount","bucketValues","sensitiveValueFrequencyLowerBound","sensitiveValueFrequencyUpperBound"})
    private GooglePrivacyDlpV2LDiversityHistogramBucketResponse(
        String bucketSize,
        String bucketValueCount,
        List<GooglePrivacyDlpV2LDiversityEquivalenceClassResponse> bucketValues,
        String sensitiveValueFrequencyLowerBound,
        String sensitiveValueFrequencyUpperBound) {
        this.bucketSize = Objects.requireNonNull(bucketSize);
        this.bucketValueCount = Objects.requireNonNull(bucketValueCount);
        this.bucketValues = Objects.requireNonNull(bucketValues);
        this.sensitiveValueFrequencyLowerBound = Objects.requireNonNull(sensitiveValueFrequencyLowerBound);
        this.sensitiveValueFrequencyUpperBound = Objects.requireNonNull(sensitiveValueFrequencyUpperBound);
    }

    /**
     * Total number of equivalence classes in this bucket.
     * 
     */
    public String getBucketSize() {
        return this.bucketSize;
    }
    /**
     * Total number of distinct equivalence classes in this bucket.
     * 
     */
    public String getBucketValueCount() {
        return this.bucketValueCount;
    }
    /**
     * Sample of equivalence classes in this bucket. The total number of classes returned per bucket is capped at 20.
     * 
     */
    public List<GooglePrivacyDlpV2LDiversityEquivalenceClassResponse> getBucketValues() {
        return this.bucketValues;
    }
    /**
     * Lower bound on the sensitive value frequencies of the equivalence classes in this bucket.
     * 
     */
    public String getSensitiveValueFrequencyLowerBound() {
        return this.sensitiveValueFrequencyLowerBound;
    }
    /**
     * Upper bound on the sensitive value frequencies of the equivalence classes in this bucket.
     * 
     */
    public String getSensitiveValueFrequencyUpperBound() {
        return this.sensitiveValueFrequencyUpperBound;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2LDiversityHistogramBucketResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucketSize;
        private String bucketValueCount;
        private List<GooglePrivacyDlpV2LDiversityEquivalenceClassResponse> bucketValues;
        private String sensitiveValueFrequencyLowerBound;
        private String sensitiveValueFrequencyUpperBound;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2LDiversityHistogramBucketResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketSize = defaults.bucketSize;
    	      this.bucketValueCount = defaults.bucketValueCount;
    	      this.bucketValues = defaults.bucketValues;
    	      this.sensitiveValueFrequencyLowerBound = defaults.sensitiveValueFrequencyLowerBound;
    	      this.sensitiveValueFrequencyUpperBound = defaults.sensitiveValueFrequencyUpperBound;
        }

        public Builder setBucketSize(String bucketSize) {
            this.bucketSize = Objects.requireNonNull(bucketSize);
            return this;
        }

        public Builder setBucketValueCount(String bucketValueCount) {
            this.bucketValueCount = Objects.requireNonNull(bucketValueCount);
            return this;
        }

        public Builder setBucketValues(List<GooglePrivacyDlpV2LDiversityEquivalenceClassResponse> bucketValues) {
            this.bucketValues = Objects.requireNonNull(bucketValues);
            return this;
        }

        public Builder setSensitiveValueFrequencyLowerBound(String sensitiveValueFrequencyLowerBound) {
            this.sensitiveValueFrequencyLowerBound = Objects.requireNonNull(sensitiveValueFrequencyLowerBound);
            return this;
        }

        public Builder setSensitiveValueFrequencyUpperBound(String sensitiveValueFrequencyUpperBound) {
            this.sensitiveValueFrequencyUpperBound = Objects.requireNonNull(sensitiveValueFrequencyUpperBound);
            return this;
        }
        public GooglePrivacyDlpV2LDiversityHistogramBucketResponse build() {
            return new GooglePrivacyDlpV2LDiversityHistogramBucketResponse(bucketSize, bucketValueCount, bucketValues, sensitiveValueFrequencyLowerBound, sensitiveValueFrequencyUpperBound);
        }
    }
}
