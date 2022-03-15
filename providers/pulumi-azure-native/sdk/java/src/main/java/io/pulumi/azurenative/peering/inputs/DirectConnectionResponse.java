// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.peering.inputs;

import io.pulumi.azurenative.peering.inputs.BgpSessionResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties that define a direct connection.
 * 
 */
public final class DirectConnectionResponse extends io.pulumi.resources.InvokeArgs {

    public static final DirectConnectionResponse Empty = new DirectConnectionResponse();

    /**
     * The bandwidth of the connection.
     * 
     */
    @Import(name="bandwidthInMbps")
      private final @Nullable Integer bandwidthInMbps;

    public Optional<Integer> getBandwidthInMbps() {
        return this.bandwidthInMbps == null ? Optional.empty() : Optional.ofNullable(this.bandwidthInMbps);
    }

    /**
     * The BGP session associated with the connection.
     * 
     */
    @Import(name="bgpSession")
      private final @Nullable BgpSessionResponse bgpSession;

    public Optional<BgpSessionResponse> getBgpSession() {
        return this.bgpSession == null ? Optional.empty() : Optional.ofNullable(this.bgpSession);
    }

    /**
     * The unique identifier (GUID) for the connection.
     * 
     */
    @Import(name="connectionIdentifier")
      private final @Nullable String connectionIdentifier;

    public Optional<String> getConnectionIdentifier() {
        return this.connectionIdentifier == null ? Optional.empty() : Optional.ofNullable(this.connectionIdentifier);
    }

    /**
     * The state of the connection.
     * 
     */
    @Import(name="connectionState", required=true)
      private final String connectionState;

    public String getConnectionState() {
        return this.connectionState;
    }

    /**
     * The error message related to the connection state, if any.
     * 
     */
    @Import(name="errorMessage", required=true)
      private final String errorMessage;

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * The ID used within Microsoft's peering provisioning system to track the connection
     * 
     */
    @Import(name="microsoftTrackingId", required=true)
      private final String microsoftTrackingId;

    public String getMicrosoftTrackingId() {
        return this.microsoftTrackingId;
    }

    /**
     * The PeeringDB.com ID of the facility at which the connection has to be set up.
     * 
     */
    @Import(name="peeringDBFacilityId")
      private final @Nullable Integer peeringDBFacilityId;

    public Optional<Integer> getPeeringDBFacilityId() {
        return this.peeringDBFacilityId == null ? Optional.empty() : Optional.ofNullable(this.peeringDBFacilityId);
    }

    /**
     * The bandwidth that is actually provisioned.
     * 
     */
    @Import(name="provisionedBandwidthInMbps", required=true)
      private final Integer provisionedBandwidthInMbps;

    public Integer getProvisionedBandwidthInMbps() {
        return this.provisionedBandwidthInMbps;
    }

    /**
     * The field indicating if Microsoft provides session ip addresses.
     * 
     */
    @Import(name="sessionAddressProvider")
      private final @Nullable String sessionAddressProvider;

    public Optional<String> getSessionAddressProvider() {
        return this.sessionAddressProvider == null ? Optional.empty() : Optional.ofNullable(this.sessionAddressProvider);
    }

    /**
     * The flag that indicates whether or not the connection is used for peering service.
     * 
     */
    @Import(name="useForPeeringService")
      private final @Nullable Boolean useForPeeringService;

    public Optional<Boolean> getUseForPeeringService() {
        return this.useForPeeringService == null ? Optional.empty() : Optional.ofNullable(this.useForPeeringService);
    }

    public DirectConnectionResponse(
        @Nullable Integer bandwidthInMbps,
        @Nullable BgpSessionResponse bgpSession,
        @Nullable String connectionIdentifier,
        String connectionState,
        String errorMessage,
        String microsoftTrackingId,
        @Nullable Integer peeringDBFacilityId,
        Integer provisionedBandwidthInMbps,
        @Nullable String sessionAddressProvider,
        @Nullable Boolean useForPeeringService) {
        this.bandwidthInMbps = bandwidthInMbps;
        this.bgpSession = bgpSession;
        this.connectionIdentifier = connectionIdentifier;
        this.connectionState = Objects.requireNonNull(connectionState, "expected parameter 'connectionState' to be non-null");
        this.errorMessage = Objects.requireNonNull(errorMessage, "expected parameter 'errorMessage' to be non-null");
        this.microsoftTrackingId = Objects.requireNonNull(microsoftTrackingId, "expected parameter 'microsoftTrackingId' to be non-null");
        this.peeringDBFacilityId = peeringDBFacilityId;
        this.provisionedBandwidthInMbps = Objects.requireNonNull(provisionedBandwidthInMbps, "expected parameter 'provisionedBandwidthInMbps' to be non-null");
        this.sessionAddressProvider = sessionAddressProvider;
        this.useForPeeringService = useForPeeringService;
    }

