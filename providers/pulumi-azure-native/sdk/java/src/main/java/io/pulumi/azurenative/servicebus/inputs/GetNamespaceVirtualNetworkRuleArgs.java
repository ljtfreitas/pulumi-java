// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicebus.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetNamespaceVirtualNetworkRuleArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetNamespaceVirtualNetworkRuleArgs Empty = new GetNamespaceVirtualNetworkRuleArgs();

    /**
     * The namespace name
     * 
     */
    @Import(name="namespaceName", required=true)
      private final String namespaceName;

    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The Virtual Network Rule name.
     * 
     */
    @Import(name="virtualNetworkRuleName", required=true)
      private final String virtualNetworkRuleName;

    public String getVirtualNetworkRuleName() {
        return this.virtualNetworkRuleName;
    }

    public GetNamespaceVirtualNetworkRuleArgs(
        String namespaceName,
        String resourceGroupName,
        String virtualNetworkRuleName) {
        this.namespaceName = Objects.requireNonNull(namespaceName, "expected parameter 'namespaceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.virtualNetworkRuleName = Objects.requireNonNull(virtualNetworkRuleName, "expected parameter 'virtualNetworkRuleName' to be non-null");
    }

    private GetNamespaceVirtualNetworkRuleArgs() {
        this.namespaceName = null;
        this.resourceGroupName = null;
        this.virtualNetworkRuleName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNamespaceVirtualNetworkRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String namespaceName;
        private String resourceGroupName;
        private String virtualNetworkRuleName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNamespaceVirtualNetworkRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namespaceName = defaults.namespaceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.virtualNetworkRuleName = defaults.virtualNetworkRuleName;
        }

        public Builder namespaceName(String namespaceName) {
            this.namespaceName = Objects.requireNonNull(namespaceName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder virtualNetworkRuleName(String virtualNetworkRuleName) {
            this.virtualNetworkRuleName = Objects.requireNonNull(virtualNetworkRuleName);
            return this;
        }
        public GetNamespaceVirtualNetworkRuleArgs build() {
            return new GetNamespaceVirtualNetworkRuleArgs(namespaceName, resourceGroupName, virtualNetworkRuleName);
        }
    }
}
