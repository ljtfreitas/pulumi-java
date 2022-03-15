// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Rich Business Messaging (RBM) suggested reply that the user can click instead of typing in their own response.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedReplyResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedReplyResponse Empty = new GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedReplyResponse();

    /**
     * Opaque payload that the Dialogflow receives in a user event when the user taps the suggested reply. This data will be also forwarded to webhook to allow performing custom business logic.
     * 
     */
    @Import(name="postbackData", required=true)
      private final String postbackData;

    public String getPostbackData() {
        return this.postbackData;
    }

    /**
     * Suggested reply text.
     * 
     */
    @Import(name="text", required=true)
      private final String text;

    public String getText() {
        return this.text;
    }

    public GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedReplyResponse(
        String postbackData,
        String text) {
        this.postbackData = Objects.requireNonNull(postbackData, "expected parameter 'postbackData' to be non-null");
        this.text = Objects.requireNonNull(text, "expected parameter 'text' to be non-null");
    }

    private GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedReplyResponse() {
        this.postbackData = null;
        this.text = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedReplyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String postbackData;
        private String text;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedReplyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.postbackData = defaults.postbackData;
    	      this.text = defaults.text;
        }

        public Builder postbackData(String postbackData) {
            this.postbackData = Objects.requireNonNull(postbackData);
            return this;
        }

        public Builder text(String text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }
        public GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedReplyResponse build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedReplyResponse(postbackData, text);
        }
    }
}
