// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1QueryInputResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowCxV3beta1ConversationTurnUserInputResponse {
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
    private final GoogleCloudDialogflowCxV3beta1QueryInputResponse input;
    /**
     * If webhooks should be allowed to trigger in response to the user utterance. Often if parameters are injected, webhooks should not be enabled.
     * 
     */
    private final Boolean isWebhookEnabled;

    @OutputCustomType.Constructor({"enableSentimentAnalysis","injectedParameters","input","isWebhookEnabled"})
    private GoogleCloudDialogflowCxV3beta1ConversationTurnUserInputResponse(
        Boolean enableSentimentAnalysis,
        Map<String,String> injectedParameters,
        GoogleCloudDialogflowCxV3beta1QueryInputResponse input,
        Boolean isWebhookEnabled) {
        this.enableSentimentAnalysis = Objects.requireNonNull(enableSentimentAnalysis);
        this.injectedParameters = Objects.requireNonNull(injectedParameters);
        this.input = Objects.requireNonNull(input);
        this.isWebhookEnabled = Objects.requireNonNull(isWebhookEnabled);
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
    public GoogleCloudDialogflowCxV3beta1QueryInputResponse getInput() {
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

    public static Builder builder(GoogleCloudDialogflowCxV3beta1ConversationTurnUserInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableSentimentAnalysis;
        private Map<String,String> injectedParameters;
        private GoogleCloudDialogflowCxV3beta1QueryInputResponse input;
        private Boolean isWebhookEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1ConversationTurnUserInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableSentimentAnalysis = defaults.enableSentimentAnalysis;
    	      this.injectedParameters = defaults.injectedParameters;
    	      this.input = defaults.input;
    	      this.isWebhookEnabled = defaults.isWebhookEnabled;
        }

        public Builder setEnableSentimentAnalysis(Boolean enableSentimentAnalysis) {
            this.enableSentimentAnalysis = Objects.requireNonNull(enableSentimentAnalysis);
            return this;
        }

        public Builder setInjectedParameters(Map<String,String> injectedParameters) {
            this.injectedParameters = Objects.requireNonNull(injectedParameters);
            return this;
        }

        public Builder setInput(GoogleCloudDialogflowCxV3beta1QueryInputResponse input) {
            this.input = Objects.requireNonNull(input);
            return this;
        }

        public Builder setIsWebhookEnabled(Boolean isWebhookEnabled) {
            this.isWebhookEnabled = Objects.requireNonNull(isWebhookEnabled);
            return this;
        }
        public GoogleCloudDialogflowCxV3beta1ConversationTurnUserInputResponse build() {
            return new GoogleCloudDialogflowCxV3beta1ConversationTurnUserInputResponse(enableSentimentAnalysis, injectedParameters, input, isWebhookEnabled);
        }
    }
}
