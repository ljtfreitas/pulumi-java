// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.managedidentity.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetUserAssignedIdentityResult {
    /**
     * The id of the app associated with the identity. This is a random generated UUID by MSI.
     * 
     */
    private final String clientId;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The geo-location where the resource lives
     * 
     */
    private final String location;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * The id of the service principal object associated with the created identity.
     * 
     */
    private final String principalId;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The id of the tenant which the identity belongs to.
     * 
     */
    private final String tenantId;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetUserAssignedIdentityResult(
        @CustomType.Parameter("clientId") String clientId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("principalId") String principalId,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("tenantId") String tenantId,
        @CustomType.Parameter("type") String type) {
        this.clientId = clientId;
        this.id = id;
        this.location = location;
        this.name = name;
        this.principalId = principalId;
        this.tags = tags;
        this.tenantId = tenantId;
        this.type = type;
    }

    /**
     * The id of the app associated with the identity. This is a random generated UUID by MSI.
     * 
    */
    public String getClientId() {
        return this.clientId;
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The geo-location where the resource lives
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The id of the service principal object associated with the created identity.
     * 
    */
    public String getPrincipalId() {
        return this.principalId;
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The id of the tenant which the identity belongs to.
     * 
    */
    public String getTenantId() {
        return this.tenantId;
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

    public static Builder builder(GetUserAssignedIdentityResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clientId;
        private String id;
        private String location;
        private String name;
        private String principalId;
        private @Nullable Map<String,String> tags;
        private String tenantId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserAssignedIdentityResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.principalId = defaults.principalId;
    	      this.tags = defaults.tags;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder principalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetUserAssignedIdentityResult build() {
            return new GetUserAssignedIdentityResult(clientId, id, location, name, principalId, tags, tenantId, type);
        }
    }
}
