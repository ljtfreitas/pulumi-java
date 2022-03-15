// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * Specify CDN TTLs for response error codes.
 * 
 */
public final class BackendServiceCdnPolicyNegativeCachingPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final BackendServiceCdnPolicyNegativeCachingPolicyResponse Empty = new BackendServiceCdnPolicyNegativeCachingPolicyResponse();

    /**
     * The HTTP status code to define a TTL against. Only HTTP status codes 300, 301, 302, 307, 308, 404, 405, 410, 421, 451 and 501 are can be specified as values, and you cannot specify a status code more than once.
     * 
     */
    @Import(name="code", required=true)
      private final Integer code;

    public Integer getCode() {
        return this.code;
    }

    /**
     * The TTL (in seconds) for which to cache responses with the corresponding status code. The maximum allowed value is 1800s (30 minutes), noting that infrequently accessed objects may be evicted from the cache before the defined TTL.
     * 
     */
    @Import(name="ttl", required=true)
      private final Integer ttl;

    public Integer getTtl() {
        return this.ttl;
    }

    public BackendServiceCdnPolicyNegativeCachingPolicyResponse(
        Integer code,
        Integer ttl) {
        this.code = Objects.requireNonNull(code, "expected parameter 'code' to be non-null");
        this.ttl = Objects.requireNonNull(ttl, "expected parameter 'ttl' to be non-null");
    }

    private BackendServiceCdnPolicyNegativeCachingPolicyResponse() {
        this.code = null;
        this.ttl = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendServiceCdnPolicyNegativeCachingPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer code;
        private Integer ttl;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendServiceCdnPolicyNegativeCachingPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.ttl = defaults.ttl;
        }

        public Builder code(Integer code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }

        public Builder ttl(Integer ttl) {
            this.ttl = Objects.requireNonNull(ttl);
            return this;
        }
        public BackendServiceCdnPolicyNegativeCachingPolicyResponse build() {
            return new BackendServiceCdnPolicyNegativeCachingPolicyResponse(code, ttl);
        }
    }
}
