// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetLoadBalancerArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetLoadBalancerArgs Empty = new GetLoadBalancerArgs();

    /**
     * The name of your load balancer.
     * 
     */
    @Import(name="loadBalancerName", required=true)
      private final String loadBalancerName;

    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    public GetLoadBalancerArgs(String loadBalancerName) {
        this.loadBalancerName = Objects.requireNonNull(loadBalancerName, "expected parameter 'loadBalancerName' to be non-null");
    }

    private GetLoadBalancerArgs() {
        this.loadBalancerName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoadBalancerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String loadBalancerName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLoadBalancerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.loadBalancerName = defaults.loadBalancerName;
        }

        public Builder loadBalancerName(String loadBalancerName) {
            this.loadBalancerName = Objects.requireNonNull(loadBalancerName);
            return this;
        }
        public GetLoadBalancerArgs build() {
            return new GetLoadBalancerArgs(loadBalancerName);
        }
    }
}
