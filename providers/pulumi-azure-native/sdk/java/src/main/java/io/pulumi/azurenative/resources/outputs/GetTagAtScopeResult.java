// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.outputs;

import io.pulumi.azurenative.resources.outputs.TagsResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTagAtScopeResult {
    /**
     * The ID of the tags wrapper resource.
     * 
     */
    private final String id;
    /**
     * The name of the tags wrapper resource.
     * 
     */
    private final String name;
    /**
     * The set of tags.
     * 
     */
    private final TagsResponse properties;
    /**
     * The type of the tags wrapper resource.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetTagAtScopeResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("properties") TagsResponse properties,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.name = name;
        this.properties = properties;
        this.type = type;
    }

    /**
     * The ID of the tags wrapper resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the tags wrapper resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The set of tags.
     * 
    */
    public TagsResponse getProperties() {
        return this.properties;
    }
    /**
     * The type of the tags wrapper resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTagAtScopeResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private TagsResponse properties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTagAtScopeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder properties(TagsResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetTagAtScopeResult build() {
            return new GetTagAtScopeResult(id, name, properties, type);
        }
    }
}
