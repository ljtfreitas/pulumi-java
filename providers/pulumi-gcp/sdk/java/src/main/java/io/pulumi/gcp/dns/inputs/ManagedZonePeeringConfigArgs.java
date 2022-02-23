// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dns.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.dns.inputs.ManagedZonePeeringConfigTargetNetworkArgs;
import java.util.Objects;


public final class ManagedZonePeeringConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedZonePeeringConfigArgs Empty = new ManagedZonePeeringConfigArgs();

    /**
     * The network with which to peer.
     * Structure is documented below.
     * 
     */
    @InputImport(name="targetNetwork", required=true)
        private final Input<ManagedZonePeeringConfigTargetNetworkArgs> targetNetwork;

    public Input<ManagedZonePeeringConfigTargetNetworkArgs> getTargetNetwork() {
        return this.targetNetwork;
    }

    public ManagedZonePeeringConfigArgs(Input<ManagedZonePeeringConfigTargetNetworkArgs> targetNetwork) {
        this.targetNetwork = Objects.requireNonNull(targetNetwork, "expected parameter 'targetNetwork' to be non-null");
    }

    private ManagedZonePeeringConfigArgs() {
        this.targetNetwork = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZonePeeringConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<ManagedZonePeeringConfigTargetNetworkArgs> targetNetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZonePeeringConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetNetwork = defaults.targetNetwork;
        }

        public Builder setTargetNetwork(Input<ManagedZonePeeringConfigTargetNetworkArgs> targetNetwork) {
            this.targetNetwork = Objects.requireNonNull(targetNetwork);
            return this;
        }

        public Builder setTargetNetwork(ManagedZonePeeringConfigTargetNetworkArgs targetNetwork) {
            this.targetNetwork = Input.of(Objects.requireNonNull(targetNetwork));
            return this;
        }
        public ManagedZonePeeringConfigArgs build() {
            return new ManagedZonePeeringConfigArgs(targetNetwork);
        }
    }
}
