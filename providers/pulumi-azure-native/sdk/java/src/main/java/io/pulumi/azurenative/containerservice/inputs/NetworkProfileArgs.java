// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents the OpenShift networking configuration
 * 
 */
public final class NetworkProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkProfileArgs Empty = new NetworkProfileArgs();

    /**
     * CIDR of the Vnet to peer.
     * 
     */
    @InputImport(name="peerVnetId")
        private final @Nullable Input<String> peerVnetId;

    public Input<String> getPeerVnetId() {
        return this.peerVnetId == null ? Input.empty() : this.peerVnetId;
    }

    /**
     * CIDR for the OpenShift Vnet.
     * 
     */
    @InputImport(name="vnetCidr")
        private final @Nullable Input<String> vnetCidr;

    public Input<String> getVnetCidr() {
        return this.vnetCidr == null ? Input.empty() : this.vnetCidr;
    }

    /**
     * ID of the Vnet created for OSA cluster.
     * 
     */
    @InputImport(name="vnetId")
        private final @Nullable Input<String> vnetId;

    public Input<String> getVnetId() {
        return this.vnetId == null ? Input.empty() : this.vnetId;
    }

    public NetworkProfileArgs(
        @Nullable Input<String> peerVnetId,
        @Nullable Input<String> vnetCidr,
        @Nullable Input<String> vnetId) {
        this.peerVnetId = peerVnetId;
        this.vnetCidr = vnetCidr == null ? Input.ofNullable("10.0.0.0/8") : vnetCidr;
        this.vnetId = vnetId;
    }

    private NetworkProfileArgs() {
        this.peerVnetId = Input.empty();
        this.vnetCidr = Input.empty();
        this.vnetId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> peerVnetId;
        private @Nullable Input<String> vnetCidr;
        private @Nullable Input<String> vnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.peerVnetId = defaults.peerVnetId;
    	      this.vnetCidr = defaults.vnetCidr;
    	      this.vnetId = defaults.vnetId;
        }

        public Builder setPeerVnetId(@Nullable Input<String> peerVnetId) {
            this.peerVnetId = peerVnetId;
            return this;
        }

        public Builder setPeerVnetId(@Nullable String peerVnetId) {
            this.peerVnetId = Input.ofNullable(peerVnetId);
            return this;
        }

        public Builder setVnetCidr(@Nullable Input<String> vnetCidr) {
            this.vnetCidr = vnetCidr;
            return this;
        }

        public Builder setVnetCidr(@Nullable String vnetCidr) {
            this.vnetCidr = Input.ofNullable(vnetCidr);
            return this;
        }

        public Builder setVnetId(@Nullable Input<String> vnetId) {
            this.vnetId = vnetId;
            return this;
        }

        public Builder setVnetId(@Nullable String vnetId) {
            this.vnetId = Input.ofNullable(vnetId);
            return this;
        }
        public NetworkProfileArgs build() {
            return new NetworkProfileArgs(peerVnetId, vnetCidr, vnetId);
        }
    }
}
