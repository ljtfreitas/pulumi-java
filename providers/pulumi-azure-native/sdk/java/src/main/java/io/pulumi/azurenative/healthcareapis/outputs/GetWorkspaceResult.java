// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.healthcareapis.outputs;

import io.pulumi.azurenative.healthcareapis.outputs.SystemDataResponse;
import io.pulumi.azurenative.healthcareapis.outputs.WorkspaceResponseProperties;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetWorkspaceResult {
    /**
     * An etag associated with the resource, used for optimistic concurrency when editing it.
     * 
     */
    private final @Nullable String etag;
    /**
     * The resource identifier.
     * 
     */
    private final String id;
    /**
     * The resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * The resource name.
     * 
     */
    private final String name;
    /**
     * Workspaces resource specific properties.
     * 
     */
    private final WorkspaceResponseProperties properties;
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"etag","id","location","name","properties","systemData","tags","type"})
    private GetWorkspaceResult(
        @Nullable String etag,
        String id,
        @Nullable String location,
        String name,
        WorkspaceResponseProperties properties,
        SystemDataResponse systemData,
        @Nullable Map<String,String> tags,
        String type) {
        this.etag = etag;
        this.id = Objects.requireNonNull(id);
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.properties = Objects.requireNonNull(properties);
        this.systemData = Objects.requireNonNull(systemData);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * An etag associated with the resource, used for optimistic concurrency when editing it.
     * 
     */
    public Optional<String> getEtag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * The resource identifier.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The resource location.
     * 
     */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The resource name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Workspaces resource specific properties.
     * 
     */
    public WorkspaceResponseProperties getProperties() {
        return this.properties;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
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
     * The resource type.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkspaceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String etag;
        private String id;
        private @Nullable String location;
        private String name;
        private WorkspaceResponseProperties properties;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkspaceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.systemData = defaults.systemData;
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

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProperties(WorkspaceResponseProperties properties) {
            this.properties = Objects.requireNonNull(properties);
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
        public GetWorkspaceResult build() {
            return new GetWorkspaceResult(etag, id, location, name, properties, systemData, tags, type);
        }
    }
}
