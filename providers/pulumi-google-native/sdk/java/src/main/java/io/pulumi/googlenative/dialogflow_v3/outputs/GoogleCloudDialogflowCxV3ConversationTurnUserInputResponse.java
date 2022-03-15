// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3QueryInputResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowCxV3ConversationTurnUserInputResponse {
    /**
     * Whether sentiment analysis is enabled.
     * 
     */
    private final Boolean enableSentimentAnalysis;
    /**
     * Parameters that need to be injected into the conversation during intent detection.
     * 
     */
    private final Map<String,String> injectedParameters;
    /**
     * Supports text input, event input, dtmf input in the test case.
     * 
     */
    private final GoogleCloudDialogflowCxV3QueryInputResponse input;
    /**
     * If webhooks should be allowed to trigger in response to the user utterance. Often if parameters are injected, webhooks should not be enabled.
     * 
     */
    private final Boolean isWebhookEnabled;

    @CustomType.Constructor
    private GoogleCloudDialogflowCxV3ConversationTurnUserInputResponse(
        @CustomType.Parameter("enableSentimentAnalysis") Boolean enableSentimentAnalysis,
        @CustomType.Parameter("injectedParameters") Map<String,String> injectedParameters,
        @CustomType.Parameter("input") GoogleCloudDialogflowCxV3QueryInputResponse input,
        @CustomType.Parameter("isWebhookEnabled") Boolean isWebhookEnabled) {
        this.enableSentimentAnalysis = enableSentimentAnalysis;
        this.injectedParameters = injectedParameters;
        this.input = input;
        this.isWebhookEnabled = isWebhookEnabled;
    }

    /**
     * Whether sentiment analysis is enabled.
     * 
    */
    public Boolean getEnableSentimentAnalysis() {
        return this.enableSentimentAnalysis;
    }
    /**
     * Parameters that need to be injected into the conversation during intent detection.
     * 
    */
    public Map<String,String> getInjectedParameters() {
        return this.injectedParameters;
    }
    /**
     * Supports text input, event input, dtmf input in the test case.
     * 
    */
    public GoogleCloudDialogflowCxV3QueryInputResponse getInput() {
        return this.input;
    }
    /**
     * If webhooks should be allowed to trigger in response to the user utterance. Often if parameters are injected, webhooks should not be enabled.
     * 
    */
    public Boolean getIsWebhookEnabled() {
        return this.isWebhookEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3ConversationTurnUserInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableSentimentAnalysis;
        private Map<String,String> injectedParameters;
        private GoogleCloudDialogflowCxV3QueryInputResponse input;
        private Boolean isWebhookEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3ConversationTurnUserInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableSentimentAnalysis = defaults.enableSentimentAnalysis;
    	      this.injectedParameters = defaults.injectedParameters;
    	      this.input = defaults.input;
    	      this.isWebhookEnabled = defaults.isWebhookEnabled;
        }

        public Builder enableSentimentAnalysis(Boolean enableSentimentAnalysis) {
            this.enableSentimentAnalysis = Objects.requireNonNull(enableSentimentAnalysis);
            return this;
        }

        public Builder injectedParameters(Map<String,String> injectedParameters) {
            this.injectedParameters = Objects.requireNonNull(injectedParameters);
            return this;
        }

        public Builder input(GoogleCloudDialogflowCxV3QueryInputResponse input) {
            this.input = Objects.requireNonNull(input);
            return this;
        }

        public Builder isWebhookEnabled(Boolean isWebhookEnabled) {
            this.isWebhookEnabled = Objects.requireNonNull(isWebhookEnabled);
            return this;
        }
        public GoogleCloudDialogflowCxV3ConversationTurnUserInputResponse build() {
            return new GoogleCloudDialogflowCxV3ConversationTurnUserInputResponse(enableSentimentAnalysis, injectedParameters, input, isWebhookEnabled);
        }
    }
}
