// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.container_v1.inputs.PubSubArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * NotificationConfig is the configuration of notifications.
 * 
 */
public final class NotificationConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final NotificationConfigArgs Empty = new NotificationConfigArgs();

    /**
     * Notification config for Pub/Sub.
     * 
     */
    @Import(name="pubsub")
      private final @Nullable Output<PubSubArgs> pubsub;

    public Output<PubSubArgs> getPubsub() {
        return this.pubsub == null ? Output.empty() : this.pubsub;
    }

    public NotificationConfigArgs(@Nullable Output<PubSubArgs> pubsub) {
        this.pubsub = pubsub;
    }

    private NotificationConfigArgs() {
        this.pubsub = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<PubSubArgs> pubsub;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pubsub = defaults.pubsub;
        }

        public Builder pubsub(@Nullable Output<PubSubArgs> pubsub) {
            this.pubsub = pubsub;
            return this;
        }

        public Builder pubsub(@Nullable PubSubArgs pubsub) {
            this.pubsub = Output.ofNullable(pubsub);
            return this;
        }
        public NotificationConfigArgs build() {
            return new NotificationConfigArgs(pubsub);
        }
    }
}
