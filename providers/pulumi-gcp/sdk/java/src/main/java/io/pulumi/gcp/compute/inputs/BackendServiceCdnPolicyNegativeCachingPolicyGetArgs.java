// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BackendServiceCdnPolicyNegativeCachingPolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackendServiceCdnPolicyNegativeCachingPolicyGetArgs Empty = new BackendServiceCdnPolicyNegativeCachingPolicyGetArgs();

    /**
     * The HTTP status code to define a TTL against. Only HTTP status codes 300, 301, 308, 404, 405, 410, 421, 451 and 501
     * can be specified as values, and you cannot specify a status code more than once.
     * 
     */
    @Import(name="code")
      private final @Nullable Output<Integer> code;

    public Output<Integer> getCode() {
        return this.code == null ? Output.empty() : this.code;
    }

    /**
     * The TTL (in seconds) for which to cache responses with the corresponding status code. The maximum allowed value is 1800s
     * (30 minutes), noting that infrequently accessed objects may be evicted from the cache before the defined TTL.
     * 
     */
    @Import(name="ttl")
      private final @Nullable Output<Integer> ttl;

    public Output<Integer> getTtl() {
        return this.ttl == null ? Output.empty() : this.ttl;
    }

    public BackendServiceCdnPolicyNegativeCachingPolicyGetArgs(
        @Nullable Output<Integer> code,
        @Nullable Output<Integer> ttl) {
        this.code = code;
        this.ttl = ttl;
    }

    private BackendServiceCdnPolicyNegativeCachingPolicyGetArgs() {
        this.code = Output.empty();
        this.ttl = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendServiceCdnPolicyNegativeCachingPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> code;
        private @Nullable Output<Integer> ttl;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendServiceCdnPolicyNegativeCachingPolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.ttl = defaults.ttl;
        }

        public Builder code(@Nullable Output<Integer> code) {
            this.code = code;
            return this;
        }

        public Builder code(@Nullable Integer code) {
            this.code = Output.ofNullable(code);
            return this;
        }

        public Builder ttl(@Nullable Output<Integer> ttl) {
            this.ttl = ttl;
            return this;
        }

        public Builder ttl(@Nullable Integer ttl) {
            this.ttl = Output.ofNullable(ttl);
            return this;
        }
        public BackendServiceCdnPolicyNegativeCachingPolicyGetArgs build() {
            return new BackendServiceCdnPolicyNegativeCachingPolicyGetArgs(code, ttl);
        }
    }
}
