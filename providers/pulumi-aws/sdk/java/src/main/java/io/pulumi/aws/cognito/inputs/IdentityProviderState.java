// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IdentityProviderState extends io.pulumi.resources.ResourceArgs {

    public static final IdentityProviderState Empty = new IdentityProviderState();

    /**
     * The map of attribute mapping of user pool attributes. [AttributeMapping in AWS API documentation](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_CreateIdentityProvider.html#CognitoUserPools-CreateIdentityProvider-request-AttributeMapping)
     * 
     */
    @InputImport(name="attributeMapping")
    private final @Nullable Input<Map<String,String>> attributeMapping;

    public Input<Map<String,String>> getAttributeMapping() {
        return this.attributeMapping == null ? Input.empty() : this.attributeMapping;
    }

    /**
     * The list of identity providers.
     * 
     */
    @InputImport(name="idpIdentifiers")
    private final @Nullable Input<List<String>> idpIdentifiers;

    public Input<List<String>> getIdpIdentifiers() {
        return this.idpIdentifiers == null ? Input.empty() : this.idpIdentifiers;
    }

    /**
     * The map of identity details, such as access token
     * 
     */
    @InputImport(name="providerDetails")
    private final @Nullable Input<Map<String,String>> providerDetails;

    public Input<Map<String,String>> getProviderDetails() {
        return this.providerDetails == null ? Input.empty() : this.providerDetails;
    }

    /**
     * The provider name
     * 
     */
    @InputImport(name="providerName")
    private final @Nullable Input<String> providerName;

    public Input<String> getProviderName() {
        return this.providerName == null ? Input.empty() : this.providerName;
    }

    /**
     * The provider type.  [See AWS API for valid values](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_CreateIdentityProvider.html#CognitoUserPools-CreateIdentityProvider-request-ProviderType)
     * 
     */
    @InputImport(name="providerType")
    private final @Nullable Input<String> providerType;

    public Input<String> getProviderType() {
        return this.providerType == null ? Input.empty() : this.providerType;
    }

    /**
     * The user pool id
     * 
     */
    @InputImport(name="userPoolId")
    private final @Nullable Input<String> userPoolId;

    public Input<String> getUserPoolId() {
        return this.userPoolId == null ? Input.empty() : this.userPoolId;
    }

    public IdentityProviderState(
        @Nullable Input<Map<String,String>> attributeMapping,
        @Nullable Input<List<String>> idpIdentifiers,
        @Nullable Input<Map<String,String>> providerDetails,
        @Nullable Input<String> providerName,
        @Nullable Input<String> providerType,
        @Nullable Input<String> userPoolId) {
        this.attributeMapping = attributeMapping;
        this.idpIdentifiers = idpIdentifiers;
        this.providerDetails = providerDetails;
        this.providerName = providerName;
        this.providerType = providerType;
        this.userPoolId = userPoolId;
    }

    private IdentityProviderState() {
        this.attributeMapping = Input.empty();
        this.idpIdentifiers = Input.empty();
        this.providerDetails = Input.empty();
        this.providerName = Input.empty();
        this.providerType = Input.empty();
        this.userPoolId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityProviderState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> attributeMapping;
        private @Nullable Input<List<String>> idpIdentifiers;
        private @Nullable Input<Map<String,String>> providerDetails;
        private @Nullable Input<String> providerName;
        private @Nullable Input<String> providerType;
        private @Nullable Input<String> userPoolId;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityProviderState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributeMapping = defaults.attributeMapping;
    	      this.idpIdentifiers = defaults.idpIdentifiers;
    	      this.providerDetails = defaults.providerDetails;
    	      this.providerName = defaults.providerName;
    	      this.providerType = defaults.providerType;
    	      this.userPoolId = defaults.userPoolId;
        }

        public Builder setAttributeMapping(@Nullable Input<Map<String,String>> attributeMapping) {
            this.attributeMapping = attributeMapping;
            return this;
        }

        public Builder setAttributeMapping(@Nullable Map<String,String> attributeMapping) {
            this.attributeMapping = Input.ofNullable(attributeMapping);
            return this;
        }

        public Builder setIdpIdentifiers(@Nullable Input<List<String>> idpIdentifiers) {
            this.idpIdentifiers = idpIdentifiers;
            return this;
        }

        public Builder setIdpIdentifiers(@Nullable List<String> idpIdentifiers) {
            this.idpIdentifiers = Input.ofNullable(idpIdentifiers);
            return this;
        }

        public Builder setProviderDetails(@Nullable Input<Map<String,String>> providerDetails) {
            this.providerDetails = providerDetails;
            return this;
        }

        public Builder setProviderDetails(@Nullable Map<String,String> providerDetails) {
            this.providerDetails = Input.ofNullable(providerDetails);
            return this;
        }

        public Builder setProviderName(@Nullable Input<String> providerName) {
            this.providerName = providerName;
            return this;
        }

        public Builder setProviderName(@Nullable String providerName) {
            this.providerName = Input.ofNullable(providerName);
            return this;
        }

        public Builder setProviderType(@Nullable Input<String> providerType) {
            this.providerType = providerType;
            return this;
        }

        public Builder setProviderType(@Nullable String providerType) {
            this.providerType = Input.ofNullable(providerType);
            return this;
        }

        public Builder setUserPoolId(@Nullable Input<String> userPoolId) {
            this.userPoolId = userPoolId;
            return this;
        }

        public Builder setUserPoolId(@Nullable String userPoolId) {
            this.userPoolId = Input.ofNullable(userPoolId);
            return this;
        }
        public IdentityProviderState build() {
            return new IdentityProviderState(attributeMapping, idpIdentifiers, providerDetails, providerName, providerType, userPoolId);
        }
    }
}
