// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Cell of TableCardRow.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageTableCardCellResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageTableCardCellResponse Empty = new GoogleCloudDialogflowV2beta1IntentMessageTableCardCellResponse();

    /**
     * Text in this cell.
     * 
     */
    @InputImport(name="text", required=true)
      private final String text;

    public String getText() {
        return this.text;
    }

    public GoogleCloudDialogflowV2beta1IntentMessageTableCardCellResponse(String text) {
        this.text = Objects.requireNonNull(text, "expected parameter 'text' to be non-null");
    }

    private GoogleCloudDialogflowV2beta1IntentMessageTableCardCellResponse() {
        this.text = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageTableCardCellResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String text;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageTableCardCellResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.text = defaults.text;
        }

        public Builder setText(String text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }
        public GoogleCloudDialogflowV2beta1IntentMessageTableCardCellResponse build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageTableCardCellResponse(text);
        }
    }
}
