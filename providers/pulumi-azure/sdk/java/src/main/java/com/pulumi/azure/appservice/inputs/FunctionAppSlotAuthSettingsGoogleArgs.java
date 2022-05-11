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


public final class FunctionAppSlotAuthSettingsGoogleArgs extends com.pulumi.resources.ResourceArgs {

    public static final FunctionAppSlotAuthSettingsGoogleArgs Empty = new FunctionAppSlotAuthSettingsGoogleArgs();

    /**
     * The OpenID Connect Client ID for the Google web application.
     * 
     */
    @Import(name="clientId", required=true)
    private Output<String> clientId;

    /**
     * @return The OpenID Connect Client ID for the Google web application.
     * 
     */
    public Output<String> clientId() {
        return this.clientId;
    }

    /**
     * The client secret associated with the Google web application.
     * 
     */
    @Import(name="clientSecret", required=true)
    private Output<String> clientSecret;

    /**
     * @return The client secret associated with the Google web application.
     * 
     */
    public Output<String> clientSecret() {
        return this.clientSecret;
    }

    /**
     * The OAuth 2.0 scopes that will be requested as part of Google Sign-In authentication. https://developers.google.com/identity/sign-in/web/
     * 
     */
    @Import(name="oauthScopes")
    private @Nullable Output<List<String>> oauthScopes;

    /**
     * @return The OAuth 2.0 scopes that will be requested as part of Google Sign-In authentication. https://developers.google.com/identity/sign-in/web/
     * 
     */
    public Optional<Output<List<String>>> oauthScopes() {
        return Optional.ofNullable(this.oauthScopes);
    }

    private FunctionAppSlotAuthSettingsGoogleArgs() {}

    private FunctionAppSlotAuthSettingsGoogleArgs(FunctionAppSlotAuthSettingsGoogleArgs $) {
        this.clientId = $.clientId;
        this.clientSecret = $.clientSecret;
        this.oauthScopes = $.oauthScopes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FunctionAppSlotAuthSettingsGoogleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FunctionAppSlotAuthSettingsGoogleArgs $;

        public Builder() {
            $ = new FunctionAppSlotAuthSettingsGoogleArgs();
        }

        public Builder(FunctionAppSlotAuthSettingsGoogleArgs defaults) {
            $ = new FunctionAppSlotAuthSettingsGoogleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientId The OpenID Connect Client ID for the Google web application.
         * 
         * @return builder
         * 
         */
        public Builder clientId(Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId The OpenID Connect Client ID for the Google web application.
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param clientSecret The client secret associated with the Google web application.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(Output<String> clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        /**
         * @param clientSecret The client secret associated with the Google web application.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(String clientSecret) {
            return clientSecret(Output.of(clientSecret));
        }

        /**
         * @param oauthScopes The OAuth 2.0 scopes that will be requested as part of Google Sign-In authentication. https://developers.google.com/identity/sign-in/web/
         * 
         * @return builder
         * 
         */
        public Builder oauthScopes(@Nullable Output<List<String>> oauthScopes) {
            $.oauthScopes = oauthScopes;
            return this;
        }

        /**
         * @param oauthScopes The OAuth 2.0 scopes that will be requested as part of Google Sign-In authentication. https://developers.google.com/identity/sign-in/web/
         * 
         * @return builder
         * 
         */
        public Builder oauthScopes(List<String> oauthScopes) {
            return oauthScopes(Output.of(oauthScopes));
        }

        /**
         * @param oauthScopes The OAuth 2.0 scopes that will be requested as part of Google Sign-In authentication. https://developers.google.com/identity/sign-in/web/
         * 
         * @return builder
         * 
         */
        public Builder oauthScopes(String... oauthScopes) {
            return oauthScopes(List.of(oauthScopes));
        }

        public FunctionAppSlotAuthSettingsGoogleArgs build() {
            $.clientId = Objects.requireNonNull($.clientId, "expected parameter 'clientId' to be non-null");
            $.clientSecret = Objects.requireNonNull($.clientSecret, "expected parameter 'clientSecret' to be non-null");
            return $;
        }
    }

}
