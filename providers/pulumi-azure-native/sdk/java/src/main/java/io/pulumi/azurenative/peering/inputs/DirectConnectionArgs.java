// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.peering.inputs;

import io.pulumi.azurenative.peering.enums.SessionAddressProvider;
import io.pulumi.azurenative.peering.inputs.BgpSessionArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The properties that define a direct connection.
 * 
 */
public final class DirectConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final DirectConnectionArgs Empty = new DirectConnectionArgs();

    /**
     * The bandwidth of the connection.
     * 
     */
    @Import(name="bandwidthInMbps")
      private final @Nullable Output<Integer> bandwidthInMbps;

    public Output<Integer> getBandwidthInMbps() {
        return this.bandwidthInMbps == null ? Output.empty() : this.bandwidthInMbps;
    }

    /**
     * The BGP session associated with the connection.
     * 
     */
    @Import(name="bgpSession")
      private final @Nullable Output<BgpSessionArgs> bgpSession;

    public Output<BgpSessionArgs> getBgpSession() {
        return this.bgpSession == null ? Output.empty() : this.bgpSession;
    }

    /**
     * The unique identifier (GUID) for the connection.
     * 
     */
    @Import(name="connectionIdentifier")
      private final @Nullable Output<String> connectionIdentifier;

    public Output<String> getConnectionIdentifier() {
        return this.connectionIdentifier == null ? Output.empty() : this.connectionIdentifier;
    }

    /**
     * The PeeringDB.com ID of the facility at which the connection has to be set up.
     * 
     */
    @Import(name="peeringDBFacilityId")
      private final @Nullable Output<Integer> peeringDBFacilityId;

    public Output<Integer> getPeeringDBFacilityId() {
        return this.peeringDBFacilityId == null ? Output.empty() : this.peeringDBFacilityId;
    }

    /**
     * The field indicating if Microsoft provides session ip addresses.
     * 
     */
    @Import(name="sessionAddressProvider")
      private final @Nullable Output<Either<String,SessionAddressProvider>> sessionAddressProvider;

    public Output<Either<String,SessionAddressProvider>> getSessionAddressProvider() {
        return this.sessionAddressProvider == null ? Output.empty() : this.sessionAddressProvider;
    }

    /**
     * The flag that indicates whether or not the connection is used for peering service.
     * 
     */
    @Import(name="useForPeeringService")
      private final @Nullable Output<Boolean> useForPeeringService;

    public Output<Boolean> getUseForPeeringService() {
        return this.useForPeeringService == null ? Output.empty() : this.useForPeeringService;
    }

    public DirectConnectionArgs(
        @Nullable Output<Integer> bandwidthInMbps,
        @Nullable Output<BgpSessionArgs> bgpSession,
        @Nullable Output<String> connectionIdentifier,
        @Nullable Output<Integer> peeringDBFacilityId,
        @Nullable Output<Either<String,SessionAddressProvider>> sessionAddressProvider,
        @Nullable Output<Boolean> useForPeeringService) {
        this.bandwidthInMbps = bandwidthInMbps;
        this.bgpSession = bgpSession;
        this.connectionIdentifier = connectionIdentifier;
        this.peeringDBFacilityId = peeringDBFacilityId;
        this.sessionAddressProvider = sessionAddressProvider;
        this.useForPeeringService = useForPeeringService;
    }

    private DirectConnectionArgs() {
        this.bandwidthInMbps = Output.empty();
        this.bgpSession = Output.empty();
        this.connectionIdentifier = Output.empty();
        this.peeringDBFacilityId = Output.empty();
        this.sessionAddressProvider = Output.empty();
        this.useForPeeringService = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DirectConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> bandwidthInMbps;
        private @Nullable Output<BgpSessionArgs> bgpSession;
        private @Nullable Output<String> connectionIdentifier;
        private @Nullable Output<Integer> peeringDBFacilityId;
        private @Nullable Output<Either<String,SessionAddressProvider>> sessionAddressProvider;
        private @Nullable Output<Boolean> useForPeeringService;

        public Builder() {
    	      // Empty
        }

        public Builder(DirectConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bandwidthInMbps = defaults.bandwidthInMbps;
    	      this.bgpSession = defaults.bgpSession;
    	      this.connectionIdentifier = defaults.connectionIdentifier;
    	      this.peeringDBFacilityId = defaults.peeringDBFacilityId;
    	      this.sessionAddressProvider = defaults.sessionAddressProvider;
    	      this.useForPeeringService = defaults.useForPeeringService;
        }

        public Builder bandwidthInMbps(@Nullable Output<Integer> bandwidthInMbps) {
            this.bandwidthInMbps = bandwidthInMbps;
            return this;
        }

        public Builder bandwidthInMbps(@Nullable Integer bandwidthInMbps) {
            this.bandwidthInMbps = Output.ofNullable(bandwidthInMbps);
            return this;
        }

        public Builder bgpSession(@Nullable Output<BgpSessionArgs> bgpSession) {
            this.bgpSession = bgpSession;
            return this;
        }

        public Builder bgpSession(@Nullable BgpSessionArgs bgpSession) {
            this.bgpSession = Output.ofNullable(bgpSession);
            return this;
        }

        public Builder connectionIdentifier(@Nullable Output<String> connectionIdentifier) {
            this.connectionIdentifier = connectionIdentifier;
            return this;
        }

        public Builder connectionIdentifier(@Nullable String connectionIdentifier) {
            this.connectionIdentifier = Output.ofNullable(connectionIdentifier);
            return this;
        }

        public Builder peeringDBFacilityId(@Nullable Output<Integer> peeringDBFacilityId) {
            this.peeringDBFacilityId = peeringDBFacilityId;
            return this;
        }

        public Builder peeringDBFacilityId(@Nullable Integer peeringDBFacilityId) {
            this.peeringDBFacilityId = Output.ofNullable(peeringDBFacilityId);
            return this;
        }

        public Builder sessionAddressProvider(@Nullable Output<Either<String,SessionAddressProvider>> sessionAddressProvider) {
            this.sessionAddressProvider = sessionAddressProvider;
            return this;
        }

        public Builder sessionAddressProvider(@Nullable Either<String,SessionAddressProvider> sessionAddressProvider) {
            this.sessionAddressProvider = Output.ofNullable(sessionAddressProvider);
            return this;
        }

        public Builder useForPeeringService(@Nullable Output<Boolean> useForPeeringService) {
            this.useForPeeringService = useForPeeringService;
            return this;
        }

        public Builder useForPeeringService(@Nullable Boolean useForPeeringService) {
            this.useForPeeringService = Output.ofNullable(useForPeeringService);
            return this;
        }
        public DirectConnectionArgs build() {
            return new DirectConnectionArgs(bandwidthInMbps, bgpSession, connectionIdentifier, peeringDBFacilityId, sessionAddressProvider, useForPeeringService);
        }
    }
}
