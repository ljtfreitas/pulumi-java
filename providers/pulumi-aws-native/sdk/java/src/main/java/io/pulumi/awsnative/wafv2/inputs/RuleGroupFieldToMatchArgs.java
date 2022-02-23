// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.inputs.RuleGroupFieldToMatchSingleHeaderPropertiesArgs;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupFieldToMatchSingleQueryArgumentPropertiesArgs;
import io.pulumi.awsnative.wafv2.inputs.RuleGroupJsonBodyArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Field of the request to match.
 * 
 */
public final class RuleGroupFieldToMatchArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupFieldToMatchArgs Empty = new RuleGroupFieldToMatchArgs();

    /**
     * All query arguments of a web request.
     * 
     */
    @InputImport(name="allQueryArguments")
        private final @Nullable Input<Object> allQueryArguments;

    public Input<Object> getAllQueryArguments() {
        return this.allQueryArguments == null ? Input.empty() : this.allQueryArguments;
    }

    /**
     * The body of a web request. This immediately follows the request headers.
     * 
     */
    @InputImport(name="body")
        private final @Nullable Input<Object> body;

    public Input<Object> getBody() {
        return this.body == null ? Input.empty() : this.body;
    }

    @InputImport(name="jsonBody")
        private final @Nullable Input<RuleGroupJsonBodyArgs> jsonBody;

    public Input<RuleGroupJsonBodyArgs> getJsonBody() {
        return this.jsonBody == null ? Input.empty() : this.jsonBody;
    }

    /**
     * The HTTP method of a web request. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @InputImport(name="method")
        private final @Nullable Input<Object> method;

    public Input<Object> getMethod() {
        return this.method == null ? Input.empty() : this.method;
    }

    /**
     * The query string of a web request. This is the part of a URL that appears after a ? character, if any.
     * 
     */
    @InputImport(name="queryString")
        private final @Nullable Input<Object> queryString;

    public Input<Object> getQueryString() {
        return this.queryString == null ? Input.empty() : this.queryString;
    }

    @InputImport(name="singleHeader")
        private final @Nullable Input<RuleGroupFieldToMatchSingleHeaderPropertiesArgs> singleHeader;

    public Input<RuleGroupFieldToMatchSingleHeaderPropertiesArgs> getSingleHeader() {
        return this.singleHeader == null ? Input.empty() : this.singleHeader;
    }

    /**
     * One query argument in a web request, identified by name, for example UserName or SalesRegion. The name can be up to 30 characters long and isn't case sensitive.
     * 
     */
    @InputImport(name="singleQueryArgument")
        private final @Nullable Input<RuleGroupFieldToMatchSingleQueryArgumentPropertiesArgs> singleQueryArgument;

    public Input<RuleGroupFieldToMatchSingleQueryArgumentPropertiesArgs> getSingleQueryArgument() {
        return this.singleQueryArgument == null ? Input.empty() : this.singleQueryArgument;
    }

    /**
     * The path component of the URI of a web request. This is the part of a web request that identifies a resource, for example, /images/daily-ad.jpg.
     * 
     */
    @InputImport(name="uriPath")
        private final @Nullable Input<Object> uriPath;

    public Input<Object> getUriPath() {
        return this.uriPath == null ? Input.empty() : this.uriPath;
    }

    public RuleGroupFieldToMatchArgs(
        @Nullable Input<Object> allQueryArguments,
        @Nullable Input<Object> body,
        @Nullable Input<RuleGroupJsonBodyArgs> jsonBody,
        @Nullable Input<Object> method,
        @Nullable Input<Object> queryString,
        @Nullable Input<RuleGroupFieldToMatchSingleHeaderPropertiesArgs> singleHeader,
        @Nullable Input<RuleGroupFieldToMatchSingleQueryArgumentPropertiesArgs> singleQueryArgument,
        @Nullable Input<Object> uriPath) {
        this.allQueryArguments = allQueryArguments;
        this.body = body;
        this.jsonBody = jsonBody;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.singleQueryArgument = singleQueryArgument;
        this.uriPath = uriPath;
    }

    private RuleGroupFieldToMatchArgs() {
        this.allQueryArguments = Input.empty();
        this.body = Input.empty();
        this.jsonBody = Input.empty();
        this.method = Input.empty();
        this.queryString = Input.empty();
        this.singleHeader = Input.empty();
        this.singleQueryArgument = Input.empty();
        this.uriPath = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupFieldToMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> allQueryArguments;
        private @Nullable Input<Object> body;
        private @Nullable Input<RuleGroupJsonBodyArgs> jsonBody;
        private @Nullable Input<Object> method;
        private @Nullable Input<Object> queryString;
        private @Nullable Input<RuleGroupFieldToMatchSingleHeaderPropertiesArgs> singleHeader;
        private @Nullable Input<RuleGroupFieldToMatchSingleQueryArgumentPropertiesArgs> singleQueryArgument;
        private @Nullable Input<Object> uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupFieldToMatchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.jsonBody = defaults.jsonBody;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder setAllQueryArguments(@Nullable Input<Object> allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }

        public Builder setAllQueryArguments(@Nullable Object allQueryArguments) {
            this.allQueryArguments = Input.ofNullable(allQueryArguments);
            return this;
        }

        public Builder setBody(@Nullable Input<Object> body) {
            this.body = body;
            return this;
        }

        public Builder setBody(@Nullable Object body) {
            this.body = Input.ofNullable(body);
            return this;
        }

        public Builder setJsonBody(@Nullable Input<RuleGroupJsonBodyArgs> jsonBody) {
            this.jsonBody = jsonBody;
            return this;
        }

        public Builder setJsonBody(@Nullable RuleGroupJsonBodyArgs jsonBody) {
            this.jsonBody = Input.ofNullable(jsonBody);
            return this;
        }

        public Builder setMethod(@Nullable Input<Object> method) {
            this.method = method;
            return this;
        }

        public Builder setMethod(@Nullable Object method) {
            this.method = Input.ofNullable(method);
            return this;
        }

        public Builder setQueryString(@Nullable Input<Object> queryString) {
            this.queryString = queryString;
            return this;
        }

        public Builder setQueryString(@Nullable Object queryString) {
            this.queryString = Input.ofNullable(queryString);
            return this;
        }

        public Builder setSingleHeader(@Nullable Input<RuleGroupFieldToMatchSingleHeaderPropertiesArgs> singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }

        public Builder setSingleHeader(@Nullable RuleGroupFieldToMatchSingleHeaderPropertiesArgs singleHeader) {
            this.singleHeader = Input.ofNullable(singleHeader);
            return this;
        }

        public Builder setSingleQueryArgument(@Nullable Input<RuleGroupFieldToMatchSingleQueryArgumentPropertiesArgs> singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }

        public Builder setSingleQueryArgument(@Nullable RuleGroupFieldToMatchSingleQueryArgumentPropertiesArgs singleQueryArgument) {
            this.singleQueryArgument = Input.ofNullable(singleQueryArgument);
            return this;
        }

        public Builder setUriPath(@Nullable Input<Object> uriPath) {
            this.uriPath = uriPath;
            return this;
        }

        public Builder setUriPath(@Nullable Object uriPath) {
            this.uriPath = Input.ofNullable(uriPath);
            return this;
        }
        public RuleGroupFieldToMatchArgs build() {
            return new RuleGroupFieldToMatchArgs(allQueryArguments, body, jsonBody, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}
