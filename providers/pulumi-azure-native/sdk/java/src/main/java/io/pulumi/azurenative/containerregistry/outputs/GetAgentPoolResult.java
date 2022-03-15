// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.azurenative.containerregistry.outputs.SystemDataResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAgentPoolResult {
    /**
     * The count of agent machine
     * 
     */
    private final @Nullable Integer count;
    /**
     * The resource ID.
     * 
     */
    private final String id;
    /**
     * The location of the resource. This cannot be changed after the resource is created.
     * 
     */
    private final String location;
    /**
     * The name of the resource.
     * 
     */
    private final String name;
    /**
     * The OS of agent machine
     * 
     */
    private final @Nullable String os;
    /**
     * The provisioning state of this agent pool
     * 
     */
    private final String provisioningState;
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The tags of the resource.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The Tier of agent machine
     * 
     */
    private final @Nullable String tier;
    /**
     * The type of the resource.
     * 
     */
    private final String type;
    /**
     * The Virtual Network Subnet Resource Id of the agent machine
     * 
     */
    private final @Nullable String virtualNetworkSubnetResourceId;

    @CustomType.Constructor
    private GetAgentPoolResult(
        @CustomType.Parameter("count") @Nullable Integer count,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("os") @Nullable String os,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("tier") @Nullable String tier,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("virtualNetworkSubnetResourceId") @Nullable String virtualNetworkSubnetResourceId) {
        this.count = count;
        this.id = id;
        this.location = location;
        this.name = name;
        this.os = os;
        this.provisioningState = provisioningState;
        this.systemData = systemData;
        this.tags = tags;
        this.tier = tier;
        this.type = type;
        this.virtualNetworkSubnetResourceId = virtualNetworkSubnetResourceId;
    }

    /**
     * The count of agent machine
     * 
    */
    public Optional<Integer> getCount() {
        return Optional.ofNullable(this.count);
    }
    /**
     * The resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The location of the resource. This cannot be changed after the resource is created.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * The name of the resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The OS of agent machine
     * 
    */
    public Optional<String> getOs() {
        return Optional.ofNullable(this.os);
    }
    /**
     * The provisioning state of this agent pool
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * The tags of the resource.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The Tier of agent machine
     * 
    */
    public Optional<String> getTier() {
        return Optional.ofNullable(this.tier);
    }
    /**
     * The type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The Virtual Network Subnet Resource Id of the agent machine
     * 
    */
    public Optional<String> getVirtualNetworkSubnetResourceId() {
        return Optional.ofNullable(this.virtualNetworkSubnetResourceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAgentPoolResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer count;
        private String id;
        private String location;
        private String name;
        private @Nullable String os;
        private String provisioningState;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private @Nullable String tier;
        private String type;
        private @Nullable String virtualNetworkSubnetResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAgentPoolResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.os = defaults.os;
    	      this.provisioningState = defaults.provisioningState;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.tier = defaults.tier;
    	      this.type = defaults.type;
    	      this.virtualNetworkSubnetResourceId = defaults.virtualNetworkSubnetResourceId;
        }

        public Builder count(@Nullable Integer count) {
            this.count = count;
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

        public Builder os(@Nullable String os) {
            this.os = os;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tier(@Nullable String tier) {
            this.tier = tier;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder virtualNetworkSubnetResourceId(@Nullable String virtualNetworkSubnetResourceId) {
            this.virtualNetworkSubnetResourceId = virtualNetworkSubnetResourceId;
            return this;
        }
        public GetAgentPoolResult build() {
            return new GetAgentPoolResult(count, id, location, name, os, provisioningState, systemData, tags, tier, type, virtualNetworkSubnetResourceId);
        }
    }
}
