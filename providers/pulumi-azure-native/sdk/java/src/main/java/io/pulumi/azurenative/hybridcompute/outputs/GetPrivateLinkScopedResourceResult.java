// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridcompute.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPrivateLinkScopedResourceResult {
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The resource id of the scoped Azure monitor resource.
     * 
     */
    private final @Nullable String linkedResourceId;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * State of the private endpoint connection.
     * 
     */
    private final String provisioningState;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetPrivateLinkScopedResourceResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("linkedResourceId") @Nullable String linkedResourceId,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.linkedResourceId = linkedResourceId;
        this.name = name;
        this.provisioningState = provisioningState;
        this.type = type;
    }

    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The resource id of the scoped Azure monitor resource.
     * 
    */
    public Optional<String> getLinkedResourceId() {
        return Optional.ofNullable(this.linkedResourceId);
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * State of the private endpoint connection.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivateLinkScopedResourceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String linkedResourceId;
        private String name;
        private String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPrivateLinkScopedResourceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.linkedResourceId = defaults.linkedResourceId;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder linkedResourceId(@Nullable String linkedResourceId) {
            this.linkedResourceId = linkedResourceId;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetPrivateLinkScopedResourceResult build() {
            return new GetPrivateLinkScopedResourceResult(id, linkedResourceId, name, provisioningState, type);
        }
    }
}
