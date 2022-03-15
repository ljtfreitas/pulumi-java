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
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="containerGroupName")
      private final @Nullable Output<String> containerGroupName;

    public Output<String> getContainerGroupName() {
        return this.containerGroupName == null ? Output.empty() : this.containerGroupName;
    }

    /**
     * The containers within the container group.
     * 
     */
    @Import(name="containers", required=true)
      private final Output<List<ContainerArgs>> containers;

    public Output<List<ContainerArgs>> getContainers() {
        return this.containers;
    }

    /**
     * The diagnostic information for a container group.
     * 
     */
    @Import(name="diagnostics")
      private final @Nullable Output<ContainerGroupDiagnosticsArgs> diagnostics;

    public Output<ContainerGroupDiagnosticsArgs> getDiagnostics() {
        return this.diagnostics == null ? Output.empty() : this.diagnostics;
    }

    /**
     * The DNS config information for a container group.
     * 
     */
    @Import(name="dnsConfig")
      private final @Nullable Output<DnsConfigurationArgs> dnsConfig;

    public Output<DnsConfigurationArgs> getDnsConfig() {
        return this.dnsConfig == null ? Output.empty() : this.dnsConfig;
    }

    /**
     * The encryption properties for a container group.
     * 
     */
    @Import(name="encryptionProperties")
      private final @Nullable Output<EncryptionPropertiesArgs> encryptionProperties;

    public Output<EncryptionPropertiesArgs> getEncryptionProperties() {
        return this.encryptionProperties == null ? Output.empty() : this.encryptionProperties;
    }

    /**
     * The identity of the container group, if configured.
     * 
     */
    @Import(name="identity")
      private final @Nullable Output<ContainerGroupIdentityArgs> identity;

    public Output<ContainerGroupIdentityArgs> getIdentity() {
        return this.identity == null ? Output.empty() : this.identity;
    }

    /**
     * The image registry credentials by which the container group is created from.
     * 
     */
    @Import(name="imageRegistryCredentials")
      private final @Nullable Output<List<ImageRegistryCredentialArgs>> imageRegistryCredentials;

    public Output<List<ImageRegistryCredentialArgs>> getImageRegistryCredentials() {
        return this.imageRegistryCredentials == null ? Output.empty() : this.imageRegistryCredentials;
    }

    /**
     * The init containers for a container group.
     * 
     */
    @Import(name="initContainers")
      private final @Nullable Output<List<InitContainerDefinitionArgs>> initContainers;

    public Output<List<InitContainerDefinitionArgs>> getInitContainers() {
        return this.initContainers == null ? Output.empty() : this.initContainers;
    }

    /**
     * The IP address type of the container group.
     * 
     */
    @Import(name="ipAddress")
      private final @Nullable Output<IpAddressArgs> ipAddress;

    public Output<IpAddressArgs> getIpAddress() {
        return this.ipAddress == null ? Output.empty() : this.ipAddress;
    }

    /**
     * The resource location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The network profile information for a container group.
     * 
     */
    @Import(name="networkProfile")
      private final @Nullable Output<ContainerGroupNetworkProfileArgs> networkProfile;

    public Output<ContainerGroupNetworkProfileArgs> getNetworkProfile() {
        return this.networkProfile == null ? Output.empty() : this.networkProfile;
    }

    /**
     * The operating system type required by the containers in the container group.
     * 
     */
    @Import(name="osType", required=true)
      private final Output<Either<String,OperatingSystemTypes>> osType;

    public Output<Either<String,OperatingSystemTypes>> getOsType() {
        return this.osType;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Restart policy for all containers within the container group.
     * - `Always` Always restart
     * - `OnFailure` Restart on failure
     * - `Never` Never restart
     * 
     */
    @Import(name="restartPolicy")
      private final @Nullable Output<Either<String,ContainerGroupRestartPolicy>> restartPolicy;

    public Output<Either<String,ContainerGroupRestartPolicy>> getRestartPolicy() {
        return this.restartPolicy == null ? Output.empty() : this.restartPolicy;
    }

    /**
     * The SKU for a container group.
     * 
     */
    @Import(name="sku")
      private final @Nullable Output<Either<String,ContainerGroupSku>> sku;

    public Output<Either<String,ContainerGroupSku>> getSku() {
        return this.sku == null ? Output.empty() : this.sku;
    }

    /**
     * The resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * The list of volumes that can be mounted by containers in this container group.
     * 
     */
    @Import(name="volumes")
      private final @Nullable Output<List<VolumeArgs>> volumes;

    public Output<List<VolumeArgs>> getVolumes() {
        return this.volumes == null ? Output.empty() : this.volumes;
    }

    public ContainerGroupArgs(
        @Nullable Output<String> containerGroupName,
        Output<List<ContainerArgs>> containers,
        @Nullable Output<ContainerGroupDiagnosticsArgs> diagnostics,
        @Nullable Output<DnsConfigurationArgs> dnsConfig,
        @Nullable Output<EncryptionPropertiesArgs> encryptionProperties,
        @Nullable Output<ContainerGroupIdentityArgs> identity,
        @Nullable Output<List<ImageRegistryCredentialArgs>> imageRegistryCredentials,
        @Nullable Output<List<InitContainerDefinitionArgs>> initContainers,
        @Nullable Output<IpAddressArgs> ipAddress,
        @Nullable Output<String> location,
        @Nullable Output<ContainerGroupNetworkProfileArgs> networkProfile,
        Output<Either<String,OperatingSystemTypes>> osType,
        Output<String> resourceGroupName,
        @Nullable Output<Either<String,ContainerGroupRestartPolicy>> restartPolicy,
        @Nullable Output<Either<String,ContainerGroupSku>> sku,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<List<VolumeArgs>> volumes) {
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
        this.containerGroupName = Output.empty();
        this.containers = Output.empty();
        this.diagnostics = Output.empty();
        this.dnsConfig = Output.empty();
        this.encryptionProperties = Output.empty();
        this.identity = Output.empty();
        this.imageRegistryCredentials = Output.empty();
        this.initContainers = Output.empty();
        this.ipAddress = Output.empty();
        this.location = Output.empty();
        this.networkProfile = Output.empty();
        this.osType = Output.empty();
        this.resourceGroupName = Output.empty();
        this.restartPolicy = Output.empty();
        this.sku = Output.empty();
        this.tags = Output.empty();
        this.volumes = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> containerGroupName;
        private Output<List<ContainerArgs>> containers;
        private @Nullable Output<ContainerGroupDiagnosticsArgs> diagnostics;
        private @Nullable Output<DnsConfigurationArgs> dnsConfig;
        private @Nullable Output<EncryptionPropertiesArgs> encryptionProperties;
        private @Nullable Output<ContainerGroupIdentityArgs> identity;
        private @Nullable Output<List<ImageRegistryCredentialArgs>> imageRegistryCredentials;
        private @Nullable Output<List<InitContainerDefinitionArgs>> initContainers;
        private @Nullable Output<IpAddressArgs> ipAddress;
        private @Nullable Output<String> location;
        private @Nullable Output<ContainerGroupNetworkProfileArgs> networkProfile;
        private Output<Either<String,OperatingSystemTypes>> osType;
        private Output<String> resourceGroupName;
        private @Nullable Output<Either<String,ContainerGroupRestartPolicy>> restartPolicy;
        private @Nullable Output<Either<String,ContainerGroupSku>> sku;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<List<VolumeArgs>> volumes;

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

        public Builder containerGroupName(@Nullable Output<String> containerGroupName) {
            this.containerGroupName = containerGroupName;
            return this;
        }

        public Builder containerGroupName(@Nullable String containerGroupName) {
            this.containerGroupName = Output.ofNullable(containerGroupName);
            return this;
        }

        public Builder containers(Output<List<ContainerArgs>> containers) {
            this.containers = Objects.requireNonNull(containers);
            return this;
        }

        public Builder containers(List<ContainerArgs> containers) {
            this.containers = Output.of(Objects.requireNonNull(containers));
            return this;
        }

        public Builder diagnostics(@Nullable Output<ContainerGroupDiagnosticsArgs> diagnostics) {
            this.diagnostics = diagnostics;
            return this;
        }

        public Builder diagnostics(@Nullable ContainerGroupDiagnosticsArgs diagnostics) {
            this.diagnostics = Output.ofNullable(diagnostics);
            return this;
        }

        public Builder dnsConfig(@Nullable Output<DnsConfigurationArgs> dnsConfig) {
            this.dnsConfig = dnsConfig;
            return this;
        }

        public Builder dnsConfig(@Nullable DnsConfigurationArgs dnsConfig) {
            this.dnsConfig = Output.ofNullable(dnsConfig);
            return this;
        }

        public Builder encryptionProperties(@Nullable Output<EncryptionPropertiesArgs> encryptionProperties) {
            this.encryptionProperties = encryptionProperties;
            return this;
        }

        public Builder encryptionProperties(@Nullable EncryptionPropertiesArgs encryptionProperties) {
            this.encryptionProperties = Output.ofNullable(encryptionProperties);
            return this;
        }

        public Builder identity(@Nullable Output<ContainerGroupIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder identity(@Nullable ContainerGroupIdentityArgs identity) {
            this.identity = Output.ofNullable(identity);
            return this;
        }

        public Builder imageRegistryCredentials(@Nullable Output<List<ImageRegistryCredentialArgs>> imageRegistryCredentials) {
            this.imageRegistryCredentials = imageRegistryCredentials;
            return this;
        }

        public Builder imageRegistryCredentials(@Nullable List<ImageRegistryCredentialArgs> imageRegistryCredentials) {
            this.imageRegistryCredentials = Output.ofNullable(imageRegistryCredentials);
            return this;
        }

        public Builder initContainers(@Nullable Output<List<InitContainerDefinitionArgs>> initContainers) {
            this.initContainers = initContainers;
            return this;
        }

        public Builder initContainers(@Nullable List<InitContainerDefinitionArgs> initContainers) {
            this.initContainers = Output.ofNullable(initContainers);
            return this;
        }

        public Builder ipAddress(@Nullable Output<IpAddressArgs> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder ipAddress(@Nullable IpAddressArgs ipAddress) {
            this.ipAddress = Output.ofNullable(ipAddress);
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder networkProfile(@Nullable Output<ContainerGroupNetworkProfileArgs> networkProfile) {
            this.networkProfile = networkProfile;
            return this;
        }

        public Builder networkProfile(@Nullable ContainerGroupNetworkProfileArgs networkProfile) {
            this.networkProfile = Output.ofNullable(networkProfile);
            return this;
        }

        public Builder osType(Output<Either<String,OperatingSystemTypes>> osType) {
            this.osType = Objects.requireNonNull(osType);
            return this;
        }

        public Builder osType(Either<String,OperatingSystemTypes> osType) {
            this.osType = Output.of(Objects.requireNonNull(osType));
            return this;
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder restartPolicy(@Nullable Output<Either<String,ContainerGroupRestartPolicy>> restartPolicy) {
            this.restartPolicy = restartPolicy;
            return this;
        }

        public Builder restartPolicy(@Nullable Either<String,ContainerGroupRestartPolicy> restartPolicy) {
            this.restartPolicy = Output.ofNullable(restartPolicy);
            return this;
        }

        public Builder sku(@Nullable Output<Either<String,ContainerGroupSku>> sku) {
            this.sku = sku;
            return this;
        }

        public Builder sku(@Nullable Either<String,ContainerGroupSku> sku) {
            this.sku = Output.ofNullable(sku);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder volumes(@Nullable Output<List<VolumeArgs>> volumes) {
            this.volumes = volumes;
            return this;
        }

        public Builder volumes(@Nullable List<VolumeArgs> volumes) {
            this.volumes = Output.ofNullable(volumes);
            return this;
        }
        public ContainerGroupArgs build() {
            return new ContainerGroupArgs(containerGroupName, containers, diagnostics, dnsConfig, encryptionProperties, identity, imageRegistryCredentials, initContainers, ipAddress, location, networkProfile, osType, resourceGroupName, restartPolicy, sku, tags, volumes);
        }
    }
}
