// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowV2beta1IntentMessageSuggestionResponse {
    /**
     * The text shown the in the suggestion chip.
     * 
     */
    private final String title;

    @CustomType.Constructor
    private GoogleCloudDialogflowV2beta1IntentMessageSuggestionResponse(@CustomType.Parameter("title") String title) {
        this.title = title;
    }

    /**
     * The text shown the in the suggestion chip.
     * 
    */
    public String getTitle() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageSuggestionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageSuggestionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.title = defaults.title;
        }

        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }
        public GoogleCloudDialogflowV2beta1IntentMessageSuggestionResponse build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageSuggestionResponse(title);
        }
    }
}
