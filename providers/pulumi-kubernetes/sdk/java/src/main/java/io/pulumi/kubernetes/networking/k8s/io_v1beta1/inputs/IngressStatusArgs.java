// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.networking.k8s.io_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.kubernetes.core_v1.inputs.LoadBalancerStatusArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * IngressStatus describe the current state of the Ingress.
 * 
 */
public final class IngressStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final IngressStatusArgs Empty = new IngressStatusArgs();

    /**
     * LoadBalancer contains the current status of the load-balancer.
     * 
     */
    @Import(name="loadBalancer")
      private final @Nullable Output<LoadBalancerStatusArgs> loadBalancer;

    public Output<LoadBalancerStatusArgs> getLoadBalancer() {
        return this.loadBalancer == null ? Output.empty() : this.loadBalancer;
    }

    public IngressStatusArgs(@Nullable Output<LoadBalancerStatusArgs> loadBalancer) {
        this.loadBalancer = loadBalancer;
    }

    private IngressStatusArgs() {
        this.loadBalancer = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IngressStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<LoadBalancerStatusArgs> loadBalancer;

        public Builder() {
    	      // Empty
        }

        public Builder(IngressStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.loadBalancer = defaults.loadBalancer;
        }

        public Builder loadBalancer(@Nullable Output<LoadBalancerStatusArgs> loadBalancer) {
            this.loadBalancer = loadBalancer;
            return this;
        }

        public Builder loadBalancer(@Nullable LoadBalancerStatusArgs loadBalancer) {
            this.loadBalancer = Output.ofNullable(loadBalancer);
            return this;
        }
        public IngressStatusArgs build() {
            return new IngressStatusArgs(loadBalancer);
        }
    }
}
