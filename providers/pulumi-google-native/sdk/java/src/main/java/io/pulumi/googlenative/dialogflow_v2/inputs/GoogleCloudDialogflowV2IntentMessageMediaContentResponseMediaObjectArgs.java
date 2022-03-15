// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="contentUrl", required=true)
      private final Output<String> contentUrl;

    public Output<String> getContentUrl() {
        return this.contentUrl;
    }

    /**
     * Optional. Description of media card.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Optional. Icon to display above media content.
     * 
     */
    @Import(name="icon")
      private final @Nullable Output<GoogleCloudDialogflowV2IntentMessageImageArgs> icon;

    public Output<GoogleCloudDialogflowV2IntentMessageImageArgs> getIcon() {
        return this.icon == null ? Output.empty() : this.icon;
    }

    /**
     * Optional. Image to display above media content.
     * 
     */
    @Import(name="largeImage")
      private final @Nullable Output<GoogleCloudDialogflowV2IntentMessageImageArgs> largeImage;

    public Output<GoogleCloudDialogflowV2IntentMessageImageArgs> getLargeImage() {
        return this.largeImage == null ? Output.empty() : this.largeImage;
    }

    /**
     * Name of media card.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    public GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectArgs(
        Output<String> contentUrl,
        @Nullable Output<String> description,
        @Nullable Output<GoogleCloudDialogflowV2IntentMessageImageArgs> icon,
        @Nullable Output<GoogleCloudDialogflowV2IntentMessageImageArgs> largeImage,
        Output<String> name) {
        this.contentUrl = Objects.requireNonNull(contentUrl, "expected parameter 'contentUrl' to be non-null");
        this.description = description;
        this.icon = icon;
        this.largeImage = largeImage;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectArgs() {
        this.contentUrl = Output.empty();
        this.description = Output.empty();
        this.icon = Output.empty();
        this.largeImage = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> contentUrl;
        private @Nullable Output<String> description;
        private @Nullable Output<GoogleCloudDialogflowV2IntentMessageImageArgs> icon;
        private @Nullable Output<GoogleCloudDialogflowV2IntentMessageImageArgs> largeImage;
        private Output<String> name;

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

        public Builder contentUrl(Output<String> contentUrl) {
            this.contentUrl = Objects.requireNonNull(contentUrl);
            return this;
        }

        public Builder contentUrl(String contentUrl) {
            this.contentUrl = Output.of(Objects.requireNonNull(contentUrl));
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder icon(@Nullable Output<GoogleCloudDialogflowV2IntentMessageImageArgs> icon) {
            this.icon = icon;
            return this;
        }

        public Builder icon(@Nullable GoogleCloudDialogflowV2IntentMessageImageArgs icon) {
            this.icon = Output.ofNullable(icon);
            return this;
        }

        public Builder largeImage(@Nullable Output<GoogleCloudDialogflowV2IntentMessageImageArgs> largeImage) {
            this.largeImage = largeImage;
            return this;
        }

        public Builder largeImage(@Nullable GoogleCloudDialogflowV2IntentMessageImageArgs largeImage) {
            this.largeImage = Output.ofNullable(largeImage);
            return this;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectArgs build() {
            return new GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectArgs(contentUrl, description, icon, largeImage, name);
        }
    }
}
