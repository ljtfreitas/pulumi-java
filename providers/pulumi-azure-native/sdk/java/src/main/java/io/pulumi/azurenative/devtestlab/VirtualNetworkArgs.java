// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab;

import io.pulumi.azurenative.devtestlab.inputs.SubnetArgs;
import io.pulumi.azurenative.devtestlab.inputs.SubnetOverrideArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNetworkArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkArgs Empty = new VirtualNetworkArgs();

    /**
     * The allowed subnets of the virtual network.
     * 
     */
    @InputImport(name="allowedSubnets")
    private final @Nullable Input<List<SubnetArgs>> allowedSubnets;

    public Input<List<SubnetArgs>> getAllowedSubnets() {
        return this.allowedSubnets == null ? Input.empty() : this.allowedSubnets;
    }

    /**
     * The description of the virtual network.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The Microsoft.Network resource identifier of the virtual network.
     * 
     */
    @InputImport(name="externalProviderResourceId")
    private final @Nullable Input<String> externalProviderResourceId;

    public Input<String> getExternalProviderResourceId() {
        return this.externalProviderResourceId == null ? Input.empty() : this.externalProviderResourceId;
    }

    /**
     * The name of the lab.
     * 
     */
    @InputImport(name="labName", required=true)
    private final Input<String> labName;

    public Input<String> getLabName() {
        return this.labName;
    }

    /**
     * The location of the resource.
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The name of the virtual network.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
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
     * The subnet overrides of the virtual network.
     * 
     */
    @InputImport(name="subnetOverrides")
    private final @Nullable Input<List<SubnetOverrideArgs>> subnetOverrides;

    public Input<List<SubnetOverrideArgs>> getSubnetOverrides() {
        return this.subnetOverrides == null ? Input.empty() : this.subnetOverrides;
    }

    /**
     * The tags of the resource.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public VirtualNetworkArgs(
        @Nullable Input<List<SubnetArgs>> allowedSubnets,
        @Nullable Input<String> description,
        @Nullable Input<String> externalProviderResourceId,
        Input<String> labName,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        Input<String> resourceGroupName,
        @Nullable Input<List<SubnetOverrideArgs>> subnetOverrides,
        @Nullable Input<Map<String,String>> tags) {
        this.allowedSubnets = allowedSubnets;
        this.description = description;
        this.externalProviderResourceId = externalProviderResourceId;
        this.labName = Objects.requireNonNull(labName, "expected parameter 'labName' to be non-null");
        this.location = location;
        this.name = name;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.subnetOverrides = subnetOverrides;
        this.tags = tags;
    }

    private VirtualNetworkArgs() {
        this.allowedSubnets = Input.empty();
        this.description = Input.empty();
        this.externalProviderResourceId = Input.empty();
        this.labName = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.resourceGroupName = Input.empty();
        this.subnetOverrides = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<SubnetArgs>> allowedSubnets;
        private @Nullable Input<String> description;
        private @Nullable Input<String> externalProviderResourceId;
        private Input<String> labName;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private Input<String> resourceGroupName;
        private @Nullable Input<List<SubnetOverrideArgs>> subnetOverrides;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedSubnets = defaults.allowedSubnets;
    	      this.description = defaults.description;
    	      this.externalProviderResourceId = defaults.externalProviderResourceId;
    	      this.labName = defaults.labName;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.subnetOverrides = defaults.subnetOverrides;
    	      this.tags = defaults.tags;
        }

        public Builder setAllowedSubnets(@Nullable Input<List<SubnetArgs>> allowedSubnets) {
            this.allowedSubnets = allowedSubnets;
            return this;
        }

        public Builder setAllowedSubnets(@Nullable List<SubnetArgs> allowedSubnets) {
            this.allowedSubnets = Input.ofNullable(allowedSubnets);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setExternalProviderResourceId(@Nullable Input<String> externalProviderResourceId) {
            this.externalProviderResourceId = externalProviderResourceId;
            return this;
        }

        public Builder setExternalProviderResourceId(@Nullable String externalProviderResourceId) {
            this.externalProviderResourceId = Input.ofNullable(externalProviderResourceId);
            return this;
        }

        public Builder setLabName(Input<String> labName) {
            this.labName = Objects.requireNonNull(labName);
            return this;
        }

        public Builder setLabName(String labName) {
            this.labName = Input.of(Objects.requireNonNull(labName));
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

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
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

        public Builder setSubnetOverrides(@Nullable Input<List<SubnetOverrideArgs>> subnetOverrides) {
            this.subnetOverrides = subnetOverrides;
            return this;
        }

        public Builder setSubnetOverrides(@Nullable List<SubnetOverrideArgs> subnetOverrides) {
            this.subnetOverrides = Input.ofNullable(subnetOverrides);
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

        public VirtualNetworkArgs build() {
            return new VirtualNetworkArgs(allowedSubnets, description, externalProviderResourceId, labName, location, name, resourceGroupName, subnetOverrides, tags);
        }
    }
}
