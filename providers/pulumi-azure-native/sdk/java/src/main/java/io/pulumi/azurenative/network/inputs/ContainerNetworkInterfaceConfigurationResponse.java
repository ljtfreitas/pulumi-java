// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.IPConfigurationProfileResponse;
import io.pulumi.azurenative.network.inputs.SubResourceResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Container network interface configuration child resource.
 * 
 */
public final class ContainerNetworkInterfaceConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final ContainerNetworkInterfaceConfigurationResponse Empty = new ContainerNetworkInterfaceConfigurationResponse();

    /**
     * A list of container network interfaces created from this container network interface configuration.
     * 
     */
    @InputImport(name="containerNetworkInterfaces")
        private final @Nullable List<SubResourceResponse> containerNetworkInterfaces;

    public List<SubResourceResponse> getContainerNetworkInterfaces() {
        return this.containerNetworkInterfaces == null ? List.of() : this.containerNetworkInterfaces;
    }

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @InputImport(name="etag", required=true)
        private final String etag;

    public String getEtag() {
        return this.etag;
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
        private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * A list of ip configurations of the container network interface configuration.
     * 
     */
    @InputImport(name="ipConfigurations")
        private final @Nullable List<IPConfigurationProfileResponse> ipConfigurations;

    public List<IPConfigurationProfileResponse> getIpConfigurations() {
        return this.ipConfigurations == null ? List.of() : this.ipConfigurations;
    }

    /**
     * The name of the resource. This name can be used to access the resource.
     * 
     */
    @InputImport(name="name")
        private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The provisioning state of the container network interface configuration resource.
     * 
     */
    @InputImport(name="provisioningState", required=true)
        private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Sub Resource type.
     * 
     */
    @InputImport(name="type", required=true)
        private final String type;

    public String getType() {
        return this.type;
    }

    public ContainerNetworkInterfaceConfigurationResponse(
        @Nullable List<SubResourceResponse> containerNetworkInterfaces,
        String etag,
        @Nullable String id,
        @Nullable List<IPConfigurationProfileResponse> ipConfigurations,
        @Nullable String name,
        String provisioningState,
        String type) {
        this.containerNetworkInterfaces = containerNetworkInterfaces;
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.id = id;
        this.ipConfigurations = ipConfigurations;
        this.name = name;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ContainerNetworkInterfaceConfigurationResponse() {
        this.containerNetworkInterfaces = List.of();
        this.etag = null;
        this.id = null;
        this.ipConfigurations = List.of();
        this.name = null;
        this.provisioningState = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerNetworkInterfaceConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<SubResourceResponse> containerNetworkInterfaces;
        private String etag;
        private @Nullable String id;
        private @Nullable List<IPConfigurationProfileResponse> ipConfigurations;
        private @Nullable String name;
        private String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerNetworkInterfaceConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerNetworkInterfaces = defaults.containerNetworkInterfaces;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.ipConfigurations = defaults.ipConfigurations;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder setContainerNetworkInterfaces(@Nullable List<SubResourceResponse> containerNetworkInterfaces) {
            this.containerNetworkInterfaces = containerNetworkInterfaces;
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

        public Builder setIpConfigurations(@Nullable List<IPConfigurationProfileResponse> ipConfigurations) {
            this.ipConfigurations = ipConfigurations;
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
        public ContainerNetworkInterfaceConfigurationResponse build() {
            return new ContainerNetworkInterfaceConfigurationResponse(containerNetworkInterfaces, etag, id, ipConfigurations, name, provisioningState, type);
        }
    }
}
