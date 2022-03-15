// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListSubscriptionSecretsArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListSubscriptionSecretsArgs Empty = new ListSubscriptionSecretsArgs();

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
      private final String serviceName;

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * Subscription entity Identifier. The entity represents the association between a user and a product in API Management.
     * 
     */
    @Import(name="sid", required=true)
      private final String sid;

    public String getSid() {
        return this.sid;
    }

    public ListSubscriptionSecretsArgs(
        String resourceGroupName,
        String serviceName,
        String sid) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.sid = Objects.requireNonNull(sid, "expected parameter 'sid' to be non-null");
    }

    private ListSubscriptionSecretsArgs() {
        this.resourceGroupName = null;
        this.serviceName = null;
        this.sid = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListSubscriptionSecretsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String serviceName;
        private String sid;

        public Builder() {
    	      // Empty
        }

        public Builder(ListSubscriptionSecretsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
    	      this.sid = defaults.sid;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder sid(String sid) {
            this.sid = Objects.requireNonNull(sid);
            return this;
        }
        public ListSubscriptionSecretsArgs build() {
            return new ListSubscriptionSecretsArgs(resourceGroupName, serviceName, sid);
        }
    }
}
