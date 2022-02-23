// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Knowledge base source settings. Supported features: ARTICLE_SUGGESTION, FAQ.
 * 
 */
public final class GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceResponse Empty = new GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceResponse();

    /**
     * Knowledge bases to query. Format: `projects//locations//knowledgeBases/`. Currently, only one knowledge base is supported.
     * 
     */
    @InputImport(name="knowledgeBases", required=true)
      private final List<String> knowledgeBases;

    public List<String> getKnowledgeBases() {
        return this.knowledgeBases;
    }

    public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceResponse(List<String> knowledgeBases) {
        this.knowledgeBases = Objects.requireNonNull(knowledgeBases, "expected parameter 'knowledgeBases' to be non-null");
    }

    private GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceResponse() {
        this.knowledgeBases = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> knowledgeBases;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.knowledgeBases = defaults.knowledgeBases;
        }

        public Builder setKnowledgeBases(List<String> knowledgeBases) {
            this.knowledgeBases = Objects.requireNonNull(knowledgeBases);
            return this;
        }
        public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceResponse build() {
            return new GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionQueryConfigKnowledgeBaseQuerySourceResponse(knowledgeBases);
        }
    }
}
