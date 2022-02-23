// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AuthorizerArgs extends io.pulumi.resources.ResourceArgs {

    public static final AuthorizerArgs Empty = new AuthorizerArgs();

    /**
     * The ARN of the authorizer's Lambda function.
     * 
     */
    @InputImport(name="authorizerFunctionArn", required=true)
    private final Input<String> authorizerFunctionArn;

    public Input<String> getAuthorizerFunctionArn() {
        return this.authorizerFunctionArn;
    }

    /**
     * The name of the authorizer.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Specifies whether AWS IoT validates the token signature in an authorization request. Default: `false`.
     * 
     */
    @InputImport(name="signingDisabled")
    private final @Nullable Input<Boolean> signingDisabled;

    public Input<Boolean> getSigningDisabled() {
        return this.signingDisabled == null ? Input.empty() : this.signingDisabled;
    }

    /**
     * The status of Authorizer request at creation. Valid values: `ACTIVE`, `INACTIVE`. Default: `ACTIVE`.
     * 
     */
    @InputImport(name="status")
    private final @Nullable Input<String> status;

    public Input<String> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    /**
     * The name of the token key used to extract the token from the HTTP headers. This value is required if signing is enabled in your authorizer.
     * 
     */
    @InputImport(name="tokenKeyName")
    private final @Nullable Input<String> tokenKeyName;

    public Input<String> getTokenKeyName() {
        return this.tokenKeyName == null ? Input.empty() : this.tokenKeyName;
    }

    /**
     * The public keys used to verify the digital signature returned by your custom authentication service. This value is required if signing is enabled in your authorizer.
     * 
     */
    @InputImport(name="tokenSigningPublicKeys")
    private final @Nullable Input<Map<String,String>> tokenSigningPublicKeys;

    public Input<Map<String,String>> getTokenSigningPublicKeys() {
        return this.tokenSigningPublicKeys == null ? Input.empty() : this.tokenSigningPublicKeys;
    }

    public AuthorizerArgs(
        Input<String> authorizerFunctionArn,
        @Nullable Input<String> name,
        @Nullable Input<Boolean> signingDisabled,
        @Nullable Input<String> status,
        @Nullable Input<String> tokenKeyName,
        @Nullable Input<Map<String,String>> tokenSigningPublicKeys) {
        this.authorizerFunctionArn = Objects.requireNonNull(authorizerFunctionArn, "expected parameter 'authorizerFunctionArn' to be non-null");
        this.name = name;
        this.signingDisabled = signingDisabled;
        this.status = status;
        this.tokenKeyName = tokenKeyName;
        this.tokenSigningPublicKeys = tokenSigningPublicKeys;
    }

    private AuthorizerArgs() {
        this.authorizerFunctionArn = Input.empty();
        this.name = Input.empty();
        this.signingDisabled = Input.empty();
        this.status = Input.empty();
        this.tokenKeyName = Input.empty();
        this.tokenSigningPublicKeys = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorizerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> authorizerFunctionArn;
        private @Nullable Input<String> name;
        private @Nullable Input<Boolean> signingDisabled;
        private @Nullable Input<String> status;
        private @Nullable Input<String> tokenKeyName;
        private @Nullable Input<Map<String,String>> tokenSigningPublicKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorizerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizerFunctionArn = defaults.authorizerFunctionArn;
    	      this.name = defaults.name;
    	      this.signingDisabled = defaults.signingDisabled;
    	      this.status = defaults.status;
    	      this.tokenKeyName = defaults.tokenKeyName;
    	      this.tokenSigningPublicKeys = defaults.tokenSigningPublicKeys;
        }

        public Builder setAuthorizerFunctionArn(Input<String> authorizerFunctionArn) {
            this.authorizerFunctionArn = Objects.requireNonNull(authorizerFunctionArn);
            return this;
        }

        public Builder setAuthorizerFunctionArn(String authorizerFunctionArn) {
            this.authorizerFunctionArn = Input.of(Objects.requireNonNull(authorizerFunctionArn));
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setSigningDisabled(@Nullable Input<Boolean> signingDisabled) {
            this.signingDisabled = signingDisabled;
            return this;
        }

        public Builder setSigningDisabled(@Nullable Boolean signingDisabled) {
            this.signingDisabled = Input.ofNullable(signingDisabled);
            return this;
        }

        public Builder setStatus(@Nullable Input<String> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public Builder setTokenKeyName(@Nullable Input<String> tokenKeyName) {
            this.tokenKeyName = tokenKeyName;
            return this;
        }

        public Builder setTokenKeyName(@Nullable String tokenKeyName) {
            this.tokenKeyName = Input.ofNullable(tokenKeyName);
            return this;
        }

        public Builder setTokenSigningPublicKeys(@Nullable Input<Map<String,String>> tokenSigningPublicKeys) {
            this.tokenSigningPublicKeys = tokenSigningPublicKeys;
            return this;
        }

        public Builder setTokenSigningPublicKeys(@Nullable Map<String,String> tokenSigningPublicKeys) {
            this.tokenSigningPublicKeys = Input.ofNullable(tokenSigningPublicKeys);
            return this;
        }
        public AuthorizerArgs build() {
            return new AuthorizerArgs(authorizerFunctionArn, name, signingDisabled, status, tokenKeyName, tokenSigningPublicKeys);
        }
    }
}