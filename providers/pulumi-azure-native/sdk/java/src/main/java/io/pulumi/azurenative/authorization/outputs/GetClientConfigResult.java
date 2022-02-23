// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetClientConfigResult {
    /**
     * Azure Client ID (Application Object ID).
     * 
     */
    private final String clientId;
    /**
     * Azure Object ID of the current user or service principal.
     * 
     */
    private final String objectId;
    /**
     * Azure Subscription ID
     * 
     */
    private final String subscriptionId;
    /**
     * Azure Tenant ID
     * 
     */
    private final String tenantId;

    @OutputCustomType.Constructor({"clientId","objectId","subscriptionId","tenantId"})
    private GetClientConfigResult(
        String clientId,
        String objectId,
        String subscriptionId,
        String tenantId) {
        this.clientId = Objects.requireNonNull(clientId);
        this.objectId = Objects.requireNonNull(objectId);
        this.subscriptionId = Objects.requireNonNull(subscriptionId);
        this.tenantId = Objects.requireNonNull(tenantId);
    }

    /**
     * Azure Client ID (Application Object ID).
     * 
     */
    public String getClientId() {
        return this.clientId;
    }
    /**
     * Azure Object ID of the current user or service principal.
     * 
     */
    public String getObjectId() {
        return this.objectId;
    }
    /**
     * Azure Subscription ID
     * 
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }
    /**
     * Azure Tenant ID
     * 
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClientConfigResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clientId;
        private String objectId;
        private String subscriptionId;
        private String tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClientConfigResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.objectId = defaults.objectId;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder setClientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }

        public Builder setObjectId(String objectId) {
            this.objectId = Objects.requireNonNull(objectId);
            return this;
        }

        public Builder setSubscriptionId(String subscriptionId) {
            this.subscriptionId = Objects.requireNonNull(subscriptionId);
            return this;
        }

        public Builder setTenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }
        public GetClientConfigResult build() {
            return new GetClientConfigResult(clientId, objectId, subscriptionId, tenantId);
        }
    }
}
