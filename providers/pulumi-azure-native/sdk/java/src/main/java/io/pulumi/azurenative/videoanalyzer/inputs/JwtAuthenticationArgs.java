// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.inputs;

import io.pulumi.azurenative.videoanalyzer.inputs.EccTokenKeyArgs;
import io.pulumi.azurenative.videoanalyzer.inputs.RsaTokenKeyArgs;
import io.pulumi.azurenative.videoanalyzer.inputs.TokenClaimArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties for access validation based on JSON Web Tokens (JWT).
 * 
 */
public final class JwtAuthenticationArgs extends io.pulumi.resources.ResourceArgs {

    public static final JwtAuthenticationArgs Empty = new JwtAuthenticationArgs();

    /**
     * List of expected token audiences. Token audience is valid if it matches at least one of the given values.
     * 
     */
    @Import(name="audiences")
      private final @Nullable Output<List<String>> audiences;

    public Output<List<String>> getAudiences() {
        return this.audiences == null ? Output.empty() : this.audiences;
    }

    /**
     * List of additional token claims to be validated. Token must contains all claims and respective values for it to be valid.
     * 
     */
    @Import(name="claims")
      private final @Nullable Output<List<TokenClaimArgs>> claims;

    public Output<List<TokenClaimArgs>> getClaims() {
        return this.claims == null ? Output.empty() : this.claims;
    }

    /**
     * List of expected token issuers. Token issuer is valid if it matches at least one of the given values.
     * 
     */
    @Import(name="issuers")
      private final @Nullable Output<List<String>> issuers;

    public Output<List<String>> getIssuers() {
        return this.issuers == null ? Output.empty() : this.issuers;
    }

    /**
     * List of keys which can be used to validate access tokens. Having multiple keys allow for seamless key rotation of the token signing key. Token signature must match exactly one key.
     * 
     */
    @Import(name="keys")
      private final @Nullable Output<List<Either<EccTokenKeyArgs,RsaTokenKeyArgs>>> keys;

    public Output<List<Either<EccTokenKeyArgs,RsaTokenKeyArgs>>> getKeys() {
        return this.keys == null ? Output.empty() : this.keys;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.VideoAnalyzer.JwtAuthentication'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public JwtAuthenticationArgs(
        @Nullable Output<List<String>> audiences,
        @Nullable Output<List<TokenClaimArgs>> claims,
        @Nullable Output<List<String>> issuers,
        @Nullable Output<List<Either<EccTokenKeyArgs,RsaTokenKeyArgs>>> keys,
        Output<String> type) {
        this.audiences = audiences;
        this.claims = claims;
        this.issuers = issuers;
        this.keys = keys;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private JwtAuthenticationArgs() {
        this.audiences = Output.empty();
        this.claims = Output.empty();
        this.issuers = Output.empty();
        this.keys = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JwtAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> audiences;
        private @Nullable Output<List<TokenClaimArgs>> claims;
        private @Nullable Output<List<String>> issuers;
        private @Nullable Output<List<Either<EccTokenKeyArgs,RsaTokenKeyArgs>>> keys;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(JwtAuthenticationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audiences = defaults.audiences;
    	      this.claims = defaults.claims;
    	      this.issuers = defaults.issuers;
    	      this.keys = defaults.keys;
    	      this.type = defaults.type;
        }

        public Builder audiences(@Nullable Output<List<String>> audiences) {
            this.audiences = audiences;
            return this;
        }

        public Builder audiences(@Nullable List<String> audiences) {
            this.audiences = Output.ofNullable(audiences);
            return this;
        }

        public Builder claims(@Nullable Output<List<TokenClaimArgs>> claims) {
            this.claims = claims;
            return this;
        }

        public Builder claims(@Nullable List<TokenClaimArgs> claims) {
            this.claims = Output.ofNullable(claims);
            return this;
        }

        public Builder issuers(@Nullable Output<List<String>> issuers) {
            this.issuers = issuers;
            return this;
        }

        public Builder issuers(@Nullable List<String> issuers) {
            this.issuers = Output.ofNullable(issuers);
            return this;
        }

        public Builder keys(@Nullable Output<List<Either<EccTokenKeyArgs,RsaTokenKeyArgs>>> keys) {
            this.keys = keys;
            return this;
        }

        public Builder keys(@Nullable List<Either<EccTokenKeyArgs,RsaTokenKeyArgs>> keys) {
            this.keys = Output.ofNullable(keys);
            return this;
        }

        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public JwtAuthenticationArgs build() {
            return new JwtAuthenticationArgs(audiences, claims, issuers, keys, type);
        }
    }
}
