// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationsmanagement.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetManagementAssociationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetManagementAssociationArgs Empty = new GetManagementAssociationArgs();

    /**
     * User ManagementAssociation Name.
     * 
     */
    @Import(name="managementAssociationName", required=true)
      private final String managementAssociationName;

    public String getManagementAssociationName() {
        return this.managementAssociationName;
    }

    /**
     * Provider name for the parent resource.
     * 
     */
    @Import(name="providerName", required=true)
      private final String providerName;

    public String getProviderName() {
        return this.providerName;
    }

    /**
     * The name of the resource group to get. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Parent resource name.
     * 
     */
    @Import(name="resourceName", required=true)
      private final String resourceName;

    public String getPropResourceName() {
        return this.resourceName;
    }

    /**
     * Resource type for the parent resource
     * 
     */
    @Import(name="resourceType", required=true)
      private final String resourceType;

    public String getPropResourceType() {
        return this.resourceType;
    }

    public GetManagementAssociationArgs(
        String managementAssociationName,
        String providerName,
        String resourceGroupName,
        String resourceName,
        String resourceType) {
        this.managementAssociationName = Objects.requireNonNull(managementAssociationName, "expected parameter 'managementAssociationName' to be non-null");
        this.providerName = Objects.requireNonNull(providerName, "expected parameter 'providerName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
        this.resourceType = Objects.requireNonNull(resourceType, "expected parameter 'resourceType' to be non-null");
    }

    private GetManagementAssociationArgs() {
        this.managementAssociationName = null;
        this.providerName = null;
        this.resourceGroupName = null;
        this.resourceName = null;
        this.resourceType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetManagementAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String managementAssociationName;
        private String providerName;
        private String resourceGroupName;
        private String resourceName;
        private String resourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetManagementAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.managementAssociationName = defaults.managementAssociationName;
    	      this.providerName = defaults.providerName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
    	      this.resourceType = defaults.resourceType;
        }

        public Builder managementAssociationName(String managementAssociationName) {
            this.managementAssociationName = Objects.requireNonNull(managementAssociationName);
            return this;
        }

        public Builder providerName(String providerName) {
            this.providerName = Objects.requireNonNull(providerName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceName(String resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }

        public Builder resourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }
        public GetManagementAssociationArgs build() {
            return new GetManagementAssociationArgs(managementAssociationName, providerName, resourceGroupName, resourceName, resourceType);
        }
    }
}
