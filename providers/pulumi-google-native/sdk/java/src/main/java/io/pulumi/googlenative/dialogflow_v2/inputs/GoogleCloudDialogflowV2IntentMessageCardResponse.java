// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageCardButtonResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GoogleCloudDialogflowV2IntentMessageCardResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2IntentMessageCardResponse Empty = new GoogleCloudDialogflowV2IntentMessageCardResponse();

    @InputImport(name="buttons", required=true)
    private final List<GoogleCloudDialogflowV2IntentMessageCardButtonResponse> buttons;

    public List<GoogleCloudDialogflowV2IntentMessageCardButtonResponse> getButtons() {
        return this.buttons;
    }

    @InputImport(name="imageUri", required=true)
    private final String imageUri;

    public String getImageUri() {
        return this.imageUri;
    }

    @InputImport(name="subtitle", required=true)
    private final String subtitle;

    public String getSubtitle() {
        return this.subtitle;
    }

    @InputImport(name="title", required=true)
    private final String title;

    public String getTitle() {
        return this.title;
    }

    public GoogleCloudDialogflowV2IntentMessageCardResponse(
        List<GoogleCloudDialogflowV2IntentMessageCardButtonResponse> buttons,
        String imageUri,
        String subtitle,
        String title) {
        this.buttons = Objects.requireNonNull(buttons, "expected parameter 'buttons' to be non-null");
        this.imageUri = Objects.requireNonNull(imageUri, "expected parameter 'imageUri' to be non-null");
        this.subtitle = Objects.requireNonNull(subtitle, "expected parameter 'subtitle' to be non-null");
        this.title = Objects.requireNonNull(title, "expected parameter 'title' to be non-null");
    }

    private GoogleCloudDialogflowV2IntentMessageCardResponse() {
        this.buttons = List.of();
        this.imageUri = null;
        this.subtitle = null;
        this.title = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageCardResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowV2IntentMessageCardButtonResponse> buttons;
        private String imageUri;
        private String subtitle;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageCardResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buttons = defaults.buttons;
    	      this.imageUri = defaults.imageUri;
    	      this.subtitle = defaults.subtitle;
    	      this.title = defaults.title;
        }

        public Builder setButtons(List<GoogleCloudDialogflowV2IntentMessageCardButtonResponse> buttons) {
            this.buttons = Objects.requireNonNull(buttons);
            return this;
        }

        public Builder setImageUri(String imageUri) {
            this.imageUri = Objects.requireNonNull(imageUri);
            return this;
        }

        public Builder setSubtitle(String subtitle) {
            this.subtitle = Objects.requireNonNull(subtitle);
            return this;
        }

        public Builder setTitle(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }

        public GoogleCloudDialogflowV2IntentMessageCardResponse build() {
            return new GoogleCloudDialogflowV2IntentMessageCardResponse(buttons, imageUri, subtitle, title);
        }
    }
}