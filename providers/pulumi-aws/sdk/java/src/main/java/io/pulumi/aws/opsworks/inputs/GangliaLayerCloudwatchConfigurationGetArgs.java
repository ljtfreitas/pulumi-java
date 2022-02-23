// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.opsworks.inputs;

import io.pulumi.aws.opsworks.inputs.GangliaLayerCloudwatchConfigurationLogStreamGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GangliaLayerCloudwatchConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final GangliaLayerCloudwatchConfigurationGetArgs Empty = new GangliaLayerCloudwatchConfigurationGetArgs();

    @InputImport(name="enabled")
    private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    @InputImport(name="logStreams")
    private final @Nullable Input<List<GangliaLayerCloudwatchConfigurationLogStreamGetArgs>> logStreams;

    public Input<List<GangliaLayerCloudwatchConfigurationLogStreamGetArgs>> getLogStreams() {
        return this.logStreams == null ? Input.empty() : this.logStreams;
    }

    public GangliaLayerCloudwatchConfigurationGetArgs(
        @Nullable Input<Boolean> enabled,
        @Nullable Input<List<GangliaLayerCloudwatchConfigurationLogStreamGetArgs>> logStreams) {
        this.enabled = enabled;
        this.logStreams = logStreams;
    }

    private GangliaLayerCloudwatchConfigurationGetArgs() {
        this.enabled = Input.empty();
        this.logStreams = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GangliaLayerCloudwatchConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<List<GangliaLayerCloudwatchConfigurationLogStreamGetArgs>> logStreams;

        public Builder() {
    	      // Empty
        }

        public Builder(GangliaLayerCloudwatchConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.logStreams = defaults.logStreams;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setLogStreams(@Nullable Input<List<GangliaLayerCloudwatchConfigurationLogStreamGetArgs>> logStreams) {
            this.logStreams = logStreams;
            return this;
        }

        public Builder setLogStreams(@Nullable List<GangliaLayerCloudwatchConfigurationLogStreamGetArgs> logStreams) {
            this.logStreams = Input.ofNullable(logStreams);
            return this;
        }
        public GangliaLayerCloudwatchConfigurationGetArgs build() {
            return new GangliaLayerCloudwatchConfigurationGetArgs(enabled, logStreams);
        }
    }
}
