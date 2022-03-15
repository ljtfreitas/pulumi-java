// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Defines logging behavior for conversation lifecycle events.
 * 
 */
public final class GoogleCloudDialogflowV2LoggingConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2LoggingConfigResponse Empty = new GoogleCloudDialogflowV2LoggingConfigResponse();

    /**
     * Whether to log conversation events like CONVERSATION_STARTED to Stackdriver in the conversation project as JSON format ConversationEvent protos.
     * 
     */
    @Import(name="enableStackdriverLogging", required=true)
      private final Boolean enableStackdriverLogging;

    public Boolean getEnableStackdriverLogging() {
        return this.enableStackdriverLogging;
    }

    public GoogleCloudDialogflowV2LoggingConfigResponse(Boolean enableStackdriverLogging) {
        this.enableStackdriverLogging = Objects.requireNonNull(enableStackdriverLogging, "expected parameter 'enableStackdriverLogging' to be non-null");
    }

    private GoogleCloudDialogflowV2LoggingConfigResponse() {
        this.enableStackdriverLogging = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2LoggingConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableStackdriverLogging;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2LoggingConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableStackdriverLogging = defaults.enableStackdriverLogging;
        }

        public Builder enableStackdriverLogging(Boolean enableStackdriverLogging) {
            this.enableStackdriverLogging = Objects.requireNonNull(enableStackdriverLogging);
            return this;
        }
        public GoogleCloudDialogflowV2LoggingConfigResponse build() {
            return new GoogleCloudDialogflowV2LoggingConfigResponse(enableStackdriverLogging);
        }
    }
}
