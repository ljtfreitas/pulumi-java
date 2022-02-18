// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.outputs;

import io.pulumi.azurenative.containerinstance.outputs.ContainerGroupDiagnosticsResponse;
import io.pulumi.azurenative.containerinstance.outputs.ContainerGroupIdentityResponse;
import io.pulumi.azurenative.containerinstance.outputs.ContainerGroupNetworkProfileResponse;
import io.pulumi.azurenative.containerinstance.outputs.ContainerGroupResponseInstanceView;
import io.pulumi.azurenative.containerinstance.outputs.ContainerResponse;
import io.pulumi.azurenative.containerinstance.outputs.DnsConfigurationResponse;
import io.pulumi.azurenative.containerinstance.outputs.EncryptionPropertiesResponse;
import io.pulumi.azurenative.containerinstance.outputs.ImageRegistryCredentialResponse;
import io.pulumi.azurenative.containerinstance.outputs.InitContainerDefinitionResponse;
import io.pulumi.azurenative.containerinstance.outputs.IpAddressResponse;
import io.pulumi.azurenative.containerinstance.outputs.VolumeResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetContainerGroupResult {
    /**
     * The containers within the container group.
     * 
     */
    private final List<ContainerResponse> containers;
    /**
     * The diagnostic information for a container group.
     * 
     */
    private final @Nullable ContainerGroupDiagnosticsResponse diagnostics;
    /**
     * The DNS config information for a container group.
     * 
     */
    private final @Nullable DnsConfigurationResponse dnsConfig;
    /**
     * The encryption properties for a container group.
     * 
     */
    private final @Nullable EncryptionPropertiesResponse encryptionProperties;
    /**
     * The resource id.
     * 
     */
    private final String id;
    /**
     * The identity of the container group, if configured.
     * 
     */
    private final @Nullable ContainerGroupIdentityResponse identity;
    /**
     * The image registry credentials by which the container group is created from.
     * 
     */
    private final @Nullable List<ImageRegistryCredentialResponse> imageRegistryCredentials;
    /**
     * The init containers for a container group.
     * 
     */
    private final @Nullable List<InitContainerDefinitionResponse> initContainers;
    /**
     * The instance view of the container group. Only valid in response.
     * 
     */
    private final ContainerGroupResponseInstanceView instanceView;
    /**
     * The IP address type of the container group.
     * 
     */
    private final @Nullable IpAddressResponse ipAddress;
    /**
     * The resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * The resource name.
     * 
     */
    private final String name;
    /**
     * The network profile information for a container group.
     * 
     */
    private final @Nullable ContainerGroupNetworkProfileResponse networkProfile;
    /**
     * The operating system type required by the containers in the container group.
     * 
     */
    private final String osType;
    /**
     * The provisioning state of the container group. This only appears in the response.
     * 
     */
    private final String provisioningState;
    /**
     * Restart policy for all containers within the container group.
     * - `Always` Always restart
     * - `OnFailure` Restart on failure
     * - `Never` Never restart
     * 
     */
    private final @Nullable String restartPolicy;
    /**
     * The SKU for a container group.
     * 
     */
    private final @Nullable String sku;
    /**
     * The resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The resource type.
     * 
     */
    private final String type;
    /**
     * The list of volumes that can be mounted by containers in this container group.
     * 
     */
    private final @Nullable List<VolumeResponse> volumes;

    @OutputCustomType.Constructor({"containers","diagnostics","dnsConfig","encryptionProperties","id","identity","imageRegistryCredentials","initContainers","instanceView","ipAddress","location","name","networkProfile","osType","provisioningState","restartPolicy","sku","tags","type","volumes"})
    private GetContainerGroupResult(
        List<ContainerResponse> containers,
        @Nullable ContainerGroupDiagnosticsResponse diagnostics,
        @Nullable DnsConfigurationResponse dnsConfig,
        @Nullable EncryptionPropertiesResponse encryptionProperties,
        String id,
        @Nullable ContainerGroupIdentityResponse identity,
        @Nullable List<ImageRegistryCredentialResponse> imageRegistryCredentials,
        @Nullable List<InitContainerDefinitionResponse> initContainers,
        ContainerGroupResponseInstanceView instanceView,
        @Nullable IpAddressResponse ipAddress,
        @Nullable String location,
        String name,
        @Nullable ContainerGroupNetworkProfileResponse networkProfile,
        String osType,
        String provisioningState,
        @Nullable String restartPolicy,
        @Nullable String sku,
        @Nullable Map<String,String> tags,
        String type,
        @Nullable List<VolumeResponse> volumes) {
        this.containers = Objects.requireNonNull(containers);
        this.diagnostics = diagnostics;
        this.dnsConfig = dnsConfig;
        this.encryptionProperties = encryptionProperties;
        this.id = Objects.requireNonNull(id);
        this.identity = identity;
        this.imageRegistryCredentials = imageRegistryCredentials;
        this.initContainers = initContainers;
        this.instanceView = Objects.requireNonNull(instanceView);
        this.ipAddress = ipAddress;
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.networkProfile = networkProfile;
        this.osType = Objects.requireNonNull(osType);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.restartPolicy = restartPolicy;
        this.sku = sku;
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.volumes = volumes;
    }

    /**
     * The containers within the container group.
     * 
     */
    public List<ContainerResponse> getContainers() {
        return this.containers;
    }
    /**
     * The diagnostic information for a container group.
     * 
     */
    public Optional<ContainerGroupDiagnosticsResponse> getDiagnostics() {
        return Optional.ofNullable(this.diagnostics);
    }
    /**
     * The DNS config information for a container group.
     * 
     */
    public Optional<DnsConfigurationResponse> getDnsConfig() {
        return Optional.ofNullable(this.dnsConfig);
    }
    /**
     * The encryption properties for a container group.
     * 
     */
    public Optional<EncryptionPropertiesResponse> getEncryptionProperties() {
        return Optional.ofNullable(this.encryptionProperties);
    }
    /**
     * The resource id.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The identity of the container group, if configured.
     * 
     */
    public Optional<ContainerGroupIdentityResponse> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * The image registry credentials by which the container group is created from.
     * 
     */
    public List<ImageRegistryCredentialResponse> getImageRegistryCredentials() {
        return this.imageRegistryCredentials == null ? List.of() : this.imageRegistryCredentials;
    }
    /**
     * The init containers for a container group.
     * 
     */
    public List<InitContainerDefinitionResponse> getInitContainers() {
        return this.initContainers == null ? List.of() : this.initContainers;
    }
    /**
     * The instance view of the container group. Only valid in response.
     * 
     */
    public ContainerGroupResponseInstanceView getInstanceView() {
        return this.instanceView;
    }
    /**
     * The IP address type of the container group.
     * 
     */
    public Optional<IpAddressResponse> getIpAddress() {
        return Optional.ofNullable(this.ipAddress);
    }
    /**
     * The resource location.
     * 
     */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The resource name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The network profile information for a container group.
     * 
     */
    public Optional<ContainerGroupNetworkProfileResponse> getNetworkProfile() {
        return Optional.ofNullable(this.networkProfile);
    }
    /**
     * The operating system type required by the containers in the container group.
     * 
     */
    public String getOsType() {
        return this.osType;
    }
    /**
     * The provisioning state of the container group. This only appears in the response.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Restart policy for all containers within the container group.
     * - `Always` Always restart
     * - `OnFailure` Restart on failure
     * - `Never` Never restart
     * 
     */
    public Optional<String> getRestartPolicy() {
        return Optional.ofNullable(this.restartPolicy);
    }
    /**
     * The SKU for a container group.
     * 
     */
    public Optional<String> getSku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * The resource tags.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The resource type.
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * The list of volumes that can be mounted by containers in this container group.
     * 
     */
    public List<VolumeResponse> getVolumes() {
        return this.volumes == null ? List.of() : this.volumes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetContainerGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ContainerResponse> containers;
        private @Nullable ContainerGroupDiagnosticsResponse diagnostics;
        private @Nullable DnsConfigurationResponse dnsConfig;
        private @Nullable EncryptionPropertiesResponse encryptionProperties;
        private String id;
        private @Nullable ContainerGroupIdentityResponse identity;
        private @Nullable List<ImageRegistryCredentialResponse> imageRegistryCredentials;
        private @Nullable List<InitContainerDefinitionResponse> initContainers;
        private ContainerGroupResponseInstanceView instanceView;
        private @Nullable IpAddressResponse ipAddress;
        private @Nullable String location;
        private String name;
        private @Nullable ContainerGroupNetworkProfileResponse networkProfile;
        private String osType;
        private String provisioningState;
        private @Nullable String restartPolicy;
        private @Nullable String sku;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable List<VolumeResponse> volumes;

        public Builder() {
    	      // Empty
        }

        public Builder(GetContainerGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containers = defaults.containers;
    	      this.diagnostics = defaults.diagnostics;
    	      this.dnsConfig = defaults.dnsConfig;
    	      this.encryptionProperties = defaults.encryptionProperties;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.imageRegistryCredentials = defaults.imageRegistryCredentials;
    	      this.initContainers = defaults.initContainers;
    	      this.instanceView = defaults.instanceView;
    	      this.ipAddress = defaults.ipAddress;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.networkProfile = defaults.networkProfile;
    	      this.osType = defaults.osType;
    	      this.provisioningState = defaults.provisioningState;
    	      this.restartPolicy = defaults.restartPolicy;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.volumes = defaults.volumes;
        }

        public Builder setContainers(List<ContainerResponse> containers) {
            this.containers = Objects.requireNonNull(containers);
            return this;
        }

        public Builder setDiagnostics(@Nullable ContainerGroupDiagnosticsResponse diagnostics) {
            this.diagnostics = diagnostics;
            return this;
        }

        public Builder setDnsConfig(@Nullable DnsConfigurationResponse dnsConfig) {
            this.dnsConfig = dnsConfig;
            return this;
        }

        public Builder setEncryptionProperties(@Nullable EncryptionPropertiesResponse encryptionProperties) {
            this.encryptionProperties = encryptionProperties;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdentity(@Nullable ContainerGroupIdentityResponse identity) {
            this.identity = identity;
            return this;
        }

        public Builder setImageRegistryCredentials(@Nullable List<ImageRegistryCredentialResponse> imageRegistryCredentials) {
            this.imageRegistryCredentials = imageRegistryCredentials;
            return this;
        }

        public Builder setInitContainers(@Nullable List<InitContainerDefinitionResponse> initContainers) {
            this.initContainers = initContainers;
            return this;
        }

        public Builder setInstanceView(ContainerGroupResponseInstanceView instanceView) {
            this.instanceView = Objects.requireNonNull(instanceView);
            return this;
        }

        public Builder setIpAddress(@Nullable IpAddressResponse ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNetworkProfile(@Nullable ContainerGroupNetworkProfileResponse networkProfile) {
            this.networkProfile = networkProfile;
            return this;
        }

        public Builder setOsType(String osType) {
            this.osType = Objects.requireNonNull(osType);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRestartPolicy(@Nullable String restartPolicy) {
            this.restartPolicy = restartPolicy;
            return this;
        }

        public Builder setSku(@Nullable String sku) {
            this.sku = sku;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVolumes(@Nullable List<VolumeResponse> volumes) {
            this.volumes = volumes;
            return this;
        }

        public GetContainerGroupResult build() {
            return new GetContainerGroupResult(containers, diagnostics, dnsConfig, encryptionProperties, id, identity, imageRegistryCredentials, initContainers, instanceView, ipAddress, location, name, networkProfile, osType, provisioningState, restartPolicy, sku, tags, type, volumes);
        }
    }
}
