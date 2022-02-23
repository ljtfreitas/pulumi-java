// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterNotificationConfigPubsub {
    /**
     * Enable the PodSecurityPolicy controller for this cluster.
     * If enabled, pods must be valid under a PodSecurityPolicy to be created.
     * 
     */
    private final Boolean enabled;
    /**
     * The pubsub topic to push upgrade notifications to. Must be in the same project as the cluster. Must be in the format: `projects/{project}/topics/{topic}`.
     * 
     */
    private final @Nullable String topic;

    @OutputCustomType.Constructor({"enabled","topic"})
    private ClusterNotificationConfigPubsub(
        Boolean enabled,
        @Nullable String topic) {
        this.enabled = Objects.requireNonNull(enabled);
        this.topic = topic;
    }

    /**
     * Enable the PodSecurityPolicy controller for this cluster.
     * If enabled, pods must be valid under a PodSecurityPolicy to be created.
     * 
     */
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * The pubsub topic to push upgrade notifications to. Must be in the same project as the cluster. Must be in the format: `projects/{project}/topics/{topic}`.
     * 
     */
    public Optional<String> getTopic() {
        return Optional.ofNullable(this.topic);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNotificationConfigPubsub defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;
        private @Nullable String topic;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterNotificationConfigPubsub defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.topic = defaults.topic;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setTopic(@Nullable String topic) {
            this.topic = topic;
            return this;
        }
        public ClusterNotificationConfigPubsub build() {
            return new ClusterNotificationConfigPubsub(enabled, topic);
        }
    }
}
