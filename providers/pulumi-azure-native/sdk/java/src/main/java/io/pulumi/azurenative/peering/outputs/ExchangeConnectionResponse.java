// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.peering.outputs;

import io.pulumi.azurenative.peering.outputs.BgpSessionResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ExchangeConnectionResponse {
    /**
     * The BGP session associated with the connection.
     * 
     */
    private final @Nullable BgpSessionResponse bgpSession;
    /**
     * The unique identifier (GUID) for the connection.
     * 
     */
    private final @Nullable String connectionIdentifier;
    /**
     * The state of the connection.
     * 
     */
    private final String connectionState;
    /**
     * The error message related to the connection state, if any.
     * 
     */
    private final String errorMessage;
    /**
     * The PeeringDB.com ID of the facility at which the connection has to be set up.
     * 
     */
    private final @Nullable Integer peeringDBFacilityId;

    @CustomType.Constructor
    private ExchangeConnectionResponse(
        @CustomType.Parameter("bgpSession") @Nullable BgpSessionResponse bgpSession,
        @CustomType.Parameter("connectionIdentifier") @Nullable String connectionIdentifier,
        @CustomType.Parameter("connectionState") String connectionState,
        @CustomType.Parameter("errorMessage") String errorMessage,
        @CustomType.Parameter("peeringDBFacilityId") @Nullable Integer peeringDBFacilityId) {
        this.bgpSession = bgpSession;
        this.connectionIdentifier = connectionIdentifier;
        this.connectionState = connectionState;
        this.errorMessage = errorMessage;
        this.peeringDBFacilityId = peeringDBFacilityId;
    }

    /**
     * The BGP session associated with the connection.
     * 
    */
    public Optional<BgpSessionResponse> getBgpSession() {
        return Optional.ofNullable(this.bgpSession);
    }
    /**
     * The unique identifier (GUID) for the connection.
     * 
    */
    public Optional<String> getConnectionIdentifier() {
        return Optional.ofNullable(this.connectionIdentifier);
    }
    /**
     * The state of the connection.
     * 
    */
    public String getConnectionState() {
        return this.connectionState;
    }
    /**
     * The error message related to the connection state, if any.
     * 
    */
    public String getErrorMessage() {
        return this.errorMessage;
    }
    /**
     * The PeeringDB.com ID of the facility at which the connection has to be set up.
     * 
    */
    public Optional<Integer> getPeeringDBFacilityId() {
        return Optional.ofNullable(this.peeringDBFacilityId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExchangeConnectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BgpSessionResponse bgpSession;
        private @Nullable String connectionIdentifier;
        private String connectionState;
        private String errorMessage;
        private @Nullable Integer peeringDBFacilityId;

        public Builder() {
    	      // Empty
        }

        public Builder(ExchangeConnectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bgpSession = defaults.bgpSession;
    	      this.connectionIdentifier = defaults.connectionIdentifier;
    	      this.connectionState = defaults.connectionState;
    	      this.errorMessage = defaults.errorMessage;
    	      this.peeringDBFacilityId = defaults.peeringDBFacilityId;
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

        public Builder peeringDBFacilityId(@Nullable Integer peeringDBFacilityId) {
            this.peeringDBFacilityId = peeringDBFacilityId;
            return this;
        }
        public ExchangeConnectionResponse build() {
            return new ExchangeConnectionResponse(bgpSession, connectionIdentifier, connectionState, errorMessage, peeringDBFacilityId);
        }
    }
}
