// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.configuration;

import io.pulumi.awsnative.configuration.inputs.StoredQueryTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StoredQueryArgs extends io.pulumi.resources.ResourceArgs {

    public static final StoredQueryArgs Empty = new StoredQueryArgs();

    @InputImport(name="queryDescription")
        private final @Nullable Input<String> queryDescription;

    public Input<String> getQueryDescription() {
        return this.queryDescription == null ? Input.empty() : this.queryDescription;
    }

    @InputImport(name="queryExpression", required=true)
        private final Input<String> queryExpression;

    public Input<String> getQueryExpression() {
        return this.queryExpression;
    }

    @InputImport(name="queryName", required=true)
        private final Input<String> queryName;

    public Input<String> getQueryName() {
        return this.queryName;
    }

    /**
     * The tags for the stored query.
     * 
     */
    @InputImport(name="tags")
        private final @Nullable Input<List<StoredQueryTagArgs>> tags;

    public Input<List<StoredQueryTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public StoredQueryArgs(
        @Nullable Input<String> queryDescription,
        Input<String> queryExpression,
        Input<String> queryName,
        @Nullable Input<List<StoredQueryTagArgs>> tags) {
        this.queryDescription = queryDescription;
        this.queryExpression = Objects.requireNonNull(queryExpression, "expected parameter 'queryExpression' to be non-null");
        this.queryName = Objects.requireNonNull(queryName, "expected parameter 'queryName' to be non-null");
        this.tags = tags;
    }

    private StoredQueryArgs() {
        this.queryDescription = Input.empty();
        this.queryExpression = Input.empty();
        this.queryName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StoredQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> queryDescription;
        private Input<String> queryExpression;
        private Input<String> queryName;
        private @Nullable Input<List<StoredQueryTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(StoredQueryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queryDescription = defaults.queryDescription;
    	      this.queryExpression = defaults.queryExpression;
    	      this.queryName = defaults.queryName;
    	      this.tags = defaults.tags;
        }

        public Builder setQueryDescription(@Nullable Input<String> queryDescription) {
            this.queryDescription = queryDescription;
            return this;
        }

        public Builder setQueryDescription(@Nullable String queryDescription) {
            this.queryDescription = Input.ofNullable(queryDescription);
            return this;
        }

        public Builder setQueryExpression(Input<String> queryExpression) {
            this.queryExpression = Objects.requireNonNull(queryExpression);
            return this;
        }

        public Builder setQueryExpression(String queryExpression) {
            this.queryExpression = Input.of(Objects.requireNonNull(queryExpression));
            return this;
        }

        public Builder setQueryName(Input<String> queryName) {
            this.queryName = Objects.requireNonNull(queryName);
            return this;
        }

        public Builder setQueryName(String queryName) {
            this.queryName = Input.of(Objects.requireNonNull(queryName));
            return this;
        }

        public Builder setTags(@Nullable Input<List<StoredQueryTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<StoredQueryTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public StoredQueryArgs build() {
            return new StoredQueryArgs(queryDescription, queryExpression, queryName, tags);
        }
    }
}
