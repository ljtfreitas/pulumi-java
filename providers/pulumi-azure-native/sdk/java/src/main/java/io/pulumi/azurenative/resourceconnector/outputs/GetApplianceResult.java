// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resourceconnector.outputs;

import io.pulumi.azurenative.resourceconnector.outputs.AppliancePropertiesResponseInfrastructureConfig;
import io.pulumi.azurenative.resourceconnector.outputs.IdentityResponse;
import io.pulumi.azurenative.resourceconnector.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetApplianceResult {
    /**
     * Represents a supported Fabric/Infra. (AKSEdge etc...).
     * 
     */
    private final @Nullable String distro;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * Identity for the resource.
     * 
     */
    private final @Nullable IdentityResponse identity;
    /**
     * Contains infrastructure information about the Appliance
     * 
     */
    private final @Nullable AppliancePropertiesResponseInfrastructureConfig infrastructureConfig;
    /**
     * The geo-location where the resource lives
     * 
     */
    private final String location;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * The current deployment or provisioning state, which only appears in the response.
     * 
     */
    private final String provisioningState;
    /**
     * Certificates pair used to download MSI certificate from HIS
     * 
     */
    private final @Nullable String publicKey;
    /**
     * Appliance’s health and state of connection to on-prem
     * 
     */
    private final String status;
    /**
     * Metadata pertaining to creation and last modification of the resource
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;
    /**
     * Version of the Appliance
     * 
     */
    private final String version;

    @OutputCustomType.Constructor({"distro","id","identity","infrastructureConfig","location","name","provisioningState","publicKey","status","systemData","tags","type","version"})
    private GetApplianceResult(
        @Nullable String distro,
        String id,
        @Nullable IdentityResponse identity,
        @Nullable AppliancePropertiesResponseInfrastructureConfig infrastructureConfig,
        String location,
        String name,
        String provisioningState,
        @Nullable String publicKey,
        String status,
        SystemDataResponse systemData,
        @Nullable Map<String,String> tags,
        String type,
        String version) {
        this.distro = distro;
        this.id = Objects.requireNonNull(id);
        this.identity = identity;
        this.infrastructureConfig = infrastructureConfig;
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.publicKey = publicKey;
        this.status = Objects.requireNonNull(status);
        this.systemData = Objects.requireNonNull(systemData);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.version = Objects.requireNonNull(version);
    }

    /**
     * Represents a supported Fabric/Infra. (AKSEdge etc...).
     * 
     */
    public Optional<String> getDistro() {
        return Optional.ofNullable(this.distro);
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Identity for the resource.
     * 
     */
    public Optional<IdentityResponse> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * Contains infrastructure information about the Appliance
     * 
     */
    public Optional<AppliancePropertiesResponseInfrastructureConfig> getInfrastructureConfig() {
        return Optional.ofNullable(this.infrastructureConfig);
    }
    /**
     * The geo-location where the resource lives
     * 
     */
    public String getLocation() {
        return this.location;
    }
    /**
     * The name of the resource
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The current deployment or provisioning state, which only appears in the response.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Certificates pair used to download MSI certificate from HIS
     * 
     */
    public Optional<String> getPublicKey() {
        return Optional.ofNullable(this.publicKey);
    }
    /**
     * Appliance’s health and state of connection to on-prem
     * 
     */
    public String getStatus() {
        return this.status;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource
     * 
     */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Resource tags.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * Version of the Appliance
     * 
     */
    public String getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplianceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String distro;
        private String id;
        private @Nullable IdentityResponse identity;
        private @Nullable AppliancePropertiesResponseInfrastructureConfig infrastructureConfig;
        private String location;
        private String name;
        private String provisioningState;
        private @Nullable String publicKey;
        private String status;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApplianceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.distro = defaults.distro;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.infrastructureConfig = defaults.infrastructureConfig;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicKey = defaults.publicKey;
    	      this.status = defaults.status;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder setDistro(@Nullable String distro) {
            this.distro = distro;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdentity(@Nullable IdentityResponse identity) {
            this.identity = identity;
            return this;
        }

        public Builder setInfrastructureConfig(@Nullable AppliancePropertiesResponseInfrastructureConfig infrastructureConfig) {
            this.infrastructureConfig = infrastructureConfig;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setPublicKey(@Nullable String publicKey) {
            this.publicKey = publicKey;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
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

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public GetApplianceResult build() {
            return new GetApplianceResult(distro, id, identity, infrastructureConfig, location, name, provisioningState, publicKey, status, systemData, tags, type, version);
        }
    }
}
