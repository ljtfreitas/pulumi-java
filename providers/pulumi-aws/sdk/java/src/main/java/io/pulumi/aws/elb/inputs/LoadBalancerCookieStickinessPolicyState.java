// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elb.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LoadBalancerCookieStickinessPolicyState extends io.pulumi.resources.ResourceArgs {

    public static final LoadBalancerCookieStickinessPolicyState Empty = new LoadBalancerCookieStickinessPolicyState();

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
    @Import(name="lbPort")
      private final @Nullable Output<Integer> lbPort;

    public Output<Integer> getLbPort() {
        return this.lbPort == null ? Output.empty() : this.lbPort;
    }

    /**
     * The load balancer to which the policy
     * should be attached.
     * 
     */
    @Import(name="loadBalancer")
      private final @Nullable Output<String> loadBalancer;

    public Output<String> getLoadBalancer() {
        return this.loadBalancer == null ? Output.empty() : this.loadBalancer;
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

    public LoadBalancerCookieStickinessPolicyState(
        @Nullable Output<Integer> cookieExpirationPeriod,
        @Nullable Output<Integer> lbPort,
        @Nullable Output<String> loadBalancer,
        @Nullable Output<String> name) {
        this.cookieExpirationPeriod = cookieExpirationPeriod;
        this.lbPort = lbPort;
        this.loadBalancer = loadBalancer;
        this.name = name;
    }

    private LoadBalancerCookieStickinessPolicyState() {
        this.cookieExpirationPeriod = Output.empty();
        this.lbPort = Output.empty();
        this.loadBalancer = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerCookieStickinessPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> cookieExpirationPeriod;
        private @Nullable Output<Integer> lbPort;
        private @Nullable Output<String> loadBalancer;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerCookieStickinessPolicyState defaults) {
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

        public Builder lbPort(@Nullable Output<Integer> lbPort) {
            this.lbPort = lbPort;
            return this;
        }

        public Builder lbPort(@Nullable Integer lbPort) {
            this.lbPort = Output.ofNullable(lbPort);
            return this;
        }

        public Builder loadBalancer(@Nullable Output<String> loadBalancer) {
            this.loadBalancer = loadBalancer;
            return this;
        }

        public Builder loadBalancer(@Nullable String loadBalancer) {
            this.loadBalancer = Output.ofNullable(loadBalancer);
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
        public LoadBalancerCookieStickinessPolicyState build() {
            return new LoadBalancerCookieStickinessPolicyState(cookieExpirationPeriod, lbPort, loadBalancer, name);
        }
    }
}
