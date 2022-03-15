// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.inputs;

import io.pulumi.azurenative.botservice.inputs.FacebookPageArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The parameters to provide for the Facebook channel.
 * 
 */
public final class FacebookChannelPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final FacebookChannelPropertiesArgs Empty = new FacebookChannelPropertiesArgs();

    /**
     * Facebook application id
     * 
     */
    @Import(name="appId", required=true)
      private final Output<String> appId;

    public Output<String> getAppId() {
        return this.appId;
    }

    /**
     * Facebook application secret. Value only returned through POST to the action Channel List API, otherwise empty.
     * 
     */
    @Import(name="appSecret")
      private final @Nullable Output<String> appSecret;

    public Output<String> getAppSecret() {
        return this.appSecret == null ? Output.empty() : this.appSecret;
    }

    /**
     * Whether this channel is enabled for the bot
     * 
     */
    @Import(name="isEnabled", required=true)
      private final Output<Boolean> isEnabled;

    public Output<Boolean> getIsEnabled() {
        return this.isEnabled;
    }

    /**
     * The list of Facebook pages
     * 
     */
    @Import(name="pages")
      private final @Nullable Output<List<FacebookPageArgs>> pages;

    public Output<List<FacebookPageArgs>> getPages() {
        return this.pages == null ? Output.empty() : this.pages;
    }

    public FacebookChannelPropertiesArgs(
        Output<String> appId,
        @Nullable Output<String> appSecret,
        Output<Boolean> isEnabled,
        @Nullable Output<List<FacebookPageArgs>> pages) {
        this.appId = Objects.requireNonNull(appId, "expected parameter 'appId' to be non-null");
        this.appSecret = appSecret;
        this.isEnabled = Objects.requireNonNull(isEnabled, "expected parameter 'isEnabled' to be non-null");
        this.pages = pages;
    }

    private FacebookChannelPropertiesArgs() {
        this.appId = Output.empty();
        this.appSecret = Output.empty();
        this.isEnabled = Output.empty();
        this.pages = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FacebookChannelPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> appId;
        private @Nullable Output<String> appSecret;
        private Output<Boolean> isEnabled;
        private @Nullable Output<List<FacebookPageArgs>> pages;

        public Builder() {
    	      // Empty
        }

        public Builder(FacebookChannelPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.appSecret = defaults.appSecret;
    	      this.isEnabled = defaults.isEnabled;
    	      this.pages = defaults.pages;
        }

        public Builder appId(Output<String> appId) {
            this.appId = Objects.requireNonNull(appId);
            return this;
        }

        public Builder appId(String appId) {
            this.appId = Output.of(Objects.requireNonNull(appId));
            return this;
        }

        public Builder appSecret(@Nullable Output<String> appSecret) {
            this.appSecret = appSecret;
            return this;
        }

        public Builder appSecret(@Nullable String appSecret) {
            this.appSecret = Output.ofNullable(appSecret);
            return this;
        }

        public Builder isEnabled(Output<Boolean> isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }

        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = Output.of(Objects.requireNonNull(isEnabled));
            return this;
        }

        public Builder pages(@Nullable Output<List<FacebookPageArgs>> pages) {
            this.pages = pages;
            return this;
        }

        public Builder pages(@Nullable List<FacebookPageArgs> pages) {
            this.pages = Output.ofNullable(pages);
            return this;
        }
        public FacebookChannelPropertiesArgs build() {
            return new FacebookChannelPropertiesArgs(appId, appSecret, isEnabled, pages);
        }
    }
}
