// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.inputs.BastionHostIPConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BastionHostArgs extends io.pulumi.resources.ResourceArgs {

    public static final BastionHostArgs Empty = new BastionHostArgs();

    /**
     * The name of the Bastion Host.
     * 
     */
    @InputImport(name="bastionHostName")
        private final @Nullable Input<String> bastionHostName;

    public Input<String> getBastionHostName() {
        return this.bastionHostName == null ? Input.empty() : this.bastionHostName;
    }

    /**
     * FQDN for the endpoint on which bastion host is accessible.
     * 
     */
    @InputImport(name="dnsName")
        private final @Nullable Input<String> dnsName;

    public Input<String> getDnsName() {
        return this.dnsName == null ? Input.empty() : this.dnsName;
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
        private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * IP configuration of the Bastion Host resource.
     * 
     */
    @InputImport(name="ipConfigurations")
        private final @Nullable Input<List<BastionHostIPConfigurationArgs>> ipConfigurations;

    public Input<List<BastionHostIPConfigurationArgs>> getIpConfigurations() {
        return this.ipConfigurations == null ? Input.empty() : this.ipConfigurations;
    }

    /**
     * Resource location.
     * 
     */
    @InputImport(name="location")
        private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
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
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
        private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public BastionHostArgs(
        @Nullable Input<String> bastionHostName,
        @Nullable Input<String> dnsName,
        @Nullable Input<String> id,
        @Nullable Input<List<BastionHostIPConfigurationArgs>> ipConfigurations,
        @Nullable Input<String> location,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags) {
        this.bastionHostName = bastionHostName;
        this.dnsName = dnsName;
        this.id = id;
        this.ipConfigurations = ipConfigurations;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private BastionHostArgs() {
        this.bastionHostName = Input.empty();
        this.dnsName = Input.empty();
        this.id = Input.empty();
        this.ipConfigurations = Input.empty();
        this.location = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BastionHostArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> bastionHostName;
        private @Nullable Input<String> dnsName;
        private @Nullable Input<String> id;
        private @Nullable Input<List<BastionHostIPConfigurationArgs>> ipConfigurations;
        private @Nullable Input<String> location;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(BastionHostArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bastionHostName = defaults.bastionHostName;
    	      this.dnsName = defaults.dnsName;
    	      this.id = defaults.id;
    	      this.ipConfigurations = defaults.ipConfigurations;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder setBastionHostName(@Nullable Input<String> bastionHostName) {
            this.bastionHostName = bastionHostName;
            return this;
        }

        public Builder setBastionHostName(@Nullable String bastionHostName) {
            this.bastionHostName = Input.ofNullable(bastionHostName);
            return this;
        }

        public Builder setDnsName(@Nullable Input<String> dnsName) {
            this.dnsName = dnsName;
            return this;
        }

        public Builder setDnsName(@Nullable String dnsName) {
            this.dnsName = Input.ofNullable(dnsName);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setIpConfigurations(@Nullable Input<List<BastionHostIPConfigurationArgs>> ipConfigurations) {
            this.ipConfigurations = ipConfigurations;
            return this;
        }

        public Builder setIpConfigurations(@Nullable List<BastionHostIPConfigurationArgs> ipConfigurations) {
            this.ipConfigurations = Input.ofNullable(ipConfigurations);
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

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
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
        public BastionHostArgs build() {
            return new BastionHostArgs(bastionHostName, dnsName, id, ipConfigurations, location, resourceGroupName, tags);
        }
    }
}
