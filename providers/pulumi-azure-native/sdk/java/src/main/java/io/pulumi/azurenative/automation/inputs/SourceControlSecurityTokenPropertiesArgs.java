// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.azurenative.automation.enums.TokenType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SourceControlSecurityTokenPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final SourceControlSecurityTokenPropertiesArgs Empty = new SourceControlSecurityTokenPropertiesArgs();

    /**
     * The access token.
     * 
     */
    @InputImport(name="accessToken")
        private final @Nullable Input<String> accessToken;

    public Input<String> getAccessToken() {
        return this.accessToken == null ? Input.empty() : this.accessToken;
    }

    /**
     * The refresh token.
     * 
     */
    @InputImport(name="refreshToken")
        private final @Nullable Input<String> refreshToken;

    public Input<String> getRefreshToken() {
        return this.refreshToken == null ? Input.empty() : this.refreshToken;
    }

    /**
     * The token type. Must be either PersonalAccessToken or Oauth.
     * 
     */
    @InputImport(name="tokenType")
        private final @Nullable Input<Either<String,TokenType>> tokenType;

    public Input<Either<String,TokenType>> getTokenType() {
        return this.tokenType == null ? Input.empty() : this.tokenType;
    }

    public SourceControlSecurityTokenPropertiesArgs(
        @Nullable Input<String> accessToken,
        @Nullable Input<String> refreshToken,
        @Nullable Input<Either<String,TokenType>> tokenType) {
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
        this.tokenType = tokenType;
    }

    private SourceControlSecurityTokenPropertiesArgs() {
        this.accessToken = Input.empty();
        this.refreshToken = Input.empty();
        this.tokenType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceControlSecurityTokenPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> accessToken;
        private @Nullable Input<String> refreshToken;
        private @Nullable Input<Either<String,TokenType>> tokenType;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceControlSecurityTokenPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.refreshToken = defaults.refreshToken;
    	      this.tokenType = defaults.tokenType;
        }

        public Builder setAccessToken(@Nullable Input<String> accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        public Builder setAccessToken(@Nullable String accessToken) {
            this.accessToken = Input.ofNullable(accessToken);
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

        public Builder setTokenType(@Nullable Input<Either<String,TokenType>> tokenType) {
            this.tokenType = tokenType;
            return this;
        }

        public Builder setTokenType(@Nullable Either<String,TokenType> tokenType) {
            this.tokenType = Input.ofNullable(tokenType);
            return this;
        }
        public SourceControlSecurityTokenPropertiesArgs build() {
            return new SourceControlSecurityTokenPropertiesArgs(accessToken, refreshToken, tokenType);
        }
    }
}
