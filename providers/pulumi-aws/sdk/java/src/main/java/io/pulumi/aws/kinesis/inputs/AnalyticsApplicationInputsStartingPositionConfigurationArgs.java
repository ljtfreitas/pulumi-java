// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AnalyticsApplicationInputsStartingPositionConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnalyticsApplicationInputsStartingPositionConfigurationArgs Empty = new AnalyticsApplicationInputsStartingPositionConfigurationArgs();

    /**
     * The starting position on the stream. Valid values: `LAST_STOPPED_POINT`, `NOW`, `TRIM_HORIZON`.
     * 
     */
    @Import(name="startingPosition")
      private final @Nullable Output<String> startingPosition;

    public Output<String> getStartingPosition() {
        return this.startingPosition == null ? Output.empty() : this.startingPosition;
    }

    public AnalyticsApplicationInputsStartingPositionConfigurationArgs(@Nullable Output<String> startingPosition) {
        this.startingPosition = startingPosition;
    }

    private AnalyticsApplicationInputsStartingPositionConfigurationArgs() {
        this.startingPosition = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationInputsStartingPositionConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> startingPosition;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsApplicationInputsStartingPositionConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.startingPosition = defaults.startingPosition;
        }

        public Builder startingPosition(@Nullable Output<String> startingPosition) {
            this.startingPosition = startingPosition;
            return this;
        }

        public Builder startingPosition(@Nullable String startingPosition) {
            this.startingPosition = Output.ofNullable(startingPosition);
            return this;
        }
        public AnalyticsApplicationInputsStartingPositionConfigurationArgs build() {
            return new AnalyticsApplicationInputsStartingPositionConfigurationArgs(startingPosition);
        }
    }
}
