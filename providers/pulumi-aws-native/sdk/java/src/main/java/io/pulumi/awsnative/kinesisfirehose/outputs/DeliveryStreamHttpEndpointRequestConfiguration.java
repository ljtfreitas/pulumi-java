// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.outputs;

import io.pulumi.awsnative.kinesisfirehose.enums.DeliveryStreamHttpEndpointRequestConfigurationContentEncoding;
import io.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamHttpEndpointCommonAttribute;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DeliveryStreamHttpEndpointRequestConfiguration {
    private final @Nullable List<DeliveryStreamHttpEndpointCommonAttribute> commonAttributes;
    private final @Nullable DeliveryStreamHttpEndpointRequestConfigurationContentEncoding contentEncoding;

    @OutputCustomType.Constructor({"commonAttributes","contentEncoding"})
    private DeliveryStreamHttpEndpointRequestConfiguration(
        @Nullable List<DeliveryStreamHttpEndpointCommonAttribute> commonAttributes,
        @Nullable DeliveryStreamHttpEndpointRequestConfigurationContentEncoding contentEncoding) {
        this.commonAttributes = commonAttributes;
        this.contentEncoding = contentEncoding;
    }

    public List<DeliveryStreamHttpEndpointCommonAttribute> getCommonAttributes() {
        return this.commonAttributes == null ? List.of() : this.commonAttributes;
    }
    public Optional<DeliveryStreamHttpEndpointRequestConfigurationContentEncoding> getContentEncoding() {
        return Optional.ofNullable(this.contentEncoding);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamHttpEndpointRequestConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DeliveryStreamHttpEndpointCommonAttribute> commonAttributes;
        private @Nullable DeliveryStreamHttpEndpointRequestConfigurationContentEncoding contentEncoding;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamHttpEndpointRequestConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commonAttributes = defaults.commonAttributes;
    	      this.contentEncoding = defaults.contentEncoding;
        }

        public Builder setCommonAttributes(@Nullable List<DeliveryStreamHttpEndpointCommonAttribute> commonAttributes) {
            this.commonAttributes = commonAttributes;
            return this;
        }

        public Builder setContentEncoding(@Nullable DeliveryStreamHttpEndpointRequestConfigurationContentEncoding contentEncoding) {
            this.contentEncoding = contentEncoding;
            return this;
        }
        public DeliveryStreamHttpEndpointRequestConfiguration build() {
            return new DeliveryStreamHttpEndpointRequestConfiguration(commonAttributes, contentEncoding);
        }
    }
}
