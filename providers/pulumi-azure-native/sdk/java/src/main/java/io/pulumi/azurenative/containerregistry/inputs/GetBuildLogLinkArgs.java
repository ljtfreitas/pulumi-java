// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetBuildLogLinkArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetBuildLogLinkArgs Empty = new GetBuildLogLinkArgs();

    /**
     * The build ID.
     * 
     */
    @InputImport(name="buildId", required=true)
    private final String buildId;

    public String getBuildId() {
        return this.buildId;
    }

    /**
     * The name of the container registry.
     * 
     */
    @InputImport(name="registryName", required=true)
    private final String registryName;

    public String getRegistryName() {
        return this.registryName;
    }

    /**
     * The name of the resource group to which the container registry belongs.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetBuildLogLinkArgs(
        String buildId,
        String registryName,
        String resourceGroupName) {
        this.buildId = Objects.requireNonNull(buildId, "expected parameter 'buildId' to be non-null");
        this.registryName = Objects.requireNonNull(registryName, "expected parameter 'registryName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetBuildLogLinkArgs() {
        this.buildId = null;
        this.registryName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBuildLogLinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String buildId;
        private String registryName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBuildLogLinkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buildId = defaults.buildId;
    	      this.registryName = defaults.registryName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setBuildId(String buildId) {
            this.buildId = Objects.requireNonNull(buildId);
            return this;
        }

        public Builder setRegistryName(String registryName) {
            this.registryName = Objects.requireNonNull(registryName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetBuildLogLinkArgs build() {
            return new GetBuildLogLinkArgs(buildId, registryName, resourceGroupName);
        }
    }
}
