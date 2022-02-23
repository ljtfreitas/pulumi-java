// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apiextensions.k8s.io_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.apiextensions.k8s.io_v1.inputs.WebhookClientConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * WebhookConversion describes how to call a conversion webhook
 * 
 */
public final class WebhookConversionArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebhookConversionArgs Empty = new WebhookConversionArgs();

    /**
     * clientConfig is the instructions for how to call the webhook if strategy is `Webhook`.
     * 
     */
    @InputImport(name="clientConfig")
        private final @Nullable Input<WebhookClientConfigArgs> clientConfig;

    public Input<WebhookClientConfigArgs> getClientConfig() {
        return this.clientConfig == null ? Input.empty() : this.clientConfig;
    }

    /**
     * conversionReviewVersions is an ordered list of preferred `ConversionReview` versions the Webhook expects. The API server will use the first version in the list which it supports. If none of the versions specified in this list are supported by API server, conversion will fail for the custom resource. If a persisted Webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail.
     * 
     */
    @InputImport(name="conversionReviewVersions", required=true)
        private final Input<List<String>> conversionReviewVersions;

    public Input<List<String>> getConversionReviewVersions() {
        return this.conversionReviewVersions;
    }

    public WebhookConversionArgs(
        @Nullable Input<WebhookClientConfigArgs> clientConfig,
        Input<List<String>> conversionReviewVersions) {
        this.clientConfig = clientConfig;
        this.conversionReviewVersions = Objects.requireNonNull(conversionReviewVersions, "expected parameter 'conversionReviewVersions' to be non-null");
    }

    private WebhookConversionArgs() {
        this.clientConfig = Input.empty();
        this.conversionReviewVersions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebhookConversionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WebhookClientConfigArgs> clientConfig;
        private Input<List<String>> conversionReviewVersions;

        public Builder() {
    	      // Empty
        }

        public Builder(WebhookConversionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientConfig = defaults.clientConfig;
    	      this.conversionReviewVersions = defaults.conversionReviewVersions;
        }

        public Builder setClientConfig(@Nullable Input<WebhookClientConfigArgs> clientConfig) {
            this.clientConfig = clientConfig;
            return this;
        }

        public Builder setClientConfig(@Nullable WebhookClientConfigArgs clientConfig) {
            this.clientConfig = Input.ofNullable(clientConfig);
            return this;
        }

        public Builder setConversionReviewVersions(Input<List<String>> conversionReviewVersions) {
            this.conversionReviewVersions = Objects.requireNonNull(conversionReviewVersions);
            return this;
        }

        public Builder setConversionReviewVersions(List<String> conversionReviewVersions) {
            this.conversionReviewVersions = Input.of(Objects.requireNonNull(conversionReviewVersions));
            return this;
        }
        public WebhookConversionArgs build() {
            return new WebhookConversionArgs(clientConfig, conversionReviewVersions);
        }
    }
}
