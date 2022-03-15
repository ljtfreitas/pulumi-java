// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsGetArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchBodyGetArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchMethodGetArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchQueryStringGetArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchSingleHeaderGetArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentGetArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchUriPathGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchGetArgs Empty = new RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchGetArgs();

    /**
     * Inspect all query arguments.
     * 
     */
    @Import(name="allQueryArguments")
      private final @Nullable Output<RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments;

    public Output<RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsGetArgs> getAllQueryArguments() {
        return this.allQueryArguments == null ? Output.empty() : this.allQueryArguments;
    }

    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    @Import(name="body")
      private final @Nullable Output<RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchBodyGetArgs> body;

    public Output<RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchBodyGetArgs> getBody() {
        return this.body == null ? Output.empty() : this.body;
    }

    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @Import(name="method")
      private final @Nullable Output<RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchMethodGetArgs> method;

    public Output<RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchMethodGetArgs> getMethod() {
        return this.method == null ? Output.empty() : this.method;
    }

    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    @Import(name="queryString")
      private final @Nullable Output<RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchQueryStringGetArgs> queryString;

    public Output<RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchQueryStringGetArgs> getQueryString() {
        return this.queryString == null ? Output.empty() : this.queryString;
    }

    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    @Import(name="singleHeader")
      private final @Nullable Output<RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchSingleHeaderGetArgs> singleHeader;

    public Output<RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchSingleHeaderGetArgs> getSingleHeader() {
        return this.singleHeader == null ? Output.empty() : this.singleHeader;
    }

    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    @Import(name="singleQueryArgument")
      private final @Nullable Output<RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument;

    public Output<RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentGetArgs> getSingleQueryArgument() {
        return this.singleQueryArgument == null ? Output.empty() : this.singleQueryArgument;
    }

    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    @Import(name="uriPath")
      private final @Nullable Output<RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchUriPathGetArgs> uriPath;

    public Output<RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchUriPathGetArgs> getUriPath() {
        return this.uriPath == null ? Output.empty() : this.uriPath;
    }

    public RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchGetArgs(
        @Nullable Output<RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments,
        @Nullable Output<RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchBodyGetArgs> body,
        @Nullable Output<RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchMethodGetArgs> method,
        @Nullable Output<RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchQueryStringGetArgs> queryString,
        @Nullable Output<RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchSingleHeaderGetArgs> singleHeader,
        @Nullable Output<RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument,
        @Nullable Output<RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchUriPathGetArgs> uriPath) {
        this.allQueryArguments = allQueryArguments;
        this.body = body;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.singleQueryArgument = singleQueryArgument;
        this.uriPath = uriPath;
    }

    private RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchGetArgs() {
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

    public static Builder builder(RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments;
        private @Nullable Output<RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchBodyGetArgs> body;
        private @Nullable Output<RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchMethodGetArgs> method;
        private @Nullable Output<RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchQueryStringGetArgs> queryString;
        private @Nullable Output<RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchSingleHeaderGetArgs> singleHeader;
        private @Nullable Output<RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument;
        private @Nullable Output<RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchUriPathGetArgs> uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder allQueryArguments(@Nullable Output<RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }

        public Builder allQueryArguments(@Nullable RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsGetArgs allQueryArguments) {
            this.allQueryArguments = Output.ofNullable(allQueryArguments);
            return this;
        }

        public Builder body(@Nullable Output<RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchBodyGetArgs> body) {
            this.body = body;
            return this;
        }

        public Builder body(@Nullable RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchBodyGetArgs body) {
            this.body = Output.ofNullable(body);
            return this;
        }

        public Builder method(@Nullable Output<RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchMethodGetArgs> method) {
            this.method = method;
            return this;
        }

        public Builder method(@Nullable RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchMethodGetArgs method) {
            this.method = Output.ofNullable(method);
            return this;
        }

        public Builder queryString(@Nullable Output<RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchQueryStringGetArgs> queryString) {
            this.queryString = queryString;
            return this;
        }

        public Builder queryString(@Nullable RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchQueryStringGetArgs queryString) {
            this.queryString = Output.ofNullable(queryString);
            return this;
        }

        public Builder singleHeader(@Nullable Output<RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchSingleHeaderGetArgs> singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }

        public Builder singleHeader(@Nullable RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchSingleHeaderGetArgs singleHeader) {
            this.singleHeader = Output.ofNullable(singleHeader);
            return this;
        }

        public Builder singleQueryArgument(@Nullable Output<RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }

        public Builder singleQueryArgument(@Nullable RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentGetArgs singleQueryArgument) {
            this.singleQueryArgument = Output.ofNullable(singleQueryArgument);
            return this;
        }

        public Builder uriPath(@Nullable Output<RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchUriPathGetArgs> uriPath) {
            this.uriPath = uriPath;
            return this;
        }

        public Builder uriPath(@Nullable RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchUriPathGetArgs uriPath) {
            this.uriPath = Output.ofNullable(uriPath);
            return this;
        }
        public RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchGetArgs build() {
            return new RuleGroupRuleStatementNotStatementStatementByteMatchStatementFieldToMatchGetArgs(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
