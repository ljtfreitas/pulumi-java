// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.powerbi.outputs;

import io.pulumi.azurenative.powerbi.outputs.AzureSkuResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetWorkspaceCollectionResult {
    /**
     * Resource id
     * 
     */
    private final @Nullable String id;
    /**
     * Azure location
     * 
     */
    private final @Nullable String location;
    /**
     * Workspace collection name
     * 
     */
    private final @Nullable String name;
    /**
     * Properties
     * 
     */
    private final Object properties;
    private final @Nullable AzureSkuResponse sku;
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type
     * 
     */
    private final @Nullable String type;

    @OutputCustomType.Constructor({"id","location","name","properties","sku","tags","type"})
    private GetWorkspaceCollectionResult(
        @Nullable String id,
        @Nullable String location,
        @Nullable String name,
        Object properties,
        @Nullable AzureSkuResponse sku,
        @Nullable Map<String,String> tags,
        @Nullable String type) {
        this.id = id;
        this.location = location;
        this.name = name;
        this.properties = Objects.requireNonNull(properties);
        this.sku = sku;
        this.tags = tags;
        this.type = type;
    }

    /**
     * Resource id
     * 
     */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Azure location
     * 
     */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Workspace collection name
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Properties
     * 
     */
    public Object getProperties() {
        return this.properties;
    }
    public Optional<AzureSkuResponse> getSku() {
        return Optional.ofNullable(this.sku);
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type
     * 
     */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkspaceCollectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable String location;
        private @Nullable String name;
        private Object properties;
        private @Nullable AzureSkuResponse sku;
        private @Nullable Map<String,String> tags;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkspaceCollectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setProperties(Object properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setSku(@Nullable AzureSkuResponse sku) {
            this.sku = sku;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public GetWorkspaceCollectionResult build() {
            return new GetWorkspaceCollectionResult(id, location, name, properties, sku, tags, type);
        }
    }
}
