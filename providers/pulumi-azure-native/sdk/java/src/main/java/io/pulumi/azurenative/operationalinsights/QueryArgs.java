// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights;

import io.pulumi.azurenative.operationalinsights.inputs.LogAnalyticsQueryPackQueryPropertiesRelatedArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class QueryArgs extends io.pulumi.resources.ResourceArgs {

    public static final QueryArgs Empty = new QueryArgs();

    /**
     * Body of the query.
     * 
     */
    @InputImport(name="body", required=true)
        private final Input<String> body;

    public Input<String> getBody() {
        return this.body;
    }

    /**
     * Description of the query.
     * 
     */
    @InputImport(name="description")
        private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Unique display name for your query within the Query Pack.
     * 
     */
    @InputImport(name="displayName", required=true)
        private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * The id of a specific query defined in the Log Analytics QueryPack
     * 
     */
    @InputImport(name="id")
        private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * Additional properties that can be set for the query.
     * 
     */
    @InputImport(name="properties")
        private final @Nullable Input<Object> properties;

    public Input<Object> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * The name of the Log Analytics QueryPack resource.
     * 
     */
    @InputImport(name="queryPackName", required=true)
        private final Input<String> queryPackName;

    public Input<String> getQueryPackName() {
        return this.queryPackName;
    }

    /**
     * The related metadata items for the function.
     * 
     */
    @InputImport(name="related")
        private final @Nullable Input<LogAnalyticsQueryPackQueryPropertiesRelatedArgs> related;

    public Input<LogAnalyticsQueryPackQueryPropertiesRelatedArgs> getRelated() {
        return this.related == null ? Input.empty() : this.related;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Tags associated with the query.
     * 
     */
    @InputImport(name="tags")
        private final @Nullable Input<Map<String,List<String>>> tags;

    public Input<Map<String,List<String>>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public QueryArgs(
        Input<String> body,
        @Nullable Input<String> description,
        Input<String> displayName,
        @Nullable Input<String> id,
        @Nullable Input<Object> properties,
        Input<String> queryPackName,
        @Nullable Input<LogAnalyticsQueryPackQueryPropertiesRelatedArgs> related,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,List<String>>> tags) {
        this.body = Objects.requireNonNull(body, "expected parameter 'body' to be non-null");
        this.description = description;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.id = id;
        this.properties = properties;
        this.queryPackName = Objects.requireNonNull(queryPackName, "expected parameter 'queryPackName' to be non-null");
        this.related = related;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private QueryArgs() {
        this.body = Input.empty();
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.id = Input.empty();
        this.properties = Input.empty();
        this.queryPackName = Input.empty();
        this.related = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> body;
        private @Nullable Input<String> description;
        private Input<String> displayName;
        private @Nullable Input<String> id;
        private @Nullable Input<Object> properties;
        private Input<String> queryPackName;
        private @Nullable Input<LogAnalyticsQueryPackQueryPropertiesRelatedArgs> related;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,List<String>>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(QueryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.body = defaults.body;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.properties = defaults.properties;
    	      this.queryPackName = defaults.queryPackName;
    	      this.related = defaults.related;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder setBody(Input<String> body) {
            this.body = Objects.requireNonNull(body);
            return this;
        }

        public Builder setBody(String body) {
            this.body = Input.of(Objects.requireNonNull(body));
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDisplayName(Input<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Input.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setProperties(@Nullable Input<Object> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable Object properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder setQueryPackName(Input<String> queryPackName) {
            this.queryPackName = Objects.requireNonNull(queryPackName);
            return this;
        }

        public Builder setQueryPackName(String queryPackName) {
            this.queryPackName = Input.of(Objects.requireNonNull(queryPackName));
            return this;
        }

        public Builder setRelated(@Nullable Input<LogAnalyticsQueryPackQueryPropertiesRelatedArgs> related) {
            this.related = related;
            return this;
        }

        public Builder setRelated(@Nullable LogAnalyticsQueryPackQueryPropertiesRelatedArgs related) {
            this.related = Input.ofNullable(related);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,List<String>>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,List<String>> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public QueryArgs build() {
            return new QueryArgs(body, description, displayName, id, properties, queryPackName, related, resourceGroupName, tags);
        }
    }
}
