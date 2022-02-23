// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudContactcenterinsightsV1ArticleSuggestionDataResponse {
    /**
     * The system's confidence score that this article is a good match for this conversation, ranging from 0.0 (completely uncertain) to 1.0 (completely certain).
     * 
     */
    private final Double confidenceScore;
    /**
     * Map that contains metadata about the Article Suggestion and the document that it originates from.
     * 
     */
    private final Map<String,String> metadata;
    /**
     * Name of the query record. Format: projects/{project}/locations/{location}/queryRecords/{query_record}
     * 
     */
    private final String queryRecord;
    /**
     * The knowledge document that this answer was extracted from. Format: projects/{project}/knowledgeBases/{knowledge_base}/documents/{document}
     * 
     */
    private final String source;
    /**
     * Article title.
     * 
     */
    private final String title;
    /**
     * Article URI.
     * 
     */
    private final String uri;

    @OutputCustomType.Constructor({"confidenceScore","metadata","queryRecord","source","title","uri"})
    private GoogleCloudContactcenterinsightsV1ArticleSuggestionDataResponse(
        Double confidenceScore,
        Map<String,String> metadata,
        String queryRecord,
        String source,
        String title,
        String uri) {
        this.confidenceScore = Objects.requireNonNull(confidenceScore);
        this.metadata = Objects.requireNonNull(metadata);
        this.queryRecord = Objects.requireNonNull(queryRecord);
        this.source = Objects.requireNonNull(source);
        this.title = Objects.requireNonNull(title);
        this.uri = Objects.requireNonNull(uri);
    }

    /**
     * The system's confidence score that this article is a good match for this conversation, ranging from 0.0 (completely uncertain) to 1.0 (completely certain).
     * 
     */
    public Double getConfidenceScore() {
        return this.confidenceScore;
    }
    /**
     * Map that contains metadata about the Article Suggestion and the document that it originates from.
     * 
     */
    public Map<String,String> getMetadata() {
        return this.metadata;
    }
    /**
     * Name of the query record. Format: projects/{project}/locations/{location}/queryRecords/{query_record}
     * 
     */
    public String getQueryRecord() {
        return this.queryRecord;
    }
    /**
     * The knowledge document that this answer was extracted from. Format: projects/{project}/knowledgeBases/{knowledge_base}/documents/{document}
     * 
     */
    public String getSource() {
        return this.source;
    }
    /**
     * Article title.
     * 
     */
    public String getTitle() {
        return this.title;
    }
    /**
     * Article URI.
     * 
     */
    public String getUri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1ArticleSuggestionDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double confidenceScore;
        private Map<String,String> metadata;
        private String queryRecord;
        private String source;
        private String title;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1ArticleSuggestionDataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.confidenceScore = defaults.confidenceScore;
    	      this.metadata = defaults.metadata;
    	      this.queryRecord = defaults.queryRecord;
    	      this.source = defaults.source;
    	      this.title = defaults.title;
    	      this.uri = defaults.uri;
        }

        public Builder setConfidenceScore(Double confidenceScore) {
            this.confidenceScore = Objects.requireNonNull(confidenceScore);
            return this;
        }

        public Builder setMetadata(Map<String,String> metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }

        public Builder setQueryRecord(String queryRecord) {
            this.queryRecord = Objects.requireNonNull(queryRecord);
            return this;
        }

        public Builder setSource(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder setTitle(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }

        public Builder setUri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }
        public GoogleCloudContactcenterinsightsV1ArticleSuggestionDataResponse build() {
            return new GoogleCloudContactcenterinsightsV1ArticleSuggestionDataResponse(confidenceScore, metadata, queryRecord, source, title, uri);
        }
    }
}
