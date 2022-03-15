// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2alpha.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Maps a set of terms to a set of synonyms. Set of synonyms will be treated as synonyms of each query term only. `query_terms` will not be treated as synonyms of each other. Example: "sneakers" will use a synonym of "shoes". "shoes" will not use a synonym of "sneakers".
 * 
 */
public final class GoogleCloudRetailV2alphaRuleOnewaySynonymsActionResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRetailV2alphaRuleOnewaySynonymsActionResponse Empty = new GoogleCloudRetailV2alphaRuleOnewaySynonymsActionResponse();

    /**
     * Will be [deprecated = true] post migration;
     * 
     */
    @Import(name="onewayTerms", required=true)
      private final List<String> onewayTerms;

    public List<String> getOnewayTerms() {
        return this.onewayTerms;
    }

    /**
     * Terms from the search query. Will treat synonyms as their synonyms. Not themselves synonyms of the synonyms. Can specify up to 100 terms.
     * 
     */
    @Import(name="queryTerms", required=true)
      private final List<String> queryTerms;

    public List<String> getQueryTerms() {
        return this.queryTerms;
    }

    /**
     * Defines a set of synonyms. Cannot contain duplicates. Can specify up to 100 synonyms.
     * 
     */
    @Import(name="synonyms", required=true)
      private final List<String> synonyms;

    public List<String> getSynonyms() {
        return this.synonyms;
    }

    public GoogleCloudRetailV2alphaRuleOnewaySynonymsActionResponse(
        List<String> onewayTerms,
        List<String> queryTerms,
        List<String> synonyms) {
        this.onewayTerms = Objects.requireNonNull(onewayTerms, "expected parameter 'onewayTerms' to be non-null");
        this.queryTerms = Objects.requireNonNull(queryTerms, "expected parameter 'queryTerms' to be non-null");
        this.synonyms = Objects.requireNonNull(synonyms, "expected parameter 'synonyms' to be non-null");
    }

    private GoogleCloudRetailV2alphaRuleOnewaySynonymsActionResponse() {
        this.onewayTerms = List.of();
        this.queryTerms = List.of();
        this.synonyms = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2alphaRuleOnewaySynonymsActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> onewayTerms;
        private List<String> queryTerms;
        private List<String> synonyms;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2alphaRuleOnewaySynonymsActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.onewayTerms = defaults.onewayTerms;
    	      this.queryTerms = defaults.queryTerms;
    	      this.synonyms = defaults.synonyms;
        }

        public Builder onewayTerms(List<String> onewayTerms) {
            this.onewayTerms = Objects.requireNonNull(onewayTerms);
            return this;
        }

        public Builder queryTerms(List<String> queryTerms) {
            this.queryTerms = Objects.requireNonNull(queryTerms);
            return this;
        }

        public Builder synonyms(List<String> synonyms) {
            this.synonyms = Objects.requireNonNull(synonyms);
            return this;
        }
        public GoogleCloudRetailV2alphaRuleOnewaySynonymsActionResponse build() {
            return new GoogleCloudRetailV2alphaRuleOnewaySynonymsActionResponse(onewayTerms, queryTerms, synonyms);
        }
    }
}
