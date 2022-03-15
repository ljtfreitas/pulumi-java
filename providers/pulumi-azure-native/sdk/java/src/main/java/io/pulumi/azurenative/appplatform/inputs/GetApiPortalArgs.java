// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetApiPortalArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetApiPortalArgs Empty = new GetApiPortalArgs();

    /**
     * The name of API portal.
     * 
     */
    @Import(name="apiPortalName", required=true)
      private final String apiPortalName;

    public String getApiPortalName() {
        return this.apiPortalName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Service resource.
     * 
     */
    @Import(name="serviceName", required=true)
      private final String serviceName;

    public String getServiceName() {
        return this.serviceName;
    }

    public GetApiPortalArgs(
        String apiPortalName,
        String resourceGroupName,
        String serviceName) {
        this.apiPortalName = Objects.requireNonNull(apiPortalName, "expected parameter 'apiPortalName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private GetApiPortalArgs() {
        this.apiPortalName = null;
        this.resourceGroupName = null;
        this.serviceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApiPortalArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiPortalName;
        private String resourceGroupName;
        private String serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApiPortalArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiPortalName = defaults.apiPortalName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder apiPortalName(String apiPortalName) {
            this.apiPortalName = Objects.requireNonNull(apiPortalName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public GetApiPortalArgs build() {
            return new GetApiPortalArgs(apiPortalName, resourceGroupName, serviceName);
        }
    }
}
