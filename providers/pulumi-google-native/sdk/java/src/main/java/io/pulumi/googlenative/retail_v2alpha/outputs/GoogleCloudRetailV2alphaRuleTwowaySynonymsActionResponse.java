// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudRetailV2alphaRuleTwowaySynonymsActionResponse {
    /**
     * Defines a set of synonyms. Can specify up to 100 synonyms. Must specify at least 2 synonyms.
     * 
     */
    private final List<String> synonyms;

    @OutputCustomType.Constructor({"synonyms"})
    private GoogleCloudRetailV2alphaRuleTwowaySynonymsActionResponse(List<String> synonyms) {
        this.synonyms = Objects.requireNonNull(synonyms);
    }

    /**
     * Defines a set of synonyms. Can specify up to 100 synonyms. Must specify at least 2 synonyms.
     * 
     */
    public List<String> getSynonyms() {
        return this.synonyms;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2alphaRuleTwowaySynonymsActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> synonyms;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2alphaRuleTwowaySynonymsActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.synonyms = defaults.synonyms;
        }

        public Builder setSynonyms(List<String> synonyms) {
            this.synonyms = Objects.requireNonNull(synonyms);
            return this;
        }
        public GoogleCloudRetailV2alphaRuleTwowaySynonymsActionResponse build() {
            return new GoogleCloudRetailV2alphaRuleTwowaySynonymsActionResponse(synonyms);
        }
    }
}
