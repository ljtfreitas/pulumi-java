// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration settings of the nonce used in the login flow.
 * 
 */
public final class NonceArgs extends io.pulumi.resources.ResourceArgs {

    public static final NonceArgs Empty = new NonceArgs();

    /**
     * The time after the request is made when the nonce should expire.
     * 
     */
    @Import(name="nonceExpirationInterval")
      private final @Nullable Output<String> nonceExpirationInterval;

    public Output<String> getNonceExpirationInterval() {
        return this.nonceExpirationInterval == null ? Output.empty() : this.nonceExpirationInterval;
    }

    /**
     * <code>false</code> if the nonce should not be validated while completing the login flow; otherwise, <code>true</code>.
     * 
     */
    @Import(name="validateNonce")
      private final @Nullable Output<Boolean> validateNonce;

    public Output<Boolean> getValidateNonce() {
        return this.validateNonce == null ? Output.empty() : this.validateNonce;
    }

    public NonceArgs(
        @Nullable Output<String> nonceExpirationInterval,
        @Nullable Output<Boolean> validateNonce) {
        this.nonceExpirationInterval = nonceExpirationInterval;
        this.validateNonce = validateNonce;
    }

    private NonceArgs() {
        this.nonceExpirationInterval = Output.empty();
        this.validateNonce = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NonceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> nonceExpirationInterval;
        private @Nullable Output<Boolean> validateNonce;

        public Builder() {
    	      // Empty
        }

        public Builder(NonceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nonceExpirationInterval = defaults.nonceExpirationInterval;
    	      this.validateNonce = defaults.validateNonce;
        }

        public Builder nonceExpirationInterval(@Nullable Output<String> nonceExpirationInterval) {
            this.nonceExpirationInterval = nonceExpirationInterval;
            return this;
        }

        public Builder nonceExpirationInterval(@Nullable String nonceExpirationInterval) {
            this.nonceExpirationInterval = Output.ofNullable(nonceExpirationInterval);
            return this;
        }

        public Builder validateNonce(@Nullable Output<Boolean> validateNonce) {
            this.validateNonce = validateNonce;
            return this;
        }

        public Builder validateNonce(@Nullable Boolean validateNonce) {
            this.validateNonce = Output.ofNullable(validateNonce);
            return this;
        }
        public NonceArgs build() {
            return new NonceArgs(nonceExpirationInterval, validateNonce);
        }
    }
}
