// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchBody;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchMethod;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchQueryString;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeader;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchUriPath;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatch {
    /**
     * Inspect all query arguments.
     * 
     */
    private final @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments allQueryArguments;
    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    private final @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchBody body;
    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    private final @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchMethod method;
    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    private final @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchQueryString queryString;
    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeader singleHeader;
    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument;
    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    private final @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchUriPath uriPath;

    @CustomType.Constructor
    private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatch(
        @CustomType.Parameter("allQueryArguments") @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments allQueryArguments,
        @CustomType.Parameter("body") @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchBody body,
        @CustomType.Parameter("method") @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchMethod method,
        @CustomType.Parameter("queryString") @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchQueryString queryString,
        @CustomType.Parameter("singleHeader") @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeader singleHeader,
        @CustomType.Parameter("singleQueryArgument") @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument,
        @CustomType.Parameter("uriPath") @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchUriPath uriPath) {
        this.allQueryArguments = allQueryArguments;
        this.body = body;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.singleQueryArgument = singleQueryArgument;
        this.uriPath = uriPath;
    }

    /**
     * Inspect all query arguments.
     * 
    */
    public Optional<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments> getAllQueryArguments() {
        return Optional.ofNullable(this.allQueryArguments);
    }
    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
    */
    public Optional<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchBody> getBody() {
        return Optional.ofNullable(this.body);
    }
    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
    */
    public Optional<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchMethod> getMethod() {
        return Optional.ofNullable(this.method);
    }
    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
    */
    public Optional<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchQueryString> getQueryString() {
        return Optional.ofNullable(this.queryString);
    }
    /**
     * Inspect a single header. See Single Header below for details.
     * 
    */
    public Optional<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeader> getSingleHeader() {
        return Optional.ofNullable(this.singleHeader);
    }
    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
    */
    public Optional<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument> getSingleQueryArgument() {
        return Optional.ofNullable(this.singleQueryArgument);
    }
    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
    */
    public Optional<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchUriPath> getUriPath() {
        return Optional.ofNullable(this.uriPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatch defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments allQueryArguments;
        private @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchBody body;
        private @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchMethod method;
        private @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchQueryString queryString;
        private @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeader singleHeader;
        private @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument;
        private @Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchUriPath uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder allQueryArguments(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchAllQueryArguments allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }

        public Builder body(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchBody body) {
            this.body = body;
            return this;
        }

        public Builder method(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchMethod method) {
            this.method = method;
            return this;
        }

        public Builder queryString(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchQueryString queryString) {
            this.queryString = queryString;
            return this;
        }

        public Builder singleHeader(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeader singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }

        public Builder singleQueryArgument(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }

        public Builder uriPath(@Nullable WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchUriPath uriPath) {
            this.uriPath = uriPath;
            return this;
        }
        public WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatch build() {
            return new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementAndStatementStatementNotStatementStatementSqliMatchStatementFieldToMatch(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
