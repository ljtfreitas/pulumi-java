// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.ContainerNetworkInterfaceConfigurationResponse;
import io.pulumi.azurenative.network.outputs.ContainerNetworkInterfaceIpConfigurationResponse;
import io.pulumi.azurenative.network.outputs.ContainerResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContainerNetworkInterfaceResponse {
    /**
     * Reference to the container to which this container network interface is attached.
     * 
     */
    private final @Nullable ContainerResponse container;
    /**
     * Container network interface configuration from which this container network interface is created.
     * 
     */
    private final ContainerNetworkInterfaceConfigurationResponse containerNetworkInterfaceConfiguration;
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
     * Reference to the ip configuration on this container nic.
     * 
     */
    private final List<ContainerNetworkInterfaceIpConfigurationResponse> ipConfigurations;
    /**
     * The name of the resource. This name can be used to access the resource.
     * 
     */
    private final @Nullable String name;
    /**
     * The provisioning state of the container network interface resource.
     * 
     */
    private final String provisioningState;
    /**
     * Sub Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private ContainerNetworkInterfaceResponse(
        @CustomType.Parameter("container") @Nullable ContainerResponse container,
        @CustomType.Parameter("containerNetworkInterfaceConfiguration") ContainerNetworkInterfaceConfigurationResponse containerNetworkInterfaceConfiguration,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("ipConfigurations") List<ContainerNetworkInterfaceIpConfigurationResponse> ipConfigurations,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("type") String type) {
        this.container = container;
        this.containerNetworkInterfaceConfiguration = containerNetworkInterfaceConfiguration;
        this.etag = etag;
        this.id = id;
        this.ipConfigurations = ipConfigurations;
        this.name = name;
        this.provisioningState = provisioningState;
        this.type = type;
    }

    /**
     * Reference to the container to which this container network interface is attached.
     * 
    */
    public Optional<ContainerResponse> getContainer() {
        return Optional.ofNullable(this.container);
    }
    /**
     * Container network interface configuration from which this container network interface is created.
     * 
    */
    public ContainerNetworkInterfaceConfigurationResponse getContainerNetworkInterfaceConfiguration() {
        return this.containerNetworkInterfaceConfiguration;
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
     * Reference to the ip configuration on this container nic.
     * 
    */
    public List<ContainerNetworkInterfaceIpConfigurationResponse> getIpConfigurations() {
        return this.ipConfigurations;
    }
    /**
     * The name of the resource. This name can be used to access the resource.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The provisioning state of the container network interface resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Sub Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerNetworkInterfaceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ContainerResponse container;
        private ContainerNetworkInterfaceConfigurationResponse containerNetworkInterfaceConfiguration;
        private String etag;
        private @Nullable String id;
        private List<ContainerNetworkInterfaceIpConfigurationResponse> ipConfigurations;
        private @Nullable String name;
        private String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerNetworkInterfaceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.container = defaults.container;
    	      this.containerNetworkInterfaceConfiguration = defaults.containerNetworkInterfaceConfiguration;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.ipConfigurations = defaults.ipConfigurations;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder container(@Nullable ContainerResponse container) {
            this.container = container;
            return this;
        }

        public Builder containerNetworkInterfaceConfiguration(ContainerNetworkInterfaceConfigurationResponse containerNetworkInterfaceConfiguration) {
            this.containerNetworkInterfaceConfiguration = Objects.requireNonNull(containerNetworkInterfaceConfiguration);
            return this;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder ipConfigurations(List<ContainerNetworkInterfaceIpConfigurationResponse> ipConfigurations) {
            this.ipConfigurations = Objects.requireNonNull(ipConfigurations);
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ContainerNetworkInterfaceResponse build() {
            return new ContainerNetworkInterfaceResponse(container, containerNetworkInterfaceConfiguration, etag, id, ipConfigurations, name, provisioningState, type);
        }
    }
}
