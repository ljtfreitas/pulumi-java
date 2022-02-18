// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BatchDeploymentArgs extends io.pulumi.resources.ResourceArgs {

    public static final BatchDeploymentArgs Empty = new BatchDeploymentArgs();

    /**
     * The identifier for the Batch inference deployment.
     * 
     */
    @InputImport(name="deploymentName")
    private final @Nullable Input<String> deploymentName;

    public Input<String> getDeploymentName() {
        return this.deploymentName == null ? Input.empty() : this.deploymentName;
    }

    /**
     * Inference endpoint name
     * 
     */
    @InputImport(name="endpointName", required=true)
    private final Input<String> endpointName;

    public Input<String> getEndpointName() {
        return this.endpointName;
    }

    /**
     * Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type.
     * 
     */
    @InputImport(name="kind")
    private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Additional attributes of the entity.
     * 
     */
    @InputImport(name="properties", required=true)
    private final Input<io.pulumi.azurenative.machinelearningservices.inputs.BatchDeploymentArgs> properties;

    public Input<io.pulumi.azurenative.machinelearningservices.inputs.BatchDeploymentArgs> getProperties() {
        return this.properties;
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
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Name of Azure Machine Learning workspace.
     * 
     */
    @InputImport(name="workspaceName", required=true)
    private final Input<String> workspaceName;

    public Input<String> getWorkspaceName() {
        return this.workspaceName;
    }

    public BatchDeploymentArgs(
        @Nullable Input<String> deploymentName,
        Input<String> endpointName,
        @Nullable Input<String> kind,
        @Nullable Input<String> location,
        Input<io.pulumi.azurenative.machinelearningservices.inputs.BatchDeploymentArgs> properties,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags,
        Input<String> workspaceName) {
        this.deploymentName = deploymentName;
        this.endpointName = Objects.requireNonNull(endpointName, "expected parameter 'endpointName' to be non-null");
        this.kind = kind;
        this.location = location;
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private BatchDeploymentArgs() {
        this.deploymentName = Input.empty();
        this.endpointName = Input.empty();
        this.kind = Input.empty();
        this.location = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
        this.workspaceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BatchDeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> deploymentName;
        private Input<String> endpointName;
        private @Nullable Input<String> kind;
        private @Nullable Input<String> location;
        private Input<io.pulumi.azurenative.machinelearningservices.inputs.BatchDeploymentArgs> properties;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;
        private Input<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(BatchDeploymentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deploymentName = defaults.deploymentName;
    	      this.endpointName = defaults.endpointName;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setDeploymentName(@Nullable Input<String> deploymentName) {
            this.deploymentName = deploymentName;
            return this;
        }

        public Builder setDeploymentName(@Nullable String deploymentName) {
            this.deploymentName = Input.ofNullable(deploymentName);
            return this;
        }

        public Builder setEndpointName(Input<String> endpointName) {
            this.endpointName = Objects.requireNonNull(endpointName);
            return this;
        }

        public Builder setEndpointName(String endpointName) {
            this.endpointName = Input.of(Objects.requireNonNull(endpointName));
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setProperties(Input<io.pulumi.azurenative.machinelearningservices.inputs.BatchDeploymentArgs> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setProperties(io.pulumi.azurenative.machinelearningservices.inputs.BatchDeploymentArgs properties) {
            this.properties = Input.of(Objects.requireNonNull(properties));
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

        public BatchDeploymentArgs build() {
            return new BatchDeploymentArgs(deploymentName, endpointName, kind, location, properties, resourceGroupName, tags, workspaceName);
        }
    }
}
