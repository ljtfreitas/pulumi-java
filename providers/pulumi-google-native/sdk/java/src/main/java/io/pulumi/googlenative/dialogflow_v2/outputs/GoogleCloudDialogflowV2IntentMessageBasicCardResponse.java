// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2IntentMessageBasicCardButtonResponse;
import io.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2IntentMessageImageResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowV2IntentMessageBasicCardResponse {
    /**
     * Optional. The collection of card buttons.
     * 
     */
    private final List<GoogleCloudDialogflowV2IntentMessageBasicCardButtonResponse> buttons;
    /**
     * Required, unless image is present. The body text of the card.
     * 
     */
    private final String formattedText;
    /**
     * Optional. The image for the card.
     * 
     */
    private final GoogleCloudDialogflowV2IntentMessageImageResponse image;
    /**
     * Optional. The subtitle of the card.
     * 
     */
    private final String subtitle;
    /**
     * Optional. The title of the card.
     * 
     */
    private final String title;

    @CustomType.Constructor
    private GoogleCloudDialogflowV2IntentMessageBasicCardResponse(
        @CustomType.Parameter("buttons") List<GoogleCloudDialogflowV2IntentMessageBasicCardButtonResponse> buttons,
        @CustomType.Parameter("formattedText") String formattedText,
        @CustomType.Parameter("image") GoogleCloudDialogflowV2IntentMessageImageResponse image,
        @CustomType.Parameter("subtitle") String subtitle,
        @CustomType.Parameter("title") String title) {
        this.buttons = buttons;
        this.formattedText = formattedText;
        this.image = image;
        this.subtitle = subtitle;
        this.title = title;
    }

    /**
     * Optional. The collection of card buttons.
     * 
    */
    public List<GoogleCloudDialogflowV2IntentMessageBasicCardButtonResponse> getButtons() {
        return this.buttons;
    }
    /**
     * Required, unless image is present. The body text of the card.
     * 
    */
    public String getFormattedText() {
        return this.formattedText;
    }
    /**
     * Optional. The image for the card.
     * 
    */
    public GoogleCloudDialogflowV2IntentMessageImageResponse getImage() {
        return this.image;
    }
    /**
     * Optional. The subtitle of the card.
     * 
    */
    public String getSubtitle() {
        return this.subtitle;
    }
    /**
     * Optional. The title of the card.
     * 
    */
    public String getTitle() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageBasicCardResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowV2IntentMessageBasicCardButtonResponse> buttons;
        private String formattedText;
        private GoogleCloudDialogflowV2IntentMessageImageResponse image;
        private String subtitle;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageBasicCardResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buttons = defaults.buttons;
    	      this.formattedText = defaults.formattedText;
    	      this.image = defaults.image;
    	      this.subtitle = defaults.subtitle;
    	      this.title = defaults.title;
        }

        public Builder buttons(List<GoogleCloudDialogflowV2IntentMessageBasicCardButtonResponse> buttons) {
            this.buttons = Objects.requireNonNull(buttons);
            return this;
        }

        public Builder formattedText(String formattedText) {
            this.formattedText = Objects.requireNonNull(formattedText);
            return this;
        }

        public Builder image(GoogleCloudDialogflowV2IntentMessageImageResponse image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }

        public Builder subtitle(String subtitle) {
            this.subtitle = Objects.requireNonNull(subtitle);
            return this;
        }

        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }
        public GoogleCloudDialogflowV2IntentMessageBasicCardResponse build() {
            return new GoogleCloudDialogflowV2IntentMessageBasicCardResponse(buttons, formattedText, image, subtitle, title);
        }
    }
}
