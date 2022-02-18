// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights;

import io.pulumi.azurenative.operationalinsights.enums.LinkedServiceEntityStatus;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LinkedServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final LinkedServiceArgs Empty = new LinkedServiceArgs();

    /**
     * Name of the linkedServices resource
     * 
     */
    @InputImport(name="linkedServiceName")
    private final @Nullable Input<String> linkedServiceName;

    public Input<String> getLinkedServiceName() {
        return this.linkedServiceName == null ? Input.empty() : this.linkedServiceName;
    }

    /**
     * The provisioning state of the linked service.
     * 
     */
    @InputImport(name="provisioningState")
    private final @Nullable Input<Either<String,LinkedServiceEntityStatus>> provisioningState;

    public Input<Either<String,LinkedServiceEntityStatus>> getProvisioningState() {
        return this.provisioningState == null ? Input.empty() : this.provisioningState;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The resource id of the resource that will be linked to the workspace. This should be used for linking resources which require read access
     * 
     */
    @InputImport(name="resourceId")
    private final @Nullable Input<String> resourceId;

    public Input<String> getResourceId() {
        return this.resourceId == null ? Input.empty() : this.resourceId;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The name of the workspace.
     * 
     */
    @InputImport(name="workspaceName", required=true)
    private final Input<String> workspaceName;

    public Input<String> getWorkspaceName() {
        return this.workspaceName;
    }

    /**
     * The resource id of the resource that will be linked to the workspace. This should be used for linking resources which require write access
     * 
     */
    @InputImport(name="writeAccessResourceId")
    private final @Nullable Input<String> writeAccessResourceId;

    public Input<String> getWriteAccessResourceId() {
        return this.writeAccessResourceId == null ? Input.empty() : this.writeAccessResourceId;
    }

    public LinkedServiceArgs(
        @Nullable Input<String> linkedServiceName,
        @Nullable Input<Either<String,LinkedServiceEntityStatus>> provisioningState,
        Input<String> resourceGroupName,
        @Nullable Input<String> resourceId,
        @Nullable Input<Map<String,String>> tags,
        Input<String> workspaceName,
        @Nullable Input<String> writeAccessResourceId) {
        this.linkedServiceName = linkedServiceName;
        this.provisioningState = provisioningState;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceId = resourceId;
        this.tags = tags;
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
        this.writeAccessResourceId = writeAccessResourceId;
    }

    private LinkedServiceArgs() {
        this.linkedServiceName = Input.empty();
        this.provisioningState = Input.empty();
        this.resourceGroupName = Input.empty();
        this.resourceId = Input.empty();
        this.tags = Input.empty();
        this.workspaceName = Input.empty();
        this.writeAccessResourceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> linkedServiceName;
        private @Nullable Input<Either<String,LinkedServiceEntityStatus>> provisioningState;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> resourceId;
        private @Nullable Input<Map<String,String>> tags;
        private Input<String> workspaceName;
        private @Nullable Input<String> writeAccessResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceId = defaults.resourceId;
    	      this.tags = defaults.tags;
    	      this.workspaceName = defaults.workspaceName;
    	      this.writeAccessResourceId = defaults.writeAccessResourceId;
        }

        public Builder setLinkedServiceName(@Nullable Input<String> linkedServiceName) {
            this.linkedServiceName = linkedServiceName;
            return this;
        }

        public Builder setLinkedServiceName(@Nullable String linkedServiceName) {
            this.linkedServiceName = Input.ofNullable(linkedServiceName);
            return this;
        }

        public Builder setProvisioningState(@Nullable Input<Either<String,LinkedServiceEntityStatus>> provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder setProvisioningState(@Nullable Either<String,LinkedServiceEntityStatus> provisioningState) {
            this.provisioningState = Input.ofNullable(provisioningState);
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

        public Builder setResourceId(@Nullable Input<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder setResourceId(@Nullable String resourceId) {
            this.resourceId = Input.ofNullable(resourceId);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setWorkspaceName(Input<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }

        public Builder setWorkspaceName(String workspaceName) {
            this.workspaceName = Input.of(Objects.requireNonNull(workspaceName));
            return this;
        }

        public Builder setWriteAccessResourceId(@Nullable Input<String> writeAccessResourceId) {
            this.writeAccessResourceId = writeAccessResourceId;
            return this;
        }

        public Builder setWriteAccessResourceId(@Nullable String writeAccessResourceId) {
            this.writeAccessResourceId = Input.ofNullable(writeAccessResourceId);
            return this;
        }

        public LinkedServiceArgs build() {
            return new LinkedServiceArgs(linkedServiceName, provisioningState, resourceGroupName, resourceId, tags, workspaceName, writeAccessResourceId);
        }
    }
}
