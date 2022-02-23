// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Plays audio from a file in Telephony Gateway.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageTelephonyPlayAudioArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageTelephonyPlayAudioArgs Empty = new GoogleCloudDialogflowV2beta1IntentMessageTelephonyPlayAudioArgs();

    /**
     * URI to a Google Cloud Storage object containing the audio to play, e.g., "gs://bucket/object". The object must contain a single channel (mono) of linear PCM audio (2 bytes / sample) at 8kHz. This object must be readable by the `service-@gcp-sa-dialogflow.iam.gserviceaccount.com` service account where is the number of the Telephony Gateway project (usually the same as the Dialogflow agent project). If the Google Cloud Storage bucket is in the Telephony Gateway project, this permission is added by default when enabling the Dialogflow V2 API. For audio from other sources, consider using the `TelephonySynthesizeSpeech` message with SSML.
     * 
     */
    @InputImport(name="audioUri", required=true)
      private final Input<String> audioUri;

    public Input<String> getAudioUri() {
        return this.audioUri;
    }

    public GoogleCloudDialogflowV2beta1IntentMessageTelephonyPlayAudioArgs(Input<String> audioUri) {
        this.audioUri = Objects.requireNonNull(audioUri, "expected parameter 'audioUri' to be non-null");
    }

    private GoogleCloudDialogflowV2beta1IntentMessageTelephonyPlayAudioArgs() {
        this.audioUri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageTelephonyPlayAudioArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> audioUri;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageTelephonyPlayAudioArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audioUri = defaults.audioUri;
        }

        public Builder setAudioUri(Input<String> audioUri) {
            this.audioUri = Objects.requireNonNull(audioUri);
            return this;
        }

        public Builder setAudioUri(String audioUri) {
            this.audioUri = Input.of(Objects.requireNonNull(audioUri));
            return this;
        }
        public GoogleCloudDialogflowV2beta1IntentMessageTelephonyPlayAudioArgs build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageTelephonyPlayAudioArgs(audioUri);
        }
    }
}
