// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight;

import io.pulumi.azurenative.hdinsight.inputs.ApplicationPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationArgs Empty = new ApplicationArgs();

    /**
     * The constant value for the application name.
     * 
     */
    @Import(name="applicationName")
      private final @Nullable Output<String> applicationName;

    public Output<String> getApplicationName() {
        return this.applicationName == null ? Output.empty() : this.applicationName;
    }

    /**
     * The name of the cluster.
     * 
     */
    @Import(name="clusterName", required=true)
      private final Output<String> clusterName;

    public Output<String> getClusterName() {
        return this.clusterName;
    }

    /**
     * The properties of the application.
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<ApplicationPropertiesArgs> properties;

    public Output<ApplicationPropertiesArgs> getProperties() {
        return this.properties == null ? Output.empty() : this.properties;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The tags for the application.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public ApplicationArgs(
        @Nullable Output<String> applicationName,
        Output<String> clusterName,
        @Nullable Output<ApplicationPropertiesArgs> properties,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags) {
        this.applicationName = applicationName;
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private ApplicationArgs() {
        this.applicationName = Output.empty();
        this.clusterName = Output.empty();
        this.properties = Output.empty();
        this.resourceGroupName = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> applicationName;
        private Output<String> clusterName;
        private @Nullable Output<ApplicationPropertiesArgs> properties;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationName = defaults.applicationName;
    	      this.clusterName = defaults.clusterName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder applicationName(@Nullable Output<String> applicationName) {
            this.applicationName = applicationName;
            return this;
        }

        public Builder applicationName(@Nullable String applicationName) {
            this.applicationName = Output.ofNullable(applicationName);
            return this;
        }

        public Builder clusterName(Output<String> clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }

        public Builder clusterName(String clusterName) {
            this.clusterName = Output.of(Objects.requireNonNull(clusterName));
            return this;
        }

        public Builder properties(@Nullable Output<ApplicationPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder properties(@Nullable ApplicationPropertiesArgs properties) {
            this.properties = Output.ofNullable(properties);
            return this;
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
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
        public ApplicationArgs build() {
            return new ApplicationArgs(applicationName, clusterName, properties, resourceGroupName, tags);
        }
    }
}
