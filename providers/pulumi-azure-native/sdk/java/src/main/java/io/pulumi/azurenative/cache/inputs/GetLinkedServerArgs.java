// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cache.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetLinkedServerArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetLinkedServerArgs Empty = new GetLinkedServerArgs();

    /**
     * The name of the linked server.
     * 
     */
    @Import(name="linkedServerName", required=true)
      private final String linkedServerName;

    public String getLinkedServerName() {
        return this.linkedServerName;
    }

    /**
     * The name of the redis cache.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetLinkedServerArgs(
        String linkedServerName,
        String name,
        String resourceGroupName) {
        this.linkedServerName = Objects.requireNonNull(linkedServerName, "expected parameter 'linkedServerName' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetLinkedServerArgs() {
        this.linkedServerName = null;
        this.name = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLinkedServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String linkedServerName;
        private String name;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLinkedServerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linkedServerName = defaults.linkedServerName;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder linkedServerName(String linkedServerName) {
            this.linkedServerName = Objects.requireNonNull(linkedServerName);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetLinkedServerArgs build() {
            return new GetLinkedServerArgs(linkedServerName, name, resourceGroupName);
        }
    }
}
