// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudsearch_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.cloudsearch_v1.inputs.FilterOptionsArgs;
import io.pulumi.googlenative.cloudsearch_v1.inputs.SourceArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Restriction on Datasource.
 * 
 */
public final class DataSourceRestrictionArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceRestrictionArgs Empty = new DataSourceRestrictionArgs();

    /**
     * Filter options restricting the results. If multiple filters are present, they are grouped by object type before joining. Filters with the same object type are joined conjunctively, then the resulting expressions are joined disjunctively. The maximum number of elements is 20. NOTE: Suggest API supports only few filters at the moment: "objecttype", "type" and "mimetype". For now, schema specific filters cannot be used to filter suggestions.
     * 
     */
    @InputImport(name="filterOptions")
      private final @Nullable Input<List<FilterOptionsArgs>> filterOptions;

    public Input<List<FilterOptionsArgs>> getFilterOptions() {
        return this.filterOptions == null ? Input.empty() : this.filterOptions;
    }

    /**
     * The source of restriction.
     * 
     */
    @InputImport(name="source")
      private final @Nullable Input<SourceArgs> source;

    public Input<SourceArgs> getSource() {
        return this.source == null ? Input.empty() : this.source;
    }

    public DataSourceRestrictionArgs(
        @Nullable Input<List<FilterOptionsArgs>> filterOptions,
        @Nullable Input<SourceArgs> source) {
        this.filterOptions = filterOptions;
        this.source = source;
    }

    private DataSourceRestrictionArgs() {
        this.filterOptions = Input.empty();
        this.source = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceRestrictionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<FilterOptionsArgs>> filterOptions;
        private @Nullable Input<SourceArgs> source;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceRestrictionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filterOptions = defaults.filterOptions;
    	      this.source = defaults.source;
        }

        public Builder setFilterOptions(@Nullable Input<List<FilterOptionsArgs>> filterOptions) {
            this.filterOptions = filterOptions;
            return this;
        }

        public Builder setFilterOptions(@Nullable List<FilterOptionsArgs> filterOptions) {
            this.filterOptions = Input.ofNullable(filterOptions);
            return this;
        }

        public Builder setSource(@Nullable Input<SourceArgs> source) {
            this.source = source;
            return this;
        }

        public Builder setSource(@Nullable SourceArgs source) {
            this.source = Input.ofNullable(source);
            return this;
        }
        public DataSourceRestrictionArgs build() {
            return new DataSourceRestrictionArgs(filterOptions, source);
        }
    }
}
