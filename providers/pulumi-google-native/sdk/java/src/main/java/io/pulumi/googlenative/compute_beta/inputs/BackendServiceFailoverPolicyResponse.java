// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.util.Objects;


/**
 * For load balancers that have configurable failover: [Internal TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal/failover-overview) and [external TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-failover-overview). On failover or failback, this field indicates whether connection draining will be honored. Google Cloud has a fixed connection draining timeout of 10 minutes. A setting of true terminates existing TCP connections to the active pool during failover and failback, immediately draining traffic. A setting of false allows existing TCP connections to persist, even on VMs no longer in the active pool, for up to the duration of the connection draining timeout (10 minutes).
 * 
 */
public final class BackendServiceFailoverPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final BackendServiceFailoverPolicyResponse Empty = new BackendServiceFailoverPolicyResponse();

    /**
     * This can be set to true only if the protocol is TCP. The default is false.
     * 
     */
    @Import(name="disableConnectionDrainOnFailover", required=true)
      private final Boolean disableConnectionDrainOnFailover;

    public Boolean getDisableConnectionDrainOnFailover() {
        return this.disableConnectionDrainOnFailover;
    }

    /**
     * If set to true, connections to the load balancer are dropped when all primary and all backup backend VMs are unhealthy.If set to false, connections are distributed among all primary VMs when all primary and all backup backend VMs are unhealthy. For load balancers that have configurable failover: [Internal TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal/failover-overview) and [external TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-failover-overview). The default is false.
     * 
     */
    @Import(name="dropTrafficIfUnhealthy", required=true)
      private final Boolean dropTrafficIfUnhealthy;

    public Boolean getDropTrafficIfUnhealthy() {
        return this.dropTrafficIfUnhealthy;
    }

    /**
     * The value of the field must be in the range [0, 1]. If the value is 0, the load balancer performs a failover when the number of healthy primary VMs equals zero. For all other values, the load balancer performs a failover when the total number of healthy primary VMs is less than this ratio. For load balancers that have configurable failover: [Internal TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal/failover-overview) and [external TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-failover-overview).
     * 
     */
    @Import(name="failoverRatio", required=true)
      private final Double failoverRatio;

    public Double getFailoverRatio() {
        return this.failoverRatio;
    }

    public BackendServiceFailoverPolicyResponse(
        Boolean disableConnectionDrainOnFailover,
        Boolean dropTrafficIfUnhealthy,
        Double failoverRatio) {
        this.disableConnectionDrainOnFailover = Objects.requireNonNull(disableConnectionDrainOnFailover, "expected parameter 'disableConnectionDrainOnFailover' to be non-null");
        this.dropTrafficIfUnhealthy = Objects.requireNonNull(dropTrafficIfUnhealthy, "expected parameter 'dropTrafficIfUnhealthy' to be non-null");
        this.failoverRatio = Objects.requireNonNull(failoverRatio, "expected parameter 'failoverRatio' to be non-null");
    }

    private BackendServiceFailoverPolicyResponse() {
        this.disableConnectionDrainOnFailover = null;
        this.dropTrafficIfUnhealthy = null;
        this.failoverRatio = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendServiceFailoverPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean disableConnectionDrainOnFailover;
        private Boolean dropTrafficIfUnhealthy;
        private Double failoverRatio;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendServiceFailoverPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableConnectionDrainOnFailover = defaults.disableConnectionDrainOnFailover;
    	      this.dropTrafficIfUnhealthy = defaults.dropTrafficIfUnhealthy;
    	      this.failoverRatio = defaults.failoverRatio;
        }

        public Builder disableConnectionDrainOnFailover(Boolean disableConnectionDrainOnFailover) {
            this.disableConnectionDrainOnFailover = Objects.requireNonNull(disableConnectionDrainOnFailover);
            return this;
        }

        public Builder dropTrafficIfUnhealthy(Boolean dropTrafficIfUnhealthy) {
            this.dropTrafficIfUnhealthy = Objects.requireNonNull(dropTrafficIfUnhealthy);
            return this;
        }

        public Builder failoverRatio(Double failoverRatio) {
            this.failoverRatio = Objects.requireNonNull(failoverRatio);
            return this;
        }
        public BackendServiceFailoverPolicyResponse build() {
            return new BackendServiceFailoverPolicyResponse(disableConnectionDrainOnFailover, dropTrafficIfUnhealthy, failoverRatio);
        }
    }
}
