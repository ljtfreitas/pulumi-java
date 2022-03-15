// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.finspace.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EnvironmentFederationParameters {
    /**
     * SAML metadata URL to link with the Environment
     * 
     */
    private final @Nullable String applicationCallBackURL;
    /**
     * Attribute map for SAML configuration
     * 
     */
    private final @Nullable Object attributeMap;
    /**
     * Federation provider name to link with the Environment
     * 
     */
    private final @Nullable String federationProviderName;
    /**
     * SAML metadata URL to link with the Environment
     * 
     */
    private final @Nullable String federationURN;
    /**
     * SAML metadata document to link the federation provider to the Environment
     * 
     */
    private final @Nullable String samlMetadataDocument;
    /**
     * SAML metadata URL to link with the Environment
     * 
     */
    private final @Nullable String samlMetadataURL;

    @CustomType.Constructor
    private EnvironmentFederationParameters(
        @CustomType.Parameter("applicationCallBackURL") @Nullable String applicationCallBackURL,
        @CustomType.Parameter("attributeMap") @Nullable Object attributeMap,
        @CustomType.Parameter("federationProviderName") @Nullable String federationProviderName,
        @CustomType.Parameter("federationURN") @Nullable String federationURN,
        @CustomType.Parameter("samlMetadataDocument") @Nullable String samlMetadataDocument,
        @CustomType.Parameter("samlMetadataURL") @Nullable String samlMetadataURL) {
        this.applicationCallBackURL = applicationCallBackURL;
        this.attributeMap = attributeMap;
        this.federationProviderName = federationProviderName;
        this.federationURN = federationURN;
        this.samlMetadataDocument = samlMetadataDocument;
        this.samlMetadataURL = samlMetadataURL;
    }

    /**
     * SAML metadata URL to link with the Environment
     * 
    */
    public Optional<String> getApplicationCallBackURL() {
        return Optional.ofNullable(this.applicationCallBackURL);
    }
    /**
     * Attribute map for SAML configuration
     * 
    */
    public Optional<Object> getAttributeMap() {
        return Optional.ofNullable(this.attributeMap);
    }
    /**
     * Federation provider name to link with the Environment
     * 
    */
    public Optional<String> getFederationProviderName() {
        return Optional.ofNullable(this.federationProviderName);
    }
    /**
     * SAML metadata URL to link with the Environment
     * 
    */
    public Optional<String> getFederationURN() {
        return Optional.ofNullable(this.federationURN);
    }
    /**
     * SAML metadata document to link the federation provider to the Environment
     * 
    */
    public Optional<String> getSamlMetadataDocument() {
        return Optional.ofNullable(this.samlMetadataDocument);
    }
    /**
     * SAML metadata URL to link with the Environment
     * 
    */
    public Optional<String> getSamlMetadataURL() {
        return Optional.ofNullable(this.samlMetadataURL);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentFederationParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String applicationCallBackURL;
        private @Nullable Object attributeMap;
        private @Nullable String federationProviderName;
        private @Nullable String federationURN;
        private @Nullable String samlMetadataDocument;
        private @Nullable String samlMetadataURL;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentFederationParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationCallBackURL = defaults.applicationCallBackURL;
    	      this.attributeMap = defaults.attributeMap;
    	      this.federationProviderName = defaults.federationProviderName;
    	      this.federationURN = defaults.federationURN;
    	      this.samlMetadataDocument = defaults.samlMetadataDocument;
    	      this.samlMetadataURL = defaults.samlMetadataURL;
        }

        public Builder applicationCallBackURL(@Nullable String applicationCallBackURL) {
            this.applicationCallBackURL = applicationCallBackURL;
            return this;
        }

        public Builder attributeMap(@Nullable Object attributeMap) {
            this.attributeMap = attributeMap;
            return this;
        }

        public Builder federationProviderName(@Nullable String federationProviderName) {
            this.federationProviderName = federationProviderName;
            return this;
        }

        public Builder federationURN(@Nullable String federationURN) {
            this.federationURN = federationURN;
            return this;
        }

        public Builder samlMetadataDocument(@Nullable String samlMetadataDocument) {
            this.samlMetadataDocument = samlMetadataDocument;
            return this;
        }

        public Builder samlMetadataURL(@Nullable String samlMetadataURL) {
            this.samlMetadataURL = samlMetadataURL;
            return this;
        }
        public EnvironmentFederationParameters build() {
            return new EnvironmentFederationParameters(applicationCallBackURL, attributeMap, federationProviderName, federationURN, samlMetadataDocument, samlMetadataURL);
        }
    }
}
