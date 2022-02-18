// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAppArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAppArgs Empty = new GetAppArgs();

    /**
     * The name of the App resource.
     * 
     */
    @InputImport(name="appName", required=true)
    private final String appName;

    public String getAppName() {
        return this.appName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Service resource.
     * 
     */
    @InputImport(name="serviceName", required=true)
    private final String serviceName;

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * Indicates whether sync status
     * 
     */
    @InputImport(name="syncStatus")
    private final @Nullable String syncStatus;

    public Optional<String> getSyncStatus() {
        return this.syncStatus == null ? Optional.empty() : Optional.ofNullable(this.syncStatus);
    }

    public GetAppArgs(
        String appName,
        String resourceGroupName,
        String serviceName,
        @Nullable String syncStatus) {
        this.appName = Objects.requireNonNull(appName, "expected parameter 'appName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.syncStatus = syncStatus;
    }

    private GetAppArgs() {
        this.appName = null;
        this.resourceGroupName = null;
        this.serviceName = null;
        this.syncStatus = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appName;
        private String resourceGroupName;
        private String serviceName;
        private @Nullable String syncStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAppArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appName = defaults.appName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
    	      this.syncStatus = defaults.syncStatus;
        }

        public Builder setAppName(String appName) {
            this.appName = Objects.requireNonNull(appName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder setSyncStatus(@Nullable String syncStatus) {
            this.syncStatus = syncStatus;
            return this;
        }

        public GetAppArgs build() {
            return new GetAppArgs(appName, resourceGroupName, serviceName, syncStatus);
        }
    }
}
