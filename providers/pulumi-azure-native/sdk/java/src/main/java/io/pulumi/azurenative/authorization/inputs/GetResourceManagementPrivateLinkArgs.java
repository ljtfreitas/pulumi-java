// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetResourceManagementPrivateLinkArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetResourceManagementPrivateLinkArgs Empty = new GetResourceManagementPrivateLinkArgs();

    /**
     * The name of the resource group the template will be deployed to. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the resource management private link.
     * 
     */
    @Import(name="rmplName", required=true)
      private final String rmplName;

    public String getRmplName() {
        return this.rmplName;
    }

    public GetResourceManagementPrivateLinkArgs(
        String resourceGroupName,
        String rmplName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.rmplName = Objects.requireNonNull(rmplName, "expected parameter 'rmplName' to be non-null");
    }

    private GetResourceManagementPrivateLinkArgs() {
        this.resourceGroupName = null;
        this.rmplName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourceManagementPrivateLinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String rmplName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourceManagementPrivateLinkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.rmplName = defaults.rmplName;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder rmplName(String rmplName) {
            this.rmplName = Objects.requireNonNull(rmplName);
            return this;
        }
        public GetResourceManagementPrivateLinkArgs build() {
            return new GetResourceManagementPrivateLinkArgs(resourceGroupName, rmplName);
        }
    }
}
