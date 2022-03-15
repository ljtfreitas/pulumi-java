// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.admissionregistration.k8s.io_v1beta1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.kubernetes.admissionregistration.k8s.io_v1beta1.inputs.ValidatingWebhookArgs;
import io.pulumi.kubernetes.meta_v1.inputs.ObjectMetaArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ValidatingWebhookConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ValidatingWebhookConfigurationArgs Empty = new ValidatingWebhookConfigurationArgs();

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @Import(name="apiVersion")
      private final @Nullable Output<String> apiVersion;

    public Output<String> getApiVersion() {
        return this.apiVersion == null ? Output.empty() : this.apiVersion;
    }

    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Output.empty() : this.kind;
    }

    /**
     * Standard object metadata; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata.
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<ObjectMetaArgs> metadata;

    public Output<ObjectMetaArgs> getMetadata() {
        return this.metadata == null ? Output.empty() : this.metadata;
    }

    /**
     * Webhooks is a list of webhooks and the affected resources and operations.
     * 
     */
    @Import(name="webhooks")
      private final @Nullable Output<List<ValidatingWebhookArgs>> webhooks;

    public Output<List<ValidatingWebhookArgs>> getWebhooks() {
        return this.webhooks == null ? Output.empty() : this.webhooks;
    }

    public ValidatingWebhookConfigurationArgs(
        @Nullable Output<String> apiVersion,
        @Nullable Output<String> kind,
        @Nullable Output<ObjectMetaArgs> metadata,
        @Nullable Output<List<ValidatingWebhookArgs>> webhooks) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.webhooks = webhooks;
    }

    private ValidatingWebhookConfigurationArgs() {
        this.apiVersion = Output.empty();
        this.kind = Output.empty();
        this.metadata = Output.empty();
        this.webhooks = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ValidatingWebhookConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> apiVersion;
        private @Nullable Output<String> kind;
        private @Nullable Output<ObjectMetaArgs> metadata;
        private @Nullable Output<List<ValidatingWebhookArgs>> webhooks;

        public Builder() {
    	      // Empty
        }

        public Builder(ValidatingWebhookConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersion = defaults.apiVersion;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.webhooks = defaults.webhooks;
        }

        public Builder apiVersion(@Nullable Output<String> apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder apiVersion(@Nullable String apiVersion) {
            this.apiVersion = Output.ofNullable(apiVersion);
            return this;
        }

        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder kind(@Nullable String kind) {
            this.kind = Output.ofNullable(kind);
            return this;
        }

        public Builder metadata(@Nullable Output<ObjectMetaArgs> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder metadata(@Nullable ObjectMetaArgs metadata) {
            this.metadata = Output.ofNullable(metadata);
            return this;
        }

        public Builder webhooks(@Nullable Output<List<ValidatingWebhookArgs>> webhooks) {
            this.webhooks = webhooks;
            return this;
        }

        public Builder webhooks(@Nullable List<ValidatingWebhookArgs> webhooks) {
            this.webhooks = Output.ofNullable(webhooks);
            return this;
        }
        public ValidatingWebhookConfigurationArgs build() {
            return new ValidatingWebhookConfigurationArgs(apiVersion, kind, metadata, webhooks);
        }
    }
}
