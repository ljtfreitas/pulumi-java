// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.bot.inputs;

import com.pulumi.azure.bot.inputs.ChannelFacebookPageArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ChannelFacebookState extends com.pulumi.resources.ResourceArgs {

    public static final ChannelFacebookState Empty = new ChannelFacebookState();

    /**
     * The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="botName")
    private @Nullable Output<String> botName;

    /**
     * @return The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> botName() {
        return Optional.ofNullable(this.botName);
    }

    /**
     * The Facebook Application ID for the Facebook Channel.
     * 
     */
    @Import(name="facebookApplicationId")
    private @Nullable Output<String> facebookApplicationId;

    /**
     * @return The Facebook Application ID for the Facebook Channel.
     * 
     */
    public Optional<Output<String>> facebookApplicationId() {
        return Optional.ofNullable(this.facebookApplicationId);
    }

    /**
     * The Facebook Application Secret for the Facebook Channel.
     * 
     */
    @Import(name="facebookApplicationSecret")
    private @Nullable Output<String> facebookApplicationSecret;

    /**
     * @return The Facebook Application Secret for the Facebook Channel.
     * 
     */
    public Optional<Output<String>> facebookApplicationSecret() {
        return Optional.ofNullable(this.facebookApplicationSecret);
    }

    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * One or more `page` blocks as defined below.
     * 
     */
    @Import(name="pages")
    private @Nullable Output<List<ChannelFacebookPageArgs>> pages;

    /**
     * @return One or more `page` blocks as defined below.
     * 
     */
    public Optional<Output<List<ChannelFacebookPageArgs>>> pages() {
        return Optional.ofNullable(this.pages);
    }

    /**
     * The name of the resource group where the Facebook Channel should be created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the resource group where the Facebook Channel should be created. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    private ChannelFacebookState() {}

    private ChannelFacebookState(ChannelFacebookState $) {
        this.botName = $.botName;
        this.facebookApplicationId = $.facebookApplicationId;
        this.facebookApplicationSecret = $.facebookApplicationSecret;
        this.location = $.location;
        this.pages = $.pages;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChannelFacebookState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChannelFacebookState $;

        public Builder() {
            $ = new ChannelFacebookState();
        }

        public Builder(ChannelFacebookState defaults) {
            $ = new ChannelFacebookState(Objects.requireNonNull(defaults));
        }

        /**
         * @param botName The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder botName(@Nullable Output<String> botName) {
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
         * @param facebookApplicationId The Facebook Application ID for the Facebook Channel.
         * 
         * @return builder
         * 
         */
        public Builder facebookApplicationId(@Nullable Output<String> facebookApplicationId) {
            $.facebookApplicationId = facebookApplicationId;
            return this;
        }

        /**
         * @param facebookApplicationId The Facebook Application ID for the Facebook Channel.
         * 
         * @return builder
         * 
         */
        public Builder facebookApplicationId(String facebookApplicationId) {
            return facebookApplicationId(Output.of(facebookApplicationId));
        }

        /**
         * @param facebookApplicationSecret The Facebook Application Secret for the Facebook Channel.
         * 
         * @return builder
         * 
         */
        public Builder facebookApplicationSecret(@Nullable Output<String> facebookApplicationSecret) {
            $.facebookApplicationSecret = facebookApplicationSecret;
            return this;
        }

        /**
         * @param facebookApplicationSecret The Facebook Application Secret for the Facebook Channel.
         * 
         * @return builder
         * 
         */
        public Builder facebookApplicationSecret(String facebookApplicationSecret) {
            return facebookApplicationSecret(Output.of(facebookApplicationSecret));
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param pages One or more `page` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder pages(@Nullable Output<List<ChannelFacebookPageArgs>> pages) {
            $.pages = pages;
            return this;
        }

        /**
         * @param pages One or more `page` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder pages(List<ChannelFacebookPageArgs> pages) {
            return pages(Output.of(pages));
        }

        /**
         * @param pages One or more `page` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder pages(ChannelFacebookPageArgs... pages) {
            return pages(List.of(pages));
        }

        /**
         * @param resourceGroupName The name of the resource group where the Facebook Channel should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group where the Facebook Channel should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public ChannelFacebookState build() {
            return $;
        }
    }

}
