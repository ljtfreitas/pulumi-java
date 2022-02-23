// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito;

import io.pulumi.aws.cognito.inputs.IdentityPoolCognitoIdentityProviderArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IdentityPoolArgs extends io.pulumi.resources.ResourceArgs {

    public static final IdentityPoolArgs Empty = new IdentityPoolArgs();

    /**
     * Enables or disables the classic / basic authentication flow. Default is `false`.
     * 
     */
    @InputImport(name="allowClassicFlow")
    private final @Nullable Input<Boolean> allowClassicFlow;

    public Input<Boolean> getAllowClassicFlow() {
        return this.allowClassicFlow == null ? Input.empty() : this.allowClassicFlow;
    }

    /**
     * Whether the identity pool supports unauthenticated logins or not.
     * 
     */
    @InputImport(name="allowUnauthenticatedIdentities")
    private final @Nullable Input<Boolean> allowUnauthenticatedIdentities;

    public Input<Boolean> getAllowUnauthenticatedIdentities() {
        return this.allowUnauthenticatedIdentities == null ? Input.empty() : this.allowUnauthenticatedIdentities;
    }

    /**
     * An array of Amazon Cognito Identity user pools and their client IDs.
     * 
     */
    @InputImport(name="cognitoIdentityProviders")
    private final @Nullable Input<List<IdentityPoolCognitoIdentityProviderArgs>> cognitoIdentityProviders;

    public Input<List<IdentityPoolCognitoIdentityProviderArgs>> getCognitoIdentityProviders() {
        return this.cognitoIdentityProviders == null ? Input.empty() : this.cognitoIdentityProviders;
    }

    /**
     * The "domain" by which Cognito will refer to your users. This name acts as a placeholder that allows your
     * backend and the Cognito service to communicate about the developer provider.
     * 
     */
    @InputImport(name="developerProviderName")
    private final @Nullable Input<String> developerProviderName;

    public Input<String> getDeveloperProviderName() {
        return this.developerProviderName == null ? Input.empty() : this.developerProviderName;
    }

    /**
     * The Cognito Identity Pool name.
     * 
     */
    @InputImport(name="identityPoolName", required=true)
    private final Input<String> identityPoolName;

    public Input<String> getIdentityPoolName() {
        return this.identityPoolName;
    }

    /**
     * Set of OpendID Connect provider ARNs.
     * 
     */
    @InputImport(name="openidConnectProviderArns")
    private final @Nullable Input<List<String>> openidConnectProviderArns;

    public Input<List<String>> getOpenidConnectProviderArns() {
        return this.openidConnectProviderArns == null ? Input.empty() : this.openidConnectProviderArns;
    }

    /**
     * An array of Amazon Resource Names (ARNs) of the SAML provider for your identity.
     * 
     */
    @InputImport(name="samlProviderArns")
    private final @Nullable Input<List<String>> samlProviderArns;

    public Input<List<String>> getSamlProviderArns() {
        return this.samlProviderArns == null ? Input.empty() : this.samlProviderArns;
    }

    /**
     * Key-Value pairs mapping provider names to provider app IDs.
     * 
     */
    @InputImport(name="supportedLoginProviders")
    private final @Nullable Input<Map<String,String>> supportedLoginProviders;

    public Input<Map<String,String>> getSupportedLoginProviders() {
        return this.supportedLoginProviders == null ? Input.empty() : this.supportedLoginProviders;
    }

    /**
     * A map of tags to assign to the Identity Pool. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public IdentityPoolArgs(
        @Nullable Input<Boolean> allowClassicFlow,
        @Nullable Input<Boolean> allowUnauthenticatedIdentities,
        @Nullable Input<List<IdentityPoolCognitoIdentityProviderArgs>> cognitoIdentityProviders,
        @Nullable Input<String> developerProviderName,
        Input<String> identityPoolName,
        @Nullable Input<List<String>> openidConnectProviderArns,
        @Nullable Input<List<String>> samlProviderArns,
        @Nullable Input<Map<String,String>> supportedLoginProviders,
        @Nullable Input<Map<String,String>> tags) {
        this.allowClassicFlow = allowClassicFlow;
        this.allowUnauthenticatedIdentities = allowUnauthenticatedIdentities;
        this.cognitoIdentityProviders = cognitoIdentityProviders;
        this.developerProviderName = developerProviderName;
        this.identityPoolName = Objects.requireNonNull(identityPoolName, "expected parameter 'identityPoolName' to be non-null");
        this.openidConnectProviderArns = openidConnectProviderArns;
        this.samlProviderArns = samlProviderArns;
        this.supportedLoginProviders = supportedLoginProviders;
        this.tags = tags;
    }

    private IdentityPoolArgs() {
        this.allowClassicFlow = Input.empty();
        this.allowUnauthenticatedIdentities = Input.empty();
        this.cognitoIdentityProviders = Input.empty();
        this.developerProviderName = Input.empty();
        this.identityPoolName = Input.empty();
        this.openidConnectProviderArns = Input.empty();
        this.samlProviderArns = Input.empty();
        this.supportedLoginProviders = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> allowClassicFlow;
        private @Nullable Input<Boolean> allowUnauthenticatedIdentities;
        private @Nullable Input<List<IdentityPoolCognitoIdentityProviderArgs>> cognitoIdentityProviders;
        private @Nullable Input<String> developerProviderName;
        private Input<String> identityPoolName;
        private @Nullable Input<List<String>> openidConnectProviderArns;
        private @Nullable Input<List<String>> samlProviderArns;
        private @Nullable Input<Map<String,String>> supportedLoginProviders;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityPoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowClassicFlow = defaults.allowClassicFlow;
    	      this.allowUnauthenticatedIdentities = defaults.allowUnauthenticatedIdentities;
    	      this.cognitoIdentityProviders = defaults.cognitoIdentityProviders;
    	      this.developerProviderName = defaults.developerProviderName;
    	      this.identityPoolName = defaults.identityPoolName;
    	      this.openidConnectProviderArns = defaults.openidConnectProviderArns;
    	      this.samlProviderArns = defaults.samlProviderArns;
    	      this.supportedLoginProviders = defaults.supportedLoginProviders;
    	      this.tags = defaults.tags;
        }

        public Builder setAllowClassicFlow(@Nullable Input<Boolean> allowClassicFlow) {
            this.allowClassicFlow = allowClassicFlow;
            return this;
        }

        public Builder setAllowClassicFlow(@Nullable Boolean allowClassicFlow) {
            this.allowClassicFlow = Input.ofNullable(allowClassicFlow);
            return this;
        }

        public Builder setAllowUnauthenticatedIdentities(@Nullable Input<Boolean> allowUnauthenticatedIdentities) {
            this.allowUnauthenticatedIdentities = allowUnauthenticatedIdentities;
            return this;
        }

        public Builder setAllowUnauthenticatedIdentities(@Nullable Boolean allowUnauthenticatedIdentities) {
            this.allowUnauthenticatedIdentities = Input.ofNullable(allowUnauthenticatedIdentities);
            return this;
        }

        public Builder setCognitoIdentityProviders(@Nullable Input<List<IdentityPoolCognitoIdentityProviderArgs>> cognitoIdentityProviders) {
            this.cognitoIdentityProviders = cognitoIdentityProviders;
            return this;
        }

        public Builder setCognitoIdentityProviders(@Nullable List<IdentityPoolCognitoIdentityProviderArgs> cognitoIdentityProviders) {
            this.cognitoIdentityProviders = Input.ofNullable(cognitoIdentityProviders);
            return this;
        }

        public Builder setDeveloperProviderName(@Nullable Input<String> developerProviderName) {
            this.developerProviderName = developerProviderName;
            return this;
        }

        public Builder setDeveloperProviderName(@Nullable String developerProviderName) {
            this.developerProviderName = Input.ofNullable(developerProviderName);
            return this;
        }

        public Builder setIdentityPoolName(Input<String> identityPoolName) {
            this.identityPoolName = Objects.requireNonNull(identityPoolName);
            return this;
        }

        public Builder setIdentityPoolName(String identityPoolName) {
            this.identityPoolName = Input.of(Objects.requireNonNull(identityPoolName));
            return this;
        }

        public Builder setOpenidConnectProviderArns(@Nullable Input<List<String>> openidConnectProviderArns) {
            this.openidConnectProviderArns = openidConnectProviderArns;
            return this;
        }

        public Builder setOpenidConnectProviderArns(@Nullable List<String> openidConnectProviderArns) {
            this.openidConnectProviderArns = Input.ofNullable(openidConnectProviderArns);
            return this;
        }

        public Builder setSamlProviderArns(@Nullable Input<List<String>> samlProviderArns) {
            this.samlProviderArns = samlProviderArns;
            return this;
        }

        public Builder setSamlProviderArns(@Nullable List<String> samlProviderArns) {
            this.samlProviderArns = Input.ofNullable(samlProviderArns);
            return this;
        }

        public Builder setSupportedLoginProviders(@Nullable Input<Map<String,String>> supportedLoginProviders) {
            this.supportedLoginProviders = supportedLoginProviders;
            return this;
        }

        public Builder setSupportedLoginProviders(@Nullable Map<String,String> supportedLoginProviders) {
            this.supportedLoginProviders = Input.ofNullable(supportedLoginProviders);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public IdentityPoolArgs build() {
            return new IdentityPoolArgs(allowClassicFlow, allowUnauthenticatedIdentities, cognitoIdentityProviders, developerProviderName, identityPoolName, openidConnectProviderArns, samlProviderArns, supportedLoginProviders, tags);
        }
    }
}
