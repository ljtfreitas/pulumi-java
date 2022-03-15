// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2LDiversityEquivalenceClassResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Histogram of l-diversity equivalence class sensitive value frequencies.
 * 
 */
public final class GooglePrivacyDlpV2LDiversityHistogramBucketResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2LDiversityHistogramBucketResponse Empty = new GooglePrivacyDlpV2LDiversityHistogramBucketResponse();

    /**
     * Total number of equivalence classes in this bucket.
     * 
     */
    @Import(name="bucketSize", required=true)
      private final String bucketSize;

    public String getBucketSize() {
        return this.bucketSize;
    }

    /**
     * Total number of distinct equivalence classes in this bucket.
     * 
     */
    @Import(name="bucketValueCount", required=true)
      private final String bucketValueCount;

    public String getBucketValueCount() {
        return this.bucketValueCount;
    }

    /**
     * Sample of equivalence classes in this bucket. The total number of classes returned per bucket is capped at 20.
     * 
     */
    @Import(name="bucketValues", required=true)
      private final List<GooglePrivacyDlpV2LDiversityEquivalenceClassResponse> bucketValues;

    public List<GooglePrivacyDlpV2LDiversityEquivalenceClassResponse> getBucketValues() {
        return this.bucketValues;
    }

    /**
     * Lower bound on the sensitive value frequencies of the equivalence classes in this bucket.
     * 
     */
    @Import(name="sensitiveValueFrequencyLowerBound", required=true)
      private final String sensitiveValueFrequencyLowerBound;

    public String getSensitiveValueFrequencyLowerBound() {
        return this.sensitiveValueFrequencyLowerBound;
    }

    /**
     * Upper bound on the sensitive value frequencies of the equivalence classes in this bucket.
     * 
     */
    @Import(name="sensitiveValueFrequencyUpperBound", required=true)
      private final String sensitiveValueFrequencyUpperBound;

    public String getSensitiveValueFrequencyUpperBound() {
        return this.sensitiveValueFrequencyUpperBound;
    }

    public GooglePrivacyDlpV2LDiversityHistogramBucketResponse(
        String bucketSize,
        String bucketValueCount,
        List<GooglePrivacyDlpV2LDiversityEquivalenceClassResponse> bucketValues,
        String sensitiveValueFrequencyLowerBound,
        String sensitiveValueFrequencyUpperBound) {
        this.bucketSize = Objects.requireNonNull(bucketSize, "expected parameter 'bucketSize' to be non-null");
        this.bucketValueCount = Objects.requireNonNull(bucketValueCount, "expected parameter 'bucketValueCount' to be non-null");
        this.bucketValues = Objects.requireNonNull(bucketValues, "expected parameter 'bucketValues' to be non-null");
        this.sensitiveValueFrequencyLowerBound = Objects.requireNonNull(sensitiveValueFrequencyLowerBound, "expected parameter 'sensitiveValueFrequencyLowerBound' to be non-null");
        this.sensitiveValueFrequencyUpperBound = Objects.requireNonNull(sensitiveValueFrequencyUpperBound, "expected parameter 'sensitiveValueFrequencyUpperBound' to be non-null");
    }

    private GooglePrivacyDlpV2LDiversityHistogramBucketResponse() {
        this.bucketSize = null;
        this.bucketValueCount = null;
        this.bucketValues = List.of();
        this.sensitiveValueFrequencyLowerBound = null;
        this.sensitiveValueFrequencyUpperBound = null;
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

        public Builder bucketSize(String bucketSize) {
            this.bucketSize = Objects.requireNonNull(bucketSize);
            return this;
        }

        public Builder bucketValueCount(String bucketValueCount) {
            this.bucketValueCount = Objects.requireNonNull(bucketValueCount);
            return this;
        }

        public Builder bucketValues(List<GooglePrivacyDlpV2LDiversityEquivalenceClassResponse> bucketValues) {
            this.bucketValues = Objects.requireNonNull(bucketValues);
            return this;
        }

        public Builder sensitiveValueFrequencyLowerBound(String sensitiveValueFrequencyLowerBound) {
            this.sensitiveValueFrequencyLowerBound = Objects.requireNonNull(sensitiveValueFrequencyLowerBound);
            return this;
        }

        public Builder sensitiveValueFrequencyUpperBound(String sensitiveValueFrequencyUpperBound) {
            this.sensitiveValueFrequencyUpperBound = Objects.requireNonNull(sensitiveValueFrequencyUpperBound);
            return this;
        }
        public GooglePrivacyDlpV2LDiversityHistogramBucketResponse build() {
            return new GooglePrivacyDlpV2LDiversityHistogramBucketResponse(bucketSize, bucketValueCount, bucketValues, sensitiveValueFrequencyLowerBound, sensitiveValueFrequencyUpperBound);
        }
    }
}
