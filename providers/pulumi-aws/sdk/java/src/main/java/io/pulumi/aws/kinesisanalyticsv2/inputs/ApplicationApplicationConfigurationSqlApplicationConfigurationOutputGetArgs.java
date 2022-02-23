// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.inputs;

import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchemaGetArgs;
import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutputGetArgs;
import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutputGetArgs;
import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutputGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationApplicationConfigurationSqlApplicationConfigurationOutputGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationSqlApplicationConfigurationOutputGetArgs Empty = new ApplicationApplicationConfigurationSqlApplicationConfigurationOutputGetArgs();

    /**
     * Describes the data format when records are written to the destination.
     * 
     */
    @InputImport(name="destinationSchema", required=true)
    private final Input<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchemaGetArgs> destinationSchema;

    public Input<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchemaGetArgs> getDestinationSchema() {
        return this.destinationSchema;
    }

    /**
     * Identifies a Kinesis Data Firehose delivery stream as the destination.
     * 
     */
    @InputImport(name="kinesisFirehoseOutput")
    private final @Nullable Input<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutputGetArgs> kinesisFirehoseOutput;

    public Input<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutputGetArgs> getKinesisFirehoseOutput() {
        return this.kinesisFirehoseOutput == null ? Input.empty() : this.kinesisFirehoseOutput;
    }

    /**
     * Identifies a Kinesis data stream as the destination.
     * 
     */
    @InputImport(name="kinesisStreamsOutput")
    private final @Nullable Input<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutputGetArgs> kinesisStreamsOutput;

    public Input<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutputGetArgs> getKinesisStreamsOutput() {
        return this.kinesisStreamsOutput == null ? Input.empty() : this.kinesisStreamsOutput;
    }

    /**
     * Identifies a Lambda function as the destination.
     * 
     */
    @InputImport(name="lambdaOutput")
    private final @Nullable Input<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutputGetArgs> lambdaOutput;

    public Input<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutputGetArgs> getLambdaOutput() {
        return this.lambdaOutput == null ? Input.empty() : this.lambdaOutput;
    }

    /**
     * The name of the in-application stream.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    @InputImport(name="outputId")
    private final @Nullable Input<String> outputId;

    public Input<String> getOutputId() {
        return this.outputId == null ? Input.empty() : this.outputId;
    }

    public ApplicationApplicationConfigurationSqlApplicationConfigurationOutputGetArgs(
        Input<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchemaGetArgs> destinationSchema,
        @Nullable Input<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutputGetArgs> kinesisFirehoseOutput,
        @Nullable Input<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutputGetArgs> kinesisStreamsOutput,
        @Nullable Input<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutputGetArgs> lambdaOutput,
        Input<String> name,
        @Nullable Input<String> outputId) {
        this.destinationSchema = Objects.requireNonNull(destinationSchema, "expected parameter 'destinationSchema' to be non-null");
        this.kinesisFirehoseOutput = kinesisFirehoseOutput;
        this.kinesisStreamsOutput = kinesisStreamsOutput;
        this.lambdaOutput = lambdaOutput;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.outputId = outputId;
    }

    private ApplicationApplicationConfigurationSqlApplicationConfigurationOutputGetArgs() {
        this.destinationSchema = Input.empty();
        this.kinesisFirehoseOutput = Input.empty();
        this.kinesisStreamsOutput = Input.empty();
        this.lambdaOutput = Input.empty();
        this.name = Input.empty();
        this.outputId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationOutputGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchemaGetArgs> destinationSchema;
        private @Nullable Input<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutputGetArgs> kinesisFirehoseOutput;
        private @Nullable Input<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutputGetArgs> kinesisStreamsOutput;
        private @Nullable Input<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutputGetArgs> lambdaOutput;
        private Input<String> name;
        private @Nullable Input<String> outputId;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationOutputGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationSchema = defaults.destinationSchema;
    	      this.kinesisFirehoseOutput = defaults.kinesisFirehoseOutput;
    	      this.kinesisStreamsOutput = defaults.kinesisStreamsOutput;
    	      this.lambdaOutput = defaults.lambdaOutput;
    	      this.name = defaults.name;
    	      this.outputId = defaults.outputId;
        }

        public Builder setDestinationSchema(Input<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchemaGetArgs> destinationSchema) {
            this.destinationSchema = Objects.requireNonNull(destinationSchema);
            return this;
        }

        public Builder setDestinationSchema(ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchemaGetArgs destinationSchema) {
            this.destinationSchema = Input.of(Objects.requireNonNull(destinationSchema));
            return this;
        }

        public Builder setKinesisFirehoseOutput(@Nullable Input<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutputGetArgs> kinesisFirehoseOutput) {
            this.kinesisFirehoseOutput = kinesisFirehoseOutput;
            return this;
        }

        public Builder setKinesisFirehoseOutput(@Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutputGetArgs kinesisFirehoseOutput) {
            this.kinesisFirehoseOutput = Input.ofNullable(kinesisFirehoseOutput);
            return this;
        }

        public Builder setKinesisStreamsOutput(@Nullable Input<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutputGetArgs> kinesisStreamsOutput) {
            this.kinesisStreamsOutput = kinesisStreamsOutput;
            return this;
        }

        public Builder setKinesisStreamsOutput(@Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutputGetArgs kinesisStreamsOutput) {
            this.kinesisStreamsOutput = Input.ofNullable(kinesisStreamsOutput);
            return this;
        }

        public Builder setLambdaOutput(@Nullable Input<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutputGetArgs> lambdaOutput) {
            this.lambdaOutput = lambdaOutput;
            return this;
        }

        public Builder setLambdaOutput(@Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutputGetArgs lambdaOutput) {
            this.lambdaOutput = Input.ofNullable(lambdaOutput);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setOutputId(@Nullable Input<String> outputId) {
            this.outputId = outputId;
            return this;
        }

        public Builder setOutputId(@Nullable String outputId) {
            this.outputId = Input.ofNullable(outputId);
            return this;
        }
        public ApplicationApplicationConfigurationSqlApplicationConfigurationOutputGetArgs build() {
            return new ApplicationApplicationConfigurationSqlApplicationConfigurationOutputGetArgs(destinationSchema, kinesisFirehoseOutput, kinesisStreamsOutput, lambdaOutput, name, outputId);
        }
    }
}
