// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetContentItemArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetContentItemArgs Empty = new GetContentItemArgs();

    /**
     * Content item identifier.
     * 
     */
    @InputImport(name="contentItemId", required=true)
    private final String contentItemId;

    public String getContentItemId() {
        return this.contentItemId;
    }

    /**
     * Content type identifier.
     * 
     */
    @InputImport(name="contentTypeId", required=true)
    private final String contentTypeId;

    public String getContentTypeId() {
        return this.contentTypeId;
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
     * The name of the API Management service.
     * 
     */
    @InputImport(name="serviceName", required=true)
    private final String serviceName;

    public String getServiceName() {
        return this.serviceName;
    }

    public GetContentItemArgs(
        String contentItemId,
        String contentTypeId,
        String resourceGroupName,
        String serviceName) {
        this.contentItemId = Objects.requireNonNull(contentItemId, "expected parameter 'contentItemId' to be non-null");
        this.contentTypeId = Objects.requireNonNull(contentTypeId, "expected parameter 'contentTypeId' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private GetContentItemArgs() {
        this.contentItemId = null;
        this.contentTypeId = null;
        this.resourceGroupName = null;
        this.serviceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetContentItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String contentItemId;
        private String contentTypeId;
        private String resourceGroupName;
        private String serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetContentItemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentItemId = defaults.contentItemId;
    	      this.contentTypeId = defaults.contentTypeId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder setContentItemId(String contentItemId) {
            this.contentItemId = Objects.requireNonNull(contentItemId);
            return this;
        }

        public Builder setContentTypeId(String contentTypeId) {
            this.contentTypeId = Objects.requireNonNull(contentTypeId);
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

        public GetContentItemArgs build() {
            return new GetContentItemArgs(contentItemId, contentTypeId, resourceGroupName, serviceName);
        }
    }
}
