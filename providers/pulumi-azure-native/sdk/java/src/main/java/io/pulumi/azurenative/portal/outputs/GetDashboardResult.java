// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.portal.outputs;

import io.pulumi.azurenative.portal.outputs.DashboardLensResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDashboardResult {
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * The dashboard lenses.
     * 
     */
    private final @Nullable List<DashboardLensResponse> lenses;
    /**
     * Resource location
     * 
     */
    private final String location;
    /**
     * The dashboard metadata.
     * 
     */
    private final @Nullable Map<String,Object> metadata;
    /**
     * Resource name
     * 
     */
    private final String name;
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

    @OutputCustomType.Constructor({"id","lenses","location","metadata","name","tags","type"})
    private GetDashboardResult(
        String id,
        @Nullable List<DashboardLensResponse> lenses,
        String location,
        @Nullable Map<String,Object> metadata,
        String name,
        @Nullable Map<String,String> tags,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.lenses = lenses;
        this.location = Objects.requireNonNull(location);
        this.metadata = metadata;
        this.name = Objects.requireNonNull(name);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Resource Id
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The dashboard lenses.
     * 
     */
    public List<DashboardLensResponse> getLenses() {
        return this.lenses == null ? List.of() : this.lenses;
    }
    /**
     * Resource location
     * 
     */
    public String getLocation() {
        return this.location;
    }
    /**
     * The dashboard metadata.
     * 
     */
    public Map<String,Object> getMetadata() {
        return this.metadata == null ? Map.of() : this.metadata;
    }
    /**
     * Resource name
     * 
     */
    public String getName() {
        return this.name;
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

    public static Builder builder(GetDashboardResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable List<DashboardLensResponse> lenses;
        private String location;
        private @Nullable Map<String,Object> metadata;
        private String name;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDashboardResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.lenses = defaults.lenses;
    	      this.location = defaults.location;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLenses(@Nullable List<DashboardLensResponse> lenses) {
            this.lenses = lenses;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setMetadata(@Nullable Map<String,Object> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
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
        public GetDashboardResult build() {
            return new GetDashboardResult(id, lenses, location, metadata, name, tags, type);
        }
    }
}
