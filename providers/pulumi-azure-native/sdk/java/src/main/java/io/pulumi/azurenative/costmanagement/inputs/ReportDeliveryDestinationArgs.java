// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The destination information for the delivery of the report.
 * 
 */
public final class ReportDeliveryDestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReportDeliveryDestinationArgs Empty = new ReportDeliveryDestinationArgs();

    /**
     * The name of the container where reports will be uploaded.
     * 
     */
    @InputImport(name="container", required=true)
    private final Input<String> container;

    public Input<String> getContainer() {
        return this.container;
    }

    /**
     * The resource id of the storage account where reports will be delivered.
     * 
     */
    @InputImport(name="resourceId", required=true)
    private final Input<String> resourceId;

    public Input<String> getResourceId() {
        return this.resourceId;
    }

    /**
     * The name of the directory where reports will be uploaded.
     * 
     */
    @InputImport(name="rootFolderPath")
    private final @Nullable Input<String> rootFolderPath;

    public Input<String> getRootFolderPath() {
        return this.rootFolderPath == null ? Input.empty() : this.rootFolderPath;
    }

    public ReportDeliveryDestinationArgs(
        Input<String> container,
        Input<String> resourceId,
        @Nullable Input<String> rootFolderPath) {
        this.container = Objects.requireNonNull(container, "expected parameter 'container' to be non-null");
        this.resourceId = Objects.requireNonNull(resourceId, "expected parameter 'resourceId' to be non-null");
        this.rootFolderPath = rootFolderPath;
    }

    private ReportDeliveryDestinationArgs() {
        this.container = Input.empty();
        this.resourceId = Input.empty();
        this.rootFolderPath = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportDeliveryDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> container;
        private Input<String> resourceId;
        private @Nullable Input<String> rootFolderPath;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportDeliveryDestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.container = defaults.container;
    	      this.resourceId = defaults.resourceId;
    	      this.rootFolderPath = defaults.rootFolderPath;
        }

        public Builder setContainer(Input<String> container) {
            this.container = Objects.requireNonNull(container);
            return this;
        }

        public Builder setContainer(String container) {
            this.container = Input.of(Objects.requireNonNull(container));
            return this;
        }

        public Builder setResourceId(Input<String> resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }

        public Builder setResourceId(String resourceId) {
            this.resourceId = Input.of(Objects.requireNonNull(resourceId));
            return this;
        }

        public Builder setRootFolderPath(@Nullable Input<String> rootFolderPath) {
            this.rootFolderPath = rootFolderPath;
            return this;
        }

        public Builder setRootFolderPath(@Nullable String rootFolderPath) {
            this.rootFolderPath = Input.ofNullable(rootFolderPath);
            return this;
        }

        public ReportDeliveryDestinationArgs build() {
            return new ReportDeliveryDestinationArgs(container, resourceId, rootFolderPath);
        }
    }
}
