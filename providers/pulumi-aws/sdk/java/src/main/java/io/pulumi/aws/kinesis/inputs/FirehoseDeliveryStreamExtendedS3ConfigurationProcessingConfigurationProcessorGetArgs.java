// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorParameterGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorGetArgs Empty = new FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorGetArgs();

    /**
     * Array of processor parameters. More details are given below
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<List<FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorParameterGetArgs>> parameters;

    public Output<List<FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorParameterGetArgs>> getParameters() {
        return this.parameters == null ? Output.empty() : this.parameters;
    }

    /**
     * The type of processor. Valid Values: `Lambda`
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorGetArgs(
        @Nullable Output<List<FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorParameterGetArgs>> parameters,
        Output<String> type) {
        this.parameters = parameters;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorGetArgs() {
        this.parameters = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorParameterGetArgs>> parameters;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameters = defaults.parameters;
    	      this.type = defaults.type;
        }

        public Builder parameters(@Nullable Output<List<FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorParameterGetArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder parameters(@Nullable List<FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorParameterGetArgs> parameters) {
            this.parameters = Output.ofNullable(parameters);
            return this;
        }

        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorGetArgs build() {
            return new FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorGetArgs(parameters, type);
        }
    }
}
