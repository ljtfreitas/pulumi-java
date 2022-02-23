// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationGetArgs Empty = new FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationGetArgs();

    /**
     * Enables or disables data processing.
     * 
     */
    @InputImport(name="enabled")
    private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * Array of data processors. More details are given below
     * 
     */
    @InputImport(name="processors")
    private final @Nullable Input<List<FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorGetArgs>> processors;

    public Input<List<FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorGetArgs>> getProcessors() {
        return this.processors == null ? Input.empty() : this.processors;
    }

    public FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationGetArgs(
        @Nullable Input<Boolean> enabled,
        @Nullable Input<List<FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorGetArgs>> processors) {
        this.enabled = enabled;
        this.processors = processors;
    }

    private FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationGetArgs() {
        this.enabled = Input.empty();
        this.processors = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<List<FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorGetArgs>> processors;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.processors = defaults.processors;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setProcessors(@Nullable Input<List<FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorGetArgs>> processors) {
            this.processors = processors;
            return this;
        }

        public Builder setProcessors(@Nullable List<FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorGetArgs> processors) {
            this.processors = Input.ofNullable(processors);
            return this;
        }
        public FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationGetArgs build() {
            return new FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationGetArgs(enabled, processors);
        }
    }
}
