// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2IntentMessageSuggestionResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowV2IntentMessageSuggestionsResponse {
    /**
     * The list of suggested replies.
     * 
     */
    private final List<GoogleCloudDialogflowV2IntentMessageSuggestionResponse> suggestions;

    @OutputCustomType.Constructor({"suggestions"})
    private GoogleCloudDialogflowV2IntentMessageSuggestionsResponse(List<GoogleCloudDialogflowV2IntentMessageSuggestionResponse> suggestions) {
        this.suggestions = Objects.requireNonNull(suggestions);
    }

    /**
     * The list of suggested replies.
     * 
     */
    public List<GoogleCloudDialogflowV2IntentMessageSuggestionResponse> getSuggestions() {
        return this.suggestions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageSuggestionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowV2IntentMessageSuggestionResponse> suggestions;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageSuggestionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.suggestions = defaults.suggestions;
        }

        public Builder setSuggestions(List<GoogleCloudDialogflowV2IntentMessageSuggestionResponse> suggestions) {
            this.suggestions = Objects.requireNonNull(suggestions);
            return this;
        }
        public GoogleCloudDialogflowV2IntentMessageSuggestionsResponse build() {
            return new GoogleCloudDialogflowV2IntentMessageSuggestionsResponse(suggestions);
        }
    }
}
