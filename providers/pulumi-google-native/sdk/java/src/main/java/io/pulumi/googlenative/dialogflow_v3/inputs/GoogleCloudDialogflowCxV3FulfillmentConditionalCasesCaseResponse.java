// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseCaseContentResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Each case has a Boolean condition. When it is evaluated to be True, the corresponding messages will be selected and evaluated recursively.
 * 
 */
public final class GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseResponse Empty = new GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseResponse();

    /**
     * A list of case content.
     * 
     */
    @InputImport(name="caseContent", required=true)
      private final List<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseCaseContentResponse> caseContent;

    public List<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseCaseContentResponse> getCaseContent() {
        return this.caseContent;
    }

    /**
     * The condition to activate and select this case. Empty means the condition is always true. The condition is evaluated against form parameters or session parameters. See the [conditions reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition).
     * 
     */
    @InputImport(name="condition", required=true)
      private final String condition;

    public String getCondition() {
        return this.condition;
    }

    public GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseResponse(
        List<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseCaseContentResponse> caseContent,
        String condition) {
        this.caseContent = Objects.requireNonNull(caseContent, "expected parameter 'caseContent' to be non-null");
        this.condition = Objects.requireNonNull(condition, "expected parameter 'condition' to be non-null");
    }

    private GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseResponse() {
        this.caseContent = List.of();
        this.condition = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseCaseContentResponse> caseContent;
        private String condition;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caseContent = defaults.caseContent;
    	      this.condition = defaults.condition;
        }

        public Builder setCaseContent(List<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseCaseContentResponse> caseContent) {
            this.caseContent = Objects.requireNonNull(caseContent);
            return this;
        }

        public Builder setCondition(String condition) {
            this.condition = Objects.requireNonNull(condition);
            return this;
        }
        public GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseResponse build() {
            return new GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseResponse(caseContent, condition);
        }
    }
}
