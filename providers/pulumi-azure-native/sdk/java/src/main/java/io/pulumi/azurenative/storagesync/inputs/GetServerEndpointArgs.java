// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagesync.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetServerEndpointArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetServerEndpointArgs Empty = new GetServerEndpointArgs();

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of Server Endpoint object.
     * 
     */
    @InputImport(name="serverEndpointName", required=true)
    private final String serverEndpointName;

    public String getServerEndpointName() {
        return this.serverEndpointName;
    }

    /**
     * Name of Storage Sync Service resource.
     * 
     */
    @InputImport(name="storageSyncServiceName", required=true)
    private final String storageSyncServiceName;

    public String getStorageSyncServiceName() {
        return this.storageSyncServiceName;
    }

    /**
     * Name of Sync Group resource.
     * 
     */
    @InputImport(name="syncGroupName", required=true)
    private final String syncGroupName;

    public String getSyncGroupName() {
        return this.syncGroupName;
    }

    public GetServerEndpointArgs(
        String resourceGroupName,
        String serverEndpointName,
        String storageSyncServiceName,
        String syncGroupName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serverEndpointName = Objects.requireNonNull(serverEndpointName, "expected parameter 'serverEndpointName' to be non-null");
        this.storageSyncServiceName = Objects.requireNonNull(storageSyncServiceName, "expected parameter 'storageSyncServiceName' to be non-null");
        this.syncGroupName = Objects.requireNonNull(syncGroupName, "expected parameter 'syncGroupName' to be non-null");
    }

    private GetServerEndpointArgs() {
        this.resourceGroupName = null;
        this.serverEndpointName = null;
        this.storageSyncServiceName = null;
        this.syncGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String serverEndpointName;
        private String storageSyncServiceName;
        private String syncGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServerEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serverEndpointName = defaults.serverEndpointName;
    	      this.storageSyncServiceName = defaults.storageSyncServiceName;
    	      this.syncGroupName = defaults.syncGroupName;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setServerEndpointName(String serverEndpointName) {
            this.serverEndpointName = Objects.requireNonNull(serverEndpointName);
            return this;
        }

        public Builder setStorageSyncServiceName(String storageSyncServiceName) {
            this.storageSyncServiceName = Objects.requireNonNull(storageSyncServiceName);
            return this;
        }

        public Builder setSyncGroupName(String syncGroupName) {
            this.syncGroupName = Objects.requireNonNull(syncGroupName);
            return this;
        }

        public GetServerEndpointArgs build() {
            return new GetServerEndpointArgs(resourceGroupName, serverEndpointName, storageSyncServiceName, syncGroupName);
        }
    }
}
