// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="limit")
      private final @Nullable Output<Object> limit;

    public Output<Object> getLimit() {
        return this.limit == null ? Output.empty() : this.limit;
    }

    /**
     * Specifies the fields to return in the documents that match the query filter. To return all fields in the matching documents, omit this parameter. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="project")
      private final @Nullable Output<Object> project;

    public Output<Object> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * Specifies the how many documents skipped and where MongoDB begins returning results. This approach may be useful in implementing paginated results. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="skip")
      private final @Nullable Output<Object> skip;

    public Output<Object> getSkip() {
        return this.skip == null ? Output.empty() : this.skip;
    }

    /**
     * Specifies the order in which the query returns matching documents. Type: string (or Expression with resultType string). Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="sort")
      private final @Nullable Output<Object> sort;

    public Output<Object> getSort() {
        return this.sort == null ? Output.empty() : this.sort;
    }

    public MongoDbCursorMethodsPropertiesArgs(
        @Nullable Output<Object> limit,
        @Nullable Output<Object> project,
        @Nullable Output<Object> skip,
        @Nullable Output<Object> sort) {
        this.limit = limit;
        this.project = project;
        this.skip = skip;
        this.sort = sort;
    }

    private MongoDbCursorMethodsPropertiesArgs() {
        this.limit = Output.empty();
        this.project = Output.empty();
        this.skip = Output.empty();
        this.sort = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MongoDbCursorMethodsPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> limit;
        private @Nullable Output<Object> project;
        private @Nullable Output<Object> skip;
        private @Nullable Output<Object> sort;

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

        public Builder limit(@Nullable Output<Object> limit) {
            this.limit = limit;
            return this;
        }

        public Builder limit(@Nullable Object limit) {
            this.limit = Output.ofNullable(limit);
            return this;
        }

        public Builder project(@Nullable Output<Object> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable Object project) {
            this.project = Output.ofNullable(project);
            return this;
        }

        public Builder skip(@Nullable Output<Object> skip) {
            this.skip = skip;
            return this;
        }

        public Builder skip(@Nullable Object skip) {
            this.skip = Output.ofNullable(skip);
            return this;
        }

        public Builder sort(@Nullable Output<Object> sort) {
            this.sort = sort;
            return this;
        }

        public Builder sort(@Nullable Object sort) {
            this.sort = Output.ofNullable(sort);
            return this;
        }
        public MongoDbCursorMethodsPropertiesArgs build() {
            return new MongoDbCursorMethodsPropertiesArgs(limit, project, skip, sort);
        }
    }
}
