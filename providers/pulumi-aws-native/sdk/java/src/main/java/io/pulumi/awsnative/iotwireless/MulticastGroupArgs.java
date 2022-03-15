// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless;

import io.pulumi.awsnative.iotwireless.inputs.MulticastGroupLoRaWANArgs;
import io.pulumi.awsnative.iotwireless.inputs.MulticastGroupTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MulticastGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final MulticastGroupArgs Empty = new MulticastGroupArgs();

    /**
     * Wireless device to associate. Only for update request.
     * 
     */
    @Import(name="associateWirelessDevice")
      private final @Nullable Output<String> associateWirelessDevice;

    public Output<String> getAssociateWirelessDevice() {
        return this.associateWirelessDevice == null ? Output.empty() : this.associateWirelessDevice;
    }

    /**
     * Multicast group description
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Wireless device to disassociate. Only for update request.
     * 
     */
    @Import(name="disassociateWirelessDevice")
      private final @Nullable Output<String> disassociateWirelessDevice;

    public Output<String> getDisassociateWirelessDevice() {
        return this.disassociateWirelessDevice == null ? Output.empty() : this.disassociateWirelessDevice;
    }

    /**
     * Multicast group LoRaWAN
     * 
     */
    @Import(name="loRaWAN", required=true)
      private final Output<MulticastGroupLoRaWANArgs> loRaWAN;

    public Output<MulticastGroupLoRaWANArgs> getLoRaWAN() {
        return this.loRaWAN;
    }

    /**
     * Name of Multicast group
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * A list of key-value pairs that contain metadata for the Multicast group.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<MulticastGroupTagArgs>> tags;

    public Output<List<MulticastGroupTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public MulticastGroupArgs(
        @Nullable Output<String> associateWirelessDevice,
        @Nullable Output<String> description,
        @Nullable Output<String> disassociateWirelessDevice,
        Output<MulticastGroupLoRaWANArgs> loRaWAN,
        @Nullable Output<String> name,
        @Nullable Output<List<MulticastGroupTagArgs>> tags) {
        this.associateWirelessDevice = associateWirelessDevice;
        this.description = description;
        this.disassociateWirelessDevice = disassociateWirelessDevice;
        this.loRaWAN = Objects.requireNonNull(loRaWAN, "expected parameter 'loRaWAN' to be non-null");
        this.name = name;
        this.tags = tags;
    }

    private MulticastGroupArgs() {
        this.associateWirelessDevice = Output.empty();
        this.description = Output.empty();
        this.disassociateWirelessDevice = Output.empty();
        this.loRaWAN = Output.empty();
        this.name = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MulticastGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> associateWirelessDevice;
        private @Nullable Output<String> description;
        private @Nullable Output<String> disassociateWirelessDevice;
        private Output<MulticastGroupLoRaWANArgs> loRaWAN;
        private @Nullable Output<String> name;
        private @Nullable Output<List<MulticastGroupTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(MulticastGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.associateWirelessDevice = defaults.associateWirelessDevice;
    	      this.description = defaults.description;
    	      this.disassociateWirelessDevice = defaults.disassociateWirelessDevice;
    	      this.loRaWAN = defaults.loRaWAN;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder associateWirelessDevice(@Nullable Output<String> associateWirelessDevice) {
            this.associateWirelessDevice = associateWirelessDevice;
            return this;
        }

        public Builder associateWirelessDevice(@Nullable String associateWirelessDevice) {
            this.associateWirelessDevice = Output.ofNullable(associateWirelessDevice);
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder disassociateWirelessDevice(@Nullable Output<String> disassociateWirelessDevice) {
            this.disassociateWirelessDevice = disassociateWirelessDevice;
            return this;
        }

        public Builder disassociateWirelessDevice(@Nullable String disassociateWirelessDevice) {
            this.disassociateWirelessDevice = Output.ofNullable(disassociateWirelessDevice);
            return this;
        }

        public Builder loRaWAN(Output<MulticastGroupLoRaWANArgs> loRaWAN) {
            this.loRaWAN = Objects.requireNonNull(loRaWAN);
            return this;
        }

        public Builder loRaWAN(MulticastGroupLoRaWANArgs loRaWAN) {
            this.loRaWAN = Output.of(Objects.requireNonNull(loRaWAN));
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder tags(@Nullable Output<List<MulticastGroupTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<MulticastGroupTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public MulticastGroupArgs build() {
            return new MulticastGroupArgs(associateWirelessDevice, description, disassociateWirelessDevice, loRaWAN, name, tags);
        }
    }
}
