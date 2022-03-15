// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry;

import io.pulumi.azurenative.containerregistry.inputs.PrivateEndpointArgs;
import io.pulumi.azurenative.containerregistry.inputs.PrivateLinkServiceConnectionStateArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PrivateEndpointConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateEndpointConnectionArgs Empty = new PrivateEndpointConnectionArgs();

    /**
     * The resource of private endpoint.
     * 
     */
    @Import(name="privateEndpoint")
      private final @Nullable Output<PrivateEndpointArgs> privateEndpoint;

    public Output<PrivateEndpointArgs> getPrivateEndpoint() {
        return this.privateEndpoint == null ? Output.empty() : this.privateEndpoint;
    }

    /**
     * The name of the private endpoint connection.
     * 
     */
    @Import(name="privateEndpointConnectionName")
      private final @Nullable Output<String> privateEndpointConnectionName;

    public Output<String> getPrivateEndpointConnectionName() {
        return this.privateEndpointConnectionName == null ? Output.empty() : this.privateEndpointConnectionName;
    }

    /**
     * A collection of information about the state of the connection between service consumer and provider.
     * 
     */
    @Import(name="privateLinkServiceConnectionState")
      private final @Nullable Output<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState;

    public Output<PrivateLinkServiceConnectionStateArgs> getPrivateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState == null ? Output.empty() : this.privateLinkServiceConnectionState;
    }

    /**
     * The name of the container registry.
     * 
     */
    @Import(name="registryName", required=true)
      private final Output<String> registryName;

    public Output<String> getRegistryName() {
        return this.registryName;
    }

    /**
     * The name of the resource group to which the container registry belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public PrivateEndpointConnectionArgs(
        @Nullable Output<PrivateEndpointArgs> privateEndpoint,
        @Nullable Output<String> privateEndpointConnectionName,
        @Nullable Output<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState,
        Output<String> registryName,
        Output<String> resourceGroupName) {
        this.privateEndpoint = privateEndpoint;
        this.privateEndpointConnectionName = privateEndpointConnectionName;
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        this.registryName = Objects.requireNonNull(registryName, "expected parameter 'registryName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private PrivateEndpointConnectionArgs() {
        this.privateEndpoint = Output.empty();
        this.privateEndpointConnectionName = Output.empty();
        this.privateLinkServiceConnectionState = Output.empty();
        this.registryName = Output.empty();
        this.resourceGroupName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<PrivateEndpointArgs> privateEndpoint;
        private @Nullable Output<String> privateEndpointConnectionName;
        private @Nullable Output<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState;
        private Output<String> registryName;
        private Output<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.privateEndpointConnectionName = defaults.privateEndpointConnectionName;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.registryName = defaults.registryName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder privateEndpoint(@Nullable Output<PrivateEndpointArgs> privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            return this;
        }

        public Builder privateEndpoint(@Nullable PrivateEndpointArgs privateEndpoint) {
            this.privateEndpoint = Output.ofNullable(privateEndpoint);
            return this;
        }

        public Builder privateEndpointConnectionName(@Nullable Output<String> privateEndpointConnectionName) {
            this.privateEndpointConnectionName = privateEndpointConnectionName;
            return this;
        }

        public Builder privateEndpointConnectionName(@Nullable String privateEndpointConnectionName) {
            this.privateEndpointConnectionName = Output.ofNullable(privateEndpointConnectionName);
            return this;
        }

        public Builder privateLinkServiceConnectionState(@Nullable Output<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        public Builder privateLinkServiceConnectionState(@Nullable PrivateLinkServiceConnectionStateArgs privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = Output.ofNullable(privateLinkServiceConnectionState);
            return this;
        }

        public Builder registryName(Output<String> registryName) {
            this.registryName = Objects.requireNonNull(registryName);
            return this;
        }

        public Builder registryName(String registryName) {
            this.registryName = Output.of(Objects.requireNonNull(registryName));
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
        public PrivateEndpointConnectionArgs build() {
            return new PrivateEndpointConnectionArgs(privateEndpoint, privateEndpointConnectionName, privateLinkServiceConnectionState, registryName, resourceGroupName);
        }
    }
}
