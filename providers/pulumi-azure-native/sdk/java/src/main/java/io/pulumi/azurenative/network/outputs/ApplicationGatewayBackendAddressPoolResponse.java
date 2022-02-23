// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.ApplicationGatewayBackendAddressResponse;
import io.pulumi.azurenative.network.outputs.NetworkInterfaceIPConfigurationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApplicationGatewayBackendAddressPoolResponse {
    /**
     * Backend addresses.
     * 
     */
    private final @Nullable List<ApplicationGatewayBackendAddressResponse> backendAddresses;
    /**
     * Collection of references to IPs defined in network interfaces.
     * 
     */
    private final List<NetworkInterfaceIPConfigurationResponse> backendIPConfigurations;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * Name of the backend address pool that is unique within an Application Gateway.
     * 
     */
    private final @Nullable String name;
    /**
     * The provisioning state of the backend address pool resource.
     * 
     */
    private final String provisioningState;
    /**
     * Type of the resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"backendAddresses","backendIPConfigurations","etag","id","name","provisioningState","type"})
    private ApplicationGatewayBackendAddressPoolResponse(
        @Nullable List<ApplicationGatewayBackendAddressResponse> backendAddresses,
        List<NetworkInterfaceIPConfigurationResponse> backendIPConfigurations,
        String etag,
        @Nullable String id,
        @Nullable String name,
        String provisioningState,
        String type) {
        this.backendAddresses = backendAddresses;
        this.backendIPConfigurations = Objects.requireNonNull(backendIPConfigurations);
        this.etag = Objects.requireNonNull(etag);
        this.id = id;
        this.name = name;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Backend addresses.
     * 
     */
    public List<ApplicationGatewayBackendAddressResponse> getBackendAddresses() {
        return this.backendAddresses == null ? List.of() : this.backendAddresses;
    }
    /**
     * Collection of references to IPs defined in network interfaces.
     * 
     */
    public List<NetworkInterfaceIPConfigurationResponse> getBackendIPConfigurations() {
        return this.backendIPConfigurations;
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Resource ID.
     * 
     */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Name of the backend address pool that is unique within an Application Gateway.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The provisioning state of the backend address pool resource.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Type of the resource.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayBackendAddressPoolResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ApplicationGatewayBackendAddressResponse> backendAddresses;
        private List<NetworkInterfaceIPConfigurationResponse> backendIPConfigurations;
        private String etag;
        private @Nullable String id;
        private @Nullable String name;
        private String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayBackendAddressPoolResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendAddresses = defaults.backendAddresses;
    	      this.backendIPConfigurations = defaults.backendIPConfigurations;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder setBackendAddresses(@Nullable List<ApplicationGatewayBackendAddressResponse> backendAddresses) {
            this.backendAddresses = backendAddresses;
            return this;
        }

        public Builder setBackendIPConfigurations(List<NetworkInterfaceIPConfigurationResponse> backendIPConfigurations) {
            this.backendIPConfigurations = Objects.requireNonNull(backendIPConfigurations);
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ApplicationGatewayBackendAddressPoolResponse build() {
            return new ApplicationGatewayBackendAddressPoolResponse(backendAddresses, backendIPConfigurations, etag, id, name, provisioningState, type);
        }
    }
}
