// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterNotificationConfigPubsubGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterNotificationConfigPubsubGetArgs Empty = new ClusterNotificationConfigPubsubGetArgs();

    /**
     * Enable the PodSecurityPolicy controller for this cluster.
     * If enabled, pods must be valid under a PodSecurityPolicy to be created.
     * 
     */
    @InputImport(name="enabled", required=true)
        private final Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled;
    }

    /**
     * The pubsub topic to push upgrade notifications to. Must be in the same project as the cluster. Must be in the format: `projects/{project}/topics/{topic}`.
     * 
     */
    @InputImport(name="topic")
        private final @Nullable Input<String> topic;

    public Input<String> getTopic() {
        return this.topic == null ? Input.empty() : this.topic;
    }

    public ClusterNotificationConfigPubsubGetArgs(
        Input<Boolean> enabled,
        @Nullable Input<String> topic) {
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.topic = topic;
    }

    private ClusterNotificationConfigPubsubGetArgs() {
        this.enabled = Input.empty();
        this.topic = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNotificationConfigPubsubGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> enabled;
        private @Nullable Input<String> topic;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterNotificationConfigPubsubGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.topic = defaults.topic;
        }

        public Builder setEnabled(Input<Boolean> enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Input.of(Objects.requireNonNull(enabled));
            return this;
        }

        public Builder setTopic(@Nullable Input<String> topic) {
            this.topic = topic;
            return this;
        }

        public Builder setTopic(@Nullable String topic) {
            this.topic = Input.ofNullable(topic);
            return this;
        }
        public ClusterNotificationConfigPubsubGetArgs build() {
            return new ClusterNotificationConfigPubsubGetArgs(enabled, topic);
        }
    }
}
