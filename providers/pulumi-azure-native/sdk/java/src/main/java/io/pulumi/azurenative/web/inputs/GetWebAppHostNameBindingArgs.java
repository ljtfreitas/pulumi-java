// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetWebAppHostNameBindingArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetWebAppHostNameBindingArgs Empty = new GetWebAppHostNameBindingArgs();

    /**
     * Hostname in the hostname binding.
     * 
     */
    @InputImport(name="hostName", required=true)
        private final String hostName;

    public String getHostName() {
        return this.hostName;
    }

    /**
     * Name of the app.
     * 
     */
    @InputImport(name="name", required=true)
        private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetWebAppHostNameBindingArgs(
        String hostName,
        String name,
        String resourceGroupName) {
        this.hostName = Objects.requireNonNull(hostName, "expected parameter 'hostName' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetWebAppHostNameBindingArgs() {
        this.hostName = null;
        this.name = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebAppHostNameBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String hostName;
        private String name;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebAppHostNameBindingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostName = defaults.hostName;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setHostName(String hostName) {
            this.hostName = Objects.requireNonNull(hostName);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetWebAppHostNameBindingArgs build() {
            return new GetWebAppHostNameBindingArgs(hostName, name, resourceGroupName);
        }
    }
}
