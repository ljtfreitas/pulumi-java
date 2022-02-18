// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.azurenative.containerregistry.enums.TokenType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The authorization properties for accessing the source code repository.
 * 
 */
public final class AuthInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final AuthInfoArgs Empty = new AuthInfoArgs();

    /**
     * Time in seconds that the token remains valid
     * 
     */
    @InputImport(name="expiresIn")
    private final @Nullable Input<Integer> expiresIn;

    public Input<Integer> getExpiresIn() {
        return this.expiresIn == null ? Input.empty() : this.expiresIn;
    }

    /**
     * The refresh token used to refresh the access token.
     * 
     */
    @InputImport(name="refreshToken")
    private final @Nullable Input<String> refreshToken;

    public Input<String> getRefreshToken() {
        return this.refreshToken == null ? Input.empty() : this.refreshToken;
    }

    /**
     * The scope of the access token.
     * 
     */
    @InputImport(name="scope")
    private final @Nullable Input<String> scope;

    public Input<String> getScope() {
        return this.scope == null ? Input.empty() : this.scope;
    }

    /**
     * The access token used to access the source control provider.
     * 
     */
    @InputImport(name="token", required=true)
    private final Input<String> token;

    public Input<String> getToken() {
        return this.token;
    }

    /**
     * The type of Auth token.
     * 
     */
    @InputImport(name="tokenType", required=true)
    private final Input<Either<String,TokenType>> tokenType;

    public Input<Either<String,TokenType>> getTokenType() {
        return this.tokenType;
    }

    public AuthInfoArgs(
        @Nullable Input<Integer> expiresIn,
        @Nullable Input<String> refreshToken,
        @Nullable Input<String> scope,
        Input<String> token,
        Input<Either<String,TokenType>> tokenType) {
        this.expiresIn = expiresIn;
        this.refreshToken = refreshToken;
        this.scope = scope;
        this.token = Objects.requireNonNull(token, "expected parameter 'token' to be non-null");
        this.tokenType = Objects.requireNonNull(tokenType, "expected parameter 'tokenType' to be non-null");
    }

    private AuthInfoArgs() {
        this.expiresIn = Input.empty();
        this.refreshToken = Input.empty();
        this.scope = Input.empty();
        this.token = Input.empty();
        this.tokenType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> expiresIn;
        private @Nullable Input<String> refreshToken;
        private @Nullable Input<String> scope;
        private Input<String> token;
        private Input<Either<String,TokenType>> tokenType;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expiresIn = defaults.expiresIn;
    	      this.refreshToken = defaults.refreshToken;
    	      this.scope = defaults.scope;
    	      this.token = defaults.token;
    	      this.tokenType = defaults.tokenType;
        }

        public Builder setExpiresIn(@Nullable Input<Integer> expiresIn) {
            this.expiresIn = expiresIn;
            return this;
        }

        public Builder setExpiresIn(@Nullable Integer expiresIn) {
            this.expiresIn = Input.ofNullable(expiresIn);
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

        public Builder setScope(@Nullable Input<String> scope) {
            this.scope = scope;
            return this;
        }

        public Builder setScope(@Nullable String scope) {
            this.scope = Input.ofNullable(scope);
            return this;
        }

        public Builder setToken(Input<String> token) {
            this.token = Objects.requireNonNull(token);
            return this;
        }

        public Builder setToken(String token) {
            this.token = Input.of(Objects.requireNonNull(token));
            return this;
        }

        public Builder setTokenType(Input<Either<String,TokenType>> tokenType) {
            this.tokenType = Objects.requireNonNull(tokenType);
            return this;
        }

        public Builder setTokenType(Either<String,TokenType> tokenType) {
            this.tokenType = Input.of(Objects.requireNonNull(tokenType));
            return this;
        }

        public AuthInfoArgs build() {
            return new AuthInfoArgs(expiresIn, refreshToken, scope, token, tokenType);
        }
    }
}
