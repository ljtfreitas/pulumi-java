// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowCxV3InputAudioConfigResponse {
    /**
     * Audio encoding of the audio content to process.
     * 
     */
    private final String audioEncoding;
    /**
     * Optional. If `true`, Dialogflow returns SpeechWordInfo in StreamingRecognitionResult with information about the recognized speech words, e.g. start and end time offsets. If false or unspecified, Speech doesn't return any word-level information.
     * 
     */
    private final Boolean enableWordInfo;
    /**
     * Optional. Which Speech model to select for the given request. Select the model best suited to your domain to get best results. If a model is not explicitly specified, then we auto-select a model based on the parameters in the InputAudioConfig. If enhanced speech model is enabled for the agent and an enhanced version of the specified model for the language does not exist, then the speech is recognized using the standard version of the specified model. Refer to [Cloud Speech API documentation](https://cloud.google.com/speech-to-text/docs/basics#select-model) for more details.
     * 
     */
    private final String model;
    /**
     * Optional. Which variant of the Speech model to use.
     * 
     */
    private final String modelVariant;
    /**
     * Optional. A list of strings containing words and phrases that the speech recognizer should recognize with higher likelihood. See [the Cloud Speech documentation](https://cloud.google.com/speech-to-text/docs/basics#phrase-hints) for more details.
     * 
     */
    private final List<String> phraseHints;
    /**
     * Sample rate (in Hertz) of the audio content sent in the query. Refer to [Cloud Speech API documentation](https://cloud.google.com/speech-to-text/docs/basics) for more details.
     * 
     */
    private final Integer sampleRateHertz;
    /**
     * Optional. If `false` (default), recognition does not cease until the client closes the stream. If `true`, the recognizer will detect a single spoken utterance in input audio. Recognition ceases when it detects the audio's voice has stopped or paused. In this case, once a detected intent is received, the client should close the stream and start a new request with a new stream as needed. Note: This setting is relevant only for streaming methods.
     * 
     */
    private final Boolean singleUtterance;

    @CustomType.Constructor
    private GoogleCloudDialogflowCxV3InputAudioConfigResponse(
        @CustomType.Parameter("audioEncoding") String audioEncoding,
        @CustomType.Parameter("enableWordInfo") Boolean enableWordInfo,
        @CustomType.Parameter("model") String model,
        @CustomType.Parameter("modelVariant") String modelVariant,
        @CustomType.Parameter("phraseHints") List<String> phraseHints,
        @CustomType.Parameter("sampleRateHertz") Integer sampleRateHertz,
        @CustomType.Parameter("singleUtterance") Boolean singleUtterance) {
        this.audioEncoding = audioEncoding;
        this.enableWordInfo = enableWordInfo;
        this.model = model;
        this.modelVariant = modelVariant;
        this.phraseHints = phraseHints;
        this.sampleRateHertz = sampleRateHertz;
        this.singleUtterance = singleUtterance;
    }

    /**
     * Audio encoding of the audio content to process.
     * 
    */
    public String getAudioEncoding() {
        return this.audioEncoding;
    }
    /**
     * Optional. If `true`, Dialogflow returns SpeechWordInfo in StreamingRecognitionResult with information about the recognized speech words, e.g. start and end time offsets. If false or unspecified, Speech doesn't return any word-level information.
     * 
    */
    public Boolean getEnableWordInfo() {
        return this.enableWordInfo;
    }
    /**
     * Optional. Which Speech model to select for the given request. Select the model best suited to your domain to get best results. If a model is not explicitly specified, then we auto-select a model based on the parameters in the InputAudioConfig. If enhanced speech model is enabled for the agent and an enhanced version of the specified model for the language does not exist, then the speech is recognized using the standard version of the specified model. Refer to [Cloud Speech API documentation](https://cloud.google.com/speech-to-text/docs/basics#select-model) for more details.
     * 
    */
    public String getModel() {
        return this.model;
    }
    /**
     * Optional. Which variant of the Speech model to use.
     * 
    */
    public String getModelVariant() {
        return this.modelVariant;
    }
    /**
     * Optional. A list of strings containing words and phrases that the speech recognizer should recognize with higher likelihood. See [the Cloud Speech documentation](https://cloud.google.com/speech-to-text/docs/basics#phrase-hints) for more details.
     * 
    */
    public List<String> getPhraseHints() {
        return this.phraseHints;
    }
    /**
     * Sample rate (in Hertz) of the audio content sent in the query. Refer to [Cloud Speech API documentation](https://cloud.google.com/speech-to-text/docs/basics) for more details.
     * 
    */
    public Integer getSampleRateHertz() {
        return this.sampleRateHertz;
    }
    /**
     * Optional. If `false` (default), recognition does not cease until the client closes the stream. If `true`, the recognizer will detect a single spoken utterance in input audio. Recognition ceases when it detects the audio's voice has stopped or paused. In this case, once a detected intent is received, the client should close the stream and start a new request with a new stream as needed. Note: This setting is relevant only for streaming methods.
     * 
    */
    public Boolean getSingleUtterance() {
        return this.singleUtterance;
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

        public Builder audioEncoding(String audioEncoding) {
            this.audioEncoding = Objects.requireNonNull(audioEncoding);
            return this;
        }

        public Builder enableWordInfo(Boolean enableWordInfo) {
            this.enableWordInfo = Objects.requireNonNull(enableWordInfo);
            return this;
        }

        public Builder model(String model) {
            this.model = Objects.requireNonNull(model);
            return this;
        }

        public Builder modelVariant(String modelVariant) {
            this.modelVariant = Objects.requireNonNull(modelVariant);
            return this;
        }

        public Builder phraseHints(List<String> phraseHints) {
            this.phraseHints = Objects.requireNonNull(phraseHints);
            return this;
        }

        public Builder sampleRateHertz(Integer sampleRateHertz) {
            this.sampleRateHertz = Objects.requireNonNull(sampleRateHertz);
            return this;
        }

        public Builder singleUtterance(Boolean singleUtterance) {
            this.singleUtterance = Objects.requireNonNull(singleUtterance);
            return this;
        }
        public GoogleCloudDialogflowCxV3InputAudioConfigResponse build() {
            return new GoogleCloudDialogflowCxV3InputAudioConfigResponse(audioEncoding, enableWordInfo, model, modelVariant, phraseHints, sampleRateHertz, singleUtterance);
        }
    }
}
