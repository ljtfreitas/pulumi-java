// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetes;

import io.pulumi.azurenative.kubernetes.enums.ProvisioningState;
import io.pulumi.azurenative.kubernetes.inputs.ConnectedClusterIdentityArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectedClusterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectedClusterArgs Empty = new ConnectedClusterArgs();

    /**
     * Base64 encoded public certificate used by the agent to do the initial handshake to the backend services in Azure.
     * 
     */
    @InputImport(name="agentPublicKeyCertificate", required=true)
    private final Input<String> agentPublicKeyCertificate;

    public Input<String> getAgentPublicKeyCertificate() {
        return this.agentPublicKeyCertificate;
    }

    /**
     * The name of the Kubernetes cluster on which get is called.
     * 
     */
    @InputImport(name="clusterName")
    private final @Nullable Input<String> clusterName;

    public Input<String> getClusterName() {
        return this.clusterName == null ? Input.empty() : this.clusterName;
    }

    /**
     * The Kubernetes distribution running on this connected cluster.
     * 
     */
    @InputImport(name="distribution")
    private final @Nullable Input<String> distribution;

    public Input<String> getDistribution() {
        return this.distribution == null ? Input.empty() : this.distribution;
    }

    /**
     * The identity of the connected cluster.
     * 
     */
    @InputImport(name="identity", required=true)
    private final Input<ConnectedClusterIdentityArgs> identity;

    public Input<ConnectedClusterIdentityArgs> getIdentity() {
        return this.identity;
    }

    /**
     * The infrastructure on which the Kubernetes cluster represented by this connected cluster is running on.
     * 
     */
    @InputImport(name="infrastructure")
    private final @Nullable Input<String> infrastructure;

    public Input<String> getInfrastructure() {
        return this.infrastructure == null ? Input.empty() : this.infrastructure;
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Provisioning state of the connected cluster resource.
     * 
     */
    @InputImport(name="provisioningState")
    private final @Nullable Input<Either<String,ProvisioningState>> provisioningState;

    public Input<Either<String,ProvisioningState>> getProvisioningState() {
        return this.provisioningState == null ? Input.empty() : this.provisioningState;
    }

    /**
     * The name of the resource group. The name is case insensitive.
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

    public ConnectedClusterArgs(
        Input<String> agentPublicKeyCertificate,
        @Nullable Input<String> clusterName,
        @Nullable Input<String> distribution,
        Input<ConnectedClusterIdentityArgs> identity,
        @Nullable Input<String> infrastructure,
        @Nullable Input<String> location,
        @Nullable Input<Either<String,ProvisioningState>> provisioningState,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags) {
        this.agentPublicKeyCertificate = Objects.requireNonNull(agentPublicKeyCertificate, "expected parameter 'agentPublicKeyCertificate' to be non-null");
        this.clusterName = clusterName;
        this.distribution = distribution;
        this.identity = Objects.requireNonNull(identity, "expected parameter 'identity' to be non-null");
        this.infrastructure = infrastructure;
        this.location = location;
        this.provisioningState = provisioningState;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private ConnectedClusterArgs() {
        this.agentPublicKeyCertificate = Input.empty();
        this.clusterName = Input.empty();
        this.distribution = Input.empty();
        this.identity = Input.empty();
        this.infrastructure = Input.empty();
        this.location = Input.empty();
        this.provisioningState = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectedClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> agentPublicKeyCertificate;
        private @Nullable Input<String> clusterName;
        private @Nullable Input<String> distribution;
        private Input<ConnectedClusterIdentityArgs> identity;
        private @Nullable Input<String> infrastructure;
        private @Nullable Input<String> location;
        private @Nullable Input<Either<String,ProvisioningState>> provisioningState;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectedClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentPublicKeyCertificate = defaults.agentPublicKeyCertificate;
    	      this.clusterName = defaults.clusterName;
    	      this.distribution = defaults.distribution;
    	      this.identity = defaults.identity;
    	      this.infrastructure = defaults.infrastructure;
    	      this.location = defaults.location;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder setAgentPublicKeyCertificate(Input<String> agentPublicKeyCertificate) {
            this.agentPublicKeyCertificate = Objects.requireNonNull(agentPublicKeyCertificate);
            return this;
        }

        public Builder setAgentPublicKeyCertificate(String agentPublicKeyCertificate) {
            this.agentPublicKeyCertificate = Input.of(Objects.requireNonNull(agentPublicKeyCertificate));
            return this;
        }

        public Builder setClusterName(@Nullable Input<String> clusterName) {
            this.clusterName = clusterName;
            return this;
        }

        public Builder setClusterName(@Nullable String clusterName) {
            this.clusterName = Input.ofNullable(clusterName);
            return this;
        }

        public Builder setDistribution(@Nullable Input<String> distribution) {
            this.distribution = distribution;
            return this;
        }

        public Builder setDistribution(@Nullable String distribution) {
            this.distribution = Input.ofNullable(distribution);
            return this;
        }

        public Builder setIdentity(Input<ConnectedClusterIdentityArgs> identity) {
            this.identity = Objects.requireNonNull(identity);
            return this;
        }

        public Builder setIdentity(ConnectedClusterIdentityArgs identity) {
            this.identity = Input.of(Objects.requireNonNull(identity));
            return this;
        }

        public Builder setInfrastructure(@Nullable Input<String> infrastructure) {
            this.infrastructure = infrastructure;
            return this;
        }

        public Builder setInfrastructure(@Nullable String infrastructure) {
            this.infrastructure = Input.ofNullable(infrastructure);
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

        public Builder setProvisioningState(@Nullable Input<Either<String,ProvisioningState>> provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder setProvisioningState(@Nullable Either<String,ProvisioningState> provisioningState) {
            this.provisioningState = Input.ofNullable(provisioningState);
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

        public ConnectedClusterArgs build() {
            return new ConnectedClusterArgs(agentPublicKeyCertificate, clusterName, distribution, identity, infrastructure, location, provisioningState, resourceGroupName, tags);
        }
    }
}
