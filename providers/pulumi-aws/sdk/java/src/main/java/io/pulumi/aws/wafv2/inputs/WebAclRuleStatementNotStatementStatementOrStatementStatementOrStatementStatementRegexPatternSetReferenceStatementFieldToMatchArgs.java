// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchBodyArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethodArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchArgs Empty = new WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchArgs();

    /**
     * Inspect all query arguments.
     * 
     */
    @Import(name="allQueryArguments")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments;

    public Output<WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsArgs> getAllQueryArguments() {
        return this.allQueryArguments == null ? Output.empty() : this.allQueryArguments;
    }

    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    @Import(name="body")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchBodyArgs> body;

    public Output<WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchBodyArgs> getBody() {
        return this.body == null ? Output.empty() : this.body;
    }

    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @Import(name="method")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethodArgs> method;

    public Output<WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethodArgs> getMethod() {
        return this.method == null ? Output.empty() : this.method;
    }

    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    @Import(name="queryString")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringArgs> queryString;

    public Output<WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringArgs> getQueryString() {
        return this.queryString == null ? Output.empty() : this.queryString;
    }

    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    @Import(name="singleHeader")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderArgs> singleHeader;

    public Output<WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderArgs> getSingleHeader() {
        return this.singleHeader == null ? Output.empty() : this.singleHeader;
    }

    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    @Import(name="singleQueryArgument")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument;

    public Output<WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentArgs> getSingleQueryArgument() {
        return this.singleQueryArgument == null ? Output.empty() : this.singleQueryArgument;
    }

    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    @Import(name="uriPath")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathArgs> uriPath;

    public Output<WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathArgs> getUriPath() {
        return this.uriPath == null ? Output.empty() : this.uriPath;
    }

    public WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchArgs(
        @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments,
        @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchBodyArgs> body,
        @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethodArgs> method,
        @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringArgs> queryString,
        @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderArgs> singleHeader,
        @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument,
        @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathArgs> uriPath) {
        this.allQueryArguments = allQueryArguments;
        this.body = body;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.singleQueryArgument = singleQueryArgument;
        this.uriPath = uriPath;
    }

    private WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchArgs() {
        this.allQueryArguments = Output.empty();
        this.body = Output.empty();
        this.method = Output.empty();
        this.queryString = Output.empty();
        this.singleHeader = Output.empty();
        this.singleQueryArgument = Output.empty();
        this.uriPath = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchBodyArgs> body;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethodArgs> method;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringArgs> queryString;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderArgs> singleHeader;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathArgs> uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder allQueryArguments(@Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }

        public Builder allQueryArguments(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchAllQueryArgumentsArgs allQueryArguments) {
            this.allQueryArguments = Output.ofNullable(allQueryArguments);
            return this;
        }

        public Builder body(@Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchBodyArgs> body) {
            this.body = body;
            return this;
        }

        public Builder body(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchBodyArgs body) {
            this.body = Output.ofNullable(body);
            return this;
        }

        public Builder method(@Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethodArgs> method) {
            this.method = method;
            return this;
        }

        public Builder method(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchMethodArgs method) {
            this.method = Output.ofNullable(method);
            return this;
        }

        public Builder queryString(@Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringArgs> queryString) {
            this.queryString = queryString;
            return this;
        }

        public Builder queryString(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchQueryStringArgs queryString) {
            this.queryString = Output.ofNullable(queryString);
            return this;
        }

        public Builder singleHeader(@Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderArgs> singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }

        public Builder singleHeader(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleHeaderArgs singleHeader) {
            this.singleHeader = Output.ofNullable(singleHeader);
            return this;
        }

        public Builder singleQueryArgument(@Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }

        public Builder singleQueryArgument(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchSingleQueryArgumentArgs singleQueryArgument) {
            this.singleQueryArgument = Output.ofNullable(singleQueryArgument);
            return this;
        }

        public Builder uriPath(@Nullable Output<WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathArgs> uriPath) {
            this.uriPath = uriPath;
            return this;
        }

        public Builder uriPath(@Nullable WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchUriPathArgs uriPath) {
            this.uriPath = Output.ofNullable(uriPath);
            return this;
        }
        public WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchArgs build() {
            return new WebAclRuleStatementNotStatementStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchArgs(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
