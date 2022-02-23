// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Cursor methods for Mongodb query
 * 
 */
public final class MongoDbCursorMethodsPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final MongoDbCursorMethodsPropertiesArgs Empty = new MongoDbCursorMethodsPropertiesArgs();

    /**
     * Specifies the maximum number of documents the server returns. limit() is analogous to the LIMIT statement in a SQL database. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="limit")
        private final @Nullable Input<Object> limit;

    public Input<Object> getLimit() {
        return this.limit == null ? Input.empty() : this.limit;
    }

    /**
     * Specifies the fields to return in the documents that match the query filter. To return all fields in the matching documents, omit this parameter. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="project")
        private final @Nullable Input<Object> project;

    public Input<Object> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Specifies the how many documents skipped and where MongoDB begins returning results. This approach may be useful in implementing paginated results. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="skip")
        private final @Nullable Input<Object> skip;

    public Input<Object> getSkip() {
        return this.skip == null ? Input.empty() : this.skip;
    }

    /**
     * Specifies the order in which the query returns matching documents. Type: string (or Expression with resultType string). Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="sort")
        private final @Nullable Input<Object> sort;

    public Input<Object> getSort() {
        return this.sort == null ? Input.empty() : this.sort;
    }

    public MongoDbCursorMethodsPropertiesArgs(
        @Nullable Input<Object> limit,
        @Nullable Input<Object> project,
        @Nullable Input<Object> skip,
        @Nullable Input<Object> sort) {
        this.limit = limit;
        this.project = project;
        this.skip = skip;
        this.sort = sort;
    }

    private MongoDbCursorMethodsPropertiesArgs() {
        this.limit = Input.empty();
        this.project = Input.empty();
        this.skip = Input.empty();
        this.sort = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MongoDbCursorMethodsPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> limit;
        private @Nullable Input<Object> project;
        private @Nullable Input<Object> skip;
        private @Nullable Input<Object> sort;

        public Builder() {
    	      // Empty
        }

        public Builder(MongoDbCursorMethodsPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.limit = defaults.limit;
    	      this.project = defaults.project;
    	      this.skip = defaults.skip;
    	      this.sort = defaults.sort;
        }

        public Builder setLimit(@Nullable Input<Object> limit) {
            this.limit = limit;
            return this;
        }

        public Builder setLimit(@Nullable Object limit) {
            this.limit = Input.ofNullable(limit);
            return this;
        }

        public Builder setProject(@Nullable Input<Object> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable Object project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setSkip(@Nullable Input<Object> skip) {
            this.skip = skip;
            return this;
        }

        public Builder setSkip(@Nullable Object skip) {
            this.skip = Input.ofNullable(skip);
            return this;
        }

        public Builder setSort(@Nullable Input<Object> sort) {
            this.sort = sort;
            return this;
        }

        public Builder setSort(@Nullable Object sort) {
            this.sort = Input.ofNullable(sort);
            return this;
        }
        public MongoDbCursorMethodsPropertiesArgs build() {
            return new MongoDbCursorMethodsPropertiesArgs(limit, project, skip, sort);
        }
    }
}
