// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventhub.outputs;

import io.pulumi.azurenative.eventhub.outputs.ClusterSkuResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetClusterResult {
    private final String createdAt;
    private final String id;
    private final @Nullable String location;
    private final String metricId;
    private final String name;
    private final @Nullable ClusterSkuResponse sku;
    private final String status;
    private final @Nullable Map<String,String> tags;
    private final String type;
    private final String updatedAt;

    @OutputCustomType.Constructor({"createdAt","id","location","metricId","name","sku","status","tags","type","updatedAt"})
    private GetClusterResult(
        String createdAt,
        String id,
        @Nullable String location,
        String metricId,
        String name,
        @Nullable ClusterSkuResponse sku,
        String status,
        @Nullable Map<String,String> tags,
        String type,
        String updatedAt) {
        this.createdAt = Objects.requireNonNull(createdAt);
        this.id = Objects.requireNonNull(id);
        this.location = location;
        this.metricId = Objects.requireNonNull(metricId);
        this.name = Objects.requireNonNull(name);
        this.sku = sku;
        this.status = Objects.requireNonNull(status);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.updatedAt = Objects.requireNonNull(updatedAt);
    }

    public String getCreatedAt() {
        return this.createdAt;
    }
    public String getId() {
        return this.id;
    }
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    public String getMetricId() {
        return this.metricId;
    }
    public String getName() {
        return this.name;
    }
    public Optional<ClusterSkuResponse> getSku() {
        return Optional.ofNullable(this.sku);
    }
    public String getStatus() {
        return this.status;
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public String getType() {
        return this.type;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdAt;
        private String id;
        private @Nullable String location;
        private String metricId;
        private String name;
        private @Nullable ClusterSkuResponse sku;
        private String status;
        private @Nullable Map<String,String> tags;
        private String type;
        private String updatedAt;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdAt = defaults.createdAt;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.metricId = defaults.metricId;
    	      this.name = defaults.name;
    	      this.sku = defaults.sku;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.updatedAt = defaults.updatedAt;
        }

        public Builder setCreatedAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setMetricId(String metricId) {
            this.metricId = Objects.requireNonNull(metricId);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSku(@Nullable ClusterSkuResponse sku) {
            this.sku = sku;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
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

        public Builder setUpdatedAt(String updatedAt) {
            this.updatedAt = Objects.requireNonNull(updatedAt);
            return this;
        }

        public GetClusterResult build() {
            return new GetClusterResult(createdAt, id, location, metricId, name, sku, status, tags, type, updatedAt);
        }
    }
}