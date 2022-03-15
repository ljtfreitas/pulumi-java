// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchArgs;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterArgs;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionUrlMapPathMatcherRouteRuleMatchRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionUrlMapPathMatcherRouteRuleMatchRuleArgs Empty = new RegionUrlMapPathMatcherRouteRuleMatchRuleArgs();

    /**
     * For satisfying the matchRule condition, the path of the request must exactly
     * match the value specified in fullPathMatch after removing any query parameters
     * and anchor that may be part of the original URL. FullPathMatch must be between 1
     * and 1024 characters. Only one of prefixMatch, fullPathMatch or regexMatch must
     * be specified.
     * 
     */
    @Import(name="fullPathMatch")
      private final @Nullable Output<String> fullPathMatch;

    public Output<String> getFullPathMatch() {
        return this.fullPathMatch == null ? Output.empty() : this.fullPathMatch;
    }

    /**
     * Specifies a list of header match criteria, all of which must match corresponding
     * headers in the request.
     * Structure is documented below.
     * 
     */
    @Import(name="headerMatches")
      private final @Nullable Output<List<RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchArgs>> headerMatches;

    public Output<List<RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchArgs>> getHeaderMatches() {
        return this.headerMatches == null ? Output.empty() : this.headerMatches;
    }

    /**
     * Specifies that prefixMatch and fullPathMatch matches are case sensitive.
     * Defaults to false.
     * 
     */
    @Import(name="ignoreCase")
      private final @Nullable Output<Boolean> ignoreCase;

    public Output<Boolean> getIgnoreCase() {
        return this.ignoreCase == null ? Output.empty() : this.ignoreCase;
    }

    /**
     * Opaque filter criteria used by Loadbalancer to restrict routing configuration to
     * a limited set xDS compliant clients. In their xDS requests to Loadbalancer, xDS
     * clients present node metadata. If a match takes place, the relevant routing
     * configuration is made available to those proxies. For each metadataFilter in
     * this list, if its filterMatchCriteria is set to MATCH_ANY, at least one of the
     * filterLabels must match the corresponding label provided in the metadata. If its
     * filterMatchCriteria is set to MATCH_ALL, then all of its filterLabels must match
     * with corresponding labels in the provided metadata. metadataFilters specified
     * here can be overrides those specified in ForwardingRule that refers to this
     * UrlMap. metadataFilters only applies to Loadbalancers that have their
     * loadBalancingScheme set to INTERNAL_SELF_MANAGED.
     * Structure is documented below.
     * 
     */
    @Import(name="metadataFilters")
      private final @Nullable Output<List<RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterArgs>> metadataFilters;

    public Output<List<RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterArgs>> getMetadataFilters() {
        return this.metadataFilters == null ? Output.empty() : this.metadataFilters;
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
     * Specifies a list of query parameter match criteria, all of which must match
     * corresponding query parameters in the request.
     * Structure is documented below.
     * 
     */
    @Import(name="queryParameterMatches")
      private final @Nullable Output<List<RegionUrlMapPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs>> queryParameterMatches;

    public Output<List<RegionUrlMapPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs>> getQueryParameterMatches() {
        return this.queryParameterMatches == null ? Output.empty() : this.queryParameterMatches;
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

    public RegionUrlMapPathMatcherRouteRuleMatchRuleArgs(
        @Nullable Output<String> fullPathMatch,
        @Nullable Output<List<RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchArgs>> headerMatches,
        @Nullable Output<Boolean> ignoreCase,
        @Nullable Output<List<RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterArgs>> metadataFilters,
        @Nullable Output<String> prefixMatch,
        @Nullable Output<List<RegionUrlMapPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs>> queryParameterMatches,
        @Nullable Output<String> regexMatch) {
        this.fullPathMatch = fullPathMatch;
        this.headerMatches = headerMatches;
        this.ignoreCase = ignoreCase;
        this.metadataFilters = metadataFilters;
        this.prefixMatch = prefixMatch;
        this.queryParameterMatches = queryParameterMatches;
        this.regexMatch = regexMatch;
    }

    private RegionUrlMapPathMatcherRouteRuleMatchRuleArgs() {
        this.fullPathMatch = Output.empty();
        this.headerMatches = Output.empty();
        this.ignoreCase = Output.empty();
        this.metadataFilters = Output.empty();
        this.prefixMatch = Output.empty();
        this.queryParameterMatches = Output.empty();
        this.regexMatch = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapPathMatcherRouteRuleMatchRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> fullPathMatch;
        private @Nullable Output<List<RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchArgs>> headerMatches;
        private @Nullable Output<Boolean> ignoreCase;
        private @Nullable Output<List<RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterArgs>> metadataFilters;
        private @Nullable Output<String> prefixMatch;
        private @Nullable Output<List<RegionUrlMapPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs>> queryParameterMatches;
        private @Nullable Output<String> regexMatch;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapPathMatcherRouteRuleMatchRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fullPathMatch = defaults.fullPathMatch;
    	      this.headerMatches = defaults.headerMatches;
    	      this.ignoreCase = defaults.ignoreCase;
    	      this.metadataFilters = defaults.metadataFilters;
    	      this.prefixMatch = defaults.prefixMatch;
    	      this.queryParameterMatches = defaults.queryParameterMatches;
    	      this.regexMatch = defaults.regexMatch;
        }

        public Builder fullPathMatch(@Nullable Output<String> fullPathMatch) {
            this.fullPathMatch = fullPathMatch;
            return this;
        }

        public Builder fullPathMatch(@Nullable String fullPathMatch) {
            this.fullPathMatch = Output.ofNullable(fullPathMatch);
            return this;
        }

        public Builder headerMatches(@Nullable Output<List<RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchArgs>> headerMatches) {
            this.headerMatches = headerMatches;
            return this;
        }

        public Builder headerMatches(@Nullable List<RegionUrlMapPathMatcherRouteRuleMatchRuleHeaderMatchArgs> headerMatches) {
            this.headerMatches = Output.ofNullable(headerMatches);
            return this;
        }

        public Builder ignoreCase(@Nullable Output<Boolean> ignoreCase) {
            this.ignoreCase = ignoreCase;
            return this;
        }

        public Builder ignoreCase(@Nullable Boolean ignoreCase) {
            this.ignoreCase = Output.ofNullable(ignoreCase);
            return this;
        }

        public Builder metadataFilters(@Nullable Output<List<RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterArgs>> metadataFilters) {
            this.metadataFilters = metadataFilters;
            return this;
        }

        public Builder metadataFilters(@Nullable List<RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterArgs> metadataFilters) {
            this.metadataFilters = Output.ofNullable(metadataFilters);
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

        public Builder queryParameterMatches(@Nullable Output<List<RegionUrlMapPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs>> queryParameterMatches) {
            this.queryParameterMatches = queryParameterMatches;
            return this;
        }

        public Builder queryParameterMatches(@Nullable List<RegionUrlMapPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs> queryParameterMatches) {
            this.queryParameterMatches = Output.ofNullable(queryParameterMatches);
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
        public RegionUrlMapPathMatcherRouteRuleMatchRuleArgs build() {
            return new RegionUrlMapPathMatcherRouteRuleMatchRuleArgs(fullPathMatch, headerMatches, ignoreCase, metadataFilters, prefixMatch, queryParameterMatches, regexMatch);
        }
    }
}
