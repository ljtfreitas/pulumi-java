// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The text response message.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageTextResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageTextResponse Empty = new GoogleCloudDialogflowV2beta1IntentMessageTextResponse();

    /**
     * Optional. The collection of the agent's responses.
     * 
     */
    @Import(name="text", required=true)
      private final List<String> text;

    public List<String> getText() {
        return this.text;
    }

    public GoogleCloudDialogflowV2beta1IntentMessageTextResponse(List<String> text) {
        this.text = Objects.requireNonNull(text, "expected parameter 'text' to be non-null");
    }

    private GoogleCloudDialogflowV2beta1IntentMessageTextResponse() {
        this.text = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageTextResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> text;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageTextResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.text = defaults.text;
        }

        public Builder text(List<String> text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }
        public GoogleCloudDialogflowV2beta1IntentMessageTextResponse build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageTextResponse(text);
        }
    }
}
