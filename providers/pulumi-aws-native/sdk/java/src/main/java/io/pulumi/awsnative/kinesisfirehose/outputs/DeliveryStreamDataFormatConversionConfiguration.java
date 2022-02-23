// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.outputs;

import io.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamInputFormatConfiguration;
import io.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamOutputFormatConfiguration;
import io.pulumi.awsnative.kinesisfirehose.outputs.DeliveryStreamSchemaConfiguration;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DeliveryStreamDataFormatConversionConfiguration {
    private final @Nullable Boolean enabled;
    private final @Nullable DeliveryStreamInputFormatConfiguration inputFormatConfiguration;
    private final @Nullable DeliveryStreamOutputFormatConfiguration outputFormatConfiguration;
    private final @Nullable DeliveryStreamSchemaConfiguration schemaConfiguration;

    @OutputCustomType.Constructor({"enabled","inputFormatConfiguration","outputFormatConfiguration","schemaConfiguration"})
    private DeliveryStreamDataFormatConversionConfiguration(
        @Nullable Boolean enabled,
        @Nullable DeliveryStreamInputFormatConfiguration inputFormatConfiguration,
        @Nullable DeliveryStreamOutputFormatConfiguration outputFormatConfiguration,
        @Nullable DeliveryStreamSchemaConfiguration schemaConfiguration) {
        this.enabled = enabled;
        this.inputFormatConfiguration = inputFormatConfiguration;
        this.outputFormatConfiguration = outputFormatConfiguration;
        this.schemaConfiguration = schemaConfiguration;
    }

    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Optional<DeliveryStreamInputFormatConfiguration> getInputFormatConfiguration() {
        return Optional.ofNullable(this.inputFormatConfiguration);
    }
    public Optional<DeliveryStreamOutputFormatConfiguration> getOutputFormatConfiguration() {
        return Optional.ofNullable(this.outputFormatConfiguration);
    }
    public Optional<DeliveryStreamSchemaConfiguration> getSchemaConfiguration() {
        return Optional.ofNullable(this.schemaConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamDataFormatConversionConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable DeliveryStreamInputFormatConfiguration inputFormatConfiguration;
        private @Nullable DeliveryStreamOutputFormatConfiguration outputFormatConfiguration;
        private @Nullable DeliveryStreamSchemaConfiguration schemaConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamDataFormatConversionConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.inputFormatConfiguration = defaults.inputFormatConfiguration;
    	      this.outputFormatConfiguration = defaults.outputFormatConfiguration;
    	      this.schemaConfiguration = defaults.schemaConfiguration;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setInputFormatConfiguration(@Nullable DeliveryStreamInputFormatConfiguration inputFormatConfiguration) {
            this.inputFormatConfiguration = inputFormatConfiguration;
            return this;
        }

        public Builder setOutputFormatConfiguration(@Nullable DeliveryStreamOutputFormatConfiguration outputFormatConfiguration) {
            this.outputFormatConfiguration = outputFormatConfiguration;
            return this;
        }

        public Builder setSchemaConfiguration(@Nullable DeliveryStreamSchemaConfiguration schemaConfiguration) {
            this.schemaConfiguration = schemaConfiguration;
            return this;
        }
        public DeliveryStreamDataFormatConversionConfiguration build() {
            return new DeliveryStreamDataFormatConversionConfiguration(enabled, inputFormatConfiguration, outputFormatConfiguration, schemaConfiguration);
        }
    }
}
