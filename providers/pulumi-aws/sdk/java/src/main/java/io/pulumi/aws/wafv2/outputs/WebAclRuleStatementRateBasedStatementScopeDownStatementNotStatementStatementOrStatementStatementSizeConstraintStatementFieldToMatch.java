// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchBody;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchMethod;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchQueryString;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleHeader;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchUriPath;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatch {
    /**
     * Inspect all query arguments.
     * 
     */
    private final @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments allQueryArguments;
    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    private final @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchBody body;
    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    private final @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchMethod method;
    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    private final @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchQueryString queryString;
    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleHeader singleHeader;
    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument singleQueryArgument;
    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    private final @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchUriPath uriPath;

    @OutputCustomType.Constructor({"allQueryArguments","body","method","queryString","singleHeader","singleQueryArgument","uriPath"})
    private WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatch(
        @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments allQueryArguments,
        @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchBody body,
        @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchMethod method,
        @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchQueryString queryString,
        @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleHeader singleHeader,
        @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument singleQueryArgument,
        @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchUriPath uriPath) {
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
    public Optional<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments> getAllQueryArguments() {
        return Optional.ofNullable(this.allQueryArguments);
    }
    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    public Optional<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchBody> getBody() {
        return Optional.ofNullable(this.body);
    }
    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    public Optional<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchMethod> getMethod() {
        return Optional.ofNullable(this.method);
    }
    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    public Optional<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchQueryString> getQueryString() {
        return Optional.ofNullable(this.queryString);
    }
    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    public Optional<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleHeader> getSingleHeader() {
        return Optional.ofNullable(this.singleHeader);
    }
    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    public Optional<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument> getSingleQueryArgument() {
        return Optional.ofNullable(this.singleQueryArgument);
    }
    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    public Optional<WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchUriPath> getUriPath() {
        return Optional.ofNullable(this.uriPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatch defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments allQueryArguments;
        private @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchBody body;
        private @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchMethod method;
        private @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchQueryString queryString;
        private @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleHeader singleHeader;
        private @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument singleQueryArgument;
        private @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchUriPath uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder setAllQueryArguments(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }

        public Builder setBody(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchBody body) {
            this.body = body;
            return this;
        }

        public Builder setMethod(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchMethod method) {
            this.method = method;
            return this;
        }

        public Builder setQueryString(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchQueryString queryString) {
            this.queryString = queryString;
            return this;
        }

        public Builder setSingleHeader(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleHeader singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }

        public Builder setSingleQueryArgument(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }

        public Builder setUriPath(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchUriPath uriPath) {
            this.uriPath = uriPath;
            return this;
        }
        public WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatch build() {
            return new WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatch(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
