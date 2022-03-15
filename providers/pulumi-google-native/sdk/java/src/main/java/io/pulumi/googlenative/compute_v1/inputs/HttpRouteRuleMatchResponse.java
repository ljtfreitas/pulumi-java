// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_v1.inputs.HttpHeaderMatchResponse;
import io.pulumi.googlenative.compute_v1.inputs.HttpQueryParameterMatchResponse;
import io.pulumi.googlenative.compute_v1.inputs.MetadataFilterResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * HttpRouteRuleMatch specifies a set of criteria for matching requests to an HttpRouteRule. All specified criteria must be satisfied for a match to occur.
 * 
 */
public final class HttpRouteRuleMatchResponse extends io.pulumi.resources.InvokeArgs {

    public static final HttpRouteRuleMatchResponse Empty = new HttpRouteRuleMatchResponse();

    /**
     * For satisfying the matchRule condition, the path of the request must exactly match the value specified in fullPathMatch after removing any query parameters and anchor that may be part of the original URL. fullPathMatch must be from 1 to 1024 characters. Only one of prefixMatch, fullPathMatch or regexMatch must be specified.
     * 
     */
    @Import(name="fullPathMatch", required=true)
      private final String fullPathMatch;

    public String getFullPathMatch() {
        return this.fullPathMatch;
    }

    /**
     * Specifies a list of header match criteria, all of which must match corresponding headers in the request.
     * 
     */
    @Import(name="headerMatches", required=true)
      private final List<HttpHeaderMatchResponse> headerMatches;

    public List<HttpHeaderMatchResponse> getHeaderMatches() {
        return this.headerMatches;
    }

    /**
     * Specifies that prefixMatch and fullPathMatch matches are case sensitive. The default value is false. ignoreCase must not be used with regexMatch. Not supported when the URL map is bound to a target gRPC proxy.
     * 
     */
    @Import(name="ignoreCase", required=true)
      private final Boolean ignoreCase;

    public Boolean getIgnoreCase() {
        return this.ignoreCase;
    }

    /**
     * Opaque filter criteria used by the load balancer to restrict routing configuration to a limited set of xDS compliant clients. In their xDS requests to the load balancer, xDS clients present node metadata. When there is a match, the relevant routing configuration is made available to those proxies. For each metadataFilter in this list, if its filterMatchCriteria is set to MATCH_ANY, at least one of the filterLabels must match the corresponding label provided in the metadata. If its filterMatchCriteria is set to MATCH_ALL, then all of its filterLabels must match with corresponding labels provided in the metadata. If multiple metadata filters are specified, all of them need to be satisfied in order to be considered a match. metadataFilters specified here is applied after those specified in ForwardingRule that refers to the UrlMap this HttpRouteRuleMatch belongs to. metadataFilters only applies to load balancers that have loadBalancingScheme set to INTERNAL_SELF_MANAGED. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    @Import(name="metadataFilters", required=true)
      private final List<MetadataFilterResponse> metadataFilters;

    public List<MetadataFilterResponse> getMetadataFilters() {
        return this.metadataFilters;
    }

    /**
     * For satisfying the matchRule condition, the request's path must begin with the specified prefixMatch. prefixMatch must begin with a /. The value must be from 1 to 1024 characters. Only one of prefixMatch, fullPathMatch or regexMatch must be specified.
     * 
     */
    @Import(name="prefixMatch", required=true)
      private final String prefixMatch;

    public String getPrefixMatch() {
        return this.prefixMatch;
    }

    /**
     * Specifies a list of query parameter match criteria, all of which must match corresponding query parameters in the request. Not supported when the URL map is bound to a target gRPC proxy.
     * 
     */
    @Import(name="queryParameterMatches", required=true)
      private final List<HttpQueryParameterMatchResponse> queryParameterMatches;

    public List<HttpQueryParameterMatchResponse> getQueryParameterMatches() {
        return this.queryParameterMatches;
    }

