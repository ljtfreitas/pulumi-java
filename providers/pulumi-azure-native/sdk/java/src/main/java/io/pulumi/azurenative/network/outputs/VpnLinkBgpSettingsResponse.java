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
public final class VpnLinkBgpSettingsResponse {
    /**
     * The BGP speaker's ASN.
     * 
     */
    private final @Nullable Double asn;
    /**
     * The BGP peering address and BGP identifier of this BGP speaker.
     * 
     */
    private final @Nullable String bgpPeeringAddress;

    @OutputCustomType.Constructor({"asn","bgpPeeringAddress"})
    private VpnLinkBgpSettingsResponse(
        @Nullable Double asn,
        @Nullable String bgpPeeringAddress) {
        this.asn = asn;
        this.bgpPeeringAddress = bgpPeeringAddress;
    }

    /**
     * The BGP speaker's ASN.
     * 
     */
    public Optional<Double> getAsn() {
        return Optional.ofNullable(this.asn);
    }
    /**
     * The BGP peering address and BGP identifier of this BGP speaker.
     * 
     */
    public Optional<String> getBgpPeeringAddress() {
        return Optional.ofNullable(this.bgpPeeringAddress);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnLinkBgpSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double asn;
        private @Nullable String bgpPeeringAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnLinkBgpSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.asn = defaults.asn;
    	      this.bgpPeeringAddress = defaults.bgpPeeringAddress;
        }

        public Builder setAsn(@Nullable Double asn) {
            this.asn = asn;
            return this;
        }

        public Builder setBgpPeeringAddress(@Nullable String bgpPeeringAddress) {
            this.bgpPeeringAddress = bgpPeeringAddress;
            return this;
        }
        public VpnLinkBgpSettingsResponse build() {
            return new VpnLinkBgpSettingsResponse(asn, bgpPeeringAddress);
        }
    }
}
