// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v2beta1.enums.GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardCardOrientation;
import io.pulumi.googlenative.dialogflow_v2beta1.enums.GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardThumbnailImageAlignment;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardArgs Empty = new GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardArgs();

    @InputImport(name="cardContent", required=true)
    private final Input<GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentArgs> cardContent;

    public Input<GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentArgs> getCardContent() {
        return this.cardContent;
    }

    @InputImport(name="cardOrientation", required=true)
    private final Input<GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardCardOrientation> cardOrientation;

    public Input<GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardCardOrientation> getCardOrientation() {
        return this.cardOrientation;
    }

    @InputImport(name="thumbnailImageAlignment")
    private final @Nullable Input<GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardThumbnailImageAlignment> thumbnailImageAlignment;

    public Input<GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardThumbnailImageAlignment> getThumbnailImageAlignment() {
        return this.thumbnailImageAlignment == null ? Input.empty() : this.thumbnailImageAlignment;
    }

    public GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardArgs(
        Input<GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentArgs> cardContent,
        Input<GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardCardOrientation> cardOrientation,
        @Nullable Input<GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardThumbnailImageAlignment> thumbnailImageAlignment) {
        this.cardContent = Objects.requireNonNull(cardContent, "expected parameter 'cardContent' to be non-null");
        this.cardOrientation = Objects.requireNonNull(cardOrientation, "expected parameter 'cardOrientation' to be non-null");
        this.thumbnailImageAlignment = thumbnailImageAlignment;
    }

    private GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardArgs() {
        this.cardContent = Input.empty();
        this.cardOrientation = Input.empty();
        this.thumbnailImageAlignment = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentArgs> cardContent;
        private Input<GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardCardOrientation> cardOrientation;
        private @Nullable Input<GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardThumbnailImageAlignment> thumbnailImageAlignment;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cardContent = defaults.cardContent;
    	      this.cardOrientation = defaults.cardOrientation;
    	      this.thumbnailImageAlignment = defaults.thumbnailImageAlignment;
        }

        public Builder setCardContent(Input<GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentArgs> cardContent) {
            this.cardContent = Objects.requireNonNull(cardContent);
            return this;
        }

        public Builder setCardContent(GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentArgs cardContent) {
            this.cardContent = Input.of(Objects.requireNonNull(cardContent));
            return this;
        }

        public Builder setCardOrientation(Input<GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardCardOrientation> cardOrientation) {
            this.cardOrientation = Objects.requireNonNull(cardOrientation);
            return this;
        }

        public Builder setCardOrientation(GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardCardOrientation cardOrientation) {
            this.cardOrientation = Input.of(Objects.requireNonNull(cardOrientation));
            return this;
        }

        public Builder setThumbnailImageAlignment(@Nullable Input<GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardThumbnailImageAlignment> thumbnailImageAlignment) {
            this.thumbnailImageAlignment = thumbnailImageAlignment;
            return this;
        }

        public Builder setThumbnailImageAlignment(@Nullable GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardThumbnailImageAlignment thumbnailImageAlignment) {
            this.thumbnailImageAlignment = Input.ofNullable(thumbnailImageAlignment);
            return this;
        }

        public GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardArgs build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageRbmStandaloneCardArgs(cardContent, cardOrientation, thumbnailImageAlignment);
        }
    }
}