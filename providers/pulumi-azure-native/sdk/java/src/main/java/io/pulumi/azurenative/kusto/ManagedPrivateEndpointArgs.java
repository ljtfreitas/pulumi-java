// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedPrivateEndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedPrivateEndpointArgs Empty = new ManagedPrivateEndpointArgs();

    /**
     * The name of the Kusto cluster.
     * 
     */
    @InputImport(name="clusterName", required=true)
    private final Input<String> clusterName;

    public Input<String> getClusterName() {
        return this.clusterName;
    }

    /**
     * The groupId in which the managed private endpoint is created.
     * 
     */
    @InputImport(name="groupId", required=true)
    private final Input<String> groupId;

    public Input<String> getGroupId() {
        return this.groupId;
    }

    /**
     * The name of the managed private endpoint.
     * 
     */
    @InputImport(name="managedPrivateEndpointName")
    private final @Nullable Input<String> managedPrivateEndpointName;

    public Input<String> getManagedPrivateEndpointName() {
        return this.managedPrivateEndpointName == null ? Input.empty() : this.managedPrivateEndpointName;
    }

    /**
     * The ARM resource ID of the resource for which the managed private endpoint is created.
     * 
     */
    @InputImport(name="privateLinkResourceId", required=true)
    private final Input<String> privateLinkResourceId;

    public Input<String> getPrivateLinkResourceId() {
        return this.privateLinkResourceId;
    }

    /**
     * The region of the resource to which the managed private endpoint is created.
     * 
     */
    @InputImport(name="privateLinkResourceRegion")
    private final @Nullable Input<String> privateLinkResourceRegion;

    public Input<String> getPrivateLinkResourceRegion() {
        return this.privateLinkResourceRegion == null ? Input.empty() : this.privateLinkResourceRegion;
    }

    /**
     * The user request message.
     * 
     */
    @InputImport(name="requestMessage")
    private final @Nullable Input<String> requestMessage;

    public Input<String> getRequestMessage() {
        return this.requestMessage == null ? Input.empty() : this.requestMessage;
    }

    /**
     * The name of the resource group containing the Kusto cluster.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public ManagedPrivateEndpointArgs(
        Input<String> clusterName,
        Input<String> groupId,
        @Nullable Input<String> managedPrivateEndpointName,
        Input<String> privateLinkResourceId,
        @Nullable Input<String> privateLinkResourceRegion,
        @Nullable Input<String> requestMessage,
        Input<String> resourceGroupName) {
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.groupId = Objects.requireNonNull(groupId, "expected parameter 'groupId' to be non-null");
        this.managedPrivateEndpointName = managedPrivateEndpointName;
        this.privateLinkResourceId = Objects.requireNonNull(privateLinkResourceId, "expected parameter 'privateLinkResourceId' to be non-null");
        this.privateLinkResourceRegion = privateLinkResourceRegion;
        this.requestMessage = requestMessage;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private ManagedPrivateEndpointArgs() {
        this.clusterName = Input.empty();
        this.groupId = Input.empty();
        this.managedPrivateEndpointName = Input.empty();
        this.privateLinkResourceId = Input.empty();
        this.privateLinkResourceRegion = Input.empty();
        this.requestMessage = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedPrivateEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> clusterName;
        private Input<String> groupId;
        private @Nullable Input<String> managedPrivateEndpointName;
        private Input<String> privateLinkResourceId;
        private @Nullable Input<String> privateLinkResourceRegion;
        private @Nullable Input<String> requestMessage;
        private Input<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedPrivateEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.groupId = defaults.groupId;
    	      this.managedPrivateEndpointName = defaults.managedPrivateEndpointName;
    	      this.privateLinkResourceId = defaults.privateLinkResourceId;
    	      this.privateLinkResourceRegion = defaults.privateLinkResourceRegion;
    	      this.requestMessage = defaults.requestMessage;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setClusterName(Input<String> clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }

        public Builder setClusterName(String clusterName) {
            this.clusterName = Input.of(Objects.requireNonNull(clusterName));
            return this;
        }

        public Builder setGroupId(Input<String> groupId) {
            this.groupId = Objects.requireNonNull(groupId);
            return this;
        }

        public Builder setGroupId(String groupId) {
            this.groupId = Input.of(Objects.requireNonNull(groupId));
            return this;
        }

        public Builder setManagedPrivateEndpointName(@Nullable Input<String> managedPrivateEndpointName) {
            this.managedPrivateEndpointName = managedPrivateEndpointName;
            return this;
        }

        public Builder setManagedPrivateEndpointName(@Nullable String managedPrivateEndpointName) {
            this.managedPrivateEndpointName = Input.ofNullable(managedPrivateEndpointName);
            return this;
        }

        public Builder setPrivateLinkResourceId(Input<String> privateLinkResourceId) {
            this.privateLinkResourceId = Objects.requireNonNull(privateLinkResourceId);
            return this;
        }

        public Builder setPrivateLinkResourceId(String privateLinkResourceId) {
            this.privateLinkResourceId = Input.of(Objects.requireNonNull(privateLinkResourceId));
            return this;
        }

        public Builder setPrivateLinkResourceRegion(@Nullable Input<String> privateLinkResourceRegion) {
            this.privateLinkResourceRegion = privateLinkResourceRegion;
            return this;
        }

        public Builder setPrivateLinkResourceRegion(@Nullable String privateLinkResourceRegion) {
            this.privateLinkResourceRegion = Input.ofNullable(privateLinkResourceRegion);
            return this;
        }

        public Builder setRequestMessage(@Nullable Input<String> requestMessage) {
            this.requestMessage = requestMessage;
            return this;
        }

        public Builder setRequestMessage(@Nullable String requestMessage) {
            this.requestMessage = Input.ofNullable(requestMessage);
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

        public ManagedPrivateEndpointArgs build() {
            return new ManagedPrivateEndpointArgs(clusterName, groupId, managedPrivateEndpointName, privateLinkResourceId, privateLinkResourceRegion, requestMessage, resourceGroupName);
        }
    }
}
