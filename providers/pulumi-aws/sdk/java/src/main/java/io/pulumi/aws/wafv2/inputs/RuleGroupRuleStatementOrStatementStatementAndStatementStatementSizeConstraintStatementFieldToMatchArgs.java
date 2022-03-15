// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchBodyArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchMethodArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchQueryStringArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchUriPathArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchArgs Empty = new RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchArgs();

    /**
     * Inspect all query arguments.
     * 
     */
    @Import(name="allQueryArguments")
      private final @Nullable Output<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments;

    public Output<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsArgs> getAllQueryArguments() {
        return this.allQueryArguments == null ? Output.empty() : this.allQueryArguments;
    }

    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    @Import(name="body")
      private final @Nullable Output<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchBodyArgs> body;

    public Output<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchBodyArgs> getBody() {
        return this.body == null ? Output.empty() : this.body;
    }

    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @Import(name="method")
      private final @Nullable Output<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchMethodArgs> method;

    public Output<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchMethodArgs> getMethod() {
        return this.method == null ? Output.empty() : this.method;
    }

    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    @Import(name="queryString")
      private final @Nullable Output<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchQueryStringArgs> queryString;

    public Output<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchQueryStringArgs> getQueryString() {
        return this.queryString == null ? Output.empty() : this.queryString;
    }

    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    @Import(name="singleHeader")
      private final @Nullable Output<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderArgs> singleHeader;

    public Output<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderArgs> getSingleHeader() {
        return this.singleHeader == null ? Output.empty() : this.singleHeader;
    }

    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    @Import(name="singleQueryArgument")
      private final @Nullable Output<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument;

    public Output<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentArgs> getSingleQueryArgument() {
        return this.singleQueryArgument == null ? Output.empty() : this.singleQueryArgument;
    }

    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    @Import(name="uriPath")
      private final @Nullable Output<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchUriPathArgs> uriPath;

    public Output<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchUriPathArgs> getUriPath() {
        return this.uriPath == null ? Output.empty() : this.uriPath;
    }

    public RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchArgs(
        @Nullable Output<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments,
        @Nullable Output<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchBodyArgs> body,
        @Nullable Output<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchMethodArgs> method,
        @Nullable Output<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchQueryStringArgs> queryString,
        @Nullable Output<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderArgs> singleHeader,
        @Nullable Output<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument,
        @Nullable Output<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchUriPathArgs> uriPath) {
        this.allQueryArguments = allQueryArguments;
        this.body = body;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.singleQueryArgument = singleQueryArgument;
        this.uriPath = uriPath;
    }

    private RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchArgs() {
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

    public static Builder builder(RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments;
        private @Nullable Output<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchBodyArgs> body;
        private @Nullable Output<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchMethodArgs> method;
        private @Nullable Output<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchQueryStringArgs> queryString;
        private @Nullable Output<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderArgs> singleHeader;
        private @Nullable Output<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument;
        private @Nullable Output<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchUriPathArgs> uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder allQueryArguments(@Nullable Output<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }

        public Builder allQueryArguments(@Nullable RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchAllQueryArgumentsArgs allQueryArguments) {
            this.allQueryArguments = Output.ofNullable(allQueryArguments);
            return this;
        }

        public Builder body(@Nullable Output<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchBodyArgs> body) {
            this.body = body;
            return this;
        }

        public Builder body(@Nullable RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchBodyArgs body) {
            this.body = Output.ofNullable(body);
            return this;
        }

        public Builder method(@Nullable Output<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchMethodArgs> method) {
            this.method = method;
            return this;
        }

        public Builder method(@Nullable RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchMethodArgs method) {
            this.method = Output.ofNullable(method);
            return this;
        }

        public Builder queryString(@Nullable Output<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchQueryStringArgs> queryString) {
            this.queryString = queryString;
            return this;
        }

        public Builder queryString(@Nullable RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchQueryStringArgs queryString) {
            this.queryString = Output.ofNullable(queryString);
            return this;
        }

        public Builder singleHeader(@Nullable Output<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderArgs> singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }

        public Builder singleHeader(@Nullable RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderArgs singleHeader) {
            this.singleHeader = Output.ofNullable(singleHeader);
            return this;
        }

        public Builder singleQueryArgument(@Nullable Output<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }

        public Builder singleQueryArgument(@Nullable RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleQueryArgumentArgs singleQueryArgument) {
            this.singleQueryArgument = Output.ofNullable(singleQueryArgument);
            return this;
        }

        public Builder uriPath(@Nullable Output<RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchUriPathArgs> uriPath) {
            this.uriPath = uriPath;
            return this;
        }

        public Builder uriPath(@Nullable RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchUriPathArgs uriPath) {
            this.uriPath = Output.ofNullable(uriPath);
            return this;
        }
        public RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchArgs build() {
            return new RuleGroupRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchArgs(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
