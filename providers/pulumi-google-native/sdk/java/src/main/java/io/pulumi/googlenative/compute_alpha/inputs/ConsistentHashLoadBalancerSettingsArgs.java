// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.inputs.ConsistentHashLoadBalancerSettingsHttpCookieArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * This message defines settings for a consistent hash style load balancer.
 * 
 */
public final class ConsistentHashLoadBalancerSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConsistentHashLoadBalancerSettingsArgs Empty = new ConsistentHashLoadBalancerSettingsArgs();

    /**
     * Hash is based on HTTP Cookie. This field describes a HTTP cookie that will be used as the hash key for the consistent hash load balancer. If the cookie is not present, it will be generated. This field is applicable if the sessionAffinity is set to HTTP_COOKIE. Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    @InputImport(name="httpCookie")
      private final @Nullable Input<ConsistentHashLoadBalancerSettingsHttpCookieArgs> httpCookie;

    public Input<ConsistentHashLoadBalancerSettingsHttpCookieArgs> getHttpCookie() {
        return this.httpCookie == null ? Input.empty() : this.httpCookie;
    }

    /**
     * The hash based on the value of the specified header field. This field is applicable if the sessionAffinity is set to HEADER_FIELD.
     * 
     */
    @InputImport(name="httpHeaderName")
      private final @Nullable Input<String> httpHeaderName;

    public Input<String> getHttpHeaderName() {
        return this.httpHeaderName == null ? Input.empty() : this.httpHeaderName;
    }

    /**
     * The minimum number of virtual nodes to use for the hash ring. Defaults to 1024. Larger ring sizes result in more granular load distributions. If the number of hosts in the load balancing pool is larger than the ring size, each host will be assigned a single virtual node.
     * 
     */
    @InputImport(name="minimumRingSize")
      private final @Nullable Input<String> minimumRingSize;

    public Input<String> getMinimumRingSize() {
        return this.minimumRingSize == null ? Input.empty() : this.minimumRingSize;
    }

    public ConsistentHashLoadBalancerSettingsArgs(
        @Nullable Input<ConsistentHashLoadBalancerSettingsHttpCookieArgs> httpCookie,
        @Nullable Input<String> httpHeaderName,
        @Nullable Input<String> minimumRingSize) {
        this.httpCookie = httpCookie;
        this.httpHeaderName = httpHeaderName;
        this.minimumRingSize = minimumRingSize;
    }

    private ConsistentHashLoadBalancerSettingsArgs() {
        this.httpCookie = Input.empty();
        this.httpHeaderName = Input.empty();
        this.minimumRingSize = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConsistentHashLoadBalancerSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ConsistentHashLoadBalancerSettingsHttpCookieArgs> httpCookie;
        private @Nullable Input<String> httpHeaderName;
        private @Nullable Input<String> minimumRingSize;

        public Builder() {
    	      // Empty
        }

        public Builder(ConsistentHashLoadBalancerSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpCookie = defaults.httpCookie;
    	      this.httpHeaderName = defaults.httpHeaderName;
    	      this.minimumRingSize = defaults.minimumRingSize;
        }

        public Builder setHttpCookie(@Nullable Input<ConsistentHashLoadBalancerSettingsHttpCookieArgs> httpCookie) {
            this.httpCookie = httpCookie;
            return this;
        }

        public Builder setHttpCookie(@Nullable ConsistentHashLoadBalancerSettingsHttpCookieArgs httpCookie) {
            this.httpCookie = Input.ofNullable(httpCookie);
            return this;
        }

        public Builder setHttpHeaderName(@Nullable Input<String> httpHeaderName) {
            this.httpHeaderName = httpHeaderName;
            return this;
        }

        public Builder setHttpHeaderName(@Nullable String httpHeaderName) {
            this.httpHeaderName = Input.ofNullable(httpHeaderName);
            return this;
        }

        public Builder setMinimumRingSize(@Nullable Input<String> minimumRingSize) {
            this.minimumRingSize = minimumRingSize;
            return this;
        }

        public Builder setMinimumRingSize(@Nullable String minimumRingSize) {
            this.minimumRingSize = Input.ofNullable(minimumRingSize);
            return this;
        }
        public ConsistentHashLoadBalancerSettingsArgs build() {
            return new ConsistentHashLoadBalancerSettingsArgs(httpCookie, httpHeaderName, minimumRingSize);
        }
    }
}
