// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1AudioInputResponse;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1DtmfInputResponse;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1EventInputResponse;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1IntentInputResponse;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1TextInputResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowCxV3beta1QueryInputResponse {
    /**
     * The natural language speech audio to be processed.
     * 
     */
    private final GoogleCloudDialogflowCxV3beta1AudioInputResponse audio;
    /**
     * The DTMF event to be handled.
     * 
     */
    private final GoogleCloudDialogflowCxV3beta1DtmfInputResponse dtmf;
    /**
     * The event to be triggered.
     * 
     */
    private final GoogleCloudDialogflowCxV3beta1EventInputResponse event;
    /**
     * The intent to be triggered.
     * 
     */
    private final GoogleCloudDialogflowCxV3beta1IntentInputResponse intent;
    /**
     * The language of the input. See [Language Support](https://cloud.google.com/dialogflow/cx/docs/reference/language) for a list of the currently supported language codes. Note that queries in the same session do not necessarily need to specify the same language.
     * 
     */
    private final String languageCode;
    /**
     * The natural language text to be processed.
     * 
     */
    private final GoogleCloudDialogflowCxV3beta1TextInputResponse text;

    @CustomType.Constructor
    private GoogleCloudDialogflowCxV3beta1QueryInputResponse(
        @CustomType.Parameter("audio") GoogleCloudDialogflowCxV3beta1AudioInputResponse audio,
        @CustomType.Parameter("dtmf") GoogleCloudDialogflowCxV3beta1DtmfInputResponse dtmf,
        @CustomType.Parameter("event") GoogleCloudDialogflowCxV3beta1EventInputResponse event,
        @CustomType.Parameter("intent") GoogleCloudDialogflowCxV3beta1IntentInputResponse intent,
        @CustomType.Parameter("languageCode") String languageCode,
        @CustomType.Parameter("text") GoogleCloudDialogflowCxV3beta1TextInputResponse text) {
        this.audio = audio;
        this.dtmf = dtmf;
        this.event = event;
        this.intent = intent;
        this.languageCode = languageCode;
        this.text = text;
    }

    /**
     * The natural language speech audio to be processed.
     * 
    */
    public GoogleCloudDialogflowCxV3beta1AudioInputResponse getAudio() {
        return this.audio;
    }
    /**
     * The DTMF event to be handled.
     * 
    */
    public GoogleCloudDialogflowCxV3beta1DtmfInputResponse getDtmf() {
        return this.dtmf;
    }
    /**
     * The event to be triggered.
     * 
    */
    public GoogleCloudDialogflowCxV3beta1EventInputResponse getEvent() {
        return this.event;
    }
    /**
     * The intent to be triggered.
     * 
    */
    public GoogleCloudDialogflowCxV3beta1IntentInputResponse getIntent() {
        return this.intent;
    }
    /**
     * The language of the input. See [Language Support](https://cloud.google.com/dialogflow/cx/docs/reference/language) for a list of the currently supported language codes. Note that queries in the same session do not necessarily need to specify the same language.
     * 
    */
    public String getLanguageCode() {
        return this.languageCode;
    }
    /**
     * The natural language text to be processed.
     * 
    */
    public GoogleCloudDialogflowCxV3beta1TextInputResponse getText() {
        return this.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1QueryInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3beta1AudioInputResponse audio;
        private GoogleCloudDialogflowCxV3beta1DtmfInputResponse dtmf;
        private GoogleCloudDialogflowCxV3beta1EventInputResponse event;
        private GoogleCloudDialogflowCxV3beta1IntentInputResponse intent;
        private String languageCode;
        private GoogleCloudDialogflowCxV3beta1TextInputResponse text;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1QueryInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audio = defaults.audio;
    	      this.dtmf = defaults.dtmf;
    	      this.event = defaults.event;
    	      this.intent = defaults.intent;
    	      this.languageCode = defaults.languageCode;
    	      this.text = defaults.text;
        }

        public Builder audio(GoogleCloudDialogflowCxV3beta1AudioInputResponse audio) {
            this.audio = Objects.requireNonNull(audio);
            return this;
        }

        public Builder dtmf(GoogleCloudDialogflowCxV3beta1DtmfInputResponse dtmf) {
            this.dtmf = Objects.requireNonNull(dtmf);
            return this;
        }

        public Builder event(GoogleCloudDialogflowCxV3beta1EventInputResponse event) {
            this.event = Objects.requireNonNull(event);
            return this;
        }

        public Builder intent(GoogleCloudDialogflowCxV3beta1IntentInputResponse intent) {
            this.intent = Objects.requireNonNull(intent);
            return this;
        }

        public Builder languageCode(String languageCode) {
            this.languageCode = Objects.requireNonNull(languageCode);
            return this;
        }

        public Builder text(GoogleCloudDialogflowCxV3beta1TextInputResponse text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }
        public GoogleCloudDialogflowCxV3beta1QueryInputResponse build() {
            return new GoogleCloudDialogflowCxV3beta1QueryInputResponse(audio, dtmf, event, intent, languageCode, text);
        }
    }
}
