// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.healthcare_v1beta1.inputs.SearchParameterArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Contains the configuration for FHIR search.
 * 
 */
public final class SearchConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final SearchConfigArgs Empty = new SearchConfigArgs();

    /**
     * A list of search parameters in this FHIR store that are used to configure this FHIR store.
     * 
     */
    @InputImport(name="searchParameters")
      private final @Nullable Input<List<SearchParameterArgs>> searchParameters;

    public Input<List<SearchParameterArgs>> getSearchParameters() {
        return this.searchParameters == null ? Input.empty() : this.searchParameters;
    }

    public SearchConfigArgs(@Nullable Input<List<SearchParameterArgs>> searchParameters) {
        this.searchParameters = searchParameters;
    }

    private SearchConfigArgs() {
        this.searchParameters = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SearchConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<SearchParameterArgs>> searchParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(SearchConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.searchParameters = defaults.searchParameters;
        }

        public Builder setSearchParameters(@Nullable Input<List<SearchParameterArgs>> searchParameters) {
            this.searchParameters = searchParameters;
            return this;
        }

        public Builder setSearchParameters(@Nullable List<SearchParameterArgs> searchParameters) {
            this.searchParameters = Input.ofNullable(searchParameters);
            return this;
        }
        public SearchConfigArgs build() {
            return new SearchConfigArgs(searchParameters);
        }
    }
}
