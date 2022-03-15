// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Prevents a term in the query from being used in search. Example: Don't search for "shoddy".
 * 
 */
public final class GoogleCloudRetailV2betaRuleIgnoreActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRetailV2betaRuleIgnoreActionArgs Empty = new GoogleCloudRetailV2betaRuleIgnoreActionArgs();

    /**
     * Terms to ignore in the search query.
     * 
     */
    @Import(name="ignoreTerms")
      private final @Nullable Output<List<String>> ignoreTerms;

    public Output<List<String>> getIgnoreTerms() {
        return this.ignoreTerms == null ? Output.empty() : this.ignoreTerms;
    }

    public GoogleCloudRetailV2betaRuleIgnoreActionArgs(@Nullable Output<List<String>> ignoreTerms) {
        this.ignoreTerms = ignoreTerms;
    }

    private GoogleCloudRetailV2betaRuleIgnoreActionArgs() {
        this.ignoreTerms = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2betaRuleIgnoreActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> ignoreTerms;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2betaRuleIgnoreActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ignoreTerms = defaults.ignoreTerms;
        }

        public Builder ignoreTerms(@Nullable Output<List<String>> ignoreTerms) {
            this.ignoreTerms = ignoreTerms;
            return this;
        }

        public Builder ignoreTerms(@Nullable List<String> ignoreTerms) {
            this.ignoreTerms = Output.ofNullable(ignoreTerms);
            return this;
        }
        public GoogleCloudRetailV2betaRuleIgnoreActionArgs build() {
            return new GoogleCloudRetailV2betaRuleIgnoreActionArgs(ignoreTerms);
        }
    }
}
