// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.core.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClientConfigResult {
    private final String clientId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String objectId;
    private final String subscriptionId;
    private final String tenantId;

    @CustomType.Constructor
    private GetClientConfigResult(
        @CustomType.Parameter("clientId") String clientId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("objectId") String objectId,
        @CustomType.Parameter("subscriptionId") String subscriptionId,
        @CustomType.Parameter("tenantId") String tenantId) {
        this.clientId = clientId;
        this.id = id;
        this.objectId = objectId;
        this.subscriptionId = subscriptionId;
        this.tenantId = tenantId;
    }

    public String clientId() {
        return this.clientId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String objectId() {
        return this.objectId;
    }
    public String subscriptionId() {
        return this.subscriptionId;
    }
    public String tenantId() {
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
        private String id;
        private String objectId;
        private String subscriptionId;
        private String tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClientConfigResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.id = defaults.id;
    	      this.objectId = defaults.objectId;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder objectId(String objectId) {
            this.objectId = Objects.requireNonNull(objectId);
            return this;
        }
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = Objects.requireNonNull(subscriptionId);
            return this;
        }
        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }        public GetClientConfigResult build() {
            return new GetClientConfigResult(clientId, id, objectId, subscriptionId, tenantId);
        }
    }
}