    private DirectConnectionResponse() {
        this.bandwidthInMbps = null;
        this.bgpSession = null;
        this.connectionIdentifier = null;
        this.connectionState = null;
        this.errorMessage = null;
        this.microsoftTrackingId = null;
        this.peeringDBFacilityId = null;
        this.provisionedBandwidthInMbps = null;
        this.sessionAddressProvider = null;
        this.useForPeeringService = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DirectConnectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer bandwidthInMbps;
        private @Nullable BgpSessionResponse bgpSession;
        private @Nullable String connectionIdentifier;
        private String connectionState;
        private String errorMessage;
        private String microsoftTrackingId;
        private @Nullable Integer peeringDBFacilityId;
        private Integer provisionedBandwidthInMbps;
        private @Nullable String sessionAddressProvider;
        private @Nullable Boolean useForPeeringService;

        public Builder() {
    	      // Empty
        }

        public Builder(DirectConnectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bandwidthInMbps = defaults.bandwidthInMbps;
    	      this.bgpSession = defaults.bgpSession;
    	      this.connectionIdentifier = defaults.connectionIdentifier;
    	      this.connectionState = defaults.connectionState;
    	      this.errorMessage = defaults.errorMessage;
    	      this.microsoftTrackingId = defaults.microsoftTrackingId;
    	      this.peeringDBFacilityId = defaults.peeringDBFacilityId;
    	      this.provisionedBandwidthInMbps = defaults.provisionedBandwidthInMbps;
    	      this.sessionAddressProvider = defaults.sessionAddressProvider;
    	      this.useForPeeringService = defaults.useForPeeringService;
        }

        public Builder bandwidthInMbps(@Nullable Integer bandwidthInMbps) {
            this.bandwidthInMbps = bandwidthInMbps;
            return this;
        }

        public Builder bgpSession(@Nullable BgpSessionResponse bgpSession) {
            this.bgpSession = bgpSession;
            return this;
        }

        public Builder connectionIdentifier(@Nullable String connectionIdentifier) {
            this.connectionIdentifier = connectionIdentifier;
            return this;
        }

        public Builder connectionState(String connectionState) {
            this.connectionState = Objects.requireNonNull(connectionState);
            return this;
        }

        public Builder errorMessage(String errorMessage) {
            this.errorMessage = Objects.requireNonNull(errorMessage);
            return this;
        }

        public Builder microsoftTrackingId(String microsoftTrackingId) {
            this.microsoftTrackingId = Objects.requireNonNull(microsoftTrackingId);
            return this;
        }

        public Builder peeringDBFacilityId(@Nullable Integer peeringDBFacilityId) {
            this.peeringDBFacilityId = peeringDBFacilityId;
            return this;
        }

        public Builder provisionedBandwidthInMbps(Integer provisionedBandwidthInMbps) {
            this.provisionedBandwidthInMbps = Objects.requireNonNull(provisionedBandwidthInMbps);
            return this;
        }

        public Builder sessionAddressProvider(@Nullable String sessionAddressProvider) {
            this.sessionAddressProvider = sessionAddressProvider;
            return this;
        }

        public Builder useForPeeringService(@Nullable Boolean useForPeeringService) {
            this.useForPeeringService = useForPeeringService;
            return this;
        }
        public DirectConnectionResponse build() {
            return new DirectConnectionResponse(bandwidthInMbps, bgpSession, connectionIdentifier, connectionState, errorMessage, microsoftTrackingId, peeringDBFacilityId, provisionedBandwidthInMbps, sessionAddressProvider, useForPeeringService);
        }
    }
}
