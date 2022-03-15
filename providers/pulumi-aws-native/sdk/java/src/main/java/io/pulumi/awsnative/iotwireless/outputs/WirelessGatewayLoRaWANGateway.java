// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WirelessGatewayLoRaWANGateway {
    private final String gatewayEui;
    private final String rfRegion;

    @CustomType.Constructor
    private WirelessGatewayLoRaWANGateway(
        @CustomType.Parameter("gatewayEui") String gatewayEui,
        @CustomType.Parameter("rfRegion") String rfRegion) {
        this.gatewayEui = gatewayEui;
        this.rfRegion = rfRegion;
    }

    public String getGatewayEui() {
        return this.gatewayEui;
    }
    public String getRfRegion() {
        return this.rfRegion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WirelessGatewayLoRaWANGateway defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String gatewayEui;
        private String rfRegion;

        public Builder() {
    	      // Empty
        }

        public Builder(WirelessGatewayLoRaWANGateway defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gatewayEui = defaults.gatewayEui;
    	      this.rfRegion = defaults.rfRegion;
        }

        public Builder gatewayEui(String gatewayEui) {
            this.gatewayEui = Objects.requireNonNull(gatewayEui);
            return this;
        }

        public Builder rfRegion(String rfRegion) {
            this.rfRegion = Objects.requireNonNull(rfRegion);
            return this;
        }
        public WirelessGatewayLoRaWANGateway build() {
            return new WirelessGatewayLoRaWANGateway(gatewayEui, rfRegion);
        }
    }
}
