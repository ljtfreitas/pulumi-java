// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchBodyArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchMethodArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchQueryStringArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchSingleHeaderArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchUriPathArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchArgs Empty = new RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchArgs();

    /**
     * Inspect all query arguments.
     * 
     */
    @InputImport(name="allQueryArguments")
    private final @Nullable Input<RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments;

    public Input<RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs> getAllQueryArguments() {
        return this.allQueryArguments == null ? Input.empty() : this.allQueryArguments;
    }

    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    @InputImport(name="body")
    private final @Nullable Input<RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchBodyArgs> body;

    public Input<RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchBodyArgs> getBody() {
        return this.body == null ? Input.empty() : this.body;
    }

    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @InputImport(name="method")
    private final @Nullable Input<RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchMethodArgs> method;

    public Input<RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchMethodArgs> getMethod() {
        return this.method == null ? Input.empty() : this.method;
    }

    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    @InputImport(name="queryString")
    private final @Nullable Input<RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchQueryStringArgs> queryString;

    public Input<RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchQueryStringArgs> getQueryString() {
        return this.queryString == null ? Input.empty() : this.queryString;
    }

    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    @InputImport(name="singleHeader")
    private final @Nullable Input<RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchSingleHeaderArgs> singleHeader;

    public Input<RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchSingleHeaderArgs> getSingleHeader() {
        return this.singleHeader == null ? Input.empty() : this.singleHeader;
    }

    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    @InputImport(name="singleQueryArgument")
    private final @Nullable Input<RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument;

    public Input<RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs> getSingleQueryArgument() {
        return this.singleQueryArgument == null ? Input.empty() : this.singleQueryArgument;
    }

    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    @InputImport(name="uriPath")
    private final @Nullable Input<RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchUriPathArgs> uriPath;

    public Input<RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchUriPathArgs> getUriPath() {
        return this.uriPath == null ? Input.empty() : this.uriPath;
    }

    public RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchArgs(
        @Nullable Input<RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments,
        @Nullable Input<RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchBodyArgs> body,
        @Nullable Input<RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchMethodArgs> method,
        @Nullable Input<RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchQueryStringArgs> queryString,
        @Nullable Input<RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchSingleHeaderArgs> singleHeader,
        @Nullable Input<RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument,
        @Nullable Input<RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchUriPathArgs> uriPath) {
        this.allQueryArguments = allQueryArguments;
        this.body = body;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.singleQueryArgument = singleQueryArgument;
        this.uriPath = uriPath;
    }

    private RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchArgs() {
        this.allQueryArguments = Input.empty();
        this.body = Input.empty();
        this.method = Input.empty();
        this.queryString = Input.empty();
        this.singleHeader = Input.empty();
        this.singleQueryArgument = Input.empty();
        this.uriPath = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments;
        private @Nullable Input<RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchBodyArgs> body;
        private @Nullable Input<RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchMethodArgs> method;
        private @Nullable Input<RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchQueryStringArgs> queryString;
        private @Nullable Input<RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchSingleHeaderArgs> singleHeader;
        private @Nullable Input<RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument;
        private @Nullable Input<RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchUriPathArgs> uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder setAllQueryArguments(@Nullable Input<RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs> allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }

        public Builder setAllQueryArguments(@Nullable RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsArgs allQueryArguments) {
            this.allQueryArguments = Input.ofNullable(allQueryArguments);
            return this;
        }

        public Builder setBody(@Nullable Input<RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchBodyArgs> body) {
            this.body = body;
            return this;
        }

        public Builder setBody(@Nullable RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchBodyArgs body) {
            this.body = Input.ofNullable(body);
            return this;
        }

        public Builder setMethod(@Nullable Input<RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchMethodArgs> method) {
            this.method = method;
            return this;
        }

        public Builder setMethod(@Nullable RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchMethodArgs method) {
            this.method = Input.ofNullable(method);
            return this;
        }

        public Builder setQueryString(@Nullable Input<RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchQueryStringArgs> queryString) {
            this.queryString = queryString;
            return this;
        }

        public Builder setQueryString(@Nullable RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchQueryStringArgs queryString) {
            this.queryString = Input.ofNullable(queryString);
            return this;
        }

        public Builder setSingleHeader(@Nullable Input<RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchSingleHeaderArgs> singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }

        public Builder setSingleHeader(@Nullable RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchSingleHeaderArgs singleHeader) {
            this.singleHeader = Input.ofNullable(singleHeader);
            return this;
        }

        public Builder setSingleQueryArgument(@Nullable Input<RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs> singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }

        public Builder setSingleQueryArgument(@Nullable RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentArgs singleQueryArgument) {
            this.singleQueryArgument = Input.ofNullable(singleQueryArgument);
            return this;
        }

        public Builder setUriPath(@Nullable Input<RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchUriPathArgs> uriPath) {
            this.uriPath = uriPath;
            return this;
        }

        public Builder setUriPath(@Nullable RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchUriPathArgs uriPath) {
            this.uriPath = Input.ofNullable(uriPath);
            return this;
        }
        public RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchArgs build() {
            return new RuleGroupRuleStatementNotStatementStatementXssMatchStatementFieldToMatchArgs(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}