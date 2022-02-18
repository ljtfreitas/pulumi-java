// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Route resource.
 * 
 */
public final class RouteResponse extends io.pulumi.resources.InvokeArgs {

    public static final RouteResponse Empty = new RouteResponse();

    /**
     * The destination CIDR to which the route applies.
     * 
     */
    @InputImport(name="addressPrefix")
    private final @Nullable String addressPrefix;

    public Optional<String> getAddressPrefix() {
        return this.addressPrefix == null ? Optional.empty() : Optional.ofNullable(this.addressPrefix);
    }

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @InputImport(name="etag", required=true)
    private final String etag;

    public String getEtag() {
        return this.etag;
    }

    /**
     * A value indicating whether this route overrides overlapping BGP routes regardless of LPM.
     * 
     */
    @InputImport(name="hasBgpOverride")
    private final @Nullable Boolean hasBgpOverride;

    public Optional<Boolean> getHasBgpOverride() {
        return this.hasBgpOverride == null ? Optional.empty() : Optional.ofNullable(this.hasBgpOverride);
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
    private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The IP address packets should be forwarded to. Next hop values are only allowed in routes where the next hop type is VirtualAppliance.
     * 
     */
    @InputImport(name="nextHopIpAddress")
    private final @Nullable String nextHopIpAddress;

    public Optional<String> getNextHopIpAddress() {
        return this.nextHopIpAddress == null ? Optional.empty() : Optional.ofNullable(this.nextHopIpAddress);
    }

    /**
     * The type of Azure hop the packet should be sent to.
     * 
     */
    @InputImport(name="nextHopType", required=true)
    private final String nextHopType;

    public String getNextHopType() {
        return this.nextHopType;
    }

    /**
     * The provisioning state of the route resource.
     * 
     */
    @InputImport(name="provisioningState", required=true)
    private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * The type of the resource.
     * 
     */
    @InputImport(name="type")
    private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    public RouteResponse(
        @Nullable String addressPrefix,
        String etag,
        @Nullable Boolean hasBgpOverride,
        @Nullable String id,
        @Nullable String name,
        @Nullable String nextHopIpAddress,
        String nextHopType,
        String provisioningState,
        @Nullable String type) {
        this.addressPrefix = addressPrefix;
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.hasBgpOverride = hasBgpOverride;
        this.id = id;
        this.name = name;
        this.nextHopIpAddress = nextHopIpAddress;
        this.nextHopType = Objects.requireNonNull(nextHopType, "expected parameter 'nextHopType' to be non-null");
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.type = type;
    }

    private RouteResponse() {
        this.addressPrefix = null;
        this.etag = null;
        this.hasBgpOverride = null;
        this.id = null;
        this.name = null;
        this.nextHopIpAddress = null;
        this.nextHopType = null;
        this.provisioningState = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String addressPrefix;
        private String etag;
        private @Nullable Boolean hasBgpOverride;
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable String nextHopIpAddress;
        private String nextHopType;
        private String provisioningState;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressPrefix = defaults.addressPrefix;
    	      this.etag = defaults.etag;
    	      this.hasBgpOverride = defaults.hasBgpOverride;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.nextHopIpAddress = defaults.nextHopIpAddress;
    	      this.nextHopType = defaults.nextHopType;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder setAddressPrefix(@Nullable String addressPrefix) {
            this.addressPrefix = addressPrefix;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setHasBgpOverride(@Nullable Boolean hasBgpOverride) {
            this.hasBgpOverride = hasBgpOverride;
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

        public Builder setNextHopIpAddress(@Nullable String nextHopIpAddress) {
            this.nextHopIpAddress = nextHopIpAddress;
            return this;
        }

        public Builder setNextHopType(String nextHopType) {
            this.nextHopType = Objects.requireNonNull(nextHopType);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public RouteResponse build() {
            return new RouteResponse(addressPrefix, etag, hasBgpOverride, id, name, nextHopIpAddress, nextHopType, provisioningState, type);
        }
    }
}
