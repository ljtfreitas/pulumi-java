// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_v1.inputs.ConsistentHashLoadBalancerSettingsHttpCookieArgs;
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
    @Import(name="httpCookie")
      private final @Nullable Output<ConsistentHashLoadBalancerSettingsHttpCookieArgs> httpCookie;

    public Output<ConsistentHashLoadBalancerSettingsHttpCookieArgs> getHttpCookie() {
        return this.httpCookie == null ? Output.empty() : this.httpCookie;
    }

    /**
     * The hash based on the value of the specified header field. This field is applicable if the sessionAffinity is set to HEADER_FIELD.
     * 
     */
    @Import(name="httpHeaderName")
      private final @Nullable Output<String> httpHeaderName;

    public Output<String> getHttpHeaderName() {
        return this.httpHeaderName == null ? Output.empty() : this.httpHeaderName;
    }

    /**
     * The minimum number of virtual nodes to use for the hash ring. Defaults to 1024. Larger ring sizes result in more granular load distributions. If the number of hosts in the load balancing pool is larger than the ring size, each host will be assigned a single virtual node.
     * 
     */
    @Import(name="minimumRingSize")
      private final @Nullable Output<String> minimumRingSize;

    public Output<String> getMinimumRingSize() {
        return this.minimumRingSize == null ? Output.empty() : this.minimumRingSize;
    }

    public ConsistentHashLoadBalancerSettingsArgs(
        @Nullable Output<ConsistentHashLoadBalancerSettingsHttpCookieArgs> httpCookie,
        @Nullable Output<String> httpHeaderName,
        @Nullable Output<String> minimumRingSize) {
        this.httpCookie = httpCookie;
        this.httpHeaderName = httpHeaderName;
        this.minimumRingSize = minimumRingSize;
    }

    private ConsistentHashLoadBalancerSettingsArgs() {
        this.httpCookie = Output.empty();
        this.httpHeaderName = Output.empty();
        this.minimumRingSize = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConsistentHashLoadBalancerSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ConsistentHashLoadBalancerSettingsHttpCookieArgs> httpCookie;
        private @Nullable Output<String> httpHeaderName;
        private @Nullable Output<String> minimumRingSize;

        public Builder() {
    	      // Empty
        }

        public Builder(ConsistentHashLoadBalancerSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpCookie = defaults.httpCookie;
    	      this.httpHeaderName = defaults.httpHeaderName;
    	      this.minimumRingSize = defaults.minimumRingSize;
        }

        public Builder httpCookie(@Nullable Output<ConsistentHashLoadBalancerSettingsHttpCookieArgs> httpCookie) {
            this.httpCookie = httpCookie;
            return this;
        }

        public Builder httpCookie(@Nullable ConsistentHashLoadBalancerSettingsHttpCookieArgs httpCookie) {
            this.httpCookie = Output.ofNullable(httpCookie);
            return this;
        }

        public Builder httpHeaderName(@Nullable Output<String> httpHeaderName) {
            this.httpHeaderName = httpHeaderName;
            return this;
        }

        public Builder httpHeaderName(@Nullable String httpHeaderName) {
            this.httpHeaderName = Output.ofNullable(httpHeaderName);
            return this;
        }

        public Builder minimumRingSize(@Nullable Output<String> minimumRingSize) {
            this.minimumRingSize = minimumRingSize;
            return this;
        }

        public Builder minimumRingSize(@Nullable String minimumRingSize) {
            this.minimumRingSize = Output.ofNullable(minimumRingSize);
            return this;
        }
        public ConsistentHashLoadBalancerSettingsArgs build() {
            return new ConsistentHashLoadBalancerSettingsArgs(httpCookie, httpHeaderName, minimumRingSize);
        }
    }
}
