// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.enums.OpenAuthenticationProviderType;
import io.pulumi.azurenative.logic.inputs.OpenAuthenticationPolicyClaimArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Open authentication access policy defined by user.
 * 
 */
public final class OpenAuthenticationAccessPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final OpenAuthenticationAccessPolicyArgs Empty = new OpenAuthenticationAccessPolicyArgs();

    /**
     * The access policy claims.
     * 
     */
    @InputImport(name="claims")
        private final @Nullable Input<List<OpenAuthenticationPolicyClaimArgs>> claims;

    public Input<List<OpenAuthenticationPolicyClaimArgs>> getClaims() {
        return this.claims == null ? Input.empty() : this.claims;
    }

    /**
     * Type of provider for OAuth.
     * 
     */
    @InputImport(name="type")
        private final @Nullable Input<Either<String,OpenAuthenticationProviderType>> type;

    public Input<Either<String,OpenAuthenticationProviderType>> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public OpenAuthenticationAccessPolicyArgs(
        @Nullable Input<List<OpenAuthenticationPolicyClaimArgs>> claims,
        @Nullable Input<Either<String,OpenAuthenticationProviderType>> type) {
        this.claims = claims;
        this.type = type;
    }

    private OpenAuthenticationAccessPolicyArgs() {
        this.claims = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OpenAuthenticationAccessPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<OpenAuthenticationPolicyClaimArgs>> claims;
        private @Nullable Input<Either<String,OpenAuthenticationProviderType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(OpenAuthenticationAccessPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.claims = defaults.claims;
    	      this.type = defaults.type;
        }

        public Builder setClaims(@Nullable Input<List<OpenAuthenticationPolicyClaimArgs>> claims) {
            this.claims = claims;
            return this;
        }

        public Builder setClaims(@Nullable List<OpenAuthenticationPolicyClaimArgs> claims) {
            this.claims = Input.ofNullable(claims);
            return this;
        }

        public Builder setType(@Nullable Input<Either<String,OpenAuthenticationProviderType>> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable Either<String,OpenAuthenticationProviderType> type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public OpenAuthenticationAccessPolicyArgs build() {
            return new OpenAuthenticationAccessPolicyArgs(claims, type);
        }
    }
}
