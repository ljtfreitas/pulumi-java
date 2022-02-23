// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.outputs;

import io.pulumi.azurenative.devtestlab.outputs.ExternalSubnetResponse;
import io.pulumi.azurenative.devtestlab.outputs.SubnetOverrideResponse;
import io.pulumi.azurenative.devtestlab.outputs.SubnetResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetVirtualNetworkResult {
    /**
     * The allowed subnets of the virtual network.
     * 
     */
    private final @Nullable List<SubnetResponse> allowedSubnets;
    /**
     * The creation date of the virtual network.
     * 
     */
    private final String createdDate;
    /**
     * The description of the virtual network.
     * 
     */
    private final @Nullable String description;
    /**
     * The Microsoft.Network resource identifier of the virtual network.
     * 
     */
    private final @Nullable String externalProviderResourceId;
    /**
     * The external subnet properties.
     * 
     */
    private final List<ExternalSubnetResponse> externalSubnets;
    /**
     * The identifier of the resource.
     * 
     */
    private final String id;
    /**
     * The location of the resource.
     * 
     */
    private final @Nullable String location;
    /**
     * The name of the resource.
     * 
     */
    private final String name;
    /**
     * The provisioning status of the resource.
     * 
     */
    private final String provisioningState;
    /**
     * The subnet overrides of the virtual network.
     * 
     */
    private final @Nullable List<SubnetOverrideResponse> subnetOverrides;
    /**
     * The tags of the resource.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource.
     * 
     */
    private final String type;
    /**
     * The unique immutable identifier of a resource (Guid).
     * 
     */
    private final String uniqueIdentifier;

    @OutputCustomType.Constructor({"allowedSubnets","createdDate","description","externalProviderResourceId","externalSubnets","id","location","name","provisioningState","subnetOverrides","tags","type","uniqueIdentifier"})
    private GetVirtualNetworkResult(
        @Nullable List<SubnetResponse> allowedSubnets,
        String createdDate,
        @Nullable String description,
        @Nullable String externalProviderResourceId,
        List<ExternalSubnetResponse> externalSubnets,
        String id,
        @Nullable String location,
        String name,
        String provisioningState,
        @Nullable List<SubnetOverrideResponse> subnetOverrides,
        @Nullable Map<String,String> tags,
        String type,
        String uniqueIdentifier) {
        this.allowedSubnets = allowedSubnets;
        this.createdDate = Objects.requireNonNull(createdDate);
        this.description = description;
        this.externalProviderResourceId = externalProviderResourceId;
        this.externalSubnets = Objects.requireNonNull(externalSubnets);
        this.id = Objects.requireNonNull(id);
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.subnetOverrides = subnetOverrides;
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.uniqueIdentifier = Objects.requireNonNull(uniqueIdentifier);
    }

    /**
     * The allowed subnets of the virtual network.
     * 
     */
    public List<SubnetResponse> getAllowedSubnets() {
        return this.allowedSubnets == null ? List.of() : this.allowedSubnets;
    }
    /**
     * The creation date of the virtual network.
     * 
     */
    public String getCreatedDate() {
        return this.createdDate;
    }
    /**
     * The description of the virtual network.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The Microsoft.Network resource identifier of the virtual network.
     * 
     */
    public Optional<String> getExternalProviderResourceId() {
        return Optional.ofNullable(this.externalProviderResourceId);
    }
    /**
     * The external subnet properties.
     * 
     */
    public List<ExternalSubnetResponse> getExternalSubnets() {
        return this.externalSubnets;
    }
    /**
     * The identifier of the resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The location of the resource.
     * 
     */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The name of the resource.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The provisioning status of the resource.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The subnet overrides of the virtual network.
     * 
     */
    public List<SubnetOverrideResponse> getSubnetOverrides() {
        return this.subnetOverrides == null ? List.of() : this.subnetOverrides;
    }
    /**
     * The tags of the resource.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of the resource.
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * The unique immutable identifier of a resource (Guid).
     * 
     */
    public String getUniqueIdentifier() {
        return this.uniqueIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualNetworkResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<SubnetResponse> allowedSubnets;
        private String createdDate;
        private @Nullable String description;
        private @Nullable String externalProviderResourceId;
        private List<ExternalSubnetResponse> externalSubnets;
        private String id;
        private @Nullable String location;
        private String name;
        private String provisioningState;
        private @Nullable List<SubnetOverrideResponse> subnetOverrides;
        private @Nullable Map<String,String> tags;
        private String type;
        private String uniqueIdentifier;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualNetworkResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedSubnets = defaults.allowedSubnets;
    	      this.createdDate = defaults.createdDate;
    	      this.description = defaults.description;
    	      this.externalProviderResourceId = defaults.externalProviderResourceId;
    	      this.externalSubnets = defaults.externalSubnets;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.subnetOverrides = defaults.subnetOverrides;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.uniqueIdentifier = defaults.uniqueIdentifier;
        }

        public Builder setAllowedSubnets(@Nullable List<SubnetResponse> allowedSubnets) {
            this.allowedSubnets = allowedSubnets;
            return this;
        }

        public Builder setCreatedDate(String createdDate) {
            this.createdDate = Objects.requireNonNull(createdDate);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setExternalProviderResourceId(@Nullable String externalProviderResourceId) {
            this.externalProviderResourceId = externalProviderResourceId;
            return this;
        }

        public Builder setExternalSubnets(List<ExternalSubnetResponse> externalSubnets) {
            this.externalSubnets = Objects.requireNonNull(externalSubnets);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
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

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSubnetOverrides(@Nullable List<SubnetOverrideResponse> subnetOverrides) {
            this.subnetOverrides = subnetOverrides;
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

        public Builder setUniqueIdentifier(String uniqueIdentifier) {
            this.uniqueIdentifier = Objects.requireNonNull(uniqueIdentifier);
            return this;
        }
        public GetVirtualNetworkResult build() {
            return new GetVirtualNetworkResult(allowedSubnets, createdDate, description, externalProviderResourceId, externalSubnets, id, location, name, provisioningState, subnetOverrides, tags, type, uniqueIdentifier);
        }
    }
}
