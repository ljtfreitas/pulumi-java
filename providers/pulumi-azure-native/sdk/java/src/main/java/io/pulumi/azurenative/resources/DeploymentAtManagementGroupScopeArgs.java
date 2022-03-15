// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources;

import io.pulumi.azurenative.resources.inputs.DeploymentPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeploymentAtManagementGroupScopeArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentAtManagementGroupScopeArgs Empty = new DeploymentAtManagementGroupScopeArgs();

    /**
     * The name of the deployment.
     * 
     */
    @Import(name="deploymentName")
      private final @Nullable Output<String> deploymentName;

    public Output<String> getDeploymentName() {
        return this.deploymentName == null ? Output.empty() : this.deploymentName;
    }

    /**
     * The management group ID.
     * 
     */
    @Import(name="groupId", required=true)
      private final Output<String> groupId;

    public Output<String> getGroupId() {
        return this.groupId;
    }

    /**
     * The location to store the deployment data.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The deployment properties.
     * 
     */
    @Import(name="properties", required=true)
      private final Output<DeploymentPropertiesArgs> properties;

    public Output<DeploymentPropertiesArgs> getProperties() {
        return this.properties;
    }

    /**
     * Deployment tags
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public DeploymentAtManagementGroupScopeArgs(
        @Nullable Output<String> deploymentName,
        Output<String> groupId,
        @Nullable Output<String> location,
        Output<DeploymentPropertiesArgs> properties,
        @Nullable Output<Map<String,String>> tags) {
        this.deploymentName = deploymentName;
        this.groupId = Objects.requireNonNull(groupId, "expected parameter 'groupId' to be non-null");
        this.location = location;
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
        this.tags = tags;
    }

    private DeploymentAtManagementGroupScopeArgs() {
        this.deploymentName = Output.empty();
        this.groupId = Output.empty();
        this.location = Output.empty();
        this.properties = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentAtManagementGroupScopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> deploymentName;
        private Output<String> groupId;
        private @Nullable Output<String> location;
        private Output<DeploymentPropertiesArgs> properties;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentAtManagementGroupScopeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deploymentName = defaults.deploymentName;
    	      this.groupId = defaults.groupId;
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
    	      this.tags = defaults.tags;
        }

        public Builder deploymentName(@Nullable Output<String> deploymentName) {
            this.deploymentName = deploymentName;
            return this;
        }

        public Builder deploymentName(@Nullable String deploymentName) {
            this.deploymentName = Output.ofNullable(deploymentName);
            return this;
        }

        public Builder groupId(Output<String> groupId) {
            this.groupId = Objects.requireNonNull(groupId);
            return this;
        }

        public Builder groupId(String groupId) {
            this.groupId = Output.of(Objects.requireNonNull(groupId));
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder properties(Output<DeploymentPropertiesArgs> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder properties(DeploymentPropertiesArgs properties) {
            this.properties = Output.of(Objects.requireNonNull(properties));
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public DeploymentAtManagementGroupScopeArgs build() {
            return new DeploymentAtManagementGroupScopeArgs(deploymentName, groupId, location, properties, tags);
        }
    }
}
