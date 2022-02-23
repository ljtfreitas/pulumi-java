// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class WirelessGatewayLoRaWANGatewayArgs extends io.pulumi.resources.ResourceArgs {

    public static final WirelessGatewayLoRaWANGatewayArgs Empty = new WirelessGatewayLoRaWANGatewayArgs();

    @InputImport(name="gatewayEui", required=true)
        private final Input<String> gatewayEui;

    public Input<String> getGatewayEui() {
        return this.gatewayEui;
    }

    @InputImport(name="rfRegion", required=true)
        private final Input<String> rfRegion;

    public Input<String> getRfRegion() {
        return this.rfRegion;
    }

    public WirelessGatewayLoRaWANGatewayArgs(
        Input<String> gatewayEui,
        Input<String> rfRegion) {
        this.gatewayEui = Objects.requireNonNull(gatewayEui, "expected parameter 'gatewayEui' to be non-null");
        this.rfRegion = Objects.requireNonNull(rfRegion, "expected parameter 'rfRegion' to be non-null");
    }

    private WirelessGatewayLoRaWANGatewayArgs() {
        this.gatewayEui = Input.empty();
        this.rfRegion = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WirelessGatewayLoRaWANGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> gatewayEui;
        private Input<String> rfRegion;

        public Builder() {
    	      // Empty
        }

        public Builder(WirelessGatewayLoRaWANGatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gatewayEui = defaults.gatewayEui;
    	      this.rfRegion = defaults.rfRegion;
        }

        public Builder setGatewayEui(Input<String> gatewayEui) {
            this.gatewayEui = Objects.requireNonNull(gatewayEui);
            return this;
        }

        public Builder setGatewayEui(String gatewayEui) {
            this.gatewayEui = Input.of(Objects.requireNonNull(gatewayEui));
            return this;
        }

        public Builder setRfRegion(Input<String> rfRegion) {
            this.rfRegion = Objects.requireNonNull(rfRegion);
            return this;
        }

        public Builder setRfRegion(String rfRegion) {
            this.rfRegion = Input.of(Objects.requireNonNull(rfRegion));
            return this;
        }
        public WirelessGatewayLoRaWANGatewayArgs build() {
            return new WirelessGatewayLoRaWANGatewayArgs(gatewayEui, rfRegion);
        }
    }
}
