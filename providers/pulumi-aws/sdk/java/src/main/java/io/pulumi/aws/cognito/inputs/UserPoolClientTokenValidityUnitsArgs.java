// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserPoolClientTokenValidityUnitsArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserPoolClientTokenValidityUnitsArgs Empty = new UserPoolClientTokenValidityUnitsArgs();

    /**
     * Time unit in for the value in `access_token_validity`, defaults to `hours`.
     * 
     */
    @InputImport(name="accessToken")
    private final @Nullable Input<String> accessToken;

    public Input<String> getAccessToken() {
        return this.accessToken == null ? Input.empty() : this.accessToken;
    }

    /**
     * Time unit in for the value in `id_token_validity`, defaults to `hours`.
     * 
     */
    @InputImport(name="idToken")
    private final @Nullable Input<String> idToken;

    public Input<String> getIdToken() {
        return this.idToken == null ? Input.empty() : this.idToken;
    }

    /**
     * Time unit in for the value in `refresh_token_validity`, defaults to `days`.
     * 
     */
    @InputImport(name="refreshToken")
    private final @Nullable Input<String> refreshToken;

    public Input<String> getRefreshToken() {
        return this.refreshToken == null ? Input.empty() : this.refreshToken;
    }

    public UserPoolClientTokenValidityUnitsArgs(
        @Nullable Input<String> accessToken,
        @Nullable Input<String> idToken,
        @Nullable Input<String> refreshToken) {
        this.accessToken = accessToken;
        this.idToken = idToken;
        this.refreshToken = refreshToken;
    }

    private UserPoolClientTokenValidityUnitsArgs() {
        this.accessToken = Input.empty();
        this.idToken = Input.empty();
        this.refreshToken = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolClientTokenValidityUnitsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> accessToken;
        private @Nullable Input<String> idToken;
        private @Nullable Input<String> refreshToken;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPoolClientTokenValidityUnitsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.idToken = defaults.idToken;
    	      this.refreshToken = defaults.refreshToken;
        }

        public Builder setAccessToken(@Nullable Input<String> accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        public Builder setAccessToken(@Nullable String accessToken) {
            this.accessToken = Input.ofNullable(accessToken);
            return this;
        }

        public Builder setIdToken(@Nullable Input<String> idToken) {
            this.idToken = idToken;
            return this;
        }

        public Builder setIdToken(@Nullable String idToken) {
            this.idToken = Input.ofNullable(idToken);
            return this;
        }

        public Builder setRefreshToken(@Nullable Input<String> refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }

        public Builder setRefreshToken(@Nullable String refreshToken) {
            this.refreshToken = Input.ofNullable(refreshToken);
            return this;
        }
        public UserPoolClientTokenValidityUnitsArgs build() {
            return new UserPoolClientTokenValidityUnitsArgs(accessToken, idToken, refreshToken);
        }
    }
}
