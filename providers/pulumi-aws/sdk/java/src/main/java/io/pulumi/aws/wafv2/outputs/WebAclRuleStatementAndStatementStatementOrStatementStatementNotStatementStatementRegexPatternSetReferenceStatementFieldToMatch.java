// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArguments;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchBody;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethod;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryString;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeader;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgument;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPath;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatch {
    /**
     * Inspect all query arguments.
     * 
     */
    private final @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArguments allQueryArguments;
    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    private final @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchBody body;
    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    private final @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethod method;
    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    private final @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryString queryString;
    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeader singleHeader;
    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgument singleQueryArgument;
    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    private final @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPath uriPath;

    @OutputCustomType.Constructor({"allQueryArguments","body","method","queryString","singleHeader","singleQueryArgument","uriPath"})
    private WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatch(
        @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArguments allQueryArguments,
        @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchBody body,
        @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethod method,
        @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryString queryString,
        @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeader singleHeader,
        @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgument singleQueryArgument,
        @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPath uriPath) {
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
    public Optional<WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArguments> getAllQueryArguments() {
        return Optional.ofNullable(this.allQueryArguments);
    }
    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    public Optional<WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchBody> getBody() {
        return Optional.ofNullable(this.body);
    }
    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    public Optional<WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethod> getMethod() {
        return Optional.ofNullable(this.method);
    }
    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    public Optional<WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryString> getQueryString() {
        return Optional.ofNullable(this.queryString);
    }
    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    public Optional<WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeader> getSingleHeader() {
        return Optional.ofNullable(this.singleHeader);
    }
    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    public Optional<WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgument> getSingleQueryArgument() {
        return Optional.ofNullable(this.singleQueryArgument);
    }
    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    public Optional<WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPath> getUriPath() {
        return Optional.ofNullable(this.uriPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatch defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArguments allQueryArguments;
        private @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchBody body;
        private @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethod method;
        private @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryString queryString;
        private @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeader singleHeader;
        private @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgument singleQueryArgument;
        private @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPath uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder setAllQueryArguments(@Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArguments allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }

        public Builder setBody(@Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchBody body) {
            this.body = body;
            return this;
        }

        public Builder setMethod(@Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethod method) {
            this.method = method;
            return this;
        }

        public Builder setQueryString(@Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryString queryString) {
            this.queryString = queryString;
            return this;
        }

        public Builder setSingleHeader(@Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeader singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }

        public Builder setSingleQueryArgument(@Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgument singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }

        public Builder setUriPath(@Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPath uriPath) {
            this.uriPath = uriPath;
            return this;
        }
        public WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatch build() {
            return new WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementRegexPatternSetReferenceStatementFieldToMatch(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
