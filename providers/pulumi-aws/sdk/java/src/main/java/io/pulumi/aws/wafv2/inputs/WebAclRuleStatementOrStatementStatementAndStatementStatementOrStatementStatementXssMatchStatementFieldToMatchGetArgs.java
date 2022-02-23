// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchBodyGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchMethodGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchQueryStringGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleHeaderGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchUriPathGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchGetArgs Empty = new WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchGetArgs();

    /**
     * Inspect all query arguments.
     * 
     */
    @InputImport(name="allQueryArguments")
    private final @Nullable Input<WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments;

    public Input<WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsGetArgs> getAllQueryArguments() {
        return this.allQueryArguments == null ? Input.empty() : this.allQueryArguments;
    }

    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    @InputImport(name="body")
    private final @Nullable Input<WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchBodyGetArgs> body;

    public Input<WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchBodyGetArgs> getBody() {
        return this.body == null ? Input.empty() : this.body;
    }

    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @InputImport(name="method")
    private final @Nullable Input<WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchMethodGetArgs> method;

    public Input<WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchMethodGetArgs> getMethod() {
        return this.method == null ? Input.empty() : this.method;
    }

    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    @InputImport(name="queryString")
    private final @Nullable Input<WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchQueryStringGetArgs> queryString;

    public Input<WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchQueryStringGetArgs> getQueryString() {
        return this.queryString == null ? Input.empty() : this.queryString;
    }

    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    @InputImport(name="singleHeader")
    private final @Nullable Input<WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleHeaderGetArgs> singleHeader;

    public Input<WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleHeaderGetArgs> getSingleHeader() {
        return this.singleHeader == null ? Input.empty() : this.singleHeader;
    }

    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    @InputImport(name="singleQueryArgument")
    private final @Nullable Input<WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument;

    public Input<WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentGetArgs> getSingleQueryArgument() {
        return this.singleQueryArgument == null ? Input.empty() : this.singleQueryArgument;
    }

    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    @InputImport(name="uriPath")
    private final @Nullable Input<WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchUriPathGetArgs> uriPath;

    public Input<WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchUriPathGetArgs> getUriPath() {
        return this.uriPath == null ? Input.empty() : this.uriPath;
    }

    public WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchGetArgs(
        @Nullable Input<WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments,
        @Nullable Input<WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchBodyGetArgs> body,
        @Nullable Input<WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchMethodGetArgs> method,
        @Nullable Input<WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchQueryStringGetArgs> queryString,
        @Nullable Input<WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleHeaderGetArgs> singleHeader,
        @Nullable Input<WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument,
        @Nullable Input<WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchUriPathGetArgs> uriPath) {
        this.allQueryArguments = allQueryArguments;
        this.body = body;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.singleQueryArgument = singleQueryArgument;
        this.uriPath = uriPath;
    }

    private WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchGetArgs() {
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

    public static Builder builder(WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments;
        private @Nullable Input<WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchBodyGetArgs> body;
        private @Nullable Input<WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchMethodGetArgs> method;
        private @Nullable Input<WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchQueryStringGetArgs> queryString;
        private @Nullable Input<WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleHeaderGetArgs> singleHeader;
        private @Nullable Input<WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument;
        private @Nullable Input<WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchUriPathGetArgs> uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder setAllQueryArguments(@Nullable Input<WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }

        public Builder setAllQueryArguments(@Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchAllQueryArgumentsGetArgs allQueryArguments) {
            this.allQueryArguments = Input.ofNullable(allQueryArguments);
            return this;
        }

        public Builder setBody(@Nullable Input<WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchBodyGetArgs> body) {
            this.body = body;
            return this;
        }

        public Builder setBody(@Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchBodyGetArgs body) {
            this.body = Input.ofNullable(body);
            return this;
        }

        public Builder setMethod(@Nullable Input<WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchMethodGetArgs> method) {
            this.method = method;
            return this;
        }

        public Builder setMethod(@Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchMethodGetArgs method) {
            this.method = Input.ofNullable(method);
            return this;
        }

        public Builder setQueryString(@Nullable Input<WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchQueryStringGetArgs> queryString) {
            this.queryString = queryString;
            return this;
        }

        public Builder setQueryString(@Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchQueryStringGetArgs queryString) {
            this.queryString = Input.ofNullable(queryString);
            return this;
        }

        public Builder setSingleHeader(@Nullable Input<WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleHeaderGetArgs> singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }

        public Builder setSingleHeader(@Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleHeaderGetArgs singleHeader) {
            this.singleHeader = Input.ofNullable(singleHeader);
            return this;
        }

        public Builder setSingleQueryArgument(@Nullable Input<WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }

        public Builder setSingleQueryArgument(@Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleQueryArgumentGetArgs singleQueryArgument) {
            this.singleQueryArgument = Input.ofNullable(singleQueryArgument);
            return this;
        }

        public Builder setUriPath(@Nullable Input<WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchUriPathGetArgs> uriPath) {
            this.uriPath = uriPath;
            return this;
        }

        public Builder setUriPath(@Nullable WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchUriPathGetArgs uriPath) {
            this.uriPath = Input.ofNullable(uriPath);
            return this;
        }
        public WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchGetArgs build() {
            return new WebAclRuleStatementOrStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchGetArgs(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
