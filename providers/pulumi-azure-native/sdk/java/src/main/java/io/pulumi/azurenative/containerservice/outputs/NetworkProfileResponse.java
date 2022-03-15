// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworkProfileResponse {
    /**
     * CIDR of the Vnet to peer.
     * 
     */
    private final @Nullable String peerVnetId;
    /**
     * CIDR for the OpenShift Vnet.
     * 
     */
    private final @Nullable String vnetCidr;
    /**
     * ID of the Vnet created for OSA cluster.
     * 
     */
    private final @Nullable String vnetId;

    @CustomType.Constructor
    private NetworkProfileResponse(
        @CustomType.Parameter("peerVnetId") @Nullable String peerVnetId,
        @CustomType.Parameter("vnetCidr") @Nullable String vnetCidr,
        @CustomType.Parameter("vnetId") @Nullable String vnetId) {
        this.peerVnetId = peerVnetId;
        this.vnetCidr = vnetCidr;
        this.vnetId = vnetId;
    }

    /**
     * CIDR of the Vnet to peer.
     * 
    */
    public Optional<String> getPeerVnetId() {
        return Optional.ofNullable(this.peerVnetId);
    }
    /**
     * CIDR for the OpenShift Vnet.
     * 
    */
    public Optional<String> getVnetCidr() {
        return Optional.ofNullable(this.vnetCidr);
    }
    /**
     * ID of the Vnet created for OSA cluster.
     * 
    */
    public Optional<String> getVnetId() {
        return Optional.ofNullable(this.vnetId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String peerVnetId;
        private @Nullable String vnetCidr;
        private @Nullable String vnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.peerVnetId = defaults.peerVnetId;
    	      this.vnetCidr = defaults.vnetCidr;
    	      this.vnetId = defaults.vnetId;
        }

        public Builder peerVnetId(@Nullable String peerVnetId) {
            this.peerVnetId = peerVnetId;
            return this;
        }

        public Builder vnetCidr(@Nullable String vnetCidr) {
            this.vnetCidr = vnetCidr;
            return this;
        }

        public Builder vnetId(@Nullable String vnetId) {
            this.vnetId = vnetId;
            return this;
        }
        public NetworkProfileResponse build() {
            return new NetworkProfileResponse(peerVnetId, vnetCidr, vnetId);
        }
    }
}
