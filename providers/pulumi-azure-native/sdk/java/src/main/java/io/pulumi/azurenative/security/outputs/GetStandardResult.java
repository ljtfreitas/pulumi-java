// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.outputs;

import io.pulumi.azurenative.security.outputs.StandardComponentPropertiesResponse;
import io.pulumi.azurenative.security.outputs.SystemDataResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetStandardResult {
    private final @Nullable String category;
    private final @Nullable List<StandardComponentPropertiesResponse> components;
    private final @Nullable String description;
    private final @Nullable String displayName;
    private final @Nullable String etag;
    private final String id;
    private final @Nullable String kind;
    private final @Nullable String location;
    private final String name;
    private final String standardType;
    private final SystemDataResponse systemData;
    private final @Nullable Map<String,String> tags;
    private final String type;

    @OutputCustomType.Constructor({"category","components","description","displayName","etag","id","kind","location","name","standardType","systemData","tags","type"})
    private GetStandardResult(
        @Nullable String category,
        @Nullable List<StandardComponentPropertiesResponse> components,
        @Nullable String description,
        @Nullable String displayName,
        @Nullable String etag,
        String id,
        @Nullable String kind,
        @Nullable String location,
        String name,
        String standardType,
        SystemDataResponse systemData,
        @Nullable Map<String,String> tags,
        String type) {
        this.category = category;
        this.components = components;
        this.description = description;
        this.displayName = displayName;
        this.etag = etag;
        this.id = Objects.requireNonNull(id);
        this.kind = kind;
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.standardType = Objects.requireNonNull(standardType);
        this.systemData = Objects.requireNonNull(systemData);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    public Optional<String> getCategory() {
        return Optional.ofNullable(this.category);
    }
    public List<StandardComponentPropertiesResponse> getComponents() {
        return this.components == null ? List.of() : this.components;
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    public Optional<String> getEtag() {
        return Optional.ofNullable(this.etag);
    }
    public String getId() {
        return this.id;
    }
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    public String getName() {
        return this.name;
    }
    public String getStandardType() {
        return this.standardType;
    }
    public SystemDataResponse getSystemData() {
        return this.systemData;
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

    public static Builder builder(GetStandardResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String category;
        private @Nullable List<StandardComponentPropertiesResponse> components;
        private @Nullable String description;
        private @Nullable String displayName;
        private @Nullable String etag;
        private String id;
        private @Nullable String kind;
        private @Nullable String location;
        private String name;
        private String standardType;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStandardResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.components = defaults.components;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.standardType = defaults.standardType;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setCategory(@Nullable String category) {
            this.category = category;
            return this;
        }

        public Builder setComponents(@Nullable List<StandardComponentPropertiesResponse> components) {
            this.components = components;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
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

        public Builder setStandardType(String standardType) {
            this.standardType = Objects.requireNonNull(standardType);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
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

        public GetStandardResult build() {
            return new GetStandardResult(category, components, description, displayName, etag, id, kind, location, name, standardType, systemData, tags, type);
        }
    }
}