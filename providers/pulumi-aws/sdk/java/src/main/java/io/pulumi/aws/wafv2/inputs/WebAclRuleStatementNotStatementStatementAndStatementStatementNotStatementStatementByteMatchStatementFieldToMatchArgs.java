// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchBodyArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchMethodArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchQueryStringArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleHeaderArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchUriPathArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchArgs Empty = new WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchArgs();

    /**
     * Inspect all query arguments.
     * 
     */
    @Import(name="allQueryArguments")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments;

    public Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsArgs> getAllQueryArguments() {
        return this.allQueryArguments == null ? Output.empty() : this.allQueryArguments;
    }

    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    @Import(name="body")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchBodyArgs> body;

    public Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchBodyArgs> getBody() {
        return this.body == null ? Output.empty() : this.body;
    }

    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @Import(name="method")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchMethodArgs> method;

    public Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchMethodArgs> getMethod() {
        return this.method == null ? Output.empty() : this.method;
    }

    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    @Import(name="queryString")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchQueryStringArgs> queryString;

    public Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchQueryStringArgs> getQueryString() {
        return this.queryString == null ? Output.empty() : this.queryString;
    }

    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    @Import(name="singleHeader")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleHeaderArgs> singleHeader;

    public Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleHeaderArgs> getSingleHeader() {
        return this.singleHeader == null ? Output.empty() : this.singleHeader;
    }

    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    @Import(name="singleQueryArgument")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument;

    public Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentArgs> getSingleQueryArgument() {
        return this.singleQueryArgument == null ? Output.empty() : this.singleQueryArgument;
    }

    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    @Import(name="uriPath")
      private final @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchUriPathArgs> uriPath;

    public Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchUriPathArgs> getUriPath() {
        return this.uriPath == null ? Output.empty() : this.uriPath;
    }

    public WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchArgs(
        @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments,
        @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchBodyArgs> body,
        @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchMethodArgs> method,
        @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchQueryStringArgs> queryString,
        @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleHeaderArgs> singleHeader,
        @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument,
        @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchUriPathArgs> uriPath) {
        this.allQueryArguments = allQueryArguments;
        this.body = body;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.singleQueryArgument = singleQueryArgument;
        this.uriPath = uriPath;
    }

    private WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchArgs() {
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

    public static Builder builder(WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchBodyArgs> body;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchMethodArgs> method;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchQueryStringArgs> queryString;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleHeaderArgs> singleHeader;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument;
        private @Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchUriPathArgs> uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder allQueryArguments(@Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }

        public Builder allQueryArguments(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsArgs allQueryArguments) {
            this.allQueryArguments = Output.ofNullable(allQueryArguments);
            return this;
        }

        public Builder body(@Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchBodyArgs> body) {
            this.body = body;
            return this;
        }

        public Builder body(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchBodyArgs body) {
            this.body = Output.ofNullable(body);
            return this;
        }

        public Builder method(@Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchMethodArgs> method) {
            this.method = method;
            return this;
        }

        public Builder method(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchMethodArgs method) {
            this.method = Output.ofNullable(method);
            return this;
        }

        public Builder queryString(@Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchQueryStringArgs> queryString) {
            this.queryString = queryString;
            return this;
        }

        public Builder queryString(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchQueryStringArgs queryString) {
            this.queryString = Output.ofNullable(queryString);
            return this;
        }

        public Builder singleHeader(@Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleHeaderArgs> singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }

        public Builder singleHeader(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleHeaderArgs singleHeader) {
            this.singleHeader = Output.ofNullable(singleHeader);
            return this;
        }

        public Builder singleQueryArgument(@Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }

        public Builder singleQueryArgument(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentArgs singleQueryArgument) {
            this.singleQueryArgument = Output.ofNullable(singleQueryArgument);
            return this;
        }

        public Builder uriPath(@Nullable Output<WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchUriPathArgs> uriPath) {
            this.uriPath = uriPath;
            return this;
        }

        public Builder uriPath(@Nullable WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchUriPathArgs uriPath) {
            this.uriPath = Output.ofNullable(uriPath);
            return this;
        }
        public WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchArgs build() {
            return new WebAclRuleStatementNotStatementStatementAndStatementStatementNotStatementStatementByteMatchStatementFieldToMatchArgs(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
