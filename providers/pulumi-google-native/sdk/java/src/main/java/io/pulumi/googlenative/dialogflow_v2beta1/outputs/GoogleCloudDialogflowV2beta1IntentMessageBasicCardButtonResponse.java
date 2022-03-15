// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonOpenUriActionResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonResponse {
    /**
     * Action to take when a user taps on the button.
     * 
     */
    private final GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonOpenUriActionResponse openUriAction;
    /**
     * The title of the button.
     * 
     */
    private final String title;

    @CustomType.Constructor
    private GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonResponse(
        @CustomType.Parameter("openUriAction") GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonOpenUriActionResponse openUriAction,
        @CustomType.Parameter("title") String title) {
        this.openUriAction = openUriAction;
        this.title = title;
    }

    /**
     * Action to take when a user taps on the button.
     * 
    */
    public GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonOpenUriActionResponse getOpenUriAction() {
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

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonOpenUriActionResponse openUriAction;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.openUriAction = defaults.openUriAction;
    	      this.title = defaults.title;
        }

        public Builder openUriAction(GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonOpenUriActionResponse openUriAction) {
            this.openUriAction = Objects.requireNonNull(openUriAction);
            return this;
        }

        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }
        public GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonResponse build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonResponse(openUriAction, title);
        }
    }
}
