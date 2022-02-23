// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationGetArgs;
import io.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationGetArgs;
import io.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationSchemaConfigurationGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationGetArgs Empty = new FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationGetArgs();

    /**
     * Defaults to `true`. Set it to `false` if you want to disable format conversion while preserving the configuration details.
     * 
     */
    @InputImport(name="enabled")
    private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * Nested argument that specifies the deserializer that you want Kinesis Data Firehose to use to convert the format of your data from JSON. More details below.
     * 
     */
    @InputImport(name="inputFormatConfiguration", required=true)
    private final Input<FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationGetArgs> inputFormatConfiguration;

    public Input<FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationGetArgs> getInputFormatConfiguration() {
        return this.inputFormatConfiguration;
    }

    /**
     * Nested argument that specifies the serializer that you want Kinesis Data Firehose to use to convert the format of your data to the Parquet or ORC format. More details below.
     * 
     */
    @InputImport(name="outputFormatConfiguration", required=true)
    private final Input<FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationGetArgs> outputFormatConfiguration;

    public Input<FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationGetArgs> getOutputFormatConfiguration() {
        return this.outputFormatConfiguration;
    }

    /**
     * Nested argument that specifies the AWS Glue Data Catalog table that contains the column information. More details below.
     * 
     */
    @InputImport(name="schemaConfiguration", required=true)
    private final Input<FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationSchemaConfigurationGetArgs> schemaConfiguration;

    public Input<FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationSchemaConfigurationGetArgs> getSchemaConfiguration() {
        return this.schemaConfiguration;
    }

    public FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationGetArgs(
        @Nullable Input<Boolean> enabled,
        Input<FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationGetArgs> inputFormatConfiguration,
        Input<FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationGetArgs> outputFormatConfiguration,
        Input<FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationSchemaConfigurationGetArgs> schemaConfiguration) {
        this.enabled = enabled;
        this.inputFormatConfiguration = Objects.requireNonNull(inputFormatConfiguration, "expected parameter 'inputFormatConfiguration' to be non-null");
        this.outputFormatConfiguration = Objects.requireNonNull(outputFormatConfiguration, "expected parameter 'outputFormatConfiguration' to be non-null");
        this.schemaConfiguration = Objects.requireNonNull(schemaConfiguration, "expected parameter 'schemaConfiguration' to be non-null");
    }

    private FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationGetArgs() {
        this.enabled = Input.empty();
        this.inputFormatConfiguration = Input.empty();
        this.outputFormatConfiguration = Input.empty();
        this.schemaConfiguration = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enabled;
        private Input<FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationGetArgs> inputFormatConfiguration;
        private Input<FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationGetArgs> outputFormatConfiguration;
        private Input<FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationSchemaConfigurationGetArgs> schemaConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.inputFormatConfiguration = defaults.inputFormatConfiguration;
    	      this.outputFormatConfiguration = defaults.outputFormatConfiguration;
    	      this.schemaConfiguration = defaults.schemaConfiguration;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setInputFormatConfiguration(Input<FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationGetArgs> inputFormatConfiguration) {
            this.inputFormatConfiguration = Objects.requireNonNull(inputFormatConfiguration);
            return this;
        }

        public Builder setInputFormatConfiguration(FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationGetArgs inputFormatConfiguration) {
            this.inputFormatConfiguration = Input.of(Objects.requireNonNull(inputFormatConfiguration));
            return this;
        }

        public Builder setOutputFormatConfiguration(Input<FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationGetArgs> outputFormatConfiguration) {
            this.outputFormatConfiguration = Objects.requireNonNull(outputFormatConfiguration);
            return this;
        }

        public Builder setOutputFormatConfiguration(FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationGetArgs outputFormatConfiguration) {
            this.outputFormatConfiguration = Input.of(Objects.requireNonNull(outputFormatConfiguration));
            return this;
        }

        public Builder setSchemaConfiguration(Input<FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationSchemaConfigurationGetArgs> schemaConfiguration) {
            this.schemaConfiguration = Objects.requireNonNull(schemaConfiguration);
            return this;
        }

        public Builder setSchemaConfiguration(FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationSchemaConfigurationGetArgs schemaConfiguration) {
            this.schemaConfiguration = Input.of(Objects.requireNonNull(schemaConfiguration));
            return this;
        }
        public FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationGetArgs build() {
            return new FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationGetArgs(enabled, inputFormatConfiguration, outputFormatConfiguration, schemaConfiguration);
        }
    }
}
