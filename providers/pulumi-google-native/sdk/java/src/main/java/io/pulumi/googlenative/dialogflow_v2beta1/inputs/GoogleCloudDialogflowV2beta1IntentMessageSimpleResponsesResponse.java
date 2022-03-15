// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageSimpleResponseResponse;
import java.util.List;
import java.util.Objects;


/**
 * The collection of simple response candidates. This message in `QueryResult.fulfillment_messages` and `WebhookResponse.fulfillment_messages` should contain only one `SimpleResponse`.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageSimpleResponsesResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageSimpleResponsesResponse Empty = new GoogleCloudDialogflowV2beta1IntentMessageSimpleResponsesResponse();

    /**
     * The list of simple responses.
     * 
     */
    @Import(name="simpleResponses", required=true)
      private final List<GoogleCloudDialogflowV2beta1IntentMessageSimpleResponseResponse> simpleResponses;

    public List<GoogleCloudDialogflowV2beta1IntentMessageSimpleResponseResponse> getSimpleResponses() {
        return this.simpleResponses;
    }

    public GoogleCloudDialogflowV2beta1IntentMessageSimpleResponsesResponse(List<GoogleCloudDialogflowV2beta1IntentMessageSimpleResponseResponse> simpleResponses) {
        this.simpleResponses = Objects.requireNonNull(simpleResponses, "expected parameter 'simpleResponses' to be non-null");
    }

    private GoogleCloudDialogflowV2beta1IntentMessageSimpleResponsesResponse() {
        this.simpleResponses = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageSimpleResponsesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowV2beta1IntentMessageSimpleResponseResponse> simpleResponses;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageSimpleResponsesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.simpleResponses = defaults.simpleResponses;
        }

        public Builder simpleResponses(List<GoogleCloudDialogflowV2beta1IntentMessageSimpleResponseResponse> simpleResponses) {
            this.simpleResponses = Objects.requireNonNull(simpleResponses);
            return this;
        }
        public GoogleCloudDialogflowV2beta1IntentMessageSimpleResponsesResponse build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageSimpleResponsesResponse(simpleResponses);
        }
    }
}
