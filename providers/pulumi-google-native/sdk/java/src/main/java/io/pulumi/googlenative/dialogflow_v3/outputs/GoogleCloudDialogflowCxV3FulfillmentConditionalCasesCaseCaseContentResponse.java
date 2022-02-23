// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3FulfillmentConditionalCasesResponse;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3ResponseMessageResponse;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseCaseContentResponse {
    /**
     * Additional cases to be evaluated.
     * 
     */
    private final GoogleCloudDialogflowCxV3FulfillmentConditionalCasesResponse additionalCases;
    /**
     * Returned message.
     * 
     */
    private final GoogleCloudDialogflowCxV3ResponseMessageResponse message;

    @OutputCustomType.Constructor({"additionalCases","message"})
    private GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseCaseContentResponse(
        GoogleCloudDialogflowCxV3FulfillmentConditionalCasesResponse additionalCases,
        GoogleCloudDialogflowCxV3ResponseMessageResponse message) {
        this.additionalCases = Objects.requireNonNull(additionalCases);
        this.message = Objects.requireNonNull(message);
    }

    /**
     * Additional cases to be evaluated.
     * 
     */
    public GoogleCloudDialogflowCxV3FulfillmentConditionalCasesResponse getAdditionalCases() {
        return this.additionalCases;
    }
    /**
     * Returned message.
     * 
     */
    public GoogleCloudDialogflowCxV3ResponseMessageResponse getMessage() {
        return this.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseCaseContentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3FulfillmentConditionalCasesResponse additionalCases;
        private GoogleCloudDialogflowCxV3ResponseMessageResponse message;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseCaseContentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalCases = defaults.additionalCases;
    	      this.message = defaults.message;
        }

        public Builder setAdditionalCases(GoogleCloudDialogflowCxV3FulfillmentConditionalCasesResponse additionalCases) {
            this.additionalCases = Objects.requireNonNull(additionalCases);
            return this;
        }

        public Builder setMessage(GoogleCloudDialogflowCxV3ResponseMessageResponse message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }
        public GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseCaseContentResponse build() {
            return new GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseCaseContentResponse(additionalCases, message);
        }
    }
}
