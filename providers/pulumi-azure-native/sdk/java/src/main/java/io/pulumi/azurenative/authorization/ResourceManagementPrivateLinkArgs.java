// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourceManagementPrivateLinkArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceManagementPrivateLinkArgs Empty = new ResourceManagementPrivateLinkArgs();

    /**
     * the region to create private link association.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The name of the resource group the template will be deployed to. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the resource management private link.
     * 
     */
    @Import(name="rmplName")
      private final @Nullable Output<String> rmplName;

    public Output<String> getRmplName() {
        return this.rmplName == null ? Output.empty() : this.rmplName;
    }

    public ResourceManagementPrivateLinkArgs(
        @Nullable Output<String> location,
        Output<String> resourceGroupName,
        @Nullable Output<String> rmplName) {
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.rmplName = rmplName;
    }

    private ResourceManagementPrivateLinkArgs() {
        this.location = Output.empty();
        this.resourceGroupName = Output.empty();
        this.rmplName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceManagementPrivateLinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> location;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> rmplName;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceManagementPrivateLinkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.rmplName = defaults.rmplName;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
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

        public Builder rmplName(@Nullable Output<String> rmplName) {
            this.rmplName = rmplName;
            return this;
        }

        public Builder rmplName(@Nullable String rmplName) {
            this.rmplName = Output.ofNullable(rmplName);
            return this;
        }
        public ResourceManagementPrivateLinkArgs build() {
            return new ResourceManagementPrivateLinkArgs(location, resourceGroupName, rmplName);
        }
    }
}
