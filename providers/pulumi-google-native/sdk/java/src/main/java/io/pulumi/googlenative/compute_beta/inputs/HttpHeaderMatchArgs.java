// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_beta.inputs.Int64RangeMatchArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * matchRule criteria for request header matches.
 * 
 */
public final class HttpHeaderMatchArgs extends io.pulumi.resources.ResourceArgs {

    public static final HttpHeaderMatchArgs Empty = new HttpHeaderMatchArgs();

    /**
     * The value should exactly match contents of exactMatch. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
     * 
     */
    @InputImport(name="exactMatch")
      private final @Nullable Input<String> exactMatch;

    public Input<String> getExactMatch() {
        return this.exactMatch == null ? Input.empty() : this.exactMatch;
    }

    /**
     * The name of the HTTP header to match. For matching against the HTTP request's authority, use a headerMatch with the header name ":authority". For matching a request's method, use the headerName ":method". When the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true, only non-binary user-specified custom metadata and the `content-type` header are supported. The following transport-level headers cannot be used in header matching rules: `:authority`, `:method`, `:path`, `:scheme`, `user-agent`, `accept-encoding`, `content-encoding`, `grpc-accept-encoding`, `grpc-encoding`, `grpc-previous-rpc-attempts`, `grpc-tags-bin`, `grpc-timeout` and `grpc-trace-bin`.
     * 
     */
    @InputImport(name="headerName")
      private final @Nullable Input<String> headerName;

    public Input<String> getHeaderName() {
        return this.headerName == null ? Input.empty() : this.headerName;
    }

    /**
     * If set to false, the headerMatch is considered a match if the preceding match criteria are met. If set to true, the headerMatch is considered a match if the preceding match criteria are NOT met. The default setting is false.
     * 
     */
    @InputImport(name="invertMatch")
      private final @Nullable Input<Boolean> invertMatch;

    public Input<Boolean> getInvertMatch() {
        return this.invertMatch == null ? Input.empty() : this.invertMatch;
    }

    /**
     * The value of the header must start with the contents of prefixMatch. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
     * 
     */
    @InputImport(name="prefixMatch")
      private final @Nullable Input<String> prefixMatch;

    public Input<String> getPrefixMatch() {
        return this.prefixMatch == null ? Input.empty() : this.prefixMatch;
    }

    /**
     * A header with the contents of headerName must exist. The match takes place whether or not the request's header has a value. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
     * 
     */
    @InputImport(name="presentMatch")
      private final @Nullable Input<Boolean> presentMatch;

    public Input<Boolean> getPresentMatch() {
        return this.presentMatch == null ? Input.empty() : this.presentMatch;
    }

    /**
     * The header value must be an integer and its value must be in the range specified in rangeMatch. If the header does not contain an integer, number or is empty, the match fails. For example for a range [-5, 0] - -3 will match. - 0 will not match. - 0.25 will not match. - -3someString will not match. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set. rangeMatch is not supported for load balancers that have loadBalancingScheme set to EXTERNAL.
     * 
     */
    @InputImport(name="rangeMatch")
      private final @Nullable Input<Int64RangeMatchArgs> rangeMatch;

    public Input<Int64RangeMatchArgs> getRangeMatch() {
        return this.rangeMatch == null ? Input.empty() : this.rangeMatch;
    }

    /**
     * The value of the header must match the regular expression specified in regexMatch. For more information about regular expression syntax, see Syntax. For matching against a port specified in the HTTP request, use a headerMatch with headerName set to PORT and a regular expression that satisfies the RFC2616 Host header's port specifier. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set. regexMatch only applies to load balancers that have loadBalancingScheme set to INTERNAL_SELF_MANAGED.
     * 
     */
    @InputImport(name="regexMatch")
      private final @Nullable Input<String> regexMatch;

    public Input<String> getRegexMatch() {
        return this.regexMatch == null ? Input.empty() : this.regexMatch;
    }

    /**
     * The value of the header must end with the contents of suffixMatch. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
     * 
     */
    @InputImport(name="suffixMatch")
      private final @Nullable Input<String> suffixMatch;

    public Input<String> getSuffixMatch() {
        return this.suffixMatch == null ? Input.empty() : this.suffixMatch;
    }

