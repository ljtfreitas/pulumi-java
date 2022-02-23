// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageImageArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Response media object for media content card.
 * 
 */
public final class GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectArgs Empty = new GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectArgs();

    /**
     * Url where the media is stored.
     * 
     */
    @InputImport(name="contentUrl", required=true)
      private final Input<String> contentUrl;

    public Input<String> getContentUrl() {
        return this.contentUrl;
    }

    /**
     * Optional. Description of media card.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Optional. Icon to display above media content.
     * 
     */
    @InputImport(name="icon")
      private final @Nullable Input<GoogleCloudDialogflowV2IntentMessageImageArgs> icon;

    public Input<GoogleCloudDialogflowV2IntentMessageImageArgs> getIcon() {
        return this.icon == null ? Input.empty() : this.icon;
    }

    /**
     * Optional. Image to display above media content.
     * 
     */
    @InputImport(name="largeImage")
      private final @Nullable Input<GoogleCloudDialogflowV2IntentMessageImageArgs> largeImage;

    public Input<GoogleCloudDialogflowV2IntentMessageImageArgs> getLargeImage() {
        return this.largeImage == null ? Input.empty() : this.largeImage;
    }

    /**
     * Name of media card.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    public GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectArgs(
        Input<String> contentUrl,
        @Nullable Input<String> description,
        @Nullable Input<GoogleCloudDialogflowV2IntentMessageImageArgs> icon,
        @Nullable Input<GoogleCloudDialogflowV2IntentMessageImageArgs> largeImage,
        Input<String> name) {
        this.contentUrl = Objects.requireNonNull(contentUrl, "expected parameter 'contentUrl' to be non-null");
        this.description = description;
        this.icon = icon;
        this.largeImage = largeImage;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectArgs() {
        this.contentUrl = Input.empty();
        this.description = Input.empty();
        this.icon = Input.empty();
        this.largeImage = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> contentUrl;
        private @Nullable Input<String> description;
        private @Nullable Input<GoogleCloudDialogflowV2IntentMessageImageArgs> icon;
        private @Nullable Input<GoogleCloudDialogflowV2IntentMessageImageArgs> largeImage;
        private Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentUrl = defaults.contentUrl;
    	      this.description = defaults.description;
    	      this.icon = defaults.icon;
    	      this.largeImage = defaults.largeImage;
    	      this.name = defaults.name;
        }

        public Builder setContentUrl(Input<String> contentUrl) {
            this.contentUrl = Objects.requireNonNull(contentUrl);
            return this;
        }

        public Builder setContentUrl(String contentUrl) {
            this.contentUrl = Input.of(Objects.requireNonNull(contentUrl));
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setIcon(@Nullable Input<GoogleCloudDialogflowV2IntentMessageImageArgs> icon) {
            this.icon = icon;
            return this;
        }

        public Builder setIcon(@Nullable GoogleCloudDialogflowV2IntentMessageImageArgs icon) {
            this.icon = Input.ofNullable(icon);
            return this;
        }

        public Builder setLargeImage(@Nullable Input<GoogleCloudDialogflowV2IntentMessageImageArgs> largeImage) {
            this.largeImage = largeImage;
            return this;
        }

        public Builder setLargeImage(@Nullable GoogleCloudDialogflowV2IntentMessageImageArgs largeImage) {
            this.largeImage = Input.ofNullable(largeImage);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }
        public GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectArgs build() {
            return new GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectArgs(contentUrl, description, icon, largeImage, name);
        }
    }
}
