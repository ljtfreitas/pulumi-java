// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.outputs;

import io.pulumi.azurenative.documentdb.outputs.GremlinGraphGetPropertiesResponseOptions;
import io.pulumi.azurenative.documentdb.outputs.GremlinGraphGetPropertiesResponseResource;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetGremlinResourceGremlinGraphResult {
    private final String id;
    private final @Nullable String location;
    private final String name;
    private final @Nullable GremlinGraphGetPropertiesResponseOptions options;
    private final @Nullable GremlinGraphGetPropertiesResponseResource resource;
    private final @Nullable Map<String,String> tags;
    private final String type;

    @OutputCustomType.Constructor({"id","location","name","options","resource","tags","type"})
    private GetGremlinResourceGremlinGraphResult(
        String id,
        @Nullable String location,
        String name,
        @Nullable GremlinGraphGetPropertiesResponseOptions options,
        @Nullable GremlinGraphGetPropertiesResponseResource resource,
        @Nullable Map<String,String> tags,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.options = options;
        this.resource = resource;
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    public String getId() {
        return this.id;
    }
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    public String getName() {
        return this.name;
    }
    public Optional<GremlinGraphGetPropertiesResponseOptions> getOptions() {
        return Optional.ofNullable(this.options);
    }
    public Optional<GremlinGraphGetPropertiesResponseResource> getResource() {
        return Optional.ofNullable(this.resource);
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

    public static Builder builder(GetGremlinResourceGremlinGraphResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String location;
        private String name;
        private @Nullable GremlinGraphGetPropertiesResponseOptions options;
        private @Nullable GremlinGraphGetPropertiesResponseResource resource;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGremlinResourceGremlinGraphResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.options = defaults.options;
    	      this.resource = defaults.resource;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOptions(@Nullable GremlinGraphGetPropertiesResponseOptions options) {
            this.options = options;
            return this;
        }

        public Builder setResource(@Nullable GremlinGraphGetPropertiesResponseResource resource) {
            this.resource = resource;
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

        public GetGremlinResourceGremlinGraphResult build() {
            return new GetGremlinResourceGremlinGraphResult(id, location, name, options, resource, tags, type);
        }
    }
}