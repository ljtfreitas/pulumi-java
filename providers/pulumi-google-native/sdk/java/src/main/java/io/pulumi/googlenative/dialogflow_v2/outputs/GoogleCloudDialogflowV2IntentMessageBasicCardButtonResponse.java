// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriActionResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowV2IntentMessageBasicCardButtonResponse {
    /**
     * Action to take when a user taps on the button.
     * 
     */
    private final GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriActionResponse openUriAction;
    /**
     * The title of the button.
     * 
     */
    private final String title;

    @OutputCustomType.Constructor({"openUriAction","title"})
    private GoogleCloudDialogflowV2IntentMessageBasicCardButtonResponse(
        GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriActionResponse openUriAction,
        String title) {
        this.openUriAction = Objects.requireNonNull(openUriAction);
        this.title = Objects.requireNonNull(title);
    }

    /**
     * Action to take when a user taps on the button.
     * 
     */
    public GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriActionResponse getOpenUriAction() {
        return this.openUriAction;
    }
    /**
     * The title of the button.
     * 
     */
    public String getTitle() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageBasicCardButtonResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriActionResponse openUriAction;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageBasicCardButtonResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.openUriAction = defaults.openUriAction;
    	      this.title = defaults.title;
        }

        public Builder setOpenUriAction(GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriActionResponse openUriAction) {
            this.openUriAction = Objects.requireNonNull(openUriAction);
            return this;
        }

        public Builder setTitle(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }
        public GoogleCloudDialogflowV2IntentMessageBasicCardButtonResponse build() {
            return new GoogleCloudDialogflowV2IntentMessageBasicCardButtonResponse(openUriAction, title);
        }
    }
}
