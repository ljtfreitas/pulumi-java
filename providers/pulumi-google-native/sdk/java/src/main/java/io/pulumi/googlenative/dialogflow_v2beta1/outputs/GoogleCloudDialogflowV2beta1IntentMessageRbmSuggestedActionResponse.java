// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionRbmSuggestedActionDialResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionRbmSuggestedActionOpenUriResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionRbmSuggestedActionShareLocationResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionResponse {
    /**
     * Suggested client side action: Dial a phone number
     * 
     */
    private final GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionRbmSuggestedActionDialResponse dial;
    /**
     * Suggested client side action: Open a URI on device
     * 
     */
    private final GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionRbmSuggestedActionOpenUriResponse openUrl;
    /**
     * Opaque payload that the Dialogflow receives in a user event when the user taps the suggested action. This data will be also forwarded to webhook to allow performing custom business logic.
     * 
     */
    private final String postbackData;
    /**
     * Suggested client side action: Share user location
     * 
     */
    private final GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionRbmSuggestedActionShareLocationResponse shareLocation;
    /**
     * Text to display alongside the action.
     * 
     */
    private final String text;

    @CustomType.Constructor
    private GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionResponse(
        @CustomType.Parameter("dial") GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionRbmSuggestedActionDialResponse dial,
        @CustomType.Parameter("openUrl") GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionRbmSuggestedActionOpenUriResponse openUrl,
        @CustomType.Parameter("postbackData") String postbackData,
        @CustomType.Parameter("shareLocation") GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionRbmSuggestedActionShareLocationResponse shareLocation,
        @CustomType.Parameter("text") String text) {
        this.dial = dial;
        this.openUrl = openUrl;
        this.postbackData = postbackData;
        this.shareLocation = shareLocation;
        this.text = text;
    }

    /**
     * Suggested client side action: Dial a phone number
     * 
    */
    public GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionRbmSuggestedActionDialResponse getDial() {
        return this.dial;
    }
    /**
     * Suggested client side action: Open a URI on device
     * 
    */
    public GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionRbmSuggestedActionOpenUriResponse getOpenUrl() {
        return this.openUrl;
    }
    /**
     * Opaque payload that the Dialogflow receives in a user event when the user taps the suggested action. This data will be also forwarded to webhook to allow performing custom business logic.
     * 
    */
    public String getPostbackData() {
        return this.postbackData;
    }
    /**
     * Suggested client side action: Share user location
     * 
    */
    public GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionRbmSuggestedActionShareLocationResponse getShareLocation() {
        return this.shareLocation;
    }
    /**
     * Text to display alongside the action.
     * 
    */
    public String getText() {
        return this.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionRbmSuggestedActionDialResponse dial;
        private GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionRbmSuggestedActionOpenUriResponse openUrl;
        private String postbackData;
        private GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionRbmSuggestedActionShareLocationResponse shareLocation;
        private String text;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dial = defaults.dial;
    	      this.openUrl = defaults.openUrl;
    	      this.postbackData = defaults.postbackData;
    	      this.shareLocation = defaults.shareLocation;
    	      this.text = defaults.text;
        }

        public Builder dial(GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionRbmSuggestedActionDialResponse dial) {
            this.dial = Objects.requireNonNull(dial);
            return this;
        }

        public Builder openUrl(GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionRbmSuggestedActionOpenUriResponse openUrl) {
            this.openUrl = Objects.requireNonNull(openUrl);
            return this;
        }

        public Builder postbackData(String postbackData) {
            this.postbackData = Objects.requireNonNull(postbackData);
            return this;
        }

        public Builder shareLocation(GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionRbmSuggestedActionShareLocationResponse shareLocation) {
            this.shareLocation = Objects.requireNonNull(shareLocation);
            return this;
        }

        public Builder text(String text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }
        public GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionResponse build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionResponse(dial, openUrl, postbackData, shareLocation, text);
        }
    }
}
