// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfigurationArgs Empty = new ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfigurationArgs();

    /**
     * Describes the interval in milliseconds between checkpoint operations.
     * 
     */
    @InputImport(name="checkpointInterval")
    private final @Nullable Input<Integer> checkpointInterval;

    public Input<Integer> getCheckpointInterval() {
        return this.checkpointInterval == null ? Input.empty() : this.checkpointInterval;
    }

    /**
     * Describes whether checkpointing is enabled for a Flink-based Kinesis Data Analytics application.
     * 
     */
    @InputImport(name="checkpointingEnabled")
    private final @Nullable Input<Boolean> checkpointingEnabled;

    public Input<Boolean> getCheckpointingEnabled() {
        return this.checkpointingEnabled == null ? Input.empty() : this.checkpointingEnabled;
    }

    /**
     * Describes whether the application uses Kinesis Data Analytics' default checkpointing behavior. Valid values: `CUSTOM`, `DEFAULT`. Set this attribute to `CUSTOM` in order for any specified `checkpointing_enabled`, `checkpoint_interval`, or `min_pause_between_checkpoints` attribute values to be effective. If this attribute is set to `DEFAULT`, the application will always use the following values:
     * * `checkpointing_enabled = true`
     * * `checkpoint_interval = 60000`
     * * `min_pause_between_checkpoints = 5000`
     * 
     */
    @InputImport(name="configurationType", required=true)
    private final Input<String> configurationType;

    public Input<String> getConfigurationType() {
        return this.configurationType;
    }

    /**
     * Describes the minimum time in milliseconds after a checkpoint operation completes that a new checkpoint operation can start.
     * 
     */
    @InputImport(name="minPauseBetweenCheckpoints")
    private final @Nullable Input<Integer> minPauseBetweenCheckpoints;

    public Input<Integer> getMinPauseBetweenCheckpoints() {
        return this.minPauseBetweenCheckpoints == null ? Input.empty() : this.minPauseBetweenCheckpoints;
    }

    public ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfigurationArgs(
        @Nullable Input<Integer> checkpointInterval,
        @Nullable Input<Boolean> checkpointingEnabled,
        Input<String> configurationType,
        @Nullable Input<Integer> minPauseBetweenCheckpoints) {
        this.checkpointInterval = checkpointInterval;
        this.checkpointingEnabled = checkpointingEnabled;
        this.configurationType = Objects.requireNonNull(configurationType, "expected parameter 'configurationType' to be non-null");
        this.minPauseBetweenCheckpoints = minPauseBetweenCheckpoints;
    }

    private ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfigurationArgs() {
        this.checkpointInterval = Input.empty();
        this.checkpointingEnabled = Input.empty();
        this.configurationType = Input.empty();
        this.minPauseBetweenCheckpoints = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> checkpointInterval;
        private @Nullable Input<Boolean> checkpointingEnabled;
        private Input<String> configurationType;
        private @Nullable Input<Integer> minPauseBetweenCheckpoints;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checkpointInterval = defaults.checkpointInterval;
    	      this.checkpointingEnabled = defaults.checkpointingEnabled;
    	      this.configurationType = defaults.configurationType;
    	      this.minPauseBetweenCheckpoints = defaults.minPauseBetweenCheckpoints;
        }

        public Builder setCheckpointInterval(@Nullable Input<Integer> checkpointInterval) {
            this.checkpointInterval = checkpointInterval;
            return this;
        }

        public Builder setCheckpointInterval(@Nullable Integer checkpointInterval) {
            this.checkpointInterval = Input.ofNullable(checkpointInterval);
            return this;
        }

        public Builder setCheckpointingEnabled(@Nullable Input<Boolean> checkpointingEnabled) {
            this.checkpointingEnabled = checkpointingEnabled;
            return this;
        }

        public Builder setCheckpointingEnabled(@Nullable Boolean checkpointingEnabled) {
            this.checkpointingEnabled = Input.ofNullable(checkpointingEnabled);
            return this;
        }

        public Builder setConfigurationType(Input<String> configurationType) {
            this.configurationType = Objects.requireNonNull(configurationType);
            return this;
        }

        public Builder setConfigurationType(String configurationType) {
            this.configurationType = Input.of(Objects.requireNonNull(configurationType));
            return this;
        }

        public Builder setMinPauseBetweenCheckpoints(@Nullable Input<Integer> minPauseBetweenCheckpoints) {
            this.minPauseBetweenCheckpoints = minPauseBetweenCheckpoints;
            return this;
        }

        public Builder setMinPauseBetweenCheckpoints(@Nullable Integer minPauseBetweenCheckpoints) {
            this.minPauseBetweenCheckpoints = Input.ofNullable(minPauseBetweenCheckpoints);
            return this;
        }
        public ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfigurationArgs build() {
            return new ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfigurationArgs(checkpointInterval, checkpointingEnabled, configurationType, minPauseBetweenCheckpoints);
        }
    }
}
