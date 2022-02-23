// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IndexSearchArgs extends io.pulumi.resources.ResourceArgs {

    public static final IndexSearchArgs Empty = new IndexSearchArgs();

    @InputImport(name="displayable")
        private final @Nullable Input<Boolean> displayable;

    public Input<Boolean> getDisplayable() {
        return this.displayable == null ? Input.empty() : this.displayable;
    }

    @InputImport(name="facetable")
        private final @Nullable Input<Boolean> facetable;

    public Input<Boolean> getFacetable() {
        return this.facetable == null ? Input.empty() : this.facetable;
    }

    @InputImport(name="searchable")
        private final @Nullable Input<Boolean> searchable;

    public Input<Boolean> getSearchable() {
        return this.searchable == null ? Input.empty() : this.searchable;
    }

    @InputImport(name="sortable")
        private final @Nullable Input<Boolean> sortable;

    public Input<Boolean> getSortable() {
        return this.sortable == null ? Input.empty() : this.sortable;
    }

    public IndexSearchArgs(
        @Nullable Input<Boolean> displayable,
        @Nullable Input<Boolean> facetable,
        @Nullable Input<Boolean> searchable,
        @Nullable Input<Boolean> sortable) {
        this.displayable = displayable;
        this.facetable = facetable;
        this.searchable = searchable;
        this.sortable = sortable;
    }

    private IndexSearchArgs() {
        this.displayable = Input.empty();
        this.facetable = Input.empty();
        this.searchable = Input.empty();
        this.sortable = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IndexSearchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> displayable;
        private @Nullable Input<Boolean> facetable;
        private @Nullable Input<Boolean> searchable;
        private @Nullable Input<Boolean> sortable;

        public Builder() {
    	      // Empty
        }

        public Builder(IndexSearchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayable = defaults.displayable;
    	      this.facetable = defaults.facetable;
    	      this.searchable = defaults.searchable;
    	      this.sortable = defaults.sortable;
        }

        public Builder setDisplayable(@Nullable Input<Boolean> displayable) {
            this.displayable = displayable;
            return this;
        }

        public Builder setDisplayable(@Nullable Boolean displayable) {
            this.displayable = Input.ofNullable(displayable);
            return this;
        }

        public Builder setFacetable(@Nullable Input<Boolean> facetable) {
            this.facetable = facetable;
            return this;
        }

        public Builder setFacetable(@Nullable Boolean facetable) {
            this.facetable = Input.ofNullable(facetable);
            return this;
        }

        public Builder setSearchable(@Nullable Input<Boolean> searchable) {
            this.searchable = searchable;
            return this;
        }

        public Builder setSearchable(@Nullable Boolean searchable) {
            this.searchable = Input.ofNullable(searchable);
            return this;
        }

        public Builder setSortable(@Nullable Input<Boolean> sortable) {
            this.sortable = sortable;
            return this;
        }

        public Builder setSortable(@Nullable Boolean sortable) {
            this.sortable = Input.ofNullable(sortable);
            return this;
        }
        public IndexSearchArgs build() {
            return new IndexSearchArgs(displayable, facetable, searchable, sortable);
        }
    }
}
