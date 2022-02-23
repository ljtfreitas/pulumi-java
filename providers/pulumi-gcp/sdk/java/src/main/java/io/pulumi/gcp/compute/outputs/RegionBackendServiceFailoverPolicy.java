// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RegionBackendServiceFailoverPolicy {
    /**
     * On failover or failback, this field indicates whether connection drain
     * will be honored. Setting this to true has the following effect: connections
     * to the old active pool are not drained. Connections to the new active pool
     * use the timeout of 10 min (currently fixed). Setting to false has the
     * following effect: both old and new connections will have a drain timeout
     * of 10 min.
     * This can be set to true only if the protocol is TCP.
     * The default is false.
     * 
     */
    private final @Nullable Boolean disableConnectionDrainOnFailover;
    /**
     * This option is used only when no healthy VMs are detected in the primary
     * and backup instance groups. When set to true, traffic is dropped. When
     * set to false, new connections are sent across all VMs in the primary group.
     * The default is false.
     * 
     */
    private final @Nullable Boolean dropTrafficIfUnhealthy;
    /**
     * The value of the field must be in [0, 1]. If the ratio of the healthy
     * VMs in the primary backend is at or below this number, traffic arriving
     * at the load-balanced IP will be directed to the failover backend.
     * In case where 'failoverRatio' is not set or all the VMs in the backup
     * backend are unhealthy, the traffic will be directed back to the primary
     * backend in the "force" mode, where traffic will be spread to the healthy
     * VMs with the best effort, or to all VMs when no VM is healthy.
     * This field is only used with l4 load balancing.
     * 
     */
    private final @Nullable Double failoverRatio;

    @OutputCustomType.Constructor({"disableConnectionDrainOnFailover","dropTrafficIfUnhealthy","failoverRatio"})
    private RegionBackendServiceFailoverPolicy(
        @Nullable Boolean disableConnectionDrainOnFailover,
        @Nullable Boolean dropTrafficIfUnhealthy,
        @Nullable Double failoverRatio) {
        this.disableConnectionDrainOnFailover = disableConnectionDrainOnFailover;
        this.dropTrafficIfUnhealthy = dropTrafficIfUnhealthy;
        this.failoverRatio = failoverRatio;
    }

    /**
     * On failover or failback, this field indicates whether connection drain
     * will be honored. Setting this to true has the following effect: connections
     * to the old active pool are not drained. Connections to the new active pool
     * use the timeout of 10 min (currently fixed). Setting to false has the
     * following effect: both old and new connections will have a drain timeout
     * of 10 min.
     * This can be set to true only if the protocol is TCP.
     * The default is false.
     * 
     */
    public Optional<Boolean> getDisableConnectionDrainOnFailover() {
        return Optional.ofNullable(this.disableConnectionDrainOnFailover);
    }
    /**
     * This option is used only when no healthy VMs are detected in the primary
     * and backup instance groups. When set to true, traffic is dropped. When
     * set to false, new connections are sent across all VMs in the primary group.
     * The default is false.
     * 
     */
    public Optional<Boolean> getDropTrafficIfUnhealthy() {
        return Optional.ofNullable(this.dropTrafficIfUnhealthy);
    }
    /**
     * The value of the field must be in [0, 1]. If the ratio of the healthy
     * VMs in the primary backend is at or below this number, traffic arriving
     * at the load-balanced IP will be directed to the failover backend.
     * In case where 'failoverRatio' is not set or all the VMs in the backup
     * backend are unhealthy, the traffic will be directed back to the primary
     * backend in the "force" mode, where traffic will be spread to the healthy
     * VMs with the best effort, or to all VMs when no VM is healthy.
     * This field is only used with l4 load balancing.
     * 
     */
    public Optional<Double> getFailoverRatio() {
        return Optional.ofNullable(this.failoverRatio);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionBackendServiceFailoverPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean disableConnectionDrainOnFailover;
        private @Nullable Boolean dropTrafficIfUnhealthy;
        private @Nullable Double failoverRatio;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionBackendServiceFailoverPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableConnectionDrainOnFailover = defaults.disableConnectionDrainOnFailover;
    	      this.dropTrafficIfUnhealthy = defaults.dropTrafficIfUnhealthy;
    	      this.failoverRatio = defaults.failoverRatio;
        }

        public Builder setDisableConnectionDrainOnFailover(@Nullable Boolean disableConnectionDrainOnFailover) {
            this.disableConnectionDrainOnFailover = disableConnectionDrainOnFailover;
            return this;
        }

        public Builder setDropTrafficIfUnhealthy(@Nullable Boolean dropTrafficIfUnhealthy) {
            this.dropTrafficIfUnhealthy = dropTrafficIfUnhealthy;
            return this;
        }

        public Builder setFailoverRatio(@Nullable Double failoverRatio) {
            this.failoverRatio = failoverRatio;
            return this;
        }
        public RegionBackendServiceFailoverPolicy build() {
            return new RegionBackendServiceFailoverPolicy(disableConnectionDrainOnFailover, dropTrafficIfUnhealthy, failoverRatio);
        }
    }
}
