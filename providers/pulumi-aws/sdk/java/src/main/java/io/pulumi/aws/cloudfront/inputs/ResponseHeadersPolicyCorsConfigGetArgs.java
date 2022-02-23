// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyCorsConfigAccessControlAllowHeadersGetArgs;
import io.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyCorsConfigAccessControlAllowMethodsGetArgs;
import io.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyCorsConfigAccessControlAllowOriginsGetArgs;
import io.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyCorsConfigAccessControlExposeHeadersGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResponseHeadersPolicyCorsConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResponseHeadersPolicyCorsConfigGetArgs Empty = new ResponseHeadersPolicyCorsConfigGetArgs();

    /**
     * A Boolean value that CloudFront uses as the value for the `Access-Control-Allow-Credentials` HTTP response header.
     * 
     */
    @InputImport(name="accessControlAllowCredentials", required=true)
    private final Input<Boolean> accessControlAllowCredentials;

    public Input<Boolean> getAccessControlAllowCredentials() {
        return this.accessControlAllowCredentials;
    }

    /**
     * Object that contains an attribute `items` that contains a list of HTTP header names that CloudFront includes as values for the `Access-Control-Allow-Headers` HTTP response header.
     * 
     */
    @InputImport(name="accessControlAllowHeaders", required=true)
    private final Input<ResponseHeadersPolicyCorsConfigAccessControlAllowHeadersGetArgs> accessControlAllowHeaders;

    public Input<ResponseHeadersPolicyCorsConfigAccessControlAllowHeadersGetArgs> getAccessControlAllowHeaders() {
        return this.accessControlAllowHeaders;
    }

    /**
     * Object that contains an attribute `items` that contains a list of HTTP methods that CloudFront includes as values for the `Access-Control-Allow-Methods` HTTP response header. Valid values: `GET` | `POST` | `OPTIONS` | `PUT` | `DELETE` | `HEAD` | `ALL`
     * 
     */
    @InputImport(name="accessControlAllowMethods", required=true)
    private final Input<ResponseHeadersPolicyCorsConfigAccessControlAllowMethodsGetArgs> accessControlAllowMethods;

    public Input<ResponseHeadersPolicyCorsConfigAccessControlAllowMethodsGetArgs> getAccessControlAllowMethods() {
        return this.accessControlAllowMethods;
    }

    /**
     * Object that contains an attribute `items` that contains a list of origins that CloudFront can use as the value for the `Access-Control-Allow-Origin` HTTP response header.
     * 
     */
    @InputImport(name="accessControlAllowOrigins", required=true)
    private final Input<ResponseHeadersPolicyCorsConfigAccessControlAllowOriginsGetArgs> accessControlAllowOrigins;

    public Input<ResponseHeadersPolicyCorsConfigAccessControlAllowOriginsGetArgs> getAccessControlAllowOrigins() {
        return this.accessControlAllowOrigins;
    }

    /**
     * Object that contains an attribute `items` that contains a list of HTTP headers that CloudFront includes as values for the `Access-Control-Expose-Headers` HTTP response header.
     * 
     */
    @InputImport(name="accessControlExposeHeaders")
    private final @Nullable Input<ResponseHeadersPolicyCorsConfigAccessControlExposeHeadersGetArgs> accessControlExposeHeaders;

    public Input<ResponseHeadersPolicyCorsConfigAccessControlExposeHeadersGetArgs> getAccessControlExposeHeaders() {
        return this.accessControlExposeHeaders == null ? Input.empty() : this.accessControlExposeHeaders;
    }

    /**
     * A number that CloudFront uses as the value for the `max-age` directive in the `Strict-Transport-Security` HTTP response header.
     * 
     */
    @InputImport(name="accessControlMaxAgeSec")
    private final @Nullable Input<Integer> accessControlMaxAgeSec;

    public Input<Integer> getAccessControlMaxAgeSec() {
        return this.accessControlMaxAgeSec == null ? Input.empty() : this.accessControlMaxAgeSec;
    }

    /**
     * A Boolean value that determines how CloudFront behaves for the HTTP response header.
     * 
     */
    @InputImport(name="originOverride", required=true)
    private final Input<Boolean> originOverride;

    public Input<Boolean> getOriginOverride() {
        return this.originOverride;
    }

    public ResponseHeadersPolicyCorsConfigGetArgs(
        Input<Boolean> accessControlAllowCredentials,
        Input<ResponseHeadersPolicyCorsConfigAccessControlAllowHeadersGetArgs> accessControlAllowHeaders,
        Input<ResponseHeadersPolicyCorsConfigAccessControlAllowMethodsGetArgs> accessControlAllowMethods,
        Input<ResponseHeadersPolicyCorsConfigAccessControlAllowOriginsGetArgs> accessControlAllowOrigins,
        @Nullable Input<ResponseHeadersPolicyCorsConfigAccessControlExposeHeadersGetArgs> accessControlExposeHeaders,
        @Nullable Input<Integer> accessControlMaxAgeSec,
        Input<Boolean> originOverride) {
        this.accessControlAllowCredentials = Objects.requireNonNull(accessControlAllowCredentials, "expected parameter 'accessControlAllowCredentials' to be non-null");
        this.accessControlAllowHeaders = Objects.requireNonNull(accessControlAllowHeaders, "expected parameter 'accessControlAllowHeaders' to be non-null");
        this.accessControlAllowMethods = Objects.requireNonNull(accessControlAllowMethods, "expected parameter 'accessControlAllowMethods' to be non-null");
        this.accessControlAllowOrigins = Objects.requireNonNull(accessControlAllowOrigins, "expected parameter 'accessControlAllowOrigins' to be non-null");
        this.accessControlExposeHeaders = accessControlExposeHeaders;
        this.accessControlMaxAgeSec = accessControlMaxAgeSec;
        this.originOverride = Objects.requireNonNull(originOverride, "expected parameter 'originOverride' to be non-null");
    }

    private ResponseHeadersPolicyCorsConfigGetArgs() {
        this.accessControlAllowCredentials = Input.empty();
        this.accessControlAllowHeaders = Input.empty();
        this.accessControlAllowMethods = Input.empty();
        this.accessControlAllowOrigins = Input.empty();
        this.accessControlExposeHeaders = Input.empty();
        this.accessControlMaxAgeSec = Input.empty();
        this.originOverride = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponseHeadersPolicyCorsConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> accessControlAllowCredentials;
        private Input<ResponseHeadersPolicyCorsConfigAccessControlAllowHeadersGetArgs> accessControlAllowHeaders;
        private Input<ResponseHeadersPolicyCorsConfigAccessControlAllowMethodsGetArgs> accessControlAllowMethods;
        private Input<ResponseHeadersPolicyCorsConfigAccessControlAllowOriginsGetArgs> accessControlAllowOrigins;
        private @Nullable Input<ResponseHeadersPolicyCorsConfigAccessControlExposeHeadersGetArgs> accessControlExposeHeaders;
        private @Nullable Input<Integer> accessControlMaxAgeSec;
        private Input<Boolean> originOverride;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponseHeadersPolicyCorsConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessControlAllowCredentials = defaults.accessControlAllowCredentials;
    	      this.accessControlAllowHeaders = defaults.accessControlAllowHeaders;
    	      this.accessControlAllowMethods = defaults.accessControlAllowMethods;
    	      this.accessControlAllowOrigins = defaults.accessControlAllowOrigins;
    	      this.accessControlExposeHeaders = defaults.accessControlExposeHeaders;
    	      this.accessControlMaxAgeSec = defaults.accessControlMaxAgeSec;
    	      this.originOverride = defaults.originOverride;
        }

        public Builder setAccessControlAllowCredentials(Input<Boolean> accessControlAllowCredentials) {
            this.accessControlAllowCredentials = Objects.requireNonNull(accessControlAllowCredentials);
            return this;
        }

        public Builder setAccessControlAllowCredentials(Boolean accessControlAllowCredentials) {
            this.accessControlAllowCredentials = Input.of(Objects.requireNonNull(accessControlAllowCredentials));
            return this;
        }

        public Builder setAccessControlAllowHeaders(Input<ResponseHeadersPolicyCorsConfigAccessControlAllowHeadersGetArgs> accessControlAllowHeaders) {
            this.accessControlAllowHeaders = Objects.requireNonNull(accessControlAllowHeaders);
            return this;
        }

        public Builder setAccessControlAllowHeaders(ResponseHeadersPolicyCorsConfigAccessControlAllowHeadersGetArgs accessControlAllowHeaders) {
            this.accessControlAllowHeaders = Input.of(Objects.requireNonNull(accessControlAllowHeaders));
            return this;
        }

        public Builder setAccessControlAllowMethods(Input<ResponseHeadersPolicyCorsConfigAccessControlAllowMethodsGetArgs> accessControlAllowMethods) {
            this.accessControlAllowMethods = Objects.requireNonNull(accessControlAllowMethods);
            return this;
        }

        public Builder setAccessControlAllowMethods(ResponseHeadersPolicyCorsConfigAccessControlAllowMethodsGetArgs accessControlAllowMethods) {
            this.accessControlAllowMethods = Input.of(Objects.requireNonNull(accessControlAllowMethods));
            return this;
        }

        public Builder setAccessControlAllowOrigins(Input<ResponseHeadersPolicyCorsConfigAccessControlAllowOriginsGetArgs> accessControlAllowOrigins) {
            this.accessControlAllowOrigins = Objects.requireNonNull(accessControlAllowOrigins);
            return this;
        }

        public Builder setAccessControlAllowOrigins(ResponseHeadersPolicyCorsConfigAccessControlAllowOriginsGetArgs accessControlAllowOrigins) {
            this.accessControlAllowOrigins = Input.of(Objects.requireNonNull(accessControlAllowOrigins));
            return this;
        }

        public Builder setAccessControlExposeHeaders(@Nullable Input<ResponseHeadersPolicyCorsConfigAccessControlExposeHeadersGetArgs> accessControlExposeHeaders) {
            this.accessControlExposeHeaders = accessControlExposeHeaders;
            return this;
        }

        public Builder setAccessControlExposeHeaders(@Nullable ResponseHeadersPolicyCorsConfigAccessControlExposeHeadersGetArgs accessControlExposeHeaders) {
            this.accessControlExposeHeaders = Input.ofNullable(accessControlExposeHeaders);
            return this;
        }

        public Builder setAccessControlMaxAgeSec(@Nullable Input<Integer> accessControlMaxAgeSec) {
            this.accessControlMaxAgeSec = accessControlMaxAgeSec;
            return this;
        }

        public Builder setAccessControlMaxAgeSec(@Nullable Integer accessControlMaxAgeSec) {
            this.accessControlMaxAgeSec = Input.ofNullable(accessControlMaxAgeSec);
            return this;
        }

        public Builder setOriginOverride(Input<Boolean> originOverride) {
            this.originOverride = Objects.requireNonNull(originOverride);
            return this;
        }

        public Builder setOriginOverride(Boolean originOverride) {
            this.originOverride = Input.of(Objects.requireNonNull(originOverride));
            return this;
        }
        public ResponseHeadersPolicyCorsConfigGetArgs build() {
            return new ResponseHeadersPolicyCorsConfigGetArgs(accessControlAllowCredentials, accessControlAllowHeaders, accessControlAllowMethods, accessControlAllowOrigins, accessControlExposeHeaders, accessControlMaxAgeSec, originOverride);
        }
    }
}