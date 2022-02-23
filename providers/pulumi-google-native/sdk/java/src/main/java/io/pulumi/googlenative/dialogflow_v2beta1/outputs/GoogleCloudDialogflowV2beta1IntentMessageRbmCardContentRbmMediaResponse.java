// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMediaResponse {
    /**
     * Publicly reachable URI of the file. The RBM platform determines the MIME type of the file from the content-type field in the HTTP headers when the platform fetches the file. The content-type field must be present and accurate in the HTTP response from the URL.
     * 
     */
    private final String fileUri;
    /**
     * Required for cards with vertical orientation. The height of the media within a rich card with a vertical layout. For a standalone card with horizontal layout, height is not customizable, and this field is ignored.
     * 
     */
    private final String height;
    /**
     * Optional. Publicly reachable URI of the thumbnail.If you don't provide a thumbnail URI, the RBM platform displays a blank placeholder thumbnail until the user's device downloads the file. Depending on the user's setting, the file may not download automatically and may require the user to tap a download button.
     * 
     */
    private final String thumbnailUri;

    @OutputCustomType.Constructor({"fileUri","height","thumbnailUri"})
    private GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMediaResponse(
        String fileUri,
        String height,
        String thumbnailUri) {
        this.fileUri = Objects.requireNonNull(fileUri);
        this.height = Objects.requireNonNull(height);
        this.thumbnailUri = Objects.requireNonNull(thumbnailUri);
    }

    /**
     * Publicly reachable URI of the file. The RBM platform determines the MIME type of the file from the content-type field in the HTTP headers when the platform fetches the file. The content-type field must be present and accurate in the HTTP response from the URL.
     * 
     */
    public String getFileUri() {
        return this.fileUri;
    }
    /**
     * Required for cards with vertical orientation. The height of the media within a rich card with a vertical layout. For a standalone card with horizontal layout, height is not customizable, and this field is ignored.
     * 
     */
    public String getHeight() {
        return this.height;
    }
    /**
     * Optional. Publicly reachable URI of the thumbnail.If you don't provide a thumbnail URI, the RBM platform displays a blank placeholder thumbnail until the user's device downloads the file. Depending on the user's setting, the file may not download automatically and may require the user to tap a download button.
     * 
     */
    public String getThumbnailUri() {
        return this.thumbnailUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMediaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String fileUri;
        private String height;
        private String thumbnailUri;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMediaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileUri = defaults.fileUri;
    	      this.height = defaults.height;
    	      this.thumbnailUri = defaults.thumbnailUri;
        }

        public Builder setFileUri(String fileUri) {
            this.fileUri = Objects.requireNonNull(fileUri);
            return this;
        }

        public Builder setHeight(String height) {
            this.height = Objects.requireNonNull(height);
            return this;
        }

        public Builder setThumbnailUri(String thumbnailUri) {
            this.thumbnailUri = Objects.requireNonNull(thumbnailUri);
            return this;
        }
        public GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMediaResponse build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageRbmCardContentRbmMediaResponse(fileUri, height, thumbnailUri);
        }
    }
}
