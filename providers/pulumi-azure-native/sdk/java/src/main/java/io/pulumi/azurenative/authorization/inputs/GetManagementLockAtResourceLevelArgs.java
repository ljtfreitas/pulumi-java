// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetManagementLockAtResourceLevelArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetManagementLockAtResourceLevelArgs Empty = new GetManagementLockAtResourceLevelArgs();

    /**
     * The name of lock.
     * 
     */
    @InputImport(name="lockName", required=true)
    private final String lockName;

    public String getLockName() {
        return this.lockName;
    }

    /**
     * An extra path parameter needed in some services, like SQL Databases.
     * 
     */
    @InputImport(name="parentResourcePath", required=true)
    private final String parentResourcePath;

    public String getParentResourcePath() {
        return this.parentResourcePath;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the resource.
     * 
     */
    @InputImport(name="resourceName", required=true)
    private final String resourceName;

    public String getPropResourceName() {
        return this.resourceName;
    }

    /**
     * The namespace of the resource provider.
     * 
     */
    @InputImport(name="resourceProviderNamespace", required=true)
    private final String resourceProviderNamespace;

    public String getResourceProviderNamespace() {
        return this.resourceProviderNamespace;
    }

    /**
     * The type of the resource.
     * 
     */
    @InputImport(name="resourceType", required=true)
    private final String resourceType;

    public String getPropResourceType() {
        return this.resourceType;
    }

    public GetManagementLockAtResourceLevelArgs(
        String lockName,
        String parentResourcePath,
        String resourceGroupName,
        String resourceName,
        String resourceProviderNamespace,
        String resourceType) {
        this.lockName = Objects.requireNonNull(lockName, "expected parameter 'lockName' to be non-null");
        this.parentResourcePath = Objects.requireNonNull(parentResourcePath, "expected parameter 'parentResourcePath' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
        this.resourceProviderNamespace = Objects.requireNonNull(resourceProviderNamespace, "expected parameter 'resourceProviderNamespace' to be non-null");
        this.resourceType = Objects.requireNonNull(resourceType, "expected parameter 'resourceType' to be non-null");
    }

    private GetManagementLockAtResourceLevelArgs() {
        this.lockName = null;
        this.parentResourcePath = null;
        this.resourceGroupName = null;
        this.resourceName = null;
        this.resourceProviderNamespace = null;
        this.resourceType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetManagementLockAtResourceLevelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String lockName;
        private String parentResourcePath;
        private String resourceGroupName;
        private String resourceName;
        private String resourceProviderNamespace;
        private String resourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetManagementLockAtResourceLevelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lockName = defaults.lockName;
    	      this.parentResourcePath = defaults.parentResourcePath;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
    	      this.resourceProviderNamespace = defaults.resourceProviderNamespace;
    	      this.resourceType = defaults.resourceType;
        }

        public Builder setLockName(String lockName) {
            this.lockName = Objects.requireNonNull(lockName);
            return this;
        }

        public Builder setParentResourcePath(String parentResourcePath) {
            this.parentResourcePath = Objects.requireNonNull(parentResourcePath);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceName(String resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }

        public Builder setResourceProviderNamespace(String resourceProviderNamespace) {
            this.resourceProviderNamespace = Objects.requireNonNull(resourceProviderNamespace);
            return this;
        }

        public Builder setResourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }

        public GetManagementLockAtResourceLevelArgs build() {
            return new GetManagementLockAtResourceLevelArgs(lockName, parentResourcePath, resourceGroupName, resourceName, resourceProviderNamespace, resourceType);
        }
    }
}
