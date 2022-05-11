// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.bot;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ChannelSlackArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChannelSlackArgs Empty = new ChannelSlackArgs();

    /**
     * The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="botName", required=true)
    private Output<String> botName;

    /**
     * @return The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> botName() {
        return this.botName;
    }

    /**
     * The Client ID that will be used to authenticate with Slack.
     * 
     */
    @Import(name="clientId", required=true)
    private Output<String> clientId;

    /**
     * @return The Client ID that will be used to authenticate with Slack.
     * 
     */
    public Output<String> clientId() {
        return this.clientId;
    }

    /**
     * The Client Secret that will be used to authenticate with Slack.
     * 
     */
    @Import(name="clientSecret", required=true)
    private Output<String> clientSecret;

    /**
     * @return The Client Secret that will be used to authenticate with Slack.
     * 
     */
    public Output<String> clientSecret() {
        return this.clientSecret;
    }

    /**
     * The Slack Landing Page URL.
     * 
     */
    @Import(name="landingPageUrl")
    private @Nullable Output<String> landingPageUrl;

    /**
     * @return The Slack Landing Page URL.
     * 
     */
    public Optional<Output<String>> landingPageUrl() {
        return Optional.ofNullable(this.landingPageUrl);
    }

    /**
     * The supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the resource group in which to create the Bot Channel. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the Bot Channel. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The Signing Secret that will be used to sign the requests.
     * 
     */
    @Import(name="signingSecret")
    private @Nullable Output<String> signingSecret;

    /**
     * @return The Signing Secret that will be used to sign the requests.
     * 
     */
    public Optional<Output<String>> signingSecret() {
        return Optional.ofNullable(this.signingSecret);
    }

    /**
     * The Verification Token that will be used to authenticate with Slack.
     * 
     */
    @Import(name="verificationToken", required=true)
    private Output<String> verificationToken;

    /**
     * @return The Verification Token that will be used to authenticate with Slack.
     * 
     */
    public Output<String> verificationToken() {
        return this.verificationToken;
    }

    private ChannelSlackArgs() {}

    private ChannelSlackArgs(ChannelSlackArgs $) {
        this.botName = $.botName;
        this.clientId = $.clientId;
        this.clientSecret = $.clientSecret;
        this.landingPageUrl = $.landingPageUrl;
        this.location = $.location;
        this.resourceGroupName = $.resourceGroupName;
        this.signingSecret = $.signingSecret;
        this.verificationToken = $.verificationToken;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChannelSlackArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChannelSlackArgs $;

        public Builder() {
            $ = new ChannelSlackArgs();
        }

        public Builder(ChannelSlackArgs defaults) {
            $ = new ChannelSlackArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param botName The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder botName(Output<String> botName) {
            $.botName = botName;
            return this;
        }

        /**
         * @param botName The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder botName(String botName) {
            return botName(Output.of(botName));
        }

        /**
         * @param clientId The Client ID that will be used to authenticate with Slack.
         * 
         * @return builder
         * 
         */
        public Builder clientId(Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId The Client ID that will be used to authenticate with Slack.
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param clientSecret The Client Secret that will be used to authenticate with Slack.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(Output<String> clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        /**
         * @param clientSecret The Client Secret that will be used to authenticate with Slack.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(String clientSecret) {
            return clientSecret(Output.of(clientSecret));
        }

        /**
         * @param landingPageUrl The Slack Landing Page URL.
         * 
         * @return builder
         * 
         */
        public Builder landingPageUrl(@Nullable Output<String> landingPageUrl) {
            $.landingPageUrl = landingPageUrl;
            return this;
        }

        /**
         * @param landingPageUrl The Slack Landing Page URL.
         * 
         * @return builder
         * 
         */
        public Builder landingPageUrl(String landingPageUrl) {
            return landingPageUrl(Output.of(landingPageUrl));
        }

        /**
         * @param location The supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the Bot Channel. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the Bot Channel. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param signingSecret The Signing Secret that will be used to sign the requests.
         * 
         * @return builder
         * 
         */
        public Builder signingSecret(@Nullable Output<String> signingSecret) {
            $.signingSecret = signingSecret;
            return this;
        }

        /**
         * @param signingSecret The Signing Secret that will be used to sign the requests.
         * 
         * @return builder
         * 
         */
        public Builder signingSecret(String signingSecret) {
            return signingSecret(Output.of(signingSecret));
        }

        /**
         * @param verificationToken The Verification Token that will be used to authenticate with Slack.
         * 
         * @return builder
         * 
         */
        public Builder verificationToken(Output<String> verificationToken) {
            $.verificationToken = verificationToken;
            return this;
        }

        /**
         * @param verificationToken The Verification Token that will be used to authenticate with Slack.
         * 
         * @return builder
         * 
         */
        public Builder verificationToken(String verificationToken) {
            return verificationToken(Output.of(verificationToken));
        }

        public ChannelSlackArgs build() {
            $.botName = Objects.requireNonNull($.botName, "expected parameter 'botName' to be non-null");
            $.clientId = Objects.requireNonNull($.clientId, "expected parameter 'clientId' to be non-null");
            $.clientSecret = Objects.requireNonNull($.clientSecret, "expected parameter 'clientSecret' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.verificationToken = Objects.requireNonNull($.verificationToken, "expected parameter 'verificationToken' to be non-null");
            return $;
        }
    }

}
