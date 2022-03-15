// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchBodyGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchMethodGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchQueryStringGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeaderGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchUriPathGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchGetArgs Empty = new WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchGetArgs();

    /**
     * Inspect all query arguments.
     * 
     */
    @Import(name="allQueryArguments")
      private final @Nullable Output<WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments;

    public Output<WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsGetArgs> getAllQueryArguments() {
        return this.allQueryArguments == null ? Output.empty() : this.allQueryArguments;
    }

    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    @Import(name="body")
      private final @Nullable Output<WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchBodyGetArgs> body;

    public Output<WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchBodyGetArgs> getBody() {
        return this.body == null ? Output.empty() : this.body;
    }

    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @Import(name="method")
      private final @Nullable Output<WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchMethodGetArgs> method;

    public Output<WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchMethodGetArgs> getMethod() {
        return this.method == null ? Output.empty() : this.method;
    }

    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    @Import(name="queryString")
      private final @Nullable Output<WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchQueryStringGetArgs> queryString;

    public Output<WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchQueryStringGetArgs> getQueryString() {
        return this.queryString == null ? Output.empty() : this.queryString;
    }

    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    @Import(name="singleHeader")
      private final @Nullable Output<WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeaderGetArgs> singleHeader;

    public Output<WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeaderGetArgs> getSingleHeader() {
        return this.singleHeader == null ? Output.empty() : this.singleHeader;
    }

    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    @Import(name="singleQueryArgument")
      private final @Nullable Output<WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument;

    public Output<WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentGetArgs> getSingleQueryArgument() {
        return this.singleQueryArgument == null ? Output.empty() : this.singleQueryArgument;
    }

    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    @Import(name="uriPath")
      private final @Nullable Output<WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchUriPathGetArgs> uriPath;

    public Output<WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchUriPathGetArgs> getUriPath() {
        return this.uriPath == null ? Output.empty() : this.uriPath;
    }

    public WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchGetArgs(
        @Nullable Output<WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments,
        @Nullable Output<WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchBodyGetArgs> body,
        @Nullable Output<WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchMethodGetArgs> method,
        @Nullable Output<WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchQueryStringGetArgs> queryString,
        @Nullable Output<WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeaderGetArgs> singleHeader,
        @Nullable Output<WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument,
        @Nullable Output<WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchUriPathGetArgs> uriPath) {
        this.allQueryArguments = allQueryArguments;
        this.body = body;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.singleQueryArgument = singleQueryArgument;
        this.uriPath = uriPath;
    }

    private WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchGetArgs() {
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

    public static Builder builder(WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments;
        private @Nullable Output<WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchBodyGetArgs> body;
        private @Nullable Output<WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchMethodGetArgs> method;
        private @Nullable Output<WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchQueryStringGetArgs> queryString;
        private @Nullable Output<WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeaderGetArgs> singleHeader;
        private @Nullable Output<WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument;
        private @Nullable Output<WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchUriPathGetArgs> uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder allQueryArguments(@Nullable Output<WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }

        public Builder allQueryArguments(@Nullable WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchAllQueryArgumentsGetArgs allQueryArguments) {
            this.allQueryArguments = Output.ofNullable(allQueryArguments);
            return this;
        }

        public Builder body(@Nullable Output<WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchBodyGetArgs> body) {
            this.body = body;
            return this;
        }

        public Builder body(@Nullable WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchBodyGetArgs body) {
            this.body = Output.ofNullable(body);
            return this;
        }

        public Builder method(@Nullable Output<WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchMethodGetArgs> method) {
            this.method = method;
            return this;
        }

        public Builder method(@Nullable WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchMethodGetArgs method) {
            this.method = Output.ofNullable(method);
            return this;
        }

        public Builder queryString(@Nullable Output<WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchQueryStringGetArgs> queryString) {
            this.queryString = queryString;
            return this;
        }

        public Builder queryString(@Nullable WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchQueryStringGetArgs queryString) {
            this.queryString = Output.ofNullable(queryString);
            return this;
        }

        public Builder singleHeader(@Nullable Output<WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeaderGetArgs> singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }

        public Builder singleHeader(@Nullable WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleHeaderGetArgs singleHeader) {
            this.singleHeader = Output.ofNullable(singleHeader);
            return this;
        }

        public Builder singleQueryArgument(@Nullable Output<WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }

        public Builder singleQueryArgument(@Nullable WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchSingleQueryArgumentGetArgs singleQueryArgument) {
            this.singleQueryArgument = Output.ofNullable(singleQueryArgument);
            return this;
        }

        public Builder uriPath(@Nullable Output<WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchUriPathGetArgs> uriPath) {
            this.uriPath = uriPath;
            return this;
        }

        public Builder uriPath(@Nullable WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchUriPathGetArgs uriPath) {
            this.uriPath = Output.ofNullable(uriPath);
            return this;
        }
        public WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchGetArgs build() {
            return new WebAclRuleStatementOrStatementStatementNotStatementStatementSqliMatchStatementFieldToMatchGetArgs(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
