// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetVirtualRouterPeeringResult {
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * Name of the virtual router peering that is unique within a virtual router.
     * 
     */
    private final @Nullable String name;
    /**
     * Peer ASN.
     * 
     */
    private final @Nullable Double peerAsn;
    /**
     * Peer IP.
     * 
     */
    private final @Nullable String peerIp;
    /**
     * The provisioning state of the resource.
     * 
     */
    private final String provisioningState;
    /**
     * Peering type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"etag","id","name","peerAsn","peerIp","provisioningState","type"})
    private GetVirtualRouterPeeringResult(
        String etag,
        @Nullable String id,
        @Nullable String name,
        @Nullable Double peerAsn,
        @Nullable String peerIp,
        String provisioningState,
        String type) {
        this.etag = Objects.requireNonNull(etag);
        this.id = id;
        this.name = name;
        this.peerAsn = peerAsn;
        this.peerIp = peerIp;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Resource ID.
     * 
     */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Name of the virtual router peering that is unique within a virtual router.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Peer ASN.
     * 
     */
    public Optional<Double> getPeerAsn() {
        return Optional.ofNullable(this.peerAsn);
    }
    /**
     * Peer IP.
     * 
     */
    public Optional<String> getPeerIp() {
        return Optional.ofNullable(this.peerIp);
    }
    /**
     * The provisioning state of the resource.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Peering type.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualRouterPeeringResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable Double peerAsn;
        private @Nullable String peerIp;
        private String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualRouterPeeringResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.peerAsn = defaults.peerAsn;
    	      this.peerIp = defaults.peerIp;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setPeerAsn(@Nullable Double peerAsn) {
            this.peerAsn = peerAsn;
            return this;
        }

        public Builder setPeerIp(@Nullable String peerIp) {
            this.peerIp = peerIp;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetVirtualRouterPeeringResult build() {
            return new GetVirtualRouterPeeringResult(etag, id, name, peerAsn, peerIp, provisioningState, type);
        }
    }
}
