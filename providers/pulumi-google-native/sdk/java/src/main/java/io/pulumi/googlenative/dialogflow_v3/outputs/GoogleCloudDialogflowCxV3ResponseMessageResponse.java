// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3ResponseMessageConversationSuccessResponse;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3ResponseMessageEndInteractionResponse;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3ResponseMessageLiveAgentHandoffResponse;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3ResponseMessageMixedAudioResponse;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3ResponseMessageOutputAudioTextResponse;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3ResponseMessagePlayAudioResponse;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3ResponseMessageTelephonyTransferCallResponse;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3ResponseMessageTextResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowCxV3ResponseMessageResponse {
    /**
     * Indicates that the conversation succeeded.
     * 
     */
    private final GoogleCloudDialogflowCxV3ResponseMessageConversationSuccessResponse conversationSuccess;
    /**
     * A signal that indicates the interaction with the Dialogflow agent has ended. This message is generated by Dialogflow only when the conversation reaches `END_SESSION` page. It is not supposed to be defined by the user. It's guaranteed that there is at most one such message in each response.
     * 
     */
    private final GoogleCloudDialogflowCxV3ResponseMessageEndInteractionResponse endInteraction;
    /**
     * Hands off conversation to a human agent.
     * 
     */
    private final GoogleCloudDialogflowCxV3ResponseMessageLiveAgentHandoffResponse liveAgentHandoff;
    /**
     * An audio response message composed of both the synthesized Dialogflow agent responses and responses defined via play_audio. This message is generated by Dialogflow only and not supposed to be defined by the user.
     * 
     */
    private final GoogleCloudDialogflowCxV3ResponseMessageMixedAudioResponse mixedAudio;
    /**
     * A text or ssml response that is preferentially used for TTS output audio synthesis, as described in the comment on the ResponseMessage message.
     * 
     */
    private final GoogleCloudDialogflowCxV3ResponseMessageOutputAudioTextResponse outputAudioText;
    /**
     * Returns a response containing a custom, platform-specific payload.
     * 
     */
    private final Map<String,String> payload;
    /**
     * Signal that the client should play an audio clip hosted at a client-specific URI. Dialogflow uses this to construct mixed_audio. However, Dialogflow itself does not try to read or process the URI in any way.
     * 
     */
    private final GoogleCloudDialogflowCxV3ResponseMessagePlayAudioResponse playAudio;
    /**
     * A signal that the client should transfer the phone call connected to this agent to a third-party endpoint.
     * 
     */
    private final GoogleCloudDialogflowCxV3ResponseMessageTelephonyTransferCallResponse telephonyTransferCall;
    /**
     * Returns a text response.
     * 
     */
    private final GoogleCloudDialogflowCxV3ResponseMessageTextResponse text;

    @OutputCustomType.Constructor({"conversationSuccess","endInteraction","liveAgentHandoff","mixedAudio","outputAudioText","payload","playAudio","telephonyTransferCall","text"})
    private GoogleCloudDialogflowCxV3ResponseMessageResponse(
        GoogleCloudDialogflowCxV3ResponseMessageConversationSuccessResponse conversationSuccess,
        GoogleCloudDialogflowCxV3ResponseMessageEndInteractionResponse endInteraction,
        GoogleCloudDialogflowCxV3ResponseMessageLiveAgentHandoffResponse liveAgentHandoff,
        GoogleCloudDialogflowCxV3ResponseMessageMixedAudioResponse mixedAudio,
        GoogleCloudDialogflowCxV3ResponseMessageOutputAudioTextResponse outputAudioText,
        Map<String,String> payload,
        GoogleCloudDialogflowCxV3ResponseMessagePlayAudioResponse playAudio,
        GoogleCloudDialogflowCxV3ResponseMessageTelephonyTransferCallResponse telephonyTransferCall,
        GoogleCloudDialogflowCxV3ResponseMessageTextResponse text) {
        this.conversationSuccess = Objects.requireNonNull(conversationSuccess);
        this.endInteraction = Objects.requireNonNull(endInteraction);
        this.liveAgentHandoff = Objects.requireNonNull(liveAgentHandoff);
        this.mixedAudio = Objects.requireNonNull(mixedAudio);
        this.outputAudioText = Objects.requireNonNull(outputAudioText);
        this.payload = Objects.requireNonNull(payload);
        this.playAudio = Objects.requireNonNull(playAudio);
        this.telephonyTransferCall = Objects.requireNonNull(telephonyTransferCall);
        this.text = Objects.requireNonNull(text);
    }

    /**
     * Indicates that the conversation succeeded.
     * 
     */
    public GoogleCloudDialogflowCxV3ResponseMessageConversationSuccessResponse getConversationSuccess() {
        return this.conversationSuccess;
    }
    /**
     * A signal that indicates the interaction with the Dialogflow agent has ended. This message is generated by Dialogflow only when the conversation reaches `END_SESSION` page. It is not supposed to be defined by the user. It's guaranteed that there is at most one such message in each response.
     * 
     */
    public GoogleCloudDialogflowCxV3ResponseMessageEndInteractionResponse getEndInteraction() {
        return this.endInteraction;
    }
    /**
     * Hands off conversation to a human agent.
     * 
     */
    public GoogleCloudDialogflowCxV3ResponseMessageLiveAgentHandoffResponse getLiveAgentHandoff() {
        return this.liveAgentHandoff;
    }
    /**
     * An audio response message composed of both the synthesized Dialogflow agent responses and responses defined via play_audio. This message is generated by Dialogflow only and not supposed to be defined by the user.
     * 
     */
    public GoogleCloudDialogflowCxV3ResponseMessageMixedAudioResponse getMixedAudio() {
        return this.mixedAudio;
    }
    /**
     * A text or ssml response that is preferentially used for TTS output audio synthesis, as described in the comment on the ResponseMessage message.
     * 
     */
    public GoogleCloudDialogflowCxV3ResponseMessageOutputAudioTextResponse getOutputAudioText() {
        return this.outputAudioText;
    }
    /**
     * Returns a response containing a custom, platform-specific payload.
     * 
     */
    public Map<String,String> getPayload() {
        return this.payload;
    }
    /**
     * Signal that the client should play an audio clip hosted at a client-specific URI. Dialogflow uses this to construct mixed_audio. However, Dialogflow itself does not try to read or process the URI in any way.
     * 
     */
    public GoogleCloudDialogflowCxV3ResponseMessagePlayAudioResponse getPlayAudio() {
        return this.playAudio;
    }
    /**
     * A signal that the client should transfer the phone call connected to this agent to a third-party endpoint.
     * 
     */
    public GoogleCloudDialogflowCxV3ResponseMessageTelephonyTransferCallResponse getTelephonyTransferCall() {
        return this.telephonyTransferCall;
    }
    /**
     * Returns a text response.
     * 
     */
    public GoogleCloudDialogflowCxV3ResponseMessageTextResponse getText() {
        return this.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3ResponseMessageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3ResponseMessageConversationSuccessResponse conversationSuccess;
        private GoogleCloudDialogflowCxV3ResponseMessageEndInteractionResponse endInteraction;
        private GoogleCloudDialogflowCxV3ResponseMessageLiveAgentHandoffResponse liveAgentHandoff;
        private GoogleCloudDialogflowCxV3ResponseMessageMixedAudioResponse mixedAudio;
        private GoogleCloudDialogflowCxV3ResponseMessageOutputAudioTextResponse outputAudioText;
        private Map<String,String> payload;
        private GoogleCloudDialogflowCxV3ResponseMessagePlayAudioResponse playAudio;
        private GoogleCloudDialogflowCxV3ResponseMessageTelephonyTransferCallResponse telephonyTransferCall;
        private GoogleCloudDialogflowCxV3ResponseMessageTextResponse text;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3ResponseMessageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conversationSuccess = defaults.conversationSuccess;
    	      this.endInteraction = defaults.endInteraction;
    	      this.liveAgentHandoff = defaults.liveAgentHandoff;
    	      this.mixedAudio = defaults.mixedAudio;
    	      this.outputAudioText = defaults.outputAudioText;
    	      this.payload = defaults.payload;
    	      this.playAudio = defaults.playAudio;
    	      this.telephonyTransferCall = defaults.telephonyTransferCall;
    	      this.text = defaults.text;
        }

        public Builder setConversationSuccess(GoogleCloudDialogflowCxV3ResponseMessageConversationSuccessResponse conversationSuccess) {
            this.conversationSuccess = Objects.requireNonNull(conversationSuccess);
            return this;
        }

        public Builder setEndInteraction(GoogleCloudDialogflowCxV3ResponseMessageEndInteractionResponse endInteraction) {
            this.endInteraction = Objects.requireNonNull(endInteraction);
            return this;
        }

        public Builder setLiveAgentHandoff(GoogleCloudDialogflowCxV3ResponseMessageLiveAgentHandoffResponse liveAgentHandoff) {
            this.liveAgentHandoff = Objects.requireNonNull(liveAgentHandoff);
            return this;
        }

        public Builder setMixedAudio(GoogleCloudDialogflowCxV3ResponseMessageMixedAudioResponse mixedAudio) {
            this.mixedAudio = Objects.requireNonNull(mixedAudio);
            return this;
        }

        public Builder setOutputAudioText(GoogleCloudDialogflowCxV3ResponseMessageOutputAudioTextResponse outputAudioText) {
            this.outputAudioText = Objects.requireNonNull(outputAudioText);
            return this;
        }

        public Builder setPayload(Map<String,String> payload) {
            this.payload = Objects.requireNonNull(payload);
            return this;
        }

        public Builder setPlayAudio(GoogleCloudDialogflowCxV3ResponseMessagePlayAudioResponse playAudio) {
            this.playAudio = Objects.requireNonNull(playAudio);
            return this;
        }

        public Builder setTelephonyTransferCall(GoogleCloudDialogflowCxV3ResponseMessageTelephonyTransferCallResponse telephonyTransferCall) {
            this.telephonyTransferCall = Objects.requireNonNull(telephonyTransferCall);
            return this;
        }

        public Builder setText(GoogleCloudDialogflowCxV3ResponseMessageTextResponse text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }
        public GoogleCloudDialogflowCxV3ResponseMessageResponse build() {
            return new GoogleCloudDialogflowCxV3ResponseMessageResponse(conversationSuccess, endInteraction, liveAgentHandoff, mixedAudio, outputAudioText, payload, playAudio, telephonyTransferCall, text);
        }
    }
}
