// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.inputs.FrontendIPConfigurationArgs;
import io.pulumi.azurenative.network.inputs.NetworkInterfaceIPConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNetworkTapArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkTapArgs Empty = new VirtualNetworkTapArgs();

    /**
     * The reference to the private IP address on the internal Load Balancer that will receive the tap.
     * 
     */
    @InputImport(name="destinationLoadBalancerFrontEndIPConfiguration")
    private final @Nullable Input<FrontendIPConfigurationArgs> destinationLoadBalancerFrontEndIPConfiguration;

    public Input<FrontendIPConfigurationArgs> getDestinationLoadBalancerFrontEndIPConfiguration() {
        return this.destinationLoadBalancerFrontEndIPConfiguration == null ? Input.empty() : this.destinationLoadBalancerFrontEndIPConfiguration;
    }

    /**
     * The reference to the private IP Address of the collector nic that will receive the tap.
     * 
     */
    @InputImport(name="destinationNetworkInterfaceIPConfiguration")
    private final @Nullable Input<NetworkInterfaceIPConfigurationArgs> destinationNetworkInterfaceIPConfiguration;

    public Input<NetworkInterfaceIPConfigurationArgs> getDestinationNetworkInterfaceIPConfiguration() {
        return this.destinationNetworkInterfaceIPConfiguration == null ? Input.empty() : this.destinationNetworkInterfaceIPConfiguration;
    }

    /**
     * The VXLAN destination port that will receive the tapped traffic.
     * 
     */
    @InputImport(name="destinationPort")
    private final @Nullable Input<Integer> destinationPort;

    public Input<Integer> getDestinationPort() {
        return this.destinationPort == null ? Input.empty() : this.destinationPort;
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

    /**
     * The name of the virtual network tap.
     * 
     */
    @InputImport(name="tapName")
    private final @Nullable Input<String> tapName;

    public Input<String> getTapName() {
        return this.tapName == null ? Input.empty() : this.tapName;
    }

    public VirtualNetworkTapArgs(
        @Nullable Input<FrontendIPConfigurationArgs> destinationLoadBalancerFrontEndIPConfiguration,
        @Nullable Input<NetworkInterfaceIPConfigurationArgs> destinationNetworkInterfaceIPConfiguration,
        @Nullable Input<Integer> destinationPort,
        @Nullable Input<String> id,
        @Nullable Input<String> location,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> tapName) {
        this.destinationLoadBalancerFrontEndIPConfiguration = destinationLoadBalancerFrontEndIPConfiguration;
        this.destinationNetworkInterfaceIPConfiguration = destinationNetworkInterfaceIPConfiguration;
        this.destinationPort = destinationPort;
        this.id = id;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.tapName = tapName;
    }

    private VirtualNetworkTapArgs() {
        this.destinationLoadBalancerFrontEndIPConfiguration = Input.empty();
        this.destinationNetworkInterfaceIPConfiguration = Input.empty();
        this.destinationPort = Input.empty();
        this.id = Input.empty();
        this.location = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
        this.tapName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkTapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<FrontendIPConfigurationArgs> destinationLoadBalancerFrontEndIPConfiguration;
        private @Nullable Input<NetworkInterfaceIPConfigurationArgs> destinationNetworkInterfaceIPConfiguration;
        private @Nullable Input<Integer> destinationPort;
        private @Nullable Input<String> id;
        private @Nullable Input<String> location;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> tapName;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkTapArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationLoadBalancerFrontEndIPConfiguration = defaults.destinationLoadBalancerFrontEndIPConfiguration;
    	      this.destinationNetworkInterfaceIPConfiguration = defaults.destinationNetworkInterfaceIPConfiguration;
    	      this.destinationPort = defaults.destinationPort;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.tapName = defaults.tapName;
        }

        public Builder setDestinationLoadBalancerFrontEndIPConfiguration(@Nullable Input<FrontendIPConfigurationArgs> destinationLoadBalancerFrontEndIPConfiguration) {
            this.destinationLoadBalancerFrontEndIPConfiguration = destinationLoadBalancerFrontEndIPConfiguration;
            return this;
        }

        public Builder setDestinationLoadBalancerFrontEndIPConfiguration(@Nullable FrontendIPConfigurationArgs destinationLoadBalancerFrontEndIPConfiguration) {
            this.destinationLoadBalancerFrontEndIPConfiguration = Input.ofNullable(destinationLoadBalancerFrontEndIPConfiguration);
            return this;
        }

        public Builder setDestinationNetworkInterfaceIPConfiguration(@Nullable Input<NetworkInterfaceIPConfigurationArgs> destinationNetworkInterfaceIPConfiguration) {
            this.destinationNetworkInterfaceIPConfiguration = destinationNetworkInterfaceIPConfiguration;
            return this;
        }

        public Builder setDestinationNetworkInterfaceIPConfiguration(@Nullable NetworkInterfaceIPConfigurationArgs destinationNetworkInterfaceIPConfiguration) {
            this.destinationNetworkInterfaceIPConfiguration = Input.ofNullable(destinationNetworkInterfaceIPConfiguration);
            return this;
        }

        public Builder setDestinationPort(@Nullable Input<Integer> destinationPort) {
            this.destinationPort = destinationPort;
            return this;
        }

        public Builder setDestinationPort(@Nullable Integer destinationPort) {
            this.destinationPort = Input.ofNullable(destinationPort);
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

        public Builder setTapName(@Nullable Input<String> tapName) {
            this.tapName = tapName;
            return this;
        }

        public Builder setTapName(@Nullable String tapName) {
            this.tapName = Input.ofNullable(tapName);
            return this;
        }

        public VirtualNetworkTapArgs build() {
            return new VirtualNetworkTapArgs(destinationLoadBalancerFrontEndIPConfiguration, destinationNetworkInterfaceIPConfiguration, destinationPort, id, location, resourceGroupName, tags, tapName);
        }
    }
}
