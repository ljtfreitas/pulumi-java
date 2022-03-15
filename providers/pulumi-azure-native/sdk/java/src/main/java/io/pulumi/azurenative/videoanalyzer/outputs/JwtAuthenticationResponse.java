// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.outputs;

import io.pulumi.azurenative.videoanalyzer.outputs.EccTokenKeyResponse;
import io.pulumi.azurenative.videoanalyzer.outputs.RsaTokenKeyResponse;
import io.pulumi.azurenative.videoanalyzer.outputs.TokenClaimResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class JwtAuthenticationResponse {
    /**
     * List of expected token audiences. Token audience is valid if it matches at least one of the given values.
     * 
     */
    private final @Nullable List<String> audiences;
    /**
     * List of additional token claims to be validated. Token must contains all claims and respective values for it to be valid.
     * 
     */
    private final @Nullable List<TokenClaimResponse> claims;
    /**
     * List of expected token issuers. Token issuer is valid if it matches at least one of the given values.
     * 
     */
    private final @Nullable List<String> issuers;
    /**
     * List of keys which can be used to validate access tokens. Having multiple keys allow for seamless key rotation of the token signing key. Token signature must match exactly one key.
     * 
     */
    private final @Nullable List<Either<EccTokenKeyResponse,RsaTokenKeyResponse>> keys;
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.VideoAnalyzer.JwtAuthentication'.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private JwtAuthenticationResponse(
        @CustomType.Parameter("audiences") @Nullable List<String> audiences,
        @CustomType.Parameter("claims") @Nullable List<TokenClaimResponse> claims,
        @CustomType.Parameter("issuers") @Nullable List<String> issuers,
        @CustomType.Parameter("keys") @Nullable List<Either<EccTokenKeyResponse,RsaTokenKeyResponse>> keys,
        @CustomType.Parameter("type") String type) {
        this.audiences = audiences;
        this.claims = claims;
        this.issuers = issuers;
        this.keys = keys;
        this.type = type;
    }

    /**
     * List of expected token audiences. Token audience is valid if it matches at least one of the given values.
     * 
    */
    public List<String> getAudiences() {
        return this.audiences == null ? List.of() : this.audiences;
    }
    /**
     * List of additional token claims to be validated. Token must contains all claims and respective values for it to be valid.
     * 
    */
    public List<TokenClaimResponse> getClaims() {
        return this.claims == null ? List.of() : this.claims;
    }
    /**
     * List of expected token issuers. Token issuer is valid if it matches at least one of the given values.
     * 
    */
    public List<String> getIssuers() {
        return this.issuers == null ? List.of() : this.issuers;
    }
    /**
     * List of keys which can be used to validate access tokens. Having multiple keys allow for seamless key rotation of the token signing key. Token signature must match exactly one key.
     * 
    */
    public List<Either<EccTokenKeyResponse,RsaTokenKeyResponse>> getKeys() {
        return this.keys == null ? List.of() : this.keys;
    }
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.VideoAnalyzer.JwtAuthentication'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JwtAuthenticationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> audiences;
        private @Nullable List<TokenClaimResponse> claims;
        private @Nullable List<String> issuers;
        private @Nullable List<Either<EccTokenKeyResponse,RsaTokenKeyResponse>> keys;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(JwtAuthenticationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audiences = defaults.audiences;
    	      this.claims = defaults.claims;
    	      this.issuers = defaults.issuers;
    	      this.keys = defaults.keys;
    	      this.type = defaults.type;
        }

        public Builder audiences(@Nullable List<String> audiences) {
            this.audiences = audiences;
            return this;
        }

        public Builder claims(@Nullable List<TokenClaimResponse> claims) {
            this.claims = claims;
            return this;
        }

        public Builder issuers(@Nullable List<String> issuers) {
            this.issuers = issuers;
            return this;
        }

        public Builder keys(@Nullable List<Either<EccTokenKeyResponse,RsaTokenKeyResponse>> keys) {
            this.keys = keys;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public JwtAuthenticationResponse build() {
            return new JwtAuthenticationResponse(audiences, claims, issuers, keys, type);
        }
    }
}
