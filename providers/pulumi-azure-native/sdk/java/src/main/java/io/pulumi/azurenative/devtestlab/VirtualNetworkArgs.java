// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab;

import io.pulumi.azurenative.devtestlab.inputs.SubnetArgs;
import io.pulumi.azurenative.devtestlab.inputs.SubnetOverrideArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="allowedSubnets")
      private final @Nullable Output<List<SubnetArgs>> allowedSubnets;

    public Output<List<SubnetArgs>> getAllowedSubnets() {
        return this.allowedSubnets == null ? Output.empty() : this.allowedSubnets;
    }

    /**
     * The description of the virtual network.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The Microsoft.Network resource identifier of the virtual network.
     * 
     */
    @Import(name="externalProviderResourceId")
      private final @Nullable Output<String> externalProviderResourceId;

    public Output<String> getExternalProviderResourceId() {
        return this.externalProviderResourceId == null ? Output.empty() : this.externalProviderResourceId;
    }

    /**
     * The name of the lab.
     * 
     */
    @Import(name="labName", required=true)
      private final Output<String> labName;

    public Output<String> getLabName() {
        return this.labName;
    }

    /**
     * The location of the resource.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The name of the virtual network.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
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
     * The subnet overrides of the virtual network.
     * 
     */
    @Import(name="subnetOverrides")
      private final @Nullable Output<List<SubnetOverrideArgs>> subnetOverrides;

    public Output<List<SubnetOverrideArgs>> getSubnetOverrides() {
        return this.subnetOverrides == null ? Output.empty() : this.subnetOverrides;
    }

    /**
     * The tags of the resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public VirtualNetworkArgs(
        @Nullable Output<List<SubnetArgs>> allowedSubnets,
        @Nullable Output<String> description,
        @Nullable Output<String> externalProviderResourceId,
        Output<String> labName,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        Output<String> resourceGroupName,
        @Nullable Output<List<SubnetOverrideArgs>> subnetOverrides,
        @Nullable Output<Map<String,String>> tags) {
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
        this.allowedSubnets = Output.empty();
        this.description = Output.empty();
        this.externalProviderResourceId = Output.empty();
        this.labName = Output.empty();
        this.location = Output.empty();
        this.name = Output.empty();
        this.resourceGroupName = Output.empty();
        this.subnetOverrides = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<SubnetArgs>> allowedSubnets;
        private @Nullable Output<String> description;
        private @Nullable Output<String> externalProviderResourceId;
        private Output<String> labName;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private Output<String> resourceGroupName;
        private @Nullable Output<List<SubnetOverrideArgs>> subnetOverrides;
        private @Nullable Output<Map<String,String>> tags;

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

        public Builder allowedSubnets(@Nullable Output<List<SubnetArgs>> allowedSubnets) {
            this.allowedSubnets = allowedSubnets;
            return this;
        }

        public Builder allowedSubnets(@Nullable List<SubnetArgs> allowedSubnets) {
            this.allowedSubnets = Output.ofNullable(allowedSubnets);
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder externalProviderResourceId(@Nullable Output<String> externalProviderResourceId) {
            this.externalProviderResourceId = externalProviderResourceId;
            return this;
        }

        public Builder externalProviderResourceId(@Nullable String externalProviderResourceId) {
            this.externalProviderResourceId = Output.ofNullable(externalProviderResourceId);
            return this;
        }

        public Builder labName(Output<String> labName) {
            this.labName = Objects.requireNonNull(labName);
            return this;
        }

        public Builder labName(String labName) {
            this.labName = Output.of(Objects.requireNonNull(labName));
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

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
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

        public Builder subnetOverrides(@Nullable Output<List<SubnetOverrideArgs>> subnetOverrides) {
            this.subnetOverrides = subnetOverrides;
            return this;
        }

        public Builder subnetOverrides(@Nullable List<SubnetOverrideArgs> subnetOverrides) {
            this.subnetOverrides = Output.ofNullable(subnetOverrides);
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
        public VirtualNetworkArgs build() {
            return new VirtualNetworkArgs(allowedSubnets, description, externalProviderResourceId, labName, location, name, resourceGroupName, subnetOverrides, tags);
        }
    }
}
