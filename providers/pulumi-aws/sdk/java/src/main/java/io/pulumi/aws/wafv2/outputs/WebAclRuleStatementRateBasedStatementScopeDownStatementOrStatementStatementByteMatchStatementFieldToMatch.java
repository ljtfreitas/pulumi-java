// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementByteMatchStatementFieldToMatchAllQueryArguments;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementByteMatchStatementFieldToMatchBody;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementByteMatchStatementFieldToMatchMethod;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementByteMatchStatementFieldToMatchQueryString;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementByteMatchStatementFieldToMatchSingleHeader;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementByteMatchStatementFieldToMatchSingleQueryArgument;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementByteMatchStatementFieldToMatchUriPath;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementByteMatchStatementFieldToMatch {
    /**
     * Inspect all query arguments.
     * 
     */
    private final @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementByteMatchStatementFieldToMatchAllQueryArguments allQueryArguments;
    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    private final @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementByteMatchStatementFieldToMatchBody body;
    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    private final @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementByteMatchStatementFieldToMatchMethod method;
    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    private final @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementByteMatchStatementFieldToMatchQueryString queryString;
    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementByteMatchStatementFieldToMatchSingleHeader singleHeader;
    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementByteMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument;
    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    private final @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementByteMatchStatementFieldToMatchUriPath uriPath;

    @CustomType.Constructor
    private WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementByteMatchStatementFieldToMatch(
        @CustomType.Parameter("allQueryArguments") @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementByteMatchStatementFieldToMatchAllQueryArguments allQueryArguments,
        @CustomType.Parameter("body") @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementByteMatchStatementFieldToMatchBody body,
        @CustomType.Parameter("method") @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementByteMatchStatementFieldToMatchMethod method,
        @CustomType.Parameter("queryString") @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementByteMatchStatementFieldToMatchQueryString queryString,
        @CustomType.Parameter("singleHeader") @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementByteMatchStatementFieldToMatchSingleHeader singleHeader,
        @CustomType.Parameter("singleQueryArgument") @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementByteMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument,
        @CustomType.Parameter("uriPath") @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementByteMatchStatementFieldToMatchUriPath uriPath) {
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
    public Optional<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementByteMatchStatementFieldToMatchAllQueryArguments> getAllQueryArguments() {
        return Optional.ofNullable(this.allQueryArguments);
    }
    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
    */
    public Optional<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementByteMatchStatementFieldToMatchBody> getBody() {
        return Optional.ofNullable(this.body);
    }
    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
    */
    public Optional<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementByteMatchStatementFieldToMatchMethod> getMethod() {
        return Optional.ofNullable(this.method);
    }
    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
    */
    public Optional<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementByteMatchStatementFieldToMatchQueryString> getQueryString() {
        return Optional.ofNullable(this.queryString);
    }
    /**
     * Inspect a single header. See Single Header below for details.
     * 
    */
    public Optional<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementByteMatchStatementFieldToMatchSingleHeader> getSingleHeader() {
        return Optional.ofNullable(this.singleHeader);
    }
    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
    */
    public Optional<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementByteMatchStatementFieldToMatchSingleQueryArgument> getSingleQueryArgument() {
        return Optional.ofNullable(this.singleQueryArgument);
    }
    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
    */
    public Optional<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementByteMatchStatementFieldToMatchUriPath> getUriPath() {
        return Optional.ofNullable(this.uriPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementByteMatchStatementFieldToMatch defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementByteMatchStatementFieldToMatchAllQueryArguments allQueryArguments;
        private @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementByteMatchStatementFieldToMatchBody body;
        private @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementByteMatchStatementFieldToMatchMethod method;
        private @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementByteMatchStatementFieldToMatchQueryString queryString;
        private @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementByteMatchStatementFieldToMatchSingleHeader singleHeader;
        private @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementByteMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument;
        private @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementByteMatchStatementFieldToMatchUriPath uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementByteMatchStatementFieldToMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder allQueryArguments(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementByteMatchStatementFieldToMatchAllQueryArguments allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }

        public Builder body(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementByteMatchStatementFieldToMatchBody body) {
            this.body = body;
            return this;
        }

        public Builder method(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementByteMatchStatementFieldToMatchMethod method) {
            this.method = method;
            return this;
        }

        public Builder queryString(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementByteMatchStatementFieldToMatchQueryString queryString) {
            this.queryString = queryString;
            return this;
        }

        public Builder singleHeader(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementByteMatchStatementFieldToMatchSingleHeader singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }

        public Builder singleQueryArgument(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementByteMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }

        public Builder uriPath(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementByteMatchStatementFieldToMatchUriPath uriPath) {
            this.uriPath = uriPath;
            return this;
        }
        public WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementByteMatchStatementFieldToMatch build() {
            return new WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementByteMatchStatementFieldToMatch(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
