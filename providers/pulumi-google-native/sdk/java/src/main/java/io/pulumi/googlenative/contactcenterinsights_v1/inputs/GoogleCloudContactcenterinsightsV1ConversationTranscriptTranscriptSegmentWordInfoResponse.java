// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Word-level info for words in a transcript.
 * 
 */
public final class GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentWordInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentWordInfoResponse Empty = new GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentWordInfoResponse();

    /**
     * A confidence estimate between 0.0 and 1.0 of the fidelity of this word. A default value of 0.0 indicates that the value is unset.
     * 
     */
    @Import(name="confidence", required=true)
      private final Double confidence;

    public Double getConfidence() {
        return this.confidence;
    }

    /**
     * Time offset of the end of this word relative to the beginning of the total conversation.
     * 
     */
    @Import(name="endOffset", required=true)
      private final String endOffset;

    public String getEndOffset() {
        return this.endOffset;
    }

    /**
     * Time offset of the start of this word relative to the beginning of the total conversation.
     * 
     */
    @Import(name="startOffset", required=true)
      private final String startOffset;

    public String getStartOffset() {
        return this.startOffset;
    }

    /**
     * The word itself. Includes punctuation marks that surround the word.
     * 
     */
    @Import(name="word", required=true)
      private final String word;

    public String getWord() {
        return this.word;
    }

    public GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentWordInfoResponse(
        Double confidence,
        String endOffset,
        String startOffset,
        String word) {
        this.confidence = Objects.requireNonNull(confidence, "expected parameter 'confidence' to be non-null");
        this.endOffset = Objects.requireNonNull(endOffset, "expected parameter 'endOffset' to be non-null");
        this.startOffset = Objects.requireNonNull(startOffset, "expected parameter 'startOffset' to be non-null");
        this.word = Objects.requireNonNull(word, "expected parameter 'word' to be non-null");
    }

    private GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentWordInfoResponse() {
        this.confidence = null;
        this.endOffset = null;
        this.startOffset = null;
        this.word = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentWordInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double confidence;
        private String endOffset;
        private String startOffset;
        private String word;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentWordInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.confidence = defaults.confidence;
    	      this.endOffset = defaults.endOffset;
    	      this.startOffset = defaults.startOffset;
    	      this.word = defaults.word;
        }

        public Builder confidence(Double confidence) {
            this.confidence = Objects.requireNonNull(confidence);
            return this;
        }

        public Builder endOffset(String endOffset) {
            this.endOffset = Objects.requireNonNull(endOffset);
            return this;
        }

        public Builder startOffset(String startOffset) {
            this.startOffset = Objects.requireNonNull(startOffset);
            return this;
        }

        public Builder word(String word) {
            this.word = Objects.requireNonNull(word);
            return this;
        }
        public GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentWordInfoResponse build() {
            return new GoogleCloudContactcenterinsightsV1ConversationTranscriptTranscriptSegmentWordInfoResponse(confidence, endOffset, startOffset, word);
        }
    }
}
