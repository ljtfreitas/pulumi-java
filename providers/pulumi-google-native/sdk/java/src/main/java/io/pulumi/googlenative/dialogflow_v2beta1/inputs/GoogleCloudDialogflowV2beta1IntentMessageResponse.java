// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageBasicCardResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageCardResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageImageResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestionResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageListSelectResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageQuickRepliesResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCardResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageRbmTextResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageSimpleResponsesResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageSuggestionsResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageTableCardResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageTelephonyPlayAudioResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeechResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCallResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageTextResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Corresponds to the `Response` field in the Dialogflow console.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageResponse Empty = new GoogleCloudDialogflowV2beta1IntentMessageResponse();

    /**
     * Displays a basic card for Actions on Google.
     * 
     */
    @Import(name="basicCard", required=true)
      private final GoogleCloudDialogflowV2beta1IntentMessageBasicCardResponse basicCard;

    public GoogleCloudDialogflowV2beta1IntentMessageBasicCardResponse getBasicCard() {
        return this.basicCard;
    }

    /**
     * Browse carousel card for Actions on Google.
     * 
     */
    @Import(name="browseCarouselCard", required=true)
      private final GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardResponse browseCarouselCard;

    public GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardResponse getBrowseCarouselCard() {
        return this.browseCarouselCard;
    }

    /**
     * Displays a card.
     * 
     */
    @Import(name="card", required=true)
      private final GoogleCloudDialogflowV2beta1IntentMessageCardResponse card;

    public GoogleCloudDialogflowV2beta1IntentMessageCardResponse getCard() {
        return this.card;
    }

    /**
     * Displays a carousel card for Actions on Google.
     * 
     */
    @Import(name="carouselSelect", required=true)
      private final GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectResponse carouselSelect;

    public GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectResponse getCarouselSelect() {
        return this.carouselSelect;
    }

    /**
     * Displays an image.
     * 
     */
    @Import(name="image", required=true)
      private final GoogleCloudDialogflowV2beta1IntentMessageImageResponse image;

    public GoogleCloudDialogflowV2beta1IntentMessageImageResponse getImage() {
        return this.image;
    }

    /**
     * Displays a link out suggestion chip for Actions on Google.
     * 
     */
    @Import(name="linkOutSuggestion", required=true)
      private final GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestionResponse linkOutSuggestion;

    public GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestionResponse getLinkOutSuggestion() {
        return this.linkOutSuggestion;
    }

    /**
     * Displays a list card for Actions on Google.
     * 
     */
    @Import(name="listSelect", required=true)
      private final GoogleCloudDialogflowV2beta1IntentMessageListSelectResponse listSelect;

    public GoogleCloudDialogflowV2beta1IntentMessageListSelectResponse getListSelect() {
        return this.listSelect;
    }

    /**
     * The media content card for Actions on Google.
     * 
     */
    @Import(name="mediaContent", required=true)
      private final GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponse mediaContent;

    public GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponse getMediaContent() {
        return this.mediaContent;
    }

    /**
     * A custom platform-specific response.
     * 
     */
    @Import(name="payload", required=true)
      private final Map<String,String> payload;

    public Map<String,String> getPayload() {
        return this.payload;
    }

    /**
     * Optional. The platform that this message is intended for.
     * 
     */
    @Import(name="platform", required=true)
      private final String platform;

    public String getPlatform() {
        return this.platform;
    }

    /**
     * Displays quick replies.
     * 
     */
    @Import(name="quickReplies", required=true)
      private final GoogleCloudDialogflowV2beta1IntentMessageQuickRepliesResponse quickReplies;

    public GoogleCloudDialogflowV2beta1IntentMessageQuickRepliesResponse getQuickReplies() {
        return this.quickReplies;
    }

    /**
     * Rich Business Messaging (RBM) carousel rich card response.
     * 
     */
    @Import(name="rbmCarouselRichCard", required=true)
      private final GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCardResponse rbmCarouselRichCard;

    public GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCardResponse getRbmCarouselRichCard() {
        return this.rbmCarouselRichCard;
    }

    /**
     * Standalone Rich Business Messaging (RBM) rich card response.
     * 
     */
    @Import(name="rbmStandaloneRichCard", required=true)
      private final GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardResponse rbmStandaloneRichCard;

    public GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardResponse getRbmStandaloneRichCard() {
        return this.rbmStandaloneRichCard;
    }

    /**
     * Rich Business Messaging (RBM) text response. RBM allows businesses to send enriched and branded versions of SMS. See https://jibe.google.com/business-messaging.
     * 
     */
    @Import(name="rbmText", required=true)
      private final GoogleCloudDialogflowV2beta1IntentMessageRbmTextResponse rbmText;

    public GoogleCloudDialogflowV2beta1IntentMessageRbmTextResponse getRbmText() {
        return this.rbmText;
    }

    /**
     * Returns a voice or text-only response for Actions on Google.
     * 
     */
    @Import(name="simpleResponses", required=true)
      private final GoogleCloudDialogflowV2beta1IntentMessageSimpleResponsesResponse simpleResponses;

    public GoogleCloudDialogflowV2beta1IntentMessageSimpleResponsesResponse getSimpleResponses() {
        return this.simpleResponses;
    }

    /**
     * Displays suggestion chips for Actions on Google.
     * 
     */
    @Import(name="suggestions", required=true)
      private final GoogleCloudDialogflowV2beta1IntentMessageSuggestionsResponse suggestions;

    public GoogleCloudDialogflowV2beta1IntentMessageSuggestionsResponse getSuggestions() {
        return this.suggestions;
    }

    /**
     * Table card for Actions on Google.
     * 
     */
    @Import(name="tableCard", required=true)
      private final GoogleCloudDialogflowV2beta1IntentMessageTableCardResponse tableCard;

    public GoogleCloudDialogflowV2beta1IntentMessageTableCardResponse getTableCard() {
        return this.tableCard;
    }

    /**
     * Plays audio from a file in Telephony Gateway.
     * 
     */
    @Import(name="telephonyPlayAudio", required=true)
      private final GoogleCloudDialogflowV2beta1IntentMessageTelephonyPlayAudioResponse telephonyPlayAudio;

    public GoogleCloudDialogflowV2beta1IntentMessageTelephonyPlayAudioResponse getTelephonyPlayAudio() {
        return this.telephonyPlayAudio;
    }

    /**
     * Synthesizes speech in Telephony Gateway.
     * 
     */
    @Import(name="telephonySynthesizeSpeech", required=true)
      private final GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeechResponse telephonySynthesizeSpeech;

    public GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeechResponse getTelephonySynthesizeSpeech() {
        return this.telephonySynthesizeSpeech;
    }

    /**
     * Transfers the call in Telephony Gateway.
     * 
     */
    @Import(name="telephonyTransferCall", required=true)
      private final GoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCallResponse telephonyTransferCall;

    public GoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCallResponse getTelephonyTransferCall() {
        return this.telephonyTransferCall;
    }

    /**
     * Returns a text response.
     * 
     */
    @Import(name="text", required=true)
      private final GoogleCloudDialogflowV2beta1IntentMessageTextResponse text;

    public GoogleCloudDialogflowV2beta1IntentMessageTextResponse getText() {
        return this.text;
    }

    public GoogleCloudDialogflowV2beta1IntentMessageResponse(
        GoogleCloudDialogflowV2beta1IntentMessageBasicCardResponse basicCard,
        GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardResponse browseCarouselCard,
        GoogleCloudDialogflowV2beta1IntentMessageCardResponse card,
        GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectResponse carouselSelect,
        GoogleCloudDialogflowV2beta1IntentMessageImageResponse image,
        GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestionResponse linkOutSuggestion,
        GoogleCloudDialogflowV2beta1IntentMessageListSelectResponse listSelect,
        GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponse mediaContent,
        Map<String,String> payload,
        String platform,
        GoogleCloudDialogflowV2beta1IntentMessageQuickRepliesResponse quickReplies,
        GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCardResponse rbmCarouselRichCard,
        GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardResponse rbmStandaloneRichCard,
        GoogleCloudDialogflowV2beta1IntentMessageRbmTextResponse rbmText,
        GoogleCloudDialogflowV2beta1IntentMessageSimpleResponsesResponse simpleResponses,
        GoogleCloudDialogflowV2beta1IntentMessageSuggestionsResponse suggestions,
        GoogleCloudDialogflowV2beta1IntentMessageTableCardResponse tableCard,
        GoogleCloudDialogflowV2beta1IntentMessageTelephonyPlayAudioResponse telephonyPlayAudio,
        GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeechResponse telephonySynthesizeSpeech,
        GoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCallResponse telephonyTransferCall,
        GoogleCloudDialogflowV2beta1IntentMessageTextResponse text) {
        this.basicCard = Objects.requireNonNull(basicCard, "expected parameter 'basicCard' to be non-null");
        this.browseCarouselCard = Objects.requireNonNull(browseCarouselCard, "expected parameter 'browseCarouselCard' to be non-null");
        this.card = Objects.requireNonNull(card, "expected parameter 'card' to be non-null");
        this.carouselSelect = Objects.requireNonNull(carouselSelect, "expected parameter 'carouselSelect' to be non-null");
        this.image = Objects.requireNonNull(image, "expected parameter 'image' to be non-null");
        this.linkOutSuggestion = Objects.requireNonNull(linkOutSuggestion, "expected parameter 'linkOutSuggestion' to be non-null");
        this.listSelect = Objects.requireNonNull(listSelect, "expected parameter 'listSelect' to be non-null");
        this.mediaContent = Objects.requireNonNull(mediaContent, "expected parameter 'mediaContent' to be non-null");
        this.payload = Objects.requireNonNull(payload, "expected parameter 'payload' to be non-null");
        this.platform = Objects.requireNonNull(platform, "expected parameter 'platform' to be non-null");
        this.quickReplies = Objects.requireNonNull(quickReplies, "expected parameter 'quickReplies' to be non-null");
        this.rbmCarouselRichCard = Objects.requireNonNull(rbmCarouselRichCard, "expected parameter 'rbmCarouselRichCard' to be non-null");
        this.rbmStandaloneRichCard = Objects.requireNonNull(rbmStandaloneRichCard, "expected parameter 'rbmStandaloneRichCard' to be non-null");
        this.rbmText = Objects.requireNonNull(rbmText, "expected parameter 'rbmText' to be non-null");
        this.simpleResponses = Objects.requireNonNull(simpleResponses, "expected parameter 'simpleResponses' to be non-null");
        this.suggestions = Objects.requireNonNull(suggestions, "expected parameter 'suggestions' to be non-null");
        this.tableCard = Objects.requireNonNull(tableCard, "expected parameter 'tableCard' to be non-null");
        this.telephonyPlayAudio = Objects.requireNonNull(telephonyPlayAudio, "expected parameter 'telephonyPlayAudio' to be non-null");
        this.telephonySynthesizeSpeech = Objects.requireNonNull(telephonySynthesizeSpeech, "expected parameter 'telephonySynthesizeSpeech' to be non-null");
        this.telephonyTransferCall = Objects.requireNonNull(telephonyTransferCall, "expected parameter 'telephonyTransferCall' to be non-null");
        this.text = Objects.requireNonNull(text, "expected parameter 'text' to be non-null");
    }

    private GoogleCloudDialogflowV2beta1IntentMessageResponse() {
        this.basicCard = null;
        this.browseCarouselCard = null;
        this.card = null;
        this.carouselSelect = null;
        this.image = null;
        this.linkOutSuggestion = null;
        this.listSelect = null;
        this.mediaContent = null;
        this.payload = Map.of();
        this.platform = null;
        this.quickReplies = null;
        this.rbmCarouselRichCard = null;
        this.rbmStandaloneRichCard = null;
        this.rbmText = null;
        this.simpleResponses = null;
        this.suggestions = null;
        this.tableCard = null;
        this.telephonyPlayAudio = null;
        this.telephonySynthesizeSpeech = null;
        this.telephonyTransferCall = null;
        this.text = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2beta1IntentMessageBasicCardResponse basicCard;
        private GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardResponse browseCarouselCard;
        private GoogleCloudDialogflowV2beta1IntentMessageCardResponse card;
        private GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectResponse carouselSelect;
        private GoogleCloudDialogflowV2beta1IntentMessageImageResponse image;
        private GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestionResponse linkOutSuggestion;
        private GoogleCloudDialogflowV2beta1IntentMessageListSelectResponse listSelect;
        private GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponse mediaContent;
        private Map<String,String> payload;
        private String platform;
        private GoogleCloudDialogflowV2beta1IntentMessageQuickRepliesResponse quickReplies;
        private GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCardResponse rbmCarouselRichCard;
        private GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardResponse rbmStandaloneRichCard;
        private GoogleCloudDialogflowV2beta1IntentMessageRbmTextResponse rbmText;
        private GoogleCloudDialogflowV2beta1IntentMessageSimpleResponsesResponse simpleResponses;
        private GoogleCloudDialogflowV2beta1IntentMessageSuggestionsResponse suggestions;
        private GoogleCloudDialogflowV2beta1IntentMessageTableCardResponse tableCard;
        private GoogleCloudDialogflowV2beta1IntentMessageTelephonyPlayAudioResponse telephonyPlayAudio;
        private GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeechResponse telephonySynthesizeSpeech;
        private GoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCallResponse telephonyTransferCall;
        private GoogleCloudDialogflowV2beta1IntentMessageTextResponse text;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.basicCard = defaults.basicCard;
    	      this.browseCarouselCard = defaults.browseCarouselCard;
    	      this.card = defaults.card;
    	      this.carouselSelect = defaults.carouselSelect;
    	      this.image = defaults.image;
    	      this.linkOutSuggestion = defaults.linkOutSuggestion;
    	      this.listSelect = defaults.listSelect;
    	      this.mediaContent = defaults.mediaContent;
    	      this.payload = defaults.payload;
    	      this.platform = defaults.platform;
    	      this.quickReplies = defaults.quickReplies;
    	      this.rbmCarouselRichCard = defaults.rbmCarouselRichCard;
    	      this.rbmStandaloneRichCard = defaults.rbmStandaloneRichCard;
    	      this.rbmText = defaults.rbmText;
    	      this.simpleResponses = defaults.simpleResponses;
    	      this.suggestions = defaults.suggestions;
    	      this.tableCard = defaults.tableCard;
    	      this.telephonyPlayAudio = defaults.telephonyPlayAudio;
    	      this.telephonySynthesizeSpeech = defaults.telephonySynthesizeSpeech;
    	      this.telephonyTransferCall = defaults.telephonyTransferCall;
    	      this.text = defaults.text;
        }

        public Builder basicCard(GoogleCloudDialogflowV2beta1IntentMessageBasicCardResponse basicCard) {
            this.basicCard = Objects.requireNonNull(basicCard);
            return this;
        }

        public Builder browseCarouselCard(GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardResponse browseCarouselCard) {
            this.browseCarouselCard = Objects.requireNonNull(browseCarouselCard);
            return this;
        }

        public Builder card(GoogleCloudDialogflowV2beta1IntentMessageCardResponse card) {
            this.card = Objects.requireNonNull(card);
            return this;
        }

        public Builder carouselSelect(GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectResponse carouselSelect) {
            this.carouselSelect = Objects.requireNonNull(carouselSelect);
            return this;
        }

        public Builder image(GoogleCloudDialogflowV2beta1IntentMessageImageResponse image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }

        public Builder linkOutSuggestion(GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestionResponse linkOutSuggestion) {
            this.linkOutSuggestion = Objects.requireNonNull(linkOutSuggestion);
            return this;
        }

        public Builder listSelect(GoogleCloudDialogflowV2beta1IntentMessageListSelectResponse listSelect) {
            this.listSelect = Objects.requireNonNull(listSelect);
            return this;
        }

        public Builder mediaContent(GoogleCloudDialogflowV2beta1IntentMessageMediaContentResponse mediaContent) {
            this.mediaContent = Objects.requireNonNull(mediaContent);
            return this;
        }

        public Builder payload(Map<String,String> payload) {
            this.payload = Objects.requireNonNull(payload);
            return this;
        }

        public Builder platform(String platform) {
            this.platform = Objects.requireNonNull(platform);
            return this;
        }

        public Builder quickReplies(GoogleCloudDialogflowV2beta1IntentMessageQuickRepliesResponse quickReplies) {
            this.quickReplies = Objects.requireNonNull(quickReplies);
            return this;
        }

        public Builder rbmCarouselRichCard(GoogleCloudDialogflowV2beta1IntentMessageRbmCarouselCardResponse rbmCarouselRichCard) {
            this.rbmCarouselRichCard = Objects.requireNonNull(rbmCarouselRichCard);
            return this;
        }

        public Builder rbmStandaloneRichCard(GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardResponse rbmStandaloneRichCard) {
            this.rbmStandaloneRichCard = Objects.requireNonNull(rbmStandaloneRichCard);
            return this;
        }

        public Builder rbmText(GoogleCloudDialogflowV2beta1IntentMessageRbmTextResponse rbmText) {
            this.rbmText = Objects.requireNonNull(rbmText);
            return this;
        }

        public Builder simpleResponses(GoogleCloudDialogflowV2beta1IntentMessageSimpleResponsesResponse simpleResponses) {
            this.simpleResponses = Objects.requireNonNull(simpleResponses);
            return this;
        }

        public Builder suggestions(GoogleCloudDialogflowV2beta1IntentMessageSuggestionsResponse suggestions) {
            this.suggestions = Objects.requireNonNull(suggestions);
            return this;
        }

        public Builder tableCard(GoogleCloudDialogflowV2beta1IntentMessageTableCardResponse tableCard) {
            this.tableCard = Objects.requireNonNull(tableCard);
            return this;
        }

        public Builder telephonyPlayAudio(GoogleCloudDialogflowV2beta1IntentMessageTelephonyPlayAudioResponse telephonyPlayAudio) {
            this.telephonyPlayAudio = Objects.requireNonNull(telephonyPlayAudio);
            return this;
        }

        public Builder telephonySynthesizeSpeech(GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeechResponse telephonySynthesizeSpeech) {
            this.telephonySynthesizeSpeech = Objects.requireNonNull(telephonySynthesizeSpeech);
            return this;
        }

        public Builder telephonyTransferCall(GoogleCloudDialogflowV2beta1IntentMessageTelephonyTransferCallResponse telephonyTransferCall) {
            this.telephonyTransferCall = Objects.requireNonNull(telephonyTransferCall);
            return this;
        }

        public Builder text(GoogleCloudDialogflowV2beta1IntentMessageTextResponse text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }
        public GoogleCloudDialogflowV2beta1IntentMessageResponse build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageResponse(basicCard, browseCarouselCard, card, carouselSelect, image, linkOutSuggestion, listSelect, mediaContent, payload, platform, quickReplies, rbmCarouselRichCard, rbmStandaloneRichCard, rbmText, simpleResponses, suggestions, tableCard, telephonyPlayAudio, telephonySynthesizeSpeech, telephonyTransferCall, text);
        }
    }
}
