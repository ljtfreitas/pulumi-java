// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.outputs;

import io.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamSerializer;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeliveryStreamOutputFormatConfiguration {
    private final @Nullable DeliveryStreamSerializer serializer;

    @CustomType.Constructor
    private DeliveryStreamOutputFormatConfiguration(@CustomType.Parameter("serializer") @Nullable DeliveryStreamSerializer serializer) {
        this.serializer = serializer;
    }

    public Optional<DeliveryStreamSerializer> getSerializer() {
        return Optional.ofNullable(this.serializer);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamOutputFormatConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DeliveryStreamSerializer serializer;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamOutputFormatConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serializer = defaults.serializer;
        }

        public Builder serializer(@Nullable DeliveryStreamSerializer serializer) {
            this.serializer = serializer;
            return this;
        }
        public DeliveryStreamOutputFormatConfiguration build() {
            return new DeliveryStreamOutputFormatConfiguration(serializer);
        }
    }
}
