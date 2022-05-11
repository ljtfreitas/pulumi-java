// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class FunctionAppAuthSettingsFacebook {
    /**
     * @return The App ID of the Facebook app used for login
     * 
     */
    private final String appId;
    /**
     * @return The App Secret of the Facebook app used for Facebook Login.
     * 
     */
    private final String appSecret;
    /**
     * @return The OAuth 2.0 scopes that will be requested as part of Facebook Login authentication. https://developers.facebook.com/docs/facebook-login
     * 
     */
    private final @Nullable List<String> oauthScopes;

    @CustomType.Constructor
    private FunctionAppAuthSettingsFacebook(
        @CustomType.Parameter("appId") String appId,
        @CustomType.Parameter("appSecret") String appSecret,
        @CustomType.Parameter("oauthScopes") @Nullable List<String> oauthScopes) {
        this.appId = appId;
        this.appSecret = appSecret;
        this.oauthScopes = oauthScopes;
    }

    /**
     * @return The App ID of the Facebook app used for login
     * 
     */
    public String appId() {
        return this.appId;
    }
    /**
     * @return The App Secret of the Facebook app used for Facebook Login.
     * 
     */
    public String appSecret() {
        return this.appSecret;
    }
    /**
     * @return The OAuth 2.0 scopes that will be requested as part of Facebook Login authentication. https://developers.facebook.com/docs/facebook-login
     * 
     */
    public List<String> oauthScopes() {
        return this.oauthScopes == null ? List.of() : this.oauthScopes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionAppAuthSettingsFacebook defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appId;
        private String appSecret;
        private @Nullable List<String> oauthScopes;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionAppAuthSettingsFacebook defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.appSecret = defaults.appSecret;
    	      this.oauthScopes = defaults.oauthScopes;
        }

        public Builder appId(String appId) {
            this.appId = Objects.requireNonNull(appId);
            return this;
        }
        public Builder appSecret(String appSecret) {
            this.appSecret = Objects.requireNonNull(appSecret);
            return this;
        }
        public Builder oauthScopes(@Nullable List<String> oauthScopes) {
            this.oauthScopes = oauthScopes;
            return this;
        }
        public Builder oauthScopes(String... oauthScopes) {
            return oauthScopes(List.of(oauthScopes));
        }        public FunctionAppAuthSettingsFacebook build() {
            return new FunctionAppAuthSettingsFacebook(appId, appSecret, oauthScopes);
        }
    }
}
