// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3FulfillmentConditionalCasesResponse;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3FulfillmentSetParameterActionResponse;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3ResponseMessageResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A fulfillment can do one or more of the following actions at the same time: * Generate rich message responses. * Set parameter values. * Call the webhook. Fulfillments can be called at various stages in the Page or Form lifecycle. For example, when a DetectIntentRequest drives a session to enter a new page, the page's entry fulfillment can add a static response to the QueryResult in the returning DetectIntentResponse, call the webhook (for example, to load user data from a database), or both.
 * 
 */
public final class GoogleCloudDialogflowCxV3FulfillmentResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3FulfillmentResponse Empty = new GoogleCloudDialogflowCxV3FulfillmentResponse();

    /**
     * Conditional cases for this fulfillment.
     * 
     */
    @Import(name="conditionalCases", required=true)
      private final List<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesResponse> conditionalCases;

    public List<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesResponse> getConditionalCases() {
        return this.conditionalCases;
    }

    /**
     * The list of rich message responses to present to the user.
     * 
     */
    @Import(name="messages", required=true)
      private final List<GoogleCloudDialogflowCxV3ResponseMessageResponse> messages;

    public List<GoogleCloudDialogflowCxV3ResponseMessageResponse> getMessages() {
        return this.messages;
    }

    /**
     * Whether Dialogflow should return currently queued fulfillment response messages in streaming APIs. If a webhook is specified, it happens before Dialogflow invokes webhook. Warning: 1) This flag only affects streaming API. Responses are still queued and returned once in non-streaming API. 2) The flag can be enabled in any fulfillment but only the first 3 partial responses will be returned. You may only want to apply it to fulfillments that have slow webhooks.
     * 
     */
    @Import(name="returnPartialResponses", required=true)
      private final Boolean returnPartialResponses;

    public Boolean getReturnPartialResponses() {
        return this.returnPartialResponses;
    }

    /**
     * Set parameter values before executing the webhook.
     * 
     */
    @Import(name="setParameterActions", required=true)
      private final List<GoogleCloudDialogflowCxV3FulfillmentSetParameterActionResponse> setParameterActions;

    public List<GoogleCloudDialogflowCxV3FulfillmentSetParameterActionResponse> getSetParameterActions() {
        return this.setParameterActions;
    }

    /**
     * The tag used by the webhook to identify which fulfillment is being called. This field is required if `webhook` is specified.
     * 
     */
    @Import(name="tag", required=true)
      private final String tag;

    public String getTag() {
        return this.tag;
    }

    /**
     * The webhook to call. Format: `projects//locations//agents//webhooks/`.
     * 
     */
    @Import(name="webhook", required=true)
      private final String webhook;

    public String getWebhook() {
        return this.webhook;
    }

    public GoogleCloudDialogflowCxV3FulfillmentResponse(
        List<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesResponse> conditionalCases,
        List<GoogleCloudDialogflowCxV3ResponseMessageResponse> messages,
        Boolean returnPartialResponses,
        List<GoogleCloudDialogflowCxV3FulfillmentSetParameterActionResponse> setParameterActions,
        String tag,
        String webhook) {
        this.conditionalCases = Objects.requireNonNull(conditionalCases, "expected parameter 'conditionalCases' to be non-null");
        this.messages = Objects.requireNonNull(messages, "expected parameter 'messages' to be non-null");
        this.returnPartialResponses = Objects.requireNonNull(returnPartialResponses, "expected parameter 'returnPartialResponses' to be non-null");
        this.setParameterActions = Objects.requireNonNull(setParameterActions, "expected parameter 'setParameterActions' to be non-null");
        this.tag = Objects.requireNonNull(tag, "expected parameter 'tag' to be non-null");
        this.webhook = Objects.requireNonNull(webhook, "expected parameter 'webhook' to be non-null");
    }

    private GoogleCloudDialogflowCxV3FulfillmentResponse() {
        this.conditionalCases = List.of();
        this.messages = List.of();
        this.returnPartialResponses = null;
        this.setParameterActions = List.of();
        this.tag = null;
        this.webhook = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3FulfillmentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesResponse> conditionalCases;
        private List<GoogleCloudDialogflowCxV3ResponseMessageResponse> messages;
        private Boolean returnPartialResponses;
        private List<GoogleCloudDialogflowCxV3FulfillmentSetParameterActionResponse> setParameterActions;
        private String tag;
        private String webhook;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3FulfillmentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditionalCases = defaults.conditionalCases;
    	      this.messages = defaults.messages;
    	      this.returnPartialResponses = defaults.returnPartialResponses;
    	      this.setParameterActions = defaults.setParameterActions;
    	      this.tag = defaults.tag;
    	      this.webhook = defaults.webhook;
        }

        public Builder conditionalCases(List<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesResponse> conditionalCases) {
            this.conditionalCases = Objects.requireNonNull(conditionalCases);
            return this;
        }

        public Builder messages(List<GoogleCloudDialogflowCxV3ResponseMessageResponse> messages) {
            this.messages = Objects.requireNonNull(messages);
            return this;
        }

        public Builder returnPartialResponses(Boolean returnPartialResponses) {
            this.returnPartialResponses = Objects.requireNonNull(returnPartialResponses);
            return this;
        }

        public Builder setParameterActions(List<GoogleCloudDialogflowCxV3FulfillmentSetParameterActionResponse> setParameterActions) {
            this.setParameterActions = Objects.requireNonNull(setParameterActions);
            return this;
        }

        public Builder tag(String tag) {
            this.tag = Objects.requireNonNull(tag);
            return this;
        }

        public Builder webhook(String webhook) {
            this.webhook = Objects.requireNonNull(webhook);
            return this;
        }
        public GoogleCloudDialogflowCxV3FulfillmentResponse build() {
            return new GoogleCloudDialogflowCxV3FulfillmentResponse(conditionalCases, messages, returnPartialResponses, setParameterActions, tag, webhook);
        }
    }
}
