// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchBodyArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchMethodArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchUriPathArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchArgs Empty = new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchArgs();

    /**
     * Inspect all query arguments.
     * 
     */
    @InputImport(name="allQueryArguments")
    private final @Nullable Input<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments;

    public Input<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs> getAllQueryArguments() {
        return this.allQueryArguments == null ? Input.empty() : this.allQueryArguments;
    }

    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    @InputImport(name="body")
    private final @Nullable Input<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchBodyArgs> body;

    public Input<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchBodyArgs> getBody() {
        return this.body == null ? Input.empty() : this.body;
    }

    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @InputImport(name="method")
    private final @Nullable Input<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchMethodArgs> method;

    public Input<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchMethodArgs> getMethod() {
        return this.method == null ? Input.empty() : this.method;
    }

    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    @InputImport(name="queryString")
    private final @Nullable Input<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs> queryString;

    public Input<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs> getQueryString() {
        return this.queryString == null ? Input.empty() : this.queryString;
    }

    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    @InputImport(name="singleHeader")
    private final @Nullable Input<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs> singleHeader;

    public Input<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs> getSingleHeader() {
        return this.singleHeader == null ? Input.empty() : this.singleHeader;
    }

    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    @InputImport(name="singleQueryArgument")
    private final @Nullable Input<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument;

    public Input<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs> getSingleQueryArgument() {
        return this.singleQueryArgument == null ? Input.empty() : this.singleQueryArgument;
    }

    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    @InputImport(name="uriPath")
    private final @Nullable Input<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchUriPathArgs> uriPath;

    public Input<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchUriPathArgs> getUriPath() {
        return this.uriPath == null ? Input.empty() : this.uriPath;
    }

    public WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchArgs(
        @Nullable Input<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments,
        @Nullable Input<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchBodyArgs> body,
        @Nullable Input<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchMethodArgs> method,
        @Nullable Input<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs> queryString,
        @Nullable Input<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs> singleHeader,
        @Nullable Input<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument,
        @Nullable Input<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchUriPathArgs> uriPath) {
        this.allQueryArguments = allQueryArguments;
        this.body = body;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.singleQueryArgument = singleQueryArgument;
        this.uriPath = uriPath;
    }

    private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchArgs() {
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

    public static Builder builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments;
        private @Nullable Input<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchBodyArgs> body;
        private @Nullable Input<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchMethodArgs> method;
        private @Nullable Input<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs> queryString;
        private @Nullable Input<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs> singleHeader;
        private @Nullable Input<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument;
        private @Nullable Input<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchUriPathArgs> uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder setAllQueryArguments(@Nullable Input<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }

        public Builder setAllQueryArguments(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsArgs allQueryArguments) {
            this.allQueryArguments = Input.ofNullable(allQueryArguments);
            return this;
        }

        public Builder setBody(@Nullable Input<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchBodyArgs> body) {
            this.body = body;
            return this;
        }

        public Builder setBody(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchBodyArgs body) {
            this.body = Input.ofNullable(body);
            return this;
        }

        public Builder setMethod(@Nullable Input<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchMethodArgs> method) {
            this.method = method;
            return this;
        }

        public Builder setMethod(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchMethodArgs method) {
            this.method = Input.ofNullable(method);
            return this;
        }

        public Builder setQueryString(@Nullable Input<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs> queryString) {
            this.queryString = queryString;
            return this;
        }

        public Builder setQueryString(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchQueryStringArgs queryString) {
            this.queryString = Input.ofNullable(queryString);
            return this;
        }

        public Builder setSingleHeader(@Nullable Input<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs> singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }

        public Builder setSingleHeader(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleHeaderArgs singleHeader) {
            this.singleHeader = Input.ofNullable(singleHeader);
            return this;
        }

        public Builder setSingleQueryArgument(@Nullable Input<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }

        public Builder setSingleQueryArgument(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentArgs singleQueryArgument) {
            this.singleQueryArgument = Input.ofNullable(singleQueryArgument);
            return this;
        }

        public Builder setUriPath(@Nullable Input<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchUriPathArgs> uriPath) {
            this.uriPath = uriPath;
            return this;
        }

        public Builder setUriPath(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchUriPathArgs uriPath) {
            this.uriPath = Input.ofNullable(uriPath);
            return this;
        }
        public WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchArgs build() {
            return new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementOrStatementStatementAndStatementStatementSqliMatchStatementFieldToMatchArgs(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}