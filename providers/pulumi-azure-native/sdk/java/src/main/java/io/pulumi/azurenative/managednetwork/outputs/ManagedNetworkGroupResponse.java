// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.managednetwork.outputs;

import io.pulumi.azurenative.managednetwork.outputs.ResourceIdResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManagedNetworkGroupResponse {
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Fully qualified resource Id for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * Responsibility role under which this Managed Network Group will be created
     * 
     */
    private final @Nullable String kind;
    /**
     * The geo-location where the resource lives
     * 
     */
    private final @Nullable String location;
    /**
     * The collection of management groups covered by the Managed Network
     * 
     */
    private final @Nullable List<ResourceIdResponse> managementGroups;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * Provisioning state of the ManagedNetwork resource.
     * 
     */
    private final String provisioningState;
    /**
     * The collection of  subnets covered by the Managed Network
     * 
     */
    private final @Nullable List<ResourceIdResponse> subnets;
    /**
     * The collection of subscriptions covered by the Managed Network
     * 
     */
    private final @Nullable List<ResourceIdResponse> subscriptions;
    /**
     * The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    private final String type;
    /**
     * The collection of virtual nets covered by the Managed Network
     * 
     */
    private final @Nullable List<ResourceIdResponse> virtualNetworks;

    @CustomType.Constructor
    private ManagedNetworkGroupResponse(
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kind") @Nullable String kind,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("managementGroups") @Nullable List<ResourceIdResponse> managementGroups,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("subnets") @Nullable List<ResourceIdResponse> subnets,
        @CustomType.Parameter("subscriptions") @Nullable List<ResourceIdResponse> subscriptions,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("virtualNetworks") @Nullable List<ResourceIdResponse> virtualNetworks) {
        this.etag = etag;
        this.id = id;
        this.kind = kind;
        this.location = location;
        this.managementGroups = managementGroups;
        this.name = name;
        this.provisioningState = provisioningState;
        this.subnets = subnets;
        this.subscriptions = subscriptions;
        this.type = type;
        this.virtualNetworks = virtualNetworks;
    }

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Fully qualified resource Id for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Responsibility role under which this Managed Network Group will be created
     * 
    */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * The geo-location where the resource lives
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The collection of management groups covered by the Managed Network
     * 
    */
    public List<ResourceIdResponse> getManagementGroups() {
        return this.managementGroups == null ? List.of() : this.managementGroups;
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Provisioning state of the ManagedNetwork resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The collection of  subnets covered by the Managed Network
     * 
    */
    public List<ResourceIdResponse> getSubnets() {
        return this.subnets == null ? List.of() : this.subnets;
    }
    /**
     * The collection of subscriptions covered by the Managed Network
     * 
    */
    public List<ResourceIdResponse> getSubscriptions() {
        return this.subscriptions == null ? List.of() : this.subscriptions;
    }
    /**
     * The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The collection of virtual nets covered by the Managed Network
     * 
    */
    public List<ResourceIdResponse> getVirtualNetworks() {
        return this.virtualNetworks == null ? List.of() : this.virtualNetworks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedNetworkGroupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private String id;
        private @Nullable String kind;
        private @Nullable String location;
        private @Nullable List<ResourceIdResponse> managementGroups;
        private String name;
        private String provisioningState;
        private @Nullable List<ResourceIdResponse> subnets;
        private @Nullable List<ResourceIdResponse> subscriptions;
        private String type;
        private @Nullable List<ResourceIdResponse> virtualNetworks;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedNetworkGroupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.managementGroups = defaults.managementGroups;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.subnets = defaults.subnets;
    	      this.subscriptions = defaults.subscriptions;
    	      this.type = defaults.type;
    	      this.virtualNetworks = defaults.virtualNetworks;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder managementGroups(@Nullable List<ResourceIdResponse> managementGroups) {
            this.managementGroups = managementGroups;
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

        public Builder subnets(@Nullable List<ResourceIdResponse> subnets) {
            this.subnets = subnets;
            return this;
        }

        public Builder subscriptions(@Nullable List<ResourceIdResponse> subscriptions) {
            this.subscriptions = subscriptions;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder virtualNetworks(@Nullable List<ResourceIdResponse> virtualNetworks) {
            this.virtualNetworks = virtualNetworks;
            return this;
        }
        public ManagedNetworkGroupResponse build() {
            return new ManagedNetworkGroupResponse(etag, id, kind, location, managementGroups, name, provisioningState, subnets, subscriptions, type, virtualNetworks);
        }
    }
}
