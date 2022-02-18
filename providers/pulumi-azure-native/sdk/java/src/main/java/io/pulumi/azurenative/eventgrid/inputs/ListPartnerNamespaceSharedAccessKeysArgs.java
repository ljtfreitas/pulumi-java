// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ListPartnerNamespaceSharedAccessKeysArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListPartnerNamespaceSharedAccessKeysArgs Empty = new ListPartnerNamespaceSharedAccessKeysArgs();

    /**
     * Name of the partner namespace.
     * 
     */
    @InputImport(name="partnerNamespaceName", required=true)
    private final String partnerNamespaceName;

    public String getPartnerNamespaceName() {
        return this.partnerNamespaceName;
    }

    /**
     * The name of the resource group within the user's subscription.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public ListPartnerNamespaceSharedAccessKeysArgs(
        String partnerNamespaceName,
        String resourceGroupName) {
        this.partnerNamespaceName = Objects.requireNonNull(partnerNamespaceName, "expected parameter 'partnerNamespaceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private ListPartnerNamespaceSharedAccessKeysArgs() {
        this.partnerNamespaceName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListPartnerNamespaceSharedAccessKeysArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String partnerNamespaceName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ListPartnerNamespaceSharedAccessKeysArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.partnerNamespaceName = defaults.partnerNamespaceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setPartnerNamespaceName(String partnerNamespaceName) {
            this.partnerNamespaceName = Objects.requireNonNull(partnerNamespaceName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public ListPartnerNamespaceSharedAccessKeysArgs build() {
            return new ListPartnerNamespaceSharedAccessKeysArgs(partnerNamespaceName, resourceGroupName);
        }
    }
}
