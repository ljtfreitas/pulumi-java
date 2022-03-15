// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchRangeMatchGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchGetArgs Empty = new RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchGetArgs();

    /**
     * The queryParameterMatch matches if the value of the parameter exactly matches
     * the contents of exactMatch. Only one of presentMatch, exactMatch and regexMatch
     * must be set.
     * 
     */
    @Import(name="exactMatch")
      private final @Nullable Output<String> exactMatch;

    public Output<String> getExactMatch() {
        return this.exactMatch == null ? Output.empty() : this.exactMatch;
    }

    /**
     * The name of the header.
     * 
     */
    @Import(name="headerName", required=true)
      private final Output<String> headerName;

    public Output<String> getHeaderName() {
        return this.headerName;
    }

    /**
     * If set to false, the headerMatch is considered a match if the match criteria
     * above are met. If set to true, the headerMatch is considered a match if the
     * match criteria above are NOT met. Defaults to false.
     * 
     */
    @Import(name="invertMatch")
      private final @Nullable Output<Boolean> invertMatch;

    public Output<Boolean> getInvertMatch() {
        return this.invertMatch == null ? Output.empty() : this.invertMatch;
    }

    /**
     * The value of the header must start with the contents of prefixMatch. Only one of
     * exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch
     * must be set.
     * 
     */
    @Import(name="prefixMatch")
      private final @Nullable Output<String> prefixMatch;

    public Output<String> getPrefixMatch() {
        return this.prefixMatch == null ? Output.empty() : this.prefixMatch;
    }

    /**
     * Specifies that the queryParameterMatch matches if the request contains the query
     * parameter, irrespective of whether the parameter has a value or not. Only one of
     * presentMatch, exactMatch and regexMatch must be set.
     * 
     */
    @Import(name="presentMatch")
      private final @Nullable Output<Boolean> presentMatch;

    public Output<Boolean> getPresentMatch() {
        return this.presentMatch == null ? Output.empty() : this.presentMatch;
    }

    /**
     * The header value must be an integer and its value must be in the range specified
     * in rangeMatch. If the header does not contain an integer, number or is empty,
     * the match fails. For example for a range [-5, 0]
     * * -3 will match
     * * 0 will not match
     * * 0.25 will not match
     * * -3someString will not match.
     *   Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or
     *   rangeMatch must be set.
     *   Structure is documented below.
     * 
     */
    @Import(name="rangeMatch")
      private final @Nullable Output<RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchRangeMatchGetArgs> rangeMatch;

    public Output<RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchRangeMatchGetArgs> getRangeMatch() {
        return this.rangeMatch == null ? Output.empty() : this.rangeMatch;
    }

    /**
     * The queryParameterMatch matches if the value of the parameter matches the
     * regular expression specified by regexMatch. For the regular expression grammar,
     * please see en.cppreference.com/w/cpp/regex/ecmascript  Only one of presentMatch,
     * exactMatch and regexMatch must be set.
     * 
     */
    @Import(name="regexMatch")
      private final @Nullable Output<String> regexMatch;

    public Output<String> getRegexMatch() {
        return this.regexMatch == null ? Output.empty() : this.regexMatch;
    }

    /**
     * The value of the header must end with the contents of suffixMatch. Only one of
     * exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch
     * must be set.
     * 
     */
    @Import(name="suffixMatch")
      private final @Nullable Output<String> suffixMatch;

    public Output<String> getSuffixMatch() {
        return this.suffixMatch == null ? Output.empty() : this.suffixMatch;
    }

    public RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchGetArgs(
        @Nullable Output<String> exactMatch,
        Output<String> headerName,
        @Nullable Output<Boolean> invertMatch,
        @Nullable Output<String> prefixMatch,
        @Nullable Output<Boolean> presentMatch,
        @Nullable Output<RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchRangeMatchGetArgs> rangeMatch,
        @Nullable Output<String> regexMatch,
        @Nullable Output<String> suffixMatch) {
        this.exactMatch = exactMatch;
        this.headerName = Objects.requireNonNull(headerName, "expected parameter 'headerName' to be non-null");
        this.invertMatch = invertMatch;
        this.prefixMatch = prefixMatch;
        this.presentMatch = presentMatch;
        this.rangeMatch = rangeMatch;
        this.regexMatch = regexMatch;
        this.suffixMatch = suffixMatch;
    }

    private RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchGetArgs() {
        this.exactMatch = Output.empty();
        this.headerName = Output.empty();
        this.invertMatch = Output.empty();
        this.prefixMatch = Output.empty();
        this.presentMatch = Output.empty();
        this.rangeMatch = Output.empty();
        this.regexMatch = Output.empty();
        this.suffixMatch = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> exactMatch;
        private Output<String> headerName;
        private @Nullable Output<Boolean> invertMatch;
        private @Nullable Output<String> prefixMatch;
        private @Nullable Output<Boolean> presentMatch;
        private @Nullable Output<RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchRangeMatchGetArgs> rangeMatch;
        private @Nullable Output<String> regexMatch;
        private @Nullable Output<String> suffixMatch;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchGetArgs defaults) {
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

        public Builder exactMatch(@Nullable Output<String> exactMatch) {
            this.exactMatch = exactMatch;
            return this;
        }

        public Builder exactMatch(@Nullable String exactMatch) {
            this.exactMatch = Output.ofNullable(exactMatch);
            return this;
        }

        public Builder headerName(Output<String> headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }

        public Builder headerName(String headerName) {
            this.headerName = Output.of(Objects.requireNonNull(headerName));
            return this;
        }

        public Builder invertMatch(@Nullable Output<Boolean> invertMatch) {
            this.invertMatch = invertMatch;
            return this;
        }

        public Builder invertMatch(@Nullable Boolean invertMatch) {
            this.invertMatch = Output.ofNullable(invertMatch);
            return this;
        }

        public Builder prefixMatch(@Nullable Output<String> prefixMatch) {
            this.prefixMatch = prefixMatch;
            return this;
        }

        public Builder prefixMatch(@Nullable String prefixMatch) {
            this.prefixMatch = Output.ofNullable(prefixMatch);
            return this;
        }

        public Builder presentMatch(@Nullable Output<Boolean> presentMatch) {
            this.presentMatch = presentMatch;
            return this;
        }

        public Builder presentMatch(@Nullable Boolean presentMatch) {
            this.presentMatch = Output.ofNullable(presentMatch);
            return this;
        }

        public Builder rangeMatch(@Nullable Output<RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchRangeMatchGetArgs> rangeMatch) {
            this.rangeMatch = rangeMatch;
            return this;
        }

        public Builder rangeMatch(@Nullable RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchRangeMatchGetArgs rangeMatch) {
            this.rangeMatch = Output.ofNullable(rangeMatch);
            return this;
        }

        public Builder regexMatch(@Nullable Output<String> regexMatch) {
            this.regexMatch = regexMatch;
            return this;
        }

        public Builder regexMatch(@Nullable String regexMatch) {
            this.regexMatch = Output.ofNullable(regexMatch);
            return this;
        }

        public Builder suffixMatch(@Nullable Output<String> suffixMatch) {
            this.suffixMatch = suffixMatch;
            return this;
        }

        public Builder suffixMatch(@Nullable String suffixMatch) {
            this.suffixMatch = Output.ofNullable(suffixMatch);
            return this;
        }
        public RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchGetArgs build() {
            return new RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchGetArgs(exactMatch, headerName, invertMatch, prefixMatch, presentMatch, rangeMatch, regexMatch, suffixMatch);
        }
    }
}
