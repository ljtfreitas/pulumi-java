// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OpenIdConnectProviderState extends com.pulumi.resources.ResourceArgs {

    public static final OpenIdConnectProviderState Empty = new OpenIdConnectProviderState();

    /**
     * The name of the API Management Service in which this OpenID Connect Provider should be created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="apiManagementName")
    private @Nullable Output<String> apiManagementName;

    /**
     * @return The name of the API Management Service in which this OpenID Connect Provider should be created. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> apiManagementName() {
        return Optional.ofNullable(this.apiManagementName);
    }

    /**
     * The Client ID used for the Client Application.
     * 
     */
    @Import(name="clientId")
    private @Nullable Output<String> clientId;

    /**
     * @return The Client ID used for the Client Application.
     * 
     */
    public Optional<Output<String>> clientId() {
        return Optional.ofNullable(this.clientId);
    }

    /**
     * The Client Secret used for the Client Application.
     * 
     */
    @Import(name="clientSecret")
    private @Nullable Output<String> clientSecret;

    /**
     * @return The Client Secret used for the Client Application.
     * 
     */
    public Optional<Output<String>> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }

    /**
     * A description of this OpenID Connect Provider.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description of this OpenID Connect Provider.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A user-friendly name for this OpenID Connect Provider.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return A user-friendly name for this OpenID Connect Provider.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The URI of the Metadata endpoint.
     * 
     */
    @Import(name="metadataEndpoint")
    private @Nullable Output<String> metadataEndpoint;

    /**
     * @return The URI of the Metadata endpoint.
     * 
     */
    public Optional<Output<String>> metadataEndpoint() {
        return Optional.ofNullable(this.metadataEndpoint);
    }

    /**
     * the Name of the OpenID Connect Provider which should be created within the API Management Service. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return the Name of the OpenID Connect Provider which should be created within the API Management Service. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the Resource Group where the API Management Service exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the API Management Service exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    private OpenIdConnectProviderState() {}

    private OpenIdConnectProviderState(OpenIdConnectProviderState $) {
        this.apiManagementName = $.apiManagementName;
        this.clientId = $.clientId;
        this.clientSecret = $.clientSecret;
        this.description = $.description;
        this.displayName = $.displayName;
        this.metadataEndpoint = $.metadataEndpoint;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OpenIdConnectProviderState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OpenIdConnectProviderState $;

        public Builder() {
            $ = new OpenIdConnectProviderState();
        }

        public Builder(OpenIdConnectProviderState defaults) {
            $ = new OpenIdConnectProviderState(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiManagementName The name of the API Management Service in which this OpenID Connect Provider should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder apiManagementName(@Nullable Output<String> apiManagementName) {
            $.apiManagementName = apiManagementName;
            return this;
        }

        /**
         * @param apiManagementName The name of the API Management Service in which this OpenID Connect Provider should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder apiManagementName(String apiManagementName) {
            return apiManagementName(Output.of(apiManagementName));
        }

        /**
         * @param clientId The Client ID used for the Client Application.
         * 
         * @return builder
         * 
         */
        public Builder clientId(@Nullable Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId The Client ID used for the Client Application.
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param clientSecret The Client Secret used for the Client Application.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(@Nullable Output<String> clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        /**
         * @param clientSecret The Client Secret used for the Client Application.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(String clientSecret) {
            return clientSecret(Output.of(clientSecret));
        }

        /**
         * @param description A description of this OpenID Connect Provider.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of this OpenID Connect Provider.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName A user-friendly name for this OpenID Connect Provider.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName A user-friendly name for this OpenID Connect Provider.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param metadataEndpoint The URI of the Metadata endpoint.
         * 
         * @return builder
         * 
         */
        public Builder metadataEndpoint(@Nullable Output<String> metadataEndpoint) {
            $.metadataEndpoint = metadataEndpoint;
            return this;
        }

        /**
         * @param metadataEndpoint The URI of the Metadata endpoint.
         * 
         * @return builder
         * 
         */
        public Builder metadataEndpoint(String metadataEndpoint) {
            return metadataEndpoint(Output.of(metadataEndpoint));
        }

        /**
         * @param name the Name of the OpenID Connect Provider which should be created within the API Management Service. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name the Name of the OpenID Connect Provider which should be created within the API Management Service. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the API Management Service exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the API Management Service exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public OpenIdConnectProviderState build() {
            return $;
        }
    }

}
