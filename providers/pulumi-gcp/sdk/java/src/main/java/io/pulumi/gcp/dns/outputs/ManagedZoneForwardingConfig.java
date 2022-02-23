// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dns.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.dns.outputs.ManagedZoneForwardingConfigTargetNameServer;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ManagedZoneForwardingConfig {
    /**
     * List of target name servers to forward to. Cloud DNS will
     * select the best available name server if more than
     * one target is given.
     * Structure is documented below.
     * 
     */
    private final List<ManagedZoneForwardingConfigTargetNameServer> targetNameServers;

    @OutputCustomType.Constructor({"targetNameServers"})
    private ManagedZoneForwardingConfig(List<ManagedZoneForwardingConfigTargetNameServer> targetNameServers) {
        this.targetNameServers = Objects.requireNonNull(targetNameServers);
    }

    /**
     * List of target name servers to forward to. Cloud DNS will
     * select the best available name server if more than
     * one target is given.
     * Structure is documented below.
     * 
     */
    public List<ManagedZoneForwardingConfigTargetNameServer> getTargetNameServers() {
        return this.targetNameServers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZoneForwardingConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ManagedZoneForwardingConfigTargetNameServer> targetNameServers;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZoneForwardingConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetNameServers = defaults.targetNameServers;
        }

        public Builder setTargetNameServers(List<ManagedZoneForwardingConfigTargetNameServer> targetNameServers) {
            this.targetNameServers = Objects.requireNonNull(targetNameServers);
            return this;
        }
        public ManagedZoneForwardingConfig build() {
            return new ManagedZoneForwardingConfig(targetNameServers);
        }
    }
}
