// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.websecurityscanner.v1beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CustomAccountResponse {
    /**
     * @return The login form URL of the website.
     * 
     */
    private final String loginUrl;
    /**
     * @return Input only. The password of the custom account. The credential is stored encrypted and not returned in any response nor included in audit logs.
     * 
     */
    private final String password;
    /**
     * @return The user name of the custom account.
     * 
     */
    private final String username;

    @CustomType.Constructor
    private CustomAccountResponse(
        @CustomType.Parameter("loginUrl") String loginUrl,
        @CustomType.Parameter("password") String password,
        @CustomType.Parameter("username") String username) {
        this.loginUrl = loginUrl;
        this.password = password;
        this.username = username;
    }

    /**
     * @return The login form URL of the website.
     * 
     */
    public String loginUrl() {
        return this.loginUrl;
    }
    /**
     * @return Input only. The password of the custom account. The credential is stored encrypted and not returned in any response nor included in audit logs.
     * 
     */
    public String password() {
        return this.password;
    }
    /**
     * @return The user name of the custom account.
     * 
     */
    public String username() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomAccountResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String loginUrl;
        private String password;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomAccountResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.loginUrl = defaults.loginUrl;
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        public Builder loginUrl(String loginUrl) {
            this.loginUrl = Objects.requireNonNull(loginUrl);
            return this;
        }
        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        public Builder username(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }        public CustomAccountResponse build() {
            return new CustomAccountResponse(loginUrl, password, username);
        }
    }
}
