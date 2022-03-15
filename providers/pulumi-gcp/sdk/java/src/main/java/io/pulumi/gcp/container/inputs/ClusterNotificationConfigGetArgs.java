// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.container.inputs.ClusterNotificationConfigPubsubGetArgs;
import java.util.Objects;


public final class ClusterNotificationConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterNotificationConfigGetArgs Empty = new ClusterNotificationConfigGetArgs();

    /**
     * The pubsub config for the cluster's upgrade notifications.
     * 
     */
    @Import(name="pubsub", required=true)
      private final Output<ClusterNotificationConfigPubsubGetArgs> pubsub;

    public Output<ClusterNotificationConfigPubsubGetArgs> getPubsub() {
        return this.pubsub;
    }

    public ClusterNotificationConfigGetArgs(Output<ClusterNotificationConfigPubsubGetArgs> pubsub) {
        this.pubsub = Objects.requireNonNull(pubsub, "expected parameter 'pubsub' to be non-null");
    }

    private ClusterNotificationConfigGetArgs() {
        this.pubsub = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNotificationConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<ClusterNotificationConfigPubsubGetArgs> pubsub;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterNotificationConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pubsub = defaults.pubsub;
        }

        public Builder pubsub(Output<ClusterNotificationConfigPubsubGetArgs> pubsub) {
            this.pubsub = Objects.requireNonNull(pubsub);
            return this;
        }

        public Builder pubsub(ClusterNotificationConfigPubsubGetArgs pubsub) {
            this.pubsub = Output.of(Objects.requireNonNull(pubsub));
            return this;
        }
        public ClusterNotificationConfigGetArgs build() {
            return new ClusterNotificationConfigGetArgs(pubsub);
        }
    }
}
