// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.outputs;

import io.pulumi.azurenative.devices.outputs.IotHubPropertiesResponse;
import io.pulumi.azurenative.devices.outputs.IotHubSkuInfoResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetIotHubResourceResult {
    private final @Nullable String etag;
    private final String id;
    private final String location;
    private final String name;
    private final IotHubPropertiesResponse properties;
    private final IotHubSkuInfoResponse sku;
    private final @Nullable Map<String,String> tags;
    private final String type;

    @OutputCustomType.Constructor({"etag","id","location","name","properties","sku","tags","type"})
    private GetIotHubResourceResult(
        @Nullable String etag,
        String id,
        String location,
        String name,
        IotHubPropertiesResponse properties,
        IotHubSkuInfoResponse sku,
        @Nullable Map<String,String> tags,
        String type) {
        this.etag = etag;
        this.id = Objects.requireNonNull(id);
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.properties = Objects.requireNonNull(properties);
        this.sku = Objects.requireNonNull(sku);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    public Optional<String> getEtag() {
        return Optional.ofNullable(this.etag);
    }
    public String getId() {
        return this.id;
    }
    public String getLocation() {
        return this.location;
    }
    public String getName() {
        return this.name;
    }
    public IotHubPropertiesResponse getProperties() {
        return this.properties;
    }
    public IotHubSkuInfoResponse getSku() {
        return this.sku;
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIotHubResourceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String etag;
        private String id;
        private String location;
        private String name;
        private IotHubPropertiesResponse properties;
        private IotHubSkuInfoResponse sku;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIotHubResourceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProperties(IotHubPropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setSku(IotHubSkuInfoResponse sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetIotHubResourceResult build() {
            return new GetIotHubResourceResult(etag, id, location, name, properties, sku, tags, type);
        }
    }
}