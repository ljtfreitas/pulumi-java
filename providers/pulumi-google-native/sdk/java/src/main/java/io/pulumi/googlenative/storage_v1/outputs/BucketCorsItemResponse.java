// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class BucketCorsItemResponse {
    /**
     * The value, in seconds, to return in the  Access-Control-Max-Age header used in preflight responses.
     * 
     */
    private final Integer maxAgeSeconds;
    /**
     * The list of HTTP methods on which to include CORS response headers, (GET, OPTIONS, POST, etc) Note: "*" is permitted in the list of methods, and means "any method".
     * 
     */
    private final List<String> method;
    /**
     * The list of Origins eligible to receive CORS response headers. Note: "*" is permitted in the list of origins, and means "any Origin".
     * 
     */
    private final List<String> origin;
    /**
     * The list of HTTP headers other than the simple response headers to give permission for the user-agent to share across domains.
     * 
     */
    private final List<String> responseHeader;

    @CustomType.Constructor
    private BucketCorsItemResponse(
        @CustomType.Parameter("maxAgeSeconds") Integer maxAgeSeconds,
        @CustomType.Parameter("method") List<String> method,
        @CustomType.Parameter("origin") List<String> origin,
        @CustomType.Parameter("responseHeader") List<String> responseHeader) {
        this.maxAgeSeconds = maxAgeSeconds;
        this.method = method;
        this.origin = origin;
        this.responseHeader = responseHeader;
    }

    /**
     * The value, in seconds, to return in the  Access-Control-Max-Age header used in preflight responses.
     * 
    */
    public Integer getMaxAgeSeconds() {
        return this.maxAgeSeconds;
    }
    /**
     * The list of HTTP methods on which to include CORS response headers, (GET, OPTIONS, POST, etc) Note: "*" is permitted in the list of methods, and means "any method".
     * 
    */
    public List<String> getMethod() {
        return this.method;
    }
    /**
     * The list of Origins eligible to receive CORS response headers. Note: "*" is permitted in the list of origins, and means "any Origin".
     * 
    */
    public List<String> getOrigin() {
        return this.origin;
    }
    /**
     * The list of HTTP headers other than the simple response headers to give permission for the user-agent to share across domains.
     * 
    */
    public List<String> getResponseHeader() {
        return this.responseHeader;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketCorsItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxAgeSeconds;
        private List<String> method;
        private List<String> origin;
        private List<String> responseHeader;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketCorsItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxAgeSeconds = defaults.maxAgeSeconds;
    	      this.method = defaults.method;
    	      this.origin = defaults.origin;
    	      this.responseHeader = defaults.responseHeader;
        }

        public Builder maxAgeSeconds(Integer maxAgeSeconds) {
            this.maxAgeSeconds = Objects.requireNonNull(maxAgeSeconds);
            return this;
        }

        public Builder method(List<String> method) {
            this.method = Objects.requireNonNull(method);
            return this;
        }

        public Builder origin(List<String> origin) {
            this.origin = Objects.requireNonNull(origin);
            return this;
        }

        public Builder responseHeader(List<String> responseHeader) {
            this.responseHeader = Objects.requireNonNull(responseHeader);
            return this;
        }
        public BucketCorsItemResponse build() {
            return new BucketCorsItemResponse(maxAgeSeconds, method, origin, responseHeader);
        }
    }
}
