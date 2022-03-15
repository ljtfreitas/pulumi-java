// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Optional. Contains information about a button.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageCardButtonArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageCardButtonArgs Empty = new GoogleCloudDialogflowV2beta1IntentMessageCardButtonArgs();

    /**
     * Optional. The text to send back to the Dialogflow API or a URI to open.
     * 
     */
    @Import(name="postback")
      private final @Nullable Output<String> postback;

    public Output<String> getPostback() {
        return this.postback == null ? Output.empty() : this.postback;
    }

    /**
     * Optional. The text to show on the button.
     * 
     */
    @Import(name="text")
      private final @Nullable Output<String> text;

    public Output<String> getText() {
        return this.text == null ? Output.empty() : this.text;
    }

    public GoogleCloudDialogflowV2beta1IntentMessageCardButtonArgs(
        @Nullable Output<String> postback,
        @Nullable Output<String> text) {
        this.postback = postback;
        this.text = text;
    }

    private GoogleCloudDialogflowV2beta1IntentMessageCardButtonArgs() {
        this.postback = Output.empty();
        this.text = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageCardButtonArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> postback;
        private @Nullable Output<String> text;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageCardButtonArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.postback = defaults.postback;
    	      this.text = defaults.text;
        }

        public Builder postback(@Nullable Output<String> postback) {
            this.postback = postback;
            return this;
        }

        public Builder postback(@Nullable String postback) {
            this.postback = Output.ofNullable(postback);
            return this;
        }

        public Builder text(@Nullable Output<String> text) {
            this.text = text;
            return this;
        }

        public Builder text(@Nullable String text) {
            this.text = Output.ofNullable(text);
            return this;
        }
        public GoogleCloudDialogflowV2beta1IntentMessageCardButtonArgs build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageCardButtonArgs(postback, text);
        }
    }
}
