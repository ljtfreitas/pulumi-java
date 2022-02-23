// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1beta2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dns_v1beta2.inputs.ManagedZonePeeringConfigTargetNetworkArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedZonePeeringConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedZonePeeringConfigArgs Empty = new ManagedZonePeeringConfigArgs();

    @InputImport(name="kind")
      private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * The network with which to peer.
     * 
     */
    @InputImport(name="targetNetwork")
      private final @Nullable Input<ManagedZonePeeringConfigTargetNetworkArgs> targetNetwork;

    public Input<ManagedZonePeeringConfigTargetNetworkArgs> getTargetNetwork() {
        return this.targetNetwork == null ? Input.empty() : this.targetNetwork;
    }

    public ManagedZonePeeringConfigArgs(
        @Nullable Input<String> kind,
        @Nullable Input<ManagedZonePeeringConfigTargetNetworkArgs> targetNetwork) {
        this.kind = kind;
        this.targetNetwork = targetNetwork;
    }

    private ManagedZonePeeringConfigArgs() {
        this.kind = Input.empty();
        this.targetNetwork = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZonePeeringConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> kind;
        private @Nullable Input<ManagedZonePeeringConfigTargetNetworkArgs> targetNetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZonePeeringConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.targetNetwork = defaults.targetNetwork;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setTargetNetwork(@Nullable Input<ManagedZonePeeringConfigTargetNetworkArgs> targetNetwork) {
            this.targetNetwork = targetNetwork;
            return this;
        }

        public Builder setTargetNetwork(@Nullable ManagedZonePeeringConfigTargetNetworkArgs targetNetwork) {
            this.targetNetwork = Input.ofNullable(targetNetwork);
            return this;
        }
        public ManagedZonePeeringConfigArgs build() {
            return new ManagedZonePeeringConfigArgs(kind, targetNetwork);
        }
    }
}
