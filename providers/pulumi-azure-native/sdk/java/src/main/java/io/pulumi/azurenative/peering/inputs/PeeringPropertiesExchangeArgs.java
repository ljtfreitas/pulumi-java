// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.peering.inputs;

import io.pulumi.azurenative.peering.inputs.ExchangeConnectionArgs;
import io.pulumi.azurenative.peering.inputs.SubResourceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PeeringPropertiesExchangeArgs extends io.pulumi.resources.ResourceArgs {

    public static final PeeringPropertiesExchangeArgs Empty = new PeeringPropertiesExchangeArgs();

    @InputImport(name="connections")
    private final @Nullable Input<List<ExchangeConnectionArgs>> connections;

    public Input<List<ExchangeConnectionArgs>> getConnections() {
        return this.connections == null ? Input.empty() : this.connections;
    }

    @InputImport(name="peerAsn")
    private final @Nullable Input<SubResourceArgs> peerAsn;

    public Input<SubResourceArgs> getPeerAsn() {
        return this.peerAsn == null ? Input.empty() : this.peerAsn;
    }

    public PeeringPropertiesExchangeArgs(
        @Nullable Input<List<ExchangeConnectionArgs>> connections,
        @Nullable Input<SubResourceArgs> peerAsn) {
        this.connections = connections;
        this.peerAsn = peerAsn;
    }

    private PeeringPropertiesExchangeArgs() {
        this.connections = Input.empty();
        this.peerAsn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PeeringPropertiesExchangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ExchangeConnectionArgs>> connections;
        private @Nullable Input<SubResourceArgs> peerAsn;

        public Builder() {
    	      // Empty
        }

        public Builder(PeeringPropertiesExchangeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connections = defaults.connections;
    	      this.peerAsn = defaults.peerAsn;
        }

        public Builder setConnections(@Nullable Input<List<ExchangeConnectionArgs>> connections) {
            this.connections = connections;
            return this;
        }

        public Builder setConnections(@Nullable List<ExchangeConnectionArgs> connections) {
            this.connections = Input.ofNullable(connections);
            return this;
        }

        public Builder setPeerAsn(@Nullable Input<SubResourceArgs> peerAsn) {
            this.peerAsn = peerAsn;
            return this;
        }

        public Builder setPeerAsn(@Nullable SubResourceArgs peerAsn) {
            this.peerAsn = Input.ofNullable(peerAsn);
            return this;
        }

        public PeeringPropertiesExchangeArgs build() {
            return new PeeringPropertiesExchangeArgs(connections, peerAsn);
        }
    }
}