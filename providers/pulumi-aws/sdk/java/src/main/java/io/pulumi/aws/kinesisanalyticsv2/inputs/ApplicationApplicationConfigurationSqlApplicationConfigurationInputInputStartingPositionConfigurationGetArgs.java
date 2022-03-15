// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfigurationGetArgs Empty = new ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfigurationGetArgs();

    /**
     * The starting position on the stream. Valid values: `LAST_STOPPED_POINT`, `NOW`, `TRIM_HORIZON`.
     * 
     */
    @Import(name="inputStartingPosition")
      private final @Nullable Output<String> inputStartingPosition;

    public Output<String> getInputStartingPosition() {
        return this.inputStartingPosition == null ? Output.empty() : this.inputStartingPosition;
    }

    public ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfigurationGetArgs(@Nullable Output<String> inputStartingPosition) {
        this.inputStartingPosition = inputStartingPosition;
    }

    private ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfigurationGetArgs() {
        this.inputStartingPosition = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> inputStartingPosition;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inputStartingPosition = defaults.inputStartingPosition;
        }

        public Builder inputStartingPosition(@Nullable Output<String> inputStartingPosition) {
            this.inputStartingPosition = inputStartingPosition;
            return this;
        }

        public Builder inputStartingPosition(@Nullable String inputStartingPosition) {
            this.inputStartingPosition = Output.ofNullable(inputStartingPosition);
            return this;
        }
        public ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfigurationGetArgs build() {
            return new ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfigurationGetArgs(inputStartingPosition);
        }
    }
}
