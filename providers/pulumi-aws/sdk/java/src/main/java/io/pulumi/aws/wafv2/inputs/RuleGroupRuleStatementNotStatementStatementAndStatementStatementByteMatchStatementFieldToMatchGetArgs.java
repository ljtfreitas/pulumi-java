// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsGetArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchBodyGetArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchMethodGetArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchQueryStringGetArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleHeaderGetArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentGetArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchUriPathGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchGetArgs Empty = new RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchGetArgs();

    /**
     * Inspect all query arguments.
     * 
     */
    @Import(name="allQueryArguments")
      private final @Nullable Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments;

    public Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsGetArgs> getAllQueryArguments() {
        return this.allQueryArguments == null ? Output.empty() : this.allQueryArguments;
    }

    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    @Import(name="body")
      private final @Nullable Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchBodyGetArgs> body;

    public Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchBodyGetArgs> getBody() {
        return this.body == null ? Output.empty() : this.body;
    }

    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @Import(name="method")
      private final @Nullable Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchMethodGetArgs> method;

    public Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchMethodGetArgs> getMethod() {
        return this.method == null ? Output.empty() : this.method;
    }

    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    @Import(name="queryString")
      private final @Nullable Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchQueryStringGetArgs> queryString;

    public Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchQueryStringGetArgs> getQueryString() {
        return this.queryString == null ? Output.empty() : this.queryString;
    }

    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    @Import(name="singleHeader")
      private final @Nullable Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleHeaderGetArgs> singleHeader;

    public Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleHeaderGetArgs> getSingleHeader() {
        return this.singleHeader == null ? Output.empty() : this.singleHeader;
    }

    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    @Import(name="singleQueryArgument")
      private final @Nullable Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument;

    public Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentGetArgs> getSingleQueryArgument() {
        return this.singleQueryArgument == null ? Output.empty() : this.singleQueryArgument;
    }

    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    @Import(name="uriPath")
      private final @Nullable Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchUriPathGetArgs> uriPath;

    public Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchUriPathGetArgs> getUriPath() {
        return this.uriPath == null ? Output.empty() : this.uriPath;
    }

    public RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchGetArgs(
        @Nullable Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments,
        @Nullable Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchBodyGetArgs> body,
        @Nullable Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchMethodGetArgs> method,
        @Nullable Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchQueryStringGetArgs> queryString,
        @Nullable Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleHeaderGetArgs> singleHeader,
        @Nullable Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument,
        @Nullable Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchUriPathGetArgs> uriPath) {
        this.allQueryArguments = allQueryArguments;
        this.body = body;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.singleQueryArgument = singleQueryArgument;
        this.uriPath = uriPath;
    }

    private RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchGetArgs() {
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

    public static Builder builder(RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments;
        private @Nullable Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchBodyGetArgs> body;
        private @Nullable Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchMethodGetArgs> method;
        private @Nullable Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchQueryStringGetArgs> queryString;
        private @Nullable Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleHeaderGetArgs> singleHeader;
        private @Nullable Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument;
        private @Nullable Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchUriPathGetArgs> uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder allQueryArguments(@Nullable Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }

        public Builder allQueryArguments(@Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsGetArgs allQueryArguments) {
            this.allQueryArguments = Output.ofNullable(allQueryArguments);
            return this;
        }

        public Builder body(@Nullable Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchBodyGetArgs> body) {
            this.body = body;
            return this;
        }

        public Builder body(@Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchBodyGetArgs body) {
            this.body = Output.ofNullable(body);
            return this;
        }

        public Builder method(@Nullable Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchMethodGetArgs> method) {
            this.method = method;
            return this;
        }

        public Builder method(@Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchMethodGetArgs method) {
            this.method = Output.ofNullable(method);
            return this;
        }

        public Builder queryString(@Nullable Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchQueryStringGetArgs> queryString) {
            this.queryString = queryString;
            return this;
        }

        public Builder queryString(@Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchQueryStringGetArgs queryString) {
            this.queryString = Output.ofNullable(queryString);
            return this;
        }

        public Builder singleHeader(@Nullable Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleHeaderGetArgs> singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }

        public Builder singleHeader(@Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleHeaderGetArgs singleHeader) {
            this.singleHeader = Output.ofNullable(singleHeader);
            return this;
        }

        public Builder singleQueryArgument(@Nullable Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }

        public Builder singleQueryArgument(@Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentGetArgs singleQueryArgument) {
            this.singleQueryArgument = Output.ofNullable(singleQueryArgument);
            return this;
        }

        public Builder uriPath(@Nullable Output<RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchUriPathGetArgs> uriPath) {
            this.uriPath = uriPath;
            return this;
        }

        public Builder uriPath(@Nullable RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchUriPathGetArgs uriPath) {
            this.uriPath = Output.ofNullable(uriPath);
            return this;
        }
        public RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchGetArgs build() {
            return new RuleGroupRuleStatementNotStatementStatementAndStatementStatementByteMatchStatementFieldToMatchGetArgs(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
