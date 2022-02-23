// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The pattern to look for in the JSON body.
 * 
 */
public final class WebACLJsonMatchPatternArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebACLJsonMatchPatternArgs Empty = new WebACLJsonMatchPatternArgs();

    /**
     * Inspect all parts of the web request's JSON body.
     * 
     */
    @InputImport(name="all")
        private final @Nullable Input<Object> all;

    public Input<Object> getAll() {
        return this.all == null ? Input.empty() : this.all;
    }

    @InputImport(name="includedPaths")
        private final @Nullable Input<List<String>> includedPaths;

    public Input<List<String>> getIncludedPaths() {
        return this.includedPaths == null ? Input.empty() : this.includedPaths;
    }

    public WebACLJsonMatchPatternArgs(
        @Nullable Input<Object> all,
        @Nullable Input<List<String>> includedPaths) {
        this.all = all;
        this.includedPaths = includedPaths;
    }

    private WebACLJsonMatchPatternArgs() {
        this.all = Input.empty();
        this.includedPaths = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLJsonMatchPatternArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> all;
        private @Nullable Input<List<String>> includedPaths;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLJsonMatchPatternArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.all = defaults.all;
    	      this.includedPaths = defaults.includedPaths;
        }

        public Builder setAll(@Nullable Input<Object> all) {
            this.all = all;
            return this;
        }

        public Builder setAll(@Nullable Object all) {
            this.all = Input.ofNullable(all);
            return this;
        }

        public Builder setIncludedPaths(@Nullable Input<List<String>> includedPaths) {
            this.includedPaths = includedPaths;
            return this;
        }

        public Builder setIncludedPaths(@Nullable List<String> includedPaths) {
            this.includedPaths = Input.ofNullable(includedPaths);
            return this;
        }
        public WebACLJsonMatchPatternArgs build() {
            return new WebACLJsonMatchPatternArgs(all, includedPaths);
        }
    }
}