    /**
     * For satisfying the matchRule condition, the path of the request must satisfy the regular expression specified in regexMatch after removing any query parameters and anchor supplied with the original URL. For more information about regular expression syntax, see Syntax. Only one of prefixMatch, fullPathMatch or regexMatch must be specified. regexMatch only applies to load balancers that have loadBalancingScheme set to INTERNAL_SELF_MANAGED.
     * 
     */
    @Import(name="regexMatch", required=true)
      private final String regexMatch;

    public String getRegexMatch() {
        return this.regexMatch;
    }

    public HttpRouteRuleMatchResponse(
        String fullPathMatch,
        List<HttpHeaderMatchResponse> headerMatches,
        Boolean ignoreCase,
        List<MetadataFilterResponse> metadataFilters,
        String prefixMatch,
        List<HttpQueryParameterMatchResponse> queryParameterMatches,
        String regexMatch) {
        this.fullPathMatch = Objects.requireNonNull(fullPathMatch, "expected parameter 'fullPathMatch' to be non-null");
        this.headerMatches = Objects.requireNonNull(headerMatches, "expected parameter 'headerMatches' to be non-null");
        this.ignoreCase = Objects.requireNonNull(ignoreCase, "expected parameter 'ignoreCase' to be non-null");
        this.metadataFilters = Objects.requireNonNull(metadataFilters, "expected parameter 'metadataFilters' to be non-null");
        this.prefixMatch = Objects.requireNonNull(prefixMatch, "expected parameter 'prefixMatch' to be non-null");
        this.queryParameterMatches = Objects.requireNonNull(queryParameterMatches, "expected parameter 'queryParameterMatches' to be non-null");
        this.regexMatch = Objects.requireNonNull(regexMatch, "expected parameter 'regexMatch' to be non-null");
    }

    private HttpRouteRuleMatchResponse() {
        this.fullPathMatch = null;
        this.headerMatches = List.of();
        this.ignoreCase = null;
        this.metadataFilters = List.of();
        this.prefixMatch = null;
        this.queryParameterMatches = List.of();
        this.regexMatch = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpRouteRuleMatchResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String fullPathMatch;
        private List<HttpHeaderMatchResponse> headerMatches;
        private Boolean ignoreCase;
        private List<MetadataFilterResponse> metadataFilters;
        private String prefixMatch;
        private List<HttpQueryParameterMatchResponse> queryParameterMatches;
        private String regexMatch;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpRouteRuleMatchResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fullPathMatch = defaults.fullPathMatch;
    	      this.headerMatches = defaults.headerMatches;
    	      this.ignoreCase = defaults.ignoreCase;
    	      this.metadataFilters = defaults.metadataFilters;
    	      this.prefixMatch = defaults.prefixMatch;
    	      this.queryParameterMatches = defaults.queryParameterMatches;
    	      this.regexMatch = defaults.regexMatch;
        }

        public Builder fullPathMatch(String fullPathMatch) {
            this.fullPathMatch = Objects.requireNonNull(fullPathMatch);
            return this;
        }

        public Builder headerMatches(List<HttpHeaderMatchResponse> headerMatches) {
            this.headerMatches = Objects.requireNonNull(headerMatches);
            return this;
        }

        public Builder ignoreCase(Boolean ignoreCase) {
            this.ignoreCase = Objects.requireNonNull(ignoreCase);
            return this;
        }

        public Builder metadataFilters(List<MetadataFilterResponse> metadataFilters) {
            this.metadataFilters = Objects.requireNonNull(metadataFilters);
            return this;
        }

        public Builder prefixMatch(String prefixMatch) {
            this.prefixMatch = Objects.requireNonNull(prefixMatch);
            return this;
        }

        public Builder queryParameterMatches(List<HttpQueryParameterMatchResponse> queryParameterMatches) {
            this.queryParameterMatches = Objects.requireNonNull(queryParameterMatches);
            return this;
        }

        public Builder regexMatch(String regexMatch) {
            this.regexMatch = Objects.requireNonNull(regexMatch);
            return this;
        }
        public HttpRouteRuleMatchResponse build() {
            return new HttpRouteRuleMatchResponse(fullPathMatch, headerMatches, ignoreCase, metadataFilters, prefixMatch, queryParameterMatches, regexMatch);
        }
    }
}
