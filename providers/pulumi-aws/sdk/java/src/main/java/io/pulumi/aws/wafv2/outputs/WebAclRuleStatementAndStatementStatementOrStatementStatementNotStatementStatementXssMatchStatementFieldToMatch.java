// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchAllQueryArguments;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchBody;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchMethod;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchQueryString;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleHeader;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleQueryArgument;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchUriPath;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatch {
    /**
     * Inspect all query arguments.
     * 
     */
    private final @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchAllQueryArguments allQueryArguments;
    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    private final @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchBody body;
    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    private final @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchMethod method;
    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    private final @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchQueryString queryString;
    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleHeader singleHeader;
    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument;
    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    private final @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchUriPath uriPath;

    @OutputCustomType.Constructor({"allQueryArguments","body","method","queryString","singleHeader","singleQueryArgument","uriPath"})
    private WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatch(
        @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchAllQueryArguments allQueryArguments,
        @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchBody body,
        @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchMethod method,
        @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchQueryString queryString,
        @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleHeader singleHeader,
        @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument,
        @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchUriPath uriPath) {
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
    public Optional<WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchAllQueryArguments> getAllQueryArguments() {
        return Optional.ofNullable(this.allQueryArguments);
    }
    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    public Optional<WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchBody> getBody() {
        return Optional.ofNullable(this.body);
    }
    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    public Optional<WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchMethod> getMethod() {
        return Optional.ofNullable(this.method);
    }
    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    public Optional<WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchQueryString> getQueryString() {
        return Optional.ofNullable(this.queryString);
    }
    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    public Optional<WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleHeader> getSingleHeader() {
        return Optional.ofNullable(this.singleHeader);
    }
    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    public Optional<WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleQueryArgument> getSingleQueryArgument() {
        return Optional.ofNullable(this.singleQueryArgument);
    }
    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    public Optional<WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchUriPath> getUriPath() {
        return Optional.ofNullable(this.uriPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatch defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchAllQueryArguments allQueryArguments;
        private @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchBody body;
        private @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchMethod method;
        private @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchQueryString queryString;
        private @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleHeader singleHeader;
        private @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument;
        private @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchUriPath uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder setAllQueryArguments(@Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchAllQueryArguments allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }

        public Builder setBody(@Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchBody body) {
            this.body = body;
            return this;
        }

        public Builder setMethod(@Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchMethod method) {
            this.method = method;
            return this;
        }

        public Builder setQueryString(@Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchQueryString queryString) {
            this.queryString = queryString;
            return this;
        }

        public Builder setSingleHeader(@Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleHeader singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }

        public Builder setSingleQueryArgument(@Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }

        public Builder setUriPath(@Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatchUriPath uriPath) {
            this.uriPath = uriPath;
            return this;
        }
        public WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatch build() {
            return new WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatch(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
