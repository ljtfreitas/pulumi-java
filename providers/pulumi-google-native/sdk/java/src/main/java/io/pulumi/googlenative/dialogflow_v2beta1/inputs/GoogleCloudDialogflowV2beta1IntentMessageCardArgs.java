// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageCardButtonArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The card response message.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageCardArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageCardArgs Empty = new GoogleCloudDialogflowV2beta1IntentMessageCardArgs();

    /**
     * Optional. The collection of card buttons.
     * 
     */
    @InputImport(name="buttons")
      private final @Nullable Input<List<GoogleCloudDialogflowV2beta1IntentMessageCardButtonArgs>> buttons;

    public Input<List<GoogleCloudDialogflowV2beta1IntentMessageCardButtonArgs>> getButtons() {
        return this.buttons == null ? Input.empty() : this.buttons;
    }

    /**
     * Optional. The public URI to an image file for the card.
     * 
     */
    @InputImport(name="imageUri")
      private final @Nullable Input<String> imageUri;

    public Input<String> getImageUri() {
        return this.imageUri == null ? Input.empty() : this.imageUri;
    }

    /**
     * Optional. The subtitle of the card.
     * 
     */
    @InputImport(name="subtitle")
      private final @Nullable Input<String> subtitle;

    public Input<String> getSubtitle() {
        return this.subtitle == null ? Input.empty() : this.subtitle;
    }

    /**
     * Optional. The title of the card.
     * 
     */
    @InputImport(name="title")
      private final @Nullable Input<String> title;

    public Input<String> getTitle() {
        return this.title == null ? Input.empty() : this.title;
    }

    public GoogleCloudDialogflowV2beta1IntentMessageCardArgs(
        @Nullable Input<List<GoogleCloudDialogflowV2beta1IntentMessageCardButtonArgs>> buttons,
        @Nullable Input<String> imageUri,
        @Nullable Input<String> subtitle,
        @Nullable Input<String> title) {
        this.buttons = buttons;
        this.imageUri = imageUri;
        this.subtitle = subtitle;
        this.title = title;
    }

    private GoogleCloudDialogflowV2beta1IntentMessageCardArgs() {
        this.buttons = Input.empty();
        this.imageUri = Input.empty();
        this.subtitle = Input.empty();
        this.title = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageCardArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<GoogleCloudDialogflowV2beta1IntentMessageCardButtonArgs>> buttons;
        private @Nullable Input<String> imageUri;
        private @Nullable Input<String> subtitle;
        private @Nullable Input<String> title;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageCardArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buttons = defaults.buttons;
    	      this.imageUri = defaults.imageUri;
    	      this.subtitle = defaults.subtitle;
    	      this.title = defaults.title;
        }

        public Builder setButtons(@Nullable Input<List<GoogleCloudDialogflowV2beta1IntentMessageCardButtonArgs>> buttons) {
            this.buttons = buttons;
            return this;
        }

        public Builder setButtons(@Nullable List<GoogleCloudDialogflowV2beta1IntentMessageCardButtonArgs> buttons) {
            this.buttons = Input.ofNullable(buttons);
            return this;
        }

        public Builder setImageUri(@Nullable Input<String> imageUri) {
            this.imageUri = imageUri;
            return this;
        }

        public Builder setImageUri(@Nullable String imageUri) {
            this.imageUri = Input.ofNullable(imageUri);
            return this;
        }

        public Builder setSubtitle(@Nullable Input<String> subtitle) {
            this.subtitle = subtitle;
            return this;
        }

        public Builder setSubtitle(@Nullable String subtitle) {
            this.subtitle = Input.ofNullable(subtitle);
            return this;
        }

        public Builder setTitle(@Nullable Input<String> title) {
            this.title = title;
            return this;
        }

        public Builder setTitle(@Nullable String title) {
            this.title = Input.ofNullable(title);
            return this;
        }
        public GoogleCloudDialogflowV2beta1IntentMessageCardArgs build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageCardArgs(buttons, imageUri, subtitle, title);
        }
    }
}
