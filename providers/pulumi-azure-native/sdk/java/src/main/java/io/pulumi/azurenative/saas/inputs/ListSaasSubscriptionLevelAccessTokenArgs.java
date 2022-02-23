// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.saas.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ListSaasSubscriptionLevelAccessTokenArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListSaasSubscriptionLevelAccessTokenArgs Empty = new ListSaasSubscriptionLevelAccessTokenArgs();

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the resource.
     * 
     */
    @InputImport(name="resourceName", required=true)
        private final String resourceName;

    public String getPropResourceName() {
        return this.resourceName;
    }

    public ListSaasSubscriptionLevelAccessTokenArgs(
        String resourceGroupName,
        String resourceName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
    }

    private ListSaasSubscriptionLevelAccessTokenArgs() {
        this.resourceGroupName = null;
        this.resourceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListSaasSubscriptionLevelAccessTokenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String resourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ListSaasSubscriptionLevelAccessTokenArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceName(String resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }
        public ListSaasSubscriptionLevelAccessTokenArgs build() {
            return new ListSaasSubscriptionLevelAccessTokenArgs(resourceGroupName, resourceName);
        }
    }
}
