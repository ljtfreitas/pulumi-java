// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1QueryInputResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class GoogleCloudDialogflowCxV3beta1ConversationTurnUserInputResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3beta1ConversationTurnUserInputResponse Empty = new GoogleCloudDialogflowCxV3beta1ConversationTurnUserInputResponse();

    @InputImport(name="enableSentimentAnalysis", required=true)
    private final Boolean enableSentimentAnalysis;

    public Boolean getEnableSentimentAnalysis() {
        return this.enableSentimentAnalysis;
    }

    @InputImport(name="injectedParameters", required=true)
    private final Map<String,String> injectedParameters;

    public Map<String,String> getInjectedParameters() {
        return this.injectedParameters;
    }

    @InputImport(name="input", required=true)
    private final GoogleCloudDialogflowCxV3beta1QueryInputResponse input;

    public GoogleCloudDialogflowCxV3beta1QueryInputResponse getInput() {
        return this.input;
    }

    @InputImport(name="isWebhookEnabled", required=true)
    private final Boolean isWebhookEnabled;

    public Boolean getIsWebhookEnabled() {
        return this.isWebhookEnabled;
    }

    public GoogleCloudDialogflowCxV3beta1ConversationTurnUserInputResponse(
        Boolean enableSentimentAnalysis,
        Map<String,String> injectedParameters,
        GoogleCloudDialogflowCxV3beta1QueryInputResponse input,
        Boolean isWebhookEnabled) {
        this.enableSentimentAnalysis = Objects.requireNonNull(enableSentimentAnalysis, "expected parameter 'enableSentimentAnalysis' to be non-null");
        this.injectedParameters = Objects.requireNonNull(injectedParameters, "expected parameter 'injectedParameters' to be non-null");
        this.input = Objects.requireNonNull(input, "expected parameter 'input' to be non-null");
        this.isWebhookEnabled = Objects.requireNonNull(isWebhookEnabled, "expected parameter 'isWebhookEnabled' to be non-null");
    }

    private GoogleCloudDialogflowCxV3beta1ConversationTurnUserInputResponse() {
        this.enableSentimentAnalysis = null;
        this.injectedParameters = Map.of();
        this.input = null;
        this.isWebhookEnabled = null;
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