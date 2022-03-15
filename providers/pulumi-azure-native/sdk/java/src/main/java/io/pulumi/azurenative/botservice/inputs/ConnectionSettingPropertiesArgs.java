// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.inputs;

import io.pulumi.azurenative.botservice.inputs.ConnectionSettingParameterArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties for a Connection Setting Item
 * 
 */
public final class ConnectionSettingPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionSettingPropertiesArgs Empty = new ConnectionSettingPropertiesArgs();

    /**
     * Client Id associated with the Connection Setting.
     * 
     */
    @Import(name="clientId")
      private final @Nullable Output<String> clientId;

    public Output<String> getClientId() {
        return this.clientId == null ? Output.empty() : this.clientId;
    }

    /**
     * Client Secret associated with the Connection Setting
     * 
     */
    @Import(name="clientSecret")
      private final @Nullable Output<String> clientSecret;

    public Output<String> getClientSecret() {
        return this.clientSecret == null ? Output.empty() : this.clientSecret;
    }

    /**
     * Id associated with the Connection Setting.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Output.empty() : this.id;
    }

    /**
     * Name associated with the Connection Setting.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Service Provider Parameters associated with the Connection Setting
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<List<ConnectionSettingParameterArgs>> parameters;

    public Output<List<ConnectionSettingParameterArgs>> getParameters() {
        return this.parameters == null ? Output.empty() : this.parameters;
    }

    /**
     * Provisioning state of the resource
     * 
     */
    @Import(name="provisioningState")
      private final @Nullable Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState == null ? Output.empty() : this.provisioningState;
    }

    /**
     * Scopes associated with the Connection Setting
     * 
     */
    @Import(name="scopes")
      private final @Nullable Output<String> scopes;

    public Output<String> getScopes() {
        return this.scopes == null ? Output.empty() : this.scopes;
    }

    /**
     * Service Provider Display Name associated with the Connection Setting
     * 
     */
    @Import(name="serviceProviderDisplayName")
      private final @Nullable Output<String> serviceProviderDisplayName;

    public Output<String> getServiceProviderDisplayName() {
        return this.serviceProviderDisplayName == null ? Output.empty() : this.serviceProviderDisplayName;
    }

    /**
     * Service Provider Id associated with the Connection Setting
     * 
     */
    @Import(name="serviceProviderId")
      private final @Nullable Output<String> serviceProviderId;

    public Output<String> getServiceProviderId() {
        return this.serviceProviderId == null ? Output.empty() : this.serviceProviderId;
    }

    public ConnectionSettingPropertiesArgs(
        @Nullable Output<String> clientId,
        @Nullable Output<String> clientSecret,
        @Nullable Output<String> id,
        @Nullable Output<String> name,
        @Nullable Output<List<ConnectionSettingParameterArgs>> parameters,
        @Nullable Output<String> provisioningState,
        @Nullable Output<String> scopes,
        @Nullable Output<String> serviceProviderDisplayName,
        @Nullable Output<String> serviceProviderId) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.id = id;
        this.name = name;
        this.parameters = parameters;
        this.provisioningState = provisioningState;
        this.scopes = scopes;
        this.serviceProviderDisplayName = serviceProviderDisplayName;
        this.serviceProviderId = serviceProviderId;
    }

    private ConnectionSettingPropertiesArgs() {
        this.clientId = Output.empty();
        this.clientSecret = Output.empty();
        this.id = Output.empty();
        this.name = Output.empty();
        this.parameters = Output.empty();
        this.provisioningState = Output.empty();
        this.scopes = Output.empty();
        this.serviceProviderDisplayName = Output.empty();
        this.serviceProviderId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionSettingPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> clientId;
        private @Nullable Output<String> clientSecret;
        private @Nullable Output<String> id;
        private @Nullable Output<String> name;
        private @Nullable Output<List<ConnectionSettingParameterArgs>> parameters;
        private @Nullable Output<String> provisioningState;
        private @Nullable Output<String> scopes;
        private @Nullable Output<String> serviceProviderDisplayName;
        private @Nullable Output<String> serviceProviderId;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionSettingPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.provisioningState = defaults.provisioningState;
    	      this.scopes = defaults.scopes;
    	      this.serviceProviderDisplayName = defaults.serviceProviderDisplayName;
    	      this.serviceProviderId = defaults.serviceProviderId;
        }

        public Builder clientId(@Nullable Output<String> clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder clientId(@Nullable String clientId) {
            this.clientId = Output.ofNullable(clientId);
            return this;
        }

        public Builder clientSecret(@Nullable Output<String> clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }

        public Builder clientSecret(@Nullable String clientSecret) {
            this.clientSecret = Output.ofNullable(clientSecret);
            return this;
        }

        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = Output.ofNullable(id);
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

        public Builder parameters(@Nullable Output<List<ConnectionSettingParameterArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder parameters(@Nullable List<ConnectionSettingParameterArgs> parameters) {
            this.parameters = Output.ofNullable(parameters);
            return this;
        }

        public Builder provisioningState(@Nullable Output<String> provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder provisioningState(@Nullable String provisioningState) {
            this.provisioningState = Output.ofNullable(provisioningState);
            return this;
        }

        public Builder scopes(@Nullable Output<String> scopes) {
            this.scopes = scopes;
            return this;
        }

        public Builder scopes(@Nullable String scopes) {
            this.scopes = Output.ofNullable(scopes);
            return this;
        }

        public Builder serviceProviderDisplayName(@Nullable Output<String> serviceProviderDisplayName) {
            this.serviceProviderDisplayName = serviceProviderDisplayName;
            return this;
        }

        public Builder serviceProviderDisplayName(@Nullable String serviceProviderDisplayName) {
            this.serviceProviderDisplayName = Output.ofNullable(serviceProviderDisplayName);
            return this;
        }

        public Builder serviceProviderId(@Nullable Output<String> serviceProviderId) {
            this.serviceProviderId = serviceProviderId;
            return this;
        }

        public Builder serviceProviderId(@Nullable String serviceProviderId) {
            this.serviceProviderId = Output.ofNullable(serviceProviderId);
            return this;
        }
        public ConnectionSettingPropertiesArgs build() {
            return new ConnectionSettingPropertiesArgs(clientId, clientSecret, id, name, parameters, provisioningState, scopes, serviceProviderDisplayName, serviceProviderId);
        }
    }
}
