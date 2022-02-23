// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Bypass the cache when the specified request headers are present, e.g. Pragma or Authorization headers. Values are case insensitive. The presence of such a header overrides the cache_mode setting.
 * 
 */
public final class BackendBucketCdnPolicyBypassCacheOnRequestHeaderArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackendBucketCdnPolicyBypassCacheOnRequestHeaderArgs Empty = new BackendBucketCdnPolicyBypassCacheOnRequestHeaderArgs();

    /**
     * The header field name to match on when bypassing cache. Values are case-insensitive.
     * 
     */
    @InputImport(name="headerName")
      private final @Nullable Input<String> headerName;

    public Input<String> getHeaderName() {
        return this.headerName == null ? Input.empty() : this.headerName;
    }

    public BackendBucketCdnPolicyBypassCacheOnRequestHeaderArgs(@Nullable Input<String> headerName) {
        this.headerName = headerName;
    }

    private BackendBucketCdnPolicyBypassCacheOnRequestHeaderArgs() {
        this.headerName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendBucketCdnPolicyBypassCacheOnRequestHeaderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> headerName;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendBucketCdnPolicyBypassCacheOnRequestHeaderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerName = defaults.headerName;
        }

        public Builder setHeaderName(@Nullable Input<String> headerName) {
            this.headerName = headerName;
            return this;
        }

        public Builder setHeaderName(@Nullable String headerName) {
            this.headerName = Input.ofNullable(headerName);
            return this;
        }
        public BackendBucketCdnPolicyBypassCacheOnRequestHeaderArgs build() {
            return new BackendBucketCdnPolicyBypassCacheOnRequestHeaderArgs(headerName);
        }
    }
}
