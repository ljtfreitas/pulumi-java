// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1beta2.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dns_v1beta2.inputs.ManagedZonePeeringConfigTargetNetworkResponse;
import java.lang.String;
import java.util.Objects;


public final class ManagedZonePeeringConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagedZonePeeringConfigResponse Empty = new ManagedZonePeeringConfigResponse();

    @InputImport(name="kind", required=true)
      private final String kind;

    public String getKind() {
        return this.kind;
    }

    /**
     * The network with which to peer.
     * 
     */
    @InputImport(name="targetNetwork", required=true)
      private final ManagedZonePeeringConfigTargetNetworkResponse targetNetwork;

    public ManagedZonePeeringConfigTargetNetworkResponse getTargetNetwork() {
        return this.targetNetwork;
    }

    public ManagedZonePeeringConfigResponse(
        String kind,
        ManagedZonePeeringConfigTargetNetworkResponse targetNetwork) {
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.targetNetwork = Objects.requireNonNull(targetNetwork, "expected parameter 'targetNetwork' to be non-null");
    }

    private ManagedZonePeeringConfigResponse() {
        this.kind = null;
        this.targetNetwork = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZonePeeringConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kind;
        private ManagedZonePeeringConfigTargetNetworkResponse targetNetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZonePeeringConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.targetNetwork = defaults.targetNetwork;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setTargetNetwork(ManagedZonePeeringConfigTargetNetworkResponse targetNetwork) {
            this.targetNetwork = Objects.requireNonNull(targetNetwork);
            return this;
        }
        public ManagedZonePeeringConfigResponse build() {
            return new ManagedZonePeeringConfigResponse(kind, targetNetwork);
        }
    }
}
