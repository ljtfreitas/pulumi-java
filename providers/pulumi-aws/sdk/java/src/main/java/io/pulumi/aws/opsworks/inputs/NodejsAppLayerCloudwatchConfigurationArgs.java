// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.opsworks.inputs;

import io.pulumi.aws.opsworks.inputs.NodejsAppLayerCloudwatchConfigurationLogStreamArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NodejsAppLayerCloudwatchConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodejsAppLayerCloudwatchConfigurationArgs Empty = new NodejsAppLayerCloudwatchConfigurationArgs();

    @InputImport(name="enabled")
    private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    @InputImport(name="logStreams")
    private final @Nullable Input<List<NodejsAppLayerCloudwatchConfigurationLogStreamArgs>> logStreams;

    public Input<List<NodejsAppLayerCloudwatchConfigurationLogStreamArgs>> getLogStreams() {
        return this.logStreams == null ? Input.empty() : this.logStreams;
    }

    public NodejsAppLayerCloudwatchConfigurationArgs(
        @Nullable Input<Boolean> enabled,
        @Nullable Input<List<NodejsAppLayerCloudwatchConfigurationLogStreamArgs>> logStreams) {
        this.enabled = enabled;
        this.logStreams = logStreams;
    }

    private NodejsAppLayerCloudwatchConfigurationArgs() {
        this.enabled = Input.empty();
        this.logStreams = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodejsAppLayerCloudwatchConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<List<NodejsAppLayerCloudwatchConfigurationLogStreamArgs>> logStreams;

        public Builder() {
    	      // Empty
        }

        public Builder(NodejsAppLayerCloudwatchConfigurationArgs defaults) {
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

        public Builder setLogStreams(@Nullable Input<List<NodejsAppLayerCloudwatchConfigurationLogStreamArgs>> logStreams) {
            this.logStreams = logStreams;
            return this;
        }

        public Builder setLogStreams(@Nullable List<NodejsAppLayerCloudwatchConfigurationLogStreamArgs> logStreams) {
            this.logStreams = Input.ofNullable(logStreams);
            return this;
        }
        public NodejsAppLayerCloudwatchConfigurationArgs build() {
            return new NodejsAppLayerCloudwatchConfigurationArgs(enabled, logStreams);
        }
    }
}
