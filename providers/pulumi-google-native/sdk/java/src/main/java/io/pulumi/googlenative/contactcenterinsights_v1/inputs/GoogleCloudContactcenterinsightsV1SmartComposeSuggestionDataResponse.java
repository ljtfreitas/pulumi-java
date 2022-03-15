// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Agent Assist Smart Compose suggestion data.
 * 
 */
public final class GoogleCloudContactcenterinsightsV1SmartComposeSuggestionDataResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudContactcenterinsightsV1SmartComposeSuggestionDataResponse Empty = new GoogleCloudContactcenterinsightsV1SmartComposeSuggestionDataResponse();

    /**
     * The system's confidence score that this suggestion is a good match for this conversation, ranging from 0.0 (completely uncertain) to 1.0 (completely certain).
     * 
     */
    @Import(name="confidenceScore", required=true)
      private final Double confidenceScore;

    public Double getConfidenceScore() {
        return this.confidenceScore;
    }

    /**
     * Map that contains metadata about the Smart Compose suggestion and the document from which it originates.
     * 
     */
    @Import(name="metadata", required=true)
      private final Map<String,String> metadata;

    public Map<String,String> getMetadata() {
        return this.metadata;
    }

    /**
     * Name of the query record. Format: projects/{project}/locations/{location}/queryRecords/{query_record}
     * 
     */
    @Import(name="queryRecord", required=true)
      private final String queryRecord;

    public String getQueryRecord() {
        return this.queryRecord;
    }

    /**
     * The content of the suggestion.
     * 
     */
    @Import(name="suggestion", required=true)
      private final String suggestion;

    public String getSuggestion() {
        return this.suggestion;
    }

    public GoogleCloudContactcenterinsightsV1SmartComposeSuggestionDataResponse(
        Double confidenceScore,
        Map<String,String> metadata,
        String queryRecord,
        String suggestion) {
        this.confidenceScore = Objects.requireNonNull(confidenceScore, "expected parameter 'confidenceScore' to be non-null");
        this.metadata = Objects.requireNonNull(metadata, "expected parameter 'metadata' to be non-null");
        this.queryRecord = Objects.requireNonNull(queryRecord, "expected parameter 'queryRecord' to be non-null");
        this.suggestion = Objects.requireNonNull(suggestion, "expected parameter 'suggestion' to be non-null");
    }

    private GoogleCloudContactcenterinsightsV1SmartComposeSuggestionDataResponse() {
        this.confidenceScore = null;
        this.metadata = Map.of();
        this.queryRecord = null;
        this.suggestion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1SmartComposeSuggestionDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double confidenceScore;
        private Map<String,String> metadata;
        private String queryRecord;
        private String suggestion;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1SmartComposeSuggestionDataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.confidenceScore = defaults.confidenceScore;
    	      this.metadata = defaults.metadata;
    	      this.queryRecord = defaults.queryRecord;
    	      this.suggestion = defaults.suggestion;
        }

        public Builder confidenceScore(Double confidenceScore) {
            this.confidenceScore = Objects.requireNonNull(confidenceScore);
            return this;
        }

        public Builder metadata(Map<String,String> metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }

        public Builder queryRecord(String queryRecord) {
            this.queryRecord = Objects.requireNonNull(queryRecord);
            return this;
        }

        public Builder suggestion(String suggestion) {
            this.suggestion = Objects.requireNonNull(suggestion);
            return this;
        }
        public GoogleCloudContactcenterinsightsV1SmartComposeSuggestionDataResponse build() {
            return new GoogleCloudContactcenterinsightsV1SmartComposeSuggestionDataResponse(confidenceScore, metadata, queryRecord, suggestion);
        }
    }
}
