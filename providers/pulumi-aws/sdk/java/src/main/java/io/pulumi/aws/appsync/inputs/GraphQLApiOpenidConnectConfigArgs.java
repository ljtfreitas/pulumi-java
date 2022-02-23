// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GraphQLApiOpenidConnectConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GraphQLApiOpenidConnectConfigArgs Empty = new GraphQLApiOpenidConnectConfigArgs();

    /**
     * Number of milliseconds a token is valid after being authenticated.
     * 
     */
    @InputImport(name="authTtl")
    private final @Nullable Input<Integer> authTtl;

    public Input<Integer> getAuthTtl() {
        return this.authTtl == null ? Input.empty() : this.authTtl;
    }

    /**
     * Client identifier of the Relying party at the OpenID identity provider. This identifier is typically obtained when the Relying party is registered with the OpenID identity provider. You can specify a regular expression so the AWS AppSync can validate against multiple client identifiers at a time.
     * 
     */
    @InputImport(name="clientId")
    private final @Nullable Input<String> clientId;

    public Input<String> getClientId() {
        return this.clientId == null ? Input.empty() : this.clientId;
    }

    /**
     * Number of milliseconds a token is valid after being issued to a user.
     * 
     */
    @InputImport(name="iatTtl")
    private final @Nullable Input<Integer> iatTtl;

    public Input<Integer> getIatTtl() {
        return this.iatTtl == null ? Input.empty() : this.iatTtl;
    }

    /**
     * Issuer for the OpenID Connect configuration. The issuer returned by discovery MUST exactly match the value of iss in the ID Token.
     * 
     */
    @InputImport(name="issuer", required=true)
    private final Input<String> issuer;

    public Input<String> getIssuer() {
        return this.issuer;
    }

    public GraphQLApiOpenidConnectConfigArgs(
        @Nullable Input<Integer> authTtl,
        @Nullable Input<String> clientId,
        @Nullable Input<Integer> iatTtl,
        Input<String> issuer) {
        this.authTtl = authTtl;
        this.clientId = clientId;
        this.iatTtl = iatTtl;
        this.issuer = Objects.requireNonNull(issuer, "expected parameter 'issuer' to be non-null");
    }

    private GraphQLApiOpenidConnectConfigArgs() {
        this.authTtl = Input.empty();
        this.clientId = Input.empty();
        this.iatTtl = Input.empty();
        this.issuer = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GraphQLApiOpenidConnectConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> authTtl;
        private @Nullable Input<String> clientId;
        private @Nullable Input<Integer> iatTtl;
        private Input<String> issuer;

        public Builder() {
    	      // Empty
        }

        public Builder(GraphQLApiOpenidConnectConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authTtl = defaults.authTtl;
    	      this.clientId = defaults.clientId;
    	      this.iatTtl = defaults.iatTtl;
    	      this.issuer = defaults.issuer;
        }

        public Builder setAuthTtl(@Nullable Input<Integer> authTtl) {
            this.authTtl = authTtl;
            return this;
        }

        public Builder setAuthTtl(@Nullable Integer authTtl) {
            this.authTtl = Input.ofNullable(authTtl);
            return this;
        }

        public Builder setClientId(@Nullable Input<String> clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder setClientId(@Nullable String clientId) {
            this.clientId = Input.ofNullable(clientId);
            return this;
        }

        public Builder setIatTtl(@Nullable Input<Integer> iatTtl) {
            this.iatTtl = iatTtl;
            return this;
        }

        public Builder setIatTtl(@Nullable Integer iatTtl) {
            this.iatTtl = Input.ofNullable(iatTtl);
            return this;
        }

        public Builder setIssuer(Input<String> issuer) {
            this.issuer = Objects.requireNonNull(issuer);
            return this;
        }

        public Builder setIssuer(String issuer) {
            this.issuer = Input.of(Objects.requireNonNull(issuer));
            return this;
        }
        public GraphQLApiOpenidConnectConfigArgs build() {
            return new GraphQLApiOpenidConnectConfigArgs(authTtl, clientId, iatTtl, issuer);
        }
    }
}
