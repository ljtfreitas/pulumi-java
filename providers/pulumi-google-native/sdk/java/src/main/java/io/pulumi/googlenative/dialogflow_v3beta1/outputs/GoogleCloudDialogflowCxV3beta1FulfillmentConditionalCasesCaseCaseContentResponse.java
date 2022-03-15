// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesResponse;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1ResponseMessageResponse;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseCaseContentResponse {
    /**
     * Additional cases to be evaluated.
     * 
     */
    private final GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesResponse additionalCases;
    /**
     * Returned message.
     * 
     */
    private final GoogleCloudDialogflowCxV3beta1ResponseMessageResponse message;

    @CustomType.Constructor
    private GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseCaseContentResponse(
        @CustomType.Parameter("additionalCases") GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesResponse additionalCases,
        @CustomType.Parameter("message") GoogleCloudDialogflowCxV3beta1ResponseMessageResponse message) {
        this.additionalCases = additionalCases;
        this.message = message;
    }

    /**
     * Additional cases to be evaluated.
     * 
    */
    public GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesResponse getAdditionalCases() {
        return this.additionalCases;
    }
    /**
     * Returned message.
     * 
    */
    public GoogleCloudDialogflowCxV3beta1ResponseMessageResponse getMessage() {
        return this.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseCaseContentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesResponse additionalCases;
        private GoogleCloudDialogflowCxV3beta1ResponseMessageResponse message;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseCaseContentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalCases = defaults.additionalCases;
    	      this.message = defaults.message;
        }

        public Builder additionalCases(GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesResponse additionalCases) {
            this.additionalCases = Objects.requireNonNull(additionalCases);
            return this;
        }

        public Builder message(GoogleCloudDialogflowCxV3beta1ResponseMessageResponse message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }
        public GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseCaseContentResponse build() {
            return new GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseCaseContentResponse(additionalCases, message);
        }
    }
}
