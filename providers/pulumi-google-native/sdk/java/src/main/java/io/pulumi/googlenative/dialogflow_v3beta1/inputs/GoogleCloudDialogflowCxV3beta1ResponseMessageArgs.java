// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1ResponseMessageConversationSuccessArgs;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoffArgs;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1ResponseMessageOutputAudioTextArgs;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioArgs;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1ResponseMessageTelephonyTransferCallArgs;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1ResponseMessageTextArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a response message that can be returned by a conversational agent. Response messages are also used for output audio synthesis. The approach is as follows: * If at least one OutputAudioText response is present, then all OutputAudioText responses are linearly concatenated, and the result is used for output audio synthesis. * If the OutputAudioText responses are a mixture of text and SSML, then the concatenated result is treated as SSML; otherwise, the result is treated as either text or SSML as appropriate. The agent designer should ideally use either text or SSML consistently throughout the bot design. * Otherwise, all Text responses are linearly concatenated, and the result is used for output audio synthesis. This approach allows for more sophisticated user experience scenarios, where the text displayed to the user may differ from what is heard.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1ResponseMessageArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3beta1ResponseMessageArgs Empty = new GoogleCloudDialogflowCxV3beta1ResponseMessageArgs();

    /**
     * Indicates that the conversation succeeded.
     * 
     */
    @InputImport(name="conversationSuccess")
      private final @Nullable Input<GoogleCloudDialogflowCxV3beta1ResponseMessageConversationSuccessArgs> conversationSuccess;

    public Input<GoogleCloudDialogflowCxV3beta1ResponseMessageConversationSuccessArgs> getConversationSuccess() {
        return this.conversationSuccess == null ? Input.empty() : this.conversationSuccess;
    }

    /**
     * Hands off conversation to a human agent.
     * 
     */
    @InputImport(name="liveAgentHandoff")
      private final @Nullable Input<GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoffArgs> liveAgentHandoff;

    public Input<GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoffArgs> getLiveAgentHandoff() {
        return this.liveAgentHandoff == null ? Input.empty() : this.liveAgentHandoff;
    }

    /**
     * A text or ssml response that is preferentially used for TTS output audio synthesis, as described in the comment on the ResponseMessage message.
     * 
     */
    @InputImport(name="outputAudioText")
      private final @Nullable Input<GoogleCloudDialogflowCxV3beta1ResponseMessageOutputAudioTextArgs> outputAudioText;

    public Input<GoogleCloudDialogflowCxV3beta1ResponseMessageOutputAudioTextArgs> getOutputAudioText() {
        return this.outputAudioText == null ? Input.empty() : this.outputAudioText;
    }

    /**
     * Returns a response containing a custom, platform-specific payload.
     * 
     */
    @InputImport(name="payload")
      private final @Nullable Input<Map<String,String>> payload;

    public Input<Map<String,String>> getPayload() {
        return this.payload == null ? Input.empty() : this.payload;
    }

    /**
     * Signal that the client should play an audio clip hosted at a client-specific URI. Dialogflow uses this to construct mixed_audio. However, Dialogflow itself does not try to read or process the URI in any way.
     * 
     */
    @InputImport(name="playAudio")
      private final @Nullable Input<GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioArgs> playAudio;

    public Input<GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioArgs> getPlayAudio() {
        return this.playAudio == null ? Input.empty() : this.playAudio;
    }

    /**
     * A signal that the client should transfer the phone call connected to this agent to a third-party endpoint.
     * 
     */
    @InputImport(name="telephonyTransferCall")
      private final @Nullable Input<GoogleCloudDialogflowCxV3beta1ResponseMessageTelephonyTransferCallArgs> telephonyTransferCall;

    public Input<GoogleCloudDialogflowCxV3beta1ResponseMessageTelephonyTransferCallArgs> getTelephonyTransferCall() {
        return this.telephonyTransferCall == null ? Input.empty() : this.telephonyTransferCall;
    }

    /**
     * Returns a text response.
     * 
     */
    @InputImport(name="text")
      private final @Nullable Input<GoogleCloudDialogflowCxV3beta1ResponseMessageTextArgs> text;

    public Input<GoogleCloudDialogflowCxV3beta1ResponseMessageTextArgs> getText() {
        return this.text == null ? Input.empty() : this.text;
    }

    public GoogleCloudDialogflowCxV3beta1ResponseMessageArgs(
        @Nullable Input<GoogleCloudDialogflowCxV3beta1ResponseMessageConversationSuccessArgs> conversationSuccess,
        @Nullable Input<GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoffArgs> liveAgentHandoff,
        @Nullable Input<GoogleCloudDialogflowCxV3beta1ResponseMessageOutputAudioTextArgs> outputAudioText,
        @Nullable Input<Map<String,String>> payload,
        @Nullable Input<GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioArgs> playAudio,
        @Nullable Input<GoogleCloudDialogflowCxV3beta1ResponseMessageTelephonyTransferCallArgs> telephonyTransferCall,
        @Nullable Input<GoogleCloudDialogflowCxV3beta1ResponseMessageTextArgs> text) {
        this.conversationSuccess = conversationSuccess;
        this.liveAgentHandoff = liveAgentHandoff;
        this.outputAudioText = outputAudioText;
        this.payload = payload;
        this.playAudio = playAudio;
        this.telephonyTransferCall = telephonyTransferCall;
        this.text = text;
    }

    private GoogleCloudDialogflowCxV3beta1ResponseMessageArgs() {
        this.conversationSuccess = Input.empty();
        this.liveAgentHandoff = Input.empty();
        this.outputAudioText = Input.empty();
        this.payload = Input.empty();
        this.playAudio = Input.empty();
        this.telephonyTransferCall = Input.empty();
        this.text = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1ResponseMessageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GoogleCloudDialogflowCxV3beta1ResponseMessageConversationSuccessArgs> conversationSuccess;
        private @Nullable Input<GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoffArgs> liveAgentHandoff;
        private @Nullable Input<GoogleCloudDialogflowCxV3beta1ResponseMessageOutputAudioTextArgs> outputAudioText;
        private @Nullable Input<Map<String,String>> payload;
        private @Nullable Input<GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioArgs> playAudio;
        private @Nullable Input<GoogleCloudDialogflowCxV3beta1ResponseMessageTelephonyTransferCallArgs> telephonyTransferCall;
        private @Nullable Input<GoogleCloudDialogflowCxV3beta1ResponseMessageTextArgs> text;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1ResponseMessageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conversationSuccess = defaults.conversationSuccess;
    	      this.liveAgentHandoff = defaults.liveAgentHandoff;
    	      this.outputAudioText = defaults.outputAudioText;
    	      this.payload = defaults.payload;
    	      this.playAudio = defaults.playAudio;
    	      this.telephonyTransferCall = defaults.telephonyTransferCall;
    	      this.text = defaults.text;
        }

        public Builder setConversationSuccess(@Nullable Input<GoogleCloudDialogflowCxV3beta1ResponseMessageConversationSuccessArgs> conversationSuccess) {
            this.conversationSuccess = conversationSuccess;
            return this;
        }

        public Builder setConversationSuccess(@Nullable GoogleCloudDialogflowCxV3beta1ResponseMessageConversationSuccessArgs conversationSuccess) {
            this.conversationSuccess = Input.ofNullable(conversationSuccess);
            return this;
        }

        public Builder setLiveAgentHandoff(@Nullable Input<GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoffArgs> liveAgentHandoff) {
            this.liveAgentHandoff = liveAgentHandoff;
            return this;
        }

        public Builder setLiveAgentHandoff(@Nullable GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoffArgs liveAgentHandoff) {
            this.liveAgentHandoff = Input.ofNullable(liveAgentHandoff);
            return this;
        }

        public Builder setOutputAudioText(@Nullable Input<GoogleCloudDialogflowCxV3beta1ResponseMessageOutputAudioTextArgs> outputAudioText) {
            this.outputAudioText = outputAudioText;
            return this;
        }

        public Builder setOutputAudioText(@Nullable GoogleCloudDialogflowCxV3beta1ResponseMessageOutputAudioTextArgs outputAudioText) {
            this.outputAudioText = Input.ofNullable(outputAudioText);
            return this;
        }

        public Builder setPayload(@Nullable Input<Map<String,String>> payload) {
            this.payload = payload;
            return this;
        }

        public Builder setPayload(@Nullable Map<String,String> payload) {
            this.payload = Input.ofNullable(payload);
            return this;
        }

        public Builder setPlayAudio(@Nullable Input<GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioArgs> playAudio) {
            this.playAudio = playAudio;
            return this;
        }

        public Builder setPlayAudio(@Nullable GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioArgs playAudio) {
            this.playAudio = Input.ofNullable(playAudio);
            return this;
        }

        public Builder setTelephonyTransferCall(@Nullable Input<GoogleCloudDialogflowCxV3beta1ResponseMessageTelephonyTransferCallArgs> telephonyTransferCall) {
            this.telephonyTransferCall = telephonyTransferCall;
            return this;
        }

        public Builder setTelephonyTransferCall(@Nullable GoogleCloudDialogflowCxV3beta1ResponseMessageTelephonyTransferCallArgs telephonyTransferCall) {
            this.telephonyTransferCall = Input.ofNullable(telephonyTransferCall);
            return this;
        }

        public Builder setText(@Nullable Input<GoogleCloudDialogflowCxV3beta1ResponseMessageTextArgs> text) {
            this.text = text;
            return this;
        }

        public Builder setText(@Nullable GoogleCloudDialogflowCxV3beta1ResponseMessageTextArgs text) {
            this.text = Input.ofNullable(text);
            return this;
        }
        public GoogleCloudDialogflowCxV3beta1ResponseMessageArgs build() {
            return new GoogleCloudDialogflowCxV3beta1ResponseMessageArgs(conversationSuccess, liveAgentHandoff, outputAudioText, payload, playAudio, telephonyTransferCall, text);
        }
    }
}
