// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicebus;

import io.pulumi.azurenative.servicebus.enums.EndPointProvisioningState;
import io.pulumi.azurenative.servicebus.inputs.ConnectionStateArgs;
import io.pulumi.azurenative.servicebus.inputs.PrivateEndpointArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PrivateEndpointConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateEndpointConnectionArgs Empty = new PrivateEndpointConnectionArgs();

    /**
     * The namespace name
     * 
     */
    @Import(name="namespaceName", required=true)
      private final Output<String> namespaceName;

    public Output<String> getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * The Private Endpoint resource for this Connection.
     * 
     */
    @Import(name="privateEndpoint")
      private final @Nullable Output<PrivateEndpointArgs> privateEndpoint;

    public Output<PrivateEndpointArgs> getPrivateEndpoint() {
        return this.privateEndpoint == null ? Output.empty() : this.privateEndpoint;
    }

    /**
     * The PrivateEndpointConnection name
     * 
     */
    @Import(name="privateEndpointConnectionName")
      private final @Nullable Output<String> privateEndpointConnectionName;

    public Output<String> getPrivateEndpointConnectionName() {
        return this.privateEndpointConnectionName == null ? Output.empty() : this.privateEndpointConnectionName;
    }

    /**
     * Details about the state of the connection.
     * 
     */
    @Import(name="privateLinkServiceConnectionState")
      private final @Nullable Output<ConnectionStateArgs> privateLinkServiceConnectionState;

    public Output<ConnectionStateArgs> getPrivateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState == null ? Output.empty() : this.privateLinkServiceConnectionState;
    }

    /**
     * Provisioning state of the Private Endpoint Connection.
     * 
     */
    @Import(name="provisioningState")
      private final @Nullable Output<Either<String,EndPointProvisioningState>> provisioningState;

    public Output<Either<String,EndPointProvisioningState>> getProvisioningState() {
        return this.provisioningState == null ? Output.empty() : this.provisioningState;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public PrivateEndpointConnectionArgs(
        Output<String> namespaceName,
        @Nullable Output<PrivateEndpointArgs> privateEndpoint,
        @Nullable Output<String> privateEndpointConnectionName,
        @Nullable Output<ConnectionStateArgs> privateLinkServiceConnectionState,
        @Nullable Output<Either<String,EndPointProvisioningState>> provisioningState,
        Output<String> resourceGroupName) {
        this.namespaceName = Objects.requireNonNull(namespaceName, "expected parameter 'namespaceName' to be non-null");
        this.privateEndpoint = privateEndpoint;
        this.privateEndpointConnectionName = privateEndpointConnectionName;
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        this.provisioningState = provisioningState;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private PrivateEndpointConnectionArgs() {
        this.namespaceName = Output.empty();
        this.privateEndpoint = Output.empty();
        this.privateEndpointConnectionName = Output.empty();
        this.privateLinkServiceConnectionState = Output.empty();
        this.provisioningState = Output.empty();
        this.resourceGroupName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> namespaceName;
        private @Nullable Output<PrivateEndpointArgs> privateEndpoint;
        private @Nullable Output<String> privateEndpointConnectionName;
        private @Nullable Output<ConnectionStateArgs> privateLinkServiceConnectionState;
        private @Nullable Output<Either<String,EndPointProvisioningState>> provisioningState;
        private Output<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namespaceName = defaults.namespaceName;
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.privateEndpointConnectionName = defaults.privateEndpointConnectionName;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder namespaceName(Output<String> namespaceName) {
            this.namespaceName = Objects.requireNonNull(namespaceName);
            return this;
        }

        public Builder namespaceName(String namespaceName) {
            this.namespaceName = Output.of(Objects.requireNonNull(namespaceName));
            return this;
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

        public Builder privateLinkServiceConnectionState(@Nullable Output<ConnectionStateArgs> privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        public Builder privateLinkServiceConnectionState(@Nullable ConnectionStateArgs privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = Output.ofNullable(privateLinkServiceConnectionState);
            return this;
        }

        public Builder provisioningState(@Nullable Output<Either<String,EndPointProvisioningState>> provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder provisioningState(@Nullable Either<String,EndPointProvisioningState> provisioningState) {
            this.provisioningState = Output.ofNullable(provisioningState);
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
            return new PrivateEndpointConnectionArgs(namespaceName, privateEndpoint, privateEndpointConnectionName, privateLinkServiceConnectionState, provisioningState, resourceGroupName);
        }
    }
}
