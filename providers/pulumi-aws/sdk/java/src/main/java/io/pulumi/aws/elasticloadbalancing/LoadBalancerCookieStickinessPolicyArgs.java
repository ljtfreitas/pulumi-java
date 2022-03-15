// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticloadbalancing;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LoadBalancerCookieStickinessPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final LoadBalancerCookieStickinessPolicyArgs Empty = new LoadBalancerCookieStickinessPolicyArgs();

    /**
     * The time period after which
     * the session cookie should be considered stale, expressed in seconds.
     * 
     */
    @Import(name="cookieExpirationPeriod")
      private final @Nullable Output<Integer> cookieExpirationPeriod;

    public Output<Integer> getCookieExpirationPeriod() {
        return this.cookieExpirationPeriod == null ? Output.empty() : this.cookieExpirationPeriod;
    }

    /**
     * The load balancer port to which the policy
     * should be applied. This must be an active listener on the load
     * balancer.
     * 
     */
    @Import(name="lbPort", required=true)
      private final Output<Integer> lbPort;

    public Output<Integer> getLbPort() {
        return this.lbPort;
    }

    /**
     * The load balancer to which the policy
     * should be attached.
     * 
     */
    @Import(name="loadBalancer", required=true)
      private final Output<String> loadBalancer;

    public Output<String> getLoadBalancer() {
        return this.loadBalancer;
    }

    /**
     * The name of the stickiness policy.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    public LoadBalancerCookieStickinessPolicyArgs(
        @Nullable Output<Integer> cookieExpirationPeriod,
        Output<Integer> lbPort,
        Output<String> loadBalancer,
        @Nullable Output<String> name) {
        this.cookieExpirationPeriod = cookieExpirationPeriod;
        this.lbPort = Objects.requireNonNull(lbPort, "expected parameter 'lbPort' to be non-null");
        this.loadBalancer = Objects.requireNonNull(loadBalancer, "expected parameter 'loadBalancer' to be non-null");
        this.name = name;
    }

    private LoadBalancerCookieStickinessPolicyArgs() {
        this.cookieExpirationPeriod = Output.empty();
        this.lbPort = Output.empty();
        this.loadBalancer = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerCookieStickinessPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> cookieExpirationPeriod;
        private Output<Integer> lbPort;
        private Output<String> loadBalancer;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerCookieStickinessPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cookieExpirationPeriod = defaults.cookieExpirationPeriod;
    	      this.lbPort = defaults.lbPort;
    	      this.loadBalancer = defaults.loadBalancer;
    	      this.name = defaults.name;
        }

        public Builder cookieExpirationPeriod(@Nullable Output<Integer> cookieExpirationPeriod) {
            this.cookieExpirationPeriod = cookieExpirationPeriod;
            return this;
        }

        public Builder cookieExpirationPeriod(@Nullable Integer cookieExpirationPeriod) {
            this.cookieExpirationPeriod = Output.ofNullable(cookieExpirationPeriod);
            return this;
        }

        public Builder lbPort(Output<Integer> lbPort) {
            this.lbPort = Objects.requireNonNull(lbPort);
            return this;
        }

        public Builder lbPort(Integer lbPort) {
            this.lbPort = Output.of(Objects.requireNonNull(lbPort));
            return this;
        }

        public Builder loadBalancer(Output<String> loadBalancer) {
            this.loadBalancer = Objects.requireNonNull(loadBalancer);
            return this;
        }

        public Builder loadBalancer(String loadBalancer) {
            this.loadBalancer = Output.of(Objects.requireNonNull(loadBalancer));
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public LoadBalancerCookieStickinessPolicyArgs build() {
            return new LoadBalancerCookieStickinessPolicyArgs(cookieExpirationPeriod, lbPort, loadBalancer, name);
        }
    }
}
