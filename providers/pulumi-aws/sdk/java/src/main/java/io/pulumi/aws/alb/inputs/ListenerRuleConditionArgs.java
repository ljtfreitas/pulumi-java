// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.alb.inputs;

import io.pulumi.aws.alb.inputs.ListenerRuleConditionHostHeaderArgs;
import io.pulumi.aws.alb.inputs.ListenerRuleConditionHttpHeaderArgs;
import io.pulumi.aws.alb.inputs.ListenerRuleConditionHttpRequestMethodArgs;
import io.pulumi.aws.alb.inputs.ListenerRuleConditionPathPatternArgs;
import io.pulumi.aws.alb.inputs.ListenerRuleConditionQueryStringArgs;
import io.pulumi.aws.alb.inputs.ListenerRuleConditionSourceIpArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerRuleConditionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ListenerRuleConditionArgs Empty = new ListenerRuleConditionArgs();

    /**
     * Contains a single `values` item which is a list of host header patterns to match. The maximum size of each pattern is 128 characters. Comparison is case insensitive. Wildcard characters supported: * (matches 0 or more characters) and ? (matches exactly 1 character). Only one pattern needs to match for the condition to be satisfied.
     * 
     */
    @InputImport(name="hostHeader")
    private final @Nullable Input<ListenerRuleConditionHostHeaderArgs> hostHeader;

    public Input<ListenerRuleConditionHostHeaderArgs> getHostHeader() {
        return this.hostHeader == null ? Input.empty() : this.hostHeader;
    }

    /**
     * HTTP headers to match. HTTP Header block fields documented below.
     * 
     */
    @InputImport(name="httpHeader")
    private final @Nullable Input<ListenerRuleConditionHttpHeaderArgs> httpHeader;

    public Input<ListenerRuleConditionHttpHeaderArgs> getHttpHeader() {
        return this.httpHeader == null ? Input.empty() : this.httpHeader;
    }

    /**
     * Contains a single `values` item which is a list of HTTP request methods or verbs to match. Maximum size is 40 characters. Only allowed characters are A-Z, hyphen (-) and underscore (\_). Comparison is case sensitive. Wildcards are not supported. Only one needs to match for the condition to be satisfied. AWS recommends that GET and HEAD requests are routed in the same way because the response to a HEAD request may be cached.
     * 
     */
    @InputImport(name="httpRequestMethod")
    private final @Nullable Input<ListenerRuleConditionHttpRequestMethodArgs> httpRequestMethod;

    public Input<ListenerRuleConditionHttpRequestMethodArgs> getHttpRequestMethod() {
        return this.httpRequestMethod == null ? Input.empty() : this.httpRequestMethod;
    }

    /**
     * Contains a single `values` item which is a list of path patterns to match against the request URL. Maximum size of each pattern is 128 characters. Comparison is case sensitive. Wildcard characters supported: * (matches 0 or more characters) and ? (matches exactly 1 character). Only one pattern needs to match for the condition to be satisfied. Path pattern is compared only to the path of the URL, not to its query string. To compare against the query string, use a `query_string` condition.
     * 
     */
    @InputImport(name="pathPattern")
    private final @Nullable Input<ListenerRuleConditionPathPatternArgs> pathPattern;

    public Input<ListenerRuleConditionPathPatternArgs> getPathPattern() {
        return this.pathPattern == null ? Input.empty() : this.pathPattern;
    }

    /**
     * Query strings to match. Query String block fields documented below.
     * 
     */
    @InputImport(name="queryStrings")
    private final @Nullable Input<List<ListenerRuleConditionQueryStringArgs>> queryStrings;

    public Input<List<ListenerRuleConditionQueryStringArgs>> getQueryStrings() {
        return this.queryStrings == null ? Input.empty() : this.queryStrings;
    }

    /**
     * Contains a single `values` item which is a list of source IP CIDR notations to match. You can use both IPv4 and IPv6 addresses. Wildcards are not supported. Condition is satisfied if the source IP address of the request matches one of the CIDR blocks. Condition is not satisfied by the addresses in the `X-Forwarded-For` header, use `http_header` condition instead.
     * 
     */
    @InputImport(name="sourceIp")
    private final @Nullable Input<ListenerRuleConditionSourceIpArgs> sourceIp;

    public Input<ListenerRuleConditionSourceIpArgs> getSourceIp() {
        return this.sourceIp == null ? Input.empty() : this.sourceIp;
    }

    public ListenerRuleConditionArgs(
        @Nullable Input<ListenerRuleConditionHostHeaderArgs> hostHeader,
        @Nullable Input<ListenerRuleConditionHttpHeaderArgs> httpHeader,
        @Nullable Input<ListenerRuleConditionHttpRequestMethodArgs> httpRequestMethod,
        @Nullable Input<ListenerRuleConditionPathPatternArgs> pathPattern,
        @Nullable Input<List<ListenerRuleConditionQueryStringArgs>> queryStrings,
        @Nullable Input<ListenerRuleConditionSourceIpArgs> sourceIp) {
        this.hostHeader = hostHeader;
        this.httpHeader = httpHeader;
        this.httpRequestMethod = httpRequestMethod;
        this.pathPattern = pathPattern;
        this.queryStrings = queryStrings;
        this.sourceIp = sourceIp;
    }

    private ListenerRuleConditionArgs() {
        this.hostHeader = Input.empty();
        this.httpHeader = Input.empty();
        this.httpRequestMethod = Input.empty();
        this.pathPattern = Input.empty();
        this.queryStrings = Input.empty();
        this.sourceIp = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ListenerRuleConditionHostHeaderArgs> hostHeader;
        private @Nullable Input<ListenerRuleConditionHttpHeaderArgs> httpHeader;
        private @Nullable Input<ListenerRuleConditionHttpRequestMethodArgs> httpRequestMethod;
        private @Nullable Input<ListenerRuleConditionPathPatternArgs> pathPattern;
        private @Nullable Input<List<ListenerRuleConditionQueryStringArgs>> queryStrings;
        private @Nullable Input<ListenerRuleConditionSourceIpArgs> sourceIp;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostHeader = defaults.hostHeader;
    	      this.httpHeader = defaults.httpHeader;
    	      this.httpRequestMethod = defaults.httpRequestMethod;
    	      this.pathPattern = defaults.pathPattern;
    	      this.queryStrings = defaults.queryStrings;
    	      this.sourceIp = defaults.sourceIp;
        }

        public Builder setHostHeader(@Nullable Input<ListenerRuleConditionHostHeaderArgs> hostHeader) {
            this.hostHeader = hostHeader;
            return this;
        }

        public Builder setHostHeader(@Nullable ListenerRuleConditionHostHeaderArgs hostHeader) {
            this.hostHeader = Input.ofNullable(hostHeader);
            return this;
        }

        public Builder setHttpHeader(@Nullable Input<ListenerRuleConditionHttpHeaderArgs> httpHeader) {
            this.httpHeader = httpHeader;
            return this;
        }

        public Builder setHttpHeader(@Nullable ListenerRuleConditionHttpHeaderArgs httpHeader) {
            this.httpHeader = Input.ofNullable(httpHeader);
            return this;
        }

        public Builder setHttpRequestMethod(@Nullable Input<ListenerRuleConditionHttpRequestMethodArgs> httpRequestMethod) {
            this.httpRequestMethod = httpRequestMethod;
            return this;
        }

        public Builder setHttpRequestMethod(@Nullable ListenerRuleConditionHttpRequestMethodArgs httpRequestMethod) {
            this.httpRequestMethod = Input.ofNullable(httpRequestMethod);
            return this;
        }

        public Builder setPathPattern(@Nullable Input<ListenerRuleConditionPathPatternArgs> pathPattern) {
            this.pathPattern = pathPattern;
            return this;
        }

        public Builder setPathPattern(@Nullable ListenerRuleConditionPathPatternArgs pathPattern) {
            this.pathPattern = Input.ofNullable(pathPattern);
            return this;
        }

        public Builder setQueryStrings(@Nullable Input<List<ListenerRuleConditionQueryStringArgs>> queryStrings) {
            this.queryStrings = queryStrings;
            return this;
        }

        public Builder setQueryStrings(@Nullable List<ListenerRuleConditionQueryStringArgs> queryStrings) {
            this.queryStrings = Input.ofNullable(queryStrings);
            return this;
        }

        public Builder setSourceIp(@Nullable Input<ListenerRuleConditionSourceIpArgs> sourceIp) {
            this.sourceIp = sourceIp;
            return this;
        }

        public Builder setSourceIp(@Nullable ListenerRuleConditionSourceIpArgs sourceIp) {
            this.sourceIp = Input.ofNullable(sourceIp);
            return this;
        }
        public ListenerRuleConditionArgs build() {
            return new ListenerRuleConditionArgs(hostHeader, httpHeader, httpRequestMethod, pathPattern, queryStrings, sourceIp);
        }
    }
}
