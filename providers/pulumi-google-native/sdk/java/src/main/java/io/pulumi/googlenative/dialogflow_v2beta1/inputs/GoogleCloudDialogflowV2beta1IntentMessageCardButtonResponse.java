// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Optional. Contains information about a button.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageCardButtonResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageCardButtonResponse Empty = new GoogleCloudDialogflowV2beta1IntentMessageCardButtonResponse();

    /**
     * Optional. The text to send back to the Dialogflow API or a URI to open.
     * 
     */
    @Import(name="postback", required=true)
      private final String postback;

    public String getPostback() {
        return this.postback;
    }

    /**
     * Optional. The text to show on the button.
     * 
     */
    @Import(name="text", required=true)
      private final String text;

    public String getText() {
        return this.text;
    }

    public GoogleCloudDialogflowV2beta1IntentMessageCardButtonResponse(
        String postback,
        String text) {
        this.postback = Objects.requireNonNull(postback, "expected parameter 'postback' to be non-null");
        this.text = Objects.requireNonNull(text, "expected parameter 'text' to be non-null");
    }

    private GoogleCloudDialogflowV2beta1IntentMessageCardButtonResponse() {
        this.postback = null;
        this.text = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageCardButtonResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String postback;
        private String text;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageCardButtonResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.postback = defaults.postback;
    	      this.text = defaults.text;
        }

        public Builder postback(String postback) {
            this.postback = Objects.requireNonNull(postback);
            return this;
        }

        public Builder text(String text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }
        public GoogleCloudDialogflowV2beta1IntentMessageCardButtonResponse build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageCardButtonResponse(postback, text);
        }
    }
}
