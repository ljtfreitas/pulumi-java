// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.azurenative.cdn.outputs.SkuResponse;
import io.pulumi.azurenative.cdn.outputs.SystemDataResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetProfileResult {
    /**
     * The Id of the frontdoor.
     * 
     */
    private final String frontdoorId;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Resource location.
     * 
     */
    private final String location;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * Provisioning status of the profile.
     * 
     */
    private final String provisioningState;
    /**
     * Resource status of the profile.
     * 
     */
    private final String resourceState;
    /**
     * The pricing tier (defines a CDN provider, feature list and rate) of the CDN profile.
     * 
     */
    private final SkuResponse sku;
    /**
     * Read only system data
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetProfileResult(
        @CustomType.Parameter("frontdoorId") String frontdoorId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("resourceState") String resourceState,
        @CustomType.Parameter("sku") SkuResponse sku,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.frontdoorId = frontdoorId;
        this.id = id;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.resourceState = resourceState;
        this.sku = sku;
        this.systemData = systemData;
        this.tags = tags;
        this.type = type;
    }

    /**
     * The Id of the frontdoor.
     * 
    */
    public String getFrontdoorId() {
        return this.frontdoorId;
    }
    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Resource location.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Provisioning status of the profile.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Resource status of the profile.
     * 
    */
    public String getResourceState() {
        return this.resourceState;
    }
    /**
     * The pricing tier (defines a CDN provider, feature list and rate) of the CDN profile.
     * 
    */
    public SkuResponse getSku() {
        return this.sku;
    }
    /**
     * Read only system data
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProfileResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String frontdoorId;
        private String id;
        private String location;
        private String name;
        private String provisioningState;
        private String resourceState;
        private SkuResponse sku;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProfileResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.frontdoorId = defaults.frontdoorId;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceState = defaults.resourceState;
    	      this.sku = defaults.sku;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder frontdoorId(String frontdoorId) {
            this.frontdoorId = Objects.requireNonNull(frontdoorId);
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

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder resourceState(String resourceState) {
            this.resourceState = Objects.requireNonNull(resourceState);
            return this;
        }

        public Builder sku(SkuResponse sku) {
            this.sku = Objects.requireNonNull(sku);
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

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetProfileResult build() {
            return new GetProfileResult(frontdoorId, id, location, name, provisioningState, resourceState, sku, systemData, tags, type);
        }
    }
}
