// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfigGetArgs Empty = new EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfigGetArgs();

    /**
     * Amazon SNS topic to post a notification to when inference fails. If no topic is provided, no notification is sent on failure.
     * 
     */
    @InputImport(name="errorTopic")
    private final @Nullable Input<String> errorTopic;

    public Input<String> getErrorTopic() {
        return this.errorTopic == null ? Input.empty() : this.errorTopic;
    }

    /**
     * Amazon SNS topic to post a notification to when inference completes successfully. If no topic is provided, no notification is sent on success.
     * 
     */
    @InputImport(name="successTopic")
    private final @Nullable Input<String> successTopic;

    public Input<String> getSuccessTopic() {
        return this.successTopic == null ? Input.empty() : this.successTopic;
    }

    public EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfigGetArgs(
        @Nullable Input<String> errorTopic,
        @Nullable Input<String> successTopic) {
        this.errorTopic = errorTopic;
        this.successTopic = successTopic;
    }

    private EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfigGetArgs() {
        this.errorTopic = Input.empty();
        this.successTopic = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> errorTopic;
        private @Nullable Input<String> successTopic;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorTopic = defaults.errorTopic;
    	      this.successTopic = defaults.successTopic;
        }

        public Builder setErrorTopic(@Nullable Input<String> errorTopic) {
            this.errorTopic = errorTopic;
            return this;
        }

        public Builder setErrorTopic(@Nullable String errorTopic) {
            this.errorTopic = Input.ofNullable(errorTopic);
            return this;
        }

        public Builder setSuccessTopic(@Nullable Input<String> successTopic) {
            this.successTopic = successTopic;
            return this;
        }

        public Builder setSuccessTopic(@Nullable String successTopic) {
            this.successTopic = Input.ofNullable(successTopic);
            return this;
        }
        public EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfigGetArgs build() {
            return new EndpointConfigurationAsyncInferenceConfigOutputConfigNotificationConfigGetArgs(errorTopic, successTopic);
        }
    }
}
