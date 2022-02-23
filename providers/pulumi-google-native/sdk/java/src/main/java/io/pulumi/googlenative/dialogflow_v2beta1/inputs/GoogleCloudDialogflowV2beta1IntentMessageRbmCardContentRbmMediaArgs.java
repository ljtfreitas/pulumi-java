// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v2beta1.enums.GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMediaHeight;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Rich Business Messaging (RBM) Media displayed in Cards The following media-types are currently supported: Image Types * image/jpeg * image/jpg' * image/gif * image/png Video Types * video/h263 * video/m4v * video/mp4 * video/mpeg * video/mpeg4 * video/webm
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMediaArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMediaArgs Empty = new GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMediaArgs();

    /**
     * Publicly reachable URI of the file. The RBM platform determines the MIME type of the file from the content-type field in the HTTP headers when the platform fetches the file. The content-type field must be present and accurate in the HTTP response from the URL.
     * 
     */
    @InputImport(name="fileUri", required=true)
      private final Input<String> fileUri;

    public Input<String> getFileUri() {
        return this.fileUri;
    }

    /**
     * Required for cards with vertical orientation. The height of the media within a rich card with a vertical layout. For a standalone card with horizontal layout, height is not customizable, and this field is ignored.
     * 
     */
    @InputImport(name="height")
      private final @Nullable Input<GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMediaHeight> height;

    public Input<GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMediaHeight> getHeight() {
        return this.height == null ? Input.empty() : this.height;
    }

    /**
     * Optional. Publicly reachable URI of the thumbnail.If you don't provide a thumbnail URI, the RBM platform displays a blank placeholder thumbnail until the user's device downloads the file. Depending on the user's setting, the file may not download automatically and may require the user to tap a download button.
     * 
     */
    @InputImport(name="thumbnailUri")
      private final @Nullable Input<String> thumbnailUri;

    public Input<String> getThumbnailUri() {
        return this.thumbnailUri == null ? Input.empty() : this.thumbnailUri;
    }

    public GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMediaArgs(
        Input<String> fileUri,
        @Nullable Input<GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMediaHeight> height,
        @Nullable Input<String> thumbnailUri) {
        this.fileUri = Objects.requireNonNull(fileUri, "expected parameter 'fileUri' to be non-null");
        this.height = height;
        this.thumbnailUri = thumbnailUri;
    }

    private GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMediaArgs() {
        this.fileUri = Input.empty();
        this.height = Input.empty();
        this.thumbnailUri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMediaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> fileUri;
        private @Nullable Input<GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMediaHeight> height;
        private @Nullable Input<String> thumbnailUri;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMediaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileUri = defaults.fileUri;
    	      this.height = defaults.height;
    	      this.thumbnailUri = defaults.thumbnailUri;
        }

        public Builder setFileUri(Input<String> fileUri) {
            this.fileUri = Objects.requireNonNull(fileUri);
            return this;
        }

        public Builder setFileUri(String fileUri) {
            this.fileUri = Input.of(Objects.requireNonNull(fileUri));
            return this;
        }

        public Builder setHeight(@Nullable Input<GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMediaHeight> height) {
            this.height = height;
            return this;
        }

        public Builder setHeight(@Nullable GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMediaHeight height) {
            this.height = Input.ofNullable(height);
            return this;
        }

        public Builder setThumbnailUri(@Nullable Input<String> thumbnailUri) {
            this.thumbnailUri = thumbnailUri;
            return this;
        }

        public Builder setThumbnailUri(@Nullable String thumbnailUri) {
            this.thumbnailUri = Input.ofNullable(thumbnailUri);
            return this;
        }
        public GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMediaArgs build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMediaArgs(fileUri, height, thumbnailUri);
        }
    }
}
