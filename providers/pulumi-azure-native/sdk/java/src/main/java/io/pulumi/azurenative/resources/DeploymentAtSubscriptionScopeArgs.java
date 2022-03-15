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


public final class DeploymentAtSubscriptionScopeArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentAtSubscriptionScopeArgs Empty = new DeploymentAtSubscriptionScopeArgs();

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

    public DeploymentAtSubscriptionScopeArgs(
        @Nullable Output<String> deploymentName,
        @Nullable Output<String> location,
        Output<DeploymentPropertiesArgs> properties,
        @Nullable Output<Map<String,String>> tags) {
        this.deploymentName = deploymentName;
        this.location = location;
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
        this.tags = tags;
    }

    private DeploymentAtSubscriptionScopeArgs() {
        this.deploymentName = Output.empty();
        this.location = Output.empty();
        this.properties = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentAtSubscriptionScopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> deploymentName;
        private @Nullable Output<String> location;
        private Output<DeploymentPropertiesArgs> properties;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentAtSubscriptionScopeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deploymentName = defaults.deploymentName;
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
        public DeploymentAtSubscriptionScopeArgs build() {
            return new DeploymentAtSubscriptionScopeArgs(deploymentName, location, properties, tags);
        }
    }
}
