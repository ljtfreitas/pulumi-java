// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The destination information for the delivery of the export. To allow access to a storage account, you must register the account's subscription with the Microsoft.CostManagementExports resource provider. This is required once per subscription. When creating an export in the Azure portal, it is done automatically, however API users need to register the subscription. For more information see https://docs.microsoft.com/en-us/azure/azure-resource-manager/resource-manager-supported-services .
 * 
 */
public final class ExportDeliveryDestinationResponse extends io.pulumi.resources.InvokeArgs {

    public static final ExportDeliveryDestinationResponse Empty = new ExportDeliveryDestinationResponse();

    /**
     * The name of the container where exports will be uploaded.
     * 
     */
    @InputImport(name="container", required=true)
    private final String container;

    public String getContainer() {
        return this.container;
    }

    /**
     * The resource id of the storage account where exports will be delivered.
     * 
     */
    @InputImport(name="resourceId", required=true)
    private final String resourceId;

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * The name of the directory where exports will be uploaded.
     * 
     */
    @InputImport(name="rootFolderPath")
    private final @Nullable String rootFolderPath;

    public Optional<String> getRootFolderPath() {
        return this.rootFolderPath == null ? Optional.empty() : Optional.ofNullable(this.rootFolderPath);
    }

    public ExportDeliveryDestinationResponse(
        String container,
        String resourceId,
        @Nullable String rootFolderPath) {
        this.container = Objects.requireNonNull(container, "expected parameter 'container' to be non-null");
        this.resourceId = Objects.requireNonNull(resourceId, "expected parameter 'resourceId' to be non-null");
        this.rootFolderPath = rootFolderPath;
    }

    private ExportDeliveryDestinationResponse() {
        this.container = null;
        this.resourceId = null;
        this.rootFolderPath = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExportDeliveryDestinationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String container;
        private String resourceId;
        private @Nullable String rootFolderPath;

        public Builder() {
    	      // Empty
        }

        public Builder(ExportDeliveryDestinationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.container = defaults.container;
    	      this.resourceId = defaults.resourceId;
    	      this.rootFolderPath = defaults.rootFolderPath;
        }

        public Builder setContainer(String container) {
            this.container = Objects.requireNonNull(container);
            return this;
        }

        public Builder setResourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }

        public Builder setRootFolderPath(@Nullable String rootFolderPath) {
            this.rootFolderPath = rootFolderPath;
            return this;
        }

        public ExportDeliveryDestinationResponse build() {
            return new ExportDeliveryDestinationResponse(container, resourceId, rootFolderPath);
        }
    }
}
