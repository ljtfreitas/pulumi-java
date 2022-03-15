// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Column properties for TableCard.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesResponse Empty = new GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesResponse();

    /**
     * Column heading.
     * 
     */
    @Import(name="header", required=true)
      private final String header;

    public String getHeader() {
        return this.header;
    }

    /**
     * Optional. Defines text alignment for all cells in this column.
     * 
     */
    @Import(name="horizontalAlignment", required=true)
      private final String horizontalAlignment;

    public String getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    public GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesResponse(
        String header,
        String horizontalAlignment) {
        this.header = Objects.requireNonNull(header, "expected parameter 'header' to be non-null");
        this.horizontalAlignment = Objects.requireNonNull(horizontalAlignment, "expected parameter 'horizontalAlignment' to be non-null");
    }

    private GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesResponse() {
        this.header = null;
        this.horizontalAlignment = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String header;
        private String horizontalAlignment;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.header = defaults.header;
    	      this.horizontalAlignment = defaults.horizontalAlignment;
        }

        public Builder header(String header) {
            this.header = Objects.requireNonNull(header);
            return this;
        }

        public Builder horizontalAlignment(String horizontalAlignment) {
            this.horizontalAlignment = Objects.requireNonNull(horizontalAlignment);
            return this;
        }
        public GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesResponse build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesResponse(header, horizontalAlignment);
        }
    }
}
