// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceResponse {
    /**
     * Knowledge documents to query from. Format: `projects//locations//knowledgeBases//documents/`. Currently, only one document is supported.
     * 
     */
    private final List<String> documents;

    @OutputCustomType.Constructor({"documents"})
    private GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceResponse(List<String> documents) {
        this.documents = Objects.requireNonNull(documents);
    }

    /**
     * Knowledge documents to query from. Format: `projects//locations//knowledgeBases//documents/`. Currently, only one document is supported.
     * 
     */
    public List<String> getDocuments() {
        return this.documents;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> documents;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.documents = defaults.documents;
        }

        public Builder setDocuments(List<String> documents) {
            this.documents = Objects.requireNonNull(documents);
            return this;
        }
        public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceResponse build() {
            return new GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceResponse(documents);
        }
    }
}
