// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WindowsFunctionAppSlotAuthSettingsTwitterArgs extends com.pulumi.resources.ResourceArgs {

    public static final WindowsFunctionAppSlotAuthSettingsTwitterArgs Empty = new WindowsFunctionAppSlotAuthSettingsTwitterArgs();

    /**
     * The OAuth 1.0a consumer key of the Twitter application used for sign-in.
     * 
     */
    @Import(name="consumerKey", required=true)
    private Output<String> consumerKey;

    /**
     * @return The OAuth 1.0a consumer key of the Twitter application used for sign-in.
     * 
     */
    public Output<String> consumerKey() {
        return this.consumerKey;
    }

    /**
     * The OAuth 1.0a consumer secret of the Twitter application used for sign-in. Cannot be specified with `consumer_secret_setting_name`.
     * 
     */
    @Import(name="consumerSecret")
    private @Nullable Output<String> consumerSecret;

    /**
     * @return The OAuth 1.0a consumer secret of the Twitter application used for sign-in. Cannot be specified with `consumer_secret_setting_name`.
     * 
     */
    public Optional<Output<String>> consumerSecret() {
        return Optional.ofNullable(this.consumerSecret);
    }

    /**
     * The app setting name that contains the OAuth 1.0a consumer secret of the Twitter application used for sign-in. Cannot be specified with `consumer_secret`.
     * 
     */
    @Import(name="consumerSecretSettingName")
    private @Nullable Output<String> consumerSecretSettingName;

    /**
     * @return The app setting name that contains the OAuth 1.0a consumer secret of the Twitter application used for sign-in. Cannot be specified with `consumer_secret`.
     * 
     */
    public Optional<Output<String>> consumerSecretSettingName() {
        return Optional.ofNullable(this.consumerSecretSettingName);
    }

    private WindowsFunctionAppSlotAuthSettingsTwitterArgs() {}

    private WindowsFunctionAppSlotAuthSettingsTwitterArgs(WindowsFunctionAppSlotAuthSettingsTwitterArgs $) {
        this.consumerKey = $.consumerKey;
        this.consumerSecret = $.consumerSecret;
        this.consumerSecretSettingName = $.consumerSecretSettingName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WindowsFunctionAppSlotAuthSettingsTwitterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WindowsFunctionAppSlotAuthSettingsTwitterArgs $;

        public Builder() {
            $ = new WindowsFunctionAppSlotAuthSettingsTwitterArgs();
        }

        public Builder(WindowsFunctionAppSlotAuthSettingsTwitterArgs defaults) {
            $ = new WindowsFunctionAppSlotAuthSettingsTwitterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param consumerKey The OAuth 1.0a consumer key of the Twitter application used for sign-in.
         * 
         * @return builder
         * 
         */
        public Builder consumerKey(Output<String> consumerKey) {
            $.consumerKey = consumerKey;
            return this;
        }

        /**
         * @param consumerKey The OAuth 1.0a consumer key of the Twitter application used for sign-in.
         * 
         * @return builder
         * 
         */
        public Builder consumerKey(String consumerKey) {
            return consumerKey(Output.of(consumerKey));
        }

        /**
         * @param consumerSecret The OAuth 1.0a consumer secret of the Twitter application used for sign-in. Cannot be specified with `consumer_secret_setting_name`.
         * 
         * @return builder
         * 
         */
        public Builder consumerSecret(@Nullable Output<String> consumerSecret) {
            $.consumerSecret = consumerSecret;
            return this;
        }

        /**
         * @param consumerSecret The OAuth 1.0a consumer secret of the Twitter application used for sign-in. Cannot be specified with `consumer_secret_setting_name`.
         * 
         * @return builder
         * 
         */
        public Builder consumerSecret(String consumerSecret) {
            return consumerSecret(Output.of(consumerSecret));
        }

        /**
         * @param consumerSecretSettingName The app setting name that contains the OAuth 1.0a consumer secret of the Twitter application used for sign-in. Cannot be specified with `consumer_secret`.
         * 
         * @return builder
         * 
         */
        public Builder consumerSecretSettingName(@Nullable Output<String> consumerSecretSettingName) {
            $.consumerSecretSettingName = consumerSecretSettingName;
            return this;
        }

        /**
         * @param consumerSecretSettingName The app setting name that contains the OAuth 1.0a consumer secret of the Twitter application used for sign-in. Cannot be specified with `consumer_secret`.
         * 
         * @return builder
         * 
         */
        public Builder consumerSecretSettingName(String consumerSecretSettingName) {
            return consumerSecretSettingName(Output.of(consumerSecretSettingName));
        }

        public WindowsFunctionAppSlotAuthSettingsTwitterArgs build() {
            $.consumerKey = Objects.requireNonNull($.consumerKey, "expected parameter 'consumerKey' to be non-null");
            return $;
        }
    }

}
