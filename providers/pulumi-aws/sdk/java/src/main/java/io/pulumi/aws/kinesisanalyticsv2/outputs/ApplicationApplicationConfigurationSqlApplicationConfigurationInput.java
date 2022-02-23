// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.outputs;

import io.pulumi.aws.kinesisanalyticsv2.outputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelism;
import io.pulumi.aws.kinesisanalyticsv2.outputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfiguration;
import io.pulumi.aws.kinesisanalyticsv2.outputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchema;
import io.pulumi.aws.kinesisanalyticsv2.outputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfiguration;
import io.pulumi.aws.kinesisanalyticsv2.outputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisFirehoseInput;
import io.pulumi.aws.kinesisanalyticsv2.outputs.ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInput;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApplicationApplicationConfigurationSqlApplicationConfigurationInput {
    private final @Nullable List<String> inAppStreamNames;
    private final @Nullable String inputId;
    /**
     * Describes the number of in-application streams to create.
     * 
     */
    private final @Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelism inputParallelism;
    /**
     * The input processing configuration for the input.
     * An input processor transforms records as they are received from the stream, before the application's SQL code executes.
     * 
     */
    private final @Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfiguration inputProcessingConfiguration;
    /**
     * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns in the in-application stream that is being created.
     * 
     */
    private final ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchema inputSchema;
    /**
     * The point at which the application starts processing records from the streaming source.
     * 
     */
    private final @Nullable List<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfiguration> inputStartingPositionConfigurations;
    /**
     * If the streaming source is a Kinesis Data Firehose delivery stream, identifies the delivery stream's ARN.
     * 
     */
    private final @Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisFirehoseInput kinesisFirehoseInput;
    /**
     * If the streaming source is a Kinesis data stream, identifies the stream's Amazon Resource Name (ARN).
     * 
     */
    private final @Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInput kinesisStreamsInput;
    /**
     * The name prefix to use when creating an in-application stream.
     * 
     */
    private final String namePrefix;

    @OutputCustomType.Constructor({"inAppStreamNames","inputId","inputParallelism","inputProcessingConfiguration","inputSchema","inputStartingPositionConfigurations","kinesisFirehoseInput","kinesisStreamsInput","namePrefix"})
    private ApplicationApplicationConfigurationSqlApplicationConfigurationInput(
        @Nullable List<String> inAppStreamNames,
        @Nullable String inputId,
        @Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelism inputParallelism,
        @Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfiguration inputProcessingConfiguration,
        ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchema inputSchema,
        @Nullable List<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfiguration> inputStartingPositionConfigurations,
        @Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisFirehoseInput kinesisFirehoseInput,
        @Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInput kinesisStreamsInput,
        String namePrefix) {
        this.inAppStreamNames = inAppStreamNames;
        this.inputId = inputId;
        this.inputParallelism = inputParallelism;
        this.inputProcessingConfiguration = inputProcessingConfiguration;
        this.inputSchema = Objects.requireNonNull(inputSchema);
        this.inputStartingPositionConfigurations = inputStartingPositionConfigurations;
        this.kinesisFirehoseInput = kinesisFirehoseInput;
        this.kinesisStreamsInput = kinesisStreamsInput;
        this.namePrefix = Objects.requireNonNull(namePrefix);
    }

    public List<String> getInAppStreamNames() {
        return this.inAppStreamNames == null ? List.of() : this.inAppStreamNames;
    }
    public Optional<String> getInputId() {
        return Optional.ofNullable(this.inputId);
    }
    /**
     * Describes the number of in-application streams to create.
     * 
     */
    public Optional<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelism> getInputParallelism() {
        return Optional.ofNullable(this.inputParallelism);
    }
    /**
     * The input processing configuration for the input.
     * An input processor transforms records as they are received from the stream, before the application's SQL code executes.
     * 
     */
    public Optional<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfiguration> getInputProcessingConfiguration() {
        return Optional.ofNullable(this.inputProcessingConfiguration);
    }
    /**
     * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns in the in-application stream that is being created.
     * 
     */
    public ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchema getInputSchema() {
        return this.inputSchema;
    }
    /**
     * The point at which the application starts processing records from the streaming source.
     * 
     */
    public List<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfiguration> getInputStartingPositionConfigurations() {
        return this.inputStartingPositionConfigurations == null ? List.of() : this.inputStartingPositionConfigurations;
    }
    /**
     * If the streaming source is a Kinesis Data Firehose delivery stream, identifies the delivery stream's ARN.
     * 
     */
    public Optional<ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisFirehoseInput> getKinesisFirehoseInput() {
        return Optional.ofNullable(this.kinesisFirehoseInput);
    }
    /**
     * If the streaming source is a Kinesis data stream, identifies the stream's Amazon Resource Name (ARN).
     * 
     */
    public Optional<ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInput> getKinesisStreamsInput() {
        return Optional.ofNullable(this.kinesisStreamsInput);
    }
    /**
     * The name prefix to use when creating an in-application stream.
     * 
     */
    public String getNamePrefix() {
        return this.namePrefix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationInput defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> inAppStreamNames;
        private @Nullable String inputId;
        private @Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelism inputParallelism;
        private @Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfiguration inputProcessingConfiguration;
        private ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchema inputSchema;
        private @Nullable List<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfiguration> inputStartingPositionConfigurations;
        private @Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisFirehoseInput kinesisFirehoseInput;
        private @Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInput kinesisStreamsInput;
        private String namePrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationInput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inAppStreamNames = defaults.inAppStreamNames;
    	      this.inputId = defaults.inputId;
    	      this.inputParallelism = defaults.inputParallelism;
    	      this.inputProcessingConfiguration = defaults.inputProcessingConfiguration;
    	      this.inputSchema = defaults.inputSchema;
    	      this.inputStartingPositionConfigurations = defaults.inputStartingPositionConfigurations;
    	      this.kinesisFirehoseInput = defaults.kinesisFirehoseInput;
    	      this.kinesisStreamsInput = defaults.kinesisStreamsInput;
    	      this.namePrefix = defaults.namePrefix;
        }

        public Builder setInAppStreamNames(@Nullable List<String> inAppStreamNames) {
            this.inAppStreamNames = inAppStreamNames;
            return this;
        }

        public Builder setInputId(@Nullable String inputId) {
            this.inputId = inputId;
            return this;
        }

        public Builder setInputParallelism(@Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelism inputParallelism) {
            this.inputParallelism = inputParallelism;
            return this;
        }

        public Builder setInputProcessingConfiguration(@Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfiguration inputProcessingConfiguration) {
            this.inputProcessingConfiguration = inputProcessingConfiguration;
            return this;
        }

        public Builder setInputSchema(ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchema inputSchema) {
            this.inputSchema = Objects.requireNonNull(inputSchema);
            return this;
        }

        public Builder setInputStartingPositionConfigurations(@Nullable List<ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfiguration> inputStartingPositionConfigurations) {
            this.inputStartingPositionConfigurations = inputStartingPositionConfigurations;
            return this;
        }

        public Builder setKinesisFirehoseInput(@Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisFirehoseInput kinesisFirehoseInput) {
            this.kinesisFirehoseInput = kinesisFirehoseInput;
            return this;
        }

        public Builder setKinesisStreamsInput(@Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInput kinesisStreamsInput) {
            this.kinesisStreamsInput = kinesisStreamsInput;
            return this;
        }

        public Builder setNamePrefix(String namePrefix) {
            this.namePrefix = Objects.requireNonNull(namePrefix);
            return this;
        }
        public ApplicationApplicationConfigurationSqlApplicationConfigurationInput build() {
            return new ApplicationApplicationConfigurationSqlApplicationConfigurationInput(inAppStreamNames, inputId, inputParallelism, inputProcessingConfiguration, inputSchema, inputStartingPositionConfigurations, kinesisFirehoseInput, kinesisStreamsInput, namePrefix);
        }
    }
}
