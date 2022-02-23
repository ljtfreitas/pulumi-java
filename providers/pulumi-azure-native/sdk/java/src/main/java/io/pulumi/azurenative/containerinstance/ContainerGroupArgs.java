// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance;

import io.pulumi.azurenative.containerinstance.enums.ContainerGroupRestartPolicy;
import io.pulumi.azurenative.containerinstance.enums.ContainerGroupSku;
import io.pulumi.azurenative.containerinstance.enums.OperatingSystemTypes;
import io.pulumi.azurenative.containerinstance.inputs.ContainerArgs;
import io.pulumi.azurenative.containerinstance.inputs.ContainerGroupDiagnosticsArgs;
import io.pulumi.azurenative.containerinstance.inputs.ContainerGroupIdentityArgs;
import io.pulumi.azurenative.containerinstance.inputs.ContainerGroupNetworkProfileArgs;
import io.pulumi.azurenative.containerinstance.inputs.DnsConfigurationArgs;
import io.pulumi.azurenative.containerinstance.inputs.EncryptionPropertiesArgs;
import io.pulumi.azurenative.containerinstance.inputs.ImageRegistryCredentialArgs;
import io.pulumi.azurenative.containerinstance.inputs.InitContainerDefinitionArgs;
import io.pulumi.azurenative.containerinstance.inputs.IpAddressArgs;
import io.pulumi.azurenative.containerinstance.inputs.VolumeArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ContainerGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerGroupArgs Empty = new ContainerGroupArgs();

    /**
     * The name of the container group.
     * 
     */
    @InputImport(name="containerGroupName")
        private final @Nullable Input<String> containerGroupName;

    public Input<String> getContainerGroupName() {
        return this.containerGroupName == null ? Input.empty() : this.containerGroupName;
    }

    /**
     * The containers within the container group.
     * 
     */
    @InputImport(name="containers", required=true)
        private final Input<List<ContainerArgs>> containers;

    public Input<List<ContainerArgs>> getContainers() {
        return this.containers;
    }

    /**
     * The diagnostic information for a container group.
     * 
     */
    @InputImport(name="diagnostics")
        private final @Nullable Input<ContainerGroupDiagnosticsArgs> diagnostics;

    public Input<ContainerGroupDiagnosticsArgs> getDiagnostics() {
        return this.diagnostics == null ? Input.empty() : this.diagnostics;
    }

    /**
     * The DNS config information for a container group.
     * 
     */
    @InputImport(name="dnsConfig")
        private final @Nullable Input<DnsConfigurationArgs> dnsConfig;

    public Input<DnsConfigurationArgs> getDnsConfig() {
        return this.dnsConfig == null ? Input.empty() : this.dnsConfig;
    }

    /**
     * The encryption properties for a container group.
     * 
     */
    @InputImport(name="encryptionProperties")
        private final @Nullable Input<EncryptionPropertiesArgs> encryptionProperties;

    public Input<EncryptionPropertiesArgs> getEncryptionProperties() {
        return this.encryptionProperties == null ? Input.empty() : this.encryptionProperties;
    }

    /**
     * The identity of the container group, if configured.
     * 
     */
    @InputImport(name="identity")
        private final @Nullable Input<ContainerGroupIdentityArgs> identity;

    public Input<ContainerGroupIdentityArgs> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    /**
     * The image registry credentials by which the container group is created from.
     * 
     */
    @InputImport(name="imageRegistryCredentials")
        private final @Nullable Input<List<ImageRegistryCredentialArgs>> imageRegistryCredentials;

    public Input<List<ImageRegistryCredentialArgs>> getImageRegistryCredentials() {
        return this.imageRegistryCredentials == null ? Input.empty() : this.imageRegistryCredentials;
    }

    /**
     * The init containers for a container group.
     * 
     */
    @InputImport(name="initContainers")
        private final @Nullable Input<List<InitContainerDefinitionArgs>> initContainers;

    public Input<List<InitContainerDefinitionArgs>> getInitContainers() {
        return this.initContainers == null ? Input.empty() : this.initContainers;
    }

    /**
     * The IP address type of the container group.
     * 
     */
    @InputImport(name="ipAddress")
        private final @Nullable Input<IpAddressArgs> ipAddress;

    public Input<IpAddressArgs> getIpAddress() {
        return this.ipAddress == null ? Input.empty() : this.ipAddress;
    }

    /**
     * The resource location.
     * 
     */
    @InputImport(name="location")
        private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The network profile information for a container group.
     * 
     */
    @InputImport(name="networkProfile")
        private final @Nullable Input<ContainerGroupNetworkProfileArgs> networkProfile;

    public Input<ContainerGroupNetworkProfileArgs> getNetworkProfile() {
        return this.networkProfile == null ? Input.empty() : this.networkProfile;
    }

    /**
     * The operating system type required by the containers in the container group.
     * 
     */
    @InputImport(name="osType", required=true)
        private final Input<Either<String,OperatingSystemTypes>> osType;

    public Input<Either<String,OperatingSystemTypes>> getOsType() {
        return this.osType;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Restart policy for all containers within the container group.
     * - `Always` Always restart
     * - `OnFailure` Restart on failure
     * - `Never` Never restart
     * 
     */
    @InputImport(name="restartPolicy")
        private final @Nullable Input<Either<String,ContainerGroupRestartPolicy>> restartPolicy;

    public Input<Either<String,ContainerGroupRestartPolicy>> getRestartPolicy() {
        return this.restartPolicy == null ? Input.empty() : this.restartPolicy;
    }

    /**
     * The SKU for a container group.
     * 
     */
    @InputImport(name="sku")
        private final @Nullable Input<Either<String,ContainerGroupSku>> sku;

    public Input<Either<String,ContainerGroupSku>> getSku() {
        return this.sku == null ? Input.empty() : this.sku;
    }

    /**
     * The resource tags.
     * 
     */
    @InputImport(name="tags")
        private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The list of volumes that can be mounted by containers in this container group.
     * 
     */
    @InputImport(name="volumes")
        private final @Nullable Input<List<VolumeArgs>> volumes;

    public Input<List<VolumeArgs>> getVolumes() {
        return this.volumes == null ? Input.empty() : this.volumes;
    }

    public ContainerGroupArgs(
        @Nullable Input<String> containerGroupName,
        Input<List<ContainerArgs>> containers,
        @Nullable Input<ContainerGroupDiagnosticsArgs> diagnostics,
        @Nullable Input<DnsConfigurationArgs> dnsConfig,
        @Nullable Input<EncryptionPropertiesArgs> encryptionProperties,
        @Nullable Input<ContainerGroupIdentityArgs> identity,
        @Nullable Input<List<ImageRegistryCredentialArgs>> imageRegistryCredentials,
        @Nullable Input<List<InitContainerDefinitionArgs>> initContainers,
        @Nullable Input<IpAddressArgs> ipAddress,
        @Nullable Input<String> location,
        @Nullable Input<ContainerGroupNetworkProfileArgs> networkProfile,
        Input<Either<String,OperatingSystemTypes>> osType,
        Input<String> resourceGroupName,
        @Nullable Input<Either<String,ContainerGroupRestartPolicy>> restartPolicy,
        @Nullable Input<Either<String,ContainerGroupSku>> sku,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<List<VolumeArgs>> volumes) {
        this.containerGroupName = containerGroupName;
        this.containers = Objects.requireNonNull(containers, "expected parameter 'containers' to be non-null");
        this.diagnostics = diagnostics;
        this.dnsConfig = dnsConfig;
        this.encryptionProperties = encryptionProperties;
        this.identity = identity;
        this.imageRegistryCredentials = imageRegistryCredentials;
        this.initContainers = initContainers;
        this.ipAddress = ipAddress;
        this.location = location;
        this.networkProfile = networkProfile;
        this.osType = Objects.requireNonNull(osType, "expected parameter 'osType' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.restartPolicy = restartPolicy;
        this.sku = sku;
        this.tags = tags;
        this.volumes = volumes;
    }

    private ContainerGroupArgs() {
        this.containerGroupName = Input.empty();
        this.containers = Input.empty();
        this.diagnostics = Input.empty();
        this.dnsConfig = Input.empty();
        this.encryptionProperties = Input.empty();
        this.identity = Input.empty();
        this.imageRegistryCredentials = Input.empty();
        this.initContainers = Input.empty();
        this.ipAddress = Input.empty();
        this.location = Input.empty();
        this.networkProfile = Input.empty();
        this.osType = Input.empty();
        this.resourceGroupName = Input.empty();
        this.restartPolicy = Input.empty();
        this.sku = Input.empty();
        this.tags = Input.empty();
        this.volumes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> containerGroupName;
        private Input<List<ContainerArgs>> containers;
        private @Nullable Input<ContainerGroupDiagnosticsArgs> diagnostics;
        private @Nullable Input<DnsConfigurationArgs> dnsConfig;
        private @Nullable Input<EncryptionPropertiesArgs> encryptionProperties;
        private @Nullable Input<ContainerGroupIdentityArgs> identity;
        private @Nullable Input<List<ImageRegistryCredentialArgs>> imageRegistryCredentials;
        private @Nullable Input<List<InitContainerDefinitionArgs>> initContainers;
        private @Nullable Input<IpAddressArgs> ipAddress;
        private @Nullable Input<String> location;
        private @Nullable Input<ContainerGroupNetworkProfileArgs> networkProfile;
        private Input<Either<String,OperatingSystemTypes>> osType;
        private Input<String> resourceGroupName;
        private @Nullable Input<Either<String,ContainerGroupRestartPolicy>> restartPolicy;
        private @Nullable Input<Either<String,ContainerGroupSku>> sku;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<List<VolumeArgs>> volumes;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerGroupName = defaults.containerGroupName;
    	      this.containers = defaults.containers;
    	      this.diagnostics = defaults.diagnostics;
    	      this.dnsConfig = defaults.dnsConfig;
    	      this.encryptionProperties = defaults.encryptionProperties;
    	      this.identity = defaults.identity;
    	      this.imageRegistryCredentials = defaults.imageRegistryCredentials;
    	      this.initContainers = defaults.initContainers;
    	      this.ipAddress = defaults.ipAddress;
    	      this.location = defaults.location;
    	      this.networkProfile = defaults.networkProfile;
    	      this.osType = defaults.osType;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.restartPolicy = defaults.restartPolicy;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.volumes = defaults.volumes;
        }

        public Builder setContainerGroupName(@Nullable Input<String> containerGroupName) {
            this.containerGroupName = containerGroupName;
            return this;
        }

        public Builder setContainerGroupName(@Nullable String containerGroupName) {
            this.containerGroupName = Input.ofNullable(containerGroupName);
            return this;
        }

        public Builder setContainers(Input<List<ContainerArgs>> containers) {
            this.containers = Objects.requireNonNull(containers);
            return this;
        }

        public Builder setContainers(List<ContainerArgs> containers) {
            this.containers = Input.of(Objects.requireNonNull(containers));
            return this;
        }

        public Builder setDiagnostics(@Nullable Input<ContainerGroupDiagnosticsArgs> diagnostics) {
            this.diagnostics = diagnostics;
            return this;
        }

        public Builder setDiagnostics(@Nullable ContainerGroupDiagnosticsArgs diagnostics) {
            this.diagnostics = Input.ofNullable(diagnostics);
            return this;
        }

        public Builder setDnsConfig(@Nullable Input<DnsConfigurationArgs> dnsConfig) {
            this.dnsConfig = dnsConfig;
            return this;
        }

        public Builder setDnsConfig(@Nullable DnsConfigurationArgs dnsConfig) {
            this.dnsConfig = Input.ofNullable(dnsConfig);
            return this;
        }

        public Builder setEncryptionProperties(@Nullable Input<EncryptionPropertiesArgs> encryptionProperties) {
            this.encryptionProperties = encryptionProperties;
            return this;
        }

        public Builder setEncryptionProperties(@Nullable EncryptionPropertiesArgs encryptionProperties) {
            this.encryptionProperties = Input.ofNullable(encryptionProperties);
            return this;
        }

        public Builder setIdentity(@Nullable Input<ContainerGroupIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder setIdentity(@Nullable ContainerGroupIdentityArgs identity) {
            this.identity = Input.ofNullable(identity);
            return this;
        }

        public Builder setImageRegistryCredentials(@Nullable Input<List<ImageRegistryCredentialArgs>> imageRegistryCredentials) {
            this.imageRegistryCredentials = imageRegistryCredentials;
            return this;
        }

        public Builder setImageRegistryCredentials(@Nullable List<ImageRegistryCredentialArgs> imageRegistryCredentials) {
            this.imageRegistryCredentials = Input.ofNullable(imageRegistryCredentials);
            return this;
        }

        public Builder setInitContainers(@Nullable Input<List<InitContainerDefinitionArgs>> initContainers) {
            this.initContainers = initContainers;
            return this;
        }

        public Builder setInitContainers(@Nullable List<InitContainerDefinitionArgs> initContainers) {
            this.initContainers = Input.ofNullable(initContainers);
            return this;
        }

        public Builder setIpAddress(@Nullable Input<IpAddressArgs> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder setIpAddress(@Nullable IpAddressArgs ipAddress) {
            this.ipAddress = Input.ofNullable(ipAddress);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setNetworkProfile(@Nullable Input<ContainerGroupNetworkProfileArgs> networkProfile) {
            this.networkProfile = networkProfile;
            return this;
        }

        public Builder setNetworkProfile(@Nullable ContainerGroupNetworkProfileArgs networkProfile) {
            this.networkProfile = Input.ofNullable(networkProfile);
            return this;
        }

        public Builder setOsType(Input<Either<String,OperatingSystemTypes>> osType) {
            this.osType = Objects.requireNonNull(osType);
            return this;
        }

        public Builder setOsType(Either<String,OperatingSystemTypes> osType) {
            this.osType = Input.of(Objects.requireNonNull(osType));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setRestartPolicy(@Nullable Input<Either<String,ContainerGroupRestartPolicy>> restartPolicy) {
            this.restartPolicy = restartPolicy;
            return this;
        }

        public Builder setRestartPolicy(@Nullable Either<String,ContainerGroupRestartPolicy> restartPolicy) {
            this.restartPolicy = Input.ofNullable(restartPolicy);
            return this;
        }

        public Builder setSku(@Nullable Input<Either<String,ContainerGroupSku>> sku) {
            this.sku = sku;
            return this;
        }

        public Builder setSku(@Nullable Either<String,ContainerGroupSku> sku) {
            this.sku = Input.ofNullable(sku);
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

        public Builder setVolumes(@Nullable Input<List<VolumeArgs>> volumes) {
            this.volumes = volumes;
            return this;
        }

        public Builder setVolumes(@Nullable List<VolumeArgs> volumes) {
            this.volumes = Input.ofNullable(volumes);
            return this;
        }
        public ContainerGroupArgs build() {
            return new ContainerGroupArgs(containerGroupName, containers, diagnostics, dnsConfig, encryptionProperties, identity, imageRegistryCredentials, initContainers, ipAddress, location, networkProfile, osType, resourceGroupName, restartPolicy, sku, tags, volumes);
        }
    }
}
