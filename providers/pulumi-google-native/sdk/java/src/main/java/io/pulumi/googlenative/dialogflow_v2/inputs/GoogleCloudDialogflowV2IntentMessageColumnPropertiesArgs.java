// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v2.enums.GoogleCloudDialogflowV2IntentMessageColumnPropertiesHorizontalAlignment;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Column properties for TableCard.
 * 
 */
public final class GoogleCloudDialogflowV2IntentMessageColumnPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2IntentMessageColumnPropertiesArgs Empty = new GoogleCloudDialogflowV2IntentMessageColumnPropertiesArgs();

    /**
     * Column heading.
     * 
     */
    @InputImport(name="header", required=true)
      private final Input<String> header;

    public Input<String> getHeader() {
        return this.header;
    }

    /**
     * Optional. Defines text alignment for all cells in this column.
     * 
     */
    @InputImport(name="horizontalAlignment")
      private final @Nullable Input<GoogleCloudDialogflowV2IntentMessageColumnPropertiesHorizontalAlignment> horizontalAlignment;

    public Input<GoogleCloudDialogflowV2IntentMessageColumnPropertiesHorizontalAlignment> getHorizontalAlignment() {
        return this.horizontalAlignment == null ? Input.empty() : this.horizontalAlignment;
    }

    public GoogleCloudDialogflowV2IntentMessageColumnPropertiesArgs(
        Input<String> header,
        @Nullable Input<GoogleCloudDialogflowV2IntentMessageColumnPropertiesHorizontalAlignment> horizontalAlignment) {
        this.header = Objects.requireNonNull(header, "expected parameter 'header' to be non-null");
        this.horizontalAlignment = horizontalAlignment;
    }

    private GoogleCloudDialogflowV2IntentMessageColumnPropertiesArgs() {
        this.header = Input.empty();
        this.horizontalAlignment = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageColumnPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> header;
        private @Nullable Input<GoogleCloudDialogflowV2IntentMessageColumnPropertiesHorizontalAlignment> horizontalAlignment;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageColumnPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.header = defaults.header;
    	      this.horizontalAlignment = defaults.horizontalAlignment;
        }

        public Builder setHeader(Input<String> header) {
            this.header = Objects.requireNonNull(header);
            return this;
        }

        public Builder setHeader(String header) {
            this.header = Input.of(Objects.requireNonNull(header));
            return this;
        }

        public Builder setHorizontalAlignment(@Nullable Input<GoogleCloudDialogflowV2IntentMessageColumnPropertiesHorizontalAlignment> horizontalAlignment) {
            this.horizontalAlignment = horizontalAlignment;
            return this;
        }

        public Builder setHorizontalAlignment(@Nullable GoogleCloudDialogflowV2IntentMessageColumnPropertiesHorizontalAlignment horizontalAlignment) {
            this.horizontalAlignment = Input.ofNullable(horizontalAlignment);
            return this;
        }
        public GoogleCloudDialogflowV2IntentMessageColumnPropertiesArgs build() {
            return new GoogleCloudDialogflowV2IntentMessageColumnPropertiesArgs(header, horizontalAlignment);
        }
    }
}
