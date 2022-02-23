// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessorParameterArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessorArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessorArgs Empty = new FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessorArgs();

    /**
     * Array of processor parameters. More details are given below
     * 
     */
    @InputImport(name="parameters")
    private final @Nullable Input<List<FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessorParameterArgs>> parameters;

    public Input<List<FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessorParameterArgs>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    /**
     * The type of processor. Valid Values: `Lambda`
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessorArgs(
        @Nullable Input<List<FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessorParameterArgs>> parameters,
        Input<String> type) {
        this.parameters = parameters;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessorArgs() {
        this.parameters = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessorParameterArgs>> parameters;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameters = defaults.parameters;
    	      this.type = defaults.type;
        }

        public Builder setParameters(@Nullable Input<List<FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessorParameterArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setParameters(@Nullable List<FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessorParameterArgs> parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessorArgs build() {
            return new FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessorArgs(parameters, type);
        }
    }
}
