// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RouterPeerBfd {
    /**
     * The minimum interval, in milliseconds, between BFD control packets
     * received from the peer router. The actual value is negotiated
     * between the two routers and is equal to the greater of this value
     * and the transmit interval of the other router. If set, this value
     * must be between 1000 and 30000.
     * 
     */
    private final @Nullable Integer minReceiveInterval;
    /**
     * The minimum interval, in milliseconds, between BFD control packets
     * transmitted to the peer router. The actual value is negotiated
     * between the two routers and is equal to the greater of this value
     * and the corresponding receive interval of the other router. If set,
     * this value must be between 1000 and 30000.
     * 
     */
    private final @Nullable Integer minTransmitInterval;
    /**
     * The number of consecutive BFD packets that must be missed before
     * BFD declares that a peer is unavailable. If set, the value must
     * be a value between 5 and 16.
     * 
     */
    private final @Nullable Integer multiplier;
    /**
     * The BFD session initialization mode for this BGP peer.
     * If set to `ACTIVE`, the Cloud Router will initiate the BFD session
     * for this BGP peer. If set to `PASSIVE`, the Cloud Router will wait
     * for the peer router to initiate the BFD session for this BGP peer.
     * If set to `DISABLED`, BFD is disabled for this BGP peer.
     * Possible values are `ACTIVE`, `DISABLED`, and `PASSIVE`.
     * 
     */
    private final String sessionInitializationMode;

    @CustomType.Constructor
    private RouterPeerBfd(
        @CustomType.Parameter("minReceiveInterval") @Nullable Integer minReceiveInterval,
        @CustomType.Parameter("minTransmitInterval") @Nullable Integer minTransmitInterval,
        @CustomType.Parameter("multiplier") @Nullable Integer multiplier,
        @CustomType.Parameter("sessionInitializationMode") String sessionInitializationMode) {
        this.minReceiveInterval = minReceiveInterval;
        this.minTransmitInterval = minTransmitInterval;
        this.multiplier = multiplier;
        this.sessionInitializationMode = sessionInitializationMode;
    }

    /**
     * The minimum interval, in milliseconds, between BFD control packets
     * received from the peer router. The actual value is negotiated
     * between the two routers and is equal to the greater of this value
     * and the transmit interval of the other router. If set, this value
     * must be between 1000 and 30000.
     * 
    */
    public Optional<Integer> getMinReceiveInterval() {
        return Optional.ofNullable(this.minReceiveInterval);
    }
    /**
     * The minimum interval, in milliseconds, between BFD control packets
     * transmitted to the peer router. The actual value is negotiated
     * between the two routers and is equal to the greater of this value
     * and the corresponding receive interval of the other router. If set,
     * this value must be between 1000 and 30000.
     * 
    */
    public Optional<Integer> getMinTransmitInterval() {
        return Optional.ofNullable(this.minTransmitInterval);
    }
    /**
     * The number of consecutive BFD packets that must be missed before
     * BFD declares that a peer is unavailable. If set, the value must
     * be a value between 5 and 16.
     * 
    */
    public Optional<Integer> getMultiplier() {
        return Optional.ofNullable(this.multiplier);
    }
    /**
     * The BFD session initialization mode for this BGP peer.
     * If set to `ACTIVE`, the Cloud Router will initiate the BFD session
     * for this BGP peer. If set to `PASSIVE`, the Cloud Router will wait
     * for the peer router to initiate the BFD session for this BGP peer.
     * If set to `DISABLED`, BFD is disabled for this BGP peer.
     * Possible values are `ACTIVE`, `DISABLED`, and `PASSIVE`.
     * 
    */
    public String getSessionInitializationMode() {
        return this.sessionInitializationMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterPeerBfd defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer minReceiveInterval;
        private @Nullable Integer minTransmitInterval;
        private @Nullable Integer multiplier;
        private String sessionInitializationMode;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterPeerBfd defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minReceiveInterval = defaults.minReceiveInterval;
    	      this.minTransmitInterval = defaults.minTransmitInterval;
    	      this.multiplier = defaults.multiplier;
    	      this.sessionInitializationMode = defaults.sessionInitializationMode;
        }

        public Builder minReceiveInterval(@Nullable Integer minReceiveInterval) {
            this.minReceiveInterval = minReceiveInterval;
            return this;
        }

        public Builder minTransmitInterval(@Nullable Integer minTransmitInterval) {
            this.minTransmitInterval = minTransmitInterval;
            return this;
        }

        public Builder multiplier(@Nullable Integer multiplier) {
            this.multiplier = multiplier;
            return this;
        }

        public Builder sessionInitializationMode(String sessionInitializationMode) {
            this.sessionInitializationMode = Objects.requireNonNull(sessionInitializationMode);
            return this;
        }
        public RouterPeerBfd build() {
            return new RouterPeerBfd(minReceiveInterval, minTransmitInterval, multiplier, sessionInitializationMode);
        }
    }
}
