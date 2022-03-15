// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetServiceResult {
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
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The Azure location to which the resources in the service belong to or should be deployed to.
     * 
     */
    private final String targetLocation;
    /**
     * The subscription to which the resources in the service belong to or should be deployed to.
     * 
     */
    private final String targetSubscriptionId;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetServiceResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("targetLocation") String targetLocation,
        @CustomType.Parameter("targetSubscriptionId") String targetSubscriptionId,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.location = location;
        this.name = name;
        this.tags = tags;
        this.targetLocation = targetLocation;
        this.targetSubscriptionId = targetSubscriptionId;
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
     * Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The Azure location to which the resources in the service belong to or should be deployed to.
     * 
    */
    public String getTargetLocation() {
        return this.targetLocation;
    }
    /**
     * The subscription to which the resources in the service belong to or should be deployed to.
     * 
    */
    public String getTargetSubscriptionId() {
        return this.targetSubscriptionId;
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

    public static Builder builder(GetServiceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String location;
        private String name;
        private @Nullable Map<String,String> tags;
        private String targetLocation;
        private String targetSubscriptionId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.targetLocation = defaults.targetLocation;
    	      this.targetSubscriptionId = defaults.targetSubscriptionId;
    	      this.type = defaults.type;
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

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder targetLocation(String targetLocation) {
            this.targetLocation = Objects.requireNonNull(targetLocation);
            return this;
        }

        public Builder targetSubscriptionId(String targetSubscriptionId) {
            this.targetSubscriptionId = Objects.requireNonNull(targetSubscriptionId);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetServiceResult build() {
            return new GetServiceResult(id, location, name, tags, targetLocation, targetSubscriptionId, type);
        }
    }
}
