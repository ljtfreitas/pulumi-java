// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetApiSchemaArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetApiSchemaArgs Empty = new GetApiSchemaArgs();

    /**
     * API revision identifier. Must be unique in the current API Management service instance. Non-current revision has ;rev=n as a suffix where n is the revision number.
     * 
     */
    @InputImport(name="apiId", required=true)
    private final String apiId;

    public String getApiId() {
        return this.apiId;
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
     * Schema identifier within an API. Must be unique in the current API Management service instance.
     * 
     */
    @InputImport(name="schemaId", required=true)
    private final String schemaId;

    public String getSchemaId() {
        return this.schemaId;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @InputImport(name="serviceName", required=true)
    private final String serviceName;

    public String getServiceName() {
        return this.serviceName;
    }

    public GetApiSchemaArgs(
        String apiId,
        String resourceGroupName,
        String schemaId,
        String serviceName) {
        this.apiId = Objects.requireNonNull(apiId, "expected parameter 'apiId' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.schemaId = Objects.requireNonNull(schemaId, "expected parameter 'schemaId' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private GetApiSchemaArgs() {
        this.apiId = null;
        this.resourceGroupName = null;
        this.schemaId = null;
        this.serviceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApiSchemaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiId;
        private String resourceGroupName;
        private String schemaId;
        private String serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApiSchemaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiId = defaults.apiId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.schemaId = defaults.schemaId;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder setApiId(String apiId) {
            this.apiId = Objects.requireNonNull(apiId);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setSchemaId(String schemaId) {
            this.schemaId = Objects.requireNonNull(schemaId);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public GetApiSchemaArgs build() {
            return new GetApiSchemaArgs(apiId, resourceGroupName, schemaId, serviceName);
        }
    }
}
