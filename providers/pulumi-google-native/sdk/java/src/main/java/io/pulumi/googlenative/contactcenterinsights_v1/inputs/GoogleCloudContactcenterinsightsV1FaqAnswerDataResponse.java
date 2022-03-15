// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Agent Assist frequently-asked-question answer data.
 * 
 */
public final class GoogleCloudContactcenterinsightsV1FaqAnswerDataResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudContactcenterinsightsV1FaqAnswerDataResponse Empty = new GoogleCloudContactcenterinsightsV1FaqAnswerDataResponse();

    /**
     * The piece of text from the `source` knowledge base document.
     * 
     */
    @Import(name="answer", required=true)
      private final String answer;

    public String getAnswer() {
        return this.answer;
    }

    /**
     * The system's confidence score that this answer is a good match for this conversation, ranging from 0.0 (completely uncertain) to 1.0 (completely certain).
     * 
     */
    @Import(name="confidenceScore", required=true)
      private final Double confidenceScore;

    public Double getConfidenceScore() {
        return this.confidenceScore;
    }

    /**
     * Map that contains metadata about the FAQ answer and the document that it originates from.
     * 
     */
    @Import(name="metadata", required=true)
      private final Map<String,String> metadata;

    public Map<String,String> getMetadata() {
        return this.metadata;
    }

    /**
     * Name of the query record. Format: projects/{project}/locations/{location}/queryRecords/{query_record}.
     * 
     */
    @Import(name="queryRecord", required=true)
      private final String queryRecord;

    public String getQueryRecord() {
        return this.queryRecord;
    }

    /**
     * The corresponding FAQ question.
     * 
     */
    @Import(name="question", required=true)
      private final String question;

    public String getQuestion() {
        return this.question;
    }

    /**
     * The knowledge document that this answer was extracted from. Format: projects/{project}/knowledgeBases/{knowledge_base}/documents/{document}.
     * 
     */
    @Import(name="source", required=true)
      private final String source;

    public String getSource() {
        return this.source;
    }

    public GoogleCloudContactcenterinsightsV1FaqAnswerDataResponse(
        String answer,
        Double confidenceScore,
        Map<String,String> metadata,
        String queryRecord,
        String question,
        String source) {
        this.answer = Objects.requireNonNull(answer, "expected parameter 'answer' to be non-null");
        this.confidenceScore = Objects.requireNonNull(confidenceScore, "expected parameter 'confidenceScore' to be non-null");
        this.metadata = Objects.requireNonNull(metadata, "expected parameter 'metadata' to be non-null");
        this.queryRecord = Objects.requireNonNull(queryRecord, "expected parameter 'queryRecord' to be non-null");
        this.question = Objects.requireNonNull(question, "expected parameter 'question' to be non-null");
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
    }

    private GoogleCloudContactcenterinsightsV1FaqAnswerDataResponse() {
        this.answer = null;
        this.confidenceScore = null;
        this.metadata = Map.of();
        this.queryRecord = null;
        this.question = null;
        this.source = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1FaqAnswerDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String answer;
        private Double confidenceScore;
        private Map<String,String> metadata;
        private String queryRecord;
        private String question;
        private String source;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1FaqAnswerDataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.answer = defaults.answer;
    	      this.confidenceScore = defaults.confidenceScore;
    	      this.metadata = defaults.metadata;
    	      this.queryRecord = defaults.queryRecord;
    	      this.question = defaults.question;
    	      this.source = defaults.source;
        }

        public Builder answer(String answer) {
            this.answer = Objects.requireNonNull(answer);
            return this;
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

        public Builder question(String question) {
            this.question = Objects.requireNonNull(question);
            return this;
        }

        public Builder source(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public GoogleCloudContactcenterinsightsV1FaqAnswerDataResponse build() {
            return new GoogleCloudContactcenterinsightsV1FaqAnswerDataResponse(answer, confidenceScore, metadata, queryRecord, question, source);
        }
    }
}
