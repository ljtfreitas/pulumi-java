// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.peering.inputs;

import io.pulumi.azurenative.peering.inputs.BgpSessionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The properties that define an exchange connection.
 * 
 */
public final class ExchangeConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExchangeConnectionArgs Empty = new ExchangeConnectionArgs();

    /**
     * The BGP session associated with the connection.
     * 
     */
    @InputImport(name="bgpSession")
        private final @Nullable Input<BgpSessionArgs> bgpSession;

    public Input<BgpSessionArgs> getBgpSession() {
        return this.bgpSession == null ? Input.empty() : this.bgpSession;
    }

    /**
     * The unique identifier (GUID) for the connection.
     * 
     */
    @InputImport(name="connectionIdentifier")
        private final @Nullable Input<String> connectionIdentifier;

    public Input<String> getConnectionIdentifier() {
        return this.connectionIdentifier == null ? Input.empty() : this.connectionIdentifier;
    }

    /**
     * The PeeringDB.com ID of the facility at which the connection has to be set up.
     * 
     */
    @InputImport(name="peeringDBFacilityId")
        private final @Nullable Input<Integer> peeringDBFacilityId;

    public Input<Integer> getPeeringDBFacilityId() {
        return this.peeringDBFacilityId == null ? Input.empty() : this.peeringDBFacilityId;
    }

    public ExchangeConnectionArgs(
        @Nullable Input<BgpSessionArgs> bgpSession,
        @Nullable Input<String> connectionIdentifier,
        @Nullable Input<Integer> peeringDBFacilityId) {
        this.bgpSession = bgpSession;
        this.connectionIdentifier = connectionIdentifier;
        this.peeringDBFacilityId = peeringDBFacilityId;
    }

    private ExchangeConnectionArgs() {
        this.bgpSession = Input.empty();
        this.connectionIdentifier = Input.empty();
        this.peeringDBFacilityId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExchangeConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<BgpSessionArgs> bgpSession;
        private @Nullable Input<String> connectionIdentifier;
        private @Nullable Input<Integer> peeringDBFacilityId;

        public Builder() {
    	      // Empty
        }

        public Builder(ExchangeConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bgpSession = defaults.bgpSession;
    	      this.connectionIdentifier = defaults.connectionIdentifier;
    	      this.peeringDBFacilityId = defaults.peeringDBFacilityId;
        }

        public Builder setBgpSession(@Nullable Input<BgpSessionArgs> bgpSession) {
            this.bgpSession = bgpSession;
            return this;
        }

        public Builder setBgpSession(@Nullable BgpSessionArgs bgpSession) {
            this.bgpSession = Input.ofNullable(bgpSession);
            return this;
        }

        public Builder setConnectionIdentifier(@Nullable Input<String> connectionIdentifier) {
            this.connectionIdentifier = connectionIdentifier;
            return this;
        }

        public Builder setConnectionIdentifier(@Nullable String connectionIdentifier) {
            this.connectionIdentifier = Input.ofNullable(connectionIdentifier);
            return this;
        }

        public Builder setPeeringDBFacilityId(@Nullable Input<Integer> peeringDBFacilityId) {
            this.peeringDBFacilityId = peeringDBFacilityId;
            return this;
        }

        public Builder setPeeringDBFacilityId(@Nullable Integer peeringDBFacilityId) {
            this.peeringDBFacilityId = Input.ofNullable(peeringDBFacilityId);
            return this;
        }
        public ExchangeConnectionArgs build() {
            return new ExchangeConnectionArgs(bgpSession, connectionIdentifier, peeringDBFacilityId);
        }
    }
}
