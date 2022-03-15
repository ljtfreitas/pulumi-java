// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.outputs;

import io.pulumi.aws.cloudfront.outputs.GetResponseHeadersPolicyCorsConfigAccessControlAllowHeader;
import io.pulumi.aws.cloudfront.outputs.GetResponseHeadersPolicyCorsConfigAccessControlAllowMethod;
import io.pulumi.aws.cloudfront.outputs.GetResponseHeadersPolicyCorsConfigAccessControlAllowOrigin;
import io.pulumi.aws.cloudfront.outputs.GetResponseHeadersPolicyCorsConfigAccessControlExposeHeader;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetResponseHeadersPolicyCorsConfig {
    /**
     * A Boolean value that CloudFront uses as the value for the Access-Control-Allow-Credentials HTTP response header.
     * 
     */
    private final Boolean accessControlAllowCredentials;
    /**
     * Object that contains an attribute `items` that contains a list of HTTP header names that CloudFront includes as values for the Access-Control-Allow-Headers HTTP response header.
     * 
     */
    private final List<GetResponseHeadersPolicyCorsConfigAccessControlAllowHeader> accessControlAllowHeaders;
    /**
     * Object that contains an attribute `items` that contains a list of HTTP methods that CloudFront includes as values for the Access-Control-Allow-Methods HTTP response header. Valid values: `GET` | `POST` | `OPTIONS` | `PUT` | `DELETE` | `HEAD` | `ALL`
     * 
     */
    private final List<GetResponseHeadersPolicyCorsConfigAccessControlAllowMethod> accessControlAllowMethods;
    /**
     * Object that contains an attribute `items` that contains a list of origins that CloudFront can use as the value for the Access-Control-Allow-Origin HTTP response header.
     * 
     */
    private final List<GetResponseHeadersPolicyCorsConfigAccessControlAllowOrigin> accessControlAllowOrigins;
    /**
     * Object that contains an attribute `items` that contains a list of HTTP headers that CloudFront includes as values for the Access-Control-Expose-Headers HTTP response header.
     * 
     */
    private final List<GetResponseHeadersPolicyCorsConfigAccessControlExposeHeader> accessControlExposeHeaders;
    /**
     * A number that CloudFront uses as the value for the max-age directive in the Strict-Transport-Security HTTP response header.
     * 
     */
    private final Integer accessControlMaxAgeSec;
    private final Boolean originOverride;

    @CustomType.Constructor
    private GetResponseHeadersPolicyCorsConfig(
        @CustomType.Parameter("accessControlAllowCredentials") Boolean accessControlAllowCredentials,
        @CustomType.Parameter("accessControlAllowHeaders") List<GetResponseHeadersPolicyCorsConfigAccessControlAllowHeader> accessControlAllowHeaders,
        @CustomType.Parameter("accessControlAllowMethods") List<GetResponseHeadersPolicyCorsConfigAccessControlAllowMethod> accessControlAllowMethods,
        @CustomType.Parameter("accessControlAllowOrigins") List<GetResponseHeadersPolicyCorsConfigAccessControlAllowOrigin> accessControlAllowOrigins,
        @CustomType.Parameter("accessControlExposeHeaders") List<GetResponseHeadersPolicyCorsConfigAccessControlExposeHeader> accessControlExposeHeaders,
        @CustomType.Parameter("accessControlMaxAgeSec") Integer accessControlMaxAgeSec,
        @CustomType.Parameter("originOverride") Boolean originOverride) {
        this.accessControlAllowCredentials = accessControlAllowCredentials;
        this.accessControlAllowHeaders = accessControlAllowHeaders;
        this.accessControlAllowMethods = accessControlAllowMethods;
        this.accessControlAllowOrigins = accessControlAllowOrigins;
        this.accessControlExposeHeaders = accessControlExposeHeaders;
        this.accessControlMaxAgeSec = accessControlMaxAgeSec;
        this.originOverride = originOverride;
    }

    /**
     * A Boolean value that CloudFront uses as the value for the Access-Control-Allow-Credentials HTTP response header.
     * 
    */
    public Boolean getAccessControlAllowCredentials() {
        return this.accessControlAllowCredentials;
    }
    /**
     * Object that contains an attribute `items` that contains a list of HTTP header names that CloudFront includes as values for the Access-Control-Allow-Headers HTTP response header.
     * 
    */
    public List<GetResponseHeadersPolicyCorsConfigAccessControlAllowHeader> getAccessControlAllowHeaders() {
        return this.accessControlAllowHeaders;
    }
    /**
     * Object that contains an attribute `items` that contains a list of HTTP methods that CloudFront includes as values for the Access-Control-Allow-Methods HTTP response header. Valid values: `GET` | `POST` | `OPTIONS` | `PUT` | `DELETE` | `HEAD` | `ALL`
     * 
    */
    public List<GetResponseHeadersPolicyCorsConfigAccessControlAllowMethod> getAccessControlAllowMethods() {
        return this.accessControlAllowMethods;
    }
    /**
     * Object that contains an attribute `items` that contains a list of origins that CloudFront can use as the value for the Access-Control-Allow-Origin HTTP response header.
     * 
    */
    public List<GetResponseHeadersPolicyCorsConfigAccessControlAllowOrigin> getAccessControlAllowOrigins() {
        return this.accessControlAllowOrigins;
    }
    /**
     * Object that contains an attribute `items` that contains a list of HTTP headers that CloudFront includes as values for the Access-Control-Expose-Headers HTTP response header.
     * 
    */
    public List<GetResponseHeadersPolicyCorsConfigAccessControlExposeHeader> getAccessControlExposeHeaders() {
        return this.accessControlExposeHeaders;
    }
    /**
     * A number that CloudFront uses as the value for the max-age directive in the Strict-Transport-Security HTTP response header.
     * 
    */
    public Integer getAccessControlMaxAgeSec() {
        return this.accessControlMaxAgeSec;
    }
    public Boolean getOriginOverride() {
        return this.originOverride;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResponseHeadersPolicyCorsConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean accessControlAllowCredentials;
        private List<GetResponseHeadersPolicyCorsConfigAccessControlAllowHeader> accessControlAllowHeaders;
        private List<GetResponseHeadersPolicyCorsConfigAccessControlAllowMethod> accessControlAllowMethods;
        private List<GetResponseHeadersPolicyCorsConfigAccessControlAllowOrigin> accessControlAllowOrigins;
        private List<GetResponseHeadersPolicyCorsConfigAccessControlExposeHeader> accessControlExposeHeaders;
        private Integer accessControlMaxAgeSec;
        private Boolean originOverride;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResponseHeadersPolicyCorsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessControlAllowCredentials = defaults.accessControlAllowCredentials;
    	      this.accessControlAllowHeaders = defaults.accessControlAllowHeaders;
    	      this.accessControlAllowMethods = defaults.accessControlAllowMethods;
    	      this.accessControlAllowOrigins = defaults.accessControlAllowOrigins;
    	      this.accessControlExposeHeaders = defaults.accessControlExposeHeaders;
    	      this.accessControlMaxAgeSec = defaults.accessControlMaxAgeSec;
    	      this.originOverride = defaults.originOverride;
        }

        public Builder accessControlAllowCredentials(Boolean accessControlAllowCredentials) {
            this.accessControlAllowCredentials = Objects.requireNonNull(accessControlAllowCredentials);
            return this;
        }

        public Builder accessControlAllowHeaders(List<GetResponseHeadersPolicyCorsConfigAccessControlAllowHeader> accessControlAllowHeaders) {
            this.accessControlAllowHeaders = Objects.requireNonNull(accessControlAllowHeaders);
            return this;
        }

        public Builder accessControlAllowMethods(List<GetResponseHeadersPolicyCorsConfigAccessControlAllowMethod> accessControlAllowMethods) {
            this.accessControlAllowMethods = Objects.requireNonNull(accessControlAllowMethods);
            return this;
        }

        public Builder accessControlAllowOrigins(List<GetResponseHeadersPolicyCorsConfigAccessControlAllowOrigin> accessControlAllowOrigins) {
            this.accessControlAllowOrigins = Objects.requireNonNull(accessControlAllowOrigins);
            return this;
        }

        public Builder accessControlExposeHeaders(List<GetResponseHeadersPolicyCorsConfigAccessControlExposeHeader> accessControlExposeHeaders) {
            this.accessControlExposeHeaders = Objects.requireNonNull(accessControlExposeHeaders);
            return this;
        }

        public Builder accessControlMaxAgeSec(Integer accessControlMaxAgeSec) {
            this.accessControlMaxAgeSec = Objects.requireNonNull(accessControlMaxAgeSec);
            return this;
        }

        public Builder originOverride(Boolean originOverride) {
            this.originOverride = Objects.requireNonNull(originOverride);
            return this;
        }
        public GetResponseHeadersPolicyCorsConfig build() {
            return new GetResponseHeadersPolicyCorsConfig(accessControlAllowCredentials, accessControlAllowHeaders, accessControlAllowMethods, accessControlAllowOrigins, accessControlExposeHeaders, accessControlMaxAgeSec, originOverride);
        }
    }
}
