// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apiextensions.k8s.io_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.kubernetes.apiextensions.k8s.io_v1beta1.inputs.WebhookClientConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * CustomResourceConversion describes how to convert different versions of a CR.
 * 
 */
public final class CustomResourceConversionArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomResourceConversionArgs Empty = new CustomResourceConversionArgs();

    /**
     * conversionReviewVersions is an ordered list of preferred `ConversionReview` versions the Webhook expects. The API server will use the first version in the list which it supports. If none of the versions specified in this list are supported by API server, conversion will fail for the custom resource. If a persisted Webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail. Defaults to `["v1beta1"]`.
     * 
     */
    @Import(name="conversionReviewVersions")
      private final @Nullable Output<List<String>> conversionReviewVersions;

    public Output<List<String>> getConversionReviewVersions() {
        return this.conversionReviewVersions == null ? Output.empty() : this.conversionReviewVersions;
    }

    /**
     * strategy specifies how custom resources are converted between versions. Allowed values are: - `None`: The converter only change the apiVersion and would not touch any other field in the custom resource. - `Webhook`: API Server will call to an external webhook to do the conversion. Additional information
     *   is needed for this option. This requires spec.preserveUnknownFields to be false, and spec.conversion.webhookClientConfig to be set.
     * 
     */
    @Import(name="strategy", required=true)
      private final Output<String> strategy;

    public Output<String> getStrategy() {
        return this.strategy;
    }

    /**
     * webhookClientConfig is the instructions for how to call the webhook if strategy is `Webhook`. Required when `strategy` is set to `Webhook`.
     * 
     */
    @Import(name="webhookClientConfig")
      private final @Nullable Output<WebhookClientConfigArgs> webhookClientConfig;

    public Output<WebhookClientConfigArgs> getWebhookClientConfig() {
        return this.webhookClientConfig == null ? Output.empty() : this.webhookClientConfig;
    }

    public CustomResourceConversionArgs(
        @Nullable Output<List<String>> conversionReviewVersions,
        Output<String> strategy,
        @Nullable Output<WebhookClientConfigArgs> webhookClientConfig) {
        this.conversionReviewVersions = conversionReviewVersions;
        this.strategy = Objects.requireNonNull(strategy, "expected parameter 'strategy' to be non-null");
        this.webhookClientConfig = webhookClientConfig;
    }

    private CustomResourceConversionArgs() {
        this.conversionReviewVersions = Output.empty();
        this.strategy = Output.empty();
        this.webhookClientConfig = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomResourceConversionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> conversionReviewVersions;
        private Output<String> strategy;
        private @Nullable Output<WebhookClientConfigArgs> webhookClientConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomResourceConversionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conversionReviewVersions = defaults.conversionReviewVersions;
    	      this.strategy = defaults.strategy;
    	      this.webhookClientConfig = defaults.webhookClientConfig;
        }

        public Builder conversionReviewVersions(@Nullable Output<List<String>> conversionReviewVersions) {
            this.conversionReviewVersions = conversionReviewVersions;
            return this;
        }

        public Builder conversionReviewVersions(@Nullable List<String> conversionReviewVersions) {
            this.conversionReviewVersions = Output.ofNullable(conversionReviewVersions);
            return this;
        }

        public Builder strategy(Output<String> strategy) {
            this.strategy = Objects.requireNonNull(strategy);
            return this;
        }

        public Builder strategy(String strategy) {
            this.strategy = Output.of(Objects.requireNonNull(strategy));
            return this;
        }

        public Builder webhookClientConfig(@Nullable Output<WebhookClientConfigArgs> webhookClientConfig) {
            this.webhookClientConfig = webhookClientConfig;
            return this;
        }

        public Builder webhookClientConfig(@Nullable WebhookClientConfigArgs webhookClientConfig) {
            this.webhookClientConfig = Output.ofNullable(webhookClientConfig);
            return this;
        }
        public CustomResourceConversionArgs build() {
            return new CustomResourceConversionArgs(conversionReviewVersions, strategy, webhookClientConfig);
        }
    }
}
