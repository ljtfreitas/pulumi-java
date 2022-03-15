// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Synthesizes speech and plays back the synthesized audio to the caller in Telephony Gateway. Telephony Gateway takes the synthesizer settings from `DetectIntentResponse.output_audio_config` which can either be set at request-level or can come from the agent-level synthesizer config.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeechArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeechArgs Empty = new GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeechArgs();

    /**
     * The SSML to be synthesized. For more information, see [SSML](https://developers.google.com/actions/reference/ssml).
     * 
     */
    @Import(name="ssml")
      private final @Nullable Output<String> ssml;

    public Output<String> getSsml() {
        return this.ssml == null ? Output.empty() : this.ssml;
    }

    /**
     * The raw text to be synthesized.
     * 
     */
    @Import(name="text")
      private final @Nullable Output<String> text;

    public Output<String> getText() {
        return this.text == null ? Output.empty() : this.text;
    }

    public GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeechArgs(
        @Nullable Output<String> ssml,
        @Nullable Output<String> text) {
        this.ssml = ssml;
        this.text = text;
    }

    private GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeechArgs() {
        this.ssml = Output.empty();
        this.text = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeechArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> ssml;
        private @Nullable Output<String> text;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeechArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ssml = defaults.ssml;
    	      this.text = defaults.text;
        }

        public Builder ssml(@Nullable Output<String> ssml) {
            this.ssml = ssml;
            return this;
        }

        public Builder ssml(@Nullable String ssml) {
            this.ssml = Output.ofNullable(ssml);
            return this;
        }

        public Builder text(@Nullable Output<String> text) {
            this.text = text;
            return this;
        }

        public Builder text(@Nullable String text) {
            this.text = Output.ofNullable(text);
            return this;
        }
        public GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeechArgs build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeechArgs(ssml, text);
        }
    }
}
