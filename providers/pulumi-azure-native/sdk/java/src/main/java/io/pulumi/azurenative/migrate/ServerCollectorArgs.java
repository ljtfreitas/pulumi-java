// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate;

import io.pulumi.azurenative.migrate.inputs.CollectorPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServerCollectorArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServerCollectorArgs Empty = new ServerCollectorArgs();

    @InputImport(name="eTag")
        private final @Nullable Input<String> eTag;

    public Input<String> getETag() {
        return this.eTag == null ? Input.empty() : this.eTag;
    }

    /**
     * Name of the Azure Migrate project.
     * 
     */
    @InputImport(name="projectName", required=true)
        private final Input<String> projectName;

    public Input<String> getProjectName() {
        return this.projectName;
    }

    @InputImport(name="properties")
        private final @Nullable Input<CollectorPropertiesArgs> properties;

    public Input<CollectorPropertiesArgs> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * Name of the Azure Resource Group that project is part of.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Unique name of a Server collector within a project.
     * 
     */
    @InputImport(name="serverCollectorName")
        private final @Nullable Input<String> serverCollectorName;

    public Input<String> getServerCollectorName() {
        return this.serverCollectorName == null ? Input.empty() : this.serverCollectorName;
    }

    public ServerCollectorArgs(
        @Nullable Input<String> eTag,
        Input<String> projectName,
        @Nullable Input<CollectorPropertiesArgs> properties,
        Input<String> resourceGroupName,
        @Nullable Input<String> serverCollectorName) {
        this.eTag = eTag;
        this.projectName = Objects.requireNonNull(projectName, "expected parameter 'projectName' to be non-null");
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serverCollectorName = serverCollectorName;
    }

    private ServerCollectorArgs() {
        this.eTag = Input.empty();
        this.projectName = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
        this.serverCollectorName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerCollectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> eTag;
        private Input<String> projectName;
        private @Nullable Input<CollectorPropertiesArgs> properties;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> serverCollectorName;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerCollectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eTag = defaults.eTag;
    	      this.projectName = defaults.projectName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serverCollectorName = defaults.serverCollectorName;
        }

        public Builder setETag(@Nullable Input<String> eTag) {
            this.eTag = eTag;
            return this;
        }

        public Builder setETag(@Nullable String eTag) {
            this.eTag = Input.ofNullable(eTag);
            return this;
        }

        public Builder setProjectName(Input<String> projectName) {
            this.projectName = Objects.requireNonNull(projectName);
            return this;
        }

        public Builder setProjectName(String projectName) {
            this.projectName = Input.of(Objects.requireNonNull(projectName));
            return this;
        }

        public Builder setProperties(@Nullable Input<CollectorPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable CollectorPropertiesArgs properties) {
            this.properties = Input.ofNullable(properties);
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

        public Builder setServerCollectorName(@Nullable Input<String> serverCollectorName) {
            this.serverCollectorName = serverCollectorName;
            return this;
        }

        public Builder setServerCollectorName(@Nullable String serverCollectorName) {
            this.serverCollectorName = Input.ofNullable(serverCollectorName);
            return this;
        }
        public ServerCollectorArgs build() {
            return new ServerCollectorArgs(eTag, projectName, properties, resourceGroupName, serverCollectorName);
        }
    }
}
