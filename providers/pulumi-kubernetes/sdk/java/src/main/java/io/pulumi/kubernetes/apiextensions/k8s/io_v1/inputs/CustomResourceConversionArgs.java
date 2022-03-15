// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apiextensions.k8s.io_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.kubernetes.apiextensions.k8s.io_v1.inputs.WebhookConversionArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * CustomResourceConversion describes how to convert different versions of a CR.
 * 
 */
public final class CustomResourceConversionArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomResourceConversionArgs Empty = new CustomResourceConversionArgs();

    /**
     * strategy specifies how custom resources are converted between versions. Allowed values are: - `None`: The converter only change the apiVersion and would not touch any other field in the custom resource. - `Webhook`: API Server will call to an external webhook to do the conversion. Additional information
     *   is needed for this option. This requires spec.preserveUnknownFields to be false, and spec.conversion.webhook to be set.
     * 
     */
    @Import(name="strategy", required=true)
      private final Output<String> strategy;

    public Output<String> getStrategy() {
        return this.strategy;
    }

    /**
     * webhook describes how to call the conversion webhook. Required when `strategy` is set to `Webhook`.
     * 
     */
    @Import(name="webhook")
      private final @Nullable Output<WebhookConversionArgs> webhook;

    public Output<WebhookConversionArgs> getWebhook() {
        return this.webhook == null ? Output.empty() : this.webhook;
    }

    public CustomResourceConversionArgs(
        Output<String> strategy,
        @Nullable Output<WebhookConversionArgs> webhook) {
        this.strategy = Objects.requireNonNull(strategy, "expected parameter 'strategy' to be non-null");
        this.webhook = webhook;
    }

    private CustomResourceConversionArgs() {
        this.strategy = Output.empty();
        this.webhook = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomResourceConversionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> strategy;
        private @Nullable Output<WebhookConversionArgs> webhook;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomResourceConversionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.strategy = defaults.strategy;
    	      this.webhook = defaults.webhook;
        }

        public Builder strategy(Output<String> strategy) {
            this.strategy = Objects.requireNonNull(strategy);
            return this;
        }

        public Builder strategy(String strategy) {
            this.strategy = Output.of(Objects.requireNonNull(strategy));
            return this;
        }

        public Builder webhook(@Nullable Output<WebhookConversionArgs> webhook) {
            this.webhook = webhook;
            return this;
        }

        public Builder webhook(@Nullable WebhookConversionArgs webhook) {
            this.webhook = Output.ofNullable(webhook);
            return this;
        }
        public CustomResourceConversionArgs build() {
            return new CustomResourceConversionArgs(strategy, webhook);
        }
    }
}
