// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IdentityPoolCognitoIdentityProviderGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final IdentityPoolCognitoIdentityProviderGetArgs Empty = new IdentityPoolCognitoIdentityProviderGetArgs();

    /**
     * The client ID for the Amazon Cognito Identity User Pool.
     * 
     */
    @Import(name="clientId")
      private final @Nullable Output<String> clientId;

    public Output<String> getClientId() {
        return this.clientId == null ? Output.empty() : this.clientId;
    }

    /**
     * The provider name for an Amazon Cognito Identity User Pool.
     * 
     */
    @Import(name="providerName")
      private final @Nullable Output<String> providerName;

    public Output<String> getProviderName() {
        return this.providerName == null ? Output.empty() : this.providerName;
    }

    /**
     * Whether server-side token validation is enabled for the identity provider’s token or not.
     * 
     */
    @Import(name="serverSideTokenCheck")
      private final @Nullable Output<Boolean> serverSideTokenCheck;

    public Output<Boolean> getServerSideTokenCheck() {
        return this.serverSideTokenCheck == null ? Output.empty() : this.serverSideTokenCheck;
    }

    public IdentityPoolCognitoIdentityProviderGetArgs(
        @Nullable Output<String> clientId,
        @Nullable Output<String> providerName,
        @Nullable Output<Boolean> serverSideTokenCheck) {
        this.clientId = clientId;
        this.providerName = providerName;
        this.serverSideTokenCheck = serverSideTokenCheck;
    }

    private IdentityPoolCognitoIdentityProviderGetArgs() {
        this.clientId = Output.empty();
        this.providerName = Output.empty();
        this.serverSideTokenCheck = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityPoolCognitoIdentityProviderGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> clientId;
        private @Nullable Output<String> providerName;
        private @Nullable Output<Boolean> serverSideTokenCheck;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityPoolCognitoIdentityProviderGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.providerName = defaults.providerName;
    	      this.serverSideTokenCheck = defaults.serverSideTokenCheck;
        }

        public Builder clientId(@Nullable Output<String> clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder clientId(@Nullable String clientId) {
            this.clientId = Output.ofNullable(clientId);
            return this;
        }

        public Builder providerName(@Nullable Output<String> providerName) {
            this.providerName = providerName;
            return this;
        }

        public Builder providerName(@Nullable String providerName) {
            this.providerName = Output.ofNullable(providerName);
            return this;
        }

        public Builder serverSideTokenCheck(@Nullable Output<Boolean> serverSideTokenCheck) {
            this.serverSideTokenCheck = serverSideTokenCheck;
            return this;
        }

        public Builder serverSideTokenCheck(@Nullable Boolean serverSideTokenCheck) {
            this.serverSideTokenCheck = Output.ofNullable(serverSideTokenCheck);
            return this;
        }
        public IdentityPoolCognitoIdentityProviderGetArgs build() {
            return new IdentityPoolCognitoIdentityProviderGetArgs(clientId, providerName, serverSideTokenCheck);
        }
    }
}
