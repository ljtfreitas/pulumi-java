// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.container_v1.inputs.PubSubResponse;
import java.util.Objects;


/**
 * NotificationConfig is the configuration of notifications.
 * 
 */
public final class NotificationConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final NotificationConfigResponse Empty = new NotificationConfigResponse();

    /**
     * Notification config for Pub/Sub.
     * 
     */
    @InputImport(name="pubsub", required=true)
      private final PubSubResponse pubsub;

    public PubSubResponse getPubsub() {
        return this.pubsub;
    }

    public NotificationConfigResponse(PubSubResponse pubsub) {
        this.pubsub = Objects.requireNonNull(pubsub, "expected parameter 'pubsub' to be non-null");
    }

    private NotificationConfigResponse() {
        this.pubsub = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PubSubResponse pubsub;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pubsub = defaults.pubsub;
        }

        public Builder setPubsub(PubSubResponse pubsub) {
            this.pubsub = Objects.requireNonNull(pubsub);
            return this;
        }
        public NotificationConfigResponse build() {
            return new NotificationConfigResponse(pubsub);
        }
    }
}
