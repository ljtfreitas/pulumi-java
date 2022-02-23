// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class URLMapPathMatcherRouteRuleMatchRuleQueryParameterMatch {
    /**
     * The queryParameterMatch matches if the value of the parameter exactly matches
     * the contents of exactMatch. Only one of presentMatch, exactMatch and regexMatch
     * must be set.
     * 
     */
    private final @Nullable String exactMatch;
    /**
     * The name of the query parameter to match. The query parameter must exist in the
     * request, in the absence of which the request match fails.
     * 
     */
    private final String name;
    /**
     * Specifies that the queryParameterMatch matches if the request contains the query
     * parameter, irrespective of whether the parameter has a value or not. Only one of
     * presentMatch, exactMatch and regexMatch must be set.
     * 
     */
    private final @Nullable Boolean presentMatch;
    /**
     * The queryParameterMatch matches if the value of the parameter matches the
     * regular expression specified by regexMatch. For the regular expression grammar,
     * please see en.cppreference.com/w/cpp/regex/ecmascript  Only one of presentMatch,
     * exactMatch and regexMatch must be set.
     * 
     */
    private final @Nullable String regexMatch;

    @OutputCustomType.Constructor({"exactMatch","name","presentMatch","regexMatch"})
    private URLMapPathMatcherRouteRuleMatchRuleQueryParameterMatch(
        @Nullable String exactMatch,
        String name,
        @Nullable Boolean presentMatch,
        @Nullable String regexMatch) {
        this.exactMatch = exactMatch;
        this.name = Objects.requireNonNull(name);
        this.presentMatch = presentMatch;
        this.regexMatch = regexMatch;
    }

    /**
     * The queryParameterMatch matches if the value of the parameter exactly matches
     * the contents of exactMatch. Only one of presentMatch, exactMatch and regexMatch
     * must be set.
     * 
     */
    public Optional<String> getExactMatch() {
        return Optional.ofNullable(this.exactMatch);
    }
    /**
     * The name of the query parameter to match. The query parameter must exist in the
     * request, in the absence of which the request match fails.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Specifies that the queryParameterMatch matches if the request contains the query
     * parameter, irrespective of whether the parameter has a value or not. Only one of
     * presentMatch, exactMatch and regexMatch must be set.
     * 
     */
    public Optional<Boolean> getPresentMatch() {
        return Optional.ofNullable(this.presentMatch);
    }
    /**
     * The queryParameterMatch matches if the value of the parameter matches the
     * regular expression specified by regexMatch. For the regular expression grammar,
     * please see en.cppreference.com/w/cpp/regex/ecmascript  Only one of presentMatch,
     * exactMatch and regexMatch must be set.
     * 
     */
    public Optional<String> getRegexMatch() {
        return Optional.ofNullable(this.regexMatch);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapPathMatcherRouteRuleMatchRuleQueryParameterMatch defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String exactMatch;
        private String name;
        private @Nullable Boolean presentMatch;
        private @Nullable String regexMatch;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapPathMatcherRouteRuleMatchRuleQueryParameterMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exactMatch = defaults.exactMatch;
    	      this.name = defaults.name;
    	      this.presentMatch = defaults.presentMatch;
    	      this.regexMatch = defaults.regexMatch;
        }

        public Builder setExactMatch(@Nullable String exactMatch) {
            this.exactMatch = exactMatch;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPresentMatch(@Nullable Boolean presentMatch) {
            this.presentMatch = presentMatch;
            return this;
        }

        public Builder setRegexMatch(@Nullable String regexMatch) {
            this.regexMatch = regexMatch;
            return this;
        }
        public URLMapPathMatcherRouteRuleMatchRuleQueryParameterMatch build() {
            return new URLMapPathMatcherRouteRuleMatchRuleQueryParameterMatch(exactMatch, name, presentMatch, regexMatch);
        }
    }
}
