// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudContactcenterinsightsV1SmartReplyDataResponse {
    /**
     * The system's confidence score that this reply is a good match for this conversation, ranging from 0.0 (completely uncertain) to 1.0 (completely certain).
     * 
     */
    private final Double confidenceScore;
    /**
     * Map that contains metadata about the Smart Reply and the document from which it originates.
     * 
     */
    private final Map<String,String> metadata;
    /**
     * Name of the query record. Format: projects/{project}/locations/{location}/queryRecords/{query_record}
     * 
     */
    private final String queryRecord;
    /**
     * The content of the reply.
     * 
     */
    private final String reply;

    @OutputCustomType.Constructor({"confidenceScore","metadata","queryRecord","reply"})
    private GoogleCloudContactcenterinsightsV1SmartReplyDataResponse(
        Double confidenceScore,
        Map<String,String> metadata,
        String queryRecord,
        String reply) {
        this.confidenceScore = Objects.requireNonNull(confidenceScore);
        this.metadata = Objects.requireNonNull(metadata);
        this.queryRecord = Objects.requireNonNull(queryRecord);
        this.reply = Objects.requireNonNull(reply);
    }

    /**
     * The system's confidence score that this reply is a good match for this conversation, ranging from 0.0 (completely uncertain) to 1.0 (completely certain).
     * 
     */
    public Double getConfidenceScore() {
        return this.confidenceScore;
    }
    /**
     * Map that contains metadata about the Smart Reply and the document from which it originates.
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
     * The content of the reply.
     * 
     */
    public String getReply() {
        return this.reply;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1SmartReplyDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double confidenceScore;
        private Map<String,String> metadata;
        private String queryRecord;
        private String reply;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1SmartReplyDataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.confidenceScore = defaults.confidenceScore;
    	      this.metadata = defaults.metadata;
    	      this.queryRecord = defaults.queryRecord;
    	      this.reply = defaults.reply;
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

        public Builder setReply(String reply) {
            this.reply = Objects.requireNonNull(reply);
            return this;
        }
        public GoogleCloudContactcenterinsightsV1SmartReplyDataResponse build() {
            return new GoogleCloudContactcenterinsightsV1SmartReplyDataResponse(confidenceScore, metadata, queryRecord, reply);
        }
    }
}
