// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute.v1.inputs.Int64RangeMatchArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * matchRule criteria for request header matches.
 * 
 */
public final class HttpHeaderMatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final HttpHeaderMatchArgs Empty = new HttpHeaderMatchArgs();

    /**
     * The value should exactly match contents of exactMatch. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
     * 
     */
    @Import(name="exactMatch")
    private @Nullable Output<String> exactMatch;

    /**
     * @return The value should exactly match contents of exactMatch. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
     * 
     */
    public Optional<Output<String>> exactMatch() {
        return Optional.ofNullable(this.exactMatch);
    }

    /**
     * The name of the HTTP header to match. For matching against the HTTP request&#39;s authority, use a headerMatch with the header name &#34;:authority&#34;. For matching a request&#39;s method, use the headerName &#34;:method&#34;. When the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true, only non-binary user-specified custom metadata and the `content-type` header are supported. The following transport-level headers cannot be used in header matching rules: `:authority`, `:method`, `:path`, `:scheme`, `user-agent`, `accept-encoding`, `content-encoding`, `grpc-accept-encoding`, `grpc-encoding`, `grpc-previous-rpc-attempts`, `grpc-tags-bin`, `grpc-timeout` and `grpc-trace-bin`.
     * 
     */
    @Import(name="headerName")
    private @Nullable Output<String> headerName;

    /**
     * @return The name of the HTTP header to match. For matching against the HTTP request&#39;s authority, use a headerMatch with the header name &#34;:authority&#34;. For matching a request&#39;s method, use the headerName &#34;:method&#34;. When the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true, only non-binary user-specified custom metadata and the `content-type` header are supported. The following transport-level headers cannot be used in header matching rules: `:authority`, `:method`, `:path`, `:scheme`, `user-agent`, `accept-encoding`, `content-encoding`, `grpc-accept-encoding`, `grpc-encoding`, `grpc-previous-rpc-attempts`, `grpc-tags-bin`, `grpc-timeout` and `grpc-trace-bin`.
     * 
     */
    public Optional<Output<String>> headerName() {
        return Optional.ofNullable(this.headerName);
    }

    /**
     * If set to false, the headerMatch is considered a match if the preceding match criteria are met. If set to true, the headerMatch is considered a match if the preceding match criteria are NOT met. The default setting is false.
     * 
     */
    @Import(name="invertMatch")
    private @Nullable Output<Boolean> invertMatch;

    /**
     * @return If set to false, the headerMatch is considered a match if the preceding match criteria are met. If set to true, the headerMatch is considered a match if the preceding match criteria are NOT met. The default setting is false.
     * 
     */
    public Optional<Output<Boolean>> invertMatch() {
        return Optional.ofNullable(this.invertMatch);
    }

    /**
     * The value of the header must start with the contents of prefixMatch. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
     * 
     */
    @Import(name="prefixMatch")
    private @Nullable Output<String> prefixMatch;

    /**
     * @return The value of the header must start with the contents of prefixMatch. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
     * 
     */
    public Optional<Output<String>> prefixMatch() {
        return Optional.ofNullable(this.prefixMatch);
    }

    /**
     * A header with the contents of headerName must exist. The match takes place whether or not the request&#39;s header has a value. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
     * 
     */
    @Import(name="presentMatch")
    private @Nullable Output<Boolean> presentMatch;

    /**
     * @return A header with the contents of headerName must exist. The match takes place whether or not the request&#39;s header has a value. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
     * 
     */
    public Optional<Output<Boolean>> presentMatch() {
        return Optional.ofNullable(this.presentMatch);
    }

    /**
     * The header value must be an integer and its value must be in the range specified in rangeMatch. If the header does not contain an integer, number or is empty, the match fails. For example for a range [-5, 0] - -3 will match. - 0 will not match. - 0.25 will not match. - -3someString will not match. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set. rangeMatch is not supported for load balancers that have loadBalancingScheme set to EXTERNAL.
     * 
     */
    @Import(name="rangeMatch")
    private @Nullable Output<Int64RangeMatchArgs> rangeMatch;

    /**
     * @return The header value must be an integer and its value must be in the range specified in rangeMatch. If the header does not contain an integer, number or is empty, the match fails. For example for a range [-5, 0] - -3 will match. - 0 will not match. - 0.25 will not match. - -3someString will not match. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set. rangeMatch is not supported for load balancers that have loadBalancingScheme set to EXTERNAL.
     * 
     */
    public Optional<Output<Int64RangeMatchArgs>> rangeMatch() {
        return Optional.ofNullable(this.rangeMatch);
    }

    /**
     * The value of the header must match the regular expression specified in regexMatch. For more information about regular expression syntax, see Syntax. For matching against a port specified in the HTTP request, use a headerMatch with headerName set to PORT and a regular expression that satisfies the RFC2616 Host header&#39;s port specifier. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set. regexMatch only applies to load balancers that have loadBalancingScheme set to INTERNAL_SELF_MANAGED.
     * 
     */
    @Import(name="regexMatch")
    private @Nullable Output<String> regexMatch;

    /**
     * @return The value of the header must match the regular expression specified in regexMatch. For more information about regular expression syntax, see Syntax. For matching against a port specified in the HTTP request, use a headerMatch with headerName set to PORT and a regular expression that satisfies the RFC2616 Host header&#39;s port specifier. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set. regexMatch only applies to load balancers that have loadBalancingScheme set to INTERNAL_SELF_MANAGED.
     * 
     */
    public Optional<Output<String>> regexMatch() {
        return Optional.ofNullable(this.regexMatch);
    }

    /**
     * The value of the header must end with the contents of suffixMatch. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
     * 
     */
    @Import(name="suffixMatch")
    private @Nullable Output<String> suffixMatch;

    /**
     * @return The value of the header must end with the contents of suffixMatch. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
     * 
     */
    public Optional<Output<String>> suffixMatch() {
        return Optional.ofNullable(this.suffixMatch);
    }

    private HttpHeaderMatchArgs() {}

    private HttpHeaderMatchArgs(HttpHeaderMatchArgs $) {
        this.exactMatch = $.exactMatch;
        this.headerName = $.headerName;
        this.invertMatch = $.invertMatch;
        this.prefixMatch = $.prefixMatch;
        this.presentMatch = $.presentMatch;
        this.rangeMatch = $.rangeMatch;
        this.regexMatch = $.regexMatch;
        this.suffixMatch = $.suffixMatch;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HttpHeaderMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HttpHeaderMatchArgs $;

        public Builder() {
            $ = new HttpHeaderMatchArgs();
        }

        public Builder(HttpHeaderMatchArgs defaults) {
            $ = new HttpHeaderMatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param exactMatch The value should exactly match contents of exactMatch. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
         * 
         * @return builder
         * 
         */
        public Builder exactMatch(@Nullable Output<String> exactMatch) {
            $.exactMatch = exactMatch;
            return this;
        }

        /**
         * @param exactMatch The value should exactly match contents of exactMatch. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
         * 
         * @return builder
         * 
         */
        public Builder exactMatch(String exactMatch) {
            return exactMatch(Output.of(exactMatch));
        }

        /**
         * @param headerName The name of the HTTP header to match. For matching against the HTTP request&#39;s authority, use a headerMatch with the header name &#34;:authority&#34;. For matching a request&#39;s method, use the headerName &#34;:method&#34;. When the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true, only non-binary user-specified custom metadata and the `content-type` header are supported. The following transport-level headers cannot be used in header matching rules: `:authority`, `:method`, `:path`, `:scheme`, `user-agent`, `accept-encoding`, `content-encoding`, `grpc-accept-encoding`, `grpc-encoding`, `grpc-previous-rpc-attempts`, `grpc-tags-bin`, `grpc-timeout` and `grpc-trace-bin`.
         * 
         * @return builder
         * 
         */
        public Builder headerName(@Nullable Output<String> headerName) {
            $.headerName = headerName;
            return this;
        }

        /**
         * @param headerName The name of the HTTP header to match. For matching against the HTTP request&#39;s authority, use a headerMatch with the header name &#34;:authority&#34;. For matching a request&#39;s method, use the headerName &#34;:method&#34;. When the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true, only non-binary user-specified custom metadata and the `content-type` header are supported. The following transport-level headers cannot be used in header matching rules: `:authority`, `:method`, `:path`, `:scheme`, `user-agent`, `accept-encoding`, `content-encoding`, `grpc-accept-encoding`, `grpc-encoding`, `grpc-previous-rpc-attempts`, `grpc-tags-bin`, `grpc-timeout` and `grpc-trace-bin`.
         * 
         * @return builder
         * 
         */
        public Builder headerName(String headerName) {
            return headerName(Output.of(headerName));
        }

        /**
         * @param invertMatch If set to false, the headerMatch is considered a match if the preceding match criteria are met. If set to true, the headerMatch is considered a match if the preceding match criteria are NOT met. The default setting is false.
         * 
         * @return builder
         * 
         */
        public Builder invertMatch(@Nullable Output<Boolean> invertMatch) {
            $.invertMatch = invertMatch;
            return this;
        }

        /**
         * @param invertMatch If set to false, the headerMatch is considered a match if the preceding match criteria are met. If set to true, the headerMatch is considered a match if the preceding match criteria are NOT met. The default setting is false.
         * 
         * @return builder
         * 
         */
        public Builder invertMatch(Boolean invertMatch) {
            return invertMatch(Output.of(invertMatch));
        }

        /**
         * @param prefixMatch The value of the header must start with the contents of prefixMatch. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
         * 
         * @return builder
         * 
         */
        public Builder prefixMatch(@Nullable Output<String> prefixMatch) {
            $.prefixMatch = prefixMatch;
            return this;
        }

        /**
         * @param prefixMatch The value of the header must start with the contents of prefixMatch. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
         * 
         * @return builder
         * 
         */
        public Builder prefixMatch(String prefixMatch) {
            return prefixMatch(Output.of(prefixMatch));
        }

        /**
         * @param presentMatch A header with the contents of headerName must exist. The match takes place whether or not the request&#39;s header has a value. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
         * 
         * @return builder
         * 
         */
        public Builder presentMatch(@Nullable Output<Boolean> presentMatch) {
            $.presentMatch = presentMatch;
            return this;
        }

        /**
         * @param presentMatch A header with the contents of headerName must exist. The match takes place whether or not the request&#39;s header has a value. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
         * 
         * @return builder
         * 
         */
        public Builder presentMatch(Boolean presentMatch) {
            return presentMatch(Output.of(presentMatch));
        }

        /**
         * @param rangeMatch The header value must be an integer and its value must be in the range specified in rangeMatch. If the header does not contain an integer, number or is empty, the match fails. For example for a range [-5, 0] - -3 will match. - 0 will not match. - 0.25 will not match. - -3someString will not match. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set. rangeMatch is not supported for load balancers that have loadBalancingScheme set to EXTERNAL.
         * 
         * @return builder
         * 
         */
        public Builder rangeMatch(@Nullable Output<Int64RangeMatchArgs> rangeMatch) {
            $.rangeMatch = rangeMatch;
            return this;
        }

        /**
         * @param rangeMatch The header value must be an integer and its value must be in the range specified in rangeMatch. If the header does not contain an integer, number or is empty, the match fails. For example for a range [-5, 0] - -3 will match. - 0 will not match. - 0.25 will not match. - -3someString will not match. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set. rangeMatch is not supported for load balancers that have loadBalancingScheme set to EXTERNAL.
         * 
         * @return builder
         * 
         */
        public Builder rangeMatch(Int64RangeMatchArgs rangeMatch) {
            return rangeMatch(Output.of(rangeMatch));
        }

        /**
         * @param regexMatch The value of the header must match the regular expression specified in regexMatch. For more information about regular expression syntax, see Syntax. For matching against a port specified in the HTTP request, use a headerMatch with headerName set to PORT and a regular expression that satisfies the RFC2616 Host header&#39;s port specifier. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set. regexMatch only applies to load balancers that have loadBalancingScheme set to INTERNAL_SELF_MANAGED.
         * 
         * @return builder
         * 
         */
        public Builder regexMatch(@Nullable Output<String> regexMatch) {
            $.regexMatch = regexMatch;
            return this;
        }

        /**
         * @param regexMatch The value of the header must match the regular expression specified in regexMatch. For more information about regular expression syntax, see Syntax. For matching against a port specified in the HTTP request, use a headerMatch with headerName set to PORT and a regular expression that satisfies the RFC2616 Host header&#39;s port specifier. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set. regexMatch only applies to load balancers that have loadBalancingScheme set to INTERNAL_SELF_MANAGED.
         * 
         * @return builder
         * 
         */
        public Builder regexMatch(String regexMatch) {
            return regexMatch(Output.of(regexMatch));
        }

        /**
         * @param suffixMatch The value of the header must end with the contents of suffixMatch. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
         * 
         * @return builder
         * 
         */
        public Builder suffixMatch(@Nullable Output<String> suffixMatch) {
            $.suffixMatch = suffixMatch;
            return this;
        }

        /**
         * @param suffixMatch The value of the header must end with the contents of suffixMatch. Only one of exactMatch, prefixMatch, suffixMatch, regexMatch, presentMatch or rangeMatch must be set.
         * 
         * @return builder
         * 
         */
        public Builder suffixMatch(String suffixMatch) {
            return suffixMatch(Output.of(suffixMatch));
        }

        public HttpHeaderMatchArgs build() {
            return $;
        }
    }

}
