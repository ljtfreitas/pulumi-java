// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sourcerepo_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration to automatically mirror a repository from another hosting service, for example GitHub or Bitbucket.
 * 
 */
public final class MirrorConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final MirrorConfigArgs Empty = new MirrorConfigArgs();

    /**
     * ID of the SSH deploy key at the other hosting service. Removing this key from the other service would deauthorize Google Cloud Source Repositories from mirroring.
     * 
     */
    @InputImport(name="deployKeyId")
      private final @Nullable Input<String> deployKeyId;

    public Input<String> getDeployKeyId() {
        return this.deployKeyId == null ? Input.empty() : this.deployKeyId;
    }

    /**
     * URL of the main repository at the other hosting service.
     * 
     */
    @InputImport(name="url")
      private final @Nullable Input<String> url;

    public Input<String> getUrl() {
        return this.url == null ? Input.empty() : this.url;
    }

    /**
     * ID of the webhook listening to updates to trigger mirroring. Removing this webhook from the other hosting service will stop Google Cloud Source Repositories from receiving notifications, and thereby disabling mirroring.
     * 
     */
    @InputImport(name="webhookId")
      private final @Nullable Input<String> webhookId;

    public Input<String> getWebhookId() {
        return this.webhookId == null ? Input.empty() : this.webhookId;
    }

    public MirrorConfigArgs(
        @Nullable Input<String> deployKeyId,
        @Nullable Input<String> url,
        @Nullable Input<String> webhookId) {
        this.deployKeyId = deployKeyId;
        this.url = url;
        this.webhookId = webhookId;
    }

    private MirrorConfigArgs() {
        this.deployKeyId = Input.empty();
        this.url = Input.empty();
        this.webhookId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MirrorConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> deployKeyId;
        private @Nullable Input<String> url;
        private @Nullable Input<String> webhookId;

        public Builder() {
    	      // Empty
        }

        public Builder(MirrorConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deployKeyId = defaults.deployKeyId;
    	      this.url = defaults.url;
    	      this.webhookId = defaults.webhookId;
        }

        public Builder setDeployKeyId(@Nullable Input<String> deployKeyId) {
            this.deployKeyId = deployKeyId;
            return this;
        }

        public Builder setDeployKeyId(@Nullable String deployKeyId) {
            this.deployKeyId = Input.ofNullable(deployKeyId);
            return this;
        }

        public Builder setUrl(@Nullable Input<String> url) {
            this.url = url;
            return this;
        }

        public Builder setUrl(@Nullable String url) {
            this.url = Input.ofNullable(url);
            return this;
        }

        public Builder setWebhookId(@Nullable Input<String> webhookId) {
            this.webhookId = webhookId;
            return this;
        }

        public Builder setWebhookId(@Nullable String webhookId) {
            this.webhookId = Input.ofNullable(webhookId);
            return this;
        }
        public MirrorConfigArgs build() {
            return new MirrorConfigArgs(deployKeyId, url, webhookId);
        }
    }
}
