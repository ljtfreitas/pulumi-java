// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchBody;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchMethod;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchQueryString;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleHeader;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchUriPath;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatch {
    /**
     * Inspect all query arguments.
     * 
     */
    private final @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments allQueryArguments;
    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    private final @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchBody body;
    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    private final @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchMethod method;
    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    private final @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchQueryString queryString;
    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleHeader singleHeader;
    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument singleQueryArgument;
    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    private final @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchUriPath uriPath;

    @CustomType.Constructor
    private WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatch(
        @CustomType.Parameter("allQueryArguments") @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments allQueryArguments,
        @CustomType.Parameter("body") @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchBody body,
        @CustomType.Parameter("method") @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchMethod method,
        @CustomType.Parameter("queryString") @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchQueryString queryString,
        @CustomType.Parameter("singleHeader") @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleHeader singleHeader,
        @CustomType.Parameter("singleQueryArgument") @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument singleQueryArgument,
        @CustomType.Parameter("uriPath") @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchUriPath uriPath) {
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
    public Optional<WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments> getAllQueryArguments() {
        return Optional.ofNullable(this.allQueryArguments);
    }
    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
    */
    public Optional<WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchBody> getBody() {
        return Optional.ofNullable(this.body);
    }
    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
    */
    public Optional<WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchMethod> getMethod() {
        return Optional.ofNullable(this.method);
    }
    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
    */
    public Optional<WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchQueryString> getQueryString() {
        return Optional.ofNullable(this.queryString);
    }
    /**
     * Inspect a single header. See Single Header below for details.
     * 
    */
    public Optional<WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleHeader> getSingleHeader() {
        return Optional.ofNullable(this.singleHeader);
    }
    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
    */
    public Optional<WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument> getSingleQueryArgument() {
        return Optional.ofNullable(this.singleQueryArgument);
    }
    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
    */
    public Optional<WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchUriPath> getUriPath() {
        return Optional.ofNullable(this.uriPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatch defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments allQueryArguments;
        private @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchBody body;
        private @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchMethod method;
        private @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchQueryString queryString;
        private @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleHeader singleHeader;
        private @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument singleQueryArgument;
        private @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchUriPath uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder allQueryArguments(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchAllQueryArguments allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }

        public Builder body(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchBody body) {
            this.body = body;
            return this;
        }

        public Builder method(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchMethod method) {
            this.method = method;
            return this;
        }

        public Builder queryString(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchQueryString queryString) {
            this.queryString = queryString;
            return this;
        }

        public Builder singleHeader(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleHeader singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }

        public Builder singleQueryArgument(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgument singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }

        public Builder uriPath(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchUriPath uriPath) {
            this.uriPath = uriPath;
            return this;
        }
        public WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatch build() {
            return new WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatch(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
