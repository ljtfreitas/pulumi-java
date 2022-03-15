// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute;

import io.pulumi.azurenative.compute.inputs.CloudServicePropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CloudServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final CloudServiceArgs Empty = new CloudServiceArgs();

    /**
     * Name of the cloud service.
     * 
     */
    @Import(name="cloudServiceName")
      private final @Nullable Output<String> cloudServiceName;

    public Output<String> getCloudServiceName() {
        return this.cloudServiceName == null ? Output.empty() : this.cloudServiceName;
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * Cloud service properties
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<CloudServicePropertiesArgs> properties;

    public Output<CloudServicePropertiesArgs> getProperties() {
        return this.properties == null ? Output.empty() : this.properties;
    }

    /**
     * Name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public CloudServiceArgs(
        @Nullable Output<String> cloudServiceName,
        @Nullable Output<String> location,
        @Nullable Output<CloudServicePropertiesArgs> properties,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags) {
        this.cloudServiceName = cloudServiceName;
        this.location = location;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private CloudServiceArgs() {
        this.cloudServiceName = Output.empty();
        this.location = Output.empty();
        this.properties = Output.empty();
        this.resourceGroupName = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> cloudServiceName;
        private @Nullable Output<String> location;
        private @Nullable Output<CloudServicePropertiesArgs> properties;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudServiceName = defaults.cloudServiceName;
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder cloudServiceName(@Nullable Output<String> cloudServiceName) {
            this.cloudServiceName = cloudServiceName;
            return this;
        }

        public Builder cloudServiceName(@Nullable String cloudServiceName) {
            this.cloudServiceName = Output.ofNullable(cloudServiceName);
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

        public Builder properties(@Nullable Output<CloudServicePropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder properties(@Nullable CloudServicePropertiesArgs properties) {
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
        public CloudServiceArgs build() {
            return new CloudServiceArgs(cloudServiceName, location, properties, resourceGroupName, tags);
        }
    }
}
