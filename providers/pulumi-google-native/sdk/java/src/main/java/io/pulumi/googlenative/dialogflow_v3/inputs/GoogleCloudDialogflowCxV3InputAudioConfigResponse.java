// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Instructs the speech recognizer on how to process the audio content.
 * 
 */
public final class GoogleCloudDialogflowCxV3InputAudioConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3InputAudioConfigResponse Empty = new GoogleCloudDialogflowCxV3InputAudioConfigResponse();

    /**
     * Audio encoding of the audio content to process.
     * 
     */
    @InputImport(name="audioEncoding", required=true)
      private final String audioEncoding;

    public String getAudioEncoding() {
        return this.audioEncoding;
    }

    /**
     * Optional. If `true`, Dialogflow returns SpeechWordInfo in StreamingRecognitionResult with information about the recognized speech words, e.g. start and end time offsets. If false or unspecified, Speech doesn't return any word-level information.
     * 
     */
    @InputImport(name="enableWordInfo", required=true)
      private final Boolean enableWordInfo;

    public Boolean getEnableWordInfo() {
        return this.enableWordInfo;
    }

    /**
     * Optional. Which Speech model to select for the given request. Select the model best suited to your domain to get best results. If a model is not explicitly specified, then we auto-select a model based on the parameters in the InputAudioConfig. If enhanced speech model is enabled for the agent and an enhanced version of the specified model for the language does not exist, then the speech is recognized using the standard version of the specified model. Refer to [Cloud Speech API documentation](https://cloud.google.com/speech-to-text/docs/basics#select-model) for more details.
     * 
     */
    @InputImport(name="model", required=true)
      private final String model;

    public String getModel() {
        return this.model;
    }

    /**
     * Optional. Which variant of the Speech model to use.
     * 
     */
    @InputImport(name="modelVariant", required=true)
      private final String modelVariant;

    public String getModelVariant() {
        return this.modelVariant;
    }

    /**
     * Optional. A list of strings containing words and phrases that the speech recognizer should recognize with higher likelihood. See [the Cloud Speech documentation](https://cloud.google.com/speech-to-text/docs/basics#phrase-hints) for more details.
     * 
     */
    @InputImport(name="phraseHints", required=true)
      private final List<String> phraseHints;

    public List<String> getPhraseHints() {
        return this.phraseHints;
    }

    /**
     * Sample rate (in Hertz) of the audio content sent in the query. Refer to [Cloud Speech API documentation](https://cloud.google.com/speech-to-text/docs/basics) for more details.
     * 
     */
    @InputImport(name="sampleRateHertz", required=true)
      private final Integer sampleRateHertz;

    public Integer getSampleRateHertz() {
        return this.sampleRateHertz;
    }

    /**
     * Optional. If `false` (default), recognition does not cease until the client closes the stream. If `true`, the recognizer will detect a single spoken utterance in input audio. Recognition ceases when it detects the audio's voice has stopped or paused. In this case, once a detected intent is received, the client should close the stream and start a new request with a new stream as needed. Note: This setting is relevant only for streaming methods.
     * 
     */
    @InputImport(name="singleUtterance", required=true)
      private final Boolean singleUtterance;

    public Boolean getSingleUtterance() {
        return this.singleUtterance;
    }

    public GoogleCloudDialogflowCxV3InputAudioConfigResponse(
        String audioEncoding,
        Boolean enableWordInfo,
        String model,
        String modelVariant,
        List<String> phraseHints,
        Integer sampleRateHertz,
        Boolean singleUtterance) {
        this.audioEncoding = Objects.requireNonNull(audioEncoding, "expected parameter 'audioEncoding' to be non-null");
        this.enableWordInfo = Objects.requireNonNull(enableWordInfo, "expected parameter 'enableWordInfo' to be non-null");
        this.model = Objects.requireNonNull(model, "expected parameter 'model' to be non-null");
        this.modelVariant = Objects.requireNonNull(modelVariant, "expected parameter 'modelVariant' to be non-null");
        this.phraseHints = Objects.requireNonNull(phraseHints, "expected parameter 'phraseHints' to be non-null");
        this.sampleRateHertz = Objects.requireNonNull(sampleRateHertz, "expected parameter 'sampleRateHertz' to be non-null");
        this.singleUtterance = Objects.requireNonNull(singleUtterance, "expected parameter 'singleUtterance' to be non-null");
    }

    private GoogleCloudDialogflowCxV3InputAudioConfigResponse() {
        this.audioEncoding = null;
        this.enableWordInfo = null;
        this.model = null;
        this.modelVariant = null;
        this.phraseHints = List.of();
        this.sampleRateHertz = null;
        this.singleUtterance = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3InputAudioConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String audioEncoding;
        private Boolean enableWordInfo;
        private String model;
        private String modelVariant;
        private List<String> phraseHints;
        private Integer sampleRateHertz;
        private Boolean singleUtterance;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3InputAudioConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audioEncoding = defaults.audioEncoding;
    	      this.enableWordInfo = defaults.enableWordInfo;
    	      this.model = defaults.model;
    	      this.modelVariant = defaults.modelVariant;
    	      this.phraseHints = defaults.phraseHints;
    	      this.sampleRateHertz = defaults.sampleRateHertz;
    	      this.singleUtterance = defaults.singleUtterance;
        }

        public Builder setAudioEncoding(String audioEncoding) {
            this.audioEncoding = Objects.requireNonNull(audioEncoding);
            return this;
        }

        public Builder setEnableWordInfo(Boolean enableWordInfo) {
            this.enableWordInfo = Objects.requireNonNull(enableWordInfo);
            return this;
        }

        public Builder setModel(String model) {
            this.model = Objects.requireNonNull(model);
            return this;
        }

        public Builder setModelVariant(String modelVariant) {
            this.modelVariant = Objects.requireNonNull(modelVariant);
            return this;
        }

        public Builder setPhraseHints(List<String> phraseHints) {
            this.phraseHints = Objects.requireNonNull(phraseHints);
            return this;
        }

        public Builder setSampleRateHertz(Integer sampleRateHertz) {
            this.sampleRateHertz = Objects.requireNonNull(sampleRateHertz);
            return this;
        }

        public Builder setSingleUtterance(Boolean singleUtterance) {
            this.singleUtterance = Objects.requireNonNull(singleUtterance);
            return this;
        }
        public GoogleCloudDialogflowCxV3InputAudioConfigResponse build() {
            return new GoogleCloudDialogflowCxV3InputAudioConfigResponse(audioEncoding, enableWordInfo, model, modelVariant, phraseHints, sampleRateHertz, singleUtterance);
        }
    }
}
