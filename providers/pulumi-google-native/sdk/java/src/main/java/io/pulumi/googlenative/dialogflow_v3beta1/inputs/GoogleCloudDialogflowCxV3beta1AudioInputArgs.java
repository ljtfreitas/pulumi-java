// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1InputAudioConfigArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents the natural speech audio to be processed.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1AudioInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3beta1AudioInputArgs Empty = new GoogleCloudDialogflowCxV3beta1AudioInputArgs();

    /**
     * The natural language speech audio to be processed. A single request can contain up to 1 minute of speech audio data. The transcribed text cannot contain more than 256 bytes. For non-streaming audio detect intent, both `config` and `audio` must be provided. For streaming audio detect intent, `config` must be provided in the first request and `audio` must be provided in all following requests.
     * 
     */
    @InputImport(name="audio")
      private final @Nullable Input<String> audio;

    public Input<String> getAudio() {
        return this.audio == null ? Input.empty() : this.audio;
    }

    /**
     * Instructs the speech recognizer how to process the speech audio.
     * 
     */
    @InputImport(name="config", required=true)
      private final Input<GoogleCloudDialogflowCxV3beta1InputAudioConfigArgs> config;

    public Input<GoogleCloudDialogflowCxV3beta1InputAudioConfigArgs> getConfig() {
        return this.config;
    }

    public GoogleCloudDialogflowCxV3beta1AudioInputArgs(
        @Nullable Input<String> audio,
        Input<GoogleCloudDialogflowCxV3beta1InputAudioConfigArgs> config) {
        this.audio = audio;
        this.config = Objects.requireNonNull(config, "expected parameter 'config' to be non-null");
    }

    private GoogleCloudDialogflowCxV3beta1AudioInputArgs() {
        this.audio = Input.empty();
        this.config = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1AudioInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> audio;
        private Input<GoogleCloudDialogflowCxV3beta1InputAudioConfigArgs> config;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1AudioInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audio = defaults.audio;
    	      this.config = defaults.config;
        }

        public Builder setAudio(@Nullable Input<String> audio) {
            this.audio = audio;
            return this;
        }

        public Builder setAudio(@Nullable String audio) {
            this.audio = Input.ofNullable(audio);
            return this;
        }

        public Builder setConfig(Input<GoogleCloudDialogflowCxV3beta1InputAudioConfigArgs> config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }

        public Builder setConfig(GoogleCloudDialogflowCxV3beta1InputAudioConfigArgs config) {
            this.config = Input.of(Objects.requireNonNull(config));
            return this;
        }
        public GoogleCloudDialogflowCxV3beta1AudioInputArgs build() {
            return new GoogleCloudDialogflowCxV3beta1AudioInputArgs(audio, config);
        }
    }
}