    public HttpHeaderMatchArgs(
        @Nullable Input<String> exactMatch,
        @Nullable Input<String> headerName,
        @Nullable Input<Boolean> invertMatch,
        @Nullable Input<String> prefixMatch,
        @Nullable Input<Boolean> presentMatch,
        @Nullable Input<Int64RangeMatchArgs> rangeMatch,
        @Nullable Input<String> regexMatch,
        @Nullable Input<String> suffixMatch) {
        this.exactMatch = exactMatch;
        this.headerName = headerName;
        this.invertMatch = invertMatch;
        this.prefixMatch = prefixMatch;
        this.presentMatch = presentMatch;
        this.rangeMatch = rangeMatch;
        this.regexMatch = regexMatch;
        this.suffixMatch = suffixMatch;
    }

    private HttpHeaderMatchArgs() {
        this.exactMatch = Input.empty();
        this.headerName = Input.empty();
        this.invertMatch = Input.empty();
        this.prefixMatch = Input.empty();
        this.presentMatch = Input.empty();
        this.rangeMatch = Input.empty();
        this.regexMatch = Input.empty();
        this.suffixMatch = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpHeaderMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> exactMatch;
        private @Nullable Input<String> headerName;
        private @Nullable Input<Boolean> invertMatch;
        private @Nullable Input<String> prefixMatch;
        private @Nullable Input<Boolean> presentMatch;
        private @Nullable Input<Int64RangeMatchArgs> rangeMatch;
        private @Nullable Input<String> regexMatch;
        private @Nullable Input<String> suffixMatch;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpHeaderMatchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exactMatch = defaults.exactMatch;
    	      this.headerName = defaults.headerName;
    	      this.invertMatch = defaults.invertMatch;
    	      this.prefixMatch = defaults.prefixMatch;
    	      this.presentMatch = defaults.presentMatch;
    	      this.rangeMatch = defaults.rangeMatch;
    	      this.regexMatch = defaults.regexMatch;
    	      this.suffixMatch = defaults.suffixMatch;
        }

        public Builder setExactMatch(@Nullable Input<String> exactMatch) {
            this.exactMatch = exactMatch;
            return this;
        }

        public Builder setExactMatch(@Nullable String exactMatch) {
            this.exactMatch = Input.ofNullable(exactMatch);
            return this;
        }

        public Builder setHeaderName(@Nullable Input<String> headerName) {
            this.headerName = headerName;
            return this;
        }

        public Builder setHeaderName(@Nullable String headerName) {
            this.headerName = Input.ofNullable(headerName);
            return this;
        }

        public Builder setInvertMatch(@Nullable Input<Boolean> invertMatch) {
            this.invertMatch = invertMatch;
            return this;
        }

        public Builder setInvertMatch(@Nullable Boolean invertMatch) {
            this.invertMatch = Input.ofNullable(invertMatch);
            return this;
        }

        public Builder setPrefixMatch(@Nullable Input<String> prefixMatch) {
            this.prefixMatch = prefixMatch;
            return this;
        }

        public Builder setPrefixMatch(@Nullable String prefixMatch) {
            this.prefixMatch = Input.ofNullable(prefixMatch);
            return this;
        }

        public Builder setPresentMatch(@Nullable Input<Boolean> presentMatch) {
            this.presentMatch = presentMatch;
            return this;
        }

        public Builder setPresentMatch(@Nullable Boolean presentMatch) {
            this.presentMatch = Input.ofNullable(presentMatch);
            return this;
        }

        public Builder setRangeMatch(@Nullable Input<Int64RangeMatchArgs> rangeMatch) {
            this.rangeMatch = rangeMatch;
            return this;
        }

        public Builder setRangeMatch(@Nullable Int64RangeMatchArgs rangeMatch) {
            this.rangeMatch = Input.ofNullable(rangeMatch);
            return this;
        }

        public Builder setRegexMatch(@Nullable Input<String> regexMatch) {
            this.regexMatch = regexMatch;
            return this;
        }

        public Builder setRegexMatch(@Nullable String regexMatch) {
            this.regexMatch = Input.ofNullable(regexMatch);
            return this;
        }

        public Builder setSuffixMatch(@Nullable Input<String> suffixMatch) {
            this.suffixMatch = suffixMatch;
            return this;
        }

        public Builder setSuffixMatch(@Nullable String suffixMatch) {
            this.suffixMatch = Input.ofNullable(suffixMatch);
            return this;
        }
        public HttpHeaderMatchArgs build() {
            return new HttpHeaderMatchArgs(exactMatch, headerName, invertMatch, prefixMatch, presentMatch, rangeMatch, regexMatch, suffixMatch);
        }
    }
}
