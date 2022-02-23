// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WebACLJsonMatchPattern {
    /**
     * Inspect all parts of the web request's JSON body.
     * 
     */
    private final @Nullable Object all;
    private final @Nullable List<String> includedPaths;

    @OutputCustomType.Constructor({"all","includedPaths"})
    private WebACLJsonMatchPattern(
        @Nullable Object all,
        @Nullable List<String> includedPaths) {
        this.all = all;
        this.includedPaths = includedPaths;
    }

    /**
     * Inspect all parts of the web request's JSON body.
     * 
     */
    public Optional<Object> getAll() {
        return Optional.ofNullable(this.all);
    }
    public List<String> getIncludedPaths() {
        return this.includedPaths == null ? List.of() : this.includedPaths;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLJsonMatchPattern defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object all;
        private @Nullable List<String> includedPaths;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLJsonMatchPattern defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.all = defaults.all;
    	      this.includedPaths = defaults.includedPaths;
        }

        public Builder setAll(@Nullable Object all) {
            this.all = all;
            return this;
        }

        public Builder setIncludedPaths(@Nullable List<String> includedPaths) {
            this.includedPaths = includedPaths;
            return this;
        }
        public WebACLJsonMatchPattern build() {
            return new WebACLJsonMatchPattern(all, includedPaths);
        }
    }
}
