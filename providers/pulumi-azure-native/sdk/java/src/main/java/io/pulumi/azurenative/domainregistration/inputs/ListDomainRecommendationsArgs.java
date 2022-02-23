// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.domainregistration.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListDomainRecommendationsArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListDomainRecommendationsArgs Empty = new ListDomainRecommendationsArgs();

    /**
     * Keywords to be used for generating domain recommendations.
     * 
     */
    @InputImport(name="keywords")
        private final @Nullable String keywords;

    public Optional<String> getKeywords() {
        return this.keywords == null ? Optional.empty() : Optional.ofNullable(this.keywords);
    }

    /**
     * Maximum number of recommendations.
     * 
     */
    @InputImport(name="maxDomainRecommendations")
        private final @Nullable Integer maxDomainRecommendations;

    public Optional<Integer> getMaxDomainRecommendations() {
        return this.maxDomainRecommendations == null ? Optional.empty() : Optional.ofNullable(this.maxDomainRecommendations);
    }

    public ListDomainRecommendationsArgs(
        @Nullable String keywords,
        @Nullable Integer maxDomainRecommendations) {
        this.keywords = keywords;
        this.maxDomainRecommendations = maxDomainRecommendations;
    }

    private ListDomainRecommendationsArgs() {
        this.keywords = null;
        this.maxDomainRecommendations = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListDomainRecommendationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keywords;
        private @Nullable Integer maxDomainRecommendations;

        public Builder() {
    	      // Empty
        }

        public Builder(ListDomainRecommendationsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keywords = defaults.keywords;
    	      this.maxDomainRecommendations = defaults.maxDomainRecommendations;
        }

        public Builder setKeywords(@Nullable String keywords) {
            this.keywords = keywords;
            return this;
        }

        public Builder setMaxDomainRecommendations(@Nullable Integer maxDomainRecommendations) {
            this.maxDomainRecommendations = maxDomainRecommendations;
            return this;
        }
        public ListDomainRecommendationsArgs build() {
            return new ListDomainRecommendationsArgs(keywords, maxDomainRecommendations);
        }
    }
}
