// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchBodyGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethodGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs Empty = new WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs();

    /**
     * Inspect all query arguments.
     * 
     */
    @InputImport(name="allQueryArguments")
    private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsGetArgs> getAllQueryArguments() {
        return this.allQueryArguments == null ? Input.empty() : this.allQueryArguments;
    }

    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    @InputImport(name="body")
    private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchBodyGetArgs> body;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchBodyGetArgs> getBody() {
        return this.body == null ? Input.empty() : this.body;
    }

    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @InputImport(name="method")
    private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethodGetArgs> method;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethodGetArgs> getMethod() {
        return this.method == null ? Input.empty() : this.method;
    }

    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    @InputImport(name="queryString")
    private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringGetArgs> queryString;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringGetArgs> getQueryString() {
        return this.queryString == null ? Input.empty() : this.queryString;
    }

    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    @InputImport(name="singleHeader")
    private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderGetArgs> singleHeader;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderGetArgs> getSingleHeader() {
        return this.singleHeader == null ? Input.empty() : this.singleHeader;
    }

    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    @InputImport(name="singleQueryArgument")
    private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentGetArgs> getSingleQueryArgument() {
        return this.singleQueryArgument == null ? Input.empty() : this.singleQueryArgument;
    }

    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    @InputImport(name="uriPath")
    private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathGetArgs> uriPath;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathGetArgs> getUriPath() {
        return this.uriPath == null ? Input.empty() : this.uriPath;
    }

    public WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs(
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchBodyGetArgs> body,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethodGetArgs> method,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringGetArgs> queryString,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderGetArgs> singleHeader,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathGetArgs> uriPath) {
        this.allQueryArguments = allQueryArguments;
        this.body = body;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.singleQueryArgument = singleQueryArgument;
        this.uriPath = uriPath;
    }

    private WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs() {
        this.allQueryArguments = Input.empty();
        this.body = Input.empty();
        this.method = Input.empty();
        this.queryString = Input.empty();
        this.singleHeader = Input.empty();
        this.singleQueryArgument = Input.empty();
        this.uriPath = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchBodyGetArgs> body;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethodGetArgs> method;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringGetArgs> queryString;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderGetArgs> singleHeader;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathGetArgs> uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder setAllQueryArguments(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }

        public Builder setAllQueryArguments(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsGetArgs allQueryArguments) {
            this.allQueryArguments = Input.ofNullable(allQueryArguments);
            return this;
        }

        public Builder setBody(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchBodyGetArgs> body) {
            this.body = body;
            return this;
        }

        public Builder setBody(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchBodyGetArgs body) {
            this.body = Input.ofNullable(body);
            return this;
        }

        public Builder setMethod(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethodGetArgs> method) {
            this.method = method;
            return this;
        }

        public Builder setMethod(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethodGetArgs method) {
            this.method = Input.ofNullable(method);
            return this;
        }

        public Builder setQueryString(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringGetArgs> queryString) {
            this.queryString = queryString;
            return this;
        }

        public Builder setQueryString(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringGetArgs queryString) {
            this.queryString = Input.ofNullable(queryString);
            return this;
        }

        public Builder setSingleHeader(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderGetArgs> singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }

        public Builder setSingleHeader(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderGetArgs singleHeader) {
            this.singleHeader = Input.ofNullable(singleHeader);
            return this;
        }

        public Builder setSingleQueryArgument(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }

        public Builder setSingleQueryArgument(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentGetArgs singleQueryArgument) {
            this.singleQueryArgument = Input.ofNullable(singleQueryArgument);
            return this;
        }

        public Builder setUriPath(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathGetArgs> uriPath) {
            this.uriPath = uriPath;
            return this;
        }

        public Builder setUriPath(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathGetArgs uriPath) {
            this.uriPath = Input.ofNullable(uriPath);
            return this;
        }
        public WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs build() {
            return new WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchGetArgs(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
