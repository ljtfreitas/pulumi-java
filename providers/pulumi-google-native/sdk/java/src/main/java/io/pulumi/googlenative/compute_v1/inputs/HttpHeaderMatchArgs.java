// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_v1.inputs.Int64RangeMatchArgs;
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
    @Import(name="exactMatch")
      private final @Nullable Output<String> exactMatch;

    public Output<String> getExactMatch() {
        return this.exactMatch == null ? Output.empty() : this.exactMatch;
    }

    /**
     * The name of the HTTP header to match. For matching against the HTTP request's authority, use a headerMatch with the header name ":authority". For matching a request's method, use the headerName ":method". When the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true, only non-binary user-specified custom metadata and the `content-type` header are supported. The following transport-level headers cannot be used in header matching rules: `:authority`, `:method`, `:path`, `:scheme`, `user-agent`, `accept-encoding`, `content-encoding`, `grpc-accept-encoding`, `grpc-encoding`, `grpc-previous-rpc-attempts`, `grpc-tags-bin`, `grpc-timeout` and `grpc-trace-bin`.
     * 
     */
    @Import(name="headerName")
      private final @Nullable Output<String> headerName;

    public Output<String> getHeaderName() {
        return this.headerName == null ? Output.empty() : this.headerName;
    }

    /**
     * If set to false, the headerMatch is considered a match if the preceding match criteria are met. If set to true, the headerMatch is considered a match if the preceding match criteria are NOT met. The default setting is false.
     * 
     */
    @Import(name="invertMatch")
      private final @Nullable Output<Boolean> invertMatch;

    public Output<Boolean> getInvertMatch() {
        return this.invertMatch == null ? Output.empty() : this.invertMatch;
    }

    /**
     * The value of the header must start with the contents of prefixMatch. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
     * 
     */
    @Import(name="prefixMatch")
      private final @Nullable Output<String> prefixMatch;

    public Output<String> getPrefixMatch() {
        return this.prefixMatch == null ? Output.empty() : this.prefixMatch;
    }

    /**
     * A header with the contents of headerName must exist. The match takes place whether or not the request's header has a value. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
     * 
     */
    @Import(name="presentMatch")
      private final @Nullable Output<Boolean> presentMatch;

    public Output<Boolean> getPresentMatch() {
        return this.presentMatch == null ? Output.empty() : this.presentMatch;
    }

    /**
     * The header value must be an integer and its value must be in the range specified in rangeMatch. If the header does not contain an integer, number or is empty, the match fails. For example for a range [-5, 0] - -3 will match. - 0 will not match. - 0.25 will not match. - -3someString will not match. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set. rangeMatch is not supported for load balancers that have loadBalancingScheme set to EXTERNAL.
     * 
     */
    @Import(name="rangeMatch")
      private final @Nullable Output<Int64RangeMatchArgs> rangeMatch;

    public Output<Int64RangeMatchArgs> getRangeMatch() {
        return this.rangeMatch == null ? Output.empty() : this.rangeMatch;
    }

    /**
     * The value of the header must match the regular expression specified in regexMatch. For more information about regular expression syntax, see Syntax. For matching against a port specified in the HTTP request, use a headerMatch with headerName set to PORT and a regular expression that satisfies the RFC2616 Host header's port specifier. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set. regexMatch only applies to load balancers that have loadBalancingScheme set to INTERNAL_SELF_MANAGED.
     * 
     */
    @Import(name="regexMatch")
      private final @Nullable Output<String> regexMatch;

    public Output<String> getRegexMatch() {
        return this.regexMatch == null ? Output.empty() : this.regexMatch;
    }

    /**
     * The value of the header must end with the contents of suffixMatch. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
     * 
     */
    @Import(name="suffixMatch")
      private final @Nullable Output<String> suffixMatch;

    public Output<String> getSuffixMatch() {
        return this.suffixMatch == null ? Output.empty() : this.suffixMatch;
    }

    public HttpHeaderMatchArgs(
        @Nullable Output<String> exactMatch,
        @Nullable Output<String> headerName,
        @Nullable Output<Boolean> invertMatch,
        @Nullable Output<String> prefixMatch,
        @Nullable Output<Boolean> presentMatch,
        @Nullable Output<Int64RangeMatchArgs> rangeMatch,
        @Nullable Output<String> regexMatch,
        @Nullable Output<String> suffixMatch) {
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
        this.exactMatch = Output.empty();
        this.headerName = Output.empty();
        this.invertMatch = Output.empty();
        this.prefixMatch = Output.empty();
        this.presentMatch = Output.empty();
        this.rangeMatch = Output.empty();
        this.regexMatch = Output.empty();
        this.suffixMatch = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpHeaderMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> exactMatch;
        private @Nullable Output<String> headerName;
        private @Nullable Output<Boolean> invertMatch;
        private @Nullable Output<String> prefixMatch;
        private @Nullable Output<Boolean> presentMatch;
        private @Nullable Output<Int64RangeMatchArgs> rangeMatch;
        private @Nullable Output<String> regexMatch;
        private @Nullable Output<String> suffixMatch;

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

        public Builder exactMatch(@Nullable Output<String> exactMatch) {
            this.exactMatch = exactMatch;
            return this;
        }

        public Builder exactMatch(@Nullable String exactMatch) {
            this.exactMatch = Output.ofNullable(exactMatch);
            return this;
        }

        public Builder headerName(@Nullable Output<String> headerName) {
            this.headerName = headerName;
            return this;
        }

        public Builder headerName(@Nullable String headerName) {
            this.headerName = Output.ofNullable(headerName);
            return this;
        }

        public Builder invertMatch(@Nullable Output<Boolean> invertMatch) {
            this.invertMatch = invertMatch;
            return this;
        }

        public Builder invertMatch(@Nullable Boolean invertMatch) {
            this.invertMatch = Output.ofNullable(invertMatch);
            return this;
        }

        public Builder prefixMatch(@Nullable Output<String> prefixMatch) {
            this.prefixMatch = prefixMatch;
            return this;
        }

        public Builder prefixMatch(@Nullable String prefixMatch) {
            this.prefixMatch = Output.ofNullable(prefixMatch);
            return this;
        }

        public Builder presentMatch(@Nullable Output<Boolean> presentMatch) {
            this.presentMatch = presentMatch;
            return this;
        }

        public Builder presentMatch(@Nullable Boolean presentMatch) {
            this.presentMatch = Output.ofNullable(presentMatch);
            return this;
        }

        public Builder rangeMatch(@Nullable Output<Int64RangeMatchArgs> rangeMatch) {
            this.rangeMatch = rangeMatch;
            return this;
        }

        public Builder rangeMatch(@Nullable Int64RangeMatchArgs rangeMatch) {
            this.rangeMatch = Output.ofNullable(rangeMatch);
            return this;
        }

        public Builder regexMatch(@Nullable Output<String> regexMatch) {
            this.regexMatch = regexMatch;
            return this;
        }

        public Builder regexMatch(@Nullable String regexMatch) {
            this.regexMatch = Output.ofNullable(regexMatch);
            return this;
        }

        public Builder suffixMatch(@Nullable Output<String> suffixMatch) {
            this.suffixMatch = suffixMatch;
            return this;
        }

        public Builder suffixMatch(@Nullable String suffixMatch) {
            this.suffixMatch = Output.ofNullable(suffixMatch);
            return this;
        }
        public HttpHeaderMatchArgs build() {
            return new HttpHeaderMatchArgs(exactMatch, headerName, invertMatch, prefixMatch, presentMatch, rangeMatch, regexMatch, suffixMatch);
        }
    }
}
