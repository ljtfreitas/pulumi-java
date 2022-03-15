// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless.outputs;

import io.pulumi.awsnative.iotwireless.outputs.WirelessGatewayLoRaWANGateway;
import io.pulumi.awsnative.iotwireless.outputs.WirelessGatewayTag;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetWirelessGatewayResult {
    /**
     * Arn for Wireless Gateway. Returned upon successful create.
     * 
     */
    private final @Nullable String arn;
    /**
     * Description of Wireless Gateway.
     * 
     */
    private final @Nullable String description;
    /**
     * Id for Wireless Gateway. Returned upon successful create.
     * 
     */
    private final @Nullable String id;
    /**
     * The date and time when the most recent uplink was received.
     * 
     */
    private final @Nullable String lastUplinkReceivedAt;
    /**
     * The combination of Package, Station and Model which represents the version of the LoRaWAN Wireless Gateway.
     * 
     */
    private final @Nullable WirelessGatewayLoRaWANGateway loRaWAN;
    /**
     * Name of Wireless Gateway.
     * 
     */
    private final @Nullable String name;
    /**
     * A list of key-value pairs that contain metadata for the gateway.
     * 
     */
    private final @Nullable List<WirelessGatewayTag> tags;
    /**
     * Thing Arn. Passed into Update to associate a Thing with the Wireless Gateway.
     * 
     */
    private final @Nullable String thingArn;
    /**
     * Thing Arn. If there is a Thing created, this can be returned with a Get call.
     * 
     */
    private final @Nullable String thingName;

    @CustomType.Constructor
    private GetWirelessGatewayResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("lastUplinkReceivedAt") @Nullable String lastUplinkReceivedAt,
        @CustomType.Parameter("loRaWAN") @Nullable WirelessGatewayLoRaWANGateway loRaWAN,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("tags") @Nullable List<WirelessGatewayTag> tags,
        @CustomType.Parameter("thingArn") @Nullable String thingArn,
        @CustomType.Parameter("thingName") @Nullable String thingName) {
        this.arn = arn;
        this.description = description;
        this.id = id;
        this.lastUplinkReceivedAt = lastUplinkReceivedAt;
        this.loRaWAN = loRaWAN;
        this.name = name;
        this.tags = tags;
        this.thingArn = thingArn;
        this.thingName = thingName;
    }

    /**
     * Arn for Wireless Gateway. Returned upon successful create.
     * 
    */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * Description of Wireless Gateway.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Id for Wireless Gateway. Returned upon successful create.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The date and time when the most recent uplink was received.
     * 
    */
    public Optional<String> getLastUplinkReceivedAt() {
        return Optional.ofNullable(this.lastUplinkReceivedAt);
    }
    /**
     * The combination of Package, Station and Model which represents the version of the LoRaWAN Wireless Gateway.
     * 
    */
    public Optional<WirelessGatewayLoRaWANGateway> getLoRaWAN() {
        return Optional.ofNullable(this.loRaWAN);
    }
    /**
     * Name of Wireless Gateway.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * A list of key-value pairs that contain metadata for the gateway.
     * 
    */
    public List<WirelessGatewayTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * Thing Arn. Passed into Update to associate a Thing with the Wireless Gateway.
     * 
    */
    public Optional<String> getThingArn() {
        return Optional.ofNullable(this.thingArn);
    }
    /**
     * Thing Arn. If there is a Thing created, this can be returned with a Get call.
     * 
    */
    public Optional<String> getThingName() {
        return Optional.ofNullable(this.thingName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWirelessGatewayResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String description;
        private @Nullable String id;
        private @Nullable String lastUplinkReceivedAt;
        private @Nullable WirelessGatewayLoRaWANGateway loRaWAN;
        private @Nullable String name;
        private @Nullable List<WirelessGatewayTag> tags;
        private @Nullable String thingArn;
        private @Nullable String thingName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWirelessGatewayResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.lastUplinkReceivedAt = defaults.lastUplinkReceivedAt;
    	      this.loRaWAN = defaults.loRaWAN;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.thingArn = defaults.thingArn;
    	      this.thingName = defaults.thingName;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder lastUplinkReceivedAt(@Nullable String lastUplinkReceivedAt) {
            this.lastUplinkReceivedAt = lastUplinkReceivedAt;
            return this;
        }

        public Builder loRaWAN(@Nullable WirelessGatewayLoRaWANGateway loRaWAN) {
            this.loRaWAN = loRaWAN;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder tags(@Nullable List<WirelessGatewayTag> tags) {
            this.tags = tags;
            return this;
        }

        public Builder thingArn(@Nullable String thingArn) {
            this.thingArn = thingArn;
            return this;
        }

        public Builder thingName(@Nullable String thingName) {
            this.thingName = thingName;
            return this;
        }
        public GetWirelessGatewayResult build() {
            return new GetWirelessGatewayResult(arn, description, id, lastUplinkReceivedAt, loRaWAN, name, tags, thingArn, thingName);
        }
    }
}
