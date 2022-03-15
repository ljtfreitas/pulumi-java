// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AuthorizerState extends io.pulumi.resources.ResourceArgs {

    public static final AuthorizerState Empty = new AuthorizerState();

    /**
     * The ARN of the authorizer.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * The ARN of the authorizer's Lambda function.
     * 
     */
    @Import(name="authorizerFunctionArn")
      private final @Nullable Output<String> authorizerFunctionArn;

    public Output<String> getAuthorizerFunctionArn() {
        return this.authorizerFunctionArn == null ? Output.empty() : this.authorizerFunctionArn;
    }

    /**
     * The name of the authorizer.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Specifies whether AWS IoT validates the token signature in an authorization request. Default: `false`.
     * 
     */
    @Import(name="signingDisabled")
      private final @Nullable Output<Boolean> signingDisabled;

    public Output<Boolean> getSigningDisabled() {
        return this.signingDisabled == null ? Output.empty() : this.signingDisabled;
    }

    /**
     * The status of Authorizer request at creation. Valid values: `ACTIVE`, `INACTIVE`. Default: `ACTIVE`.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> getStatus() {
        return this.status == null ? Output.empty() : this.status;
    }

    /**
     * The name of the token key used to extract the token from the HTTP headers. This value is required if signing is enabled in your authorizer.
     * 
     */
    @Import(name="tokenKeyName")
      private final @Nullable Output<String> tokenKeyName;

    public Output<String> getTokenKeyName() {
        return this.tokenKeyName == null ? Output.empty() : this.tokenKeyName;
    }

    /**
     * The public keys used to verify the digital signature returned by your custom authentication service. This value is required if signing is enabled in your authorizer.
     * 
     */
    @Import(name="tokenSigningPublicKeys")
      private final @Nullable Output<Map<String,String>> tokenSigningPublicKeys;

    public Output<Map<String,String>> getTokenSigningPublicKeys() {
        return this.tokenSigningPublicKeys == null ? Output.empty() : this.tokenSigningPublicKeys;
    }

    public AuthorizerState(
        @Nullable Output<String> arn,
        @Nullable Output<String> authorizerFunctionArn,
        @Nullable Output<String> name,
        @Nullable Output<Boolean> signingDisabled,
        @Nullable Output<String> status,
        @Nullable Output<String> tokenKeyName,
        @Nullable Output<Map<String,String>> tokenSigningPublicKeys) {
        this.arn = arn;
        this.authorizerFunctionArn = authorizerFunctionArn;
        this.name = name;
        this.signingDisabled = signingDisabled;
        this.status = status;
        this.tokenKeyName = tokenKeyName;
        this.tokenSigningPublicKeys = tokenSigningPublicKeys;
    }

    private AuthorizerState() {
        this.arn = Output.empty();
        this.authorizerFunctionArn = Output.empty();
        this.name = Output.empty();
        this.signingDisabled = Output.empty();
        this.status = Output.empty();
        this.tokenKeyName = Output.empty();
        this.tokenSigningPublicKeys = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorizerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> authorizerFunctionArn;
        private @Nullable Output<String> name;
        private @Nullable Output<Boolean> signingDisabled;
        private @Nullable Output<String> status;
        private @Nullable Output<String> tokenKeyName;
        private @Nullable Output<Map<String,String>> tokenSigningPublicKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorizerState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.authorizerFunctionArn = defaults.authorizerFunctionArn;
    	      this.name = defaults.name;
    	      this.signingDisabled = defaults.signingDisabled;
    	      this.status = defaults.status;
    	      this.tokenKeyName = defaults.tokenKeyName;
    	      this.tokenSigningPublicKeys = defaults.tokenSigningPublicKeys;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }

        public Builder authorizerFunctionArn(@Nullable Output<String> authorizerFunctionArn) {
            this.authorizerFunctionArn = authorizerFunctionArn;
            return this;
        }

        public Builder authorizerFunctionArn(@Nullable String authorizerFunctionArn) {
            this.authorizerFunctionArn = Output.ofNullable(authorizerFunctionArn);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder signingDisabled(@Nullable Output<Boolean> signingDisabled) {
            this.signingDisabled = signingDisabled;
            return this;
        }

        public Builder signingDisabled(@Nullable Boolean signingDisabled) {
            this.signingDisabled = Output.ofNullable(signingDisabled);
            return this;
        }

        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }

        public Builder status(@Nullable String status) {
            this.status = Output.ofNullable(status);
            return this;
        }

        public Builder tokenKeyName(@Nullable Output<String> tokenKeyName) {
            this.tokenKeyName = tokenKeyName;
            return this;
        }

        public Builder tokenKeyName(@Nullable String tokenKeyName) {
            this.tokenKeyName = Output.ofNullable(tokenKeyName);
            return this;
        }

        public Builder tokenSigningPublicKeys(@Nullable Output<Map<String,String>> tokenSigningPublicKeys) {
            this.tokenSigningPublicKeys = tokenSigningPublicKeys;
            return this;
        }

        public Builder tokenSigningPublicKeys(@Nullable Map<String,String> tokenSigningPublicKeys) {
            this.tokenSigningPublicKeys = Output.ofNullable(tokenSigningPublicKeys);
            return this;
        }
        public AuthorizerState build() {
            return new AuthorizerState(arn, authorizerFunctionArn, name, signingDisabled, status, tokenKeyName, tokenSigningPublicKeys);
        }
    }
}
