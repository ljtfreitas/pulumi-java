// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WindowsFunctionAppSlotAuthSettingsFacebookArgs extends com.pulumi.resources.ResourceArgs {

    public static final WindowsFunctionAppSlotAuthSettingsFacebookArgs Empty = new WindowsFunctionAppSlotAuthSettingsFacebookArgs();

    /**
     * The App ID of the Facebook app used for login.
     * 
     */
    @Import(name="appId", required=true)
    private Output<String> appId;

    /**
     * @return The App ID of the Facebook app used for login.
     * 
     */
    public Output<String> appId() {
        return this.appId;
    }

    /**
     * The App Secret of the Facebook app used for Facebook Login. Cannot be specified with `app_secret_setting_name`.
     * 
     */
    @Import(name="appSecret")
    private @Nullable Output<String> appSecret;

    /**
     * @return The App Secret of the Facebook app used for Facebook Login. Cannot be specified with `app_secret_setting_name`.
     * 
     */
    public Optional<Output<String>> appSecret() {
        return Optional.ofNullable(this.appSecret);
    }

    /**
     * The app setting name that contains the `app_secret` value used for Facebook Login. Cannot be specified with `app_secret`.
     * 
     */
    @Import(name="appSecretSettingName")
    private @Nullable Output<String> appSecretSettingName;

    /**
     * @return The app setting name that contains the `app_secret` value used for Facebook Login. Cannot be specified with `app_secret`.
     * 
     */
    public Optional<Output<String>> appSecretSettingName() {
        return Optional.ofNullable(this.appSecretSettingName);
    }

    /**
     * an `oauth_scopes` block as detailed below.
     * 
     */
    @Import(name="oauthScopes")
    private @Nullable Output<List<String>> oauthScopes;

    /**
     * @return an `oauth_scopes` block as detailed below.
     * 
     */
    public Optional<Output<List<String>>> oauthScopes() {
        return Optional.ofNullable(this.oauthScopes);
    }

    private WindowsFunctionAppSlotAuthSettingsFacebookArgs() {}

    private WindowsFunctionAppSlotAuthSettingsFacebookArgs(WindowsFunctionAppSlotAuthSettingsFacebookArgs $) {
        this.appId = $.appId;
        this.appSecret = $.appSecret;
        this.appSecretSettingName = $.appSecretSettingName;
        this.oauthScopes = $.oauthScopes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WindowsFunctionAppSlotAuthSettingsFacebookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WindowsFunctionAppSlotAuthSettingsFacebookArgs $;

        public Builder() {
            $ = new WindowsFunctionAppSlotAuthSettingsFacebookArgs();
        }

        public Builder(WindowsFunctionAppSlotAuthSettingsFacebookArgs defaults) {
            $ = new WindowsFunctionAppSlotAuthSettingsFacebookArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appId The App ID of the Facebook app used for login.
         * 
         * @return builder
         * 
         */
        public Builder appId(Output<String> appId) {
            $.appId = appId;
            return this;
        }

        /**
         * @param appId The App ID of the Facebook app used for login.
         * 
         * @return builder
         * 
         */
        public Builder appId(String appId) {
            return appId(Output.of(appId));
        }

        /**
         * @param appSecret The App Secret of the Facebook app used for Facebook Login. Cannot be specified with `app_secret_setting_name`.
         * 
         * @return builder
         * 
         */
        public Builder appSecret(@Nullable Output<String> appSecret) {
            $.appSecret = appSecret;
            return this;
        }

        /**
         * @param appSecret The App Secret of the Facebook app used for Facebook Login. Cannot be specified with `app_secret_setting_name`.
         * 
         * @return builder
         * 
         */
        public Builder appSecret(String appSecret) {
            return appSecret(Output.of(appSecret));
        }

        /**
         * @param appSecretSettingName The app setting name that contains the `app_secret` value used for Facebook Login. Cannot be specified with `app_secret`.
         * 
         * @return builder
         * 
         */
        public Builder appSecretSettingName(@Nullable Output<String> appSecretSettingName) {
            $.appSecretSettingName = appSecretSettingName;
            return this;
        }

        /**
         * @param appSecretSettingName The app setting name that contains the `app_secret` value used for Facebook Login. Cannot be specified with `app_secret`.
         * 
         * @return builder
         * 
         */
        public Builder appSecretSettingName(String appSecretSettingName) {
            return appSecretSettingName(Output.of(appSecretSettingName));
        }

        /**
         * @param oauthScopes an `oauth_scopes` block as detailed below.
         * 
         * @return builder
         * 
         */
        public Builder oauthScopes(@Nullable Output<List<String>> oauthScopes) {
            $.oauthScopes = oauthScopes;
            return this;
        }

        /**
         * @param oauthScopes an `oauth_scopes` block as detailed below.
         * 
         * @return builder
         * 
         */
        public Builder oauthScopes(List<String> oauthScopes) {
            return oauthScopes(Output.of(oauthScopes));
        }

        /**
         * @param oauthScopes an `oauth_scopes` block as detailed below.
         * 
         * @return builder
         * 
         */
        public Builder oauthScopes(String... oauthScopes) {
            return oauthScopes(List.of(oauthScopes));
        }

        public WindowsFunctionAppSlotAuthSettingsFacebookArgs build() {
            $.appId = Objects.requireNonNull($.appId, "expected parameter 'appId' to be non-null");
            return $;
        }
    }

}
