// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.outputs;

import io.pulumi.azurenative.resources.outputs.IdentityResponse;
import io.pulumi.azurenative.resources.outputs.PlanResponse;
import io.pulumi.azurenative.resources.outputs.SkuResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetResourceResult {
    /**
     * Resource ID
     * 
     */
    private final String id;
    /**
     * The identity of the resource.
     * 
     */
    private final @Nullable IdentityResponse identity;
    /**
     * The kind of the resource.
     * 
     */
    private final @Nullable String kind;
    /**
     * Resource location
     * 
     */
    private final @Nullable String location;
    /**
     * ID of the resource that manages this resource.
     * 
     */
    private final @Nullable String managedBy;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * The plan of the resource.
     * 
     */
    private final @Nullable PlanResponse plan;
    /**
     * The resource properties.
     * 
     */
    private final Object properties;
    /**
     * The SKU of the resource.
     * 
     */
    private final @Nullable SkuResponse sku;
    /**
     * Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetResourceResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identity") @Nullable IdentityResponse identity,
        @CustomType.Parameter("kind") @Nullable String kind,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("managedBy") @Nullable String managedBy,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("plan") @Nullable PlanResponse plan,
        @CustomType.Parameter("properties") Object properties,
        @CustomType.Parameter("sku") @Nullable SkuResponse sku,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.identity = identity;
        this.kind = kind;
        this.location = location;
        this.managedBy = managedBy;
        this.name = name;
        this.plan = plan;
        this.properties = properties;
        this.sku = sku;
        this.tags = tags;
        this.type = type;
    }

    /**
     * Resource ID
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The identity of the resource.
     * 
    */
    public Optional<IdentityResponse> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * The kind of the resource.
     * 
    */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * Resource location
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * ID of the resource that manages this resource.
     * 
    */
    public Optional<String> getManagedBy() {
        return Optional.ofNullable(this.managedBy);
    }
    /**
     * Resource name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The plan of the resource.
     * 
    */
    public Optional<PlanResponse> getPlan() {
        return Optional.ofNullable(this.plan);
    }
    /**
     * The resource properties.
     * 
    */
    public Object getProperties() {
        return this.properties;
    }
    /**
     * The SKU of the resource.
     * 
    */
    public Optional<SkuResponse> getSku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * Resource tags
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable IdentityResponse identity;
        private @Nullable String kind;
        private @Nullable String location;
        private @Nullable String managedBy;
        private String name;
        private @Nullable PlanResponse plan;
        private Object properties;
        private @Nullable SkuResponse sku;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.managedBy = defaults.managedBy;
    	      this.name = defaults.name;
    	      this.plan = defaults.plan;
    	      this.properties = defaults.properties;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder identity(@Nullable IdentityResponse identity) {
            this.identity = identity;
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

        public Builder managedBy(@Nullable String managedBy) {
            this.managedBy = managedBy;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder plan(@Nullable PlanResponse plan) {
            this.plan = plan;
            return this;
        }

        public Builder properties(Object properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder sku(@Nullable SkuResponse sku) {
            this.sku = sku;
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
        public GetResourceResult build() {
            return new GetResourceResult(id, identity, kind, location, managedBy, name, plan, properties, sku, tags, type);
        }
    }
}
