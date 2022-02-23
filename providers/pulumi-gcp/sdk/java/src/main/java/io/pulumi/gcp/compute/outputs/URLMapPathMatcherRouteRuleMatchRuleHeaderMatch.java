// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.URLMapPathMatcherRouteRuleMatchRuleHeaderMatchRangeMatch;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class URLMapPathMatcherRouteRuleMatchRuleHeaderMatch {
    /**
     * The queryParameterMatch matches if the value of the parameter exactly matches
     * the contents of exactMatch. Only one of presentMatch, exactMatch and regexMatch
     * must be set.
     * 
     */
    private final @Nullable String exactMatch;
    /**
     * The name of the header to add.
     * 
     */
    private final String headerName;
    /**
     * If set to false, the headerMatch is considered a match if the match criteria
     * above are met. If set to true, the headerMatch is considered a match if the
     * match criteria above are NOT met. Defaults to false.
     * 
     */
    private final @Nullable Boolean invertMatch;
    /**
     * The value of the header must start with the contents of prefixMatch. Only one of
     * exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch
     * must be set.
     * 
     */
    private final @Nullable String prefixMatch;
    /**
     * Specifies that the queryParameterMatch matches if the request contains the query
     * parameter, irrespective of whether the parameter has a value or not. Only one of
     * presentMatch, exactMatch and regexMatch must be set.
     * 
     */
    private final @Nullable Boolean presentMatch;
    /**
     * The header value must be an integer and its value must be in the range specified
     * in rangeMatch. If the header does not contain an integer, number or is empty,
     * the match fails. For example for a range [-5, 0]   - -3 will match.  - 0 will
     * not match.  - 0.25 will not match.  - -3someString will not match.   Only one of
     * exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch
     * must be set.
     * Structure is documented below.
     * 
     */
    private final @Nullable URLMapPathMatcherRouteRuleMatchRuleHeaderMatchRangeMatch rangeMatch;
    /**
     * The queryParameterMatch matches if the value of the parameter matches the
     * regular expression specified by regexMatch. For the regular expression grammar,
     * please see en.cppreference.com/w/cpp/regex/ecmascript  Only one of presentMatch,
     * exactMatch and regexMatch must be set.
     * 
     */
    private final @Nullable String regexMatch;
    /**
     * The value of the header must end with the contents of suffixMatch. Only one of
     * exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch
     * must be set.
     * 
     */
    private final @Nullable String suffixMatch;

    @OutputCustomType.Constructor({"exactMatch","headerName","invertMatch","prefixMatch","presentMatch","rangeMatch","regexMatch","suffixMatch"})
    private URLMapPathMatcherRouteRuleMatchRuleHeaderMatch(
        @Nullable String exactMatch,
        String headerName,
        @Nullable Boolean invertMatch,
        @Nullable String prefixMatch,
        @Nullable Boolean presentMatch,
        @Nullable URLMapPathMatcherRouteRuleMatchRuleHeaderMatchRangeMatch rangeMatch,
        @Nullable String regexMatch,
        @Nullable String suffixMatch) {
        this.exactMatch = exactMatch;
        this.headerName = Objects.requireNonNull(headerName);
        this.invertMatch = invertMatch;
        this.prefixMatch = prefixMatch;
        this.presentMatch = presentMatch;
        this.rangeMatch = rangeMatch;
        this.regexMatch = regexMatch;
        this.suffixMatch = suffixMatch;
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
     * The name of the header to add.
     * 
     */
    public String getHeaderName() {
        return this.headerName;
    }
    /**
     * If set to false, the headerMatch is considered a match if the match criteria
     * above are met. If set to true, the headerMatch is considered a match if the
     * match criteria above are NOT met. Defaults to false.
     * 
     */
    public Optional<Boolean> getInvertMatch() {
        return Optional.ofNullable(this.invertMatch);
    }
    /**
     * The value of the header must start with the contents of prefixMatch. Only one of
     * exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch
     * must be set.
     * 
     */
    public Optional<String> getPrefixMatch() {
        return Optional.ofNullable(this.prefixMatch);
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
     * The header value must be an integer and its value must be in the range specified
     * in rangeMatch. If the header does not contain an integer, number or is empty,
     * the match fails. For example for a range [-5, 0]   - -3 will match.  - 0 will
     * not match.  - 0.25 will not match.  - -3someString will not match.   Only one of
     * exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch
     * must be set.
     * Structure is documented below.
     * 
     */
    public Optional<URLMapPathMatcherRouteRuleMatchRuleHeaderMatchRangeMatch> getRangeMatch() {
        return Optional.ofNullable(this.rangeMatch);
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
    /**
     * The value of the header must end with the contents of suffixMatch. Only one of
     * exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch
     * must be set.
     * 
     */
    public Optional<String> getSuffixMatch() {
        return Optional.ofNullable(this.suffixMatch);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapPathMatcherRouteRuleMatchRuleHeaderMatch defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String exactMatch;
        private String headerName;
        private @Nullable Boolean invertMatch;
        private @Nullable String prefixMatch;
        private @Nullable Boolean presentMatch;
        private @Nullable URLMapPathMatcherRouteRuleMatchRuleHeaderMatchRangeMatch rangeMatch;
        private @Nullable String regexMatch;
        private @Nullable String suffixMatch;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapPathMatcherRouteRuleMatchRuleHeaderMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exactMatch = defaults.exactMatch;
    	      this.headerName = defaults.headerName;
    	      this.invertMatch = defaults.invertMatch;
    	      this.prefixMatch = defaults.prefixMatch;
    	      this.presentMatch = defaults.presentMatch;
    	      this.rangeMatch = defaults.rangeMatch;
    	      this.regexMatch = defaults.regexMatch;
    	      this.suffixMatch = defaults.suffixMatch;
        }

        public Builder setExactMatch(@Nullable String exactMatch) {
            this.exactMatch = exactMatch;
            return this;
        }

        public Builder setHeaderName(String headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }

        public Builder setInvertMatch(@Nullable Boolean invertMatch) {
            this.invertMatch = invertMatch;
            return this;
        }

        public Builder setPrefixMatch(@Nullable String prefixMatch) {
            this.prefixMatch = prefixMatch;
            return this;
        }

        public Builder setPresentMatch(@Nullable Boolean presentMatch) {
            this.presentMatch = presentMatch;
            return this;
        }

        public Builder setRangeMatch(@Nullable URLMapPathMatcherRouteRuleMatchRuleHeaderMatchRangeMatch rangeMatch) {
            this.rangeMatch = rangeMatch;
            return this;
        }

        public Builder setRegexMatch(@Nullable String regexMatch) {
            this.regexMatch = regexMatch;
            return this;
        }

        public Builder setSuffixMatch(@Nullable String suffixMatch) {
            this.suffixMatch = suffixMatch;
            return this;
        }
        public URLMapPathMatcherRouteRuleMatchRuleHeaderMatch build() {
            return new URLMapPathMatcherRouteRuleMatchRuleHeaderMatch(exactMatch, headerName, invertMatch, prefixMatch, presentMatch, rangeMatch, regexMatch, suffixMatch);
        }
    }
}
