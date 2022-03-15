// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration options for the HTTP (L7) load balancing controller addon, which makes it easy to set up HTTP load balancers for services in a cluster.
 * 
 */
public final class HttpLoadBalancingArgs extends io.pulumi.resources.ResourceArgs {

    public static final HttpLoadBalancingArgs Empty = new HttpLoadBalancingArgs();

    /**
     * Whether the HTTP Load Balancing controller is enabled in the cluster. When enabled, it runs a small pod in the cluster that manages the load balancers.
     * 
     */
    @Import(name="disabled")
      private final @Nullable Output<Boolean> disabled;

    public Output<Boolean> getDisabled() {
        return this.disabled == null ? Output.empty() : this.disabled;
    }

    public HttpLoadBalancingArgs(@Nullable Output<Boolean> disabled) {
        this.disabled = disabled;
    }

    private HttpLoadBalancingArgs() {
        this.disabled = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpLoadBalancingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> disabled;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpLoadBalancingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabled = defaults.disabled;
        }

        public Builder disabled(@Nullable Output<Boolean> disabled) {
            this.disabled = disabled;
            return this;
        }

        public Builder disabled(@Nullable Boolean disabled) {
            this.disabled = Output.ofNullable(disabled);
            return this;
        }
        public HttpLoadBalancingArgs build() {
            return new HttpLoadBalancingArgs(disabled);
        }
    }
}
